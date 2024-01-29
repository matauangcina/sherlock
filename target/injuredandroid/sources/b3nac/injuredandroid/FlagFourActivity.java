package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ActivityC0453c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import p135d.p142s.p144d.C2725g;
import p135d.p148w.C2760c;
/* loaded from: classes.dex */
public final class FlagFourActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4428w;

    /* renamed from: b3nac.injuredandroid.FlagFourActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1464a implements View.OnClickListener {
        View$OnClickListenerC1464a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagFourActivity.this.m4116F() == 0) {
                Snackbar m2647X = Snackbar.m2647X(view, "Where is bob.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagFourActivity flagFourActivity = FlagFourActivity.this;
                flagFourActivity.m4115G(flagFourActivity.m4116F() + 1);
            } else if (FlagFourActivity.this.m4116F() == 1) {
                Snackbar m2647X2 = Snackbar.m2647X(view, "Classes and imports.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagFourActivity.this.m4115G(0);
            }
        }
    }

    /* renamed from: F */
    public final int m4116F() {
        return this.f4428w;
    }

    /* renamed from: G */
    public final void m4115G(int i) {
        this.f4428w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_four);
        ApplicationC1493j.f4523j.m4062a(this);
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1464a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        C2725g.m882d(editText, "editText2");
        String obj = editText.getText().toString();
        byte[] m4070a = new C1490g().m4070a();
        C2725g.m882d(m4070a, "decoder.getData()");
        if (C2725g.m885a(obj, new String(m4070a, C2760c.f6871a))) {
            Intent intent = new Intent(this, FlagOneSuccess.class);
            new FlagsOverview().m4086I(true);
            new ApplicationC1493j().m4065b(this, "flagFourButtonColor", true);
            startActivity(intent);
        }
    }
}
