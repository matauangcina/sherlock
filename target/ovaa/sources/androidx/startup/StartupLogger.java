package androidx.startup;

import android.util.Log;
/* loaded from: classes.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final String TAG = "StartupLogger";

    private StartupLogger() {
    }

    /* renamed from: i */
    public static void m127i(String message) {
        Log.i(TAG, message);
    }

    /* renamed from: w */
    public static void m126w(String message) {
        Log.w(TAG, message);
    }

    /* renamed from: e */
    public static void m128e(String message, Throwable throwable) {
        Log.e(TAG, message, throwable);
    }
}
