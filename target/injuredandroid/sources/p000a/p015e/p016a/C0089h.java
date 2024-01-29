package p000a.p015e.p016a;
/* renamed from: a.e.a.h */
/* loaded from: classes.dex */
class C0089h<T> implements InterfaceC0088g<T> {

    /* renamed from: a */
    private final Object[] f320a;

    /* renamed from: b */
    private int f321b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0089h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f320a = new Object[i];
    }

    @Override // p000a.p015e.p016a.InterfaceC0088g
    /* renamed from: a */
    public boolean mo9245a(T t) {
        int i = this.f321b;
        Object[] objArr = this.f320a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f321b = i + 1;
            return true;
        }
        return false;
    }

    @Override // p000a.p015e.p016a.InterfaceC0088g
    /* renamed from: b */
    public T mo9244b() {
        int i = this.f321b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f320a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f321b = i - 1;
            return t;
        }
        return null;
    }

    @Override // p000a.p015e.p016a.InterfaceC0088g
    /* renamed from: c */
    public void mo9243c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f321b;
            Object[] objArr = this.f320a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f321b = i3 + 1;
            }
        }
    }
}
