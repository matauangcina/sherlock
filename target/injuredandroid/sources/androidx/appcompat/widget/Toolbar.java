package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0447a;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.C0511i;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.view.menu.SubMenuC0531r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0000a;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p001a.p007n.C0037g;
import p000a.p001a.p007n.InterfaceC0032c;
import p000a.p019g.p028k.C0236d;
import p000a.p019g.p028k.C0240g;
import p000a.p019g.p028k.C0252s;
import p000a.p032i.p033a.AbstractC0280a;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1860A;

    /* renamed from: B */
    private int f1861B;

    /* renamed from: C */
    private CharSequence f1862C;

    /* renamed from: D */
    private CharSequence f1863D;

    /* renamed from: E */
    private ColorStateList f1864E;

    /* renamed from: F */
    private ColorStateList f1865F;

    /* renamed from: G */
    private boolean f1866G;

    /* renamed from: H */
    private boolean f1867H;

    /* renamed from: I */
    private final ArrayList<View> f1868I;

    /* renamed from: J */
    private final ArrayList<View> f1869J;

    /* renamed from: K */
    private final int[] f1870K;

    /* renamed from: L */
    InterfaceC0568f f1871L;

    /* renamed from: M */
    private final ActionMenuView.InterfaceC0543e f1872M;

    /* renamed from: N */
    private C0667x0 f1873N;

    /* renamed from: O */
    private C0579c f1874O;

    /* renamed from: P */
    private C0566d f1875P;

    /* renamed from: Q */
    private InterfaceC0522m.InterfaceC0523a f1876Q;

    /* renamed from: R */
    private C0507g.InterfaceC0508a f1877R;

    /* renamed from: S */
    private boolean f1878S;

    /* renamed from: T */
    private final Runnable f1879T;

    /* renamed from: f */
    private ActionMenuView f1880f;

    /* renamed from: g */
    private TextView f1881g;

    /* renamed from: h */
    private TextView f1882h;

    /* renamed from: i */
    private ImageButton f1883i;

    /* renamed from: j */
    private ImageView f1884j;

    /* renamed from: k */
    private Drawable f1885k;

    /* renamed from: l */
    private CharSequence f1886l;

    /* renamed from: m */
    ImageButton f1887m;

    /* renamed from: n */
    View f1888n;

    /* renamed from: o */
    private Context f1889o;

    /* renamed from: p */
    private int f1890p;

    /* renamed from: q */
    private int f1891q;

    /* renamed from: r */
    private int f1892r;

    /* renamed from: s */
    int f1893s;

    /* renamed from: t */
    private int f1894t;

    /* renamed from: u */
    private int f1895u;

    /* renamed from: v */
    private int f1896v;

    /* renamed from: w */
    private int f1897w;

    /* renamed from: x */
    private int f1898x;

    /* renamed from: y */
    private C0633o0 f1899y;

    /* renamed from: z */
    private int f1900z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0563a implements ActionMenuView.InterfaceC0543e {
        C0563a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0543e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0568f interfaceC0568f = Toolbar.this.f1871L;
            if (interfaceC0568f != null) {
                return interfaceC0568f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0564b implements Runnable {
        RunnableC0564b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m7609O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0565c implements View.OnClickListener {
        View$OnClickListenerC0565c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m7604e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0566d implements InterfaceC0522m {

        /* renamed from: f */
        C0507g f1904f;

        /* renamed from: g */
        C0511i f1905g;

        C0566d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: b */
        public void mo7517b(C0507g c0507g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: d */
        public void mo7515d(Context context, C0507g c0507g) {
            C0511i c0511i;
            C0507g c0507g2 = this.f1904f;
            if (c0507g2 != null && (c0511i = this.f1905g) != null) {
                c0507g2.mo7734f(c0511i);
            }
            this.f1904f = c0507g;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: e */
        public boolean mo7514e(SubMenuC0531r subMenuC0531r) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: f */
        public void mo7513f(boolean z) {
            if (this.f1905g != null) {
                C0507g c0507g = this.f1904f;
                boolean z2 = false;
                if (c0507g != null) {
                    int size = c0507g.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1904f.getItem(i) == this.f1905g) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                mo7582i(this.f1904f, this.f1905g);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: g */
        public boolean mo7512g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: i */
        public boolean mo7582i(C0507g c0507g, C0511i c0511i) {
            View view = Toolbar.this.f1888n;
            if (view instanceof InterfaceC0032c) {
                ((InterfaceC0032c) view).mo7645f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1888n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1887m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1888n = null;
            toolbar3.m7608a();
            this.f1905g = null;
            Toolbar.this.requestLayout();
            c0511i.m7787r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: j */
        public boolean mo7581j(C0507g c0507g, C0511i c0511i) {
            Toolbar.this.m7602g();
            ViewParent parent = Toolbar.this.f1887m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1887m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1887m);
            }
            Toolbar.this.f1888n = c0511i.getActionView();
            this.f1905g = c0511i;
            ViewParent parent2 = Toolbar.this.f1888n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1888n);
                }
                C0567e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1288a = 8388611 | (toolbar4.f1893s & 112);
                generateDefaultLayoutParams.f1907b = 2;
                toolbar4.f1888n.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1888n);
            }
            Toolbar.this.m7617G();
            Toolbar.this.requestLayout();
            c0511i.m7787r(true);
            View view = Toolbar.this.f1888n;
            if (view instanceof InterfaceC0032c) {
                ((InterfaceC0032c) view).mo7649c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m
        /* renamed from: k */
        public void mo7580k(InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0567e extends AbstractC0447a.C0448a {

        /* renamed from: b */
        int f1907b;

        public C0567e(int i, int i2) {
            super(i, i2);
            this.f1907b = 0;
            this.f1288a = 8388627;
        }

        public C0567e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1907b = 0;
        }

        public C0567e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1907b = 0;
        }

        public C0567e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1907b = 0;
            m7579a(marginLayoutParams);
        }

        public C0567e(AbstractC0447a.C0448a c0448a) {
            super(c0448a);
            this.f1907b = 0;
        }

        public C0567e(C0567e c0567e) {
            super((AbstractC0447a.C0448a) c0567e);
            this.f1907b = 0;
            this.f1907b = c0567e.f1907b;
        }

        /* renamed from: a */
        void m7579a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0568f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0569g extends AbstractC0280a {
        public static final Parcelable.Creator<C0569g> CREATOR = new C0570a();

        /* renamed from: h */
        int f1908h;

        /* renamed from: i */
        boolean f1909i;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        static class C0570a implements Parcelable.ClassLoaderCreator<C0569g> {
            C0570a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0569g createFromParcel(Parcel parcel) {
                return new C0569g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0569g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0569g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0569g[] newArray(int i) {
                return new C0569g[i];
            }
        }

        public C0569g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1908h = parcel.readInt();
            this.f1909i = parcel.readInt() != 0;
        }

        public C0569g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1908h);
            parcel.writeInt(this.f1909i ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1861B = 8388627;
        this.f1868I = new ArrayList<>();
        this.f1869J = new ArrayList<>();
        this.f1870K = new int[2];
        this.f1872M = new C0563a();
        this.f1879T = new RunnableC0564b();
        C0665w0 m7213u = C0665w0.m7213u(getContext(), attributeSet, C0009j.Toolbar, i, 0);
        this.f1891q = m7213u.m7220n(C0009j.Toolbar_titleTextAppearance, 0);
        this.f1892r = m7213u.m7220n(C0009j.Toolbar_subtitleTextAppearance, 0);
        this.f1861B = m7213u.m7222l(C0009j.Toolbar_android_gravity, this.f1861B);
        this.f1893s = m7213u.m7222l(C0009j.Toolbar_buttonGravity, 48);
        int m7229e = m7213u.m7229e(C0009j.Toolbar_titleMargin, 0);
        m7229e = m7213u.m7216r(C0009j.Toolbar_titleMargins) ? m7213u.m7229e(C0009j.Toolbar_titleMargins, m7229e) : m7229e;
        this.f1898x = m7229e;
        this.f1897w = m7229e;
        this.f1896v = m7229e;
        this.f1895u = m7229e;
        int m7229e2 = m7213u.m7229e(C0009j.Toolbar_titleMarginStart, -1);
        if (m7229e2 >= 0) {
            this.f1895u = m7229e2;
        }
        int m7229e3 = m7213u.m7229e(C0009j.Toolbar_titleMarginEnd, -1);
        if (m7229e3 >= 0) {
            this.f1896v = m7229e3;
        }
        int m7229e4 = m7213u.m7229e(C0009j.Toolbar_titleMarginTop, -1);
        if (m7229e4 >= 0) {
            this.f1897w = m7229e4;
        }
        int m7229e5 = m7213u.m7229e(C0009j.Toolbar_titleMarginBottom, -1);
        if (m7229e5 >= 0) {
            this.f1898x = m7229e5;
        }
        this.f1894t = m7213u.m7228f(C0009j.Toolbar_maxButtonHeight, -1);
        int m7229e6 = m7213u.m7229e(C0009j.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int m7229e7 = m7213u.m7229e(C0009j.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int m7228f = m7213u.m7228f(C0009j.Toolbar_contentInsetLeft, 0);
        int m7228f2 = m7213u.m7228f(C0009j.Toolbar_contentInsetRight, 0);
        m7601h();
        this.f1899y.m7310e(m7228f, m7228f2);
        if (m7229e6 != Integer.MIN_VALUE || m7229e7 != Integer.MIN_VALUE) {
            this.f1899y.m7308g(m7229e6, m7229e7);
        }
        this.f1900z = m7213u.m7229e(C0009j.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.f1860A = m7213u.m7229e(C0009j.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.f1885k = m7213u.m7227g(C0009j.Toolbar_collapseIcon);
        this.f1886l = m7213u.m7218p(C0009j.Toolbar_collapseContentDescription);
        CharSequence m7218p = m7213u.m7218p(C0009j.Toolbar_title);
        if (!TextUtils.isEmpty(m7218p)) {
            setTitle(m7218p);
        }
        CharSequence m7218p2 = m7213u.m7218p(C0009j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m7218p2)) {
            setSubtitle(m7218p2);
        }
        this.f1889o = getContext();
        setPopupTheme(m7213u.m7220n(C0009j.Toolbar_popupTheme, 0));
        Drawable m7227g = m7213u.m7227g(C0009j.Toolbar_navigationIcon);
        if (m7227g != null) {
            setNavigationIcon(m7227g);
        }
        CharSequence m7218p3 = m7213u.m7218p(C0009j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m7218p3)) {
            setNavigationContentDescription(m7218p3);
        }
        Drawable m7227g2 = m7213u.m7227g(C0009j.Toolbar_logo);
        if (m7227g2 != null) {
            setLogo(m7227g2);
        }
        CharSequence m7218p4 = m7213u.m7218p(C0009j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m7218p4)) {
            setLogoDescription(m7218p4);
        }
        if (m7213u.m7216r(C0009j.Toolbar_titleTextColor)) {
            setTitleTextColor(m7213u.m7231c(C0009j.Toolbar_titleTextColor));
        }
        if (m7213u.m7216r(C0009j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m7213u.m7231c(C0009j.Toolbar_subtitleTextColor));
        }
        if (m7213u.m7216r(C0009j.Toolbar_menu)) {
            m7585x(m7213u.m7220n(C0009j.Toolbar_menu, 0));
        }
        m7213u.m7212v();
    }

    /* renamed from: B */
    private int m7622B(View view, int i, int[] iArr, int i2) {
        C0567e c0567e = (C0567e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0567e).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m7592q = m7592q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m7592q, max + measuredWidth, view.getMeasuredHeight() + m7592q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0567e).rightMargin;
    }

    /* renamed from: C */
    private int m7621C(View view, int i, int[] iArr, int i2) {
        C0567e c0567e = (C0567e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0567e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m7592q = m7592q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m7592q, max, view.getMeasuredHeight() + m7592q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0567e).leftMargin);
    }

    /* renamed from: D */
    private int m7620D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m7619E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m7618F() {
        removeCallbacks(this.f1879T);
        post(this.f1879T);
    }

    /* renamed from: M */
    private boolean m7611M() {
        if (this.f1878S) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (m7610N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private boolean m7610N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m7607b(List<View> list, int i) {
        boolean z = C0252s.m8592w(this) == 1;
        int childCount = getChildCount();
        int m8706b = C0236d.m8706b(i, C0252s.m8592w(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0567e c0567e = (C0567e) childAt.getLayoutParams();
                if (c0567e.f1907b == 0 && m7610N(childAt) && m7593p(c0567e.f1288a) == m8706b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0567e c0567e2 = (C0567e) childAt2.getLayoutParams();
            if (c0567e2.f1907b == 0 && m7610N(childAt2) && m7593p(c0567e2.f1288a) == m8706b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m7606c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0567e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0567e) layoutParams;
        generateDefaultLayoutParams.f1907b = 1;
        if (!z || this.f1888n == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f1869J.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0037g(getContext());
    }

    /* renamed from: h */
    private void m7601h() {
        if (this.f1899y == null) {
            this.f1899y = new C0633o0();
        }
    }

    /* renamed from: i */
    private void m7600i() {
        if (this.f1884j == null) {
            this.f1884j = new C0632o(getContext());
        }
    }

    /* renamed from: j */
    private void m7599j() {
        m7598k();
        if (this.f1880f.m7691N() == null) {
            C0507g c0507g = (C0507g) this.f1880f.getMenu();
            if (this.f1875P == null) {
                this.f1875P = new C0566d();
            }
            this.f1880f.setExpandedActionViewsExclusive(true);
            c0507g.m7830c(this.f1875P, this.f1889o);
        }
    }

    /* renamed from: k */
    private void m7598k() {
        if (this.f1880f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1880f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1890p);
            this.f1880f.setOnMenuItemClickListener(this.f1872M);
            this.f1880f.m7690O(this.f1876Q, this.f1877R);
            C0567e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1288a = 8388613 | (this.f1893s & 112);
            this.f1880f.setLayoutParams(generateDefaultLayoutParams);
            m7606c(this.f1880f, false);
        }
    }

    /* renamed from: l */
    private void m7597l() {
        if (this.f1883i == null) {
            this.f1883i = new C0622m(getContext(), null, C0000a.toolbarNavigationButtonStyle);
            C0567e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1288a = 8388611 | (this.f1893s & 112);
            this.f1883i.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: p */
    private int m7593p(int i) {
        int m8592w = C0252s.m8592w(this);
        int m8706b = C0236d.m8706b(i, m8592w) & 7;
        return (m8706b == 1 || m8706b == 3 || m8706b == 5) ? m8706b : m8592w == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m7592q(View view, int i) {
        C0567e c0567e = (C0567e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m7591r = m7591r(c0567e.f1288a);
        if (m7591r != 48) {
            if (m7591r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) c0567e).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) c0567e).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0567e).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: r */
    private int m7591r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1861B & 112;
    }

    /* renamed from: s */
    private int m7590s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0240g.m8696b(marginLayoutParams) + C0240g.m8697a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m7589t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m7588u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0567e c0567e = (C0567e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0567e).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c0567e).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m7584y(View view) {
        return view.getParent() == this || this.f1869J.contains(view);
    }

    /* renamed from: A */
    public boolean m7623A() {
        ActionMenuView actionMenuView = this.f1880f;
        return actionMenuView != null && actionMenuView.m7695J();
    }

    /* renamed from: G */
    void m7617G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0567e) childAt.getLayoutParams()).f1907b != 2 && childAt != this.f1880f) {
                removeViewAt(childCount);
                this.f1869J.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void m7616H(int i, int i2) {
        m7601h();
        this.f1899y.m7308g(i, i2);
    }

    /* renamed from: I */
    public void m7615I(C0507g c0507g, C0579c c0579c) {
        if (c0507g == null && this.f1880f == null) {
            return;
        }
        m7598k();
        C0507g m7691N = this.f1880f.m7691N();
        if (m7691N == c0507g) {
            return;
        }
        if (m7691N != null) {
            m7691N.m7845O(this.f1874O);
            m7691N.m7845O(this.f1875P);
        }
        if (this.f1875P == null) {
            this.f1875P = new C0566d();
        }
        c0579c.m7522F(true);
        if (c0507g != null) {
            c0507g.m7830c(c0579c, this.f1889o);
            c0507g.m7830c(this.f1875P, this.f1889o);
        } else {
            c0579c.mo7515d(this.f1889o, null);
            this.f1875P.mo7515d(this.f1889o, null);
            c0579c.mo7513f(true);
            this.f1875P.mo7513f(true);
        }
        this.f1880f.setPopupTheme(this.f1890p);
        this.f1880f.setPresenter(c0579c);
        this.f1874O = c0579c;
    }

    /* renamed from: J */
    public void m7614J(InterfaceC0522m.InterfaceC0523a interfaceC0523a, C0507g.InterfaceC0508a interfaceC0508a) {
        this.f1876Q = interfaceC0523a;
        this.f1877R = interfaceC0508a;
        ActionMenuView actionMenuView = this.f1880f;
        if (actionMenuView != null) {
            actionMenuView.m7690O(interfaceC0523a, interfaceC0508a);
        }
    }

    /* renamed from: K */
    public void m7613K(Context context, int i) {
        this.f1892r = i;
        TextView textView = this.f1882h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: L */
    public void m7612L(Context context, int i) {
        this.f1891q = i;
        TextView textView = this.f1881g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public boolean m7609O() {
        ActionMenuView actionMenuView = this.f1880f;
        return actionMenuView != null && actionMenuView.m7689P();
    }

    /* renamed from: a */
    void m7608a() {
        for (int size = this.f1869J.size() - 1; size >= 0; size--) {
            addView(this.f1869J.get(size));
        }
        this.f1869J.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0567e);
    }

    /* renamed from: d */
    public boolean m7605d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1880f) != null && actionMenuView.m7694K();
    }

    /* renamed from: e */
    public void m7604e() {
        C0566d c0566d = this.f1875P;
        C0511i c0511i = c0566d == null ? null : c0566d.f1905g;
        if (c0511i != null) {
            c0511i.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m7603f() {
        ActionMenuView actionMenuView = this.f1880f;
        if (actionMenuView != null) {
            actionMenuView.m7703B();
        }
    }

    /* renamed from: g */
    void m7602g() {
        if (this.f1887m == null) {
            C0622m c0622m = new C0622m(getContext(), null, C0000a.toolbarNavigationButtonStyle);
            this.f1887m = c0622m;
            c0622m.setImageDrawable(this.f1885k);
            this.f1887m.setContentDescription(this.f1886l);
            C0567e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1288a = 8388611 | (this.f1893s & 112);
            generateDefaultLayoutParams.f1907b = 2;
            this.f1887m.setLayoutParams(generateDefaultLayoutParams);
            this.f1887m.setOnClickListener(new View$OnClickListenerC0565c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1887m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1887m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0633o0 c0633o0 = this.f1899y;
        if (c0633o0 != null) {
            return c0633o0.m7314a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1860A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0633o0 c0633o0 = this.f1899y;
        if (c0633o0 != null) {
            return c0633o0.m7313b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0633o0 c0633o0 = this.f1899y;
        if (c0633o0 != null) {
            return c0633o0.m7312c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0633o0 c0633o0 = this.f1899y;
        if (c0633o0 != null) {
            return c0633o0.m7311d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1900z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0507g m7691N;
        ActionMenuView actionMenuView = this.f1880f;
        return actionMenuView != null && (m7691N = actionMenuView.m7691N()) != null && m7691N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1860A, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0252s.m8592w(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0252s.m8592w(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1900z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1884j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1884j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m7599j();
        return this.f1880f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1883i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1883i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0579c getOuterActionMenuPresenter() {
        return this.f1874O;
    }

    public Drawable getOverflowIcon() {
        m7599j();
        return this.f1880f.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1889o;
    }

    public int getPopupTheme() {
        return this.f1890p;
    }

    public CharSequence getSubtitle() {
        return this.f1863D;
    }

    final TextView getSubtitleTextView() {
        return this.f1882h;
    }

    public CharSequence getTitle() {
        return this.f1862C;
    }

    public int getTitleMarginBottom() {
        return this.f1898x;
    }

    public int getTitleMarginEnd() {
        return this.f1896v;
    }

    public int getTitleMarginStart() {
        return this.f1895u;
    }

    public int getTitleMarginTop() {
        return this.f1897w;
    }

    final TextView getTitleTextView() {
        return this.f1881g;
    }

    public InterfaceC0590d0 getWrapper() {
        if (this.f1873N == null) {
            this.f1873N = new C0667x0(this, true);
        }
        return this.f1873N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0567e generateDefaultLayoutParams() {
        return new C0567e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0567e generateLayoutParams(AttributeSet attributeSet) {
        return new C0567e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0567e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0567e ? new C0567e((C0567e) layoutParams) : layoutParams instanceof AbstractC0447a.C0448a ? new C0567e((AbstractC0447a.C0448a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0567e((ViewGroup.MarginLayoutParams) layoutParams) : new C0567e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1879T);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1867H = false;
        }
        if (!this.f1867H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1867H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1867H = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0299 A[LOOP:0: B:109:0x0297->B:110:0x0299, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bb A[LOOP:1: B:112:0x02b9->B:113:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f4 A[LOOP:2: B:121:0x02f2->B:122:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1870K;
        if (C0588c1.m7482b(this)) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m7610N(this.f1883i)) {
            m7619E(this.f1883i, i, 0, i2, 0, this.f1894t);
            i3 = this.f1883i.getMeasuredWidth() + m7590s(this.f1883i);
            i4 = Math.max(0, this.f1883i.getMeasuredHeight() + m7589t(this.f1883i));
            i5 = View.combineMeasuredStates(0, this.f1883i.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m7610N(this.f1887m)) {
            m7619E(this.f1887m, i, 0, i2, 0, this.f1894t);
            i3 = this.f1887m.getMeasuredWidth() + m7590s(this.f1887m);
            i4 = Math.max(i4, this.f1887m.getMeasuredHeight() + m7589t(this.f1887m));
            i5 = View.combineMeasuredStates(i5, this.f1887m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (m7610N(this.f1880f)) {
            m7619E(this.f1880f, i, max, i2, 0, this.f1894t);
            i6 = this.f1880f.getMeasuredWidth() + m7590s(this.f1880f);
            i4 = Math.max(i4, this.f1880f.getMeasuredHeight() + m7589t(this.f1880f));
            i5 = View.combineMeasuredStates(i5, this.f1880f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (m7610N(this.f1888n)) {
            max2 += m7620D(this.f1888n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1888n.getMeasuredHeight() + m7589t(this.f1888n));
            i5 = View.combineMeasuredStates(i5, this.f1888n.getMeasuredState());
        }
        if (m7610N(this.f1884j)) {
            max2 += m7620D(this.f1884j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1884j.getMeasuredHeight() + m7589t(this.f1884j));
            i5 = View.combineMeasuredStates(i5, this.f1884j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C0567e) childAt.getLayoutParams()).f1907b == 0 && m7610N(childAt)) {
                max2 += m7620D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m7589t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.f1897w + this.f1898x;
        int i12 = this.f1895u + this.f1896v;
        if (m7610N(this.f1881g)) {
            m7620D(this.f1881g, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.f1881g.getMeasuredWidth() + m7590s(this.f1881g);
            i9 = this.f1881g.getMeasuredHeight() + m7589t(this.f1881g);
            i7 = View.combineMeasuredStates(i5, this.f1881g.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m7610N(this.f1882h)) {
            i8 = Math.max(i8, m7620D(this.f1882h, i, max2 + i12, i2, i9 + i11, iArr));
            i9 += this.f1882h.getMeasuredHeight() + m7589t(this.f1882h);
            i7 = View.combineMeasuredStates(i7, this.f1882h.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), m7611M() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0569g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0569g c0569g = (C0569g) parcelable;
        super.onRestoreInstanceState(c0569g.m8522a());
        ActionMenuView actionMenuView = this.f1880f;
        C0507g m7691N = actionMenuView != null ? actionMenuView.m7691N() : null;
        int i = c0569g.f1908h;
        if (i != 0 && this.f1875P != null && m7691N != null && (findItem = m7691N.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0569g.f1909i) {
            m7618F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m7601h();
        this.f1899y.m7309f(i == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0511i c0511i;
        C0569g c0569g = new C0569g(super.onSaveInstanceState());
        C0566d c0566d = this.f1875P;
        if (c0566d != null && (c0511i = c0566d.f1905g) != null) {
            c0569g.f1908h = c0511i.getItemId();
        }
        c0569g.f1909i = m7623A();
        return c0569g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1866G = false;
        }
        if (!this.f1866G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1866G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1866G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m7602g();
        }
        ImageButton imageButton = this.f1887m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0010a.m9577d(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m7602g();
            this.f1887m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1887m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1885k);
        }
    }

    public void setCollapsible(boolean z) {
        this.f1878S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f1860A) {
            this.f1860A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f1900z) {
            this.f1900z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0010a.m9577d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m7600i();
            if (!m7584y(this.f1884j)) {
                m7606c(this.f1884j, true);
            }
        } else {
            ImageView imageView = this.f1884j;
            if (imageView != null && m7584y(imageView)) {
                removeView(this.f1884j);
                this.f1869J.remove(this.f1884j);
            }
        }
        ImageView imageView2 = this.f1884j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m7600i();
        }
        ImageView imageView = this.f1884j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m7597l();
        }
        ImageButton imageButton = this.f1883i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0010a.m9577d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m7597l();
            if (!m7584y(this.f1883i)) {
                m7606c(this.f1883i, true);
            }
        } else {
            ImageButton imageButton = this.f1883i;
            if (imageButton != null && m7584y(imageButton)) {
                removeView(this.f1883i);
                this.f1869J.remove(this.f1883i);
            }
        }
        ImageButton imageButton2 = this.f1883i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m7597l();
        this.f1883i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0568f interfaceC0568f) {
        this.f1871L = interfaceC0568f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m7599j();
        this.f1880f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1890p != i) {
            this.f1890p = i;
            if (i == 0) {
                this.f1889o = getContext();
            } else {
                this.f1889o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1882h;
            if (textView != null && m7584y(textView)) {
                removeView(this.f1882h);
                this.f1869J.remove(this.f1882h);
            }
        } else {
            if (this.f1882h == null) {
                Context context = getContext();
                C0674z c0674z = new C0674z(context);
                this.f1882h = c0674z;
                c0674z.setSingleLine();
                this.f1882h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1892r;
                if (i != 0) {
                    this.f1882h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1865F;
                if (colorStateList != null) {
                    this.f1882h.setTextColor(colorStateList);
                }
            }
            if (!m7584y(this.f1882h)) {
                m7606c(this.f1882h, true);
            }
        }
        TextView textView2 = this.f1882h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1863D = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1865F = colorStateList;
        TextView textView = this.f1882h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1881g;
            if (textView != null && m7584y(textView)) {
                removeView(this.f1881g);
                this.f1869J.remove(this.f1881g);
            }
        } else {
            if (this.f1881g == null) {
                Context context = getContext();
                C0674z c0674z = new C0674z(context);
                this.f1881g = c0674z;
                c0674z.setSingleLine();
                this.f1881g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1891q;
                if (i != 0) {
                    this.f1881g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1864E;
                if (colorStateList != null) {
                    this.f1881g.setTextColor(colorStateList);
                }
            }
            if (!m7584y(this.f1881g)) {
                m7606c(this.f1881g, true);
            }
        }
        TextView textView2 = this.f1881g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1862C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1898x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1896v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1895u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1897w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1864E = colorStateList;
        TextView textView = this.f1881g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: v */
    public boolean m7587v() {
        C0566d c0566d = this.f1875P;
        return (c0566d == null || c0566d.f1905g == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m7586w() {
        ActionMenuView actionMenuView = this.f1880f;
        return actionMenuView != null && actionMenuView.m7697H();
    }

    /* renamed from: x */
    public void m7585x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean m7583z() {
        ActionMenuView actionMenuView = this.f1880f;
        return actionMenuView != null && actionMenuView.m7696I();
    }
}
