package b3nac.injuredandroid;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
/* loaded from: classes.dex */
public class FlagTwoActivity extends ActivityC0453c {

    /* renamed from: w */
    int f4478w = 0;

    /* renamed from: F */
    public /* synthetic */ void m4090F(View view) {
        int i = this.f4478w;
        if (i == 0) {
            Snackbar m2647X = Snackbar.m2647X(view, "Key words Activity and exported.", 0);
            m2647X.m2646Y("Action", null);
            m2647X.mo2650N();
            this.f4478w++;
        } else if (i == 1) {
            Snackbar m2647X2 = Snackbar.m2647X(view, "Exported Activities can be accessed with adb or Drozer.", 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            this.f4478w = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_two);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View.OnClickListener() { // from class: b3nac.injuredandroid.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlagTwoActivity.this.m4090F(view);
            }
        });
    }
}
