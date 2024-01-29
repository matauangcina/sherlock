package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public abstract class AbstractC0519k implements InterfaceC0527p, InterfaceC0522m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f1657f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static int m7766o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public static boolean m7764x(C0507g c0507g) {
        int size = c0507g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0507g.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public static C0506f m7763y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0506f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0506f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: d */
    public void mo7515d(Context context, C0507g c0507g) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: i */
    public boolean mo7582i(C0507g c0507g, C0511i c0511i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: j */
    public boolean mo7581j(C0507g c0507g, C0511i c0511i) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo7749l(C0507g c0507g);

    /* renamed from: m */
    protected boolean mo7768m() {
        return true;
    }

    /* renamed from: n */
    public Rect m7767n() {
        return this.f1657f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m7763y(listAdapter).f1578f.m7847M((MenuItem) listAdapter.getItem(i), this, mo7768m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo7748p(View view);

    /* renamed from: q */
    public void m7765q(Rect rect) {
        this.f1657f = rect;
    }

    /* renamed from: r */
    public abstract void mo7747r(boolean z);

    /* renamed from: s */
    public abstract void mo7746s(int i);

    /* renamed from: t */
    public abstract void mo7745t(int i);

    /* renamed from: u */
    public abstract void mo7744u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo7743v(boolean z);

    /* renamed from: w */
    public abstract void mo7742w(int i);
}
