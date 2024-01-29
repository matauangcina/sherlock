package p135d.p147v;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.v.a */
/* loaded from: classes.dex */
public final class C2748a<T> implements InterfaceC2749b<T> {

    /* renamed from: a */
    private final AtomicReference<InterfaceC2749b<T>> f6866a;

    public C2748a(InterfaceC2749b<? extends T> interfaceC2749b) {
        C2725g.m881e(interfaceC2749b, "sequence");
        this.f6866a = new AtomicReference<>(interfaceC2749b);
    }

    @Override // p135d.p147v.InterfaceC2749b
    public Iterator<T> iterator() {
        InterfaceC2749b<T> andSet = this.f6866a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
