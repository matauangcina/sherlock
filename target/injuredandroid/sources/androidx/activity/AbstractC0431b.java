package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC0431b {

    /* renamed from: a */
    private boolean f1170a;

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0430a> f1171b = new CopyOnWriteArrayList<>();

    public AbstractC0431b(boolean z) {
        this.f1170a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8132a(InterfaceC0430a interfaceC0430a) {
        this.f1171b.add(interfaceC0430a);
    }

    /* renamed from: b */
    public abstract void mo6055b();

    /* renamed from: c */
    public final boolean m8131c() {
        return this.f1170a;
    }

    /* renamed from: d */
    public final void m8130d() {
        Iterator<InterfaceC0430a> it = this.f1171b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m8129e(InterfaceC0430a interfaceC0430a) {
        this.f1171b.remove(interfaceC0430a);
    }

    /* renamed from: f */
    public final void m8128f(boolean z) {
        this.f1170a = z;
    }
}
