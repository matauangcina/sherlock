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
public final class FlagThreeActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4476w;

    /* renamed from: b3nac.injuredandroid.FlagThreeActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1476a implements View.OnClickListener {
        View$OnClickListenerC1476a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagThreeActivity.this.m4093F() == 0) {
                Snackbar m2647X = Snackbar.m2647X(view, "R stands for resources.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagThreeActivity flagThreeActivity = FlagThreeActivity.this;
                flagThreeActivity.m4092G(flagThreeActivity.m4093F() + 1);
            } else if (FlagThreeActivity.this.m4093F() == 1) {
                Snackbar m2647X2 = Snackbar.m2647X(view, "Check .xml files.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagThreeActivity.this.m4092G(0);
            }
        }
    }

    /* renamed from: F */
    public final int m4093F() {
        return this.f4476w;
    }

    /* renamed from: G */
    public final void m4092G(int i) {
        this.f4476w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_three);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1476a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        C2725g.m882d(editText, "editText2");
        if (C2725g.m885a(editText.getText().toString(), getString(R.string.cmVzb3VyY2VzX3lv))) {
            Intent intent = new Intent(this, FlagOneSuccess.class);
            new FlagsOverview().m4083L(true);
            new ApplicationC1493j().m4065b(this, "flagThreeButtonColor", true);
            startActivity(intent);
        }
    }
}
