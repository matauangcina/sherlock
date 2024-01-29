package p000a.p014d;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* renamed from: a.d.g */
/* loaded from: classes.dex */
public class C0079g<K, V> {

    /* renamed from: i */
    static Object[] f245i;

    /* renamed from: j */
    static int f246j;

    /* renamed from: k */
    static Object[] f247k;

    /* renamed from: l */
    static int f248l;

    /* renamed from: f */
    int[] f249f;

    /* renamed from: g */
    Object[] f250g;

    /* renamed from: h */
    int f251h;

    public C0079g() {
        this.f249f = C0070c.f214a;
        this.f250g = C0070c.f216c;
        this.f251h = 0;
    }

    public C0079g(int i) {
        if (i == 0) {
            this.f249f = C0070c.f214a;
            this.f250g = C0070c.f216c;
        } else {
            m9342a(i);
        }
        this.f251h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0079g(C0079g<K, V> c0079g) {
        this();
        if (c0079g != 0) {
            m9333j(c0079g);
        }
    }

    /* renamed from: a */
    private void m9342a(int i) {
        if (i == 8) {
            synchronized (C0079g.class) {
                if (f247k != null) {
                    Object[] objArr = f247k;
                    this.f250g = objArr;
                    f247k = (Object[]) objArr[0];
                    this.f249f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f248l--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0079g.class) {
                if (f245i != null) {
                    Object[] objArr2 = f245i;
                    this.f250g = objArr2;
                    f245i = (Object[]) objArr2[0];
                    this.f249f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f246j--;
                    return;
                }
            }
        }
        this.f249f = new int[i];
        this.f250g = new Object[i << 1];
    }

    /* renamed from: b */
    private static int m9341b(int[] iArr, int i, int i2) {
        try {
            return C0070c.m9389a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m9339d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0079g.class) {
                if (f248l < 10) {
                    objArr[0] = f247k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f247k = objArr;
                    f248l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0079g.class) {
                if (f246j < 10) {
                    objArr[0] = f245i;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f245i = objArr;
                    f246j++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m9340c(int i) {
        int i2 = this.f251h;
        int[] iArr = this.f249f;
        if (iArr.length < i) {
            Object[] objArr = this.f250g;
            m9342a(i);
            if (this.f251h > 0) {
                System.arraycopy(iArr, 0, this.f249f, 0, i2);
                System.arraycopy(objArr, 0, this.f250g, 0, i2 << 1);
            }
            m9339d(iArr, objArr, i2);
        }
        if (this.f251h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f251h;
        if (i > 0) {
            int[] iArr = this.f249f;
            Object[] objArr = this.f250g;
            this.f249f = C0070c.f214a;
            this.f250g = C0070c.f216c;
            this.f251h = 0;
            m9339d(iArr, objArr, i);
        }
        if (this.f251h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m9337f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m9335h(obj) >= 0;
    }

    /* renamed from: e */
    int m9338e(Object obj, int i) {
        int i2 = this.f251h;
        if (i2 == 0) {
            return -1;
        }
        int m9341b = m9341b(this.f249f, i2, i);
        if (m9341b >= 0 && !obj.equals(this.f250g[m9341b << 1])) {
            int i3 = m9341b + 1;
            while (i3 < i2 && this.f249f[i3] == i) {
                if (obj.equals(this.f250g[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m9341b - 1; i4 >= 0 && this.f249f[i4] == i; i4--) {
                if (obj.equals(this.f250g[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return m9341b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0079g) {
            C0079g c0079g = (C0079g) obj;
            if (size() != c0079g.size()) {
                return false;
            }
            for (int i = 0; i < this.f251h; i++) {
                try {
                    K m9334i = m9334i(i);
                    V m9330m = m9330m(i);
                    Object obj2 = c0079g.get(m9334i);
                    if (m9330m == null) {
                        if (obj2 != null || !c0079g.containsKey(m9334i)) {
                            return false;
                        }
                    } else if (!m9330m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f251h; i2++) {
                try {
                    K m9334i2 = m9334i(i2);
                    V m9330m2 = m9330m(i2);
                    Object obj3 = map.get(m9334i2);
                    if (m9330m2 == null) {
                        if (obj3 != null || !map.containsKey(m9334i2)) {
                            return false;
                        }
                    } else if (!m9330m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m9337f(Object obj) {
        return obj == null ? m9336g() : m9338e(obj, obj.hashCode());
    }

    /* renamed from: g */
    int m9336g() {
        int i = this.f251h;
        if (i == 0) {
            return -1;
        }
        int m9341b = m9341b(this.f249f, i, 0);
        if (m9341b >= 0 && this.f250g[m9341b << 1] != null) {
            int i2 = m9341b + 1;
            while (i2 < i && this.f249f[i2] == 0) {
                if (this.f250g[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m9341b - 1; i3 >= 0 && this.f249f[i3] == 0; i3--) {
                if (this.f250g[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return m9341b;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m9337f = m9337f(obj);
        return m9337f >= 0 ? (V) this.f250g[(m9337f << 1) + 1] : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m9335h(Object obj) {
        int i = this.f251h * 2;
        Object[] objArr = this.f250g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f249f;
        Object[] objArr = this.f250g;
        int i = this.f251h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K m9334i(int i) {
        return (K) this.f250g[i << 1];
    }

    public boolean isEmpty() {
        return this.f251h <= 0;
    }

    /* renamed from: j */
    public void m9333j(C0079g<? extends K, ? extends V> c0079g) {
        int i = c0079g.f251h;
        m9340c(this.f251h + i);
        if (this.f251h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0079g.m9334i(i2), c0079g.m9330m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c0079g.f249f, 0, this.f249f, 0, i);
            System.arraycopy(c0079g.f250g, 0, this.f250g, 0, i << 1);
            this.f251h = i;
        }
    }

    /* renamed from: k */
    public V m9332k(int i) {
        Object[] objArr = this.f250g;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f251h;
        int i4 = 0;
        if (i3 <= 1) {
            m9339d(this.f249f, objArr, i3);
            this.f249f = C0070c.f214a;
            this.f250g = C0070c.f216c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f249f;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f249f;
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f250g;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f250g;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.f249f;
                Object[] objArr4 = this.f250g;
                m9342a(i9);
                if (i3 != this.f251h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f249f, 0, i);
                    System.arraycopy(objArr4, 0, this.f250g, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.f249f, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.f250g, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f251h) {
            this.f251h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V m9331l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f250g;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V m9330m(int i) {
        return (V) this.f250g[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int m9338e;
        int i2 = this.f251h;
        if (k == null) {
            m9338e = m9336g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m9338e = m9338e(k, hashCode);
        }
        if (m9338e >= 0) {
            int i3 = (m9338e << 1) + 1;
            Object[] objArr = this.f250g;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~m9338e;
        if (i2 >= this.f249f.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f249f;
            Object[] objArr2 = this.f250g;
            m9342a(i5);
            if (i2 != this.f251h) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f249f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f250g, 0, objArr2.length);
            }
            m9339d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f249f;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f250g;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f251h - i4) << 1);
        }
        int i7 = this.f251h;
        if (i2 == i7) {
            int[] iArr4 = this.f249f;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f250g;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f251h = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int m9337f = m9337f(obj);
        if (m9337f >= 0) {
            return m9332k(m9337f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m9337f = m9337f(obj);
        if (m9337f >= 0) {
            V m9330m = m9330m(m9337f);
            if (obj2 == m9330m || (obj2 != null && obj2.equals(m9330m))) {
                m9332k(m9337f);
                return true;
            }
            return false;
        }
        return false;
    }

    public V replace(K k, V v) {
        int m9337f = m9337f(k);
        if (m9337f >= 0) {
            return m9331l(m9337f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int m9337f = m9337f(k);
        if (m9337f >= 0) {
            V m9330m = m9330m(m9337f);
            if (m9330m == v || (v != null && v.equals(m9330m))) {
                m9331l(m9337f, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.f251h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f251h * 28);
        sb.append('{');
        for (int i = 0; i < this.f251h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m9334i = m9334i(i);
            if (m9334i != this) {
                sb.append(m9334i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m9330m = m9330m(i);
            if (m9330m != this) {
                sb.append(m9330m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
