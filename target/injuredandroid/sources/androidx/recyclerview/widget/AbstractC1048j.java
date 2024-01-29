package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC1048j {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0988o f3662a;

    /* renamed from: b */
    private int f3663b;

    /* renamed from: c */
    final Rect f3664c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    public static class C1049a extends AbstractC1048j {
        C1049a(RecyclerView.AbstractC0988o abstractC0988o) {
            super(abstractC0988o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: d */
        public int mo5163d(View view) {
            return this.f3662a.m5617T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0993p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: e */
        public int mo5162e(View view) {
            RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
            return this.f3662a.m5618S(view) + ((ViewGroup.MarginLayoutParams) c0993p).leftMargin + ((ViewGroup.MarginLayoutParams) c0993p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: f */
        public int mo5161f(View view) {
            RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
            return this.f3662a.m5619R(view) + ((ViewGroup.MarginLayoutParams) c0993p).topMargin + ((ViewGroup.MarginLayoutParams) c0993p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: g */
        public int mo5160g(View view) {
            return this.f3662a.m5621Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0993p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: h */
        public int mo5159h() {
            return this.f3662a.m5575o0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: i */
        public int mo5158i() {
            return this.f3662a.m5575o0() - this.f3662a.m5596f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: j */
        public int mo5157j() {
            return this.f3662a.m5596f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: k */
        public int mo5156k() {
            return this.f3662a.m5572p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: l */
        public int mo5155l() {
            return this.f3662a.m5612X();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: m */
        public int mo5154m() {
            return this.f3662a.m5598e0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: n */
        public int mo5153n() {
            return (this.f3662a.m5575o0() - this.f3662a.m5598e0()) - this.f3662a.m5596f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: p */
        public int mo5152p(View view) {
            this.f3662a.m5577n0(view, true, this.f3664c);
            return this.f3664c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: q */
        public int mo5151q(View view) {
            this.f3662a.m5577n0(view, true, this.f3664c);
            return this.f3664c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: r */
        public void mo5150r(int i) {
            this.f3662a.mo5466C0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    public static class C1050b extends AbstractC1048j {
        C1050b(RecyclerView.AbstractC0988o abstractC0988o) {
            super(abstractC0988o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: d */
        public int mo5163d(View view) {
            return this.f3662a.m5624O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0993p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: e */
        public int mo5162e(View view) {
            RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
            return this.f3662a.m5619R(view) + ((ViewGroup.MarginLayoutParams) c0993p).topMargin + ((ViewGroup.MarginLayoutParams) c0993p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: f */
        public int mo5161f(View view) {
            RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
            return this.f3662a.m5618S(view) + ((ViewGroup.MarginLayoutParams) c0993p).leftMargin + ((ViewGroup.MarginLayoutParams) c0993p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: g */
        public int mo5160g(View view) {
            return this.f3662a.m5616U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0993p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: h */
        public int mo5159h() {
            return this.f3662a.m5613W();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: i */
        public int mo5158i() {
            return this.f3662a.m5613W() - this.f3662a.m5600d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: j */
        public int mo5157j() {
            return this.f3662a.m5600d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: k */
        public int mo5156k() {
            return this.f3662a.m5612X();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: l */
        public int mo5155l() {
            return this.f3662a.m5572p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: m */
        public int mo5154m() {
            return this.f3662a.m5594g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: n */
        public int mo5153n() {
            return (this.f3662a.m5613W() - this.f3662a.m5594g0()) - this.f3662a.m5600d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: p */
        public int mo5152p(View view) {
            this.f3662a.m5577n0(view, true, this.f3664c);
            return this.f3664c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: q */
        public int mo5151q(View view) {
            this.f3662a.m5577n0(view, true, this.f3664c);
            return this.f3664c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1048j
        /* renamed from: r */
        public void mo5150r(int i) {
            this.f3662a.mo5462D0(i);
        }
    }

    private AbstractC1048j(RecyclerView.AbstractC0988o abstractC0988o) {
        this.f3663b = RecyclerView.UNDEFINED_DURATION;
        this.f3664c = new Rect();
        this.f3662a = abstractC0988o;
    }

    /* synthetic */ AbstractC1048j(RecyclerView.AbstractC0988o abstractC0988o, C1049a c1049a) {
        this(abstractC0988o);
    }

    /* renamed from: a */
    public static AbstractC1048j m5168a(RecyclerView.AbstractC0988o abstractC0988o) {
        return new C1049a(abstractC0988o);
    }

    /* renamed from: b */
    public static AbstractC1048j m5167b(RecyclerView.AbstractC0988o abstractC0988o, int i) {
        if (i != 0) {
            if (i == 1) {
                return m5166c(abstractC0988o);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m5168a(abstractC0988o);
    }

    /* renamed from: c */
    public static AbstractC1048j m5166c(RecyclerView.AbstractC0988o abstractC0988o) {
        return new C1050b(abstractC0988o);
    }

    /* renamed from: d */
    public abstract int mo5163d(View view);

    /* renamed from: e */
    public abstract int mo5162e(View view);

    /* renamed from: f */
    public abstract int mo5161f(View view);

    /* renamed from: g */
    public abstract int mo5160g(View view);

    /* renamed from: h */
    public abstract int mo5159h();

    /* renamed from: i */
    public abstract int mo5158i();

    /* renamed from: j */
    public abstract int mo5157j();

    /* renamed from: k */
    public abstract int mo5156k();

    /* renamed from: l */
    public abstract int mo5155l();

    /* renamed from: m */
    public abstract int mo5154m();

    /* renamed from: n */
    public abstract int mo5153n();

    /* renamed from: o */
    public int m5165o() {
        if (Integer.MIN_VALUE == this.f3663b) {
            return 0;
        }
        return mo5153n() - this.f3663b;
    }

    /* renamed from: p */
    public abstract int mo5152p(View view);

    /* renamed from: q */
    public abstract int mo5151q(View view);

    /* renamed from: r */
    public abstract void mo5150r(int i);

    /* renamed from: s */
    public void m5164s() {
        this.f3663b = mo5153n();
    }
}
