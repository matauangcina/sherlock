package p054b.p059c.p060a.p061a.p068d.p071c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.d.c.c0 */
/* loaded from: classes.dex */
public final class C1188c0<E> extends AbstractC1253w<E> {

    /* renamed from: j */
    static final AbstractC1253w<Object> f3917j = new C1188c0(new Object[0], 0);

    /* renamed from: h */
    private final transient Object[] f3918h;

    /* renamed from: i */
    private final transient int f3919i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1188c0(Object[] objArr, int i) {
        this.f3918h = objArr;
        this.f3919i = i;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1253w, p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: d */
    final int mo4641d(Object[] objArr, int i) {
        System.arraycopy(this.f3918h, 0, objArr, i, this.f3919i);
        return i + this.f3919i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: f */
    public final Object[] mo4639f() {
        return this.f3918h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: g */
    public final int mo4638g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C1223m.m4699a(i, this.f3919i);
        return (E) this.f3918h[i];
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: i */
    final int mo4637i() {
        return this.f3919i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3919i;
    }
}
