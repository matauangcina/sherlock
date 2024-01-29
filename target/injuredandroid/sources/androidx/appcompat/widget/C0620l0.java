package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0506f;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.C0511i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public class C0620l0 extends C0610j0 implements InterfaceC0618k0 {

    /* renamed from: O */
    private static Method f2099O;

    /* renamed from: N */
    private InterfaceC0618k0 f2100N;

    /* renamed from: androidx.appcompat.widget.l0$a */
    /* loaded from: classes.dex */
    public static class C0621a extends C0595f0 {

        /* renamed from: t */
        final int f2101t;

        /* renamed from: u */
        final int f2102u;

        /* renamed from: v */
        private InterfaceC0618k0 f2103v;

        /* renamed from: w */
        private MenuItem f2104w;

        public C0621a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2101t = 22;
                this.f2102u = 21;
                return;
            }
            this.f2101t = 21;
            this.f2102u = 22;
        }

        @Override // androidx.appcompat.widget.C0595f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f2103v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0506f c0506f = (C0506f) adapter;
                C0511i c0511i = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0506f.getCount()) {
                    c0511i = c0506f.getItem(i2);
                }
                MenuItem menuItem = this.f2104w;
                if (menuItem != c0511i) {
                    C0507g m7858b = c0506f.m7858b();
                    if (menuItem != null) {
                        this.f2103v.mo7359f(m7858b, menuItem);
                    }
                    this.f2104w = c0511i;
                    if (c0511i != null) {
                        this.f2103v.mo7360e(m7858b, c0511i);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2101t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2102u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0506f) getAdapter()).m7858b().m7826e(false);
                return true;
            }
        }

        public void setHoverListener(InterfaceC0618k0 interfaceC0618k0) {
            this.f2103v = interfaceC0618k0;
        }

        @Override // androidx.appcompat.widget.C0595f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2099O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0620l0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: N */
    public void m7364N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2068J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: O */
    public void m7363O(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2068J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: P */
    public void m7362P(InterfaceC0618k0 interfaceC0618k0) {
        this.f2100N = interfaceC0618k0;
    }

    /* renamed from: Q */
    public void m7361Q(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f2068J.setTouchModal(z);
            return;
        }
        Method method = f2099O;
        if (method != null) {
            try {
                method.invoke(this.f2068J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0618k0
    /* renamed from: e */
    public void mo7360e(C0507g c0507g, MenuItem menuItem) {
        InterfaceC0618k0 interfaceC0618k0 = this.f2100N;
        if (interfaceC0618k0 != null) {
            interfaceC0618k0.mo7360e(c0507g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0618k0
    /* renamed from: f */
    public void mo7359f(C0507g c0507g, MenuItem menuItem) {
        InterfaceC0618k0 interfaceC0618k0 = this.f2100N;
        if (interfaceC0618k0 != null) {
            interfaceC0618k0.mo7359f(c0507g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0610j0
    /* renamed from: s */
    C0595f0 mo7358s(Context context, boolean z) {
        C0621a c0621a = new C0621a(context, z);
        c0621a.setHoverListener(this);
        return c0621a;
    }
}
