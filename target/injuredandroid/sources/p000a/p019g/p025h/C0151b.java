package p000a.p019g.p025h;

import android.os.Handler;
import android.os.Looper;
/* renamed from: a.g.h.b */
/* loaded from: classes.dex */
class C0151b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Handler m8959a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
