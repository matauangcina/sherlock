package p054b.p055a.p056a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* renamed from: b.a.a.u */
/* loaded from: classes.dex */
public class C1108u {

    /* renamed from: a */
    public static String f3793a = "Volley";

    /* renamed from: b */
    public static boolean f3794b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    private static final String f3795c = C1108u.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.u$a */
    /* loaded from: classes.dex */
    public static class C1109a {

        /* renamed from: c */
        public static final boolean f3796c = C1108u.f3794b;

        /* renamed from: a */
        private final List<C1110a> f3797a = new ArrayList();

        /* renamed from: b */
        private boolean f3798b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b.a.a.u$a$a */
        /* loaded from: classes.dex */
        public static class C1110a {

            /* renamed from: a */
            public final String f3799a;

            /* renamed from: b */
            public final long f3800b;

            /* renamed from: c */
            public final long f3801c;

            public C1110a(String str, long j, long j2) {
                this.f3799a = str;
                this.f3800b = j;
                this.f3801c = j2;
            }
        }

        /* renamed from: c */
        private long m4921c() {
            if (this.f3797a.size() == 0) {
                return 0L;
            }
            long j = this.f3797a.get(0).f3801c;
            List<C1110a> list = this.f3797a;
            return list.get(list.size() - 1).f3801c - j;
        }

        /* renamed from: a */
        public synchronized void m4923a(String str, long j) {
            if (this.f3798b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f3797a.add(new C1110a(str, j, SystemClock.elapsedRealtime()));
        }

        /* renamed from: b */
        public synchronized void m4922b(String str) {
            this.f3798b = true;
            long m4921c = m4921c();
            if (m4921c <= 0) {
                return;
            }
            long j = this.f3797a.get(0).f3801c;
            C1108u.m4927b("(%-4d ms) %s", Long.valueOf(m4921c), str);
            for (C1110a c1110a : this.f3797a) {
                long j2 = c1110a.f3801c;
                C1108u.m4927b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c1110a.f3800b), c1110a.f3799a);
                j = j2;
            }
        }

        protected void finalize() {
            if (this.f3798b) {
                return;
            }
            m4922b("Request on the loose");
            C1108u.m4926c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* renamed from: a */
    private static String m4928a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f3795c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: b */
    public static void m4927b(String str, Object... objArr) {
        Log.d(f3793a, m4928a(str, objArr));
    }

    /* renamed from: c */
    public static void m4926c(String str, Object... objArr) {
        Log.e(f3793a, m4928a(str, objArr));
    }

    /* renamed from: d */
    public static void m4925d(Throwable th, String str, Object... objArr) {
        Log.e(f3793a, m4928a(str, objArr), th);
    }

    /* renamed from: e */
    public static void m4924e(String str, Object... objArr) {
        if (f3794b) {
            Log.v(f3793a, m4928a(str, objArr));
        }
    }
}
