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
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagSeventeenActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4457w;

    /* renamed from: x */
    private final String f4458x = "/sslpinningbypass";

    /* renamed from: y */
    private C2308d f4459y;

    /* renamed from: z */
    private C2308d f4460z;

    /* renamed from: b3nac.injuredandroid.FlagSeventeenActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1471a implements View.OnClickListener {
        View$OnClickListenerC1471a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            int m4101I = FlagSeventeenActivity.this.m4101I();
            if (m4101I == 0) {
                C2725g.m883c(view);
                str = "Find the SSL pinning form.";
            } else if (m4101I != 1) {
                if (m4101I != 2) {
                    return;
                }
                C2725g.m883c(view);
                Snackbar m2647X = Snackbar.m2647X(view, "Monitor traffic.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagSeventeenActivity.this.m4100J(0);
                return;
            } else {
                C2725g.m883c(view);
                str = "Use Frida to bypass the SSL pinning method.";
            }
            Snackbar m2647X2 = Snackbar.m2647X(view, str, 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            FlagSeventeenActivity flagSeventeenActivity = FlagSeventeenActivity.this;
            flagSeventeenActivity.m4100J(flagSeventeenActivity.m4101I() + 1);
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagSeventeenActivity$b */
    /* loaded from: classes.dex */
    public static final class C1472b implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4463b;

        C1472b(String str) {
            this.f4463b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("Database Error", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            if (!C2725g.m885a(this.f4463b, (String) c2305a.m2075c())) {
                Toast.makeText(FlagSeventeenActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4487O = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = FlagSeventeenActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagSeventeenButtonColor", true);
            FlagSeventeenActivity.this.m4102H();
        }
    }

    public FlagSeventeenActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4459y = m2059d;
        C2308d m2066h = m2059d.m2066h(this.f4458x);
        C2725g.m882d(m2066h, "database.child(directory)");
        this.f4460z = m2066h;
    }

    /* renamed from: G */
    private final void m4103G() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        C2725g.m882d(firebaseAuth, "FirebaseAuth.getInstance()");
        firebaseAuth.m2422d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m4102H() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: I */
    public final int m4101I() {
        return this.f4457w;
    }

    /* renamed from: J */
    public final void m4100J(int i) {
        this.f4457w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_seventeen);
        ApplicationC1493j.f4523j.m4062a(this);
        m4103G();
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1471a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText11);
        C2725g.m882d(editText, "editText");
        this.f4460z.m2050b(new C1472b(editText.getText().toString()));
    }
}
