package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.widget.C0665w0;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0507g.InterfaceC0509b, InterfaceC0524n, AdapterView.OnItemClickListener {

    /* renamed from: h */
    private static final int[] f1480h = {16842964, 16843049};

    /* renamed from: f */
    private C0507g f1481f;

    /* renamed from: g */
    private int f1482g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0665w0 m7213u = C0665w0.m7213u(context, attributeSet, f1480h, i, 0);
        if (m7213u.m7216r(0)) {
            setBackgroundDrawable(m7213u.m7227g(0));
        }
        if (m7213u.m7216r(1)) {
            setDivider(m7213u.m7227g(1));
        }
        m7213u.m7212v();
    }

    @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0509b
    /* renamed from: a */
    public boolean mo7688a(C0511i c0511i) {
        return this.f1481f.m7848L(c0511i, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n
    /* renamed from: b */
    public void mo2797b(C0507g c0507g) {
        this.f1481f = c0507g;
    }

    public int getWindowAnimations() {
        return this.f1482g;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo7688a((C0511i) getAdapter().getItem(i));
    }
}
