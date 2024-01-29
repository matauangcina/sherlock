package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public abstract class AbstractC0889t {

    /* renamed from: a */
    private final Map<String, Object> f3150a = new HashMap();

    /* renamed from: b */
    private static void m6085b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6086a() {
        Map<String, Object> map = this.f3150a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f3150a.values()) {
                    m6085b(obj);
                }
            }
        }
        mo5990d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T m6084c(String str) {
        T t;
        Map<String, Object> map = this.f3150a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f3150a.get(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo5990d() {
    }
}
