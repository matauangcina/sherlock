package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public abstract class AbstractC1054m extends RecyclerView.AbstractC0982l {

    /* renamed from: g */
    boolean f3669g = true;

    /* renamed from: A */
    public final void m5137A(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5129I(abstractC0974d0);
        m5671h(abstractC0974d0);
    }

    /* renamed from: B */
    public final void m5136B(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5128J(abstractC0974d0);
    }

    /* renamed from: C */
    public final void m5135C(RecyclerView.AbstractC0974d0 abstractC0974d0, boolean z) {
        m5127K(abstractC0974d0, z);
        m5671h(abstractC0974d0);
    }

    /* renamed from: D */
    public final void m5134D(RecyclerView.AbstractC0974d0 abstractC0974d0, boolean z) {
        m5126L(abstractC0974d0, z);
    }

    /* renamed from: E */
    public final void m5133E(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5125M(abstractC0974d0);
        m5671h(abstractC0974d0);
    }

    /* renamed from: F */
    public final void m5132F(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5124N(abstractC0974d0);
    }

    /* renamed from: G */
    public final void m5131G(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5123O(abstractC0974d0);
        m5671h(abstractC0974d0);
    }

    /* renamed from: H */
    public final void m5130H(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5122P(abstractC0974d0);
    }

    /* renamed from: I */
    public void m5129I(RecyclerView.AbstractC0974d0 abstractC0974d0) {
    }

    /* renamed from: J */
    public void m5128J(RecyclerView.AbstractC0974d0 abstractC0974d0) {
    }

    /* renamed from: K */
    public void m5127K(RecyclerView.AbstractC0974d0 abstractC0974d0, boolean z) {
    }

    /* renamed from: L */
    public void m5126L(RecyclerView.AbstractC0974d0 abstractC0974d0, boolean z) {
    }

    /* renamed from: M */
    public void m5125M(RecyclerView.AbstractC0974d0 abstractC0974d0) {
    }

    /* renamed from: N */
    public void m5124N(RecyclerView.AbstractC0974d0 abstractC0974d0) {
    }

    /* renamed from: O */
    public void m5123O(RecyclerView.AbstractC0974d0 abstractC0974d0) {
    }

    /* renamed from: P */
    public void m5122P(RecyclerView.AbstractC0974d0 abstractC0974d0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: a */
    public boolean mo5121a(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2) {
        return (c0985c == null || (c0985c.f3404a == c0985c2.f3404a && c0985c.f3405b == c0985c2.f3405b)) ? mo5116w(abstractC0974d0) : mo5114y(abstractC0974d0, c0985c.f3404a, c0985c.f3405b, c0985c2.f3404a, c0985c2.f3405b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: b */
    public boolean mo5120b(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0974d0 abstractC0974d02, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2) {
        int i;
        int i2;
        int i3 = c0985c.f3404a;
        int i4 = c0985c.f3405b;
        if (abstractC0974d02.m5722J()) {
            int i5 = c0985c.f3404a;
            i2 = c0985c.f3405b;
            i = i5;
        } else {
            i = c0985c2.f3404a;
            i2 = c0985c2.f3405b;
        }
        return mo5115x(abstractC0974d0, abstractC0974d02, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: c */
    public boolean mo5119c(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2) {
        int i = c0985c.f3404a;
        int i2 = c0985c.f3405b;
        View view = abstractC0974d0.f3376a;
        int left = c0985c2 == null ? view.getLeft() : c0985c2.f3404a;
        int top = c0985c2 == null ? view.getTop() : c0985c2.f3405b;
        if (abstractC0974d0.m5698v() || (i == left && i2 == top)) {
            return mo5113z(abstractC0974d0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5114y(abstractC0974d0, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: d */
    public boolean mo5118d(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2) {
        if (c0985c.f3404a == c0985c2.f3404a && c0985c.f3405b == c0985c2.f3405b) {
            m5133E(abstractC0974d0);
            return false;
        }
        return mo5114y(abstractC0974d0, c0985c.f3404a, c0985c.f3405b, c0985c2.f3404a, c0985c2.f3405b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: f */
    public boolean mo5117f(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        return !this.f3669g || abstractC0974d0.m5700t();
    }

    /* renamed from: w */
    public abstract boolean mo5116w(RecyclerView.AbstractC0974d0 abstractC0974d0);

    /* renamed from: x */
    public abstract boolean mo5115x(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0974d0 abstractC0974d02, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo5114y(RecyclerView.AbstractC0974d0 abstractC0974d0, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo5113z(RecyclerView.AbstractC0974d0 abstractC0974d0);
}
