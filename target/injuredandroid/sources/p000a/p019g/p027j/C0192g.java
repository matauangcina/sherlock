package p000a.p019g.p027j;
/* renamed from: a.g.j.g */
/* loaded from: classes.dex */
public class C0192g<T> implements InterfaceC0191f<T> {

    /* renamed from: a */
    private final Object[] f644a;

    /* renamed from: b */
    private int f645b;

    public C0192g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f644a = new Object[i];
    }

    /* renamed from: c */
    private boolean m8871c(T t) {
        for (int i = 0; i < this.f645b; i++) {
            if (this.f644a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // p000a.p019g.p027j.InterfaceC0191f
    /* renamed from: a */
    public boolean mo8870a(T t) {
        if (m8871c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f645b;
        Object[] objArr = this.f644a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f645b = i + 1;
            return true;
        }
        return false;
    }

    @Override // p000a.p019g.p027j.InterfaceC0191f
    /* renamed from: b */
    public T mo8869b() {
        int i = this.f645b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f644a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f645b = i - 1;
            return t;
        }
        return null;
    }
}
