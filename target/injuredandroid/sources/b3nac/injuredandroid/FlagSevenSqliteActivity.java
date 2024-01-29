package b3nac.injuredandroid;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
public final class FlagSevenSqliteActivity extends ActivityC0453c {

    /* renamed from: C */
    private final String f4443C;

    /* renamed from: D */
    private final String f4444D;

    /* renamed from: E */
    private C2308d f4445E;

    /* renamed from: F */
    private C2308d f4446F;

    /* renamed from: G */
    private C2308d f4447G;

    /* renamed from: H */
    private InterfaceC2322l f4448H;

    /* renamed from: I */
    private InterfaceC2322l f4449I;

    /* renamed from: w */
    private int f4450w;

    /* renamed from: x */
    private C1489f f4451x = new C1489f(this);

    /* renamed from: y */
    private final String f4452y = "c3FsaXRl";

    /* renamed from: z */
    private final String f4453z = "ZjFhZy1wYTU1";

    /* renamed from: A */
    private byte[] f4441A = Base64.decode("c3FsaXRl", 0);

    /* renamed from: B */
    private byte[] f4442B = Base64.decode(this.f4453z, 0);

    /* renamed from: b3nac.injuredandroid.FlagSevenSqliteActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1468a implements View.OnClickListener {
        View$OnClickListenerC1468a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int m4107G = FlagSevenSqliteActivity.this.m4107G();
            if (m4107G == 0) {
                C2725g.m883c(view);
                Snackbar m2647X = Snackbar.m2647X(view, "Run ADB as root.", 0);
                m2647X.m2646Y("Action", null);
                m2647X.mo2650N();
                FlagSevenSqliteActivity flagSevenSqliteActivity = FlagSevenSqliteActivity.this;
                flagSevenSqliteActivity.m4105I(flagSevenSqliteActivity.m4107G() + 1);
            } else if (m4107G == 1) {
                C2725g.m883c(view);
                Snackbar m2647X2 = Snackbar.m2647X(view, "Stay on this activity.", 0);
                m2647X2.m2646Y("Action", null);
                m2647X2.mo2650N();
                FlagSevenSqliteActivity.this.m4105I(0);
            } else if (m4107G != 2) {
            } else {
                C2725g.m883c(view);
                Snackbar m2647X3 = Snackbar.m2647X(view, "Not all encodings are the same, some need to be rotated.", 0);
                m2647X3.m2646Y("Action", null);
                m2647X3.mo2650N();
            }
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagSevenSqliteActivity$b */
    /* loaded from: classes.dex */
    public static final class C1469b implements InterfaceC2322l {
        C1469b() {
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("SqliteActivity", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = FlagSevenSqliteActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4063d(applicationContext, "flagSevenEncrypted", (String) c2305a.m2075c());
        }
    }

    /* renamed from: b3nac.injuredandroid.FlagSevenSqliteActivity$c */
    /* loaded from: classes.dex */
    public static final class C1470c implements InterfaceC2322l {
        C1470c() {
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("SqliteActivity", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshotTwo");
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = FlagSevenSqliteActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4063d(applicationContext, "flagSevenPasswordEncrypted", (String) c2305a.m2075c());
        }
    }

    public FlagSevenSqliteActivity() {
        byte[] bArr = this.f4441A;
        C2725g.m882d(bArr, "decodedDirectoryOne");
        Charset charset = StandardCharsets.UTF_8;
        C2725g.m882d(charset, "StandardCharsets.UTF_8");
        this.f4443C = new String(bArr, charset);
        byte[] bArr2 = this.f4442B;
        C2725g.m882d(bArr2, "decodedDirectoryTwo");
        Charset charset2 = StandardCharsets.UTF_8;
        C2725g.m882d(charset2, "StandardCharsets.UTF_8");
        this.f4444D = new String(bArr2, charset2);
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4445E = m2059d;
        C2308d m2066h = m2059d.m2066h(this.f4443C);
        C2725g.m882d(m2066h, "database.child(refDirectory)");
        this.f4446F = m2066h;
        C2308d m2066h2 = this.f4445E.m2066h(this.f4444D);
        C2725g.m882d(m2066h2, "database.child(refDirectoryTwo)");
        this.f4447G = m2066h2;
    }

    /* renamed from: F */
    private final void m4108F() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: H */
    private final void m4106H() {
        C2308d c2308d = this.f4446F;
        C1469b c1469b = new C1469b();
        c2308d.m2049c(c1469b);
        this.f4448H = c1469b;
        C2308d c2308d2 = this.f4447G;
        C1470c c1470c = new C1470c();
        c2308d2.m2049c(c1470c);
        this.f4449I = c1470c;
    }

    /* renamed from: G */
    public final int m4107G() {
        return this.f4450w;
    }

    /* renamed from: I */
    public final void m4105I(int i) {
        this.f4450w = i;
    }

    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_seven_sqlite);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        ApplicationC1493j.f4523j.m4062a(this);
        m4106H();
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1468a());
        SQLiteDatabase writableDatabase = this.f4451x.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", Base64.decode("VGhlIGZsYWcgaGFzaCE=", 0));
        contentValues.put("subtitle", Base64.decode("MmFiOTYzOTBjN2RiZTM0MzlkZTc0ZDBjOWIwYjE3Njc=", 0));
        writableDatabase.insert("Thisisatest", null, contentValues);
        contentValues.put("title", Base64.decode("VGhlIGZsYWcgaXMgYWxzbyBhIHBhc3N3b3JkIQ==", 0));
        contentValues.put("subtitle", C1491h.m4067c());
        writableDatabase.insert("Thisisatest", null, contentValues);
    }

    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, android.app.Activity
    public void onDestroy() {
        this.f4451x.close();
        deleteDatabase("Thisisatest.db");
        InterfaceC2322l interfaceC2322l = this.f4448H;
        if (interfaceC2322l != null) {
            C2308d c2308d = this.f4446F;
            C2725g.m883c(interfaceC2322l);
            c2308d.m2046f(interfaceC2322l);
        }
        InterfaceC2322l interfaceC2322l2 = this.f4449I;
        if (interfaceC2322l2 != null) {
            C2308d c2308d2 = this.f4447G;
            C2725g.m883c(interfaceC2322l2);
            c2308d2.m2046f(interfaceC2322l2);
        }
        super.onDestroy();
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText8);
        C2725g.m882d(editText, "editText8");
        String obj = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editText7);
        C2725g.m882d(editText2, "editText7");
        String obj2 = editText2.getText().toString();
        ApplicationC1493j applicationC1493j = new ApplicationC1493j();
        String m4064c = applicationC1493j.m4064c("flagSevenEncrypted", "");
        String m4064c2 = applicationC1493j.m4064c("flagSevenPasswordEncrypted", "");
        if (!C2725g.m885a(obj, m4064c) || !C2725g.m885a(obj2, m4064c2)) {
            Toast.makeText(this, "Try again! :D", 0).show();
            return;
        }
        FlagsOverview.f4480H = true;
        ApplicationC1493j applicationC1493j2 = new ApplicationC1493j();
        Context applicationContext = getApplicationContext();
        C2725g.m882d(applicationContext, "applicationContext");
        applicationC1493j2.m4065b(applicationContext, "flagSevenButtonColor", true);
        m4108F();
    }
}
