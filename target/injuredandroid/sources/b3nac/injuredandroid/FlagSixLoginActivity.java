package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagSixLoginActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4464w;

    /* renamed from: b3nac.injuredandroid.FlagSixLoginActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1473a implements View.OnClickListener {
        View$OnClickListenerC1473a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagSixLoginActivity.this.m4099F() == 0) {
                C2725g.m883c(view);
                Snackbar m2647X = Snackbar.m2647X(view, "Keys.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagSixLoginActivity flagSixLoginActivity = FlagSixLoginActivity.this;
                flagSixLoginActivity.m4098G(flagSixLoginActivity.m4099F() + 1);
            } else if (FlagSixLoginActivity.this.m4099F() == 1) {
                C2725g.m883c(view);
                Snackbar m2647X2 = Snackbar.m2647X(view, "Classes.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagSixLoginActivity.this.m4098G(0);
            }
        }
    }

    /* renamed from: F */
    public final int m4099F() {
        return this.f4464w;
    }

    /* renamed from: G */
    public final void m4098G(int i) {
        this.f4464w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_six_login);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1473a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText3);
        C2725g.m882d(editText, "editText3");
        if (C2725g.m885a(editText.getText().toString(), C1495k.m4061a("k3FElEG9lnoWbOateGhj5pX6QsXRNJKh///8Jxi8KXW7iDpk2xRxhQ=="))) {
            Intent intent = new Intent(this, FlagOneSuccess.class);
            FlagsOverview.f4479G = true;
            new ApplicationC1493j().m4065b(this, "flagSixButtonColor", true);
            startActivity(intent);
        }
    }
}
