package p135d.p147v;

import java.util.Iterator;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.v.i */
/* loaded from: classes.dex */
public final class C2756i<T, R> implements InterfaceC2749b<R> {

    /* renamed from: a */
    private final InterfaceC2749b<T> f6867a;

    /* renamed from: b */
    private final InterfaceC2706l<T, R> f6868b;

    /* renamed from: d.v.i$a */
    /* loaded from: classes.dex */
    public static final class C2757a implements Iterator<R> {

        /* renamed from: f */
        private final Iterator<T> f6869f;

        C2757a() {
            this.f6869f = C2756i.this.f6867a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6869f.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) C2756i.this.f6868b.mo776c(this.f6869f.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2756i(InterfaceC2749b<? extends T> interfaceC2749b, InterfaceC2706l<? super T, ? extends R> interfaceC2706l) {
        C2725g.m881e(interfaceC2749b, "sequence");
        C2725g.m881e(interfaceC2706l, "transformer");
        this.f6867a = interfaceC2749b;
        this.f6868b = interfaceC2706l;
    }

    @Override // p135d.p147v.InterfaceC2749b
    public Iterator<R> iterator() {
        return new C2757a();
    }
}
