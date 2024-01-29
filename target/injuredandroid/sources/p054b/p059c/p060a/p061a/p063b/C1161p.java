package p054b.p059c.p060a.p061a.p063b;

import android.content.Context;
import android.util.Log;
/* renamed from: b.c.a.a.b.p */
/* loaded from: classes.dex */
final class C1161p {

    /* renamed from: a */
    private static Context f3881a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m4752a(Context context) {
        synchronized (C1161p.class) {
            if (f3881a != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f3881a = context.getApplicationContext();
            }
        }
    }
}
