package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.j0 */
/* loaded from: classes.dex */
final class C1215j0 extends AbstractC1253w<Object> {

    /* renamed from: h */
    private final transient Object[] f3953h;

    /* renamed from: i */
    private final transient int f3954i;

    /* renamed from: j */
    private final transient int f3955j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1215j0(Object[] objArr, int i, int i2) {
        this.f3953h = objArr;
        this.f3954i = i;
        this.f3955j = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C1223m.m4699a(i, this.f3955j);
        return this.f3953h[(i * 2) + this.f3954i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3955j;
    }
}
