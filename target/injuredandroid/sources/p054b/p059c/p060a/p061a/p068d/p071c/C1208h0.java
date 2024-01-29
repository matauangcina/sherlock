package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.AbstractMap;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: b.c.a.a.d.c.h0 */
/* loaded from: classes.dex */
final class C1208h0<K, V> extends AbstractC1253w<Map.Entry<K, V>> {

    /* renamed from: h */
    private final /* synthetic */ C1196e0 f3947h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1208h0(C1196e0 c1196e0) {
        this.f3947h = c1196e0;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f3947h.f3930j;
        C1223m.m4699a(i, i2);
        objArr = this.f3947h.f3929i;
        int i3 = i * 2;
        C1196e0 c1196e0 = this.f3947h;
        Object obj = objArr[i3];
        objArr2 = c1196e0.f3929i;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f3947h.f3930j;
        return i;
    }
}
