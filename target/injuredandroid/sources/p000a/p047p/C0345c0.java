package p000a.p047p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.p.c0 */
/* loaded from: classes.dex */
public class C0345c0 {

    /* renamed from: a */
    private static final C0367i0 f916a;

    /* renamed from: b */
    static final Property<View, Float> f917b;

    /* renamed from: a.p.c0$a */
    /* loaded from: classes.dex */
    static class C0346a extends Property<View, Float> {
        C0346a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0345c0.m8353c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C0345c0.m8349g(view, f.floatValue());
        }
    }

    /* renamed from: a.p.c0$b */
    /* loaded from: classes.dex */
    static class C0347b extends Property<View, Rect> {
        C0347b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return C0252s.m8606p(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            C0252s.m8613l0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f916a = i >= 29 ? new C0365h0() : i >= 23 ? new C0363g0() : i >= 22 ? new C0361f0() : i >= 21 ? new C0359e0() : i >= 19 ? new C0351d0() : new C0367i0();
        f917b = new C0346a(Float.class, "translationAlpha");
        new C0347b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8355a(View view) {
        f916a.mo8334a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC0332b0 m8354b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0330a0(view) : C0402z.m8218e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m8353c(View view) {
        return f916a.mo8332c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC0384m0 m8352d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0376l0(view) : new C0374k0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m8351e(View view) {
        f916a.mo8331d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m8350f(View view, int i, int i2, int i3, int i4) {
        f916a.mo8330e(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m8349g(View view, float f) {
        f916a.mo8329f(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m8348h(View view, int i) {
        f916a.mo8328g(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m8347i(View view, Matrix matrix) {
        f916a.mo8327h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m8346j(View view, Matrix matrix) {
        f916a.mo8326i(view, matrix);
    }
}
