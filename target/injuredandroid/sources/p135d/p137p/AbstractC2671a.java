package p135d.p137p;

import p135d.p137p.InterfaceC2676d;
import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.p.a */
/* loaded from: classes.dex */
public abstract class AbstractC2671a implements InterfaceC2676d.InterfaceC2679b {
    private final InterfaceC2676d.InterfaceC2681c<?> key;

    public AbstractC2671a(InterfaceC2676d.InterfaceC2681c<?> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        this.key = interfaceC2681c;
    }

    @Override // p135d.p137p.InterfaceC2676d
    public <R> R fold(R r, InterfaceC2710p<? super R, ? super InterfaceC2676d.InterfaceC2679b, ? extends R> interfaceC2710p) {
        C2725g.m881e(interfaceC2710p, "operation");
        return (R) InterfaceC2676d.InterfaceC2679b.C2680a.m908a(this, r, interfaceC2710p);
    }

    @Override // p135d.p137p.InterfaceC2676d.InterfaceC2679b, p135d.p137p.InterfaceC2676d
    public <E extends InterfaceC2676d.InterfaceC2679b> E get(InterfaceC2676d.InterfaceC2681c<E> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        return (E) InterfaceC2676d.InterfaceC2679b.C2680a.m907b(this, interfaceC2681c);
    }

    @Override // p135d.p137p.InterfaceC2676d.InterfaceC2679b
    public InterfaceC2676d.InterfaceC2681c<?> getKey() {
        return this.key;
    }

    @Override // p135d.p137p.InterfaceC2676d
    public InterfaceC2676d minusKey(InterfaceC2676d.InterfaceC2681c<?> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        return InterfaceC2676d.InterfaceC2679b.C2680a.m906c(this, interfaceC2681c);
    }

    public InterfaceC2676d plus(InterfaceC2676d interfaceC2676d) {
        C2725g.m881e(interfaceC2676d, "context");
        return InterfaceC2676d.InterfaceC2679b.C2680a.m905d(this, interfaceC2676d);
    }
}
