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
public final class FlagOneLoginActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4439w;

    /* renamed from: b3nac.injuredandroid.FlagOneLoginActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1467a implements View.OnClickListener {
        View$OnClickListenerC1467a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagOneLoginActivity.this.m4110F() == 0) {
                Snackbar m2647X = Snackbar.m2647X(view, "The flag is right under your nose.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagOneLoginActivity flagOneLoginActivity = FlagOneLoginActivity.this;
                flagOneLoginActivity.m4109G(flagOneLoginActivity.m4110F() + 1);
            } else if (FlagOneLoginActivity.this.m4110F() == 1) {
                Snackbar m2647X2 = Snackbar.m2647X(view, "The flag is also under the GUI.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagOneLoginActivity.this.m4109G(0);
            }
        }
    }

    /* renamed from: F */
    public final int m4110F() {
        return this.f4439w;
    }

    /* renamed from: G */
    public final void m4109G(int i) {
        this.f4439w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_one_login);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1467a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        C2725g.m882d(editText, "editText2");
        if (C2725g.m885a(editText.getText().toString(), "F1ag_0n3")) {
            Intent intent = new Intent(this, FlagOneSuccess.class);
            new FlagsOverview().m4085J(true);
            new ApplicationC1493j().m4065b(this, "flagOneButtonColor", true);
            startActivity(intent);
        }
    }
}
