package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p019g.p028k.p029b0.C0217c;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3292I;

    /* renamed from: J */
    int f3293J;

    /* renamed from: K */
    int[] f3294K;

    /* renamed from: L */
    View[] f3295L;

    /* renamed from: M */
    final SparseIntArray f3296M;

    /* renamed from: N */
    final SparseIntArray f3297N;

    /* renamed from: O */
    AbstractC0961c f3298O;

    /* renamed from: P */
    final Rect f3299P;

    /* renamed from: Q */
    private boolean f3300Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0959a extends AbstractC0961c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0961c
        /* renamed from: e */
        public int mo5818e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0961c
        /* renamed from: f */
        public int mo5817f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0960b extends RecyclerView.C0993p {

        /* renamed from: e */
        int f3301e;

        /* renamed from: f */
        int f3302f;

        public C0960b(int i, int i2) {
            super(i, i2);
            this.f3301e = -1;
            this.f3302f = 0;
        }

        public C0960b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3301e = -1;
            this.f3302f = 0;
        }

        public C0960b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3301e = -1;
            this.f3302f = 0;
        }

        public C0960b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3301e = -1;
            this.f3302f = 0;
        }

        /* renamed from: e */
        public int m5824e() {
            return this.f3301e;
        }

        /* renamed from: f */
        public int m5823f() {
            return this.f3302f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0961c {

        /* renamed from: a */
        final SparseIntArray f3303a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3304b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3305c = false;

        /* renamed from: d */
        private boolean f3306d = false;

        /* renamed from: a */
        static int m5822a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        int m5821b(int i, int i2) {
            if (this.f3306d) {
                int i3 = this.f3304b.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int m5819d = m5819d(i, i2);
                this.f3304b.put(i, m5819d);
                return m5819d;
            }
            return m5819d(i, i2);
        }

        /* renamed from: c */
        int m5820c(int i, int i2) {
            if (this.f3305c) {
                int i3 = this.f3303a.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int mo5818e = mo5818e(i, i2);
                this.f3303a.put(i, mo5818e);
                return mo5818e;
            }
            return mo5818e(i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m5819d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3306d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f3304b
                int r0 = m5822a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f3304b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m5820c(r0, r8)
                int r0 = r6.mo5817f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.mo5817f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.mo5817f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0961c.m5819d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo5818e(int i, int i2);

        /* renamed from: f */
        public abstract int mo5817f(int i);

        /* renamed from: g */
        public void m5816g() {
            this.f3304b.clear();
        }

        /* renamed from: h */
        public void m5815h() {
            this.f3303a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f3292I = false;
        this.f3293J = -1;
        this.f3296M = new SparseIntArray();
        this.f3297N = new SparseIntArray();
        this.f3298O = new C0959a();
        this.f3299P = new Rect();
        m5826e3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3292I = false;
        this.f3293J = -1;
        this.f3296M = new SparseIntArray();
        this.f3297N = new SparseIntArray();
        this.f3298O = new C0959a();
        this.f3299P = new Rect();
        m5826e3(RecyclerView.AbstractC0988o.m5588i0(context, attributeSet, i, i2).f3428b);
    }

    /* renamed from: N2 */
    private void m5843N2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.f3295L[i2];
            C0960b c0960b = (C0960b) view.getLayoutParams();
            int m5830a3 = m5830a3(c1000v, c0968a0, m5591h0(view));
            c0960b.f3302f = m5830a3;
            c0960b.f3301e = i4;
            i4 += m5830a3;
            i2 += i3;
        }
    }

    /* renamed from: O2 */
    private void m5842O2() {
        int m5633J = m5633J();
        for (int i = 0; i < m5633J; i++) {
            C0960b c0960b = (C0960b) m5634I(i).getLayoutParams();
            int m5550a = c0960b.m5550a();
            this.f3296M.put(m5550a, c0960b.m5823f());
            this.f3297N.put(m5550a, c0960b.m5824e());
        }
    }

    /* renamed from: P2 */
    private void m5841P2(int i) {
        this.f3294K = m5840Q2(this.f3294K, this.f3293J, i);
    }

    /* renamed from: Q2 */
    static int[] m5840Q2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: R2 */
    private void m5839R2() {
        this.f3296M.clear();
        this.f3297N.clear();
    }

    /* renamed from: S2 */
    private int m5838S2(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() != 0 && c0968a0.m5745b() != 0) {
            m5795T1();
            boolean m5771r2 = m5771r2();
            View m5790Y1 = m5790Y1(!m5771r2, true);
            View m5791X1 = m5791X1(!m5771r2, true);
            if (m5790Y1 != null && m5791X1 != null) {
                int m5821b = this.f3298O.m5821b(m5591h0(m5790Y1), this.f3293J);
                int m5821b2 = this.f3298O.m5821b(m5591h0(m5791X1), this.f3293J);
                int min = Math.min(m5821b, m5821b2);
                int max = this.f3320x ? Math.max(0, ((this.f3298O.m5821b(c0968a0.m5745b() - 1, this.f3293J) + 1) - Math.max(m5821b, m5821b2)) - 1) : Math.max(0, min);
                if (m5771r2) {
                    return Math.round((max * (Math.abs(this.f3317u.mo5163d(m5791X1) - this.f3317u.mo5160g(m5790Y1)) / ((this.f3298O.m5821b(m5591h0(m5791X1), this.f3293J) - this.f3298O.m5821b(m5591h0(m5790Y1), this.f3293J)) + 1))) + (this.f3317u.mo5154m() - this.f3317u.mo5160g(m5790Y1)));
                }
                return max;
            }
        }
        return 0;
    }

    /* renamed from: T2 */
    private int m5837T2(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() != 0 && c0968a0.m5745b() != 0) {
            m5795T1();
            View m5790Y1 = m5790Y1(!m5771r2(), true);
            View m5791X1 = m5791X1(!m5771r2(), true);
            if (m5790Y1 != null && m5791X1 != null) {
                if (m5771r2()) {
                    int mo5163d = this.f3317u.mo5163d(m5791X1) - this.f3317u.mo5160g(m5790Y1);
                    int m5821b = this.f3298O.m5821b(m5591h0(m5790Y1), this.f3293J);
                    return (int) ((mo5163d / ((this.f3298O.m5821b(m5591h0(m5791X1), this.f3293J) - m5821b) + 1)) * (this.f3298O.m5821b(c0968a0.m5745b() - 1, this.f3293J) + 1));
                }
                return this.f3298O.m5821b(c0968a0.m5745b() - 1, this.f3293J) + 1;
            }
        }
        return 0;
    }

    /* renamed from: U2 */
    private void m5836U2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, LinearLayoutManager.C0962a c0962a, int i) {
        boolean z = i == 1;
        int m5831Z2 = m5831Z2(c1000v, c0968a0, c0962a.f3324b);
        if (z) {
            while (m5831Z2 > 0) {
                int i2 = c0962a.f3324b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c0962a.f3324b = i3;
                m5831Z2 = m5831Z2(c1000v, c0968a0, i3);
            }
            return;
        }
        int m5745b = c0968a0.m5745b() - 1;
        int i4 = c0962a.f3324b;
        while (i4 < m5745b) {
            int i5 = i4 + 1;
            int m5831Z22 = m5831Z2(c1000v, c0968a0, i5);
            if (m5831Z22 <= m5831Z2) {
                break;
            }
            i4 = i5;
            m5831Z2 = m5831Z22;
        }
        c0962a.f3324b = i4;
    }

    /* renamed from: V2 */
    private void m5835V2() {
        View[] viewArr = this.f3295L;
        if (viewArr == null || viewArr.length != this.f3293J) {
            this.f3295L = new View[this.f3293J];
        }
    }

    /* renamed from: Y2 */
    private int m5832Y2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, int i) {
        if (c0968a0.m5742e()) {
            int m5514f = c1000v.m5514f(i);
            if (m5514f == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
                return 0;
            }
            return this.f3298O.m5821b(m5514f, this.f3293J);
        }
        return this.f3298O.m5821b(i, this.f3293J);
    }

    /* renamed from: Z2 */
    private int m5831Z2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, int i) {
        if (c0968a0.m5742e()) {
            int i2 = this.f3297N.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int m5514f = c1000v.m5514f(i);
            if (m5514f == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 0;
            }
            return this.f3298O.m5820c(m5514f, this.f3293J);
        }
        return this.f3298O.m5820c(i, this.f3293J);
    }

    /* renamed from: a3 */
    private int m5830a3(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, int i) {
        if (c0968a0.m5742e()) {
            int i2 = this.f3296M.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int m5514f = c1000v.m5514f(i);
            if (m5514f == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 1;
            }
            return this.f3298O.mo5817f(m5514f);
        }
        return this.f3298O.mo5817f(i);
    }

    /* renamed from: b3 */
    private void m5829b3(float f, int i) {
        m5841P2(Math.max(Math.round(f * this.f3293J), i));
    }

    /* renamed from: c3 */
    private void m5828c3(View view, int i, boolean z) {
        int i2;
        int i3;
        C0960b c0960b = (C0960b) view.getLayoutParams();
        Rect rect = c0960b.f3432b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0960b).topMargin + ((ViewGroup.MarginLayoutParams) c0960b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0960b).leftMargin + ((ViewGroup.MarginLayoutParams) c0960b).rightMargin;
        int m5834W2 = m5834W2(c0960b.f3301e, c0960b.f3302f);
        if (this.f3315s == 1) {
            i3 = RecyclerView.AbstractC0988o.m5631K(m5834W2, i, i5, ((ViewGroup.MarginLayoutParams) c0960b).width, false);
            i2 = RecyclerView.AbstractC0988o.m5631K(this.f3317u.mo5153n(), m5612X(), i4, ((ViewGroup.MarginLayoutParams) c0960b).height, true);
        } else {
            int m5631K = RecyclerView.AbstractC0988o.m5631K(m5834W2, i, i4, ((ViewGroup.MarginLayoutParams) c0960b).height, false);
            int m5631K2 = RecyclerView.AbstractC0988o.m5631K(this.f3317u.mo5153n(), m5572p0(), i5, ((ViewGroup.MarginLayoutParams) c0960b).width, true);
            i2 = m5631K;
            i3 = m5631K2;
        }
        m5827d3(view, i3, i2, z);
    }

    /* renamed from: d3 */
    private void m5827d3(View view, int i, int i2, boolean z) {
        RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
        if (z ? m5635H1(view, i, i2, c0993p) : m5641F1(view, i, i2, c0993p)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: f3 */
    private void m5825f3() {
        int m5613W;
        int m5594g0;
        if (m5773p2() == 1) {
            m5613W = m5575o0() - m5596f0();
            m5594g0 = m5598e0();
        } else {
            m5613W = m5613W() - m5600d0();
            m5594g0 = m5594g0();
        }
        m5841P2(m5613W - m5594g0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: C1 */
    public void mo5465C1(Rect rect, int i, int i2) {
        int m5578n;
        int m5578n2;
        if (this.f3294K == null) {
            super.mo5465C1(rect, i, i2);
        }
        int m5598e0 = m5598e0() + m5596f0();
        int m5594g0 = m5594g0() + m5600d0();
        if (this.f3315s == 1) {
            m5578n2 = RecyclerView.AbstractC0988o.m5578n(i2, rect.height() + m5594g0, m5605b0());
            int[] iArr = this.f3294K;
            m5578n = RecyclerView.AbstractC0988o.m5578n(i, iArr[iArr.length - 1] + m5598e0, m5602c0());
        } else {
            m5578n = RecyclerView.AbstractC0988o.m5578n(i, rect.width() + m5598e0, m5602c0());
            int[] iArr2 = this.f3294K;
            m5578n2 = RecyclerView.AbstractC0988o.m5578n(i2, iArr2[iArr2.length - 1] + m5594g0, m5605b0());
        }
        m5647B1(m5578n, m5578n2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: D */
    public RecyclerView.C0993p mo5463D() {
        return this.f3315s == 0 ? new C0960b(-2, -1) : new C0960b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: E */
    public RecyclerView.C0993p mo5460E(Context context, AttributeSet attributeSet) {
        return new C0960b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: E2 */
    public void mo5810E2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo5810E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: F */
    public RecyclerView.C0993p mo5458F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0960b((ViewGroup.MarginLayoutParams) layoutParams) : new C0960b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo5452J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1000v r26, androidx.recyclerview.widget.RecyclerView.C0968a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5452J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: L1 */
    public boolean mo5448L1() {
        return this.f3310D == null && !this.f3292I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: N */
    public int mo5444N(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (this.f3315s == 1) {
            return this.f3293J;
        }
        if (c0968a0.m5745b() < 1) {
            return 0;
        }
        return m5832Y2(c1000v, c0968a0, c0968a0.m5745b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N1 */
    void mo5801N1(RecyclerView.C0968a0 c0968a0, LinearLayoutManager.C0964c c0964c, RecyclerView.AbstractC0988o.InterfaceC0991c interfaceC0991c) {
        int i = this.f3293J;
        for (int i2 = 0; i2 < this.f3293J && c0964c.m5754c(c0968a0) && i > 0; i2++) {
            int i3 = c0964c.f3335d;
            interfaceC0991c.mo5203a(i3, Math.max(0, c0964c.f3338g));
            i -= this.f3298O.mo5817f(i3);
            c0964c.f3335d += c0964c.f3336e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: P0 */
    public void mo5439P0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, View view, C0217c c0217c) {
        int i;
        int m5824e;
        int m5823f;
        boolean z;
        boolean z2;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0960b)) {
            super.m5623O0(view, c0217c);
            return;
        }
        C0960b c0960b = (C0960b) layoutParams;
        int m5832Y2 = m5832Y2(c1000v, c0968a0, c0960b.m5550a());
        if (this.f3315s == 0) {
            i2 = c0960b.m5824e();
            i = c0960b.m5823f();
            m5823f = 1;
            z = false;
            z2 = false;
            m5824e = m5832Y2;
        } else {
            i = 1;
            m5824e = c0960b.m5824e();
            m5823f = c0960b.m5823f();
            z = false;
            z2 = false;
            i2 = m5832Y2;
        }
        c0217c.m8774Z(C0217c.C0220c.m8720a(i2, i, m5824e, m5823f, z, z2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: R0 */
    public void mo5434R0(RecyclerView recyclerView, int i, int i2) {
        this.f3298O.m5815h();
        this.f3298O.m5816g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: S0 */
    public void mo5431S0(RecyclerView recyclerView) {
        this.f3298O.m5815h();
        this.f3298O.m5816g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: T0 */
    public void mo5429T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3298O.m5815h();
        this.f3298O.m5816g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: U0 */
    public void mo5427U0(RecyclerView recyclerView, int i, int i2) {
        this.f3298O.m5815h();
        this.f3298O.m5816g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: W0 */
    public void mo5424W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3298O.m5815h();
        this.f3298O.m5816g();
    }

    /* renamed from: W2 */
    int m5834W2(int i, int i2) {
        if (this.f3315s != 1 || !m5772q2()) {
            int[] iArr = this.f3294K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3294K;
        int i3 = this.f3293J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: X0 */
    public void mo5422X0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (c0968a0.m5742e()) {
            m5842O2();
        }
        super.mo5422X0(c1000v, c0968a0);
        m5839R2();
    }

    /* renamed from: X2 */
    public int m5833X2() {
        return this.f3293J;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: Y0 */
    public void mo5420Y0(RecyclerView.C0968a0 c0968a0) {
        super.mo5420Y0(c0968a0);
        this.f3292I = false;
    }

    /* renamed from: e3 */
    public void m5826e3(int i) {
        if (i == this.f3293J) {
            return;
        }
        this.f3292I = true;
        if (i >= 1) {
            this.f3293J = i;
            this.f3298O.m5815h();
            m5564t1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: h2 */
    View mo5781h2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, int i, int i2, int i3) {
        m5795T1();
        int mo5154m = this.f3317u.mo5154m();
        int mo5158i = this.f3317u.mo5158i();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m5634I = m5634I(i);
            int m5591h0 = m5591h0(m5634I);
            if (m5591h0 >= 0 && m5591h0 < i3 && m5831Z2(c1000v, c0968a0, m5591h0) == 0) {
                if (((RecyclerView.C0993p) m5634I.getLayoutParams()).m5548c()) {
                    if (view2 == null) {
                        view2 = m5634I;
                    }
                } else if (this.f3317u.mo5160g(m5634I) < mo5158i && this.f3317u.mo5163d(m5634I) >= mo5154m) {
                    return m5634I;
                } else {
                    if (view == null) {
                        view = m5634I;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: k0 */
    public int mo5401k0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (this.f3315s == 0) {
            return this.f3293J;
        }
        if (c0968a0.m5745b() < 1) {
            return 0;
        }
        return m5832Y2(c1000v, c0968a0, c0968a0.m5745b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: m */
    public boolean mo5397m(RecyclerView.C0993p c0993p) {
        return c0993p instanceof C0960b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: r */
    public int mo5389r(RecyclerView.C0968a0 c0968a0) {
        return this.f3300Q ? m5838S2(c0968a0) : super.mo5389r(c0968a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: s */
    public int mo5387s(RecyclerView.C0968a0 c0968a0) {
        return this.f3300Q ? m5837T2(c0968a0) : super.mo5387s(c0968a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f3329b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: s2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mo5770s2(androidx.recyclerview.widget.RecyclerView.C1000v r18, androidx.recyclerview.widget.RecyclerView.C0968a0 r19, androidx.recyclerview.widget.LinearLayoutManager.C0964c r20, androidx.recyclerview.widget.LinearLayoutManager.C0963b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5770s2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: u */
    public int mo5382u(RecyclerView.C0968a0 c0968a0) {
        return this.f3300Q ? m5838S2(c0968a0) : super.mo5382u(c0968a0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: u2 */
    public void mo5768u2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, LinearLayoutManager.C0962a c0962a, int i) {
        super.mo5768u2(c1000v, c0968a0, c0962a, i);
        m5825f3();
        if (c0968a0.m5745b() > 0 && !c0968a0.m5742e()) {
            m5836U2(c1000v, c0968a0, c0962a, i);
        }
        m5835V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: v */
    public int mo5380v(RecyclerView.C0968a0 c0968a0) {
        return this.f3300Q ? m5837T2(c0968a0) : super.mo5380v(c0968a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: w1 */
    public int mo5378w1(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        m5825f3();
        m5835V2();
        return super.mo5378w1(i, c1000v, c0968a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: y1 */
    public int mo5374y1(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        m5825f3();
        m5835V2();
        return super.mo5374y1(i, c1000v, c0968a0);
    }
}
