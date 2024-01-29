package com.google.firebase.database.p120m;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.database.C2307c;
import com.google.firebase.database.p122o.C2370d;
import com.google.firebase.database.p122o.C2372f;
import com.google.firebase.database.p122o.C2376i;
import com.google.firebase.database.p122o.InterfaceC2374h;
import com.google.firebase.database.p124p.C2449g;
import com.google.firebase.database.p124p.InterfaceC2505k;
import com.google.firebase.database.p124p.InterfaceC2508m;
import com.google.firebase.database.p124p.InterfaceC2532q;
import com.google.firebase.database.p124p.p126f0.C2432b;
import com.google.firebase.database.p124p.p126f0.C2433c;
import com.google.firebase.database.p124p.p126f0.InterfaceC2435e;
import com.google.firebase.database.p124p.p127g0.AbstractC2453c;
import com.google.firebase.database.p130q.C2563a;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.database.m.h */
/* loaded from: classes.dex */
public class C2332h implements InterfaceC2508m {

    /* renamed from: a */
    private final Context f6145a;

    /* renamed from: b */
    private final Set<String> f6146b = new HashSet();

    /* renamed from: c */
    private final C1415c f6147c;

    /* renamed from: com.google.firebase.database.m.h$a */
    /* loaded from: classes.dex */
    class C2333a extends AbstractC2453c {

        /* renamed from: b */
        final /* synthetic */ C2566c f6148b;

        /* renamed from: com.google.firebase.database.m.h$a$a */
        /* loaded from: classes.dex */
        class RunnableC2334a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f6150f;

            /* renamed from: g */
            final /* synthetic */ Throwable f6151g;

            RunnableC2334a(C2333a c2333a, String str, Throwable th) {
                this.f6150f = str;
                this.f6151g = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f6150f, this.f6151g);
            }
        }

        C2333a(C2566c c2566c) {
            this.f6148b = c2566c;
        }

        @Override // com.google.firebase.database.p124p.p127g0.AbstractC2453c
        /* renamed from: f */
        public void mo1569f(Throwable th) {
            String m1568g = AbstractC2453c.m1568g(th);
            this.f6148b.m1177c(m1568g, th);
            new Handler(C2332h.this.f6145a.getMainLooper()).post(new RunnableC2334a(this, m1568g, th));
            m1572c().shutdownNow();
        }
    }

    /* renamed from: com.google.firebase.database.m.h$b */
    /* loaded from: classes.dex */
    class C2335b implements C1415c.InterfaceC1417b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2374h f6152a;

        C2335b(C2332h c2332h, InterfaceC2374h interfaceC2374h) {
            this.f6152a = interfaceC2374h;
        }

        @Override // p054b.p059c.p098c.C1415c.InterfaceC1417b
        /* renamed from: a */
        public void mo2019a(boolean z) {
            if (z) {
                this.f6152a.mo1855i("app_in_background");
            } else {
                this.f6152a.mo1847m("app_in_background");
            }
        }
    }

    public C2332h(C1415c c1415c) {
        this.f6147c = c1415c;
        if (c1415c != null) {
            this.f6145a = c1415c.m4200j();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: a */
    public InterfaceC2435e mo1380a(C2449g c2449g, String str) {
        String m1582u = c2449g.m1582u();
        String str2 = str + "_" + m1582u;
        if (!this.f6146b.contains(str2)) {
            this.f6146b.add(str2);
            return new C2432b(c2449g, new C2336i(this.f6145a, c2449g, str2), new C2433c(c2449g.m1587p()));
        }
        throw new C2307c("SessionPersistenceKey '" + m1582u + "' has already been used.");
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: b */
    public String mo1379b(C2449g c2449g) {
        return Build.VERSION.SDK_INT + "/Android";
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: c */
    public InterfaceC2505k mo1378c(C2449g c2449g) {
        return new C2331g();
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: d */
    public File mo1377d() {
        return this.f6145a.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: e */
    public InterfaceC2567d mo1376e(C2449g c2449g, InterfaceC2567d.EnumC2568a enumC2568a, List<String> list) {
        return new C2563a(enumC2568a, list);
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: f */
    public InterfaceC2374h mo1375f(C2449g c2449g, C2370d c2370d, C2372f c2372f, InterfaceC2374h.InterfaceC2375a interfaceC2375a) {
        C2376i c2376i = new C2376i(c2370d, c2372f, interfaceC2375a);
        this.f6147c.m4205e(new C2335b(this, c2376i));
        return c2376i;
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2508m
    /* renamed from: g */
    public InterfaceC2532q mo1374g(C2449g c2449g) {
        return new C2333a(c2449g.m1589n("RunLoop"));
    }
}
