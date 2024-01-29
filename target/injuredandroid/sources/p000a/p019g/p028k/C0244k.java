package p000a.p019g.p028k;

import android.view.View;
import android.view.ViewParent;
/* renamed from: a.g.k.k */
/* loaded from: classes.dex */
public class C0244k {

    /* renamed from: a */
    private ViewParent f715a;

    /* renamed from: b */
    private ViewParent f716b;

    /* renamed from: c */
    private final View f717c;

    /* renamed from: d */
    private boolean f718d;

    /* renamed from: e */
    private int[] f719e;

    public C0244k(View view) {
        this.f717c = view;
    }

    /* renamed from: h */
    private boolean m8680h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m8679i;
        int i6;
        int i7;
        int[] iArr3;
        if (!m8675m() || (m8679i = m8679i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f717c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m8678j = m8678j();
            m8678j[0] = 0;
            m8678j[1] = 0;
            iArr3 = m8678j;
        } else {
            iArr3 = iArr2;
        }
        C0266v.m8542d(m8679i, this.f717c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f717c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m8679i(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f716b;
        }
        return this.f715a;
    }

    /* renamed from: j */
    private int[] m8678j() {
        if (this.f719e == null) {
            this.f719e = new int[2];
        }
        return this.f719e;
    }

    /* renamed from: o */
    private void m8673o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f715a = viewParent;
        } else if (i != 1) {
        } else {
            this.f716b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m8687a(float f, float f2, boolean z) {
        ViewParent m8679i;
        if (!m8675m() || (m8679i = m8679i(0)) == null) {
            return false;
        }
        return C0266v.m8545a(m8679i, this.f717c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m8686b(float f, float f2) {
        ViewParent m8679i;
        if (!m8675m() || (m8679i = m8679i(0)) == null) {
            return false;
        }
        return C0266v.m8544b(m8679i, this.f717c, f, f2);
    }

    /* renamed from: c */
    public boolean m8685c(int i, int i2, int[] iArr, int[] iArr2) {
        return m8684d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m8684d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m8679i;
        int i4;
        int i5;
        if (!m8675m() || (m8679i = m8679i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f717c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m8678j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0266v.m8543c(m8679i, this.f717c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f717c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m8683e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m8680h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m8682f(int i, int i2, int i3, int i4, int[] iArr) {
        return m8680h(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m8681g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m8680h(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: k */
    public boolean m8677k() {
        return m8676l(0);
    }

    /* renamed from: l */
    public boolean m8676l(int i) {
        return m8679i(i) != null;
    }

    /* renamed from: m */
    public boolean m8675m() {
        return this.f718d;
    }

    /* renamed from: n */
    public void m8674n(boolean z) {
        if (this.f718d) {
            C0252s.m8589x0(this.f717c);
        }
        this.f718d = z;
    }

    /* renamed from: p */
    public boolean m8672p(int i) {
        return m8671q(i, 0);
    }

    /* renamed from: q */
    public boolean m8671q(int i, int i2) {
        if (m8676l(i2)) {
            return true;
        }
        if (m8675m()) {
            View view = this.f717c;
            for (ViewParent parent = this.f717c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0266v.m8540f(parent, view, this.f717c, i, i2)) {
                    m8673o(i2, parent);
                    C0266v.m8541e(parent, view, this.f717c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public void m8670r() {
        m8669s(0);
    }

    /* renamed from: s */
    public void m8669s(int i) {
        ViewParent m8679i = m8679i(i);
        if (m8679i != null) {
            C0266v.m8539g(m8679i, this.f717c, i);
            m8673o(i, null);
        }
    }
}
