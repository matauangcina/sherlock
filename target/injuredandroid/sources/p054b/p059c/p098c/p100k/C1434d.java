package p054b.p059c.p098c.p100k;

import android.content.Context;
/* renamed from: b.c.c.k.d */
/* loaded from: classes.dex */
class C1434d {

    /* renamed from: a */
    private static C1434d f4369a;

    private C1434d(Context context) {
        context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C1434d m4172a(Context context) {
        C1434d c1434d;
        synchronized (C1434d.class) {
            if (f4369a == null) {
                f4369a = new C1434d(context);
            }
            c1434d = f4369a;
        }
        return c1434d;
    }
}
