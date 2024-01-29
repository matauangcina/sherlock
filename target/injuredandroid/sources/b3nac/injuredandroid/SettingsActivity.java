package b3nac.injuredandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.appcompat.app.AbstractC0455e;
import androidx.appcompat.app.ActivityC0453c;
/* loaded from: classes.dex */
public class SettingsActivity extends ActivityC0453c {
    public void clearFlags(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("b3nac.injuredandroid", 0);
        SharedPreferences sharedPreferences2 = getSharedPreferences("FlutterSharedPreferences", 0);
        SharedPreferences sharedPreferences3 = getSharedPreferences("b3nac.injuredandroid.encrypted", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
        edit.clear();
        edit.apply();
        edit2.clear();
        edit2.apply();
        edit3.clear();
        edit3.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        ((Switch) findViewById(R.id.switch1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b3nac.injuredandroid.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC0455e.m8069E(r1 ? 2 : 1);
            }
        });
    }
}
