package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C1044g extends RecyclerView.AbstractC1005z {

    /* renamed from: k */
    protected PointF f3653k;

    /* renamed from: l */
    private final DisplayMetrics f3654l;

    /* renamed from: n */
    private float f3656n;

    /* renamed from: i */
    protected final LinearInterpolator f3651i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f3652j = new DecelerateInterpolator();

    /* renamed from: m */
    private boolean f3655m = false;

    /* renamed from: o */
    protected int f3657o = 0;

    /* renamed from: p */
    protected int f3658p = 0;

    public C1044g(Context context) {
        this.f3654l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m5195A() {
        if (!this.f3655m) {
            this.f3656n = mo2973v(this.f3654l);
            this.f3655m = true;
        }
        return this.f3656n;
    }

    /* renamed from: y */
    private int m5184y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: B */
    protected int m5194B() {
        PointF pointF = this.f3653k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    protected void m5193C(RecyclerView.AbstractC1005z.C1006a c1006a) {
        PointF m5487a = m5487a(m5482f());
        if (m5487a == null || (m5487a.x == 0.0f && m5487a.y == 0.0f)) {
            c1006a.m5472b(m5482f());
            m5474r();
            return;
        }
        m5479i(m5487a);
        this.f3653k = m5487a;
        this.f3657o = (int) (m5487a.x * 10000.0f);
        this.f3658p = (int) (m5487a.y * 10000.0f);
        c1006a.m5470d((int) (this.f3657o * 1.2f), (int) (this.f3658p * 1.2f), (int) (m5185x(10000) * 1.2f), this.f3651i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1005z
    /* renamed from: l */
    protected void mo5192l(int i, int i2, RecyclerView.C0968a0 c0968a0, RecyclerView.AbstractC1005z.C1006a c1006a) {
        if (m5485c() == 0) {
            m5474r();
            return;
        }
        this.f3657o = m5184y(this.f3657o, i);
        int m5184y = m5184y(this.f3658p, i2);
        this.f3658p = m5184y;
        if (this.f3657o == 0 && m5184y == 0) {
            m5193C(c1006a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1005z
    /* renamed from: m */
    protected void mo5191m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1005z
    /* renamed from: n */
    protected void mo5190n() {
        this.f3658p = 0;
        this.f3657o = 0;
        this.f3653k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1005z
    /* renamed from: o */
    protected void mo5100o(View view, RecyclerView.C0968a0 c0968a0, RecyclerView.AbstractC1005z.C1006a c1006a) {
        int m5188t = m5188t(view, m5183z());
        int m5187u = m5187u(view, m5194B());
        int m5186w = m5186w((int) Math.sqrt((m5188t * m5188t) + (m5187u * m5187u)));
        if (m5186w > 0) {
            c1006a.m5470d(-m5188t, -m5187u, m5186w, this.f3652j);
        }
    }

    /* renamed from: s */
    public int m5189s(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* renamed from: t */
    public int m5188t(View view, int i) {
        RecyclerView.AbstractC0988o m5483e = m5483e();
        if (m5483e == null || !m5483e.mo5402k()) {
            return 0;
        }
        RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
        return m5189s(m5483e.m5621Q(view) - ((ViewGroup.MarginLayoutParams) c0993p).leftMargin, m5483e.m5617T(view) + ((ViewGroup.MarginLayoutParams) c0993p).rightMargin, m5483e.m5598e0(), m5483e.m5575o0() - m5483e.m5596f0(), i);
    }

    /* renamed from: u */
    public int m5187u(View view, int i) {
        RecyclerView.AbstractC0988o m5483e = m5483e();
        if (m5483e == null || !m5483e.mo5399l()) {
            return 0;
        }
        RecyclerView.C0993p c0993p = (RecyclerView.C0993p) view.getLayoutParams();
        return m5189s(m5483e.m5616U(view) - ((ViewGroup.MarginLayoutParams) c0993p).topMargin, m5483e.m5624O(view) + ((ViewGroup.MarginLayoutParams) c0993p).bottomMargin, m5483e.m5594g0(), m5483e.m5613W() - m5483e.m5600d0(), i);
    }

    /* renamed from: v */
    protected float mo2973v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public int m5186w(int i) {
        return (int) Math.ceil(m5185x(i) / 0.3356d);
    }

    /* renamed from: x */
    protected int m5185x(int i) {
        return (int) Math.ceil(Math.abs(i) * m5195A());
    }

    /* renamed from: z */
    protected int m5183z() {
        PointF pointF = this.f3653k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
