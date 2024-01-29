package p000a.p047p;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* renamed from: a.p.v */
/* loaded from: classes.dex */
class C0397v implements InterfaceC0398w {

    /* renamed from: a */
    private final ViewGroupOverlay f1038a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0397v(ViewGroup viewGroup) {
        this.f1038a = viewGroup.getOverlay();
    }

    @Override // p000a.p047p.InterfaceC0398w
    /* renamed from: a */
    public void mo8227a(View view) {
        this.f1038a.add(view);
    }

    @Override // p000a.p047p.InterfaceC0332b0
    /* renamed from: b */
    public void mo8220b(Drawable drawable) {
        this.f1038a.add(drawable);
    }

    @Override // p000a.p047p.InterfaceC0398w
    /* renamed from: c */
    public void mo8226c(View view) {
        this.f1038a.remove(view);
    }

    @Override // p000a.p047p.InterfaceC0332b0
    /* renamed from: d */
    public void mo8219d(Drawable drawable) {
        this.f1038a.remove(drawable);
    }
}
