package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p078l.C1351b;
import p054b.p059c.p060a.p075b.p078l.C1352c;
import p054b.p059c.p060a.p075b.p078l.C1353d;
import p054b.p059c.p060a.p075b.p078l.C1354e;
import p054b.p059c.p060a.p075b.p078l.C1357h;
import p054b.p059c.p060a.p075b.p078l.C1358i;
import p054b.p059c.p060a.p075b.p078l.C1359j;
import p054b.p059c.p060a.p075b.p082p.C1366a;
import p054b.p059c.p060a.p075b.p082p.C1369c;
import p054b.p059c.p060a.p075b.p082p.InterfaceC1370d;
import p054b.p059c.p060a.p075b.p089v.C1383a;
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f5729c;

    /* renamed from: d */
    private final RectF f5730d;

    /* renamed from: e */
    private final RectF f5731e;

    /* renamed from: f */
    private final int[] f5732f;

    /* renamed from: g */
    private float f5733g;

    /* renamed from: h */
    private float f5734h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C1925a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f5735a;

        /* renamed from: b */
        final /* synthetic */ View f5736b;

        /* renamed from: c */
        final /* synthetic */ View f5737c;

        C1925a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f5735a = z;
            this.f5736b = view;
            this.f5737c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5735a) {
                return;
            }
            this.f5736b.setVisibility(4);
            this.f5737c.setAlpha(1.0f);
            this.f5737c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f5735a) {
                this.f5736b.setVisibility(0);
                this.f5737c.setAlpha(0.0f);
                this.f5737c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes.dex */
    public class C1926b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f5738a;

        C1926b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f5738a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5738a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes.dex */
    public class C1927c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1370d f5739a;

        /* renamed from: b */
        final /* synthetic */ Drawable f5740b;

        C1927c(FabTransformationBehavior fabTransformationBehavior, InterfaceC1370d interfaceC1370d, Drawable drawable) {
            this.f5739a = interfaceC1370d;
            this.f5740b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5739a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5739a.setCircularRevealOverlayDrawable(this.f5740b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes.dex */
    public class C1928d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1370d f5741a;

        C1928d(FabTransformationBehavior fabTransformationBehavior, InterfaceC1370d interfaceC1370d) {
            this.f5741a = interfaceC1370d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC1370d.C1375e revealInfo = this.f5741a.getRevealInfo();
            revealInfo.f4274c = Float.MAX_VALUE;
            this.f5741a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes.dex */
    public static class C1929e {

        /* renamed from: a */
        public C1357h f5742a;

        /* renamed from: b */
        public C1359j f5743b;
    }

    public FabTransformationBehavior() {
        this.f5729c = new Rect();
        this.f5730d = new RectF();
        this.f5731e = new RectF();
        this.f5732f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5729c = new Rect();
        this.f5730d = new RectF();
        this.f5731e = new RectF();
        this.f5732f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m2458K(View view) {
        View findViewById = view.findViewById(C1344f.mtrl_child_content_container);
        return findViewById != null ? m2438f0(findViewById) : ((view instanceof C1932b) || (view instanceof C1931a)) ? m2438f0(((ViewGroup) view).getChildAt(0)) : m2438f0(view);
    }

    /* renamed from: L */
    private void m2457L(View view, C1929e c1929e, C1358i c1358i, C1358i c1358i2, float f, float f2, float f3, float f4, RectF rectF) {
        float m2450S = m2450S(c1929e, c1358i, f, f3);
        float m2450S2 = m2450S(c1929e, c1358i2, f2, f4);
        Rect rect = this.f5729c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f5730d;
        rectF2.set(rect);
        RectF rectF3 = this.f5731e;
        m2449T(view, rectF3);
        rectF3.offset(m2450S, m2450S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m2456M(View view, RectF rectF) {
        m2449T(view, rectF);
        rectF.offset(this.f5733g, this.f5734h);
    }

    /* renamed from: N */
    private Pair<C1358i, C1358i> m2455N(float f, float f2, boolean z, C1929e c1929e) {
        C1358i m4363e;
        C1357h c1357h;
        String str;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            m4363e = c1929e.f5742a.m4363e("translationXLinear");
            c1357h = c1929e.f5742a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            m4363e = c1929e.f5742a.m4363e("translationXCurveDownwards");
            c1357h = c1929e.f5742a;
            str = "translationYCurveDownwards";
        } else {
            m4363e = c1929e.f5742a.m4363e("translationXCurveUpwards");
            c1357h = c1929e.f5742a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(m4363e, c1357h.m4363e(str));
    }

    /* renamed from: O */
    private float m2454O(View view, View view2, C1359j c1359j) {
        RectF rectF = this.f5730d;
        RectF rectF2 = this.f5731e;
        m2456M(view, rectF);
        m2449T(view2, rectF2);
        rectF2.offset(-m2452Q(view, view2, c1359j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m2453P(View view, View view2, C1359j c1359j) {
        RectF rectF = this.f5730d;
        RectF rectF2 = this.f5731e;
        m2456M(view, rectF);
        m2449T(view2, rectF2);
        rectF2.offset(0.0f, -m2451R(view, view2, c1359j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m2452Q(View view, View view2, C1359j c1359j) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f5730d;
        RectF rectF2 = this.f5731e;
        m2456M(view, rectF);
        m2449T(view2, rectF2);
        int i = c1359j.f4250a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + c1359j.f4251b;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f = centerX - centerX2;
        return f + c1359j.f4251b;
    }

    /* renamed from: R */
    private float m2451R(View view, View view2, C1359j c1359j) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f5730d;
        RectF rectF2 = this.f5731e;
        m2456M(view, rectF);
        m2449T(view2, rectF2);
        int i = c1359j.f4250a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + c1359j.f4252c;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f = centerY - centerY2;
        return f + c1359j.f4252c;
    }

    /* renamed from: S */
    private float m2450S(C1929e c1929e, C1358i c1358i, float f, float f2) {
        long m4356c = c1358i.m4356c();
        long m4355d = c1358i.m4355d();
        C1358i m4363e = c1929e.f5742a.m4363e("expansion");
        return C1350a.m4377a(f, f2, c1358i.m4354e().getInterpolation(((float) (((m4363e.m4356c() + m4363e.m4355d()) + 17) - m4356c)) / ((float) m4355d)));
    }

    /* renamed from: T */
    private void m2449T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f5732f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m2448U(View view, View view2, boolean z, boolean z2, C1929e c1929e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m2458K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC1370d) && C1369c.f4267a == 0) || (m2458K = m2458K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C1353d.f4236a.set(m2458K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m2458K, C1353d.f4236a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m2458K, C1353d.f4236a, 0.0f);
            }
            c1929e.f5742a.m4363e("contentFade").m4358a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: V */
    private void m2447V(View view, View view2, boolean z, boolean z2, C1929e c1929e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC1370d) {
            InterfaceC1370d interfaceC1370d = (InterfaceC1370d) view2;
            int m2439d0 = m2439d0(view);
            int i = 16777215 & m2439d0;
            if (z) {
                if (!z2) {
                    interfaceC1370d.setCircularRevealScrimColor(m2439d0);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC1370d, InterfaceC1370d.C1374d.f4271a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC1370d, InterfaceC1370d.C1374d.f4271a, m2439d0);
            }
            ofInt.setEvaluator(C1352c.m4374b());
            c1929e.f5742a.m4363e("color").m4358a(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: W */
    private void m2446W(View view, View view2, boolean z, C1929e c1929e, List<Animator> list) {
        float m2452Q = m2452Q(view, view2, c1929e.f5743b);
        float m2451R = m2451R(view, view2, c1929e.f5743b);
        Pair<C1358i, C1358i> m2455N = m2455N(m2452Q, m2451R, z, c1929e);
        C1358i c1358i = (C1358i) m2455N.first;
        C1358i c1358i2 = (C1358i) m2455N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m2452Q = this.f5733g;
        }
        fArr[0] = m2452Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m2451R = this.f5734h;
        }
        fArr2[0] = m2451R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        c1358i.m4358a(ofFloat);
        c1358i2.m4358a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: X */
    private void m2445X(View view, View view2, boolean z, boolean z2, C1929e c1929e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m8602r = C0252s.m8602r(view2) - C0252s.m8602r(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m8602r);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m8602r);
        }
        c1929e.f5742a.m4363e("elevation").m4358a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: Y */
    private void m2444Y(View view, View view2, boolean z, boolean z2, C1929e c1929e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC1370d) {
            InterfaceC1370d interfaceC1370d = (InterfaceC1370d) view2;
            float m2454O = m2454O(view, view2, c1929e.f5743b);
            float m2453P = m2453P(view, view2, c1929e.f5743b);
            ((FloatingActionButton) view).m2919i(this.f5729c);
            float width = this.f5729c.width() / 2.0f;
            C1358i m4363e = c1929e.f5742a.m4363e("expansion");
            if (z) {
                if (!z2) {
                    interfaceC1370d.setRevealInfo(new InterfaceC1370d.C1375e(m2454O, m2453P, width));
                }
                if (z2) {
                    width = interfaceC1370d.getRevealInfo().f4274c;
                }
                animator = C1366a.m4311a(interfaceC1370d, m2454O, m2453P, C1383a.m4271b(m2454O, m2453P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C1928d(this, interfaceC1370d));
                m2441b0(view2, m4363e.m4356c(), (int) m2454O, (int) m2453P, width, list);
            } else {
                float f3 = interfaceC1370d.getRevealInfo().f4274c;
                Animator m4311a = C1366a.m4311a(interfaceC1370d, m2454O, m2453P, width);
                int i = (int) m2454O;
                int i2 = (int) m2453P;
                m2441b0(view2, m4363e.m4356c(), i, i2, f3, list);
                m2442a0(view2, m4363e.m4356c(), m4363e.m4355d(), c1929e.f5742a.m4362f(), i, i2, width, list);
                animator = m4311a;
            }
            m4363e.m4358a(animator);
            list.add(animator);
            list2.add(C1366a.m4310b(interfaceC1370d));
        }
    }

    /* renamed from: Z */
    private void m2443Z(View view, View view2, boolean z, boolean z2, C1929e c1929e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC1370d) && (view instanceof ImageView)) {
            InterfaceC1370d interfaceC1370d = (InterfaceC1370d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C1354e.f4237b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C1354e.f4237b, 255);
            }
            ofInt.addUpdateListener(new C1926b(this, view2));
            c1929e.f5742a.m4363e("iconFade").m4358a(ofInt);
            list.add(ofInt);
            list2.add(new C1927c(this, interfaceC1370d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m2442a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m2441b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    /* renamed from: c0 */
    private void m2440c0(View view, View view2, boolean z, boolean z2, C1929e c1929e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m2452Q = m2452Q(view, view2, c1929e.f5743b);
        float m2451R = m2451R(view, view2, c1929e.f5743b);
        Pair<C1358i, C1358i> m2455N = m2455N(m2452Q, m2451R, z, c1929e);
        C1358i c1358i = (C1358i) m2455N.first;
        C1358i c1358i2 = (C1358i) m2455N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m2452Q);
                view2.setTranslationY(-m2451R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m2457L(view2, c1929e, c1358i, c1358i2, -m2452Q, -m2451R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m2452Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m2451R);
        }
        c1358i.m4358a(ofFloat);
        c1358i2.m4358a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m2439d0(View view) {
        ColorStateList m8610n = C0252s.m8610n(view);
        if (m8610n != null) {
            return m8610n.getColorForState(view.getDrawableState(), m8610n.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m2438f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo2435J(View view, View view2, boolean z, boolean z2) {
        C1929e mo2431e0 = mo2431e0(view2.getContext(), z);
        if (z) {
            this.f5733g = view.getTranslationX();
            this.f5734h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m2445X(view, view2, z, z2, mo2431e0, arrayList, arrayList2);
        }
        RectF rectF = this.f5730d;
        m2440c0(view, view2, z, z2, mo2431e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m2446W(view, view2, z, mo2431e0, arrayList);
        m2443Z(view, view2, z, z2, mo2431e0, arrayList, arrayList2);
        m2444Y(view, view2, z, z2, mo2431e0, width, height, arrayList, arrayList2);
        m2447V(view, view2, z, z2, mo2431e0, arrayList, arrayList2);
        m2448U(view, view2, z, z2, mo2431e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C1351b.m4376a(animatorSet, arrayList);
        animatorSet.addListener(new C1925a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: e */
    public boolean mo2433e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    protected abstract C1929e mo2431e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: g */
    public void mo2437g(CoordinatorLayout.C0696f c0696f) {
        if (c0696f.f2513h == 0) {
            c0696f.f2513h = 80;
        }
    }
}
