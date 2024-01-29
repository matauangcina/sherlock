package p135d.p137p;

import java.io.Serializable;
import p135d.p137p.InterfaceC2676d;
import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p144d.AbstractC2726h;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.p.b */
/* loaded from: classes.dex */
public final class C2672b implements InterfaceC2676d, Serializable {

    /* renamed from: f */
    private final InterfaceC2676d f6826f;

    /* renamed from: g */
    private final InterfaceC2676d.InterfaceC2679b f6827g;

    /* renamed from: d.p.b$a */
    /* loaded from: classes.dex */
    static final class C2673a extends AbstractC2726h implements InterfaceC2710p<String, InterfaceC2676d.InterfaceC2679b, String> {

        /* renamed from: f */
        public static final C2673a f6828f = new C2673a();

        C2673a() {
            super(2);
        }

        @Override // p135d.p142s.p143c.InterfaceC2710p
        /* renamed from: d */
        public final String mo778a(String str, InterfaceC2676d.InterfaceC2679b interfaceC2679b) {
            C2725g.m881e(str, "acc");
            C2725g.m881e(interfaceC2679b, "element");
            if (str.length() == 0) {
                return interfaceC2679b.toString();
            }
            return str + ", " + interfaceC2679b;
        }
    }

    public C2672b(InterfaceC2676d interfaceC2676d, InterfaceC2676d.InterfaceC2679b interfaceC2679b) {
        C2725g.m881e(interfaceC2676d, "left");
        C2725g.m881e(interfaceC2679b, "element");
        this.f6826f = interfaceC2676d;
        this.f6827g = interfaceC2679b;
    }

    /* renamed from: b */
    private final boolean m914b(InterfaceC2676d.InterfaceC2679b interfaceC2679b) {
        return C2725g.m885a(get(interfaceC2679b.getKey()), interfaceC2679b);
    }

    /* renamed from: c */
    private final boolean m913c(C2672b c2672b) {
        while (m914b(c2672b.f6827g)) {
            InterfaceC2676d interfaceC2676d = c2672b.f6826f;
            if (!(interfaceC2676d instanceof C2672b)) {
                if (interfaceC2676d != null) {
                    return m914b((InterfaceC2676d.InterfaceC2679b) interfaceC2676d);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
            c2672b = (C2672b) interfaceC2676d;
        }
        return false;
    }

    /* renamed from: d */
    private final int m912d() {
        int i = 2;
        C2672b c2672b = this;
        while (true) {
            InterfaceC2676d interfaceC2676d = c2672b.f6826f;
            if (!(interfaceC2676d instanceof C2672b)) {
                interfaceC2676d = null;
            }
            c2672b = (C2672b) interfaceC2676d;
            if (c2672b == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2672b) {
                C2672b c2672b = (C2672b) obj;
                if (c2672b.m912d() != m912d() || !c2672b.m913c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p135d.p137p.InterfaceC2676d
    public <R> R fold(R r, InterfaceC2710p<? super R, ? super InterfaceC2676d.InterfaceC2679b, ? extends R> interfaceC2710p) {
        C2725g.m881e(interfaceC2710p, "operation");
        return interfaceC2710p.mo778a((Object) this.f6826f.fold(r, interfaceC2710p), this.f6827g);
    }

    @Override // p135d.p137p.InterfaceC2676d
    public <E extends InterfaceC2676d.InterfaceC2679b> E get(InterfaceC2676d.InterfaceC2681c<E> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        C2672b c2672b = this;
        while (true) {
            E e = (E) c2672b.f6827g.get(interfaceC2681c);
            if (e != null) {
                return e;
            }
            InterfaceC2676d interfaceC2676d = c2672b.f6826f;
            if (!(interfaceC2676d instanceof C2672b)) {
                return (E) interfaceC2676d.get(interfaceC2681c);
            }
            c2672b = (C2672b) interfaceC2676d;
        }
    }

    public int hashCode() {
        return this.f6826f.hashCode() + this.f6827g.hashCode();
    }

    @Override // p135d.p137p.InterfaceC2676d
    public InterfaceC2676d minusKey(InterfaceC2676d.InterfaceC2681c<?> interfaceC2681c) {
        C2725g.m881e(interfaceC2681c, "key");
        if (this.f6827g.get(interfaceC2681c) != null) {
            return this.f6826f;
        }
        InterfaceC2676d minusKey = this.f6826f.minusKey(interfaceC2681c);
        return minusKey == this.f6826f ? this : minusKey == C2682e.f6832f ? this.f6827g : new C2672b(minusKey, this.f6827g);
    }

    public String toString() {
        return "[" + ((String) fold("", C2673a.f6828f)) + "]";
    }
}
