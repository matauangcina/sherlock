package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p000a.p019g.p027j.C0190e;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p054b.p059c.p060a.p075b.C1344f;
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f5177f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes.dex */
    class C1762a extends C0195a {
        C1762a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            c0217c.m8775Y(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5177f = C1805r.m2962k();
        if (C1787i.m3017Q1(getContext())) {
            setNextFocusLeftId(C1344f.cancel_button);
            setNextFocusRightId(C1344f.confirm_button);
        }
        C0252s.m8625f0(this, new C1762a(this));
    }

    /* renamed from: a */
    private void m3099a(int i, Rect rect) {
        int m2993b;
        if (i == 33) {
            m2993b = getAdapter2().m2987h();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            m2993b = getAdapter2().m2993b();
        }
        setSelection(m2993b);
    }

    /* renamed from: c */
    private static int m3097c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m3096d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C1797m getAdapter2() {
        return (C1797m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m2994a;
        int m3097c;
        int m2994a2;
        int m3097c2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C1797m adapter2 = getAdapter2();
        InterfaceC1769d<?> interfaceC1769d = adapter2.f5278g;
        C1768c c1768c = adapter2.f5279h;
        Long item = adapter2.getItem(adapter2.m2993b());
        Long item2 = adapter2.getItem(adapter2.m2987h());
        for (C0190e<Long, Long> c0190e : interfaceC1769d.m3075f()) {
            Long l = c0190e.f642a;
            if (l != null) {
                if (c0190e.f643b == null) {
                    continue;
                } else {
                    long longValue = l.longValue();
                    long longValue2 = c0190e.f643b.longValue();
                    if (m3096d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        m2994a = adapter2.m2993b();
                        m3097c = adapter2.m2989f(m2994a) ? 0 : materialCalendarGridView.getChildAt(m2994a - 1).getRight();
                    } else {
                        materialCalendarGridView.f5177f.setTimeInMillis(longValue);
                        m2994a = adapter2.m2994a(materialCalendarGridView.f5177f.get(5));
                        m3097c = m3097c(materialCalendarGridView.getChildAt(m2994a));
                    }
                    if (longValue2 > item2.longValue()) {
                        m2994a2 = adapter2.m2987h();
                        m3097c2 = adapter2.m2988g(m2994a2) ? getWidth() : materialCalendarGridView.getChildAt(m2994a2).getRight();
                    } else {
                        materialCalendarGridView.f5177f.setTimeInMillis(longValue2);
                        m2994a2 = adapter2.m2994a(materialCalendarGridView.f5177f.get(5));
                        m3097c2 = m3097c(materialCalendarGridView.getChildAt(m2994a2));
                    }
                    int itemId = (int) adapter2.getItemId(m2994a);
                    int itemId2 = (int) adapter2.getItemId(m2994a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > m2994a ? 0 : m3097c, childAt.getTop() + c1768c.f5196a.m3079c(), m2994a2 > numColumns2 ? getWidth() : m3097c2, childAt.getBottom() - c1768c.f5196a.m3080b(), c1768c.f5203h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m3099a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m2993b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().m2993b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1797m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1797m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m2993b()) {
            i = getAdapter2().m2993b();
        }
        super.setSelection(i);
    }
}
