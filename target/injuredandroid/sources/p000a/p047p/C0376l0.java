package p000a.p047p;

import android.view.View;
import android.view.WindowId;
/* renamed from: a.p.l0 */
/* loaded from: classes.dex */
class C0376l0 implements InterfaceC0384m0 {

    /* renamed from: a */
    private final WindowId f970a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0376l0(View view) {
        this.f970a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0376l0) && ((C0376l0) obj).f970a.equals(this.f970a);
    }

    public int hashCode() {
        return this.f970a.hashCode();
    }
}
