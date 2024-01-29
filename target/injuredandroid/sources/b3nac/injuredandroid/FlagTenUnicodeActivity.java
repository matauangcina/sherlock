package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
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
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagTenUnicodeActivity extends ActivityC0453c {

    /* renamed from: A */
    private C2308d f4466A;

    /* renamed from: B */
    private C2308d f4467B;

    /* renamed from: C */
    private FirebaseAuth f4468C;

    /* renamed from: w */
    private int f4469w;

    /* renamed from: x */
    private final String f4470x = "dW5pY29kZS8=";

    /* renamed from: y */
    private byte[] f4471y;

    /* renamed from: z */
    private final String f4472z;

    /* renamed from: b3nac.injuredandroid.FlagTenUnicodeActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1474a implements View.OnClickListener {
        View$OnClickListenerC1474a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (FlagTenUnicodeActivity.this.m4095H() == 0) {
                Snackbar m2647X = Snackbar.m2647X(view, "Find the email address.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagTenUnicodeActivity flagTenUnicodeActivity = FlagTenUnicodeActivity.this;
                flagTenUnicodeActivity.m4094I(flagTenUnicodeActivity.m4095H() + 1);
            } else if (FlagTenUnicodeActivity.this.m4095H() == 1) {
                Snackbar m2647X2 = Snackbar.m2647X(view, "Cause a unicode collision.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagTenUnicodeActivity.this.m4094I(0);
            }
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagTenUnicodeActivity$b */
    /* loaded from: classes.dex */
    public static final class C1475b implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4475b;

        C1475b(String str) {
            this.f4475b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Toast.makeText(FlagTenUnicodeActivity.this, "User not logged in!", 0).show();
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            FlagTenUnicodeActivity flagTenUnicodeActivity;
            String str;
            C2725g.m881e(c2305a, "dataSnapshot");
            String str2 = (String) c2305a.m2075c();
            if (C2725g.m885a(this.f4475b, str2)) {
                flagTenUnicodeActivity = FlagTenUnicodeActivity.this;
                str = "No cheating. :]";
            } else {
                String str3 = this.f4475b;
                Locale locale = Locale.ROOT;
                C2725g.m882d(locale, "Locale.ROOT");
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String upperCase = str3.toUpperCase(locale);
                C2725g.m882d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                C2725g.m883c(str2);
                Locale locale2 = Locale.ROOT;
                C2725g.m882d(locale2, "Locale.ROOT");
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String upperCase2 = str2.toUpperCase(locale2);
                C2725g.m882d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
                if (C2725g.m885a(upperCase, upperCase2)) {
                    FlagTenUnicodeActivity.this.m4096G();
                    return;
                } else {
                    flagTenUnicodeActivity = FlagTenUnicodeActivity.this;
                    str = "Try again! :D";
                }
            }
            Toast.makeText(flagTenUnicodeActivity, str, 0).show();
        }
    }

    public FlagTenUnicodeActivity() {
        byte[] decode = Base64.decode("dW5pY29kZS8=", 0);
        this.f4471y = decode;
        C2725g.m882d(decode, "decodedDirectory");
        Charset charset = StandardCharsets.UTF_8;
        C2725g.m882d(charset, "StandardCharsets.UTF_8");
        this.f4472z = new String(decode, charset);
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4466A = m2059d;
        C2308d m2066h = m2059d.m2066h(this.f4472z);
        C2725g.m882d(m2066h, "database.child(refDirectory)");
        this.f4467B = m2066h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m4096G() {
        Intent intent = new Intent(this, FlagOneSuccess.class);
        new FlagsOverview().m4084K(true);
        new ApplicationC1493j().m4065b(this, "flagTenButtonColor", true);
        startActivity(intent);
    }

    /* renamed from: H */
    public final int m4095H() {
        return this.f4469w;
    }

    /* renamed from: I */
    public final void m4094I(int i) {
        this.f4469w = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_ten_unicode);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        this.f4468C = FirebaseAuth.getInstance();
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1474a());
    }

    public final void submitFlag(View view) {
        C2725g.m881e(view, "view");
        FirebaseAuth firebaseAuth = this.f4468C;
        if ((firebaseAuth != null ? firebaseAuth.m2423c() : null) == null) {
            Toast.makeText(this, "Not authenticated!", 0).show();
            return;
        }
        EditText editText = (EditText) findViewById(R.id.editText4);
        C2725g.m882d(editText, "editText");
        this.f4467B.m2050b(new C1475b(editText.getText().toString()));
    }
}
