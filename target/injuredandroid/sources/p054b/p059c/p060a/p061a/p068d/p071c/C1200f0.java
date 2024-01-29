package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.d.c.f0 */
/* loaded from: classes.dex */
public final class C1200f0<K, V> extends AbstractC1184b0<K, V> {

    /* renamed from: l */
    static final AbstractC1184b0<Object, Object> f3932l = new C1200f0(null, new Object[0], 0);

    /* renamed from: i */
    private final transient Object f3933i;

    /* renamed from: j */
    private final transient Object[] f3934j;

    /* renamed from: k */
    private final transient int f3935k;

    private C1200f0(Object obj, Object[] objArr, int i) {
        this.f3933i = obj;
        this.f3934j = objArr;
        this.f3935k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
        r2[r7] = r4;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> p054b.p059c.p060a.p061a.p068d.p071c.C1200f0<K, V> m4718e(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p054b.p059c.p060a.p061a.p068d.p071c.C1200f0.m4718e(int, java.lang.Object[]):b.c.a.a.d.c.f0");
    }

    /* renamed from: f */
    private static IllegalArgumentException m4717f(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1184b0
    /* renamed from: b */
    final AbstractC1192d0<Map.Entry<K, V>> mo4721b() {
        return new C1196e0(this, this.f3934j, 0, this.f3935k);
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1184b0
    /* renamed from: c */
    final AbstractC1192d0<K> mo4720c() {
        return new C1204g0(this, new C1215j0(this.f3934j, 0, this.f3935k));
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1184b0
    /* renamed from: d */
    final AbstractC1256x<V> mo4719d() {
        return new C1215j0(this.f3934j, 1, this.f3935k);
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1184b0, java.util.Map
    public final V get(Object obj) {
        Object obj2 = this.f3933i;
        Object[] objArr = this.f3934j;
        int i = this.f3935k;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int m4659a = C1247u.m4659a(obj.hashCode());
                while (true) {
                    int i2 = m4659a & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    m4659a = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int m4659a2 = C1247u.m4659a(obj.hashCode());
                while (true) {
                    int i4 = m4659a2 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    m4659a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int m4659a3 = C1247u.m4659a(obj.hashCode());
                while (true) {
                    int i6 = m4659a3 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    m4659a3 = i6 + 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3935k;
    }
}
