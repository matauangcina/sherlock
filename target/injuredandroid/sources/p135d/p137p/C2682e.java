package p135d.p137p;

import java.io.Serializable;
import p135d.p137p.InterfaceC2676d;
import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.p.e */
/* loaded from: classes.dex */
public final class C2682e implements InterfaceC2676d, Serializable {

    /* renamed from: f */
    public static final C2682e f6832f = new C2682e();

    private C2682e() {
    }

    @Override // p135d.p137p.InterfaceC2676d
    public <R> R fold(R r, InterfaceC2710p<? super R, ? super InterfaceC2676d.InterfaceC2679b, ? extends R> interfaceC2710p) {
        C2725g.m881e(interfaceC2710p, "operation");
        return r;
    }

    @Override // p135d.p137p.InterfaceC2676d
    public <E extends InterfaceC2676d.InterfaceC2679b> E get(InterfaceC2676d.InterfaceC2681c<E> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p135d.p137p.InterfaceC2676d
    public InterfaceC2676d minusKey(InterfaceC2676d.InterfaceC2681c<?> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
