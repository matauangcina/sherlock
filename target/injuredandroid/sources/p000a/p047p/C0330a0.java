package p000a.p047p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* renamed from: a.p.a0 */
/* loaded from: classes.dex */
class C0330a0 implements InterfaceC0332b0 {

    /* renamed from: a */
    private final ViewOverlay f882a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0330a0(View view) {
        this.f882a = view.getOverlay();
    }

    @Override // p000a.p047p.InterfaceC0332b0
    /* renamed from: b */
    public void mo8220b(Drawable drawable) {
        this.f882a.add(drawable);
    }

    @Override // p000a.p047p.InterfaceC0332b0
    /* renamed from: d */
    public void mo8219d(Drawable drawable) {
        this.f882a.remove(drawable);
    }
}
