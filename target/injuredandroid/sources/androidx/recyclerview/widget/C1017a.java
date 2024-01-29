package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1046i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.p019g.p027j.C0192g;
import p000a.p019g.p027j.InterfaceC0191f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C1017a implements C1046i.InterfaceC1047a {

    /* renamed from: a */
    private InterfaceC0191f<C1019b> f3523a;

    /* renamed from: b */
    final ArrayList<C1019b> f3524b;

    /* renamed from: c */
    final ArrayList<C1019b> f3525c;

    /* renamed from: d */
    final InterfaceC1018a f3526d;

    /* renamed from: e */
    Runnable f3527e;

    /* renamed from: f */
    final boolean f3528f;

    /* renamed from: g */
    final C1046i f3529g;

    /* renamed from: h */
    private int f3530h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1018a {
        /* renamed from: a */
        void mo5301a(int i, int i2);

        /* renamed from: b */
        void mo5300b(C1019b c1019b);

        /* renamed from: c */
        RecyclerView.AbstractC0974d0 mo5299c(int i);

        /* renamed from: d */
        void mo5298d(int i, int i2);

        /* renamed from: e */
        void mo5297e(int i, int i2);

        /* renamed from: f */
        void mo5296f(int i, int i2);

        /* renamed from: g */
        void mo5295g(C1019b c1019b);

        /* renamed from: h */
        void mo5294h(int i, int i2, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static class C1019b {

        /* renamed from: a */
        int f3531a;

        /* renamed from: b */
        int f3532b;

        /* renamed from: c */
        Object f3533c;

        /* renamed from: d */
        int f3534d;

        C1019b(int i, int i2, int i3, Object obj) {
            this.f3531a = i;
            this.f3532b = i2;
            this.f3534d = i3;
            this.f3533c = obj;
        }

        /* renamed from: a */
        String m5293a() {
            int i = this.f3531a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1019b.class != obj.getClass()) {
                return false;
            }
            C1019b c1019b = (C1019b) obj;
            int i = this.f3531a;
            if (i != c1019b.f3531a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3534d - this.f3532b) == 1 && this.f3534d == c1019b.f3532b && this.f3532b == c1019b.f3534d) {
                return true;
            }
            if (this.f3534d == c1019b.f3534d && this.f3532b == c1019b.f3532b) {
                Object obj2 = this.f3533c;
                Object obj3 = c1019b.f3533c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f3531a * 31) + this.f3532b) * 31) + this.f3534d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m5293a() + ",s:" + this.f3532b + "c:" + this.f3534d + ",p:" + this.f3533c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1017a(InterfaceC1018a interfaceC1018a) {
        this(interfaceC1018a, false);
    }

    C1017a(InterfaceC1018a interfaceC1018a, boolean z) {
        this.f3523a = new C0192g(30);
        this.f3524b = new ArrayList<>();
        this.f3525c = new ArrayList<>();
        this.f3530h = 0;
        this.f3526d = interfaceC1018a;
        this.f3528f = z;
        this.f3529g = new C1046i(this);
    }

    /* renamed from: c */
    private void m5321c(C1019b c1019b) {
        m5306r(c1019b);
    }

    /* renamed from: d */
    private void m5320d(C1019b c1019b) {
        m5306r(c1019b);
    }

    /* renamed from: f */
    private void m5318f(C1019b c1019b) {
        boolean z;
        char c;
        int i = c1019b.f3532b;
        int i2 = c1019b.f3534d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3526d.mo5299c(i3) != null || m5316h(i3)) {
                if (c2 == 0) {
                    m5313k(mo5169b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m5306r(mo5169b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c1019b.f3534d) {
            mo5170a(c1019b);
            c1019b = mo5169b(2, i, i4, null);
        }
        if (c2 == 0) {
            m5313k(c1019b);
        } else {
            m5306r(c1019b);
        }
    }

    /* renamed from: g */
    private void m5317g(C1019b c1019b) {
        int i = c1019b.f3532b;
        int i2 = c1019b.f3534d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3526d.mo5299c(i) != null || m5316h(i)) {
                if (c == 0) {
                    m5313k(mo5169b(4, i3, i4, c1019b.f3533c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m5306r(mo5169b(4, i3, i4, c1019b.f3533c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != c1019b.f3534d) {
            Object obj = c1019b.f3533c;
            mo5170a(c1019b);
            c1019b = mo5169b(4, i3, i4, obj);
        }
        if (c == 0) {
            m5313k(c1019b);
        } else {
            m5306r(c1019b);
        }
    }

    /* renamed from: h */
    private boolean m5316h(int i) {
        int size = this.f3525c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1019b c1019b = this.f3525c.get(i2);
            int i3 = c1019b.f3531a;
            if (i3 == 8) {
                if (m5310n(c1019b.f3534d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1019b.f3532b;
                int i5 = c1019b.f3534d + i4;
                while (i4 < i5) {
                    if (m5310n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m5313k(C1019b c1019b) {
        int i;
        int i2 = c1019b.f3531a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m5302v = m5302v(c1019b.f3532b, i2);
        int i3 = c1019b.f3532b;
        int i4 = c1019b.f3531a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + c1019b);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c1019b.f3534d; i6++) {
            int m5302v2 = m5302v(c1019b.f3532b + (i * i6), c1019b.f3531a);
            int i7 = c1019b.f3531a;
            if (i7 == 2 ? m5302v2 == m5302v : i7 == 4 && m5302v2 == m5302v + 1) {
                i5++;
            } else {
                C1019b mo5169b = mo5169b(c1019b.f3531a, m5302v, i5, c1019b.f3533c);
                m5312l(mo5169b, i3);
                mo5170a(mo5169b);
                if (c1019b.f3531a == 4) {
                    i3 += i5;
                }
                m5302v = m5302v2;
                i5 = 1;
            }
        }
        Object obj = c1019b.f3533c;
        mo5170a(c1019b);
        if (i5 > 0) {
            C1019b mo5169b2 = mo5169b(c1019b.f3531a, m5302v, i5, obj);
            m5312l(mo5169b2, i3);
            mo5170a(mo5169b2);
        }
    }

    /* renamed from: r */
    private void m5306r(C1019b c1019b) {
        this.f3525c.add(c1019b);
        int i = c1019b.f3531a;
        if (i == 1) {
            this.f3526d.mo5297e(c1019b.f3532b, c1019b.f3534d);
        } else if (i == 2) {
            this.f3526d.mo5298d(c1019b.f3532b, c1019b.f3534d);
        } else if (i == 4) {
            this.f3526d.mo5294h(c1019b.f3532b, c1019b.f3534d, c1019b.f3533c);
        } else if (i == 8) {
            this.f3526d.mo5301a(c1019b.f3532b, c1019b.f3534d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1019b);
        }
    }

    /* renamed from: v */
    private int m5302v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f3525c.size() - 1; size >= 0; size--) {
            C1019b c1019b = this.f3525c.get(size);
            int i7 = c1019b.f3531a;
            if (i7 == 8) {
                int i8 = c1019b.f3532b;
                int i9 = c1019b.f3534d;
                if (i8 >= i9) {
                    i9 = i8;
                    i8 = i9;
                }
                if (i < i8 || i > i9) {
                    int i10 = c1019b.f3532b;
                    if (i < i10) {
                        if (i2 == 1) {
                            c1019b.f3532b = i10 + 1;
                            i4 = c1019b.f3534d + 1;
                        } else if (i2 == 2) {
                            c1019b.f3532b = i10 - 1;
                            i4 = c1019b.f3534d - 1;
                        }
                        c1019b.f3534d = i4;
                    }
                } else {
                    int i11 = c1019b.f3532b;
                    if (i8 == i11) {
                        if (i2 == 1) {
                            i6 = c1019b.f3534d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = c1019b.f3534d - 1;
                            }
                            i++;
                        }
                        c1019b.f3534d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i11 - 1;
                            }
                            i--;
                        }
                        c1019b.f3532b = i5;
                        i--;
                    }
                }
            } else {
                int i12 = c1019b.f3532b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c1019b.f3532b = i3;
                } else if (i7 == 1) {
                    i -= c1019b.f3534d;
                } else if (i7 == 2) {
                    i += c1019b.f3534d;
                }
            }
        }
        for (int size2 = this.f3525c.size() - 1; size2 >= 0; size2--) {
            C1019b c1019b2 = this.f3525c.get(size2);
            if (c1019b2.f3531a == 8) {
                int i13 = c1019b2.f3534d;
                if (i13 != c1019b2.f3532b && i13 >= 0) {
                }
                this.f3525c.remove(size2);
                mo5170a(c1019b2);
            } else {
                if (c1019b2.f3534d > 0) {
                }
                this.f3525c.remove(size2);
                mo5170a(c1019b2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C1046i.InterfaceC1047a
    /* renamed from: a */
    public void mo5170a(C1019b c1019b) {
        if (this.f3528f) {
            return;
        }
        c1019b.f3533c = null;
        this.f3523a.mo8870a(c1019b);
    }

    @Override // androidx.recyclerview.widget.C1046i.InterfaceC1047a
    /* renamed from: b */
    public C1019b mo5169b(int i, int i2, int i3, Object obj) {
        C1019b mo8869b = this.f3523a.mo8869b();
        if (mo8869b == null) {
            return new C1019b(i, i2, i3, obj);
        }
        mo8869b.f3531a = i;
        mo8869b.f3532b = i2;
        mo8869b.f3534d = i3;
        mo8869b.f3533c = obj;
        return mo8869b;
    }

    /* renamed from: e */
    public int m5319e(int i) {
        int size = this.f3524b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1019b c1019b = this.f3524b.get(i2);
            int i3 = c1019b.f3531a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c1019b.f3532b;
                    if (i4 <= i) {
                        int i5 = c1019b.f3534d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c1019b.f3532b;
                    if (i6 == i) {
                        i = c1019b.f3534d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c1019b.f3534d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c1019b.f3532b <= i) {
                i += c1019b.f3534d;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m5315i() {
        int size = this.f3525c.size();
        for (int i = 0; i < size; i++) {
            this.f3526d.mo5300b(this.f3525c.get(i));
        }
        m5304t(this.f3525c);
        this.f3530h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m5314j() {
        m5315i();
        int size = this.f3524b.size();
        for (int i = 0; i < size; i++) {
            C1019b c1019b = this.f3524b.get(i);
            int i2 = c1019b.f3531a;
            if (i2 == 1) {
                this.f3526d.mo5300b(c1019b);
                this.f3526d.mo5297e(c1019b.f3532b, c1019b.f3534d);
            } else if (i2 == 2) {
                this.f3526d.mo5300b(c1019b);
                this.f3526d.mo5296f(c1019b.f3532b, c1019b.f3534d);
            } else if (i2 == 4) {
                this.f3526d.mo5300b(c1019b);
                this.f3526d.mo5294h(c1019b.f3532b, c1019b.f3534d, c1019b.f3533c);
            } else if (i2 == 8) {
                this.f3526d.mo5300b(c1019b);
                this.f3526d.mo5301a(c1019b.f3532b, c1019b.f3534d);
            }
            Runnable runnable = this.f3527e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m5304t(this.f3524b);
        this.f3530h = 0;
    }

    /* renamed from: l */
    void m5312l(C1019b c1019b, int i) {
        this.f3526d.mo5295g(c1019b);
        int i2 = c1019b.f3531a;
        if (i2 == 2) {
            this.f3526d.mo5296f(i, c1019b.f3534d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f3526d.mo5294h(i, c1019b.f3534d, c1019b.f3533c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m5311m(int i) {
        return m5310n(i, 0);
    }

    /* renamed from: n */
    int m5310n(int i, int i2) {
        int size = this.f3525c.size();
        while (i2 < size) {
            C1019b c1019b = this.f3525c.get(i2);
            int i3 = c1019b.f3531a;
            if (i3 == 8) {
                int i4 = c1019b.f3532b;
                if (i4 == i) {
                    i = c1019b.f3534d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1019b.f3534d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1019b.f3532b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1019b.f3534d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1019b.f3534d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m5309o(int i) {
        return (i & this.f3530h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m5308p() {
        return this.f3524b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m5307q() {
        return (this.f3525c.isEmpty() || this.f3524b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m5305s() {
        this.f3529g.m5175b(this.f3524b);
        int size = this.f3524b.size();
        for (int i = 0; i < size; i++) {
            C1019b c1019b = this.f3524b.get(i);
            int i2 = c1019b.f3531a;
            if (i2 == 1) {
                m5321c(c1019b);
            } else if (i2 == 2) {
                m5318f(c1019b);
            } else if (i2 == 4) {
                m5317g(c1019b);
            } else if (i2 == 8) {
                m5320d(c1019b);
            }
            Runnable runnable = this.f3527e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3524b.clear();
    }

    /* renamed from: t */
    void m5304t(List<C1019b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5170a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m5303u() {
        m5304t(this.f3524b);
        m5304t(this.f3525c);
        this.f3530h = 0;
    }
}
