package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0527p;
import androidx.core.widget.C0778h;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.reflect.Method;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
public class C0610j0 implements InterfaceC0527p {

    /* renamed from: K */
    private static Method f2056K;

    /* renamed from: L */
    private static Method f2057L;

    /* renamed from: M */
    private static Method f2058M;

    /* renamed from: A */
    private AdapterView.OnItemSelectedListener f2059A;

    /* renamed from: B */
    final RunnableC0616f f2060B;

    /* renamed from: C */
    private final View$OnTouchListenerC0615e f2061C;

    /* renamed from: D */
    private final C0614d f2062D;

    /* renamed from: E */
    private final RunnableC0612b f2063E;

    /* renamed from: F */
    final Handler f2064F;

    /* renamed from: G */
    private final Rect f2065G;

    /* renamed from: H */
    private Rect f2066H;

    /* renamed from: I */
    private boolean f2067I;

    /* renamed from: J */
    PopupWindow f2068J;

    /* renamed from: f */
    private Context f2069f;

    /* renamed from: g */
    private ListAdapter f2070g;

    /* renamed from: h */
    C0595f0 f2071h;

    /* renamed from: i */
    private int f2072i;

    /* renamed from: j */
    private int f2073j;

    /* renamed from: k */
    private int f2074k;

    /* renamed from: l */
    private int f2075l;

    /* renamed from: m */
    private int f2076m;

    /* renamed from: n */
    private boolean f2077n;

    /* renamed from: o */
    private boolean f2078o;

    /* renamed from: p */
    private boolean f2079p;

    /* renamed from: q */
    private int f2080q;

    /* renamed from: r */
    private boolean f2081r;

    /* renamed from: s */
    private boolean f2082s;

    /* renamed from: t */
    int f2083t;

    /* renamed from: u */
    private View f2084u;

    /* renamed from: v */
    private int f2085v;

    /* renamed from: w */
    private DataSetObserver f2086w;

    /* renamed from: x */
    private View f2087x;

    /* renamed from: y */
    private Drawable f2088y;

    /* renamed from: z */
    private AdapterView.OnItemClickListener f2089z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j0$a */
    /* loaded from: classes.dex */
    public class C0611a implements AdapterView.OnItemSelectedListener {
        C0611a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0595f0 c0595f0;
            if (i == -1 || (c0595f0 = C0610j0.this.f2071h) == null) {
                return;
            }
            c0595f0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$b */
    /* loaded from: classes.dex */
    public class RunnableC0612b implements Runnable {
        RunnableC0612b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0610j0.this.m7373r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$c */
    /* loaded from: classes.dex */
    public class C0613c extends DataSetObserver {
        C0613c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0610j0.this.mo7381c()) {
                C0610j0.this.mo7383a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0610j0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$d */
    /* loaded from: classes.dex */
    public class C0614d implements AbsListView.OnScrollListener {
        C0614d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0610j0.this.m7369w() || C0610j0.this.f2068J.getContentView() == null) {
                return;
            }
            C0610j0 c0610j0 = C0610j0.this;
            c0610j0.f2064F.removeCallbacks(c0610j0.f2060B);
            C0610j0.this.f2060B.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$e */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0615e implements View.OnTouchListener {
        View$OnTouchListenerC0615e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0610j0.this.f2068J) != null && popupWindow.isShowing() && x >= 0 && x < C0610j0.this.f2068J.getWidth() && y >= 0 && y < C0610j0.this.f2068J.getHeight()) {
                C0610j0 c0610j0 = C0610j0.this;
                c0610j0.f2064F.postDelayed(c0610j0.f2060B, 250L);
                return false;
            } else if (action == 1) {
                C0610j0 c0610j02 = C0610j0.this;
                c0610j02.f2064F.removeCallbacks(c0610j02.f2060B);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$f */
    /* loaded from: classes.dex */
    public class RunnableC0616f implements Runnable {
        RunnableC0616f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0595f0 c0595f0 = C0610j0.this.f2071h;
            if (c0595f0 == null || !C0252s.m8651L(c0595f0) || C0610j0.this.f2071h.getCount() <= C0610j0.this.f2071h.getChildCount()) {
                return;
            }
            int childCount = C0610j0.this.f2071h.getChildCount();
            C0610j0 c0610j0 = C0610j0.this;
            if (childCount <= c0610j0.f2083t) {
                c0610j0.f2068J.setInputMethodMode(2);
                C0610j0.this.mo7383a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2056K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2058M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2057L = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0610j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0610j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2072i = -2;
        this.f2073j = -2;
        this.f2076m = 1002;
        this.f2080q = 0;
        this.f2081r = false;
        this.f2082s = false;
        this.f2083t = Reader.READ_DONE;
        this.f2085v = 0;
        this.f2060B = new RunnableC0616f();
        this.f2061C = new View$OnTouchListenerC0615e();
        this.f2062D = new C0614d();
        this.f2063E = new RunnableC0612b();
        this.f2065G = new Rect();
        this.f2069f = context;
        this.f2064F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ListPopupWindow, i, i2);
        this.f2074k = obtainStyledAttributes.getDimensionPixelOffset(C0009j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0009j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f2075l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2077n = true;
        }
        obtainStyledAttributes.recycle();
        C0640q c0640q = new C0640q(context, attributeSet, i, i2);
        this.f2068J = c0640q;
        c0640q.setInputMethodMode(1);
    }

    /* renamed from: J */
    private void m7387J(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f2068J.setIsClippedToScreen(z);
            return;
        }
        Method method = f2056K;
        if (method != null) {
            try {
                method.invoke(this.f2068J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m7374q() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0610j0.m7374q():int");
    }

    /* renamed from: u */
    private int m7371u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2057L;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f2068J, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f2068J.getMaxAvailableHeight(view, i);
        }
        return this.f2068J.getMaxAvailableHeight(view, i, z);
    }

    /* renamed from: y */
    private void m7367y() {
        View view = this.f2084u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2084u);
            }
        }
    }

    /* renamed from: A */
    public void m7396A(int i) {
        this.f2068J.setAnimationStyle(i);
    }

    /* renamed from: B */
    public void m7395B(int i) {
        Drawable background = this.f2068J.getBackground();
        if (background == null) {
            m7384M(i);
            return;
        }
        background.getPadding(this.f2065G);
        Rect rect = this.f2065G;
        this.f2073j = rect.left + rect.right + i;
    }

    /* renamed from: C */
    public void m7394C(int i) {
        this.f2080q = i;
    }

    /* renamed from: D */
    public void m7393D(Rect rect) {
        this.f2066H = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: E */
    public void m7392E(int i) {
        this.f2068J.setInputMethodMode(i);
    }

    /* renamed from: F */
    public void m7391F(boolean z) {
        this.f2067I = z;
        this.f2068J.setFocusable(z);
    }

    /* renamed from: G */
    public void m7390G(PopupWindow.OnDismissListener onDismissListener) {
        this.f2068J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: H */
    public void m7389H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2089z = onItemClickListener;
    }

    /* renamed from: I */
    public void m7388I(boolean z) {
        this.f2079p = true;
        this.f2078o = z;
    }

    /* renamed from: K */
    public void m7386K(int i) {
        this.f2085v = i;
    }

    /* renamed from: L */
    public void m7385L(int i) {
        C0595f0 c0595f0 = this.f2071h;
        if (!mo7381c() || c0595f0 == null) {
            return;
        }
        c0595f0.setListSelectionHidden(false);
        c0595f0.setSelection(i);
        if (c0595f0.getChoiceMode() != 0) {
            c0595f0.setItemChecked(i, true);
        }
    }

    /* renamed from: M */
    public void m7384M(int i) {
        this.f2073j = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: a */
    public void mo7383a() {
        int m7374q = m7374q();
        boolean m7369w = m7369w();
        C0778h.m6643b(this.f2068J, this.f2076m);
        boolean z = true;
        if (this.f2068J.isShowing()) {
            if (C0252s.m8651L(m7372t())) {
                int i = this.f2073j;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m7372t().getWidth();
                }
                int i2 = this.f2072i;
                if (i2 == -1) {
                    if (!m7369w) {
                        m7374q = -1;
                    }
                    if (m7369w) {
                        this.f2068J.setWidth(this.f2073j == -1 ? -1 : 0);
                        this.f2068J.setHeight(0);
                    } else {
                        this.f2068J.setWidth(this.f2073j == -1 ? -1 : 0);
                        this.f2068J.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m7374q = i2;
                }
                this.f2068J.setOutsideTouchable((this.f2082s || this.f2081r) ? false : false);
                this.f2068J.update(m7372t(), this.f2074k, this.f2075l, i < 0 ? -1 : i, m7374q < 0 ? -1 : m7374q);
                return;
            }
            return;
        }
        int i3 = this.f2073j;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m7372t().getWidth();
        }
        int i4 = this.f2072i;
        if (i4 == -1) {
            m7374q = -1;
        } else if (i4 != -2) {
            m7374q = i4;
        }
        this.f2068J.setWidth(i3);
        this.f2068J.setHeight(m7374q);
        m7387J(true);
        this.f2068J.setOutsideTouchable((this.f2082s || this.f2081r) ? false : true);
        this.f2068J.setTouchInterceptor(this.f2061C);
        if (this.f2079p) {
            C0778h.m6644a(this.f2068J, this.f2078o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2058M;
            if (method != null) {
                try {
                    method.invoke(this.f2068J, this.f2066H);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.f2068J.setEpicenterBounds(this.f2066H);
        }
        C0778h.m6642c(this.f2068J, m7372t(), this.f2074k, this.f2075l, this.f2080q);
        this.f2071h.setSelection(-1);
        if (!this.f2067I || this.f2071h.isInTouchMode()) {
            m7373r();
        }
        if (this.f2067I) {
            return;
        }
        this.f2064F.post(this.f2063E);
    }

    /* renamed from: b */
    public void m7382b(Drawable drawable) {
        this.f2068J.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: c */
    public boolean mo7381c() {
        return this.f2068J.isShowing();
    }

    /* renamed from: d */
    public int m7380d() {
        return this.f2074k;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    public void dismiss() {
        this.f2068J.dismiss();
        m7367y();
        this.f2068J.setContentView(null);
        this.f2071h = null;
        this.f2064F.removeCallbacks(this.f2060B);
    }

    /* renamed from: g */
    public Drawable m7379g() {
        return this.f2068J.getBackground();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: h */
    public ListView mo7378h() {
        return this.f2071h;
    }

    /* renamed from: j */
    public void m7377j(int i) {
        this.f2075l = i;
        this.f2077n = true;
    }

    /* renamed from: l */
    public void m7376l(int i) {
        this.f2074k = i;
    }

    /* renamed from: n */
    public int m7375n() {
        if (this.f2077n) {
            return this.f2075l;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo7234p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2086w;
        if (dataSetObserver == null) {
            this.f2086w = new C0613c();
        } else {
            ListAdapter listAdapter2 = this.f2070g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2070g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2086w);
        }
        C0595f0 c0595f0 = this.f2071h;
        if (c0595f0 != null) {
            c0595f0.setAdapter(this.f2070g);
        }
    }

    /* renamed from: r */
    public void m7373r() {
        C0595f0 c0595f0 = this.f2071h;
        if (c0595f0 != null) {
            c0595f0.setListSelectionHidden(true);
            c0595f0.requestLayout();
        }
    }

    /* renamed from: s */
    C0595f0 mo7358s(Context context, boolean z) {
        return new C0595f0(context, z);
    }

    /* renamed from: t */
    public View m7372t() {
        return this.f2087x;
    }

    /* renamed from: v */
    public int m7370v() {
        return this.f2073j;
    }

    /* renamed from: w */
    public boolean m7369w() {
        return this.f2068J.getInputMethodMode() == 2;
    }

    /* renamed from: x */
    public boolean m7368x() {
        return this.f2067I;
    }

    /* renamed from: z */
    public void m7366z(View view) {
        this.f2087x = view;
    }
}
