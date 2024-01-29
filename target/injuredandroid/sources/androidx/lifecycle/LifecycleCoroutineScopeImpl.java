package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import kotlinx.coroutines.C2997c;
import p135d.p137p.InterfaceC2676d;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0872g implements InterfaceC0873h {

    /* renamed from: a */
    private final AbstractC0868e f3095a;

    /* renamed from: b */
    private final InterfaceC2676d f3096b;

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        C2725g.m880f(interfaceC0875j, "source");
        C2725g.m880f(enumC0869a, "event");
        if (m6163i().mo6123b().compareTo(AbstractC0868e.EnumC0870b.DESTROYED) <= 0) {
            m6163i().mo6122c(this);
            C2997c.m0b(m6164h(), null, 1, null);
        }
    }

    /* renamed from: h */
    public InterfaceC2676d m6164h() {
        return this.f3096b;
    }

    /* renamed from: i */
    public AbstractC0868e m6163i() {
        return this.f3095a;
    }
}
