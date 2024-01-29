package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C1045h extends AbstractC1055n {

    /* renamed from: d */
    private AbstractC1048j f3659d;

    /* renamed from: e */
    private AbstractC1048j f3660e;

    /* renamed from: m */
    private float m5182m(RecyclerView.AbstractC0988o abstractC0988o, AbstractC1048j abstractC1048j) {
        int m5633J = abstractC0988o.m5633J();
        if (m5633J == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Reader.READ_DONE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < m5633J; i3++) {
            View m5634I = abstractC0988o.m5634I(i3);
            int m5591h0 = abstractC0988o.m5591h0(m5634I);
            if (m5591h0 != -1) {
                if (m5591h0 < i) {
                    view = m5634I;
                    i = m5591h0;
                }
                if (m5591h0 > i2) {
                    view2 = m5634I;
                    i2 = m5591h0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(abstractC1048j.mo5163d(view), abstractC1048j.mo5163d(view2)) - Math.min(abstractC1048j.mo5160g(view), abstractC1048j.mo5160g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    /* renamed from: n */
    private int m5181n(RecyclerView.AbstractC0988o abstractC0988o, View view, AbstractC1048j abstractC1048j) {
        return (abstractC1048j.mo5160g(view) + (abstractC1048j.mo5162e(view) / 2)) - (abstractC1048j.mo5154m() + (abstractC1048j.mo5153n() / 2));
    }

    /* renamed from: o */
    private int m5180o(RecyclerView.AbstractC0988o abstractC0988o, AbstractC1048j abstractC1048j, int i, int i2) {
        int[] m5109d = m5109d(i, i2);
        float m5182m = m5182m(abstractC0988o, abstractC1048j);
        if (m5182m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(m5109d[0]) > Math.abs(m5109d[1]) ? m5109d[0] : m5109d[1]) / m5182m);
    }

    /* renamed from: p */
    private View m5179p(RecyclerView.AbstractC0988o abstractC0988o, AbstractC1048j abstractC1048j) {
        int m5633J = abstractC0988o.m5633J();
        View view = null;
        if (m5633J == 0) {
            return null;
        }
        int mo5154m = abstractC1048j.mo5154m() + (abstractC1048j.mo5153n() / 2);
        int i = Reader.READ_DONE;
        for (int i2 = 0; i2 < m5633J; i2++) {
            View m5634I = abstractC0988o.m5634I(i2);
            int abs = Math.abs((abstractC1048j.mo5160g(m5634I) + (abstractC1048j.mo5162e(m5634I) / 2)) - mo5154m);
            if (abs < i) {
                view = m5634I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: q */
    private AbstractC1048j m5178q(RecyclerView.AbstractC0988o abstractC0988o) {
        AbstractC1048j abstractC1048j = this.f3660e;
        if (abstractC1048j == null || abstractC1048j.f3662a != abstractC0988o) {
            this.f3660e = AbstractC1048j.m5168a(abstractC0988o);
        }
        return this.f3660e;
    }

    /* renamed from: r */
    private AbstractC1048j m5177r(RecyclerView.AbstractC0988o abstractC0988o) {
        AbstractC1048j abstractC1048j = this.f3659d;
        if (abstractC1048j == null || abstractC1048j.f3662a != abstractC0988o) {
            this.f3659d = AbstractC1048j.m5166c(abstractC0988o);
        }
        return this.f3659d;
    }

    @Override // androidx.recyclerview.widget.AbstractC1055n
    /* renamed from: c */
    public int[] mo5110c(RecyclerView.AbstractC0988o abstractC0988o, View view) {
        int[] iArr = new int[2];
        if (abstractC0988o.mo5402k()) {
            iArr[0] = m5181n(abstractC0988o, view, m5178q(abstractC0988o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0988o.mo5399l()) {
            iArr[1] = m5181n(abstractC0988o, view, m5177r(abstractC0988o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1055n
    /* renamed from: h */
    public View mo5105h(RecyclerView.AbstractC0988o abstractC0988o) {
        AbstractC1048j m5178q;
        if (abstractC0988o.mo5399l()) {
            m5178q = m5177r(abstractC0988o);
        } else if (!abstractC0988o.mo5402k()) {
            return null;
        } else {
            m5178q = m5178q(abstractC0988o);
        }
        return m5179p(abstractC0988o, m5178q);
    }

    @Override // androidx.recyclerview.widget.AbstractC1055n
    /* renamed from: i */
    public int mo5104i(RecyclerView.AbstractC0988o abstractC0988o, int i, int i2) {
        int m5611Y;
        View mo5105h;
        int m5591h0;
        int i3;
        PointF mo5417a;
        int i4;
        int i5;
        if (!(abstractC0988o instanceof RecyclerView.AbstractC1005z.InterfaceC1007b) || (m5611Y = abstractC0988o.m5611Y()) == 0 || (mo5105h = mo5105h(abstractC0988o)) == null || (m5591h0 = abstractC0988o.m5591h0(mo5105h)) == -1 || (mo5417a = ((RecyclerView.AbstractC1005z.InterfaceC1007b) abstractC0988o).mo5417a(m5611Y - 1)) == null) {
            return -1;
        }
        if (abstractC0988o.mo5402k()) {
            i4 = m5180o(abstractC0988o, m5178q(abstractC0988o), i, 0);
            if (mo5417a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC0988o.mo5399l()) {
            i5 = m5180o(abstractC0988o, m5177r(abstractC0988o), 0, i2);
            if (mo5417a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (abstractC0988o.mo5399l()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = m5591h0 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= m5611Y ? i3 : i7;
    }
}
