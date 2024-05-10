from modules.android.app.app import App


class Template(App):

    def __init__(self):
        super().__init__()


    def build_manifest_component(
            self, 
            name,
            type="activity",
            is_exported=False,
            permission=None,
            intercept=False,
            priority=999,
            action=None,
            category=["android.intent.category.DEFAULT"]
        ):
        component = f"<{type} android:name=\".{name}\" "
        if is_exported:
            component += f"android:exported=\"true\" "
        else:
            component += f"android:exported=\"false\" "
        if permission is not None:
            component += f"android:permission=\"{permission}\" "
        if not intercept:
            component += "/>\n"
        else:
            component += ">\n"
            component += f"<intent-filter android:priority=\"{priority}\">"
            component += f"<action android:name=\"{action}\"/>"
            if len(category) != 0:
                for c in category:
                    component += f"<category android:name=\"{c}\"/>\n"
            component += "</intent-filter>"
            component += f"</{type}>\n"
        component += "<!-- (( placeholder )) -->"
        return component


    def build_intent(
            self,
            intent_var="i",
            set_action=None, 
            set_data=None,
            set_selector=None,
            set_clipdata=None,
            put_extra=[], 
            set_classname=[], 
            set_flags=[],
            start_activity=True,
            start_for_result=False,
            start_for_result_launcher="startForResult",
            set_result=False,
            result_code=None
        ):
        intent = f"Intent {intent_var} = new Intent();\n"
        if set_action is not None:
            intent += f'{intent_var}.setAction("{set_action}");\n'
        if set_data is not None:
            intent += f"{intent_var}.setData(Uri.parse({set_data}));\n"
        if set_selector is not None:
            intent += f'{intent_var}.setSelector(new Intent().setClassName("{set_selector[0]}", "{set_selector[1]}"));\n'
        if set_clipdata is not None:
            intent += f'{intent_var}.setClipData(ClipData.newRawUri(null, Uri.parse("{set_clipdata}")));\n'
        if len(put_extra) != 0:
            for extra in put_extra:
                intent += f'{intent_var}.putExtra("{extra[0]}", {extra[1]});\n'
        if set_selector is None and len(set_classname) != 0:
            intent += f'{intent_var}.setClassName("{set_classname[0]}", "{set_classname[1]}");\n'
        if len(set_flags) != 0:
            intent += f"{intent_var}.setFlags({''.join([flag + ('|' if i < len(set_flags) - 1 else '') for i,flag in enumerate(set_flags)])});\n"
        if start_activity:
            intent += f"startActivity({intent_var});"
        elif start_for_result:
            intent += f"{start_for_result_launcher}.launch({intent_var});"
        elif set_result:
            intent += f"setResult({result_code}, {intent_var});"
        return intent


    def build_activity(
            self,
            name,
            libs=[],
            bind_button=False,
            on_create=[],
            on_destroy=[],
            finish=False,
            listener=[]
        ):
        activity = f"package {self._package};\n\n"
        if len(libs) != 0:
            for lib in libs:
                activity += f"import {lib};\n"
            activity += "\n"
        activity += f"public class {name} extends AppCompatActivity {{\n"
        if bind_button:
            activity += f"public static Intent newIntent(Context packageContext) {{\n"
            activity += f"return new Intent(packageContext, {name}.class);\n"
            activity += "}\n\n"
        if len(on_create) != 0:
            activity += "@Override\nprotected void onCreate(Bundle savedInstanceState) {\nsuper.onCreate(savedInstanceState);\n"
            for content in on_create:
                activity += f"{content}\n"
            if finish:
                activity += "finish();\n"
            activity += "}\n"
        if len(on_destroy) != 0:
            activity += "@Override\nprotected void onDestroy() {\nsuper.onDestroy();\n"
            for content in on_destroy:
                activity += f"{content}\n"
            activity += "}\n"
        if len(listener) != 0:
            for content in listener:
                activity += f"{content}\n"
        activity += "}"
        return activity
    

    def register_receiver(self,
            intent_filter, 
            receiver_var="receiver",
            priority=999
        ):
        receiver = f"IntentFilter filter = new IntentFilter(\"{intent_filter}\");\n"
        receiver += f"filter.setPriority({priority});\n"
        receiver += f"registerReceiver({receiver_var}, filter, RECEIVER_EXPORTED);"
        return receiver


    def build_notif_listener_service(
            self,
            name,
            libs=[],
            on_notif_posted=[],
        ):
        service = f"package {self._package};\n\n"
        if len(libs) != 0:
            for lib in libs:
                service += f"import {lib};\n"
            service += "\n"
        service += f"public class {name} extends NotificationListenerService {{\n"
        service += "@Override\npublic void onNotificationPosted(StatusBarNotification sbn) {\n"
        if len(on_notif_posted) != 0:
            for content in on_notif_posted:
                service += f"{content}\n"
        service += "}\n}"
        return service
    

    def build_dynamic_receiver(
            self,
            receiver_var="receiver",
            on_receive=[]
        ):
        receiver = f"private final BroadcastReceiver {receiver_var} = new BroadcastReceiver() {{\n"
        receiver += "@Override\npublic void onReceive(Context context, Intent intent) {\n"
        if len(on_receive) != 0:
            for content in on_receive:
                receiver += f"{content}\n"
        receiver += "}\n};"
        return receiver


    def build_start_for_result_launcher(
            self,
            result_code,
            launcher="startForResult",
            process_result=[]
        ):
        launcher = f"ActivityResultLauncher<Intent> {launcher} = registerForActivityResult(\n"
        launcher += "new ActivityResultContracts.StartActivityForResult(),\nresult -> {\n"
        launcher += f"if (result.getResultCode() == {result_code}) {{\n"
        launcher += f"Uri uri = result.getData().getData();\n"
        if len(process_result) != 0:
            for content in process_result:
                launcher += f"{content}\n"
        launcher += "}\n}\n);"
        return launcher
    

    def build_request_permission_launcher(
            self,
            launcher="requestPermission",
            process_result=[]
        ):
        launcher = f"ActivityResultLauncher<String> {launcher} = registerForActivityResult(\n"
        launcher += "new ActivityResultContracts.RequestPermission(),\nisGranted -> {\nif (isGranted) {\n"
        if len(process_result) != 0:
            for content in process_result:
                launcher += f"{content}\n"
        launcher += "}\n}\n);"
        return launcher
    

    def request_permission(
            self,
            permission,
            granted_content=[],
            ungranted_content=[]
        ):
        request = f"if (ActivityCompat.checkSelfPermission(this, \"{permission}\") == PackageManager.PERMISSION_GRANTED) {{\n"
        if len(granted_content) != 0:
            for content in granted_content:
                request += f"{content}\n"
        request += "}\n else {\n"
        if len(ungranted_content) != 0:
            for content in ungranted_content:
                request += f"{content}\n"
        request += "}"
        return request


    def bind_button(self, id, name):
        return f"""binding.{self.bind_button_id(id, name)}.setOnClickListener(v1 -> {{
            Intent i = {self.activity_name(id, name)}.newIntent(this);
            startActivity(i);
        }});
        // (( placeholder ))"""
    

    def permission_manifest(self, permission):
        return f"""<uses-permission android:name=\"{permission}\"/>
        <!-- (( permission )) -->"""
    

    def button_layout(self, id, name):
        return f"""<Button
            android:id="@+id/{self.button_id(id, name)}"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="{id} - {name}"/>
        <!-- (( placeholder )) -->"""


    def resolve_content(self, provider_type):
        return "Cursor c = getContentResolver().query(uri, null, null, null, null);\ntry {\nif (c.getCount() == 0) {\nreturn;\n}\nc.moveToFirst();\nStringBuilder sb = new StringBuilder();\nwhile (!c.isAfterLast()) {\nfor (int i = 0; i < c.getColumnCount(); i++) {\nString providerData = c.getColumnName(i) + \"=\" + c.getString(i) + \";\";\nsb.append(providerData);\n}\nc.moveToNext();\n}\nLog.i(\"BINGO!\", sb.toString());\n} finally {\nc.close();\n}" if provider_type == 1 else "try {\nInputStream inputStream = getContentResolver().openInputStream(uri);\nStringBuilder outputBuilder = new StringBuilder();\nBufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));\nString line;\ntry {\nwhile ((line = reader.readLine()) != null) {\noutputBuilder.append(line);\n}\nbyte[] bytes = outputBuilder.toString().getBytes(StandardCharsets.UTF_8);\nLog.d(\"BINGO!\", Base64.encodeToString(bytes, Base64.DEFAULT));\n} catch (IOException e) {\ne.printStackTrace();\n} finally {\ntry {\ninputStream.close();\n} catch (IOException e) {\ne.printStackTrace();\n}\n}\n} catch (FileNotFoundException e) {\nthrow new RuntimeException(e);\n}"