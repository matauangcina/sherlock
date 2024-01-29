package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0759a;
import com.google.android.material.internal.C1851g;
import java.lang.ref.WeakReference;
import java.util.List;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p023f.C0142a;
import p000a.p019g.p027j.C0189d;
import p000a.p019g.p028k.C0197a0;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0243j;
import p000a.p019g.p028k.InterfaceC0249p;
import p000a.p032i.p033a.AbstractC0280a;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1345g;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
import p054b.p059c.p060a.p075b.p078l.C1350a;
@CoordinatorLayout.InterfaceC0694d(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {

    /* renamed from: f */
    private int f4875f;

    /* renamed from: g */
    private int f4876g;

    /* renamed from: h */
    private int f4877h;

    /* renamed from: i */
    private int f4878i;

    /* renamed from: j */
    private boolean f4879j;

    /* renamed from: k */
    private int f4880k;

    /* renamed from: l */
    private C0197a0 f4881l;

    /* renamed from: m */
    private List<InterfaceC1718c> f4882m;

    /* renamed from: n */
    private boolean f4883n;

    /* renamed from: o */
    private boolean f4884o;

    /* renamed from: p */
    private boolean f4885p;

    /* renamed from: q */
    private boolean f4886q;

    /* renamed from: r */
    private int f4887r;

    /* renamed from: s */
    private WeakReference<View> f4888s;

    /* renamed from: t */
    private ValueAnimator f4889t;

    /* renamed from: u */
    private int[] f4890u;

    /* renamed from: v */
    private Drawable f4891v;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC1720a<T> {

        /* renamed from: k */
        private int f4892k;

        /* renamed from: l */
        private int f4893l;

        /* renamed from: m */
        private ValueAnimator f4894m;

        /* renamed from: n */
        private int f4895n;

        /* renamed from: o */
        private boolean f4896o;

        /* renamed from: p */
        private float f4897p;

        /* renamed from: q */
        private WeakReference<View> f4898q;

        /* renamed from: r */
        private AbstractC1713b f4899r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        public class C1712a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f4900a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f4901b;

            C1712a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f4900a = coordinatorLayout;
                this.f4901b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m3461P(this.f4900a, this.f4901b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1713b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean m3483a(T t);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes.dex */
        public static class C1714c extends AbstractC0280a {
            public static final Parcelable.Creator<C1714c> CREATOR = new C1715a();

            /* renamed from: h */
            int f4903h;

            /* renamed from: i */
            float f4904i;

            /* renamed from: j */
            boolean f4905j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            /* loaded from: classes.dex */
            static class C1715a implements Parcelable.ClassLoaderCreator<C1714c> {
                C1715a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C1714c createFromParcel(Parcel parcel) {
                    return new C1714c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public C1714c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C1714c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public C1714c[] newArray(int i) {
                    return new C1714c[i];
                }
            }

            public C1714c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4903h = parcel.readInt();
                this.f4904i = parcel.readFloat();
                this.f4905j = parcel.readByte() != 0;
            }

            public C1714c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f4903h);
                parcel.writeFloat(this.f4904i);
                parcel.writeByte(this.f4905j ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f4895n = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4895n = -1;
        }

        /* renamed from: S */
        private void m3507S(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo3464M() - i);
            float abs2 = Math.abs(f);
            m3506T(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        /* renamed from: T */
        private void m3506T(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo3464M = mo3464M();
            if (mo3464M == i) {
                ValueAnimator valueAnimator = this.f4894m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f4894m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f4894m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f4894m = valueAnimator3;
                valueAnimator3.setInterpolator(C1350a.f4234e);
                this.f4894m.addUpdateListener(new C1712a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f4894m.setDuration(Math.min(i2, 600));
            this.f4894m.setIntValues(mo3464M, i);
            this.f4894m.start();
        }

        /* renamed from: V */
        private boolean m3504V(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m3523h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: W */
        private static boolean m3503W(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: X */
        private View m3502X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0243j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: Y */
        private static View m3501Y(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: Z */
        private int m3500Z(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1719d c1719d = (C1719d) childAt.getLayoutParams();
                if (m3503W(c1719d.m3473a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c1719d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c1719d).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c0 */
        private int m3497c0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C1719d c1719d = (C1719d) childAt.getLayoutParams();
                Interpolator m3472b = c1719d.m3472b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (m3472b != null) {
                    int m3473a = c1719d.m3473a();
                    if ((m3473a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c1719d).topMargin + ((LinearLayout.LayoutParams) c1719d).bottomMargin;
                        if ((m3473a & 2) != 0) {
                            i2 -= C0252s.m8590x(childAt);
                        }
                    }
                    if (C0252s.m8598t(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * m3472b.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: n0 */
        private boolean m3486n0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m7054s = coordinatorLayout.m7054s(t);
            int size = m7054s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0693c m7030f = ((CoordinatorLayout.C0696f) m7054s.get(i).getLayoutParams()).m7030f();
                if (m7030f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m7030f).m3456K() != 0;
                }
            }
            return false;
        }

        /* renamed from: o0 */
        private void m3485o0(CoordinatorLayout coordinatorLayout, T t) {
            int mo3464M = mo3464M();
            int m3500Z = m3500Z(t, mo3464M);
            if (m3500Z >= 0) {
                View childAt = t.getChildAt(m3500Z);
                C1719d c1719d = (C1719d) childAt.getLayoutParams();
                int m3473a = c1719d.m3473a();
                if ((m3473a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m3500Z == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m3503W(m3473a, 2)) {
                        i2 += C0252s.m8590x(childAt);
                    } else if (m3503W(m3473a, 5)) {
                        int m8590x = C0252s.m8590x(childAt) + i2;
                        if (mo3464M < m8590x) {
                            i = m8590x;
                        } else {
                            i2 = m8590x;
                        }
                    }
                    if (m3503W(m3473a, 32)) {
                        i += ((LinearLayout.LayoutParams) c1719d).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) c1719d).bottomMargin;
                    }
                    if (mo3464M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m3507S(coordinatorLayout, t, C0142a.m8971b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: p0 */
        private void m3484p0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m3501Y = m3501Y(t, i);
            if (m3501Y != null) {
                int m3473a = ((C1719d) m3501Y.getLayoutParams()).m3473a();
                boolean z2 = false;
                if ((m3473a & 1) != 0) {
                    int m8590x = C0252s.m8590x(m3501Y);
                    if (i2 <= 0 || (m3473a & 12) == 0 ? !((m3473a & 2) == 0 || (-i) < (m3501Y.getBottom() - m8590x) - t.getTopInset()) : (-i) >= (m3501Y.getBottom() - m8590x) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.m3521j()) {
                    z2 = t.m3512s(m3502X(coordinatorLayout));
                }
                boolean m3514q = t.m3514q(z2);
                if (z || (m3514q && m3486n0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC1720a
        /* renamed from: M */
        int mo3464M() {
            return m3449E() + this.f4892k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1720a
        /* renamed from: U */
        public boolean mo3469H(T t) {
            AbstractC1713b abstractC1713b = this.f4899r;
            if (abstractC1713b != null) {
                return abstractC1713b.m3483a(t);
            }
            WeakReference<View> weakReference = this.f4898q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1720a
        /* renamed from: a0 */
        public int mo3466K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1720a
        /* renamed from: b0 */
        public int mo3465L(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1720a
        /* renamed from: d0 */
        public void mo3463N(CoordinatorLayout coordinatorLayout, T t) {
            m3485o0(coordinatorLayout, t);
            if (t.m3521j()) {
                t.m3514q(t.m3512s(m3502X(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C1723c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: e0 */
        public boolean mo2460l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean mo2460l = super.mo2460l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f4895n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                m3461P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f4896o ? C0252s.m8590x(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.f4897p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m3507S(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        m3461P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m3507S(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m3461P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m3518m();
            this.f4895n = -1;
            m3447G(C0142a.m8971b(m3449E(), -t.getTotalScrollRange(), 0));
            m3484p0(coordinatorLayout, t, m3449E(), 0, true);
            t.m3520k(m3449E());
            return mo2460l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: f0 */
        public boolean mo3450m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0696f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.m7081J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.mo3450m(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: g0 */
        public void mo3333q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = m3462O(coordinatorLayout, t, i2, i4, i5);
                }
            }
            if (t.m3521j()) {
                t.m3514q(t.m3512s(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: h0 */
        public void mo3332t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m3462O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: i0 */
        public void mo3331x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof C1714c)) {
                super.mo3331x(coordinatorLayout, t, parcelable);
                this.f4895n = -1;
                return;
            }
            C1714c c1714c = (C1714c) parcelable;
            super.mo3331x(coordinatorLayout, t, c1714c.m8522a());
            this.f4895n = c1714c.f4903h;
            this.f4897p = c1714c.f4904i;
            this.f4896o = c1714c.f4905j;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: j0 */
        public Parcelable mo3330y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo3330y = super.mo3330y(coordinatorLayout, t);
            int m3449E = m3449E();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + m3449E;
                if (childAt.getTop() + m3449E <= 0 && bottom >= 0) {
                    C1714c c1714c = new C1714c(mo3330y);
                    c1714c.f4903h = i;
                    c1714c.f4905j = bottom == C0252s.m8590x(childAt) + t.getTopInset();
                    c1714c.f4904i = bottom / childAt.getHeight();
                    return c1714c;
                }
            }
            return mo3330y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: k0 */
        public boolean mo3371A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m3521j() || m3504V(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f4894m) != null) {
                valueAnimator.cancel();
            }
            this.f4898q = null;
            this.f4893l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: l0 */
        public void mo3370C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f4893l == 0 || i == 1) {
                m3485o0(coordinatorLayout, t);
                if (t.m3521j()) {
                    t.m3514q(t.m3512s(view));
                }
            }
            this.f4898q = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1720a
        /* renamed from: m0 */
        public int mo3460Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int mo3464M = mo3464M();
            int i4 = 0;
            if (i2 == 0 || mo3464M < i2 || mo3464M > i3) {
                this.f4892k = 0;
            } else {
                int m8971b = C0142a.m8971b(i, i2, i3);
                if (mo3464M != m8971b) {
                    int m3497c0 = t.m3525f() ? m3497c0(t, m8971b) : m8971b;
                    boolean m3447G = m3447G(m3497c0);
                    i4 = mo3464M - m8971b;
                    this.f4892k = m8971b - m3497c0;
                    if (!m3447G && t.m3525f()) {
                        coordinatorLayout.m7061g(t);
                    }
                    t.m3520k(m3449E());
                    m3484p0(coordinatorLayout, t, m8971b, m8971b < mo3464M ? -1 : 1, false);
                }
            }
            return i4;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC1722b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.ScrollingViewBehavior_Layout);
            m3452O(obtainStyledAttributes.getDimensionPixelSize(C1349k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: R */
        private static int m3478R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0693c m7030f = ((CoordinatorLayout.C0696f) appBarLayout.getLayoutParams()).m7030f();
            if (m7030f instanceof BaseBehavior) {
                return ((BaseBehavior) m7030f).mo3464M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m3477S(View view, View view2) {
            CoordinatorLayout.AbstractC0693c m7030f = ((CoordinatorLayout.C0696f) view2.getLayoutParams()).m7030f();
            if (m7030f instanceof BaseBehavior) {
                C0252s.m8644S(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m7030f).f4892k) + m3454M()) - m3458I(view2));
            }
        }

        /* renamed from: T */
        private void m3476T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m3521j()) {
                    appBarLayout.m3514q(appBarLayout.m3512s(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC1722b
        /* renamed from: J */
        float mo3457J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m3478R = m3478R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m3478R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m3478R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC1722b
        /* renamed from: L */
        int mo3455L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo3455L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1722b
        /* renamed from: Q */
        public AppBarLayout mo3459H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: e */
        public boolean mo2433e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: h */
        public boolean mo2461h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m3477S(view, view2);
            m3476T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: w */
        public boolean mo3475w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo3459H = mo3459H(coordinatorLayout.m7055r(view));
            if (mo3459H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f4921d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo3459H.m3517n(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes.dex */
    class C1716a implements InterfaceC0249p {
        C1716a() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0249p
        /* renamed from: a */
        public C0197a0 mo2660a(View view, C0197a0 c0197a0) {
            AppBarLayout.this.m3519l(c0197a0);
            return c0197a0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes.dex */
    public class C1717b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1315g f4907a;

        C1717b(AppBarLayout appBarLayout, C1315g c1315g) {
            this.f4907a = c1315g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4907a.m4545S(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1718c<T extends AppBarLayout> {
        /* renamed from: a */
        void m3474a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: classes.dex */
    public static class C1719d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f4908a;

        /* renamed from: b */
        Interpolator f4909b;

        public C1719d(int i, int i2) {
            super(i, i2);
            this.f4908a = 1;
        }

        public C1719d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4908a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.AppBarLayout_Layout);
            this.f4908a = obtainStyledAttributes.getInt(C1349k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C1349k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f4909b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C1349k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C1719d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4908a = 1;
        }

        public C1719d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4908a = 1;
        }

        public C1719d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4908a = 1;
        }

        /* renamed from: a */
        public int m3473a() {
            return this.f4908a;
        }

        /* renamed from: b */
        public Interpolator m3472b() {
            return this.f4909b;
        }

        /* renamed from: c */
        boolean m3471c() {
            int i = this.f4908a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4876g = -1;
        this.f4877h = -1;
        this.f4878i = -1;
        this.f4880k = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C1725e.m3441a(this);
            C1725e.m3439c(this, attributeSet, i, C1348j.Widget_Design_AppBarLayout);
        }
        TypedArray m2714k = C1851g.m2714k(context, attributeSet, C1349k.AppBarLayout, i, C1348j.Widget_Design_AppBarLayout, new int[0]);
        C0252s.m8619i0(this, m2714k.getDrawable(C1349k.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            C1315g c1315g = new C1315g();
            c1315g.m4544T(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            c1315g.m4552L(context);
            C0252s.m8619i0(this, c1315g);
        }
        if (m2714k.hasValue(C1349k.AppBarLayout_expanded)) {
            m3516o(m2714k.getBoolean(C1349k.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && m2714k.hasValue(C1349k.AppBarLayout_elevation)) {
            C1725e.m3440b(this, m2714k.getDimensionPixelSize(C1349k.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (m2714k.hasValue(C1349k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(m2714k.getBoolean(C1349k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (m2714k.hasValue(C1349k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(m2714k.getBoolean(C1349k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f4886q = m2714k.getBoolean(C1349k.AppBarLayout_liftOnScroll, false);
        this.f4887r = m2714k.getResourceId(C1349k.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(m2714k.getDrawable(C1349k.AppBarLayout_statusBarForeground));
        m2714k.recycle();
        C0252s.m8601r0(this, new C1716a());
    }

    /* renamed from: a */
    private void m3530a() {
        WeakReference<View> weakReference = this.f4888s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f4888s = null;
    }

    /* renamed from: b */
    private View m3529b(View view) {
        int i;
        if (this.f4888s == null && (i = this.f4887r) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f4887r);
            }
            if (findViewById != null) {
                this.f4888s = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f4888s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m3524g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1719d) getChildAt(i).getLayoutParams()).m3471c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m3522i() {
        this.f4876g = -1;
        this.f4877h = -1;
        this.f4878i = -1;
    }

    /* renamed from: o */
    private void m3516o(boolean z, boolean z2, boolean z3) {
        this.f4880k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: p */
    private boolean m3515p(boolean z) {
        if (this.f4884o != z) {
            this.f4884o = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m3513r() {
        return this.f4891v != null && getTopInset() > 0;
    }

    /* renamed from: t */
    private boolean m3511t() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || C0252s.m8598t(childAt)) ? false : true;
        }
        return false;
    }

    /* renamed from: u */
    private void m3510u(C1315g c1315g, boolean z) {
        float dimension = getResources().getDimension(C1342d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f4889t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f4889t = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C1345g.app_bar_elevation_anim_duration));
        this.f4889t.setInterpolator(C1350a.f4230a);
        this.f4889t.addUpdateListener(new C1717b(this, c1315g));
        this.f4889t.start();
    }

    /* renamed from: v */
    private void m3509v() {
        setWillNotDraw(!m3513r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public C1719d generateDefaultLayoutParams() {
        return new C1719d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1719d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public C1719d generateLayoutParams(AttributeSet attributeSet) {
        return new C1719d(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m3513r()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f4875f);
            this.f4891v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4891v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public C1719d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1719d((ViewGroup.MarginLayoutParams) layoutParams) : new C1719d(layoutParams) : new C1719d((LinearLayout.LayoutParams) layoutParams);
    }

    /* renamed from: f */
    boolean m3525f() {
        return this.f4879j;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int m8590x;
        int i2 = this.f4877h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C1719d c1719d = (C1719d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c1719d.f4908a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) c1719d).topMargin + ((LinearLayout.LayoutParams) c1719d).bottomMargin;
                if ((i4 & 8) != 0) {
                    m8590x = C0252s.m8590x(childAt);
                } else if ((i4 & 2) != 0) {
                    m8590x = measuredHeight - C0252s.m8590x(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C0252s.m8598t(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + m8590x;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f4877h = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f4878i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1719d c1719d = (C1719d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c1719d).topMargin + ((LinearLayout.LayoutParams) c1719d).bottomMargin;
            int i4 = c1719d.f4908a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0252s.m8590x(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f4878i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f4887r;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m8590x = C0252s.m8590x(this);
        if (m8590x == 0) {
            int childCount = getChildCount();
            m8590x = childCount >= 1 ? C0252s.m8590x(getChildAt(childCount - 1)) : 0;
            if (m8590x == 0) {
                return getHeight() / 3;
            }
        }
        return (m8590x * 2) + topInset;
    }

    int getPendingAction() {
        return this.f4880k;
    }

    public Drawable getStatusBarForeground() {
        return this.f4891v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0197a0 c0197a0 = this.f4881l;
        if (c0197a0 != null) {
            return c0197a0.m8850k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f4876g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C1719d c1719d = (C1719d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c1719d.f4908a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c1719d).topMargin + ((LinearLayout.LayoutParams) c1719d).bottomMargin;
            if (i2 == 0 && C0252s.m8598t(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C0252s.m8590x(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f4876g = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m3523h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean m3521j() {
        return this.f4886q;
    }

    /* renamed from: k */
    void m3520k(int i) {
        this.f4875f = i;
        if (!willNotDraw()) {
            C0252s.m8639X(this);
        }
        List<InterfaceC1718c> list = this.f4882m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1718c interfaceC1718c = this.f4882m.get(i2);
                if (interfaceC1718c != null) {
                    interfaceC1718c.m3474a(this, i);
                }
            }
        }
    }

    /* renamed from: l */
    C0197a0 m3519l(C0197a0 c0197a0) {
        C0197a0 c0197a02 = C0252s.m8598t(this) ? c0197a0 : null;
        if (!C0189d.m8873a(this.f4881l, c0197a02)) {
            this.f4881l = c0197a02;
            m3509v();
            requestLayout();
        }
        return c0197a0;
    }

    /* renamed from: m */
    void m3518m() {
        this.f4880k = 0;
    }

    /* renamed from: n */
    public void m3517n(boolean z, boolean z2) {
        m3516o(z, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1319h.m4502e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f4890u == null) {
            this.f4890u = new int[4];
        }
        int[] iArr = this.f4890u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f4884o ? C1338b.state_liftable : -C1338b.state_liftable;
        iArr[1] = (this.f4884o && this.f4885p) ? C1338b.state_lifted : -C1338b.state_lifted;
        iArr[2] = this.f4884o ? C1338b.state_collapsible : -C1338b.state_collapsible;
        iArr[3] = (this.f4884o && this.f4885p) ? C1338b.state_collapsed : -C1338b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3530a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C0252s.m8598t(this) && m3511t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0252s.m8644S(getChildAt(childCount), topInset);
            }
        }
        m3522i();
        this.f4879j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C1719d) getChildAt(i5).getLayoutParams()).m3472b() != null) {
                this.f4879j = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f4891v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f4883n) {
            return;
        }
        if (!this.f4886q && !m3524g()) {
            z2 = false;
        }
        m3515p(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0252s.m8598t(this) && m3511t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0142a.m8971b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m3522i();
    }

    /* renamed from: q */
    boolean m3514q(boolean z) {
        if (this.f4885p != z) {
            this.f4885p = z;
            refreshDrawableState();
            if (this.f4886q && (getBackground() instanceof C1315g)) {
                m3510u((C1315g) getBackground(), z);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: s */
    boolean m3512s(View view) {
        View m3529b = m3529b(view);
        if (m3529b != null) {
            view = m3529b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1319h.m4503d(this, f);
    }

    public void setExpanded(boolean z) {
        m3517n(z, C0252s.m8650M(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f4886q = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f4887r = i;
        m3530a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f4891v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f4891v = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f4891v.setState(getDrawableState());
                }
                C0759a.m6749m(this.f4891v, C0252s.m8592w(this));
                this.f4891v.setVisible(getVisibility() == 0, false);
                this.f4891v.setCallback(this);
            }
            m3509v();
            C0252s.m8639X(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0010a.m9577d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1725e.m3440b(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f4891v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4891v;
    }
}
