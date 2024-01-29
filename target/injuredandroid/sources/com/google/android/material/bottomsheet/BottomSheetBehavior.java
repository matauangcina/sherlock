package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000a.p019g.p023f.C0142a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p019g.p028k.p029b0.InterfaceC0226f;
import p000a.p032i.p033a.AbstractC0280a;
import p000a.p032i.p034b.C0291c;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0693c<V> {

    /* renamed from: K */
    private static final int f4994K = C1348j.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f4995A;

    /* renamed from: B */
    WeakReference<V> f4996B;

    /* renamed from: C */
    WeakReference<View> f4997C;

    /* renamed from: D */
    private final ArrayList<AbstractC1745e> f4998D;

    /* renamed from: E */
    private VelocityTracker f4999E;

    /* renamed from: F */
    int f5000F;

    /* renamed from: G */
    private int f5001G;

    /* renamed from: H */
    boolean f5002H;

    /* renamed from: I */
    private Map<View, Integer> f5003I;

    /* renamed from: J */
    private final C0291c.AbstractC0294c f5004J;

    /* renamed from: a */
    private int f5005a;

    /* renamed from: b */
    private boolean f5006b;

    /* renamed from: c */
    private float f5007c;

    /* renamed from: d */
    private int f5008d;

    /* renamed from: e */
    private boolean f5009e;

    /* renamed from: f */
    private int f5010f;

    /* renamed from: g */
    private boolean f5011g;

    /* renamed from: h */
    private C1315g f5012h;

    /* renamed from: i */
    private C1322k f5013i;

    /* renamed from: j */
    private boolean f5014j;

    /* renamed from: k */
    private BottomSheetBehavior<V>.RunnableC1748g f5015k;

    /* renamed from: l */
    private ValueAnimator f5016l;

    /* renamed from: m */
    int f5017m;

    /* renamed from: n */
    int f5018n;

    /* renamed from: o */
    int f5019o;

    /* renamed from: p */
    float f5020p;

    /* renamed from: q */
    int f5021q;

    /* renamed from: r */
    float f5022r;

    /* renamed from: s */
    boolean f5023s;

    /* renamed from: t */
    private boolean f5024t;

    /* renamed from: u */
    int f5025u;

    /* renamed from: v */
    C0291c f5026v;

    /* renamed from: w */
    private boolean f5027w;

    /* renamed from: x */
    private int f5028x;

    /* renamed from: y */
    private boolean f5029y;

    /* renamed from: z */
    int f5030z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    public class RunnableC1741a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f5031f;

        /* renamed from: g */
        final /* synthetic */ int f5032g;

        RunnableC1741a(View view, int i) {
            this.f5031f = view;
            this.f5032g = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m3342f0(this.f5031f, this.f5032g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public class C1742b implements ValueAnimator.AnimatorUpdateListener {
        C1742b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f5012h != null) {
                BottomSheetBehavior.this.f5012h.m4543U(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    class C1743c extends C0291c.AbstractC0294c {
        C1743c() {
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: a */
        public int mo3329a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: b */
        public int mo3328b(View view, int i, int i2) {
            int m3356R = BottomSheetBehavior.this.m3356R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0142a.m8971b(i, m3356R, bottomSheetBehavior.f5023s ? bottomSheetBehavior.f4995A : bottomSheetBehavior.f5021q);
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: e */
        public int mo3327e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f5023s ? bottomSheetBehavior.f4995A : bottomSheetBehavior.f5021q;
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: j */
        public void mo3326j(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.m3343e0(1);
            }
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: k */
        public void mo3325k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m3358P(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
            if (java.lang.Math.abs(r8 - r6.f5035a.f5019o) < java.lang.Math.abs(r8 - r6.f5035a.f5021q)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
            if (java.lang.Math.abs(r8 - r6.f5035a.f5018n) < java.lang.Math.abs(r8 - r6.f5035a.f5021q)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f5035a.f5021q)) goto L33;
         */
        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo3324l(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C1743c.mo3324l(android.view.View, float, float):void");
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: m */
        public boolean mo3323m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f5025u;
            if (i2 == 1 || bottomSheetBehavior.f5002H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f5000F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f4997C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f4996B;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes.dex */
    public class C1744d implements InterfaceC0226f {

        /* renamed from: a */
        final /* synthetic */ int f5036a;

        C1744d(int i) {
            this.f5036a = i;
        }

        @Override // p000a.p019g.p028k.p029b0.InterfaceC0226f
        /* renamed from: a */
        public boolean mo3322a(View view, InterfaceC0226f.AbstractC0227a abstractC0227a) {
            BottomSheetBehavior.this.m3344d0(this.f5036a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1745e {
        /* renamed from: a */
        public abstract void m3321a(View view, float f);

        /* renamed from: b */
        public abstract void m3320b(View view, int i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes.dex */
    public static class C1746f extends AbstractC0280a {
        public static final Parcelable.Creator<C1746f> CREATOR = new C1747a();

        /* renamed from: h */
        final int f5038h;

        /* renamed from: i */
        int f5039i;

        /* renamed from: j */
        boolean f5040j;

        /* renamed from: k */
        boolean f5041k;

        /* renamed from: l */
        boolean f5042l;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        /* loaded from: classes.dex */
        static class C1747a implements Parcelable.ClassLoaderCreator<C1746f> {
            C1747a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1746f createFromParcel(Parcel parcel) {
                return new C1746f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1746f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1746f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1746f[] newArray(int i) {
                return new C1746f[i];
            }
        }

        public C1746f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5038h = parcel.readInt();
            this.f5039i = parcel.readInt();
            this.f5040j = parcel.readInt() == 1;
            this.f5041k = parcel.readInt() == 1;
            this.f5042l = parcel.readInt() == 1;
        }

        public C1746f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f5038h = bottomSheetBehavior.f5025u;
            this.f5039i = ((BottomSheetBehavior) bottomSheetBehavior).f5008d;
            this.f5040j = ((BottomSheetBehavior) bottomSheetBehavior).f5006b;
            this.f5041k = bottomSheetBehavior.f5023s;
            this.f5042l = ((BottomSheetBehavior) bottomSheetBehavior).f5024t;
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5038h);
            parcel.writeInt(this.f5039i);
            parcel.writeInt(this.f5040j ? 1 : 0);
            parcel.writeInt(this.f5041k ? 1 : 0);
            parcel.writeInt(this.f5042l ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes.dex */
    public class RunnableC1748g implements Runnable {

        /* renamed from: f */
        private final View f5043f;

        /* renamed from: g */
        private boolean f5044g;

        /* renamed from: h */
        int f5045h;

        RunnableC1748g(View view, int i) {
            this.f5043f = view;
            this.f5045h = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0291c c0291c = BottomSheetBehavior.this.f5026v;
            if (c0291c == null || !c0291c.m8446k(true)) {
                BottomSheetBehavior.this.m3343e0(this.f5045h);
            } else {
                C0252s.m8638Y(this.f5043f, this);
            }
            this.f5044g = false;
        }
    }

    public BottomSheetBehavior() {
        this.f5005a = 0;
        this.f5006b = true;
        this.f5015k = null;
        this.f5020p = 0.5f;
        this.f5022r = -1.0f;
        this.f5025u = 4;
        this.f4998D = new ArrayList<>();
        this.f5004J = new C1743c();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        this.f5005a = 0;
        this.f5006b = true;
        this.f5015k = null;
        this.f5020p = 0.5f;
        this.f5022r = -1.0f;
        this.f5025u = 4;
        this.f4998D = new ArrayList<>();
        this.f5004J = new C1743c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.BottomSheetBehavior_Layout);
        this.f5011g = obtainStyledAttributes.hasValue(C1349k.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(C1349k.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m3360N(context, attributeSet, hasValue, C1388c.m4262a(context, obtainStyledAttributes, C1349k.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m3361M(context, attributeSet, hasValue);
        }
        m3359O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5022r = obtainStyledAttributes.getDimension(C1349k.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(C1349k.BottomSheetBehavior_Layout_behavior_peekHeight);
        m3348Z((peekValue == null || (dimensionPixelSize = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(C1349k.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : dimensionPixelSize);
        m3349Y(obtainStyledAttributes.getBoolean(C1349k.BottomSheetBehavior_Layout_behavior_hideable, false));
        m3351W(obtainStyledAttributes.getBoolean(C1349k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m3345c0(obtainStyledAttributes.getBoolean(C1349k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        m3346b0(obtainStyledAttributes.getInt(C1349k.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        m3350X(obtainStyledAttributes.getFloat(C1349k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        m3352V(obtainStyledAttributes.getInt(C1349k.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.f5007c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: J */
    private void m3364J(V v, C0217c.C0218a c0218a, int i) {
        C0252s.m8631c0(v, c0218a, null, new C1744d(i));
    }

    /* renamed from: K */
    private void m3363K() {
        int max = this.f5009e ? Math.max(this.f5010f, this.f4995A - ((this.f5030z * 9) / 16)) : this.f5008d;
        if (this.f5006b) {
            this.f5021q = Math.max(this.f4995A - max, this.f5018n);
        } else {
            this.f5021q = this.f4995A - max;
        }
    }

    /* renamed from: L */
    private void m3362L() {
        this.f5019o = (int) (this.f4995A * (1.0f - this.f5020p));
    }

    /* renamed from: M */
    private void m3361M(Context context, AttributeSet attributeSet, boolean z) {
        m3360N(context, attributeSet, z, null);
    }

    /* renamed from: N */
    private void m3360N(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f5011g) {
            this.f5013i = C1322k.m4494e(context, attributeSet, C1338b.bottomSheetStyle, f4994K).m4457m();
            C1315g c1315g = new C1315g(this.f5013i);
            this.f5012h = c1315g;
            c1315g.m4552L(context);
            if (z && colorStateList != null) {
                this.f5012h.m4544T(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f5012h.setTint(typedValue.data);
        }
    }

    /* renamed from: O */
    private void m3359O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5016l = ofFloat;
        ofFloat.setDuration(500L);
        this.f5016l.addUpdateListener(new C1742b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public int m3356R() {
        return this.f5006b ? this.f5018n : this.f5017m;
    }

    /* renamed from: S */
    private float m3355S() {
        VelocityTracker velocityTracker = this.f4999E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f5007c);
        return this.f4999E.getYVelocity(this.f5000F);
    }

    /* renamed from: T */
    private void m3354T() {
        this.f5000F = -1;
        VelocityTracker velocityTracker = this.f4999E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4999E = null;
        }
    }

    /* renamed from: U */
    private void m3353U(C1746f c1746f) {
        int i = this.f5005a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f5008d = c1746f.f5039i;
        }
        int i2 = this.f5005a;
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f5006b = c1746f.f5040j;
        }
        int i3 = this.f5005a;
        if (i3 == -1 || (i3 & 4) == 4) {
            this.f5023s = c1746f.f5041k;
        }
        int i4 = this.f5005a;
        if (i4 == -1 || (i4 & 8) == 8) {
            this.f5024t = c1746f.f5042l;
        }
    }

    /* renamed from: g0 */
    private void m3341g0(int i) {
        V v = this.f4996B.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C0252s.m8651L(v)) {
            v.post(new RunnableC1741a(v, i));
        } else {
            m3342f0(v, i);
        }
    }

    /* renamed from: j0 */
    private void m3337j0() {
        V v;
        int i;
        C0217c.C0218a c0218a;
        WeakReference<V> weakReference = this.f4996B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C0252s.m8635a0(v, 524288);
        C0252s.m8635a0(v, 262144);
        C0252s.m8635a0(v, 1048576);
        if (this.f5023s && this.f5025u != 5) {
            m3364J(v, C0217c.C0218a.f697j, 5);
        }
        int i2 = this.f5025u;
        if (i2 == 3) {
            i = this.f5006b ? 4 : 6;
            c0218a = C0217c.C0218a.f696i;
        } else if (i2 != 4) {
            if (i2 != 6) {
                return;
            }
            m3364J(v, C0217c.C0218a.f696i, 4);
            m3364J(v, C0217c.C0218a.f695h, 3);
            return;
        } else {
            i = this.f5006b ? 3 : 6;
            c0218a = C0217c.C0218a.f695h;
        }
        m3364J(v, c0218a, i);
    }

    /* renamed from: k0 */
    private void m3336k0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f5014j != z) {
            this.f5014j = z;
            if (this.f5012h == null || (valueAnimator = this.f5016l) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f5016l.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f5016l.setFloatValues(1.0f - f, f);
            this.f5016l.start();
        }
    }

    /* renamed from: l0 */
    private void m3335l0(boolean z) {
        int intValue;
        WeakReference<V> weakReference = this.f4996B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f5003I != null) {
                    return;
                }
                this.f5003I = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f4996B.get()) {
                    if (!z) {
                        Map<View, Integer> map = this.f5003I;
                        intValue = (map != null && map.containsKey(childAt)) ? this.f5003I.get(childAt).intValue() : 4;
                    } else if (Build.VERSION.SDK_INT >= 16) {
                        this.f5003I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    C0252s.m8605p0(childAt, intValue);
                }
            }
            if (z) {
                return;
            }
            this.f5003I = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: A */
    public boolean mo3371A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f5028x = 0;
        this.f5029y = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f5021q)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.f5019o) < java.lang.Math.abs(r3 - r2.f5021q)) goto L35;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3370C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m3356R()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m3343e0(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f4997C
            if (r3 == 0) goto La4
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto La4
            boolean r3 = r2.f5029y
            if (r3 != 0) goto L1f
            goto La4
        L1f:
            int r3 = r2.f5028x
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L2b
            int r3 = r2.m3356R()
            goto L9e
        L2b:
            boolean r3 = r2.f5023s
            if (r3 == 0) goto L3d
            float r3 = r2.m3355S()
            boolean r3 = r2.m3340h0(r4, r3)
            if (r3 == 0) goto L3d
            int r3 = r2.f4995A
            r0 = 5
            goto L9e
        L3d:
            int r3 = r2.f5028x
            if (r3 != 0) goto L7e
            int r3 = r4.getTop()
            boolean r1 = r2.f5006b
            if (r1 == 0) goto L5d
            int r5 = r2.f5018n
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f5021q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L82
            int r3 = r2.f5018n
            goto L9e
        L5d:
            int r1 = r2.f5019o
            if (r3 >= r1) goto L6e
            int r6 = r2.f5021q
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L9b
            int r3 = r2.f5017m
            goto L9e
        L6e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f5021q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L82
            goto L9b
        L7e:
            boolean r3 = r2.f5006b
            if (r3 == 0) goto L86
        L82:
            int r3 = r2.f5021q
            r0 = 4
            goto L9e
        L86:
            int r3 = r4.getTop()
            int r0 = r2.f5019o
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f5021q
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L82
        L9b:
            int r3 = r2.f5019o
            r0 = 6
        L9e:
            r5 = 0
            r2.m3339i0(r4, r0, r3, r5)
            r2.f5029y = r5
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3370C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: D */
    public boolean mo2436D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f5025u == 1 && actionMasked == 0) {
                return true;
            }
            C0291c c0291c = this.f5026v;
            if (c0291c != null) {
                c0291c.m8431z(motionEvent);
            }
            if (actionMasked == 0) {
                m3354T();
            }
            if (this.f4999E == null) {
                this.f4999E = VelocityTracker.obtain();
            }
            this.f4999E.addMovement(motionEvent);
            if (actionMasked == 2 && !this.f5027w && Math.abs(this.f5001G - motionEvent.getY()) > this.f5026v.m8436u()) {
                this.f5026v.m8455b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.f5027w;
        }
        return false;
    }

    /* renamed from: P */
    void m3358P(int i) {
        float f;
        float m3356R;
        V v = this.f4996B.get();
        if (v == null || this.f4998D.isEmpty()) {
            return;
        }
        int i2 = this.f5021q;
        if (i > i2) {
            f = i2 - i;
            m3356R = this.f4995A - i2;
        } else {
            f = i2 - i;
            m3356R = i2 - m3356R();
        }
        float f2 = f / m3356R;
        for (int i3 = 0; i3 < this.f4998D.size(); i3++) {
            this.f4998D.get(i3).m3321a(v, f2);
        }
    }

    /* renamed from: Q */
    View m3357Q(View view) {
        if (C0252s.m8649N(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m3357Q = m3357Q(viewGroup.getChildAt(i));
                if (m3357Q != null) {
                    return m3357Q;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: V */
    public void m3352V(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f5017m = i;
    }

    /* renamed from: W */
    public void m3351W(boolean z) {
        if (this.f5006b == z) {
            return;
        }
        this.f5006b = z;
        if (this.f4996B != null) {
            m3363K();
        }
        m3343e0((this.f5006b && this.f5025u == 6) ? 3 : this.f5025u);
        m3337j0();
    }

    /* renamed from: X */
    public void m3350X(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f5020p = f;
    }

    /* renamed from: Y */
    public void m3349Y(boolean z) {
        if (this.f5023s != z) {
            this.f5023s = z;
            if (!z && this.f5025u == 5) {
                m3344d0(4);
            }
            m3337j0();
        }
    }

    /* renamed from: Z */
    public void m3348Z(int i) {
        m3347a0(i, false);
    }

    /* renamed from: a0 */
    public final void m3347a0(int i, boolean z) {
        V v;
        boolean z2 = true;
        if (i == -1) {
            if (!this.f5009e) {
                this.f5009e = true;
            }
            z2 = false;
        } else {
            if (this.f5009e || this.f5008d != i) {
                this.f5009e = false;
                this.f5008d = Math.max(0, i);
            }
            z2 = false;
        }
        if (!z2 || this.f4996B == null) {
            return;
        }
        m3363K();
        if (this.f5025u != 4 || (v = this.f4996B.get()) == null) {
            return;
        }
        if (z) {
            m3341g0(this.f5025u);
        } else {
            v.requestLayout();
        }
    }

    /* renamed from: b0 */
    public void m3346b0(int i) {
        this.f5005a = i;
    }

    /* renamed from: c0 */
    public void m3345c0(boolean z) {
        this.f5024t = z;
    }

    /* renamed from: d0 */
    public void m3344d0(int i) {
        if (i == this.f5025u) {
            return;
        }
        if (this.f4996B != null) {
            m3341g0(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.f5023s && i == 5)) {
            this.f5025u = i;
        }
    }

    /* renamed from: e0 */
    void m3343e0(int i) {
        V v;
        if (this.f5025u == i) {
            return;
        }
        this.f5025u = i;
        WeakReference<V> weakReference = this.f4996B;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            m3335l0(true);
        } else if (i == 5 || i == 4) {
            m3335l0(false);
        }
        m3336k0(i);
        for (int i2 = 0; i2 < this.f4998D.size(); i2++) {
            this.f4998D.get(i2).m3320b(v, i);
        }
        m3337j0();
    }

    /* renamed from: f0 */
    void m3342f0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f5021q;
        } else if (i == 6) {
            int i4 = this.f5019o;
            if (!this.f5006b || i4 > (i3 = this.f5018n)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = m3356R();
        } else if (!this.f5023s || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f4995A;
        }
        m3339i0(view, i, i2, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: g */
    public void mo2437g(CoordinatorLayout.C0696f c0696f) {
        super.mo2437g(c0696f);
        this.f4996B = null;
        this.f5026v = null;
    }

    /* renamed from: h0 */
    boolean m3340h0(View view, float f) {
        if (this.f5024t) {
            return true;
        }
        return view.getTop() >= this.f5021q && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f5021q)) / ((float) this.f5008d) > 0.5f;
    }

    /* renamed from: i0 */
    void m3339i0(View view, int i, int i2, boolean z) {
        if (!(z ? this.f5026v.m8460F(view.getLeft(), i2) : this.f5026v.m8458H(view, view.getLeft(), i2))) {
            m3343e0(i);
            return;
        }
        m3343e0(2);
        m3336k0(i);
        if (this.f5015k == null) {
            this.f5015k = new RunnableC1748g(view, i);
        }
        if (((RunnableC1748g) this.f5015k).f5044g) {
            this.f5015k.f5045h = i;
            return;
        }
        BottomSheetBehavior<V>.RunnableC1748g runnableC1748g = this.f5015k;
        runnableC1748g.f5045h = i;
        C0252s.m8638Y(view, runnableC1748g);
        ((RunnableC1748g) this.f5015k).f5044g = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: j */
    public void mo3338j() {
        super.mo3338j();
        this.f4996B = null;
        this.f5026v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: k */
    public boolean mo2661k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0291c c0291c;
        if (!v.isShown()) {
            this.f5027w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3354T();
        }
        if (this.f4999E == null) {
            this.f4999E = VelocityTracker.obtain();
        }
        this.f4999E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f5001G = (int) motionEvent.getY();
            if (this.f5025u != 2) {
                WeakReference<View> weakReference = this.f4997C;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m7089B(view, x, this.f5001G)) {
                    this.f5000F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5002H = true;
                }
            }
            this.f5027w = this.f5000F == -1 && !coordinatorLayout.m7089B(v, x, this.f5001G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5002H = false;
            this.f5000F = -1;
            if (this.f5027w) {
                this.f5027w = false;
                return false;
            }
        }
        if (this.f5027w || (c0291c = this.f5026v) == null || !c0291c.m8459G(motionEvent)) {
            WeakReference<View> weakReference2 = this.f4997C;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.f5027w || this.f5025u == 1 || coordinatorLayout.m7089B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f5026v == null || Math.abs(((float) this.f5001G) - motionEvent.getY()) <= ((float) this.f5026v.m8436u())) ? false : true;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: l */
    public boolean mo2460l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C1315g c1315g;
        if (C0252s.m8598t(coordinatorLayout) && !C0252s.m8598t(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f4996B == null) {
            this.f5010f = coordinatorLayout.getResources().getDimensionPixelSize(C1342d.design_bottom_sheet_peek_height_min);
            this.f4996B = new WeakReference<>(v);
            if (this.f5011g && (c1315g = this.f5012h) != null) {
                C0252s.m8619i0(v, c1315g);
            }
            C1315g c1315g2 = this.f5012h;
            if (c1315g2 != null) {
                float f = this.f5022r;
                if (f == -1.0f) {
                    f = C0252s.m8602r(v);
                }
                c1315g2.m4545S(f);
                boolean z = this.f5025u == 3;
                this.f5014j = z;
                this.f5012h.m4543U(z ? 0.0f : 1.0f);
            }
            m3337j0();
            if (C0252s.m8596u(v) == 0) {
                C0252s.m8605p0(v, 1);
            }
        }
        if (this.f5026v == null) {
            this.f5026v = C0291c.m8444m(coordinatorLayout, this.f5004J);
        }
        int top = v.getTop();
        coordinatorLayout.m7082I(v, i);
        this.f5030z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f4995A = height;
        this.f5018n = Math.max(0, height - v.getHeight());
        m3362L();
        m3363K();
        int i3 = this.f5025u;
        if (i3 == 3) {
            i2 = m3356R();
        } else if (i3 == 6) {
            i2 = this.f5019o;
        } else if (this.f5023s && i3 == 5) {
            i2 = this.f4995A;
        } else {
            int i4 = this.f5025u;
            if (i4 != 4) {
                if (i4 == 1 || i4 == 2) {
                    C0252s.m8644S(v, top - v.getTop());
                }
                this.f4997C = new WeakReference<>(m3357Q(v));
                return true;
            }
            i2 = this.f5021q;
        }
        C0252s.m8644S(v, i2);
        this.f4997C = new WeakReference<>(m3357Q(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: o */
    public boolean mo3334o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f4997C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f5025u != 3 || super.mo3334o(coordinatorLayout, v, view, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: q */
    public void mo3333q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f4997C;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m3356R()) {
                iArr[1] = top - m3356R();
                C0252s.m8644S(v, -iArr[1]);
                i4 = 3;
                m3343e0(i4);
            } else {
                iArr[1] = i2;
                C0252s.m8644S(v, -i2);
                m3343e0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f5021q;
            if (i5 <= i6 || this.f5023s) {
                iArr[1] = i2;
                C0252s.m8644S(v, -i2);
                m3343e0(1);
            } else {
                iArr[1] = top - i6;
                C0252s.m8644S(v, -iArr[1]);
                i4 = 4;
                m3343e0(i4);
            }
        }
        m3358P(v.getTop());
        this.f5028x = i2;
        this.f5029y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: t */
    public void mo3332t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: x */
    public void mo3331x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C1746f c1746f = (C1746f) parcelable;
        super.mo3331x(coordinatorLayout, v, c1746f.m8522a());
        m3353U(c1746f);
        int i = c1746f.f5038h;
        this.f5025u = (i == 1 || i == 2) ? 4 : 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: y */
    public Parcelable mo3330y(CoordinatorLayout coordinatorLayout, V v) {
        return new C1746f(super.mo3330y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
