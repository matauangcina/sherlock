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
public final class FlagEighteenActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4419w;

    /* renamed from: x */
    private C2308d f4420x;

    /* renamed from: y */
    private C2308d f4421y;

    /* renamed from: b3nac.injuredandroid.FlagEighteenActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1462a implements View.OnClickListener {
        View$OnClickListenerC1462a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (FlagEighteenActivity.this.m4121I() == 0) {
                C2725g.m883c(view);
                str = "Use another activity to move the file!";
            } else if (FlagEighteenActivity.this.m4121I() == 1) {
                C2725g.m883c(view);
                str = "Use another Android app to access internal directories.";
            } else if (FlagEighteenActivity.this.m4121I() != 2) {
                if (FlagEighteenActivity.this.m4121I() == 3) {
                    C2725g.m883c(view);
                    Snackbar m2647X = Snackbar.m2647X(view, "Hashes.", 0);
                    m2647X.m2646Y("Action", null);
                    m2647X.mo2650N();
                    FlagEighteenActivity.this.m4120J(0);
                    return;
                }
                return;
            } else {
                C2725g.m883c(view);
                str = "Uri permissions.";
            }
            Snackbar m2647X2 = Snackbar.m2647X(view, str, 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            FlagEighteenActivity flagEighteenActivity = FlagEighteenActivity.this;
            flagEighteenActivity.m4120J(flagEighteenActivity.m4121I() + 1);
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagEighteenActivity$b */
    /* loaded from: classes.dex */
    public static final class C1463b implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4424b;

        C1463b(String str) {
            this.f4424b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("Access denied", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            if (!C2725g.m885a(this.f4424b, (String) c2305a.m2075c())) {
                Toast.makeText(FlagEighteenActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4488P = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = FlagEighteenActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagEighteenButtonColor", true);
            FlagEighteenActivity.this.m4122H();
        }
    }

    public FlagEighteenActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4420x = m2059d;
        C2308d m2066h = m2059d.m2066h("/fileprovider");
        C2725g.m882d(m2066h, "database.child(\"/fileprovider\")");
        this.f4421y = m2066h;
    }

    /* renamed from: G */
    private final void m4123G() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        C2725g.m882d(firebaseAuth, "FirebaseAuth.getInstance()");
        firebaseAuth.m2422d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m4122H() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: I */
    public final int m4121I() {
        return this.f4419w;
    }

    /* renamed from: J */
    public final void m4120J(int i) {
        this.f4419w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_eighteen);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ApplicationC1493j.f4523j.m4062a(this);
        setResult(-1, getIntent());
        m4123G();
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1462a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.enterFlag);
        C2725g.m882d(editText, "editText");
        this.f4421y.m2050b(new C1463b(editText.getText().toString()));
    }
}
