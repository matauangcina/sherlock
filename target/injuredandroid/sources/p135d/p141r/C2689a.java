package p135d.p141r;

import java.io.Closeable;
import p135d.C2631b;
/* renamed from: d.r.a */
/* loaded from: classes.dex */
public final class C2689a {
    /* renamed from: a */
    public static final void m899a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C2631b.m982a(th, th2);
        }
    }
}
