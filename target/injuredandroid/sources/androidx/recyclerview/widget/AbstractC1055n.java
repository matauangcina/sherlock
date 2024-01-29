package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC1055n extends RecyclerView.AbstractC0995r {

    /* renamed from: a */
    RecyclerView f3670a;

    /* renamed from: b */
    private Scroller f3671b;

    /* renamed from: c */
    private final RecyclerView.AbstractC0997t f3672c = new C1056a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: classes.dex */
    class C1056a extends RecyclerView.AbstractC0997t {

        /* renamed from: a */
        boolean f3673a = false;

        C1056a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0997t
        /* renamed from: a */
        public void mo3037a(RecyclerView recyclerView, int i) {
            super.mo3037a(recyclerView, i);
            if (i == 0 && this.f3673a) {
                this.f3673a = false;
                AbstractC1055n.this.m5101l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0997t
        /* renamed from: b */
        public void mo3036b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f3673a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.n$b */
    /* loaded from: classes.dex */
    public class C1057b extends C1044g {
        C1057b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1044g, androidx.recyclerview.widget.RecyclerView.AbstractC1005z
        /* renamed from: o */
        protected void mo5100o(View view, RecyclerView.C0968a0 c0968a0, RecyclerView.AbstractC1005z.C1006a c1006a) {
            AbstractC1055n abstractC1055n = AbstractC1055n.this;
            RecyclerView recyclerView = abstractC1055n.f3670a;
            if (recyclerView == null) {
                return;
            }
            int[] mo5110c = abstractC1055n.mo5110c(recyclerView.getLayoutManager(), view);
            int i = mo5110c[0];
            int i2 = mo5110c[1];
            int m5186w = m5186w(Math.max(Math.abs(i), Math.abs(i2)));
            if (m5186w > 0) {
                c1006a.m5470d(i, i2, m5186w, this.f3652j);
            }
        }

        @Override // androidx.recyclerview.widget.C1044g
        /* renamed from: v */
        protected float mo2973v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* renamed from: g */
    private void m5106g() {
        this.f3670a.removeOnScrollListener(this.f3672c);
        this.f3670a.setOnFlingListener(null);
    }

    /* renamed from: j */
    private void m5103j() {
        if (this.f3670a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3670a.addOnScrollListener(this.f3672c);
        this.f3670a.setOnFlingListener(this);
    }

    /* renamed from: k */
    private boolean m5102k(RecyclerView.AbstractC0988o abstractC0988o, int i, int i2) {
        RecyclerView.AbstractC1005z m5108e;
        int mo5104i;
        if (!(abstractC0988o instanceof RecyclerView.AbstractC1005z.InterfaceC1007b) || (m5108e = m5108e(abstractC0988o)) == null || (mo5104i = mo5104i(abstractC0988o, i, i2)) == -1) {
            return false;
        }
        m5108e.m5476p(mo5104i);
        abstractC0988o.m5632J1(m5108e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0995r
    /* renamed from: a */
    public boolean mo5112a(int i, int i2) {
        RecyclerView.AbstractC0988o layoutManager = this.f3670a.getLayoutManager();
        if (layoutManager == null || this.f3670a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3670a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5102k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void m5111b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3670a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5106g();
        }
        this.f3670a = recyclerView;
        if (recyclerView != null) {
            m5103j();
            this.f3671b = new Scroller(this.f3670a.getContext(), new DecelerateInterpolator());
            m5101l();
        }
    }

    /* renamed from: c */
    public abstract int[] mo5110c(RecyclerView.AbstractC0988o abstractC0988o, View view);

    /* renamed from: d */
    public int[] m5109d(int i, int i2) {
        this.f3671b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE);
        return new int[]{this.f3671b.getFinalX(), this.f3671b.getFinalY()};
    }

    /* renamed from: e */
    protected RecyclerView.AbstractC1005z m5108e(RecyclerView.AbstractC0988o abstractC0988o) {
        return m5107f(abstractC0988o);
    }

    @Deprecated
    /* renamed from: f */
    protected C1044g m5107f(RecyclerView.AbstractC0988o abstractC0988o) {
        if (abstractC0988o instanceof RecyclerView.AbstractC1005z.InterfaceC1007b) {
            return new C1057b(this.f3670a.getContext());
        }
        return null;
    }

    /* renamed from: h */
    public abstract View mo5105h(RecyclerView.AbstractC0988o abstractC0988o);

    /* renamed from: i */
    public abstract int mo5104i(RecyclerView.AbstractC0988o abstractC0988o, int i, int i2);

    /* renamed from: l */
    void m5101l() {
        RecyclerView.AbstractC0988o layoutManager;
        View mo5105h;
        RecyclerView recyclerView = this.f3670a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo5105h = mo5105h(layoutManager)) == null) {
            return;
        }
        int[] mo5110c = mo5110c(layoutManager, mo5105h);
        if (mo5110c[0] == 0 && mo5110c[1] == 0) {
            return;
        }
        this.f3670a.smoothScrollBy(mo5110c[0], mo5110c[1]);
    }
}
