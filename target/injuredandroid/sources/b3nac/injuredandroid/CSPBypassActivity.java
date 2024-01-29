package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0453c;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.C2305a;
import com.google.firebase.database.C2306b;
import com.google.firebase.database.C2308d;
import com.google.firebase.database.C2310f;
import com.google.firebase.database.InterfaceC2322l;
import java.util.HashMap;
import p054b.p055a.p056a.C1100o;
import p054b.p055a.p056a.C1107t;
import p054b.p055a.p056a.p057v.C1128l;
import p054b.p055a.p056a.p057v.C1129m;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class CSPBypassActivity extends ActivityC0453c {

    /* renamed from: A */
    private HashMap f4392A;

    /* renamed from: w */
    private int f4393w;

    /* renamed from: x */
    private final String f4394x = "/csp";

    /* renamed from: y */
    private C2308d f4395y;

    /* renamed from: z */
    private C2308d f4396z;

    /* renamed from: b3nac.injuredandroid.CSPBypassActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1452a implements View.OnClickListener {
        View$OnClickListenerC1452a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            int m4143J = CSPBypassActivity.this.m4143J();
            if (m4143J == 0) {
                C2725g.m883c(view);
                str = "Check protocols.";
            } else if (m4143J != 1) {
                if (m4143J != 2) {
                    return;
                }
                C2725g.m883c(view);
                Snackbar m2647X = Snackbar.m2647X(view, "Monitor traffic.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                CSPBypassActivity.this.m4139N(0);
                return;
            } else {
                C2725g.m883c(view);
                str = "Deep links.";
            }
            Snackbar m2647X2 = Snackbar.m2647X(view, str, 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            CSPBypassActivity cSPBypassActivity = CSPBypassActivity.this;
            cSPBypassActivity.m4139N(cSPBypassActivity.m4143J() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b3nac.injuredandroid.CSPBypassActivity$b */
    /* loaded from: classes.dex */
    public static final class C1453b<T> implements C1100o.InterfaceC1102b<String> {
        C1453b() {
        }

        @Override // p054b.p055a.p056a.C1100o.InterfaceC1102b
        /* renamed from: b */
        public final void mo4138a(String str) {
            TextView textView = (TextView) CSPBypassActivity.this.m4147F(C1492i.textView7);
            C2725g.m882d(textView, "textView7");
            StringBuilder sb = new StringBuilder();
            sb.append("Response is: ");
            C2725g.m882d(str, "response");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str.substring(0, 500);
            C2725g.m882d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            textView.setText(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b3nac.injuredandroid.CSPBypassActivity$c */
    /* loaded from: classes.dex */
    public static final class C1454c implements C1100o.InterfaceC1101a {
        C1454c() {
        }

        @Override // p054b.p055a.p056a.C1100o.InterfaceC1101a
        /* renamed from: a */
        public final void mo4136a(C1107t c1107t) {
            TextView textView = (TextView) CSPBypassActivity.this.m4147F(C1492i.textView7);
            C2725g.m882d(textView, "textView7");
            textView.setText("Try another url! :D");
        }
    }

    /* renamed from: b3nac.injuredandroid.CSPBypassActivity$d */
    /* loaded from: classes.dex */
    public static final class C1455d implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4401b;

        C1455d(String str) {
            this.f4401b = str;
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
            if (!C2725g.m885a(this.f4401b, (String) c2305a.m2075c())) {
                Toast.makeText(CSPBypassActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4486N = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = CSPBypassActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagSixteenButtonColor", true);
            CSPBypassActivity.this.m4144I();
        }
    }

    public CSPBypassActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4395y = m2059d;
        C2308d m2066h = m2059d.m2066h(this.f4394x);
        C2725g.m882d(m2066h, "database.child(directory)");
        this.f4396z = m2066h;
    }

    /* renamed from: H */
    private final void m4145H() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        C2725g.m882d(firebaseAuth, "FirebaseAuth.getInstance()");
        firebaseAuth.m2422d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m4144I() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: K */
    private final void m4142K(String str) {
        String valueOf = String.valueOf(getReferrer());
        if (C2725g.m885a(valueOf, "android-app://com.android.chrome")) {
            Log.e("BAD ORIGIN!", valueOf);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    /* renamed from: L */
    private final void m4141L() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        Intent intent = getIntent();
        C2725g.m882d(intent, "intent");
        Uri data = intent.getData();
        sb.append(data != null ? data.getHost() : null);
        Intent intent2 = getIntent();
        C2725g.m882d(intent2, "intent");
        Uri data2 = intent2.getData();
        sb.append(data2 != null ? data2.getPath() : null);
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(Uri.parse(sb2));
        m4140M();
        startActivity(intent3);
    }

    /* renamed from: M */
    private final void m4140M() {
        EditText editText = (EditText) findViewById(R.id.editText10);
        Button button = (Button) findViewById(R.id.button42);
        C2725g.m882d(editText, "editText");
        editText.setVisibility(0);
        C2725g.m882d(button, "button");
        button.setVisibility(0);
        C1129m.m4852a(this).m4944a(new C1128l(0, C1495k.m4061a(C1495k.m4060b("kOC6ZrdMXEnfIKWihcBNLTWIhDiINUfSQyYrFsTpEBGZy1KmfPMTwtba8CXa/WVAVoJ1ACvJMd8f/MF97/7UaeNCQvC9OD4lZ/vQN6LmpBU=")), new C1453b(), new C1454c()));
    }

    /* renamed from: F */
    public View m4147F(int i) {
        if (this.f4392A == null) {
            this.f4392A = new HashMap();
        }
        View view = (View) this.f4392A.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f4392A.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* renamed from: J */
    public final int m4143J() {
        return this.f4393w;
    }

    /* renamed from: N */
    public final void m4139N(int i) {
        this.f4393w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r5 = 2131427358(0x7f0b001e, float:1.847633E38)
            r4.setContentView(r5)
            r5 = 2131230885(0x7f0800a5, float:1.8077835E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 2131230835(0x7f080073, float:1.8077734E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r1 = "editText"
            p135d.p142s.p144d.C2725g.m882d(r5, r1)
            r1 = 4
            r5.setVisibility(r1)
            java.lang.String r5 = "button"
            p135d.p142s.p144d.C2725g.m882d(r0, r5)
            r0.setVisibility(r1)
            b3nac.injuredandroid.j$a r5 = b3nac.injuredandroid.ApplicationC1493j.f4523j
            r5.m4062a(r4)
            r4.m4145H()
            r5 = 2131231086(0x7f08016e, float:1.8078243E38)
            android.view.View r5 = r4.findViewById(r5)
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r4.m8078C(r5)
            r5 = 2131230903(0x7f0800b7, float:1.8077872E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r5
            b3nac.injuredandroid.CSPBypassActivity$a r0 = new b3nac.injuredandroid.CSPBypassActivity$a
            r0.<init>()
            r5.setOnClickListener(r0)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "intentToUri"
            p135d.p142s.p144d.C2725g.m882d(r5, r0)
            android.net.Uri r5 = r5.getData()
            r0 = 0
            if (r5 == 0) goto L66
            java.lang.String r1 = r5.getScheme()
            goto L67
        L66:
            r1 = r0
        L67:
            java.lang.String r2 = "http"
            boolean r1 = p135d.p142s.p144d.C2725g.m885a(r2, r1)
            java.lang.String r3 = "https"
            if (r1 != 0) goto L82
            if (r5 == 0) goto L78
            java.lang.String r1 = r5.getScheme()
            goto L79
        L78:
            r1 = r0
        L79:
            boolean r1 = p135d.p142s.p144d.C2725g.m885a(r3, r1)
            if (r1 == 0) goto L80
            goto L82
        L80:
            r1 = 0
            goto L83
        L82:
            r1 = 1
        L83:
            if (r1 == 0) goto Lba
            if (r5 == 0) goto L8c
            java.lang.String r1 = r5.getScheme()
            goto L8d
        L8c:
            r1 = r0
        L8d:
            boolean r1 = p135d.p142s.p144d.C2725g.m885a(r1, r2)
            if (r1 == 0) goto L96
            r4.m4141L()
        L96:
            if (r5 == 0) goto L9d
            java.lang.String r5 = r5.getScheme()
            goto L9e
        L9d:
            r5 = r0
        L9e:
            boolean r5 = p135d.p142s.p144d.C2725g.m885a(r5, r3)
            if (r5 == 0) goto Lba
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "intent"
            p135d.p142s.p144d.C2725g.m882d(r5, r1)
            android.net.Uri r5 = r5.getData()
            if (r5 == 0) goto Lb7
            java.lang.String r0 = r5.toString()
        Lb7:
            r4.m4142K(r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3nac.injuredandroid.CSPBypassActivity.onCreate(android.os.Bundle):void");
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText10);
        C2725g.m882d(editText, "editText");
        this.f4396z.m2050b(new C1455d(editText.getText().toString()));
    }
}
