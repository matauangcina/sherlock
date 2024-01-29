package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0734a;
import androidx.core.graphics.drawable.C0759a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.p018f.C0116a;
import p000a.p018f.C0117b;
import p000a.p018f.C0118c;
import p000a.p019g.p027j.C0189d;
import p000a.p019g.p027j.C0193h;
import p000a.p019g.p027j.InterfaceC0191f;
import p000a.p019g.p028k.C0197a0;
import p000a.p019g.p028k.C0236d;
import p000a.p019g.p028k.C0248o;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0245l;
import p000a.p019g.p028k.InterfaceC0246m;
import p000a.p019g.p028k.InterfaceC0249p;
import p000a.p032i.p033a.AbstractC0280a;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0245l, InterfaceC0246m {

    /* renamed from: A */
    static final Class<?>[] f2479A;

    /* renamed from: B */
    static final ThreadLocal<Map<String, Constructor<AbstractC0693c>>> f2480B;

    /* renamed from: C */
    static final Comparator<View> f2481C;

    /* renamed from: D */
    private static final InterfaceC0191f<Rect> f2482D;

    /* renamed from: z */
    static final String f2483z;

    /* renamed from: f */
    private final List<View> f2484f;

    /* renamed from: g */
    private final C0701a<View> f2485g;

    /* renamed from: h */
    private final List<View> f2486h;

    /* renamed from: i */
    private final List<View> f2487i;

    /* renamed from: j */
    private Paint f2488j;

    /* renamed from: k */
    private final int[] f2489k;

    /* renamed from: l */
    private final int[] f2490l;

    /* renamed from: m */
    private boolean f2491m;

    /* renamed from: n */
    private boolean f2492n;

    /* renamed from: o */
    private int[] f2493o;

    /* renamed from: p */
    private View f2494p;

    /* renamed from: q */
    private View f2495q;

    /* renamed from: r */
    private ViewTreeObserver$OnPreDrawListenerC0697g f2496r;

    /* renamed from: s */
    private boolean f2497s;

    /* renamed from: t */
    private C0197a0 f2498t;

    /* renamed from: u */
    private boolean f2499u;

    /* renamed from: v */
    private Drawable f2500v;

    /* renamed from: w */
    ViewGroup.OnHierarchyChangeListener f2501w;

    /* renamed from: x */
    private InterfaceC0249p f2502x;

    /* renamed from: y */
    private final C0248o f2503y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0691a implements InterfaceC0249p {
        C0691a() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0249p
        /* renamed from: a */
        public C0197a0 mo2660a(View view, C0197a0 c0197a0) {
            CoordinatorLayout.this.m7068W(c0197a0);
            return c0197a0;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0692b {
        AbstractC0693c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0693c<V extends View> {
        public AbstractC0693c() {
        }

        public AbstractC0693c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo3371A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo3432z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m7046B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo3370C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m7046B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2436D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m7045a(CoordinatorLayout coordinatorLayout, V v) {
            return m7043d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2898b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m7044c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m7043d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2433e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C0197a0 m7042f(CoordinatorLayout coordinatorLayout, V v, C0197a0 c0197a0) {
            return c0197a0;
        }

        /* renamed from: g */
        public void mo2437g(C0696f c0696f) {
        }

        /* renamed from: h */
        public boolean mo2461h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void m7041i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo3338j() {
        }

        /* renamed from: k */
        public boolean mo2661k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2460l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo3450m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean m7040n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo3334o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m7039p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo3333q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m7039p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo3433r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void m7038s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3433r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo3332t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m7038s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void m7037u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void m7036v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m7037u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo3475w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo3331x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo3330y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo3432z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface InterfaceC0694d {
        Class<? extends AbstractC0693c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC0695e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC0695e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2501w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m7083H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2501w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0696f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0693c f2506a;

        /* renamed from: b */
        boolean f2507b;

        /* renamed from: c */
        public int f2508c;

        /* renamed from: d */
        public int f2509d;

        /* renamed from: e */
        public int f2510e;

        /* renamed from: f */
        int f2511f;

        /* renamed from: g */
        public int f2512g;

        /* renamed from: h */
        public int f2513h;

        /* renamed from: i */
        int f2514i;

        /* renamed from: j */
        int f2515j;

        /* renamed from: k */
        View f2516k;

        /* renamed from: l */
        View f2517l;

        /* renamed from: m */
        private boolean f2518m;

        /* renamed from: n */
        private boolean f2519n;

        /* renamed from: o */
        private boolean f2520o;

        /* renamed from: p */
        private boolean f2521p;

        /* renamed from: q */
        final Rect f2522q;

        public C0696f(int i, int i2) {
            super(i, i2);
            this.f2507b = false;
            this.f2508c = 0;
            this.f2509d = 0;
            this.f2510e = -1;
            this.f2511f = -1;
            this.f2512g = 0;
            this.f2513h = 0;
            this.f2522q = new Rect();
        }

        C0696f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2507b = false;
            this.f2508c = 0;
            this.f2509d = 0;
            this.f2510e = -1;
            this.f2511f = -1;
            this.f2512g = 0;
            this.f2513h = 0;
            this.f2522q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0118c.CoordinatorLayout_Layout);
            this.f2508c = obtainStyledAttributes.getInteger(C0118c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2511f = obtainStyledAttributes.getResourceId(C0118c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2509d = obtainStyledAttributes.getInteger(C0118c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2510e = obtainStyledAttributes.getInteger(C0118c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2512g = obtainStyledAttributes.getInt(C0118c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2513h = obtainStyledAttributes.getInt(C0118c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C0118c.CoordinatorLayout_Layout_layout_behavior);
            this.f2507b = hasValue;
            if (hasValue) {
                this.f2506a = CoordinatorLayout.m7080K(context, attributeSet, obtainStyledAttributes.getString(C0118c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            AbstractC0693c abstractC0693c = this.f2506a;
            if (abstractC0693c != null) {
                abstractC0693c.mo2437g(this);
            }
        }

        public C0696f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2507b = false;
            this.f2508c = 0;
            this.f2509d = 0;
            this.f2510e = -1;
            this.f2511f = -1;
            this.f2512g = 0;
            this.f2513h = 0;
            this.f2522q = new Rect();
        }

        public C0696f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2507b = false;
            this.f2508c = 0;
            this.f2509d = 0;
            this.f2510e = -1;
            this.f2511f = -1;
            this.f2512g = 0;
            this.f2513h = 0;
            this.f2522q = new Rect();
        }

        public C0696f(C0696f c0696f) {
            super((ViewGroup.MarginLayoutParams) c0696f);
            this.f2507b = false;
            this.f2508c = 0;
            this.f2509d = 0;
            this.f2510e = -1;
            this.f2511f = -1;
            this.f2512g = 0;
            this.f2513h = 0;
            this.f2522q = new Rect();
        }

        /* renamed from: n */
        private void m7022n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2511f);
            this.f2516k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2517l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2511f) + " to anchor view " + view);
            }
            this.f2517l = null;
            this.f2516k = null;
        }

        /* renamed from: s */
        private boolean m7017s(View view, int i) {
            int m8706b = C0236d.m8706b(((C0696f) view.getLayoutParams()).f2512g, i);
            return m8706b != 0 && (C0236d.m8706b(this.f2513h, i) & m8706b) == m8706b;
        }

        /* renamed from: t */
        private boolean m7016t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2516k.getId() != this.f2511f) {
                return false;
            }
            View view2 = this.f2516k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2517l = null;
                    this.f2516k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2517l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m7035a() {
            return this.f2516k == null && this.f2511f != -1;
        }

        /* renamed from: b */
        boolean m7034b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0693c abstractC0693c;
            return view2 == this.f2517l || m7017s(view2, C0252s.m8592w(coordinatorLayout)) || ((abstractC0693c = this.f2506a) != null && abstractC0693c.mo2433e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        boolean m7033c() {
            if (this.f2506a == null) {
                this.f2518m = false;
            }
            return this.f2518m;
        }

        /* renamed from: d */
        View m7032d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2511f == -1) {
                this.f2517l = null;
                this.f2516k = null;
                return null;
            }
            if (this.f2516k == null || !m7016t(view, coordinatorLayout)) {
                m7022n(view, coordinatorLayout);
            }
            return this.f2516k;
        }

        /* renamed from: e */
        public int m7031e() {
            return this.f2511f;
        }

        /* renamed from: f */
        public AbstractC0693c m7030f() {
            return this.f2506a;
        }

        /* renamed from: g */
        boolean m7029g() {
            return this.f2521p;
        }

        /* renamed from: h */
        Rect m7028h() {
            return this.f2522q;
        }

        /* renamed from: i */
        boolean m7027i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2518m;
            if (z) {
                return true;
            }
            AbstractC0693c abstractC0693c = this.f2506a;
            boolean m7045a = (abstractC0693c != null ? abstractC0693c.m7045a(coordinatorLayout, view) : false) | z;
            this.f2518m = m7045a;
            return m7045a;
        }

        /* renamed from: j */
        boolean m7026j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f2520o;
            }
            return this.f2519n;
        }

        /* renamed from: k */
        void m7025k() {
            this.f2521p = false;
        }

        /* renamed from: l */
        void m7024l(int i) {
            m7018r(i, false);
        }

        /* renamed from: m */
        void m7023m() {
            this.f2518m = false;
        }

        /* renamed from: o */
        public void m7021o(AbstractC0693c abstractC0693c) {
            AbstractC0693c abstractC0693c2 = this.f2506a;
            if (abstractC0693c2 != abstractC0693c) {
                if (abstractC0693c2 != null) {
                    abstractC0693c2.mo3338j();
                }
                this.f2506a = abstractC0693c;
                this.f2507b = true;
                if (abstractC0693c != null) {
                    abstractC0693c.mo2437g(this);
                }
            }
        }

        /* renamed from: p */
        void m7020p(boolean z) {
            this.f2521p = z;
        }

        /* renamed from: q */
        void m7019q(Rect rect) {
            this.f2522q.set(rect);
        }

        /* renamed from: r */
        void m7018r(int i, boolean z) {
            if (i == 0) {
                this.f2519n = z;
            } else if (i != 1) {
            } else {
                this.f2520o = z;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0697g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0697g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m7083H(0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    public static class C0698h extends AbstractC0280a {
        public static final Parcelable.Creator<C0698h> CREATOR = new C0699a();

        /* renamed from: h */
        SparseArray<Parcelable> f2524h;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: classes.dex */
        static class C0699a implements Parcelable.ClassLoaderCreator<C0698h> {
            C0699a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0698h createFromParcel(Parcel parcel) {
                return new C0698h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0698h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0698h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0698h[] newArray(int i) {
                return new C0698h[i];
            }
        }

        public C0698h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2524h = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2524h.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0698h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2524h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2524h.keyAt(i2);
                parcelableArr[i2] = this.f2524h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: classes.dex */
    static class C0700i implements Comparator<View> {
        C0700i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m8656G = C0252s.m8656G(view);
            float m8656G2 = C0252s.m8656G(view2);
            if (m8656G > m8656G2) {
                return -1;
            }
            return m8656G < m8656G2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f2483z = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f2481C = new C0700i();
        } else {
            f2481C = null;
        }
        f2479A = new Class[]{Context.class, AttributeSet.class};
        f2480B = new ThreadLocal<>();
        f2482D = new C0193h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0116a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2484f = new ArrayList();
        this.f2485g = new C0701a<>();
        this.f2486h = new ArrayList();
        this.f2487i = new ArrayList();
        this.f2489k = new int[2];
        this.f2490l = new int[2];
        this.f2503y = new C0248o(this);
        int[] iArr = C0118c.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C0117b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C0118c.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C0117b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0118c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2493o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2493o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f2493o;
                iArr3[i2] = (int) (iArr3[i2] * f);
            }
        }
        this.f2500v = obtainStyledAttributes.getDrawable(C0118c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m7067X();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0695e());
        if (C0252s.m8596u(this) == 0) {
            C0252s.m8605p0(this, 1);
        }
    }

    /* renamed from: A */
    private boolean m7090A(View view) {
        return this.f2485g.m7002j(view);
    }

    /* renamed from: C */
    private void m7088C(View view, int i) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        Rect m7066a = m7066a();
        m7066a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0696f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0696f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin);
        if (this.f2498t != null && C0252s.m8598t(this) && !C0252s.m8598t(view)) {
            m7066a.left += this.f2498t.m8852i();
            m7066a.top += this.f2498t.m8850k();
            m7066a.right -= this.f2498t.m8851j();
            m7066a.bottom -= this.f2498t.m8853h();
        }
        Rect m7066a2 = m7066a();
        C0236d.m8707a(m7072S(c0696f.f2508c), view.getMeasuredWidth(), view.getMeasuredHeight(), m7066a, m7066a2, i);
        view.layout(m7066a2.left, m7066a2.top, m7066a2.right, m7066a2.bottom);
        m7076O(m7066a);
        m7076O(m7066a2);
    }

    /* renamed from: D */
    private void m7087D(View view, View view2, int i) {
        Rect m7066a = m7066a();
        Rect m7066a2 = m7066a();
        try {
            m7053t(view2, m7066a);
            m7052u(view, i, m7066a, m7066a2);
            view.layout(m7066a2.left, m7066a2.top, m7066a2.right, m7066a2.bottom);
        } finally {
            m7076O(m7066a);
            m7076O(m7066a2);
        }
    }

    /* renamed from: E */
    private void m7086E(View view, int i, int i2) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        int m8706b = C0236d.m8706b(m7071T(c0696f.f2508c), i2);
        int i3 = m8706b & 7;
        int i4 = m8706b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m7050w = m7050w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            m7050w += measuredWidth / 2;
        } else if (i3 == 5) {
            m7050w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0696f).leftMargin, Math.min(m7050w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0696f).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    private void m7085F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C0252s.m8650M(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0696f c0696f = (C0696f) view.getLayoutParams();
            AbstractC0693c m7030f = c0696f.m7030f();
            Rect m7066a = m7066a();
            Rect m7066a2 = m7066a();
            m7066a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m7030f == null || !m7030f.mo2898b(this, view, m7066a)) {
                m7066a.set(m7066a2);
            } else if (!m7066a2.contains(m7066a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m7066a.toShortString() + " | Bounds:" + m7066a2.toShortString());
            }
            m7076O(m7066a2);
            if (m7066a.isEmpty()) {
                m7076O(m7066a);
                return;
            }
            int m8706b = C0236d.m8706b(c0696f.f2513h, i);
            boolean z3 = true;
            if ((m8706b & 48) != 48 || (i6 = (m7066a.top - ((ViewGroup.MarginLayoutParams) c0696f).topMargin) - c0696f.f2515j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m7069V(view, i7 - i6);
                z = true;
            }
            if ((m8706b & 80) == 80 && (height = ((getHeight() - m7066a.bottom) - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin) + c0696f.f2515j) < (i5 = rect.bottom)) {
                m7069V(view, height - i5);
                z = true;
            }
            if (!z) {
                m7069V(view, 0);
            }
            if ((m8706b & 3) != 3 || (i3 = (m7066a.left - ((ViewGroup.MarginLayoutParams) c0696f).leftMargin) - c0696f.f2514i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m7070U(view, i4 - i3);
                z2 = true;
            }
            if ((m8706b & 5) != 5 || (width = ((getWidth() - m7066a.right) - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin) + c0696f.f2514i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m7070U(view, width - i2);
            }
            if (!z3) {
                m7070U(view, 0);
            }
            m7076O(m7066a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    static AbstractC0693c m7080K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f2483z)) {
            str = f2483z + '.' + str;
        }
        try {
            Map<String, Constructor<AbstractC0693c>> map = f2480B.get();
            if (map == null) {
                map = new HashMap<>();
                f2480B.set(map);
            }
            Constructor<AbstractC0693c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2479A);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: L */
    private boolean m7079L(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2486h;
        m7047z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0696f c0696f = (C0696f) view.getLayoutParams();
            AbstractC0693c m7030f = c0696f.m7030f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && m7030f != null) {
                    if (i == 0) {
                        z = m7030f.mo2661k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = m7030f.mo2436D(this, view, motionEvent);
                    }
                    if (z) {
                        this.f2494p = view;
                    }
                }
                boolean m7033c = c0696f.m7033c();
                boolean m7027i = c0696f.m7027i(this, view);
                z2 = m7027i && !m7033c;
                if (m7027i && !z2) {
                    break;
                }
            } else if (m7030f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    m7030f.mo2661k(this, view, motionEvent2);
                } else if (i == 1) {
                    m7030f.mo2436D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m7078M() {
        this.f2484f.clear();
        this.f2485g.m7009c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0696f m7048y = m7048y(childAt);
            m7048y.m7032d(this, childAt);
            this.f2485g.m7010b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m7048y.m7034b(this, childAt, childAt2)) {
                        if (!this.f2485g.m7008d(childAt2)) {
                            this.f2485g.m7010b(childAt2);
                        }
                        this.f2485g.m7011a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2484f.addAll(this.f2485g.m7003i());
        Collections.reverse(this.f2484f);
    }

    /* renamed from: O */
    private static void m7076O(Rect rect) {
        rect.setEmpty();
        f2482D.mo8870a(rect);
    }

    /* renamed from: Q */
    private void m7074Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0693c m7030f = ((C0696f) childAt.getLayoutParams()).m7030f();
            if (m7030f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m7030f.mo2661k(this, childAt, obtain);
                } else {
                    m7030f.mo2436D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0696f) getChildAt(i2).getLayoutParams()).m7023m();
        }
        this.f2494p = null;
        this.f2491m = false;
    }

    /* renamed from: R */
    private static int m7073R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m7072S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m7071T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m7070U(View view, int i) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        int i2 = c0696f.f2514i;
        if (i2 != i) {
            C0252s.m8645R(view, i - i2);
            c0696f.f2514i = i;
        }
    }

    /* renamed from: V */
    private void m7069V(View view, int i) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        int i2 = c0696f.f2515j;
        if (i2 != i) {
            C0252s.m8644S(view, i - i2);
            c0696f.f2515j = i;
        }
    }

    /* renamed from: X */
    private void m7067X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!C0252s.m8598t(this)) {
            C0252s.m8601r0(this, null);
            return;
        }
        if (this.f2502x == null) {
            this.f2502x = new C0691a();
        }
        C0252s.m8601r0(this, this.f2502x);
        setSystemUiVisibility(1280);
    }

    /* renamed from: a */
    private static Rect m7066a() {
        Rect mo8869b = f2482D.mo8869b();
        return mo8869b == null ? new Rect() : mo8869b;
    }

    /* renamed from: d */
    private static int m7064d(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: e */
    private void m7063e(C0696f c0696f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0696f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0696f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: f */
    private C0197a0 m7062f(C0197a0 c0197a0) {
        AbstractC0693c m7030f;
        if (c0197a0.m8849l()) {
            return c0197a0;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0252s.m8598t(childAt) && (m7030f = ((C0696f) childAt.getLayoutParams()).m7030f()) != null) {
                m7030f.m7042f(this, childAt, c0197a0);
                if (c0197a0.m8849l()) {
                    break;
                }
            }
        }
        return c0197a0;
    }

    /* renamed from: v */
    private void m7051v(View view, int i, Rect rect, Rect rect2, C0696f c0696f, int i2, int i3) {
        int m8706b = C0236d.m8706b(m7073R(c0696f.f2508c), i);
        int m8706b2 = C0236d.m8706b(m7072S(c0696f.f2509d), i);
        int i4 = m8706b & 7;
        int i5 = m8706b & 112;
        int i6 = m8706b2 & 7;
        int i7 = m8706b2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: w */
    private int m7050w(int i) {
        StringBuilder sb;
        int[] iArr = this.f2493o;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: z */
    private void m7047z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f2481C;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean m7089B(View view, int i, int i2) {
        Rect m7066a = m7066a();
        m7053t(view, m7066a);
        try {
            return m7066a.contains(i, i2);
        } finally {
            m7076O(m7066a);
        }
    }

    /* renamed from: G */
    void m7084G(View view, int i) {
        AbstractC0693c m7030f;
        C0696f c0696f = (C0696f) view.getLayoutParams();
        if (c0696f.f2516k != null) {
            Rect m7066a = m7066a();
            Rect m7066a2 = m7066a();
            Rect m7066a3 = m7066a();
            m7053t(c0696f.f2516k, m7066a);
            boolean z = false;
            m7056q(view, false, m7066a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m7051v(view, i, m7066a, m7066a3, c0696f, measuredWidth, measuredHeight);
            z = (m7066a3.left == m7066a2.left && m7066a3.top == m7066a2.top) ? true : true;
            m7063e(c0696f, m7066a3, measuredWidth, measuredHeight);
            int i2 = m7066a3.left - m7066a2.left;
            int i3 = m7066a3.top - m7066a2.top;
            if (i2 != 0) {
                C0252s.m8645R(view, i2);
            }
            if (i3 != 0) {
                C0252s.m8644S(view, i3);
            }
            if (z && (m7030f = c0696f.m7030f()) != null) {
                m7030f.mo2461h(this, view, c0696f.f2516k);
            }
            m7076O(m7066a);
            m7076O(m7066a2);
            m7076O(m7066a3);
        }
    }

    /* renamed from: H */
    final void m7083H(int i) {
        boolean z;
        int m8592w = C0252s.m8592w(this);
        int size = this.f2484f.size();
        Rect m7066a = m7066a();
        Rect m7066a2 = m7066a();
        Rect m7066a3 = m7066a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2484f.get(i2);
            C0696f c0696f = (C0696f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c0696f.f2517l == this.f2484f.get(i3)) {
                        m7084G(view, m8592w);
                    }
                }
                m7056q(view, true, m7066a2);
                if (c0696f.f2512g != 0 && !m7066a2.isEmpty()) {
                    int m8706b = C0236d.m8706b(c0696f.f2512g, m8592w);
                    int i4 = m8706b & 112;
                    if (i4 == 48) {
                        m7066a.top = Math.max(m7066a.top, m7066a2.bottom);
                    } else if (i4 == 80) {
                        m7066a.bottom = Math.max(m7066a.bottom, getHeight() - m7066a2.top);
                    }
                    int i5 = m8706b & 7;
                    if (i5 == 3) {
                        m7066a.left = Math.max(m7066a.left, m7066a2.right);
                    } else if (i5 == 5) {
                        m7066a.right = Math.max(m7066a.right, getWidth() - m7066a2.left);
                    }
                }
                if (c0696f.f2513h != 0 && view.getVisibility() == 0) {
                    m7085F(view, m7066a, m8592w);
                }
                if (i != 2) {
                    m7049x(view, m7066a3);
                    if (!m7066a3.equals(m7066a2)) {
                        m7077N(view, m7066a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f2484f.get(i6);
                    C0696f c0696f2 = (C0696f) view2.getLayoutParams();
                    AbstractC0693c m7030f = c0696f2.m7030f();
                    if (m7030f != null && m7030f.mo2433e(this, view2, view)) {
                        if (i == 0 && c0696f2.m7029g()) {
                            c0696f2.m7025k();
                        } else {
                            if (i != 2) {
                                z = m7030f.mo2461h(this, view2, view);
                            } else {
                                m7030f.m7041i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c0696f2.m7020p(z);
                            }
                        }
                    }
                }
            }
        }
        m7076O(m7066a);
        m7076O(m7066a2);
        m7076O(m7066a3);
    }

    /* renamed from: I */
    public void m7082I(View view, int i) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        if (c0696f.m7035a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0696f.f2516k;
        if (view2 != null) {
            m7087D(view, view2, i);
            return;
        }
        int i2 = c0696f.f2510e;
        if (i2 >= 0) {
            m7086E(view, i2, i);
        } else {
            m7088C(view, i);
        }
    }

    /* renamed from: J */
    public void m7081J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: N */
    void m7077N(View view, Rect rect) {
        ((C0696f) view.getLayoutParams()).m7019q(rect);
    }

    /* renamed from: P */
    void m7075P() {
        if (this.f2492n && this.f2496r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2496r);
        }
        this.f2497s = false;
    }

    /* renamed from: W */
    final C0197a0 m7068W(C0197a0 c0197a0) {
        if (!C0189d.m8873a(this.f2498t, c0197a0)) {
            this.f2498t = c0197a0;
            boolean z = true;
            boolean z2 = c0197a0 != null && c0197a0.m8850k() > 0;
            this.f2499u = z2;
            setWillNotDraw((z2 || getBackground() != null) ? false : false);
            m7062f(c0197a0);
            requestLayout();
        }
        return c0197a0;
    }

    /* renamed from: b */
    void m7065b() {
        if (this.f2492n) {
            if (this.f2496r == null) {
                this.f2496r = new ViewTreeObserver$OnPreDrawListenerC0697g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2496r);
        }
        this.f2497s = true;
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: c */
    public void mo6716c(View view, View view2, int i, int i2) {
        AbstractC0693c m7030f;
        this.f2503y.m8666c(view, view2, i, i2);
        this.f2495q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0696f c0696f = (C0696f) childAt.getLayoutParams();
            if (c0696f.m7026j(i2) && (m7030f = c0696f.m7030f()) != null) {
                m7030f.m7036v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0696f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        AbstractC0693c abstractC0693c = c0696f.f2506a;
        if (abstractC0693c != null) {
            float m7043d = abstractC0693c.m7043d(this, view);
            if (m7043d > 0.0f) {
                if (this.f2488j == null) {
                    this.f2488j = new Paint();
                }
                this.f2488j.setColor(c0696f.f2506a.m7044c(this, view));
                this.f2488j.setAlpha(m7064d(Math.round(m7043d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2488j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2500v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: g */
    public void m7061g(View view) {
        List m7005g = this.f2485g.m7005g(view);
        if (m7005g == null || m7005g.isEmpty()) {
            return;
        }
        for (int i = 0; i < m7005g.size(); i++) {
            View view2 = (View) m7005g.get(i);
            AbstractC0693c m7030f = ((C0696f) view2.getLayoutParams()).m7030f();
            if (m7030f != null) {
                m7030f.mo2461h(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m7078M();
        return Collections.unmodifiableList(this.f2484f);
    }

    public final C0197a0 getLastWindowInsets() {
        return this.f2498t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2503y.m8668a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2500v;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    void m7060h() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m7090A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f2497s) {
            if (z) {
                m7065b();
            } else {
                m7075P();
            }
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: i */
    public void mo6710i(View view, int i) {
        this.f2503y.m8665d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0696f c0696f = (C0696f) childAt.getLayoutParams();
            if (c0696f.m7026j(i)) {
                AbstractC0693c m7030f = c0696f.m7030f();
                if (m7030f != null) {
                    m7030f.mo3370C(this, childAt, view, i);
                }
                c0696f.m7024l(i);
                c0696f.m7025k();
            }
        }
        this.f2495q = null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: j */
    public void mo6709j(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0693c m7030f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0696f c0696f = (C0696f) childAt.getLayoutParams();
                if (c0696f.m7026j(i3) && (m7030f = c0696f.m7030f()) != null) {
                    int[] iArr2 = this.f2489k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m7030f.mo3333q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2489k;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f2489k;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m7083H(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k */
    public C0696f generateDefaultLayoutParams() {
        return new C0696f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public C0696f generateLayoutParams(AttributeSet attributeSet) {
        return new C0696f(getContext(), attributeSet);
    }

    @Override // p000a.p019g.p028k.InterfaceC0246m
    /* renamed from: m */
    public void mo6706m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0693c m7030f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0696f c0696f = (C0696f) childAt.getLayoutParams();
                if (c0696f.m7026j(i5) && (m7030f = c0696f.m7030f()) != null) {
                    int[] iArr2 = this.f2489k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m7030f.mo3332t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2489k;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f2489k[1]) : Math.min(i7, this.f2489k[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m7083H(1);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: n */
    public void mo6705n(View view, int i, int i2, int i3, int i4, int i5) {
        mo6706m(view, i, i2, i3, i4, 0, this.f2490l);
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: o */
    public boolean mo6704o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0696f c0696f = (C0696f) childAt.getLayoutParams();
                AbstractC0693c m7030f = c0696f.m7030f();
                if (m7030f != null) {
                    boolean mo3371A = m7030f.mo3371A(this, childAt, view, view2, i, i2);
                    z |= mo3371A;
                    c0696f.m7018r(i2, mo3371A);
                } else {
                    c0696f.m7018r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7074Q(false);
        if (this.f2497s) {
            if (this.f2496r == null) {
                this.f2496r = new ViewTreeObserver$OnPreDrawListenerC0697g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2496r);
        }
        if (this.f2498t == null && C0252s.m8598t(this)) {
            C0252s.m8629d0(this);
        }
        this.f2492n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7074Q(false);
        if (this.f2497s && this.f2496r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2496r);
        }
        View view = this.f2495q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2492n = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2499u || this.f2500v == null) {
            return;
        }
        C0197a0 c0197a0 = this.f2498t;
        int m8850k = c0197a0 != null ? c0197a0.m8850k() : 0;
        if (m8850k > 0) {
            this.f2500v.setBounds(0, 0, getWidth(), m8850k);
            this.f2500v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m7074Q(true);
        }
        boolean m7079L = m7079L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m7074Q(true);
        }
        return m7079L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0693c m7030f;
        int m8592w = C0252s.m8592w(this);
        int size = this.f2484f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2484f.get(i5);
            if (view.getVisibility() != 8 && ((m7030f = ((C0696f) view.getLayoutParams()).m7030f()) == null || !m7030f.mo2460l(this, view, m8592w))) {
                m7082I(view, m8592w);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.mo3450m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0693c m7030f;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0696f c0696f = (C0696f) childAt.getLayoutParams();
                if (c0696f.m7026j(0) && (m7030f = c0696f.m7030f()) != null) {
                    z2 |= m7030f.m7040n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m7083H(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0693c m7030f;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0696f c0696f = (C0696f) childAt.getLayoutParams();
                if (c0696f.m7026j(0) && (m7030f = c0696f.m7030f()) != null) {
                    z |= m7030f.mo3334o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo6709j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo6705n(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo6716c(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0698h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0698h c0698h = (C0698h) parcelable;
        super.onRestoreInstanceState(c0698h.m8522a());
        SparseArray<Parcelable> sparseArray = c0698h.f2524h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0693c m7030f = m7048y(childAt).m7030f();
            if (id != -1 && m7030f != null && (parcelable2 = sparseArray.get(id)) != null) {
                m7030f.mo3331x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo3330y;
        C0698h c0698h = new C0698h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0693c m7030f = ((C0696f) childAt.getLayoutParams()).m7030f();
            if (id != -1 && m7030f != null && (mo3330y = m7030f.mo3330y(this, childAt)) != null) {
                sparseArray.append(id, mo3330y);
            }
        }
        c0698h.f2524h = sparseArray;
        return c0698h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo6704o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onStopNestedScroll(View view) {
        mo6710i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2494p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m7079L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f2494p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0696f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m7030f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f2494p
            boolean r6 = r6.mo2436D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f2494p
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m7074Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p */
    public C0696f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0696f ? new C0696f((C0696f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0696f((ViewGroup.MarginLayoutParams) layoutParams) : new C0696f(layoutParams);
    }

    /* renamed from: q */
    void m7056q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m7053t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> m7055r(View view) {
        List<View> m7004h = this.f2485g.m7004h(view);
        this.f2487i.clear();
        if (m7004h != null) {
            this.f2487i.addAll(m7004h);
        }
        return this.f2487i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0693c m7030f = ((C0696f) view.getLayoutParams()).m7030f();
        if (m7030f == null || !m7030f.mo3475w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f2491m) {
            return;
        }
        m7074Q(false);
        this.f2491m = true;
    }

    /* renamed from: s */
    public List<View> m7054s(View view) {
        List m7005g = this.f2485g.m7005g(view);
        this.f2487i.clear();
        if (m7005g != null) {
            this.f2487i.addAll(m7005g);
        }
        return this.f2487i;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m7067X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2501w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2500v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2500v = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2500v.setState(getDrawableState());
                }
                C0759a.m6749m(this.f2500v, C0252s.m8592w(this));
                this.f2500v.setVisible(getVisibility() == 0, false);
                this.f2500v.setCallback(this);
            }
            C0252s.m8639X(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0734a.m6874d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2500v;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f2500v.setVisible(z, false);
    }

    /* renamed from: t */
    void m7053t(View view, Rect rect) {
        C0702b.m7000a(this, view, rect);
    }

    /* renamed from: u */
    void m7052u(View view, int i, Rect rect, Rect rect2) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m7051v(view, i, rect, rect2, c0696f, measuredWidth, measuredHeight);
        m7063e(c0696f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2500v;
    }

    /* renamed from: x */
    void m7049x(View view, Rect rect) {
        rect.set(((C0696f) view.getLayoutParams()).m7028h());
    }

    /* renamed from: y */
    C0696f m7048y(View view) {
        C0696f c0696f = (C0696f) view.getLayoutParams();
        if (!c0696f.f2507b) {
            if (view instanceof InterfaceC0692b) {
                AbstractC0693c behavior = ((InterfaceC0692b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0696f.m7021o(behavior);
            } else {
                InterfaceC0694d interfaceC0694d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0694d = (InterfaceC0694d) cls.getAnnotation(InterfaceC0694d.class);
                    if (interfaceC0694d != null) {
                        break;
                    }
                }
                if (interfaceC0694d != null) {
                    try {
                        c0696f.m7021o(interfaceC0694d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0694d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            c0696f.f2507b = true;
        }
        return c0696f;
    }
}
