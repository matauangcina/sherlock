package p000a.p014d;
/* renamed from: a.d.d */
/* loaded from: classes.dex */
public class C0071d<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f217j = new Object();

    /* renamed from: f */
    private boolean f218f;

    /* renamed from: g */
    private long[] f219g;

    /* renamed from: h */
    private Object[] f220h;

    /* renamed from: i */
    private int f221i;

    public C0071d() {
        this(10);
    }

    public C0071d(int i) {
        this.f218f = false;
        if (i == 0) {
            this.f219g = C0070c.f215b;
            this.f220h = C0070c.f216c;
            return;
        }
        int m9384f = C0070c.m9384f(i);
        this.f219g = new long[m9384f];
        this.f220h = new Object[m9384f];
    }

    /* renamed from: e */
    private void m9379e() {
        int i = this.f221i;
        long[] jArr = this.f219g;
        Object[] objArr = this.f220h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f217j) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f218f = false;
        this.f221i = i2;
    }

    /* renamed from: a */
    public void m9383a(long j, E e) {
        int i = this.f221i;
        if (i != 0 && j <= this.f219g[i - 1]) {
            m9374j(j, e);
            return;
        }
        if (this.f218f && this.f221i >= this.f219g.length) {
            m9379e();
        }
        int i2 = this.f221i;
        if (i2 >= this.f219g.length) {
            int m9384f = C0070c.m9384f(i2 + 1);
            long[] jArr = new long[m9384f];
            Object[] objArr = new Object[m9384f];
            long[] jArr2 = this.f219g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f220h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f219g = jArr;
            this.f220h = objArr;
        }
        this.f219g[i2] = j;
        this.f220h[i2] = e;
        this.f221i = i2 + 1;
    }

    /* renamed from: b */
    public void m9382b() {
        int i = this.f221i;
        Object[] objArr = this.f220h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f221i = 0;
        this.f218f = false;
    }

    /* renamed from: c */
    public C0071d<E> clone() {
        try {
            C0071d<E> c0071d = (C0071d) super.clone();
            c0071d.f219g = (long[]) this.f219g.clone();
            c0071d.f220h = (Object[]) this.f220h.clone();
            return c0071d;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Deprecated
    /* renamed from: d */
    public void m9380d(long j) {
        m9373k(j);
    }

    /* renamed from: f */
    public E m9378f(long j) {
        return m9377g(j, null);
    }

    /* renamed from: g */
    public E m9377g(long j, E e) {
        int m9388b = C0070c.m9388b(this.f219g, this.f221i, j);
        if (m9388b >= 0) {
            Object[] objArr = this.f220h;
            if (objArr[m9388b] != f217j) {
                return (E) objArr[m9388b];
            }
        }
        return e;
    }

    /* renamed from: h */
    public int m9376h(long j) {
        if (this.f218f) {
            m9379e();
        }
        return C0070c.m9388b(this.f219g, this.f221i, j);
    }

    /* renamed from: i */
    public long m9375i(int i) {
        if (this.f218f) {
            m9379e();
        }
        return this.f219g[i];
    }

    /* renamed from: j */
    public void m9374j(long j, E e) {
        int m9388b = C0070c.m9388b(this.f219g, this.f221i, j);
        if (m9388b >= 0) {
            this.f220h[m9388b] = e;
            return;
        }
        int i = ~m9388b;
        if (i < this.f221i) {
            Object[] objArr = this.f220h;
            if (objArr[i] == f217j) {
                this.f219g[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f218f && this.f221i >= this.f219g.length) {
            m9379e();
            i = ~C0070c.m9388b(this.f219g, this.f221i, j);
        }
        int i2 = this.f221i;
        if (i2 >= this.f219g.length) {
            int m9384f = C0070c.m9384f(i2 + 1);
            long[] jArr = new long[m9384f];
            Object[] objArr2 = new Object[m9384f];
            long[] jArr2 = this.f219g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f220h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f219g = jArr;
            this.f220h = objArr2;
        }
        int i3 = this.f221i;
        if (i3 - i != 0) {
            long[] jArr3 = this.f219g;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f220h;
            System.arraycopy(objArr4, i, objArr4, i4, this.f221i - i);
        }
        this.f219g[i] = j;
        this.f220h[i] = e;
        this.f221i++;
    }

    /* renamed from: k */
    public void m9373k(long j) {
        int m9388b = C0070c.m9388b(this.f219g, this.f221i, j);
        if (m9388b >= 0) {
            Object[] objArr = this.f220h;
            Object obj = objArr[m9388b];
            Object obj2 = f217j;
            if (obj != obj2) {
                objArr[m9388b] = obj2;
                this.f218f = true;
            }
        }
    }

    /* renamed from: l */
    public void m9372l(int i) {
        Object[] objArr = this.f220h;
        Object obj = objArr[i];
        Object obj2 = f217j;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f218f = true;
        }
    }

    /* renamed from: m */
    public int m9371m() {
        if (this.f218f) {
            m9379e();
        }
        return this.f221i;
    }

    /* renamed from: n */
    public E m9370n(int i) {
        if (this.f218f) {
            m9379e();
        }
        return (E) this.f220h[i];
    }

    public String toString() {
        if (m9371m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f221i * 28);
        sb.append('{');
        for (int i = 0; i < this.f221i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m9375i(i));
            sb.append('=');
            E m9370n = m9370n(i);
            if (m9370n != this) {
                sb.append(m9370n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
