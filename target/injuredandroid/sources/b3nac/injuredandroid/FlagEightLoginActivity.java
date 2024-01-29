package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.C2305a;
import com.google.firebase.database.C2306b;
import com.google.firebase.database.C2308d;
import com.google.firebase.database.C2310f;
import com.google.firebase.database.InterfaceC2322l;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.InterfaceC1284c;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagEightLoginActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4412w;

    /* renamed from: x */
    private C2308d f4413x;

    /* renamed from: y */
    private C2308d f4414y;

    /* renamed from: b3nac.injuredandroid.FlagEightLoginActivity$a */
    /* loaded from: classes.dex */
    static final class C1459a<TResult> implements InterfaceC1284c<Object> {
        C1459a() {
        }

        @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1284c
        /* renamed from: a */
        public final void mo3802a(AbstractC1288g<Object> abstractC1288g) {
            C2725g.m881e(abstractC1288g, "task");
            if (abstractC1288g.mo4578l()) {
                Log.d("FlagEightLoginActivity", "signInAnonymously:success");
                return;
            }
            Log.w("FlagEightLoginActivity", "signInAnonymously:failure", abstractC1288g.mo4581i());
            Toast.makeText(FlagEightLoginActivity.this, "Authentication failed.", 0).show();
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagEightLoginActivity$b */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1460b implements View.OnClickListener {
        View$OnClickListenerC1460b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagEightLoginActivity.this.m4126H() == 0) {
                C2725g.m883c(view);
                Snackbar m2647X = Snackbar.m2647X(view, "AWS CLI.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagEightLoginActivity flagEightLoginActivity = FlagEightLoginActivity.this;
                flagEightLoginActivity.m4125I(flagEightLoginActivity.m4126H() + 1);
            } else if (FlagEightLoginActivity.this.m4126H() == 1) {
                C2725g.m883c(view);
                Snackbar m2647X2 = Snackbar.m2647X(view, "AWS profiles and credentials.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagEightLoginActivity.this.m4125I(0);
            }
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagEightLoginActivity$c */
    /* loaded from: classes.dex */
    public static final class C1461c implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4418b;

        C1461c(String str) {
            this.f4418b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("FlagEightLoginActivity", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            if (!C2725g.m885a(this.f4418b, (String) c2305a.m2075c())) {
                Toast.makeText(FlagEightLoginActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4481I = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = FlagEightLoginActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagEightButtonColor", true);
            FlagEightLoginActivity.this.m4127G();
        }
    }

    public FlagEightLoginActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4413x = m2059d;
        C2308d m2066h = m2059d.m2066h("/aws");
        C2725g.m882d(m2066h, "database.child(\"/aws\")");
        this.f4414y = m2066h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m4127G() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: H */
    public final int m4126H() {
        return this.f4412w;
    }

    /* renamed from: I */
    public final void m4125I(int i) {
        this.f4412w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_eight_login);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        C2725g.m882d(firebaseAuth, "FirebaseAuth.getInstance()");
        firebaseAuth.m2422d().mo4588b(this, new C1459a());
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1460b());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText9);
        C2725g.m882d(editText, "editText2");
        this.f4414y.m2050b(new C1461c(editText.getText().toString()));
    }
}
