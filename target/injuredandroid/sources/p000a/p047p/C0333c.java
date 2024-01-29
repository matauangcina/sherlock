package p000a.p047p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p000a.p019g.p028k.C0252s;
/* renamed from: a.p.c */
/* loaded from: classes.dex */
public class C0333c extends AbstractC0377m {

    /* renamed from: R */
    private static final String[] f883R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: S */
    private static final Property<Drawable, PointF> f884S = new C0335b(PointF.class, "boundsOrigin");

    /* renamed from: T */
    private static final Property<C0344k, PointF> f885T = new C0336c(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<C0344k, PointF> f886U = new C0337d(PointF.class, "bottomRight");

    /* renamed from: V */
    private static final Property<View, PointF> f887V = new C0338e(PointF.class, "bottomRight");

    /* renamed from: W */
    private static final Property<View, PointF> f888W = new C0339f(PointF.class, "topLeft");

    /* renamed from: X */
    private static final Property<View, PointF> f889X = new C0340g(PointF.class, "position");

    /* renamed from: Y */
    private static C0373k f890Y = new C0373k();

    /* renamed from: O */
    private int[] f891O = new int[2];

    /* renamed from: P */
    private boolean f892P = false;

    /* renamed from: Q */
    private boolean f893Q = false;

    /* renamed from: a.p.c$a */
    /* loaded from: classes.dex */
    class C0334a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f894a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f895b;

        /* renamed from: c */
        final /* synthetic */ View f896c;

        /* renamed from: d */
        final /* synthetic */ float f897d;

        C0334a(C0333c c0333c, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f894a = viewGroup;
            this.f895b = bitmapDrawable;
            this.f896c = view;
            this.f897d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0345c0.m8354b(this.f894a).mo8219d(this.f895b);
            C0345c0.m8349g(this.f896c, this.f897d);
        }
    }

    /* renamed from: a.p.c$b */
    /* loaded from: classes.dex */
    static class C0335b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f898a;

        C0335b(Class cls, String str) {
            super(cls, str);
            this.f898a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f898a);
            Rect rect = this.f898a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f898a);
            this.f898a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f898a);
        }
    }

    /* renamed from: a.p.c$c */
    /* loaded from: classes.dex */
    static class C0336c extends Property<C0344k, PointF> {
        C0336c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C0344k c0344k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0344k c0344k, PointF pointF) {
            c0344k.m8356c(pointF);
        }
    }

    /* renamed from: a.p.c$d */
    /* loaded from: classes.dex */
    static class C0337d extends Property<C0344k, PointF> {
        C0337d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C0344k c0344k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C0344k c0344k, PointF pointF) {
            c0344k.m8358a(pointF);
        }
    }

    /* renamed from: a.p.c$e */
    /* loaded from: classes.dex */
    static class C0338e extends Property<View, PointF> {
        C0338e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0345c0.m8350f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: a.p.c$f */
    /* loaded from: classes.dex */
    static class C0339f extends Property<View, PointF> {
        C0339f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0345c0.m8350f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a.p.c$g */
    /* loaded from: classes.dex */
    static class C0340g extends Property<View, PointF> {
        C0340g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0345c0.m8350f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: a.p.c$h */
    /* loaded from: classes.dex */
    class C0341h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0344k f899a;
        private C0344k mViewBounds;

        C0341h(C0333c c0333c, C0344k c0344k) {
            this.f899a = c0344k;
            this.mViewBounds = this.f899a;
        }
    }

    /* renamed from: a.p.c$i */
    /* loaded from: classes.dex */
    class C0342i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f900a;

        /* renamed from: b */
        final /* synthetic */ View f901b;

        /* renamed from: c */
        final /* synthetic */ Rect f902c;

        /* renamed from: d */
        final /* synthetic */ int f903d;

        /* renamed from: e */
        final /* synthetic */ int f904e;

        /* renamed from: f */
        final /* synthetic */ int f905f;

        /* renamed from: g */
        final /* synthetic */ int f906g;

        C0342i(C0333c c0333c, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f901b = view;
            this.f902c = rect;
            this.f903d = i;
            this.f904e = i2;
            this.f905f = i3;
            this.f906g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f900a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f900a) {
                return;
            }
            C0252s.m8613l0(this.f901b, this.f902c);
            C0345c0.m8350f(this.f901b, this.f903d, this.f904e, this.f905f, this.f906g);
        }
    }

    /* renamed from: a.p.c$j */
    /* loaded from: classes.dex */
    class C0343j extends C0385n {

        /* renamed from: a */
        boolean f907a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f908b;

        C0343j(C0333c c0333c, ViewGroup viewGroup) {
            this.f908b = viewGroup;
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: b */
        public void mo8277b(AbstractC0377m abstractC0377m) {
            C0399x.m8223c(this.f908b, false);
            this.f907a = true;
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: c */
        public void mo8276c(AbstractC0377m abstractC0377m) {
            C0399x.m8223c(this.f908b, false);
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: d */
        public void mo8275d(AbstractC0377m abstractC0377m) {
            C0399x.m8223c(this.f908b, true);
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            if (!this.f907a) {
                C0399x.m8223c(this.f908b, false);
            }
            abstractC0377m.mo8265P(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.p.c$k */
    /* loaded from: classes.dex */
    public static class C0344k {

        /* renamed from: a */
        private int f909a;

        /* renamed from: b */
        private int f910b;

        /* renamed from: c */
        private int f911c;

        /* renamed from: d */
        private int f912d;

        /* renamed from: e */
        private View f913e;

        /* renamed from: f */
        private int f914f;

        /* renamed from: g */
        private int f915g;

        C0344k(View view) {
            this.f913e = view;
        }

        /* renamed from: b */
        private void m8357b() {
            C0345c0.m8350f(this.f913e, this.f909a, this.f910b, this.f911c, this.f912d);
            this.f914f = 0;
            this.f915g = 0;
        }

        /* renamed from: a */
        void m8358a(PointF pointF) {
            this.f911c = Math.round(pointF.x);
            this.f912d = Math.round(pointF.y);
            int i = this.f915g + 1;
            this.f915g = i;
            if (this.f914f == i) {
                m8357b();
            }
        }

        /* renamed from: c */
        void m8356c(PointF pointF) {
            this.f909a = Math.round(pointF.x);
            this.f910b = Math.round(pointF.y);
            int i = this.f914f + 1;
            this.f914f = i;
            if (i == this.f915g) {
                m8357b();
            }
        }
    }

    /* renamed from: c0 */
    private void m8372c0(C0394s c0394s) {
        View view = c0394s.f1032b;
        if (!C0252s.m8650M(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0394s.f1031a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0394s.f1031a.put("android:changeBounds:parent", c0394s.f1032b.getParent());
        if (this.f893Q) {
            c0394s.f1032b.getLocationInWindow(this.f891O);
            c0394s.f1031a.put("android:changeBounds:windowX", Integer.valueOf(this.f891O[0]));
            c0394s.f1031a.put("android:changeBounds:windowY", Integer.valueOf(this.f891O[1]));
        }
        if (this.f892P) {
            c0394s.f1031a.put("android:changeBounds:clip", C0252s.m8606p(view));
        }
    }

    /* renamed from: d0 */
    private boolean m8371d0(View view, View view2) {
        if (this.f893Q) {
            C0394s m8285t = m8285t(view, true);
            if (m8285t == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == m8285t.f1032b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: D */
    public String[] mo8309D() {
        return f883R;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: g */
    public void mo8247g(C0394s c0394s) {
        m8372c0(c0394s);
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: j */
    public void mo8242j(C0394s c0394s) {
        m8372c0(c0394s);
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: n */
    public Animator mo8290n(ViewGroup viewGroup, C0394s c0394s, C0394s c0394s2) {
        int i;
        View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m8229c;
        Path mo8278a;
        Property<View, PointF> property;
        if (c0394s == null || c0394s2 == null) {
            return null;
        }
        Map<String, Object> map = c0394s.f1031a;
        Map<String, Object> map2 = c0394s2.f1031a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c0394s2.f1032b;
        if (!m8371d0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) c0394s.f1031a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) c0394s.f1031a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) c0394s2.f1031a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) c0394s2.f1031a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f891O);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m8353c = C0345c0.m8353c(view2);
            C0345c0.m8349g(view2, 0.0f);
            C0345c0.m8354b(viewGroup).mo8220b(bitmapDrawable);
            AbstractC0362g m8283v = m8283v();
            int[] iArr = this.f891O;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C0366i.m8335a(f884S, m8283v.mo8278a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new C0334a(this, viewGroup, bitmapDrawable, view2, m8353c));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c0394s.f1031a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c0394s2.f1031a.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        int i4 = rect3.left;
        int i5 = rect2.top;
        int i6 = rect3.top;
        int i7 = rect2.right;
        int i8 = rect3.right;
        int i9 = rect2.bottom;
        int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect4 = (Rect) c0394s.f1031a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c0394s2.f1031a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        if (i > 0) {
            if (this.f892P) {
                view = view2;
                C0345c0.m8350f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator m8338a = (i3 == i4 && i5 == i6) ? null : C0360f.m8338a(view, f889X, m8283v().mo8278a(i3, i5, i4, i6));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    C0252s.m8613l0(view, rect);
                    C0373k c0373k = f890Y;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c0373k, objArr);
                    ofObject.addListener(new C0342i(this, view, rect5, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                }
                m8229c = C0393r.m8229c(m8338a, objectAnimator);
            } else {
                view = view2;
                C0345c0.m8350f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        mo8278a = m8283v().mo8278a(i3, i5, i4, i6);
                        property = f889X;
                    } else {
                        C0344k c0344k = new C0344k(view);
                        ObjectAnimator m8338a2 = C0360f.m8338a(c0344k, f885T, m8283v().mo8278a(i3, i5, i4, i6));
                        ObjectAnimator m8338a3 = C0360f.m8338a(c0344k, f886U, m8283v().mo8278a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(m8338a2, m8338a3);
                        animatorSet.addListener(new C0341h(this, c0344k));
                        m8229c = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    mo8278a = m8283v().mo8278a(i7, i9, i8, i10);
                    property = f887V;
                } else {
                    mo8278a = m8283v().mo8278a(i3, i5, i4, i6);
                    property = f888W;
                }
                m8229c = C0360f.m8338a(view, property, mo8278a);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0399x.m8223c(viewGroup4, true);
                mo8255a(new C0343j(this, viewGroup4));
            }
            return m8229c;
        }
        return null;
    }
}
