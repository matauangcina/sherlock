package p000a.p047p;

import android.os.IBinder;
/* renamed from: a.p.k0 */
/* loaded from: classes.dex */
class C0374k0 implements InterfaceC0384m0 {

    /* renamed from: a */
    private final IBinder f967a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0374k0(IBinder iBinder) {
        this.f967a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0374k0) && ((C0374k0) obj).f967a.equals(this.f967a);
    }

    public int hashCode() {
        return this.f967a.hashCode();
    }
}
