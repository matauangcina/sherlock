package androidx.core.p003os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: androidx.core.os.HandlerCompat */
/* loaded from: classes.dex */
public final class HandlerCompat {
    private static final String TAG = "HandlerCompat";

    public static Handler createAsync(Looper looper) {
        return Api28Impl.createAsync(looper);
    }

    public static Handler createAsync(Looper looper, Handler.Callback callback) {
        return Api28Impl.createAsync(looper, callback);
    }

    public static boolean postDelayed(Handler handler, Runnable r, Object token, long delayMillis) {
        return Api28Impl.postDelayed(handler, r, token, delayMillis);
    }

    public static boolean hasCallbacks(Handler handler, Runnable r) {
        Exception wrappedException;
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.hasCallbacks(handler, r);
        }
        try {
            Method hasCallbacksMethod = Handler.class.getMethod("hasCallbacks", Runnable.class);
            return ((Boolean) hasCallbacksMethod.invoke(handler, r)).booleanValue();
        } catch (IllegalAccessException e) {
            wrappedException = e;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", wrappedException);
        } catch (NoSuchMethodException e2) {
            wrappedException = e2;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", wrappedException);
        } catch (NullPointerException e3) {
            wrappedException = e3;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", wrappedException);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    private HandlerCompat() {
    }

    /* renamed from: androidx.core.os.HandlerCompat$Api29Impl */
    /* loaded from: classes.dex */
    private static class Api29Impl {
        private Api29Impl() {
        }

        public static boolean hasCallbacks(Handler handler, Runnable r) {
            return handler.hasCallbacks(r);
        }
    }

    /* renamed from: androidx.core.os.HandlerCompat$Api28Impl */
    /* loaded from: classes.dex */
    private static class Api28Impl {
        private Api28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler createAsync(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean postDelayed(Handler handler, Runnable r, Object token, long delayMillis) {
            return handler.postDelayed(r, token, delayMillis);
        }
    }
}
