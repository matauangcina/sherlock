package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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
import java.nio.charset.Charset;
import java.util.Arrays;
import p135d.p142s.p144d.C2725g;
import p135d.p148w.C2760c;
/* loaded from: classes.dex */
public final class AssemblyActivity extends ActivityC0453c {

    /* renamed from: w */
    private int f4385w;

    /* renamed from: x */
    private C2308d f4386x;

    /* renamed from: y */
    private C2308d f4387y;

    /* renamed from: z */
    private final String f4388z;

    /* renamed from: b3nac.injuredandroid.AssemblyActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1450a implements View.OnClickListener {
        View$OnClickListenerC1450a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            int m4149I = AssemblyActivity.this.m4149I();
            if (m4149I == 0) {
                C2725g.m883c(view);
                str = "Covert the byte array to a string.";
            } else if (m4149I != 1) {
                if (m4149I != 2) {
                    return;
                }
                C2725g.m883c(view);
                Snackbar m2647X = Snackbar.m2647X(view, "Reverse the XOR string.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                AssemblyActivity.this.m4148J(0);
                return;
            } else {
                C2725g.m883c(view);
                str = "Disassemble Shared Object file to find the XOR key.";
            }
            Snackbar m2647X2 = Snackbar.m2647X(view, str, 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            AssemblyActivity assemblyActivity = AssemblyActivity.this;
            assemblyActivity.m4148J(assemblyActivity.m4149I() + 1);
        }
    }

    /* renamed from: b3nac.injuredandroid.AssemblyActivity$b */
    /* loaded from: classes.dex */
    public static final class C1451b implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4391b;

        C1451b(String str) {
            this.f4391b = str;
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
            if (!C2725g.m885a(this.f4391b, (String) c2305a.m2075c())) {
                Toast.makeText(AssemblyActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4485M = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = AssemblyActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagFifteenButtonColor", true);
            AssemblyActivity.this.m4150H();
        }
    }

    static {
        System.loadLibrary("native-lib");
    }

    public AssemblyActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4386x = m2059d;
        C2308d m2066h = m2059d.m2066h("/assembly");
        C2725g.m882d(m2066h, "database.child(\"/assembly\")");
        this.f4387y = m2066h;
        this.f4388z = stringFromJNI();
    }

    /* renamed from: G */
    private final void m4151G() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        C2725g.m882d(firebaseAuth, "FirebaseAuth.getInstance()");
        firebaseAuth.m2422d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m4150H() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: I */
    public final int m4149I() {
        return this.f4385w;
    }

    /* renamed from: J */
    public final void m4148J(int i) {
        this.f4385w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_assembly);
        ApplicationC1493j.f4523j.m4062a(this);
        TextView textView = (TextView) findViewById(R.id.textView10);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        m4151G();
        Charset charset = C2760c.f6871a;
        String str = this.f4388z;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        C2725g.m882d(bytes, "(this as java.lang.String).getBytes(charset)");
        C2725g.m882d(textView, "tv");
        String arrays = Arrays.toString(bytes);
        C2725g.m882d(arrays, "java.util.Arrays.toString(this)");
        textView.setText(arrays);
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1450a());
    }

    public final native String stringFromJNI();

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.enterFlag);
        C2725g.m882d(editText, "editText2");
        this.f4387y.m2050b(new C1451b(editText.getText().toString()));
    }
}
