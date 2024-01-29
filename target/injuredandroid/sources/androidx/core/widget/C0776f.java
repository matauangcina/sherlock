package androidx.core.widget;

import android.widget.ListView;
/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public class C0776f extends AbstractView$OnTouchListenerC0769a {

    /* renamed from: x */
    private final ListView f2766x;

    public C0776f(ListView listView) {
        super(listView);
        this.f2766x = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0769a
    /* renamed from: a */
    public boolean mo6648a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0769a
    /* renamed from: b */
    public boolean mo6647b(int i) {
        ListView listView = this.f2766x;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0769a
    /* renamed from: j */
    public void mo6646j(int i, int i2) {
        C0777g.m6645a(this.f2766x, i2);
    }
}
