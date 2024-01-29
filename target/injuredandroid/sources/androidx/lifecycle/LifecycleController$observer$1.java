package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import kotlinx.coroutines.InterfaceC2993a;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
final class LifecycleController$observer$1 implements InterfaceC0873h {

    /* renamed from: a */
    final /* synthetic */ C0871f f3093a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC2993a f3094b;

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public final void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        AbstractC0868e.EnumC0870b enumC0870b;
        C0865b c0865b;
        C0865b c0865b2;
        C2725g.m880f(interfaceC0875j, "source");
        C2725g.m880f(enumC0869a, "<anonymous parameter 1>");
        AbstractC0868e mo698a = interfaceC0875j.mo698a();
        C2725g.m884b(mo698a, "source.lifecycle");
        if (mo698a.mo6123b() == AbstractC0868e.EnumC0870b.DESTROYED) {
            C0871f c0871f = this.f3093a;
            InterfaceC2993a.C2994a.m4a(this.f3094b, null, 1, null);
            c0871f.m6125c();
            throw null;
        }
        AbstractC0868e mo698a2 = interfaceC0875j.mo698a();
        C2725g.m884b(mo698a2, "source.lifecycle");
        AbstractC0868e.EnumC0870b mo6123b = mo698a2.mo6123b();
        enumC0870b = this.f3093a.f3134a;
        if (mo6123b.compareTo(enumC0870b) < 0) {
            c0865b2 = this.f3093a.f3135b;
            c0865b2.m6137a();
            throw null;
        }
        c0865b = this.f3093a.f3135b;
        c0865b.m6136b();
        throw null;
    }
}
