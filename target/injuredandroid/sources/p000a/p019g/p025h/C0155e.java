package p000a.p019g.p025h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000a.p014d.C0072e;
import p000a.p014d.C0079g;
import p000a.p019g.p020d.C0127d;
import p000a.p019g.p025h.C0161f;
import p000a.p019g.p027j.InterfaceC0186a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.g.h.e */
/* loaded from: classes.dex */
public class C0155e {

    /* renamed from: a */
    static final C0072e<String, Typeface> f568a = new C0072e<>(16);

    /* renamed from: b */
    private static final ExecutorService f569b = C0165g.m8922a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f570c = new Object();

    /* renamed from: d */
    static final C0079g<String, ArrayList<InterfaceC0186a<C0160e>>> f571d = new C0079g<>();

    /* renamed from: a.g.h.e$a */
    /* loaded from: classes.dex */
    class CallableC0156a implements Callable<C0160e> {

        /* renamed from: a */
        final /* synthetic */ String f572a;

        /* renamed from: b */
        final /* synthetic */ Context f573b;

        /* renamed from: c */
        final /* synthetic */ C0154d f574c;

        /* renamed from: d */
        final /* synthetic */ int f575d;

        CallableC0156a(String str, Context context, C0154d c0154d, int i) {
            this.f572a = str;
            this.f573b = context;
            this.f574c = c0154d;
            this.f575d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0160e call() {
            return C0155e.m8942c(this.f572a, this.f573b, this.f574c, this.f575d);
        }
    }

    /* renamed from: a.g.h.e$b */
    /* loaded from: classes.dex */
    class C0157b implements InterfaceC0186a<C0160e> {

        /* renamed from: a */
        final /* synthetic */ C0148a f576a;

        C0157b(C0148a c0148a) {
            this.f576a = c0148a;
        }

        @Override // p000a.p019g.p027j.InterfaceC0186a
        /* renamed from: b */
        public void mo8876a(C0160e c0160e) {
            this.f576a.m8961b(c0160e);
        }
    }

    /* renamed from: a.g.h.e$c */
    /* loaded from: classes.dex */
    class CallableC0158c implements Callable<C0160e> {

        /* renamed from: a */
        final /* synthetic */ String f577a;

        /* renamed from: b */
        final /* synthetic */ Context f578b;

        /* renamed from: c */
        final /* synthetic */ C0154d f579c;

        /* renamed from: d */
        final /* synthetic */ int f580d;

        CallableC0158c(String str, Context context, C0154d c0154d, int i) {
            this.f577a = str;
            this.f578b = context;
            this.f579c = c0154d;
            this.f580d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0160e call() {
            return C0155e.m8942c(this.f577a, this.f578b, this.f579c, this.f580d);
        }
    }

    /* renamed from: a.g.h.e$d */
    /* loaded from: classes.dex */
    class C0159d implements InterfaceC0186a<C0160e> {

        /* renamed from: a */
        final /* synthetic */ String f581a;

        C0159d(String str) {
            this.f581a = str;
        }

        @Override // p000a.p019g.p027j.InterfaceC0186a
        /* renamed from: b */
        public void mo8876a(C0160e c0160e) {
            synchronized (C0155e.f570c) {
                ArrayList<InterfaceC0186a<C0160e>> arrayList = C0155e.f571d.get(this.f581a);
                if (arrayList == null) {
                    return;
                }
                C0155e.f571d.remove(this.f581a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).mo8876a(c0160e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.h.e$e */
    /* loaded from: classes.dex */
    public static final class C0160e {

        /* renamed from: a */
        final Typeface f582a;

        /* renamed from: b */
        final int f583b;

        C0160e(int i) {
            this.f582a = null;
            this.f583b = i;
        }

        C0160e(Typeface typeface) {
            this.f582a = typeface;
            this.f583b = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m8935a() {
            return this.f583b == 0;
        }
    }

    /* renamed from: a */
    private static String m8944a(C0154d c0154d, int i) {
        return c0154d.m8948d() + "-" + i;
    }

    /* renamed from: b */
    private static int m8943b(C0161f.C0162a c0162a) {
        int i = 1;
        if (c0162a.m8931c() != 0) {
            return c0162a.m8931c() != 1 ? -3 : -2;
        }
        C0161f.C0163b[] m8932b = c0162a.m8932b();
        if (m8932b != null && m8932b.length != 0) {
            i = 0;
            for (C0161f.C0163b c0163b : m8932b) {
                int m8929b = c0163b.m8929b();
                if (m8929b != 0) {
                    if (m8929b < 0) {
                        return -3;
                    }
                    return m8929b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C0160e m8942c(String str, Context context, C0154d c0154d, int i) {
        Typeface m9367c = f568a.m9367c(str);
        if (m9367c != null) {
            return new C0160e(m9367c);
        }
        try {
            C0161f.C0162a m8955d = C0152c.m8955d(context, c0154d, null);
            int m8943b = m8943b(m8955d);
            if (m8943b != 0) {
                return new C0160e(m8943b);
            }
            Typeface m9026b = C0127d.m9026b(context, null, m8955d.m8932b(), i);
            if (m9026b != null) {
                f568a.m9366d(str, m9026b);
                return new C0160e(m9026b);
            }
            return new C0160e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0160e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m8941d(Context context, C0154d c0154d, int i, Executor executor, C0148a c0148a) {
        String m8944a = m8944a(c0154d, i);
        Typeface m9367c = f568a.m9367c(m8944a);
        if (m9367c != null) {
            c0148a.m8961b(new C0160e(m9367c));
            return m9367c;
        }
        C0157b c0157b = new C0157b(c0148a);
        synchronized (f570c) {
            ArrayList<InterfaceC0186a<C0160e>> arrayList = f571d.get(m8944a);
            if (arrayList != null) {
                arrayList.add(c0157b);
                return null;
            }
            ArrayList<InterfaceC0186a<C0160e>> arrayList2 = new ArrayList<>();
            arrayList2.add(c0157b);
            f571d.put(m8944a, arrayList2);
            CallableC0158c callableC0158c = new CallableC0158c(m8944a, context, c0154d, i);
            if (executor == null) {
                executor = f569b;
            }
            C0165g.m8921b(executor, callableC0158c, new C0159d(m8944a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m8940e(Context context, C0154d c0154d, C0148a c0148a, int i, int i2) {
        String m8944a = m8944a(c0154d, i);
        Typeface m9367c = f568a.m9367c(m8944a);
        if (m9367c != null) {
            c0148a.m8961b(new C0160e(m9367c));
            return m9367c;
        } else if (i2 == -1) {
            C0160e m8942c = m8942c(m8944a, context, c0154d, i);
            c0148a.m8961b(m8942c);
            return m8942c.f582a;
        } else {
            try {
                C0160e c0160e = (C0160e) C0165g.m8920c(f569b, new CallableC0156a(m8944a, context, c0154d, i), i2);
                c0148a.m8961b(c0160e);
                return c0160e.f582a;
            } catch (InterruptedException unused) {
                c0148a.m8961b(new C0160e(-3));
                return null;
            }
        }
    }
}
