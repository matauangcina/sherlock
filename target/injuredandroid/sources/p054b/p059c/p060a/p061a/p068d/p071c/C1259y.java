package p054b.p059c.p060a.p061a.p068d.p071c;
/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: b.c.a.a.d.c.y */
/* loaded from: classes.dex */
final class C1259y<E> extends AbstractC1253w<E> {

    /* renamed from: h */
    private final transient int f4023h;

    /* renamed from: i */
    private final transient int f4024i;

    /* renamed from: j */
    private final /* synthetic */ AbstractC1253w f4025j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1259y(AbstractC1253w abstractC1253w, int i, int i2) {
        this.f4025j = abstractC1253w;
        this.f4023h = i;
        this.f4024i = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: f */
    public final Object[] mo4639f() {
        return this.f4025j.mo4639f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: g */
    public final int mo4638g() {
        return this.f4025j.mo4638g() + this.f4023h;
    }

    @Override // java.util.List
    public final E get(int i) {
        C1223m.m4699a(i, this.f4024i);
        return this.f4025j.get(i + this.f4023h);
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: i */
    final int mo4637i() {
        return this.f4025j.mo4638g() + this.f4023h + this.f4024i;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1253w, java.util.List
    /* renamed from: m */
    public final AbstractC1253w<E> subList(int i, int i2) {
        C1223m.m4696d(i, i2, this.f4024i);
        AbstractC1253w abstractC1253w = this.f4025j;
        int i3 = this.f4023h;
        return (AbstractC1253w) abstractC1253w.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4024i;
    }
}
