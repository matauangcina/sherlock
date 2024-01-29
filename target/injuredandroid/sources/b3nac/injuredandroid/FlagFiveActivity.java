package b3nac.injuredandroid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import p000a.p042m.p043a.C0310a;
/* loaded from: classes.dex */
public class FlagFiveActivity extends ActivityC0453c {

    /* renamed from: w */
    int f4425w = 0;

    /* renamed from: x */
    private FlagFiveReceiver f4426x = new FlagFiveReceiver();

    /* renamed from: F */
    public void m4119F() {
        sendBroadcast(new Intent("com.b3nac.injuredandroid.intent.action.CUSTOM_INTENT"));
    }

    /* renamed from: G */
    public /* synthetic */ void m4118G(View view) {
        int i = this.f4425w;
        if (i == 0) {
            Snackbar m2647X = Snackbar.m2647X(view, "Where is bob.", 0);
            m2647X.m2646Y("Action", null);
            m2647X.mo2650N();
            this.f4425w++;
        } else if (i == 1) {
            Snackbar m2647X2 = Snackbar.m2647X(view, "Classes and imports.", 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            this.f4425w = 0;
        }
    }

    /* renamed from: H */
    public /* synthetic */ void m4117H(View view) {
        m4119F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_five);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View.OnClickListener() { // from class: b3nac.injuredandroid.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlagFiveActivity.this.m4118G(view);
            }
        });
        new ComponentName(this, FlagFiveReceiver.class);
        getPackageManager();
        C0310a.m8404b(this).m8403c(this.f4426x, new IntentFilter("com.b3nac.injuredandroid.intent.action.CUSTOM_INTENT"));
        ((Button) findViewById(R.id.button9)).setOnClickListener(new View.OnClickListener() { // from class: b3nac.injuredandroid.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlagFiveActivity.this.m4117H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onDestroy() {
        C0310a.m8404b(this).m8401e(this.f4426x);
        super.onDestroy();
    }
}
