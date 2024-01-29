package androidx.fragment.app;

import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.InterfaceC0875j;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public class C0856x implements InterfaceC0875j {

    /* renamed from: f */
    private C0876k f3088f = null;

    @Override // androidx.lifecycle.InterfaceC0875j
    /* renamed from: a */
    public AbstractC0868e mo698a() {
        m6166c();
        return this.f3088f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6167b(AbstractC0868e.EnumC0869a enumC0869a) {
        this.f3088f.m6116i(enumC0869a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6166c() {
        if (this.f3088f == null) {
            this.f3088f = new C0876k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m6165d() {
        return this.f3088f != null;
    }
}
