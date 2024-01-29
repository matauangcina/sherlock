package p000a.p001a.p007n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000a.p001a.p007n.AbstractC0030b;
/* renamed from: a.a.n.e */
/* loaded from: classes.dex */
public class C0034e extends AbstractC0030b implements C0507g.InterfaceC0508a {

    /* renamed from: h */
    private Context f82h;

    /* renamed from: i */
    private ActionBarContextView f83i;

    /* renamed from: j */
    private AbstractC0030b.InterfaceC0031a f84j;

    /* renamed from: k */
    private WeakReference<View> f85k;

    /* renamed from: l */
    private boolean f86l;

    /* renamed from: m */
    private C0507g f87m;

    public C0034e(Context context, ActionBarContextView actionBarContextView, AbstractC0030b.InterfaceC0031a interfaceC0031a, boolean z) {
        this.f82h = context;
        this.f83i = actionBarContextView;
        this.f84j = interfaceC0031a;
        C0507g c0507g = new C0507g(actionBarContextView.getContext());
        c0507g.m7842S(1);
        this.f87m = c0507g;
        c0507g.mo7736R(this);
    }

    @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
    /* renamed from: a */
    public boolean mo7687a(C0507g c0507g, MenuItem menuItem) {
        return this.f84j.mo7978c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
    /* renamed from: b */
    public void mo7686b(C0507g c0507g) {
        mo7902k();
        this.f83i.m7723l();
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: c */
    public void mo7908c() {
        if (this.f86l) {
            return;
        }
        this.f86l = true;
        this.f83i.sendAccessibilityEvent(32);
        this.f84j.mo7979b(this);
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: d */
    public View mo7907d() {
        WeakReference<View> weakReference = this.f85k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: e */
    public Menu mo7906e() {
        return this.f87m;
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: f */
    public MenuInflater mo7905f() {
        return new C0037g(this.f83i.getContext());
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: g */
    public CharSequence mo7904g() {
        return this.f83i.getSubtitle();
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: i */
    public CharSequence mo7903i() {
        return this.f83i.getTitle();
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: k */
    public void mo7902k() {
        this.f84j.mo7980a(this, this.f87m);
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: l */
    public boolean mo7901l() {
        return this.f83i.m7725j();
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: m */
    public void mo7900m(View view) {
        this.f83i.setCustomView(view);
        this.f85k = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: n */
    public void mo7899n(int i) {
        mo7898o(this.f82h.getString(i));
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: o */
    public void mo7898o(CharSequence charSequence) {
        this.f83i.setSubtitle(charSequence);
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: q */
    public void mo7897q(int i) {
        mo7896r(this.f82h.getString(i));
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: r */
    public void mo7896r(CharSequence charSequence) {
        this.f83i.setTitle(charSequence);
    }

    @Override // p000a.p001a.p007n.AbstractC0030b
    /* renamed from: s */
    public void mo7895s(boolean z) {
        super.mo7895s(z);
        this.f83i.setTitleOptional(z);
    }
}
