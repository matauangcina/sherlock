package p135d.p145t;

import p135d.p136o.AbstractC2666v;
import p135d.p138q.C2686c;
import p135d.p142s.p144d.C2723e;
/* renamed from: d.t.a */
/* loaded from: classes.dex */
public class C2734a implements Iterable<Integer> {

    /* renamed from: i */
    public static final C2735a f6856i = new C2735a(null);

    /* renamed from: f */
    private final int f6857f;

    /* renamed from: g */
    private final int f6858g;

    /* renamed from: h */
    private final int f6859h;

    /* renamed from: d.t.a$a */
    /* loaded from: classes.dex */
    public static final class C2735a {
        private C2735a() {
        }

        public /* synthetic */ C2735a(C2723e c2723e) {
            this();
        }

        /* renamed from: a */
        public final C2734a m854a(int i, int i2, int i3) {
            return new C2734a(i, i2, i3);
        }
    }

    public C2734a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6857f = i;
        this.f6858g = C2686c.m902b(i, i2, i3);
        this.f6859h = i3;
    }

    /* renamed from: d */
    public final int m858d() {
        return this.f6857f;
    }

    /* renamed from: e */
    public final int m857e() {
        return this.f6858g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2734a) {
            if (!isEmpty() || !((C2734a) obj).isEmpty()) {
                C2734a c2734a = (C2734a) obj;
                if (this.f6857f != c2734a.f6857f || this.f6858g != c2734a.f6858g || this.f6859h != c2734a.f6859h) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m856f() {
        return this.f6859h;
    }

    @Override // java.lang.Iterable
    /* renamed from: g */
    public AbstractC2666v iterator() {
        return new C2736b(this.f6857f, this.f6858g, this.f6859h);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6857f * 31) + this.f6858g) * 31) + this.f6859h;
    }

    public boolean isEmpty() {
        if (this.f6859h > 0) {
            if (this.f6857f > this.f6858g) {
                return true;
            }
        } else if (this.f6857f < this.f6858g) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f6859h > 0) {
            sb = new StringBuilder();
            sb.append(this.f6857f);
            sb.append("..");
            sb.append(this.f6858g);
            sb.append(" step ");
            i = this.f6859h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f6857f);
            sb.append(" downTo ");
            sb.append(this.f6858g);
            sb.append(" step ");
            i = -this.f6859h;
        }
        sb.append(i);
        return sb.toString();
    }
}
