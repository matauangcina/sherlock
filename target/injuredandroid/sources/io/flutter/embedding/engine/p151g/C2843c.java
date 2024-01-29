package io.flutter.embedding.engine.p151g;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.C2989f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p108c.p109a.C1499b;
import p108c.p109a.p114d.C1538a;
/* renamed from: io.flutter.embedding.engine.g.c */
/* loaded from: classes.dex */
public class C2843c {

    /* renamed from: a */
    private boolean f7073a;

    /* renamed from: b */
    private C2847c f7074b;

    /* renamed from: c */
    private long f7075c;

    /* renamed from: d */
    private C2842b f7076d;

    /* renamed from: e */
    private FlutterJNI f7077e;

    /* renamed from: f */
    Future<C2846b> f7078f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.engine.g.c$a */
    /* loaded from: classes.dex */
    public class CallableC2844a implements Callable<C2846b> {

        /* renamed from: a */
        final /* synthetic */ Context f7079a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.flutter.embedding.engine.g.c$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2845a implements Runnable {
            RunnableC2845a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2843c.this.f7077e.prefetchDefaultFontManager();
            }
        }

        CallableC2844a(Context context) {
            this.f7079a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2846b call() {
            C2848d m529e = C2843c.this.m529e(this.f7079a);
            C2843c.this.f7077e.loadLibrary();
            Executors.newSingleThreadExecutor().execute(new RunnableC2845a());
            if (m529e != null) {
                m529e.m524a();
            }
            return new C2846b(C1538a.m3994c(this.f7079a), C1538a.m3996a(this.f7079a), C1538a.m3995b(this.f7079a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.embedding.engine.g.c$b */
    /* loaded from: classes.dex */
    public static class C2846b {

        /* renamed from: a */
        final String f7082a;

        /* renamed from: b */
        final String f7083b;

        private C2846b(String str, String str2, String str3) {
            this.f7082a = str;
            this.f7083b = str2;
        }

        /* synthetic */ C2846b(String str, String str2, String str3, CallableC2844a callableC2844a) {
            this(str, str2, str3);
        }
    }

    /* renamed from: io.flutter.embedding.engine.g.c$c */
    /* loaded from: classes.dex */
    public static class C2847c {

        /* renamed from: a */
        private String f7084a;

        /* renamed from: a */
        public String m525a() {
            return this.f7084a;
        }
    }

    public C2843c() {
        this(new FlutterJNI());
    }

    public C2843c(FlutterJNI flutterJNI) {
        this.f7073a = false;
        this.f7077e = flutterJNI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public C2848d m529e(Context context) {
        return null;
    }

    /* renamed from: c */
    public void m531c(Context context, String[] strArr) {
        if (this.f7073a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f7074b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            C2846b c2846b = this.f7078f.get();
            ArrayList arrayList = new ArrayList();
            arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
            arrayList.add("--icu-native-lib-path=" + this.f7076d.f7071d + File.separator + "libflutter.so");
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            arrayList.add("--aot-shared-library-name=" + this.f7076d.f7068a);
            arrayList.add("--aot-shared-library-name=" + this.f7076d.f7071d + File.separator + this.f7076d.f7068a);
            StringBuilder sb = new StringBuilder();
            sb.append("--cache-dir-path=");
            sb.append(c2846b.f7083b);
            arrayList.add(sb.toString());
            if (!this.f7076d.f7072e) {
                arrayList.add("--disallow-insecure-connections");
            }
            if (this.f7076d.f7070c != null) {
                arrayList.add("--domain-network-policy=" + this.f7076d.f7070c);
            }
            if (this.f7074b.m525a() != null) {
                arrayList.add("--log-tag=" + this.f7074b.m525a());
            }
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
            if (i == 0) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                i = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
            }
            arrayList.add("--old-gen-heap-size=" + i);
            this.f7077e.init(context, (String[]) arrayList.toArray(new String[0]), null, c2846b.f7082a, c2846b.f7083b, SystemClock.uptimeMillis() - this.f7075c);
            this.f7073a = true;
        } catch (Exception e) {
            C1499b.m4051c("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public String m530d() {
        return this.f7076d.f7069b;
    }

    /* renamed from: f */
    public void m528f(Context context) {
        m527g(context, new C2847c());
    }

    /* renamed from: g */
    public void m527g(Context context, C2847c c2847c) {
        if (this.f7074b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Context applicationContext = context.getApplicationContext();
        this.f7074b = c2847c;
        this.f7075c = SystemClock.uptimeMillis();
        this.f7076d = C2841a.m537d(applicationContext);
        C2989f.m8b((WindowManager) applicationContext.getSystemService("window")).m7c();
        this.f7078f = Executors.newSingleThreadExecutor().submit(new CallableC2844a(applicationContext));
    }
}
