package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
final class C0708c {

    /* renamed from: g */
    private static final Handler f2545g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    protected static final Class<?> f2539a = m6990a();

    /* renamed from: b */
    protected static final Field f2540b = m6989b();

    /* renamed from: c */
    protected static final Field f2541c = m6985f();

    /* renamed from: d */
    protected static final Method f2542d = m6987d(f2539a);

    /* renamed from: e */
    protected static final Method f2543e = m6988c(f2539a);

    /* renamed from: f */
    protected static final Method f2544f = m6986e(f2539a);

    /* renamed from: androidx.core.app.c$a */
    /* loaded from: classes.dex */
    class RunnableC0709a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0712d f2546f;

        /* renamed from: g */
        final /* synthetic */ Object f2547g;

        RunnableC0709a(C0712d c0712d, Object obj) {
            this.f2546f = c0712d;
            this.f2547g = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2546f.f2552f = this.f2547g;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    /* loaded from: classes.dex */
    class RunnableC0710b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f2548f;

        /* renamed from: g */
        final /* synthetic */ C0712d f2549g;

        RunnableC0710b(Application application, C0712d c0712d) {
            this.f2548f = application;
            this.f2549g = c0712d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2548f.unregisterActivityLifecycleCallbacks(this.f2549g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0711c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2550f;

        /* renamed from: g */
        final /* synthetic */ Object f2551g;

        RunnableC0711c(Object obj, Object obj2) {
            this.f2550f = obj;
            this.f2551g = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C0708c.f2542d != null) {
                    C0708c.f2542d.invoke(this.f2550f, this.f2551g, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0708c.f2543e.invoke(this.f2550f, this.f2551g, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    /* loaded from: classes.dex */
    private static final class C0712d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f2552f;

        /* renamed from: g */
        private Activity f2553g;

        /* renamed from: h */
        private final int f2554h;

        /* renamed from: i */
        private boolean f2555i = false;

        /* renamed from: j */
        private boolean f2556j = false;

        /* renamed from: k */
        private boolean f2557k = false;

        C0712d(Activity activity) {
            this.f2553g = activity;
            this.f2554h = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2553g == activity) {
                this.f2553g = null;
                this.f2556j = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2556j || this.f2557k || this.f2555i || !C0708c.m6983h(this.f2552f, this.f2554h, activity)) {
                return;
            }
            this.f2557k = true;
            this.f2552f = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2553g == activity) {
                this.f2555i = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    private static Class<?> m6990a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m6989b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m6988c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m6987d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m6986e(Class<?> cls) {
        if (m6984g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m6985f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m6984g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m6983h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f2541c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f2545g.postAtFrontOfQueue(new RunnableC0711c(f2540b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m6982i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m6984g() && f2544f == null) {
            return false;
        } else {
            if (f2543e == null && f2542d == null) {
                return false;
            }
            try {
                Object obj2 = f2541c.get(activity);
                if (obj2 == null || (obj = f2540b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0712d c0712d = new C0712d(activity);
                application.registerActivityLifecycleCallbacks(c0712d);
                f2545g.post(new RunnableC0709a(c0712d, obj2));
                if (m6984g()) {
                    f2544f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                f2545g.post(new RunnableC0710b(application, c0712d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
