package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0759a;
import com.google.android.material.internal.C1845e;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p019g.p027j.C0194i;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1308a;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p078l.C1351b;
import p054b.p059c.p060a.p075b.p078l.C1355f;
import p054b.p059c.p060a.p075b.p078l.C1356g;
import p054b.p059c.p060a.p075b.p078l.C1357h;
import p054b.p059c.p060a.p075b.p092y.C1394a;
import p054b.p059c.p060a.p075b.p092y.C1397b;
import p054b.p059c.p060a.p075b.p093z.InterfaceC1399b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
public class C1820b {

    /* renamed from: F */
    static final TimeInterpolator f5351F = C1350a.f4232c;

    /* renamed from: G */
    static final int[] f5352G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f5353H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f5354I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f5355J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f5356K = {16842910};

    /* renamed from: L */
    static final int[] f5357L = new int[0];

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f5362E;

    /* renamed from: a */
    C1322k f5363a;

    /* renamed from: b */
    C1315g f5364b;

    /* renamed from: c */
    Drawable f5365c;

    /* renamed from: d */
    C1817a f5366d;

    /* renamed from: e */
    Drawable f5367e;

    /* renamed from: f */
    boolean f5368f;

    /* renamed from: h */
    float f5370h;

    /* renamed from: i */
    float f5371i;

    /* renamed from: j */
    float f5372j;

    /* renamed from: k */
    int f5373k;

    /* renamed from: l */
    private final C1845e f5374l;

    /* renamed from: m */
    private C1357h f5375m;

    /* renamed from: n */
    private C1357h f5376n;

    /* renamed from: o */
    private Animator f5377o;

    /* renamed from: p */
    private C1357h f5378p;

    /* renamed from: q */
    private C1357h f5379q;

    /* renamed from: r */
    private float f5380r;

    /* renamed from: t */
    private int f5382t;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f5384v;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f5385w;

    /* renamed from: x */
    private ArrayList<InterfaceC1829i> f5386x;

    /* renamed from: y */
    final FloatingActionButton f5387y;

    /* renamed from: z */
    final InterfaceC1399b f5388z;

    /* renamed from: g */
    boolean f5369g = true;

    /* renamed from: s */
    private float f5381s = 1.0f;

    /* renamed from: u */
    private int f5383u = 0;

    /* renamed from: A */
    private final Rect f5358A = new Rect();

    /* renamed from: B */
    private final RectF f5359B = new RectF();

    /* renamed from: C */
    private final RectF f5360C = new RectF();

    /* renamed from: D */
    private final Matrix f5361D = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* loaded from: classes.dex */
    public class C1821a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5389a;

        /* renamed from: b */
        final /* synthetic */ boolean f5390b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC1830j f5391c;

        C1821a(boolean z, InterfaceC1830j interfaceC1830j) {
            this.f5390b = z;
            this.f5391c = interfaceC1830j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5389a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1820b.this.f5383u = 0;
            C1820b.this.f5377o = null;
            if (this.f5389a) {
                return;
            }
            C1820b.this.f5387y.m2709b(this.f5390b ? 8 : 4, this.f5390b);
            InterfaceC1830j interfaceC1830j = this.f5391c;
            if (interfaceC1830j != null) {
                interfaceC1830j.mo2833b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1820b.this.f5387y.m2709b(0, this.f5390b);
            C1820b.this.f5383u = 1;
            C1820b.this.f5377o = animator;
            this.f5389a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* loaded from: classes.dex */
    public class C1822b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f5393a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC1830j f5394b;

        C1822b(boolean z, InterfaceC1830j interfaceC1830j) {
            this.f5393a = z;
            this.f5394b = interfaceC1830j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1820b.this.f5383u = 0;
            C1820b.this.f5377o = null;
            InterfaceC1830j interfaceC1830j = this.f5394b;
            if (interfaceC1830j != null) {
                interfaceC1830j.mo2834a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1820b.this.f5387y.m2709b(0, this.f5393a);
            C1820b.this.f5383u = 2;
            C1820b.this.f5377o = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    /* loaded from: classes.dex */
    public class C1823c extends C1356g {
        C1823c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C1820b.this.f5381s = f;
            return super.mo2838a(f, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    /* loaded from: classes.dex */
    public class C1824d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f5397a = new FloatEvaluator();

        C1824d(C1820b c1820b) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f5397a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC1825e implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC1825e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C1820b.this.m2883H();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    /* loaded from: classes.dex */
    private class C1826f extends AbstractC1832l {
        C1826f(C1820b c1820b) {
            super(c1820b, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C1820b.AbstractC1832l
        /* renamed from: a */
        protected float mo2832a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    /* loaded from: classes.dex */
    private class C1827g extends AbstractC1832l {
        C1827g() {
            super(C1820b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C1820b.AbstractC1832l
        /* renamed from: a */
        protected float mo2832a() {
            C1820b c1820b = C1820b.this;
            return c1820b.f5370h + c1820b.f5371i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    /* loaded from: classes.dex */
    private class C1828h extends AbstractC1832l {
        C1828h() {
            super(C1820b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C1820b.AbstractC1832l
        /* renamed from: a */
        protected float mo2832a() {
            C1820b c1820b = C1820b.this;
            return c1820b.f5370h + c1820b.f5372j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    /* loaded from: classes.dex */
    public interface InterfaceC1829i {
        /* renamed from: a */
        void mo2836a();

        /* renamed from: b */
        void mo2835b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    /* loaded from: classes.dex */
    public interface InterfaceC1830j {
        /* renamed from: a */
        void mo2834a();

        /* renamed from: b */
        void mo2833b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    /* loaded from: classes.dex */
    private class C1831k extends AbstractC1832l {
        C1831k() {
            super(C1820b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C1820b.AbstractC1832l
        /* renamed from: a */
        protected float mo2832a() {
            return C1820b.this.f5370h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    /* loaded from: classes.dex */
    private abstract class AbstractC1832l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f5402a;

        /* renamed from: b */
        private float f5403b;

        /* renamed from: c */
        private float f5404c;

        private AbstractC1832l() {
        }

        /* synthetic */ AbstractC1832l(C1820b c1820b, C1821a c1821a) {
            this();
        }

        /* renamed from: a */
        protected abstract float mo2832a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1820b.this.m2855g0((int) this.f5404c);
            this.f5402a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f5402a) {
                C1315g c1315g = C1820b.this.f5364b;
                this.f5403b = c1315g == null ? 0.0f : c1315g.m4511v();
                this.f5404c = mo2832a();
                this.f5402a = true;
            }
            C1820b c1820b = C1820b.this;
            float f = this.f5403b;
            c1820b.m2855g0((int) (f + ((this.f5404c - f) * valueAnimator.getAnimatedFraction())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1820b(FloatingActionButton floatingActionButton, InterfaceC1399b interfaceC1399b) {
        this.f5387y = floatingActionButton;
        this.f5388z = interfaceC1399b;
        C1845e c1845e = new C1845e();
        this.f5374l = c1845e;
        c1845e.m2742a(f5352G, m2852i(new C1828h()));
        this.f5374l.m2742a(f5353H, m2852i(new C1827g()));
        this.f5374l.m2742a(f5354I, m2852i(new C1827g()));
        this.f5374l.m2742a(f5355J, m2852i(new C1827g()));
        this.f5374l.m2742a(f5356K, m2852i(new C1831k()));
        this.f5374l.m2742a(f5357L, m2852i(new C1826f(this)));
        this.f5380r = this.f5387y.getRotation();
    }

    /* renamed from: a0 */
    private boolean m2866a0() {
        return C0252s.m8650M(this.f5387y) && !this.f5387y.isInEditMode();
    }

    /* renamed from: g */
    private void m2856g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f5387y.getDrawable();
        if (drawable == null || this.f5382t == 0) {
            return;
        }
        RectF rectF = this.f5359B;
        RectF rectF2 = this.f5360C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f5382t;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f5382t;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    /* renamed from: h */
    private AnimatorSet m2854h(C1357h c1357h, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5387y, View.ALPHA, f);
        c1357h.m4363e("opacity").m4358a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5387y, View.SCALE_X, f2);
        c1357h.m4363e("scale").m4358a(ofFloat2);
        m2853h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f5387y, View.SCALE_Y, f2);
        c1357h.m4363e("scale").m4358a(ofFloat3);
        m2853h0(ofFloat3);
        arrayList.add(ofFloat3);
        m2856g(f3, this.f5361D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f5387y, new C1355f(), new C1823c(), new Matrix(this.f5361D));
        c1357h.m4363e("iconScale").m4358a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1351b.m4376a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: h0 */
    private void m2853h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C1824d(this));
    }

    /* renamed from: i */
    private ValueAnimator m2852i(AbstractC1832l abstractC1832l) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f5351F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC1832l);
        valueAnimator.addUpdateListener(abstractC1832l);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: l */
    private C1357h m2850l() {
        if (this.f5376n == null) {
            this.f5376n = C1357h.m4365c(this.f5387y.getContext(), C1308a.design_fab_hide_motion_spec);
        }
        C1357h c1357h = this.f5376n;
        C0194i.m8866c(c1357h);
        return c1357h;
    }

    /* renamed from: m */
    private C1357h m2849m() {
        if (this.f5375m == null) {
            this.f5375m = C1357h.m4365c(this.f5387y.getContext(), C1308a.design_fab_show_motion_spec);
        }
        C1357h c1357h = this.f5375m;
        C0194i.m8866c(c1357h);
        return c1357h;
    }

    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m2845r() {
        if (this.f5362E == null) {
            this.f5362E = new ViewTreeObserver$OnPreDrawListenerC1825e();
        }
        return this.f5362E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2831A() {
        this.f5374l.m2740c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m2886B() {
        C1315g c1315g = this.f5364b;
        if (c1315g != null) {
            C1319h.m4501f(this.f5387y, c1315g);
        }
        if (mo2827K()) {
            this.f5387y.getViewTreeObserver().addOnPreDrawListener(m2845r());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo2830C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m2885D() {
        ViewTreeObserver viewTreeObserver = this.f5387y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f5362E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f5362E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo2829E(int[] iArr) {
        this.f5374l.m2739d(iArr);
    }

    /* renamed from: F */
    void mo2828F(float f, float f2, float f3) {
        m2857f0();
        m2855g0(f);
    }

    /* renamed from: G */
    void m2884G(Rect rect) {
        InterfaceC1399b interfaceC1399b;
        Drawable drawable;
        C0194i.m8865d(this.f5367e, "Didn't initialize content background");
        if (mo2825Z()) {
            drawable = new InsetDrawable(this.f5367e, rect.left, rect.top, rect.right, rect.bottom);
            interfaceC1399b = this.f5388z;
        } else {
            interfaceC1399b = this.f5388z;
            drawable = this.f5367e;
        }
        interfaceC1399b.mo2894b(drawable);
    }

    /* renamed from: H */
    void m2883H() {
        float rotation = this.f5387y.getRotation();
        if (this.f5380r != rotation) {
            this.f5380r = rotation;
            mo2824d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m2882I() {
        ArrayList<InterfaceC1829i> arrayList = this.f5386x;
        if (arrayList != null) {
            Iterator<InterfaceC1829i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2835b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m2881J() {
        ArrayList<InterfaceC1829i> arrayList = this.f5386x;
        if (arrayList != null) {
            Iterator<InterfaceC1829i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2836a();
            }
        }
    }

    /* renamed from: K */
    boolean mo2827K() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m2880L(ColorStateList colorStateList) {
        C1315g c1315g = this.f5364b;
        if (c1315g != null) {
            c1315g.setTintList(colorStateList);
        }
        C1817a c1817a = this.f5366d;
        if (c1817a != null) {
            c1817a.m2890c(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m2879M(PorterDuff.Mode mode) {
        C1315g c1315g = this.f5364b;
        if (c1315g != null) {
            c1315g.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m2878N(float f) {
        if (this.f5370h != f) {
            this.f5370h = f;
            mo2828F(f, this.f5371i, this.f5372j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m2877O(boolean z) {
        this.f5368f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m2876P(C1357h c1357h) {
        this.f5379q = c1357h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m2875Q(float f) {
        if (this.f5371i != f) {
            this.f5371i = f;
            mo2828F(this.f5370h, f, this.f5372j);
        }
    }

    /* renamed from: R */
    final void m2874R(float f) {
        this.f5381s = f;
        Matrix matrix = this.f5361D;
        m2856g(f, matrix);
        this.f5387y.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final void m2873S(int i) {
        if (this.f5382t != i) {
            this.f5382t = i;
            m2859e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m2872T(int i) {
        this.f5373k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final void m2871U(float f) {
        if (this.f5372j != f) {
            this.f5372j = f;
            mo2828F(this.f5370h, this.f5371i, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo2826V(ColorStateList colorStateList) {
        Drawable drawable = this.f5365c;
        if (drawable != null) {
            C0759a.m6747o(drawable, C1397b.m4240a(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m2870W(boolean z) {
        this.f5369g = z;
        m2857f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public final void m2869X(C1322k c1322k) {
        this.f5363a = c1322k;
        C1315g c1315g = this.f5364b;
        if (c1315g != null) {
            c1315g.setShapeAppearanceModel(c1322k);
        }
        Drawable drawable = this.f5365c;
        if (drawable instanceof InterfaceC1337n) {
            ((InterfaceC1337n) drawable).setShapeAppearanceModel(c1322k);
        }
        C1817a c1817a = this.f5366d;
        if (c1817a != null) {
            c1817a.m2887f(c1322k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final void m2868Y(C1357h c1357h) {
        this.f5378p = c1357h;
    }

    /* renamed from: Z */
    boolean mo2825Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean m2864b0() {
        return !this.f5368f || this.f5387y.getSizeDimension() >= this.f5373k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m2862c0(InterfaceC1830j interfaceC1830j, boolean z) {
        if (m2839z()) {
            return;
        }
        Animator animator = this.f5377o;
        if (animator != null) {
            animator.cancel();
        }
        if (!m2866a0()) {
            this.f5387y.m2709b(0, z);
            this.f5387y.setAlpha(1.0f);
            this.f5387y.setScaleY(1.0f);
            this.f5387y.setScaleX(1.0f);
            m2874R(1.0f);
            if (interfaceC1830j != null) {
                interfaceC1830j.mo2834a();
                return;
            }
            return;
        }
        if (this.f5387y.getVisibility() != 0) {
            this.f5387y.setAlpha(0.0f);
            this.f5387y.setScaleY(0.0f);
            this.f5387y.setScaleX(0.0f);
            m2874R(0.0f);
        }
        C1357h c1357h = this.f5378p;
        if (c1357h == null) {
            c1357h = m2849m();
        }
        AnimatorSet m2854h = m2854h(c1357h, 1.0f, 1.0f, 1.0f);
        m2854h.addListener(new C1822b(z, interfaceC1830j));
        ArrayList<Animator.AnimatorListener> arrayList = this.f5384v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m2854h.addListener(it.next());
            }
        }
        m2854h.start();
    }

    /* renamed from: d */
    public void m2861d(Animator.AnimatorListener animatorListener) {
        if (this.f5385w == null) {
            this.f5385w = new ArrayList<>();
        }
        this.f5385w.add(animatorListener);
    }

    /* renamed from: d0 */
    void mo2824d0() {
        FloatingActionButton floatingActionButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f5380r % 90.0f != 0.0f) {
                i = 1;
                if (this.f5387y.getLayerType() != 1) {
                    floatingActionButton = this.f5387y;
                    floatingActionButton.setLayerType(i, null);
                }
            } else if (this.f5387y.getLayerType() != 0) {
                floatingActionButton = this.f5387y;
                i = 0;
                floatingActionButton.setLayerType(i, null);
            }
        }
        C1315g c1315g = this.f5364b;
        if (c1315g != null) {
            c1315g.m4539Y((int) this.f5380r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2860e(Animator.AnimatorListener animatorListener) {
        if (this.f5384v == null) {
            this.f5384v = new ArrayList<>();
        }
        this.f5384v.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void m2859e0() {
        m2874R(this.f5381s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2858f(InterfaceC1829i interfaceC1829i) {
        if (this.f5386x == null) {
            this.f5386x = new ArrayList<>();
        }
        this.f5386x.add(interfaceC1829i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void m2857f0() {
        Rect rect = this.f5358A;
        mo2819s(rect);
        m2884G(rect);
        this.f5388z.mo2895a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m2855g0(float f) {
        C1315g c1315g = this.f5364b;
        if (c1315g != null) {
            c1315g.m4545S(f);
        }
    }

    /* renamed from: j */
    C1315g mo2822j() {
        C1322k c1322k = this.f5363a;
        C0194i.m8866c(c1322k);
        return new C1315g(c1322k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final Drawable m2851k() {
        return this.f5367e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo2820n() {
        return this.f5370h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m2848o() {
        return this.f5368f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final C1357h m2847p() {
        return this.f5379q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public float m2846q() {
        return this.f5371i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2819s(Rect rect) {
        int sizeDimension = this.f5368f ? (this.f5373k - this.f5387y.getSizeDimension()) / 2 : 0;
        float mo2820n = this.f5369g ? mo2820n() + this.f5372j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(mo2820n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(mo2820n * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public float m2844t() {
        return this.f5372j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C1322k m2843u() {
        return this.f5363a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final C1357h m2842v() {
        return this.f5378p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m2841w(InterfaceC1830j interfaceC1830j, boolean z) {
        if (m2840y()) {
            return;
        }
        Animator animator = this.f5377o;
        if (animator != null) {
            animator.cancel();
        }
        if (!m2866a0()) {
            this.f5387y.m2709b(z ? 8 : 4, z);
            if (interfaceC1830j != null) {
                interfaceC1830j.mo2833b();
                return;
            }
            return;
        }
        C1357h c1357h = this.f5379q;
        if (c1357h == null) {
            c1357h = m2850l();
        }
        AnimatorSet m2854h = m2854h(c1357h, 0.0f, 0.0f, 0.0f);
        m2854h.addListener(new C1821a(z, interfaceC1830j));
        ArrayList<Animator.AnimatorListener> arrayList = this.f5385w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m2854h.addListener(it.next());
            }
        }
        m2854h.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2818x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C1315g mo2822j = mo2822j();
        this.f5364b = mo2822j;
        mo2822j.setTintList(colorStateList);
        if (mode != null) {
            this.f5364b.setTintMode(mode);
        }
        this.f5364b.m4540X(-12303292);
        this.f5364b.m4552L(this.f5387y.getContext());
        C1394a c1394a = new C1394a(this.f5364b.m4562B());
        c1394a.setTintList(C1397b.m4240a(colorStateList2));
        this.f5365c = c1394a;
        C1315g c1315g = this.f5364b;
        C0194i.m8866c(c1315g);
        this.f5367e = new LayerDrawable(new Drawable[]{c1315g, c1394a});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m2840y() {
        return this.f5387y.getVisibility() == 0 ? this.f5383u == 1 : this.f5383u != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m2839z() {
        return this.f5387y.getVisibility() != 0 ? this.f5383u == 2 : this.f5383u != 1;
    }
}
