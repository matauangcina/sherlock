package p135d;

import java.io.Serializable;
import p135d.p142s.p143c.InterfaceC2695a;
import p135d.p142s.p144d.C2723e;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.j */
/* loaded from: classes.dex */
final class C2639j<T> implements InterfaceC2634e<T>, Serializable {

    /* renamed from: f */
    private InterfaceC2695a<? extends T> f6817f;

    /* renamed from: g */
    private volatile Object f6818g;

    /* renamed from: h */
    private final Object f6819h;

    public C2639j(InterfaceC2695a<? extends T> interfaceC2695a, Object obj) {
        C2725g.m881e(interfaceC2695a, "initializer");
        this.f6817f = interfaceC2695a;
        this.f6818g = C2641l.f6820a;
        this.f6819h = obj == null ? this : obj;
    }

    public /* synthetic */ C2639j(InterfaceC2695a interfaceC2695a, Object obj, int i, C2723e c2723e) {
        this(interfaceC2695a, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean m972a() {
        return this.f6818g != C2641l.f6820a;
    }

    @Override // p135d.InterfaceC2634e
    public T getValue() {
        T t;
        T t2 = (T) this.f6818g;
        if (t2 != C2641l.f6820a) {
            return t2;
        }
        synchronized (this.f6819h) {
            t = (T) this.f6818g;
            if (t == C2641l.f6820a) {
                InterfaceC2695a<? extends T> interfaceC2695a = this.f6817f;
                C2725g.m883c(interfaceC2695a);
                t = interfaceC2695a.invoke();
                this.f6818g = t;
                this.f6817f = null;
            }
        }
        return t;
    }

    public String toString() {
        return m972a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
