package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import p135d.C2643n;
import p135d.p141r.C2692c;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.AbstractC2726h;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class RCEActivity extends ActivityC0453c {

    /* renamed from: w */
    private C2308d f4503w;

    /* renamed from: x */
    private C2308d f4504x;

    /* renamed from: y */
    private int f4505y;

    /* renamed from: b3nac.injuredandroid.RCEActivity$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1479a implements View.OnClickListener {
        View$OnClickListenerC1479a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (RCEActivity.this.m4075K() == 0) {
                C2725g.m883c(view);
                str = "Find the binary!";
            } else if (RCEActivity.this.m4075K() != 1) {
                if (RCEActivity.this.m4075K() == 2) {
                    C2725g.m883c(view);
                    Snackbar m2647X = Snackbar.m2647X(view, "Combine output.", 0);
                    m2647X.m2646Y("Action", null);
                    m2647X.mo2650N();
                    RCEActivity.this.m4074L(0);
                    return;
                }
                return;
            } else {
                C2725g.m883c(view);
                str = "Permissions matter.";
            }
            Snackbar m2647X2 = Snackbar.m2647X(view, str, 0);
            m2647X2.m2646Y("Action", null);
            m2647X2.mo2650N();
            RCEActivity rCEActivity = RCEActivity.this;
            rCEActivity.m4074L(rCEActivity.m4075K() + 1);
        }
    }

    /* renamed from: b3nac.injuredandroid.RCEActivity$b */
    /* loaded from: classes.dex */
    public static final class C1480b implements InterfaceC2322l {

        /* renamed from: b */
        final /* synthetic */ String f4508b;

        C1480b(String str) {
            this.f4508b = str;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            C2725g.m881e(c2306b, "databaseError");
            Log.e("RCEActivity", "onCancelled", c2306b.m2067g());
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2725g.m881e(c2305a, "dataSnapshot");
            if (!C2725g.m885a(this.f4508b, (String) c2305a.m2075c())) {
                Toast.makeText(RCEActivity.this, "Try again! :D", 0).show();
                return;
            }
            FlagsOverview.f4484L = true;
            ApplicationC1493j applicationC1493j = new ApplicationC1493j();
            Context applicationContext = RCEActivity.this.getApplicationContext();
            C2725g.m882d(applicationContext, "applicationContext");
            applicationC1493j.m4065b(applicationContext, "flagThirteenButtonColor", true);
            RCEActivity.this.m4076J();
        }
    }

    /* renamed from: b3nac.injuredandroid.RCEActivity$c */
    /* loaded from: classes.dex */
    static final class C1481c extends AbstractC2726h implements InterfaceC2706l<String, C2643n> {

        /* renamed from: f */
        final /* synthetic */ StringBuilder f4509f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1481c(StringBuilder sb) {
            super(1);
            this.f4509f = sb;
        }

        @Override // p135d.p142s.p143c.InterfaceC2706l
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C2643n mo776c(String str) {
            m4073d(str);
            return C2643n.f6821a;
        }

        /* renamed from: d */
        public final void m4073d(String str) {
            C2725g.m881e(str, "it");
            this.f4509f.append(str);
        }
    }

    public RCEActivity() {
        C2310f m2061b = C2310f.m2061b();
        C2725g.m882d(m2061b, "FirebaseDatabase.getInstance()");
        C2308d m2059d = m2061b.m2059d();
        C2725g.m882d(m2059d, "FirebaseDatabase.getInstance().reference");
        this.f4503w = m2059d;
        C2308d m2066h = m2059d.m2066h("/rce");
        C2725g.m882d(m2066h, "database.child(\"/rce\")");
        this.f4504x = m2066h;
    }

    /* renamed from: G */
    private final void m4079G() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        C2725g.m882d(firebaseAuth, "FirebaseAuth.getInstance()");
        firebaseAuth.m2422d();
    }

    /* renamed from: H */
    private final void m4078H() {
        String[] strArr;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        StringBuilder sb;
        AssetManager assets = getAssets();
        InputStream inputStream2 = null;
        try {
            strArr = assets.list("");
        } catch (IOException e) {
            Log.e("tag", "Failed to get asset file list.", e);
            strArr = null;
        }
        if (strArr != null) {
            for (String str : strArr) {
                if ((!C2725g.m885a(str, "webkit")) && (!C2725g.m885a(str, "images")) && (!C2725g.m885a(str, "flutter_assets")) && (!C2725g.m885a(str, "locales"))) {
                    try {
                        inputStream = assets.open(str);
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            File filesDir = getFilesDir();
                            C2725g.m882d(filesDir, "filesDir");
                            sb2.append(filesDir.getParent());
                            sb2.append("/files/");
                            fileOutputStream = new FileOutputStream(new File(sb2.toString(), str));
                            try {
                                try {
                                    m4077I(inputStream, fileOutputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e2) {
                                            Log.e("TAG", "Failed to close file successfully: " + str, e2);
                                        }
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e3) {
                                        e = e3;
                                        sb = new StringBuilder();
                                        sb.append("Failed to close file successfully: ");
                                        sb.append(str);
                                        Log.e("TAG", sb.toString(), e);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream2 = inputStream;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e4) {
                                            Log.e("TAG", "Failed to close file successfully: " + str, e4);
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e5) {
                                            Log.e("TAG", "Failed to close file successfully: " + str, e5);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e6) {
                                e = e6;
                                Log.e("TAG", "Failed to copy asset file: " + str, e);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e7) {
                                        Log.e("TAG", "Failed to close file successfully: " + str, e7);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e8) {
                                        e = e8;
                                        sb = new StringBuilder();
                                        sb.append("Failed to close file successfully: ");
                                        sb.append(str);
                                        Log.e("TAG", sb.toString(), e);
                                    }
                                }
                            }
                        } catch (IOException e9) {
                            e = e9;
                            fileOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        inputStream = null;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    private final void m4077I(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m4076J() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* renamed from: K */
    public final int m4075K() {
        return this.f4505y;
    }

    /* renamed from: L */
    public final void m4074L(int i) {
        this.f4505y = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_rce);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        m4079G();
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View$OnClickListenerC1479a());
        if (getIntent() != null) {
            Intent intent = getIntent();
            C2725g.m882d(intent, "intent");
            if (intent.getData() != null) {
                m4078H();
                Intent intent2 = getIntent();
                C2725g.m882d(intent2, "intent");
                Uri data = intent2.getData();
                try {
                    C2725g.m883c(data);
                    String queryParameter = data.getQueryParameter("binary");
                    String queryParameter2 = data.getQueryParameter("param");
                    String queryParameter3 = data.getQueryParameter("combined");
                    if (queryParameter3 != null) {
                        this.f4504x.m2050b(new C1480b(queryParameter3));
                    } else {
                        Runtime runtime = Runtime.getRuntime();
                        StringBuilder sb = new StringBuilder();
                        File filesDir = getFilesDir();
                        C2725g.m882d(filesDir, "filesDir");
                        sb.append(filesDir.getParent());
                        sb.append("/files/");
                        sb.append(queryParameter);
                        sb.append(" ");
                        sb.append(queryParameter2);
                        Process exec = runtime.exec(sb.toString());
                        C2725g.m882d(exec, "process");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                        StringBuilder sb2 = new StringBuilder();
                        C2692c.m896a(bufferedReader, new C1481c(sb2));
                        exec.waitFor();
                        TextView textView = (TextView) findViewById(R.id.RCEView);
                        C2725g.m882d(textView, "tv");
                        textView.setText(sb2.toString());
                    }
                } catch (IOException e) {
                    Log.e("RCEActivity", "OH NO AN ERROR OCCURED!!!:" + e.getMessage());
                }
            }
        }
    }
}
