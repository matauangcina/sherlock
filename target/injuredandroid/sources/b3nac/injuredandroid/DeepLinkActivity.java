package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0453c;
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
public final class DeepLinkActivity extends ActivityC0453c {

    /* renamed from: A */
    private C2308d f4402A;

    /* renamed from: B */
    private C2308d f4403B;

    /* renamed from: w */
    private int f4404w;

    /* renamed from: y */
    private FirebaseAuth f4406y;

    /* renamed from: x */
    private final String f4405x = "DeepLinkActivity";

    /* renamed from: z */
    private final String f4407z = "/binary";

    /* renamed from: b3nac.injuredandroid.DeepLinkActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1456a implements View.OnClickListener {
        View$OnClickListenerC1456a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (DeepLinkActivity.this.m4133H() == 0) {
                Snackbar m2647X = Snackbar.m2647X(view, "This is one part of the puzzle.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                DeepLinkActivity deepLinkActivity = DeepLinkActivity.this;
                deepLinkActivity.m4132I(deepLinkActivity.m4133H() + 1);
            } else if (DeepLinkActivity.this.m4133H() == 1) {
                Snackbar m2647X2 = Snackbar.m2647X(view, "Find the compiled treasure.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                DeepLinkActivity.this.m4132I(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b3nac.injuredandroid.DeepLinkActivity$b */
    /* loaded from: classes.dex */
    public static final class C1457b<TResult> implements InterfaceC1284c<Object> {
        C1457b() {
        }

        @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1284c
        /* renamed from: a */
        public final void mo3802a(AbstractC1288g<Object> abstractC1288g) {
            DeepLinkActivity deepLinkActivity;
            String str;
            C2725g.m881e(abstractC1288g, "task");
            if (abstractC1288g.mo4578l()) {
                deepLinkActivity = DeepLinkActivity.this;
                str = "Authentication succeeded.";
            } else {
                deepLinkActivity = DeepLinkActivity.this;
                str = "Authentication failed.";
            }
            Toast.makeText(deepLinkActivity, str, 0).show();
        }
    }

    /* renamed from: b3nac.injuredandroid.DeepLinkActivity$c */
    /* loaded from: classes.dex */
    public static final class C1458c implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4411b;

        C1458c(String str) {
            this.f4411b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e(DeepLinkActivity.this.f4405x, "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            if (!C2725g.m885a(this.f4411b, (String) c2305a.m2075c())) {
                Toast.makeText(DeepLinkActivity.this, "Try again! :D", 0).show();
                return;
            }
            new FlagsOverview().m4088G(true);
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = DeepLinkActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagElevenButtonColor", true);
            DeepLinkActivity.this.m4134G();
        }
    }

    public DeepLinkActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4402A = m2059d;
        C2308d m2066h = m2059d.m2066h(this.f4407z);
        C2725g.m882d(m2066h, "database.child(refDirectory)");
        this.f4403B = m2066h;
    }

    /* renamed from: G */
    public final void m4134G() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: H */
    public final int m4133H() {
        return this.f4404w;
    }

    /* renamed from: I */
    public final void m4132I(int i) {
        this.f4404w = i;
    }

    /* renamed from: J */
    public final void m4131J() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        this.f4406y = firebaseAuth;
        C2725g.m883c(firebaseAuth);
        firebaseAuth.m2422d().mo4588b(this, new C1457b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_deep_link);
        ApplicationC1493j.f4523j.m4062a(this);
        Intent intent = getIntent();
        C2725g.m882d(intent, "intentToUri");
        Uri data = intent.getData();
        if (C2725g.m885a("flag11", data != null ? data.getScheme() : null)) {
            startActivity(new Intent("android.intent.action.VIEW"));
        }
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1456a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText5);
        C2725g.m882d(editText, "editText5");
        String obj = editText.getText().toString();
        m4131J();
        this.f4403B.m2050b(new C1458c(obj));
    }
}
