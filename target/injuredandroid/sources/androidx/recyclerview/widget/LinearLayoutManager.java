package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0988o implements RecyclerView.AbstractC1005z.InterfaceC1007b {

    /* renamed from: A */
    int f3307A;

    /* renamed from: B */
    int f3308B;

    /* renamed from: C */
    private boolean f3309C;

    /* renamed from: D */
    C0965d f3310D;

    /* renamed from: E */
    final C0962a f3311E;

    /* renamed from: F */
    private final C0963b f3312F;

    /* renamed from: G */
    private int f3313G;

    /* renamed from: H */
    private int[] f3314H;

    /* renamed from: s */
    int f3315s;

    /* renamed from: t */
    private C0964c f3316t;

    /* renamed from: u */
    AbstractC1048j f3317u;

    /* renamed from: v */
    private boolean f3318v;

    /* renamed from: w */
    private boolean f3319w;

    /* renamed from: x */
    boolean f3320x;

    /* renamed from: y */
    private boolean f3321y;

    /* renamed from: z */
    private boolean f3322z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C0962a {

        /* renamed from: a */
        AbstractC1048j f3323a;

        /* renamed from: b */
        int f3324b;

        /* renamed from: c */
        int f3325c;

        /* renamed from: d */
        boolean f3326d;

        /* renamed from: e */
        boolean f3327e;

        C0962a() {
            m5758e();
        }

        /* renamed from: a */
        void m5762a() {
            this.f3325c = this.f3326d ? this.f3323a.mo5158i() : this.f3323a.mo5154m();
        }

        /* renamed from: b */
        public void m5761b(View view, int i) {
            this.f3325c = this.f3326d ? this.f3323a.mo5163d(view) + this.f3323a.m5165o() : this.f3323a.mo5160g(view);
            this.f3324b = i;
        }

        /* renamed from: c */
        public void m5760c(View view, int i) {
            int m5165o = this.f3323a.m5165o();
            if (m5165o >= 0) {
                m5761b(view, i);
                return;
            }
            this.f3324b = i;
            if (this.f3326d) {
                int mo5158i = (this.f3323a.mo5158i() - m5165o) - this.f3323a.mo5163d(view);
                this.f3325c = this.f3323a.mo5158i() - mo5158i;
                if (mo5158i > 0) {
                    int mo5162e = this.f3325c - this.f3323a.mo5162e(view);
                    int mo5154m = this.f3323a.mo5154m();
                    int min = mo5162e - (mo5154m + Math.min(this.f3323a.mo5160g(view) - mo5154m, 0));
                    if (min < 0) {
                        this.f3325c += Math.min(mo5158i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo5160g = this.f3323a.mo5160g(view);
            int mo5154m2 = mo5160g - this.f3323a.mo5154m();
            this.f3325c = mo5160g;
            if (mo5154m2 > 0) {
                int mo5158i2 = (this.f3323a.mo5158i() - Math.min(0, (this.f3323a.mo5158i() - m5165o) - this.f3323a.mo5163d(view))) - (mo5160g + this.f3323a.mo5162e(view));
                if (mo5158i2 < 0) {
                    this.f3325c -= Math.min(mo5154m2, -mo5158i2);
                }
            }
        }

        /* renamed from: d */
        boolean m5759d(View view, RecyclerView.C0968a0 c0968a0) {
            RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
            return !c0993p.m5548c() && c0993p.m5550a() >= 0 && c0993p.m5550a() < c0968a0.m5745b();
        }

        /* renamed from: e */
        void m5758e() {
            this.f3324b = -1;
            this.f3325c = RecyclerView.UNDEFINED_DURATION;
            this.f3326d = false;
            this.f3327e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3324b + ", mCoordinate=" + this.f3325c + ", mLayoutFromEnd=" + this.f3326d + ", mValid=" + this.f3327e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0963b {

        /* renamed from: a */
        public int f3328a;

        /* renamed from: b */
        public boolean f3329b;

        /* renamed from: c */
        public boolean f3330c;

        /* renamed from: d */
        public boolean f3331d;

        protected C0963b() {
        }

        /* renamed from: a */
        void m5757a() {
            this.f3328a = 0;
            this.f3329b = false;
            this.f3330c = false;
            this.f3331d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0964c {

        /* renamed from: b */
        int f3333b;

        /* renamed from: c */
        int f3334c;

        /* renamed from: d */
        int f3335d;

        /* renamed from: e */
        int f3336e;

        /* renamed from: f */
        int f3337f;

        /* renamed from: g */
        int f3338g;

        /* renamed from: j */
        boolean f3341j;

        /* renamed from: k */
        int f3342k;

        /* renamed from: m */
        boolean f3344m;

        /* renamed from: a */
        boolean f3332a = true;

        /* renamed from: h */
        int f3339h = 0;

        /* renamed from: i */
        int f3340i = 0;

        /* renamed from: l */
        List<RecyclerView.AbstractC0974d0> f3343l = null;

        C0964c() {
        }

        /* renamed from: e */
        private View m5752e() {
            int size = this.f3343l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3343l.get(i).f3376a;
                RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
                if (!c0993p.m5548c() && this.f3335d == c0993p.m5550a()) {
                    m5755b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m5756a() {
            m5755b(null);
        }

        /* renamed from: b */
        public void m5755b(View view) {
            View m5751f = m5751f(view);
            this.f3335d = m5751f == null ? -1 : ((RecyclerView.C0993p) m5751f.getLayoutParams()).m5550a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m5754c(RecyclerView.C0968a0 c0968a0) {
            int i = this.f3335d;
            return i >= 0 && i < c0968a0.m5745b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m5753d(RecyclerView.C1000v c1000v) {
            if (this.f3343l != null) {
                return m5752e();
            }
            View m5505o = c1000v.m5505o(this.f3335d);
            this.f3335d += this.f3336e;
            return m5505o;
        }

        /* renamed from: f */
        public View m5751f(View view) {
            int m5550a;
            int size = this.f3343l.size();
            View view2 = null;
            int i = Reader.READ_DONE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3343l.get(i2).f3376a;
                RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view3.getLayoutParams();
                if (view3 != view && !c0993p.m5548c() && (m5550a = (c0993p.m5550a() - this.f3335d) * this.f3336e) >= 0 && m5550a < i) {
                    view2 = view3;
                    if (m5550a == 0) {
                        break;
                    }
                    i = m5550a;
                }
            }
            return view2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C0965d implements Parcelable {
        public static final Parcelable.Creator<C0965d> CREATOR = new C0966a();

        /* renamed from: f */
        int f3345f;

        /* renamed from: g */
        int f3346g;

        /* renamed from: h */
        boolean f3347h;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes.dex */
        static class C0966a implements Parcelable.Creator<C0965d> {
            C0966a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0965d createFromParcel(Parcel parcel) {
                return new C0965d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C0965d[] newArray(int i) {
                return new C0965d[i];
            }
        }

        public C0965d() {
        }

        C0965d(Parcel parcel) {
            this.f3345f = parcel.readInt();
            this.f3346g = parcel.readInt();
            this.f3347h = parcel.readInt() == 1;
        }

        public C0965d(C0965d c0965d) {
            this.f3345f = c0965d.f3345f;
            this.f3346g = c0965d.f3346g;
            this.f3347h = c0965d.f3347h;
        }

        /* renamed from: a */
        boolean m5750a() {
            return this.f3345f >= 0;
        }

        /* renamed from: b */
        void m5749b() {
            this.f3345f = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3345f);
            parcel.writeInt(this.f3346g);
            parcel.writeInt(this.f3347h ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3315s = 1;
        this.f3319w = false;
        this.f3320x = false;
        this.f3321y = false;
        this.f3322z = true;
        this.f3307A = -1;
        this.f3308B = RecyclerView.UNDEFINED_DURATION;
        this.f3310D = null;
        this.f3311E = new C0962a();
        this.f3312F = new C0963b();
        this.f3313G = 2;
        this.f3314H = new int[2];
        m5812C2(i);
        m5811D2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3315s = 1;
        this.f3319w = false;
        this.f3320x = false;
        this.f3321y = false;
        this.f3322z = true;
        this.f3307A = -1;
        this.f3308B = RecyclerView.UNDEFINED_DURATION;
        this.f3310D = null;
        this.f3311E = new C0962a();
        this.f3312F = new C0963b();
        this.f3313G = 2;
        this.f3314H = new int[2];
        RecyclerView.AbstractC0988o.C0992d m5588i0 = RecyclerView.AbstractC0988o.m5588i0(context, attributeSet, i, i2);
        m5812C2(m5588i0.f3427a);
        m5811D2(m5588i0.f3429c);
        mo5810E2(m5588i0.f3430d);
    }

    /* renamed from: A2 */
    private void m5814A2() {
        this.f3320x = (this.f3315s == 1 || !m5772q2()) ? this.f3319w : !this.f3319w;
    }

    /* renamed from: F2 */
    private boolean m5809F2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, C0962a c0962a) {
        boolean z = false;
        if (m5633J() == 0) {
            return false;
        }
        View m5615V = m5615V();
        if (m5615V != null && c0962a.m5759d(m5615V, c0968a0)) {
            c0962a.m5760c(m5615V, m5591h0(m5615V));
            return true;
        } else if (this.f3318v != this.f3321y) {
            return false;
        } else {
            View m5780i2 = c0962a.f3326d ? m5780i2(c1000v, c0968a0) : m5779j2(c1000v, c0968a0);
            if (m5780i2 != null) {
                c0962a.m5761b(m5780i2, m5591h0(m5780i2));
                if (!c0968a0.m5742e() && mo5448L1()) {
                    if ((this.f3317u.mo5160g(m5780i2) >= this.f3317u.mo5158i() || this.f3317u.mo5163d(m5780i2) < this.f3317u.mo5154m()) ? true : true) {
                        c0962a.f3325c = c0962a.f3326d ? this.f3317u.mo5158i() : this.f3317u.mo5154m();
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: G2 */
    private boolean m5808G2(RecyclerView.C0968a0 c0968a0, C0962a c0962a) {
        int i;
        if (!c0968a0.m5742e() && (i = this.f3307A) != -1) {
            if (i >= 0 && i < c0968a0.m5745b()) {
                c0962a.f3324b = this.f3307A;
                C0965d c0965d = this.f3310D;
                if (c0965d != null && c0965d.m5750a()) {
                    boolean z = this.f3310D.f3347h;
                    c0962a.f3326d = z;
                    c0962a.f3325c = z ? this.f3317u.mo5158i() - this.f3310D.f3346g : this.f3317u.mo5154m() + this.f3310D.f3346g;
                    return true;
                } else if (this.f3308B != Integer.MIN_VALUE) {
                    boolean z2 = this.f3320x;
                    c0962a.f3326d = z2;
                    c0962a.f3325c = z2 ? this.f3317u.mo5158i() - this.f3308B : this.f3317u.mo5154m() + this.f3308B;
                    return true;
                } else {
                    View mo5646C = mo5646C(this.f3307A);
                    if (mo5646C == null) {
                        if (m5633J() > 0) {
                            c0962a.f3326d = (this.f3307A < m5591h0(m5634I(0))) == this.f3320x;
                        }
                        c0962a.m5762a();
                    } else if (this.f3317u.mo5162e(mo5646C) > this.f3317u.mo5153n()) {
                        c0962a.m5762a();
                        return true;
                    } else if (this.f3317u.mo5160g(mo5646C) - this.f3317u.mo5154m() < 0) {
                        c0962a.f3325c = this.f3317u.mo5154m();
                        c0962a.f3326d = false;
                        return true;
                    } else if (this.f3317u.mo5158i() - this.f3317u.mo5163d(mo5646C) < 0) {
                        c0962a.f3325c = this.f3317u.mo5158i();
                        c0962a.f3326d = true;
                        return true;
                    } else {
                        c0962a.f3325c = c0962a.f3326d ? this.f3317u.mo5163d(mo5646C) + this.f3317u.m5165o() : this.f3317u.mo5160g(mo5646C);
                    }
                    return true;
                }
            }
            this.f3307A = -1;
            this.f3308B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    /* renamed from: H2 */
    private void m5807H2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, C0962a c0962a) {
        if (m5808G2(c0968a0, c0962a) || m5809F2(c1000v, c0968a0, c0962a)) {
            return;
        }
        c0962a.m5762a();
        c0962a.f3324b = this.f3321y ? c0968a0.m5745b() - 1 : 0;
    }

    /* renamed from: I2 */
    private void m5806I2(int i, int i2, boolean z, RecyclerView.C0968a0 c0968a0) {
        int mo5154m;
        this.f3316t.f3344m = m5763z2();
        this.f3316t.f3337f = i;
        int[] iArr = this.f3314H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3039M1(c0968a0, iArr);
        int max = Math.max(0, this.f3314H[0]);
        int max2 = Math.max(0, this.f3314H[1]);
        boolean z2 = i == 1;
        this.f3316t.f3339h = z2 ? max2 : max;
        C0964c c0964c = this.f3316t;
        if (!z2) {
            max = max2;
        }
        c0964c.f3340i = max;
        if (z2) {
            this.f3316t.f3339h += this.f3317u.mo5157j();
            View m5776m2 = m5776m2();
            this.f3316t.f3336e = this.f3320x ? -1 : 1;
            C0964c c0964c2 = this.f3316t;
            int m5591h0 = m5591h0(m5776m2);
            C0964c c0964c3 = this.f3316t;
            c0964c2.f3335d = m5591h0 + c0964c3.f3336e;
            c0964c3.f3333b = this.f3317u.mo5163d(m5776m2);
            mo5154m = this.f3317u.mo5163d(m5776m2) - this.f3317u.mo5158i();
        } else {
            View m5775n2 = m5775n2();
            this.f3316t.f3339h += this.f3317u.mo5154m();
            this.f3316t.f3336e = this.f3320x ? 1 : -1;
            C0964c c0964c4 = this.f3316t;
            int m5591h02 = m5591h0(m5775n2);
            C0964c c0964c5 = this.f3316t;
            c0964c4.f3335d = m5591h02 + c0964c5.f3336e;
            c0964c5.f3333b = this.f3317u.mo5160g(m5775n2);
            mo5154m = (-this.f3317u.mo5160g(m5775n2)) + this.f3317u.mo5154m();
        }
        C0964c c0964c6 = this.f3316t;
        c0964c6.f3334c = i2;
        if (z) {
            c0964c6.f3334c = i2 - mo5154m;
        }
        this.f3316t.f3338g = mo5154m;
    }

    /* renamed from: J2 */
    private void m5805J2(int i, int i2) {
        this.f3316t.f3334c = this.f3317u.mo5158i() - i2;
        this.f3316t.f3336e = this.f3320x ? -1 : 1;
        C0964c c0964c = this.f3316t;
        c0964c.f3335d = i;
        c0964c.f3337f = 1;
        c0964c.f3333b = i2;
        c0964c.f3338g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: K2 */
    private void m5804K2(C0962a c0962a) {
        m5805J2(c0962a.f3324b, c0962a.f3325c);
    }

    /* renamed from: L2 */
    private void m5803L2(int i, int i2) {
        this.f3316t.f3334c = i2 - this.f3317u.mo5154m();
        C0964c c0964c = this.f3316t;
        c0964c.f3335d = i;
        c0964c.f3336e = this.f3320x ? 1 : -1;
        C0964c c0964c2 = this.f3316t;
        c0964c2.f3337f = -1;
        c0964c2.f3333b = i2;
        c0964c2.f3338g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: M2 */
    private void m5802M2(C0962a c0962a) {
        m5803L2(c0962a.f3324b, c0962a.f3325c);
    }

    /* renamed from: O1 */
    private int m5800O1(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0) {
            return 0;
        }
        m5795T1();
        return C1053l.m5140a(c0968a0, this.f3317u, m5790Y1(!this.f3322z, true), m5791X1(!this.f3322z, true), this, this.f3322z);
    }

    /* renamed from: P1 */
    private int m5799P1(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0) {
            return 0;
        }
        m5795T1();
        return C1053l.m5139b(c0968a0, this.f3317u, m5790Y1(!this.f3322z, true), m5791X1(!this.f3322z, true), this, this.f3322z, this.f3320x);
    }

    /* renamed from: Q1 */
    private int m5798Q1(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0) {
            return 0;
        }
        m5795T1();
        return C1053l.m5138c(c0968a0, this.f3317u, m5790Y1(!this.f3322z, true), m5791X1(!this.f3322z, true), this, this.f3322z);
    }

    /* renamed from: V1 */
    private View m5793V1() {
        return m5785d2(0, m5633J());
    }

    /* renamed from: W1 */
    private View m5792W1(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return mo5781h2(c1000v, c0968a0, 0, m5633J(), c0968a0.m5745b());
    }

    /* renamed from: a2 */
    private View m5788a2() {
        return m5785d2(m5633J() - 1, -1);
    }

    /* renamed from: b2 */
    private View m5787b2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return mo5781h2(c1000v, c0968a0, m5633J() - 1, -1, c0968a0.m5745b());
    }

    /* renamed from: f2 */
    private View m5783f2() {
        return this.f3320x ? m5793V1() : m5788a2();
    }

    /* renamed from: g2 */
    private View m5782g2() {
        return this.f3320x ? m5788a2() : m5793V1();
    }

    /* renamed from: i2 */
    private View m5780i2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return this.f3320x ? m5792W1(c1000v, c0968a0) : m5787b2(c1000v, c0968a0);
    }

    /* renamed from: j2 */
    private View m5779j2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return this.f3320x ? m5787b2(c1000v, c0968a0) : m5792W1(c1000v, c0968a0);
    }

    /* renamed from: k2 */
    private int m5778k2(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, boolean z) {
        int mo5158i;
        int mo5158i2 = this.f3317u.mo5158i() - i;
        if (mo5158i2 > 0) {
            int i2 = -m5813B2(-mo5158i2, c1000v, c0968a0);
            int i3 = i + i2;
            if (!z || (mo5158i = this.f3317u.mo5158i() - i3) <= 0) {
                return i2;
            }
            this.f3317u.mo5150r(mo5158i);
            return mo5158i + i2;
        }
        return 0;
    }

    /* renamed from: l2 */
    private int m5777l2(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, boolean z) {
        int mo5154m;
        int mo5154m2 = i - this.f3317u.mo5154m();
        if (mo5154m2 > 0) {
            int i2 = -m5813B2(mo5154m2, c1000v, c0968a0);
            int i3 = i + i2;
            if (!z || (mo5154m = i3 - this.f3317u.mo5154m()) <= 0) {
                return i2;
            }
            this.f3317u.mo5150r(-mo5154m);
            return i2 - mo5154m;
        }
        return 0;
    }

    /* renamed from: m2 */
    private View m5776m2() {
        return m5634I(this.f3320x ? 0 : m5633J() - 1);
    }

    /* renamed from: n2 */
    private View m5775n2() {
        return m5634I(this.f3320x ? m5633J() - 1 : 0);
    }

    /* renamed from: t2 */
    private void m5769t2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, int i, int i2) {
        if (!c0968a0.m5740g() || m5633J() == 0 || c0968a0.m5742e() || !mo5448L1()) {
            return;
        }
        List<RecyclerView.AbstractC0974d0> m5509k = c1000v.m5509k();
        int size = m5509k.size();
        int m5591h0 = m5591h0(m5634I(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.AbstractC0974d0 abstractC0974d0 = m5509k.get(i5);
            if (!abstractC0974d0.m5698v()) {
                char c = (abstractC0974d0.m5707m() < m5591h0) != this.f3320x ? (char) 65535 : (char) 1;
                int mo5162e = this.f3317u.mo5162e(abstractC0974d0.f3376a);
                if (c == 65535) {
                    i3 += mo5162e;
                } else {
                    i4 += mo5162e;
                }
            }
        }
        this.f3316t.f3343l = m5509k;
        if (i3 > 0) {
            m5803L2(m5591h0(m5775n2()), i);
            C0964c c0964c = this.f3316t;
            c0964c.f3339h = i3;
            c0964c.f3334c = 0;
            c0964c.m5756a();
            m5794U1(c1000v, this.f3316t, c0968a0, false);
        }
        if (i4 > 0) {
            m5805J2(m5591h0(m5776m2()), i2);
            C0964c c0964c2 = this.f3316t;
            c0964c2.f3339h = i4;
            c0964c2.f3334c = 0;
            c0964c2.m5756a();
            m5794U1(c1000v, this.f3316t, c0968a0, false);
        }
        this.f3316t.f3343l = null;
    }

    /* renamed from: v2 */
    private void m5767v2(RecyclerView.C1000v c1000v, C0964c c0964c) {
        if (!c0964c.f3332a || c0964c.f3344m) {
            return;
        }
        int i = c0964c.f3338g;
        int i2 = c0964c.f3340i;
        if (c0964c.f3337f == -1) {
            m5765x2(c1000v, i, i2);
        } else {
            m5764y2(c1000v, i, i2);
        }
    }

    /* renamed from: w2 */
    private void m5766w2(RecyclerView.C1000v c1000v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m5576n1(i, c1000v);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            m5576n1(i3, c1000v);
        }
    }

    /* renamed from: x2 */
    private void m5765x2(RecyclerView.C1000v c1000v, int i, int i2) {
        int m5633J = m5633J();
        if (i < 0) {
            return;
        }
        int mo5159h = (this.f3317u.mo5159h() - i) + i2;
        if (this.f3320x) {
            for (int i3 = 0; i3 < m5633J; i3++) {
                View m5634I = m5634I(i3);
                if (this.f3317u.mo5160g(m5634I) < mo5159h || this.f3317u.mo5151q(m5634I) < mo5159h) {
                    m5766w2(c1000v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = m5633J - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View m5634I2 = m5634I(i5);
            if (this.f3317u.mo5160g(m5634I2) < mo5159h || this.f3317u.mo5151q(m5634I2) < mo5159h) {
                m5766w2(c1000v, i4, i5);
                return;
            }
        }
    }

    /* renamed from: y2 */
    private void m5764y2(RecyclerView.C1000v c1000v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int m5633J = m5633J();
        if (!this.f3320x) {
            for (int i4 = 0; i4 < m5633J; i4++) {
                View m5634I = m5634I(i4);
                if (this.f3317u.mo5163d(m5634I) > i3 || this.f3317u.mo5152p(m5634I) > i3) {
                    m5766w2(c1000v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = m5633J - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View m5634I2 = m5634I(i6);
            if (this.f3317u.mo5163d(m5634I2) > i3 || this.f3317u.mo5152p(m5634I2) > i3) {
                m5766w2(c1000v, i5, i6);
                return;
            }
        }
    }

    /* renamed from: B2 */
    int m5813B2(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0 || i == 0) {
            return 0;
        }
        m5795T1();
        this.f3316t.f3332a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m5806I2(i2, abs, true, c0968a0);
        C0964c c0964c = this.f3316t;
        int m5794U1 = c0964c.f3338g + m5794U1(c1000v, c0964c, c0968a0, false);
        if (m5794U1 < 0) {
            return 0;
        }
        if (abs > m5794U1) {
            i = i2 * m5794U1;
        }
        this.f3317u.mo5150r(-i);
        this.f3316t.f3342k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: C */
    public View mo5646C(int i) {
        int m5633J = m5633J();
        if (m5633J == 0) {
            return null;
        }
        int m5591h0 = i - m5591h0(m5634I(0));
        if (m5591h0 >= 0 && m5591h0 < m5633J) {
            View m5634I = m5634I(m5591h0);
            if (m5591h0(m5634I) == i) {
                return m5634I;
            }
        }
        return super.mo5646C(i);
    }

    /* renamed from: C2 */
    public void m5812C2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo5407g(null);
        if (i != this.f3315s || this.f3317u == null) {
            AbstractC1048j m5167b = AbstractC1048j.m5167b(this, i);
            this.f3317u = m5167b;
            this.f3311E.f3323a = m5167b;
            this.f3315s = i;
            m5564t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: D */
    public RecyclerView.C0993p mo5463D() {
        return new RecyclerView.C0993p(-2, -2);
    }

    /* renamed from: D2 */
    public void m5811D2(boolean z) {
        mo5407g(null);
        if (z == this.f3319w) {
            return;
        }
        this.f3319w = z;
        m5564t1();
    }

    /* renamed from: E2 */
    public void mo5810E2(boolean z) {
        mo5407g(null);
        if (this.f3321y == z) {
            return;
        }
        this.f3321y = z;
        m5564t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: G1 */
    boolean mo5638G1() {
        return (m5612X() == 1073741824 || m5572p0() == 1073741824 || !m5570q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: I0 */
    public void mo5454I0(RecyclerView recyclerView, RecyclerView.C1000v c1000v) {
        super.mo5454I0(recyclerView, c1000v);
        if (this.f3309C) {
            m5583k1(c1000v);
            c1000v.m5517c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: I1 */
    public void mo2974I1(RecyclerView recyclerView, RecyclerView.C0968a0 c0968a0, int i) {
        C1044g c1044g = new C1044g(recyclerView.getContext());
        c1044g.m5476p(i);
        m5632J1(c1044g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: J0 */
    public View mo5452J0(View view, int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        int m5797R1;
        m5814A2();
        if (m5633J() == 0 || (m5797R1 = m5797R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m5795T1();
        m5806I2(m5797R1, (int) (this.f3317u.mo5153n() * 0.33333334f), false, c0968a0);
        C0964c c0964c = this.f3316t;
        c0964c.f3338g = RecyclerView.UNDEFINED_DURATION;
        c0964c.f3332a = false;
        m5794U1(c1000v, c0964c, c0968a0, true);
        View m5782g2 = m5797R1 == -1 ? m5782g2() : m5783f2();
        View m5775n2 = m5797R1 == -1 ? m5775n2() : m5776m2();
        if (m5775n2.hasFocusable()) {
            if (m5782g2 == null) {
                return null;
            }
            return m5775n2;
        }
        return m5782g2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: K0 */
    public void mo5450K0(AccessibilityEvent accessibilityEvent) {
        super.mo5450K0(accessibilityEvent);
        if (m5633J() > 0) {
            accessibilityEvent.setFromIndex(m5789Z1());
            accessibilityEvent.setToIndex(m5786c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: L1 */
    public boolean mo5448L1() {
        return this.f3310D == null && this.f3318v == this.f3321y;
    }

    /* renamed from: M1 */
    protected void mo3039M1(RecyclerView.C0968a0 c0968a0, int[] iArr) {
        int i;
        int m5774o2 = m5774o2(c0968a0);
        if (this.f3316t.f3337f == -1) {
            i = 0;
        } else {
            i = m5774o2;
            m5774o2 = 0;
        }
        iArr[0] = m5774o2;
        iArr[1] = i;
    }

    /* renamed from: N1 */
    void mo5801N1(RecyclerView.C0968a0 c0968a0, C0964c c0964c, RecyclerView.AbstractC0988o.InterfaceC0991c interfaceC0991c) {
        int i = c0964c.f3335d;
        if (i < 0 || i >= c0968a0.m5745b()) {
            return;
        }
        interfaceC0991c.mo5203a(i, Math.max(0, c0964c.f3338g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R1 */
    public int m5797R1(int i) {
        if (i == 1) {
            return (this.f3315s != 1 && m5772q2()) ? 1 : -1;
        } else if (i == 2) {
            return (this.f3315s != 1 && m5772q2()) ? -1 : 1;
        } else if (i == 17) {
            if (this.f3315s == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 33) {
            if (this.f3315s == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 66) {
            if (this.f3315s == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 130 && this.f3315s == 1) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: S1 */
    C0964c m5796S1() {
        return new C0964c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void m5795T1() {
        if (this.f3316t == null) {
            this.f3316t = m5796S1();
        }
    }

    /* renamed from: U1 */
    int m5794U1(RecyclerView.C1000v c1000v, C0964c c0964c, RecyclerView.C0968a0 c0968a0, boolean z) {
        int i = c0964c.f3334c;
        int i2 = c0964c.f3338g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0964c.f3338g = i2 + i;
            }
            m5767v2(c1000v, c0964c);
        }
        int i3 = c0964c.f3334c + c0964c.f3339h;
        C0963b c0963b = this.f3312F;
        while (true) {
            if ((!c0964c.f3344m && i3 <= 0) || !c0964c.m5754c(c0968a0)) {
                break;
            }
            c0963b.m5757a();
            mo5770s2(c1000v, c0968a0, c0964c, c0963b);
            if (!c0963b.f3329b) {
                c0964c.f3333b += c0963b.f3328a * c0964c.f3337f;
                if (!c0963b.f3330c || c0964c.f3343l != null || !c0968a0.m5742e()) {
                    int i4 = c0964c.f3334c;
                    int i5 = c0963b.f3328a;
                    c0964c.f3334c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c0964c.f3338g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c0963b.f3328a;
                    c0964c.f3338g = i7;
                    int i8 = c0964c.f3334c;
                    if (i8 < 0) {
                        c0964c.f3338g = i7 + i8;
                    }
                    m5767v2(c1000v, c0964c);
                }
                if (z && c0963b.f3331d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0964c.f3334c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: X0 */
    public void mo5422X0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        int i;
        int i2;
        int i3;
        int i4;
        int m5778k2;
        int i5;
        View mo5646C;
        int mo5160g;
        int i6;
        int i7 = -1;
        if (!(this.f3310D == null && this.f3307A == -1) && c0968a0.m5745b() == 0) {
            m5583k1(c1000v);
            return;
        }
        C0965d c0965d = this.f3310D;
        if (c0965d != null && c0965d.m5750a()) {
            this.f3307A = this.f3310D.f3345f;
        }
        m5795T1();
        this.f3316t.f3332a = false;
        m5814A2();
        View m5615V = m5615V();
        if (!this.f3311E.f3327e || this.f3307A != -1 || this.f3310D != null) {
            this.f3311E.m5758e();
            C0962a c0962a = this.f3311E;
            c0962a.f3326d = this.f3320x ^ this.f3321y;
            m5807H2(c1000v, c0968a0, c0962a);
            this.f3311E.f3327e = true;
        } else if (m5615V != null && (this.f3317u.mo5160g(m5615V) >= this.f3317u.mo5158i() || this.f3317u.mo5163d(m5615V) <= this.f3317u.mo5154m())) {
            this.f3311E.m5760c(m5615V, m5591h0(m5615V));
        }
        C0964c c0964c = this.f3316t;
        c0964c.f3337f = c0964c.f3342k >= 0 ? 1 : -1;
        int[] iArr = this.f3314H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3039M1(c0968a0, iArr);
        int max = Math.max(0, this.f3314H[0]) + this.f3317u.mo5154m();
        int max2 = Math.max(0, this.f3314H[1]) + this.f3317u.mo5157j();
        if (c0968a0.m5742e() && (i5 = this.f3307A) != -1 && this.f3308B != Integer.MIN_VALUE && (mo5646C = mo5646C(i5)) != null) {
            if (this.f3320x) {
                i6 = this.f3317u.mo5158i() - this.f3317u.mo5163d(mo5646C);
                mo5160g = this.f3308B;
            } else {
                mo5160g = this.f3317u.mo5160g(mo5646C) - this.f3317u.mo5154m();
                i6 = this.f3308B;
            }
            int i8 = i6 - mo5160g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        if (!this.f3311E.f3326d ? !this.f3320x : this.f3320x) {
            i7 = 1;
        }
        mo5768u2(c1000v, c0968a0, this.f3311E, i7);
        m5559w(c1000v);
        this.f3316t.f3344m = m5763z2();
        this.f3316t.f3341j = c0968a0.m5742e();
        this.f3316t.f3340i = 0;
        C0962a c0962a2 = this.f3311E;
        if (c0962a2.f3326d) {
            m5802M2(c0962a2);
            C0964c c0964c2 = this.f3316t;
            c0964c2.f3339h = max;
            m5794U1(c1000v, c0964c2, c0968a0, false);
            C0964c c0964c3 = this.f3316t;
            i2 = c0964c3.f3333b;
            int i9 = c0964c3.f3335d;
            int i10 = c0964c3.f3334c;
            if (i10 > 0) {
                max2 += i10;
            }
            m5804K2(this.f3311E);
            C0964c c0964c4 = this.f3316t;
            c0964c4.f3339h = max2;
            c0964c4.f3335d += c0964c4.f3336e;
            m5794U1(c1000v, c0964c4, c0968a0, false);
            C0964c c0964c5 = this.f3316t;
            i = c0964c5.f3333b;
            int i11 = c0964c5.f3334c;
            if (i11 > 0) {
                m5803L2(i9, i2);
                C0964c c0964c6 = this.f3316t;
                c0964c6.f3339h = i11;
                m5794U1(c1000v, c0964c6, c0968a0, false);
                i2 = this.f3316t.f3333b;
            }
        } else {
            m5804K2(c0962a2);
            C0964c c0964c7 = this.f3316t;
            c0964c7.f3339h = max2;
            m5794U1(c1000v, c0964c7, c0968a0, false);
            C0964c c0964c8 = this.f3316t;
            i = c0964c8.f3333b;
            int i12 = c0964c8.f3335d;
            int i13 = c0964c8.f3334c;
            if (i13 > 0) {
                max += i13;
            }
            m5802M2(this.f3311E);
            C0964c c0964c9 = this.f3316t;
            c0964c9.f3339h = max;
            c0964c9.f3335d += c0964c9.f3336e;
            m5794U1(c1000v, c0964c9, c0968a0, false);
            C0964c c0964c10 = this.f3316t;
            i2 = c0964c10.f3333b;
            int i14 = c0964c10.f3334c;
            if (i14 > 0) {
                m5805J2(i12, i);
                C0964c c0964c11 = this.f3316t;
                c0964c11.f3339h = i14;
                m5794U1(c1000v, c0964c11, c0968a0, false);
                i = this.f3316t.f3333b;
            }
        }
        if (m5633J() > 0) {
            if (this.f3320x ^ this.f3321y) {
                int m5778k22 = m5778k2(i, c1000v, c0968a0, true);
                i3 = i2 + m5778k22;
                i4 = i + m5778k22;
                m5778k2 = m5777l2(i3, c1000v, c0968a0, false);
            } else {
                int m5777l2 = m5777l2(i2, c1000v, c0968a0, true);
                i3 = i2 + m5777l2;
                i4 = i + m5777l2;
                m5778k2 = m5778k2(i4, c1000v, c0968a0, false);
            }
            i2 = i3 + m5778k2;
            i = i4 + m5778k2;
        }
        m5769t2(c1000v, c0968a0, i2, i);
        if (c0968a0.m5742e()) {
            this.f3311E.m5758e();
        } else {
            this.f3317u.m5164s();
        }
        this.f3318v = this.f3321y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View m5791X1(boolean z, boolean z2) {
        int m5633J;
        int i;
        if (this.f3320x) {
            m5633J = 0;
            i = m5633J();
        } else {
            m5633J = m5633J() - 1;
            i = -1;
        }
        return m5784e2(m5633J, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: Y0 */
    public void mo5420Y0(RecyclerView.C0968a0 c0968a0) {
        super.mo5420Y0(c0968a0);
        this.f3310D = null;
        this.f3307A = -1;
        this.f3308B = RecyclerView.UNDEFINED_DURATION;
        this.f3311E.m5758e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public View m5790Y1(boolean z, boolean z2) {
        int i;
        int m5633J;
        if (this.f3320x) {
            i = m5633J() - 1;
            m5633J = -1;
        } else {
            i = 0;
            m5633J = m5633J();
        }
        return m5784e2(i, m5633J, z, z2);
    }

    /* renamed from: Z1 */
    public int m5789Z1() {
        View m5784e2 = m5784e2(0, m5633J(), false, true);
        if (m5784e2 == null) {
            return -1;
        }
        return m5591h0(m5784e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1005z.InterfaceC1007b
    /* renamed from: a */
    public PointF mo5417a(int i) {
        if (m5633J() == 0) {
            return null;
        }
        int i2 = (i < m5591h0(m5634I(0))) != this.f3320x ? -1 : 1;
        return this.f3315s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: c1 */
    public void mo5414c1(Parcelable parcelable) {
        if (parcelable instanceof C0965d) {
            this.f3310D = (C0965d) parcelable;
            m5564t1();
        }
    }

    /* renamed from: c2 */
    public int m5786c2() {
        View m5784e2 = m5784e2(m5633J() - 1, -1, false, true);
        if (m5784e2 == null) {
            return -1;
        }
        return m5591h0(m5784e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: d1 */
    public Parcelable mo5412d1() {
        if (this.f3310D != null) {
            return new C0965d(this.f3310D);
        }
        C0965d c0965d = new C0965d();
        if (m5633J() > 0) {
            m5795T1();
            boolean z = this.f3318v ^ this.f3320x;
            c0965d.f3347h = z;
            if (z) {
                View m5776m2 = m5776m2();
                c0965d.f3346g = this.f3317u.mo5158i() - this.f3317u.mo5163d(m5776m2);
                c0965d.f3345f = m5591h0(m5776m2);
            } else {
                View m5775n2 = m5775n2();
                c0965d.f3345f = m5591h0(m5775n2);
                c0965d.f3346g = this.f3317u.mo5160g(m5775n2) - this.f3317u.mo5154m();
            }
        } else {
            c0965d.m5749b();
        }
        return c0965d;
    }

    /* renamed from: d2 */
    View m5785d2(int i, int i2) {
        int i3;
        int i4;
        m5795T1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m5634I(i);
        }
        if (this.f3317u.mo5160g(m5634I(i)) < this.f3317u.mo5154m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f3315s == 0 ? this.f3411e : this.f3412f).m5099a(i, i2, i3, i4);
    }

    /* renamed from: e2 */
    View m5784e2(int i, int i2, boolean z, boolean z2) {
        m5795T1();
        return (this.f3315s == 0 ? this.f3411e : this.f3412f).m5099a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: g */
    public void mo5407g(String str) {
        if (this.f3310D == null) {
            super.mo5407g(str);
        }
    }

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
            if (m5591h0 >= 0 && m5591h0 < i3) {
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
    /* renamed from: k */
    public boolean mo5402k() {
        return this.f3315s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: l */
    public boolean mo5399l() {
        return this.f3315s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: o */
    public void mo5394o(int i, int i2, RecyclerView.C0968a0 c0968a0, RecyclerView.AbstractC0988o.InterfaceC0991c interfaceC0991c) {
        if (this.f3315s != 0) {
            i = i2;
        }
        if (m5633J() == 0 || i == 0) {
            return;
        }
        m5795T1();
        m5806I2(i > 0 ? 1 : -1, Math.abs(i), true, c0968a0);
        mo5801N1(c0968a0, this.f3316t, interfaceC0991c);
    }

    @Deprecated
    /* renamed from: o2 */
    protected int m5774o2(RecyclerView.C0968a0 c0968a0) {
        if (c0968a0.m5743d()) {
            return this.f3317u.mo5153n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: p */
    public void mo5573p(int i, RecyclerView.AbstractC0988o.InterfaceC0991c interfaceC0991c) {
        boolean z;
        int i2;
        C0965d c0965d = this.f3310D;
        if (c0965d == null || !c0965d.m5750a()) {
            m5814A2();
            z = this.f3320x;
            i2 = this.f3307A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0965d c0965d2 = this.f3310D;
            z = c0965d2.f3347h;
            i2 = c0965d2.f3345f;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f3313G && i2 >= 0 && i2 < i; i4++) {
            interfaceC0991c.mo5203a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: p2 */
    public int m5773p2() {
        return this.f3315s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: q */
    public int mo5391q(RecyclerView.C0968a0 c0968a0) {
        return m5800O1(c0968a0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q2 */
    public boolean m5772q2() {
        return m5610Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: r */
    public int mo5389r(RecyclerView.C0968a0 c0968a0) {
        return m5799P1(c0968a0);
    }

    /* renamed from: r2 */
    public boolean m5771r2() {
        return this.f3322z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: s */
    public int mo5387s(RecyclerView.C0968a0 c0968a0) {
        return m5798Q1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: s0 */
    public boolean mo5386s0() {
        return true;
    }

    /* renamed from: s2 */
    void mo5770s2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, C0964c c0964c, C0963b c0963b) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo5161f;
        View m5753d = c0964c.m5753d(c1000v);
        if (m5753d == null) {
            c0963b.f3329b = true;
            return;
        }
        RecyclerView.C0993p c0993p = (RecyclerView.C0993p) m5753d.getLayoutParams();
        if (c0964c.f3343l == null) {
            if (this.f3320x == (c0964c.f3337f == -1)) {
                m5601d(m5753d);
            } else {
                m5599e(m5753d, 0);
            }
        } else {
            if (this.f3320x == (c0964c.f3337f == -1)) {
                m5606b(m5753d);
            } else {
                m5603c(m5753d, 0);
            }
        }
        m5651A0(m5753d, 0, 0);
        c0963b.f3328a = this.f3317u.mo5162e(m5753d);
        if (this.f3315s == 1) {
            if (m5772q2()) {
                mo5161f = m5575o0() - m5596f0();
                i4 = mo5161f - this.f3317u.mo5161f(m5753d);
            } else {
                i4 = m5598e0();
                mo5161f = this.f3317u.mo5161f(m5753d) + i4;
            }
            int i5 = c0964c.f3337f;
            int i6 = c0964c.f3333b;
            if (i5 == -1) {
                i3 = i6;
                i2 = mo5161f;
                i = i6 - c0963b.f3328a;
            } else {
                i = i6;
                i2 = mo5161f;
                i3 = c0963b.f3328a + i6;
            }
        } else {
            int m5594g0 = m5594g0();
            int mo5161f2 = this.f3317u.mo5161f(m5753d) + m5594g0;
            int i7 = c0964c.f3337f;
            int i8 = c0964c.f3333b;
            if (i7 == -1) {
                i2 = i8;
                i = m5594g0;
                i3 = mo5161f2;
                i4 = i8 - c0963b.f3328a;
            } else {
                i = m5594g0;
                i2 = c0963b.f3328a + i8;
                i3 = mo5161f2;
                i4 = i8;
            }
        }
        m5552z0(m5753d, i4, i, i2, i3);
        if (c0993p.m5548c() || c0993p.m5549b()) {
            c0963b.f3330c = true;
        }
        c0963b.f3331d = m5753d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: t */
    public int mo5384t(RecyclerView.C0968a0 c0968a0) {
        return m5800O1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: u */
    public int mo5382u(RecyclerView.C0968a0 c0968a0) {
        return m5799P1(c0968a0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo5768u2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, C0962a c0962a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: v */
    public int mo5380v(RecyclerView.C0968a0 c0968a0) {
        return m5798Q1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: w1 */
    public int mo5378w1(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (this.f3315s == 1) {
            return 0;
        }
        return m5813B2(i, c1000v, c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: x1 */
    public void mo5376x1(int i) {
        this.f3307A = i;
        this.f3308B = RecyclerView.UNDEFINED_DURATION;
        C0965d c0965d = this.f3310D;
        if (c0965d != null) {
            c0965d.m5749b();
        }
        m5564t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: y1 */
    public int mo5374y1(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (this.f3315s == 0) {
            return 0;
        }
        return m5813B2(i, c1000v, c0968a0);
    }

    /* renamed from: z2 */
    boolean m5763z2() {
        return this.f3317u.mo5156k() == 0 && this.f3317u.mo5159h() == 0;
    }
}
