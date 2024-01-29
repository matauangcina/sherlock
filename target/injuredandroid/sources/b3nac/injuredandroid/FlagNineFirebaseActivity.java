package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.C2305a;
import com.google.firebase.database.C2306b;
import com.google.firebase.database.C2308d;
import com.google.firebase.database.C2310f;
import com.google.firebase.database.InterfaceC2322l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagNineFirebaseActivity extends ActivityC0453c {

    /* renamed from: A */
    private C2308d f4430A;

    /* renamed from: B */
    private C2308d f4431B;

    /* renamed from: w */
    private int f4432w;

    /* renamed from: x */
    private final String f4433x = "ZmxhZ3Mv";

    /* renamed from: y */
    private byte[] f4434y;

    /* renamed from: z */
    private final String f4435z;

    /* renamed from: b3nac.injuredandroid.FlagNineFirebaseActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1465a implements View.OnClickListener {
        View$OnClickListenerC1465a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (FlagNineFirebaseActivity.this.m4112H() == 0) {
                C2725g.m883c(view);
                str = "Use the .json trick with database url";
            } else if (FlagNineFirebaseActivity.this.m4112H() != 1) {
                if (FlagNineFirebaseActivity.this.m4112H() == 2) {
                    C2725g.m883c(view);
                    Snackbar m2647X = Snackbar.m2647X(view, "Encoding.", 0);
                    m2647X.m2646Y("Action", null);
                    m2647X.mo2650N();
                    FlagNineFirebaseActivity.this.m4111I(0);
                    return;
                }
                return;
            } else {
                C2725g.m883c(view);
                str = "Filenames.";
            }
            Snackbar m2647X2 = Snackbar.m2647X(view, str, 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            FlagNineFirebaseActivity flagNineFirebaseActivity = FlagNineFirebaseActivity.this;
            flagNineFirebaseActivity.m4111I(flagNineFirebaseActivity.m4112H() + 1);
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagNineFirebaseActivity$b */
    /* loaded from: classes.dex */
    public static final class C1466b implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4438b;

        C1466b(String str) {
            this.f4438b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("FirebaseActivity", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            if (!C2725g.m885a(this.f4438b, (String) c2305a.m2075c())) {
                Toast.makeText(FlagNineFirebaseActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4482J = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = FlagNineFirebaseActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagNineButtonColor", true);
            FlagNineFirebaseActivity.this.m4113G();
        }
    }

    public FlagNineFirebaseActivity() {
        byte[] decode = Base64.decode("ZmxhZ3Mv", 0);
        this.f4434y = decode;
        C2725g.m882d(decode, "decodedDirectory");
        Charset charset = StandardCharsets.UTF_8;
        C2725g.m882d(charset, "StandardCharsets.UTF_8");
        this.f4435z = new String(decode, charset);
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4430A = m2059d;
        C2308d m2066h = m2059d.m2066h(this.f4435z);
        C2725g.m882d(m2066h, "database.child(refDirectory)");
        this.f4431B = m2066h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m4113G() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: H */
    public final int m4112H() {
        return this.f4432w;
    }

    /* renamed from: I */
    public final void m4111I(int i) {
        this.f4432w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_nine_firebase);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1465a());
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        C2725g.m882d(editText, "editText2");
        byte[] decode = Base64.decode(editText.getText().toString(), 0);
        C2725g.m882d(decode, "decodedPost");
        Charset charset = StandardCharsets.UTF_8;
        C2725g.m882d(charset, "StandardCharsets.UTF_8");
        this.f4431B.m2050b(new C1466b(new String(decode, charset)));
    }
}
