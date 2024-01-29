package p000a.p014d;
/* renamed from: a.d.h */
/* loaded from: classes.dex */
public class C0080h<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f252j = new Object();

    /* renamed from: f */
    private boolean f253f;

    /* renamed from: g */
    private int[] f254g;

    /* renamed from: h */
    private Object[] f255h;

    /* renamed from: i */
    private int f256i;

    public C0080h() {
        this(10);
    }

    public C0080h(int i) {
        this.f253f = false;
        if (i == 0) {
            this.f254g = C0070c.f214a;
            this.f255h = C0070c.f216c;
            return;
        }
        int m9385e = C0070c.m9385e(i);
        this.f254g = new int[m9385e];
        this.f255h = new Object[m9385e];
    }

    /* renamed from: d */
    private void m9326d() {
        int i = this.f256i;
        int[] iArr = this.f254g;
        Object[] objArr = this.f255h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f252j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f253f = false;
        this.f256i = i2;
    }

    /* renamed from: a */
    public void m9329a(int i, E e) {
        int i2 = this.f256i;
        if (i2 != 0 && i <= this.f254g[i2 - 1]) {
            m9321i(i, e);
            return;
        }
        if (this.f253f && this.f256i >= this.f254g.length) {
            m9326d();
        }
        int i3 = this.f256i;
        if (i3 >= this.f254g.length) {
            int m9385e = C0070c.m9385e(i3 + 1);
            int[] iArr = new int[m9385e];
            Object[] objArr = new Object[m9385e];
            int[] iArr2 = this.f254g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f255h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f254g = iArr;
            this.f255h = objArr;
        }
        this.f254g[i3] = i;
        this.f255h[i3] = e;
        this.f256i = i3 + 1;
    }

    /* renamed from: b */
    public void m9328b() {
        int i = this.f256i;
        Object[] objArr = this.f255h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f256i = 0;
        this.f253f = false;
    }

    /* renamed from: c */
    public C0080h<E> clone() {
        try {
            C0080h<E> c0080h = (C0080h) super.clone();
            c0080h.f254g = (int[]) this.f254g.clone();
            c0080h.f255h = (Object[]) this.f255h.clone();
            return c0080h;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E m9325e(int i) {
        return m9324f(i, null);
    }

    /* renamed from: f */
    public E m9324f(int i, E e) {
        int m9389a = C0070c.m9389a(this.f254g, this.f256i, i);
        if (m9389a >= 0) {
            Object[] objArr = this.f255h;
            if (objArr[m9389a] != f252j) {
                return (E) objArr[m9389a];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int m9323g(E e) {
        if (this.f253f) {
            m9326d();
        }
        for (int i = 0; i < this.f256i; i++) {
            if (this.f255h[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public int m9322h(int i) {
        if (this.f253f) {
            m9326d();
        }
        return this.f254g[i];
    }

    /* renamed from: i */
    public void m9321i(int i, E e) {
        int m9389a = C0070c.m9389a(this.f254g, this.f256i, i);
        if (m9389a >= 0) {
            this.f255h[m9389a] = e;
            return;
        }
        int i2 = ~m9389a;
        if (i2 < this.f256i) {
            Object[] objArr = this.f255h;
            if (objArr[i2] == f252j) {
                this.f254g[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f253f && this.f256i >= this.f254g.length) {
            m9326d();
            i2 = ~C0070c.m9389a(this.f254g, this.f256i, i);
        }
        int i3 = this.f256i;
        if (i3 >= this.f254g.length) {
            int m9385e = C0070c.m9385e(i3 + 1);
            int[] iArr = new int[m9385e];
            Object[] objArr2 = new Object[m9385e];
            int[] iArr2 = this.f254g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f255h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f254g = iArr;
            this.f255h = objArr2;
        }
        int i4 = this.f256i;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f254g;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f255h;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f256i - i2);
        }
        this.f254g[i2] = i;
        this.f255h[i2] = e;
        this.f256i++;
    }

    /* renamed from: j */
    public void m9320j(int i) {
        int m9389a = C0070c.m9389a(this.f254g, this.f256i, i);
        if (m9389a >= 0) {
            Object[] objArr = this.f255h;
            Object obj = objArr[m9389a];
            Object obj2 = f252j;
            if (obj != obj2) {
                objArr[m9389a] = obj2;
                this.f253f = true;
            }
        }
    }

    /* renamed from: k */
    public void m9319k(int i) {
        Object[] objArr = this.f255h;
        Object obj = objArr[i];
        Object obj2 = f252j;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f253f = true;
        }
    }

    /* renamed from: l */
    public int m9318l() {
        if (this.f253f) {
            m9326d();
        }
        return this.f256i;
    }

    /* renamed from: m */
    public E m9317m(int i) {
        if (this.f253f) {
            m9326d();
        }
        return (E) this.f255h[i];
    }

    public String toString() {
        if (m9318l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f256i * 28);
        sb.append('{');
        for (int i = 0; i < this.f256i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m9322h(i));
            sb.append('=');
            E m9317m = m9317m(i);
            if (m9317m != this) {
                sb.append(m9317m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
