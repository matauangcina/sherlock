package p054b.p059c.p060a.p075b.p082p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p054b.p059c.p060a.p075b.p089v.C1383a;
/* renamed from: b.c.a.b.p.d */
/* loaded from: classes.dex */
public interface InterfaceC1370d {

    /* renamed from: b.c.a.b.p.d$b */
    /* loaded from: classes.dex */
    public static class C1372b implements TypeEvaluator<C1375e> {

        /* renamed from: b */
        public static final TypeEvaluator<C1375e> f4268b = new C1372b();

        /* renamed from: a */
        private final C1375e f4269a = new C1375e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C1375e evaluate(float f, C1375e c1375e, C1375e c1375e2) {
            this.f4269a.m4294a(C1383a.m4270c(c1375e.f4272a, c1375e2.f4272a, f), C1383a.m4270c(c1375e.f4273b, c1375e2.f4273b, f), C1383a.m4270c(c1375e.f4274c, c1375e2.f4274c, f));
            return this.f4269a;
        }
    }

    /* renamed from: b.c.a.b.p.d$c */
    /* loaded from: classes.dex */
    public static class C1373c extends Property<InterfaceC1370d, C1375e> {

        /* renamed from: a */
        public static final Property<InterfaceC1370d, C1375e> f4270a = new C1373c("circularReveal");

        private C1373c(String str) {
            super(C1375e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public C1375e get(InterfaceC1370d interfaceC1370d) {
            return interfaceC1370d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC1370d interfaceC1370d, C1375e c1375e) {
            interfaceC1370d.setRevealInfo(c1375e);
        }
    }

    /* renamed from: b.c.a.b.p.d$d */
    /* loaded from: classes.dex */
    public static class C1374d extends Property<InterfaceC1370d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC1370d, Integer> f4271a = new C1374d("circularRevealScrimColor");

        private C1374d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(InterfaceC1370d interfaceC1370d) {
            return Integer.valueOf(interfaceC1370d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC1370d interfaceC1370d, Integer num) {
            interfaceC1370d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: b.c.a.b.p.d$e */
    /* loaded from: classes.dex */
    public static class C1375e {

        /* renamed from: a */
        public float f4272a;

        /* renamed from: b */
        public float f4273b;

        /* renamed from: c */
        public float f4274c;

        private C1375e() {
        }

        public C1375e(float f, float f2, float f3) {
            this.f4272a = f;
            this.f4273b = f2;
            this.f4274c = f3;
        }

        /* renamed from: a */
        public void m4294a(float f, float f2, float f3) {
            this.f4272a = f;
            this.f4273b = f2;
            this.f4274c = f3;
        }
    }

    /* renamed from: a */
    void mo4293a();

    /* renamed from: b */
    void mo4292b();

    int getCircularRevealScrimColor();

    C1375e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1375e c1375e);
}
