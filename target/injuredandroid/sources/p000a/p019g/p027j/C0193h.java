package p000a.p019g.p027j;
/* renamed from: a.g.j.h */
/* loaded from: classes.dex */
public class C0193h<T> extends C0192g<T> {

    /* renamed from: c */
    private final Object f646c;

    public C0193h(int i) {
        super(i);
        this.f646c = new Object();
    }

    @Override // p000a.p019g.p027j.C0192g, p000a.p019g.p027j.InterfaceC0191f
    /* renamed from: a */
    public boolean mo8870a(T t) {
        boolean mo8870a;
        synchronized (this.f646c) {
            mo8870a = super.mo8870a(t);
        }
        return mo8870a;
    }

    @Override // p000a.p019g.p027j.C0192g, p000a.p019g.p027j.InterfaceC0191f
    /* renamed from: b */
    public T mo8869b() {
        T t;
        synchronized (this.f646c) {
            t = (T) super.mo8869b();
        }
        return t;
    }
}
