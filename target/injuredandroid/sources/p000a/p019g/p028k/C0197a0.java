package p000a.p019g.p028k;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p000a.p019g.p020d.C0123b;
import p000a.p019g.p027j.C0189d;
import p000a.p019g.p027j.C0194i;
/* renamed from: a.g.k.a0 */
/* loaded from: classes.dex */
public class C0197a0 {

    /* renamed from: a */
    private final C0209l f651a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.a0$a */
    /* loaded from: classes.dex */
    public static class C0198a {

        /* renamed from: a */
        private static Field f652a;

        /* renamed from: b */
        private static Field f653b;

        /* renamed from: c */
        private static Field f654c;

        /* renamed from: d */
        private static boolean f655d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f652a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f653b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f654c = declaredField3;
                declaredField3.setAccessible(true);
                f655d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C0197a0 m8840a(View view) {
            if (f655d && view.isAttachedToWindow()) {
                try {
                    Object obj = f652a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f653b.get(obj);
                        Rect rect2 = (Rect) f654c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0199b c0199b = new C0199b();
                            c0199b.m8838b(C0123b.m9045c(rect));
                            c0199b.m8837c(C0123b.m9045c(rect2));
                            C0197a0 m8839a = c0199b.m8839a();
                            m8839a.m8845p(m8839a);
                            m8839a.m8857d(view.getRootView());
                            return m8839a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: a.g.k.a0$b */
    /* loaded from: classes.dex */
    public static final class C0199b {

        /* renamed from: a */
        private final C0203f f656a;

        public C0199b() {
            int i = Build.VERSION.SDK_INT;
            this.f656a = i >= 30 ? new C0202e() : i >= 29 ? new C0201d() : i >= 20 ? new C0200c() : new C0203f();
        }

        public C0199b(C0197a0 c0197a0) {
            int i = Build.VERSION.SDK_INT;
            this.f656a = i >= 30 ? new C0202e(c0197a0) : i >= 29 ? new C0201d(c0197a0) : i >= 20 ? new C0200c(c0197a0) : new C0203f(c0197a0);
        }

        /* renamed from: a */
        public C0197a0 m8839a() {
            return this.f656a.mo8834b();
        }

        @Deprecated
        /* renamed from: b */
        public C0199b m8838b(C0123b c0123b) {
            this.f656a.mo8832d(c0123b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0199b m8837c(C0123b c0123b) {
            this.f656a.mo8830f(c0123b);
            return this;
        }
    }

    /* renamed from: a.g.k.a0$c */
    /* loaded from: classes.dex */
    private static class C0200c extends C0203f {

        /* renamed from: e */
        private static Field f657e = null;

        /* renamed from: f */
        private static boolean f658f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f659g = null;

        /* renamed from: h */
        private static boolean f660h = false;

        /* renamed from: c */
        private WindowInsets f661c;

        /* renamed from: d */
        private C0123b f662d;

        C0200c() {
            this.f661c = m8836h();
        }

        C0200c(C0197a0 c0197a0) {
            super(c0197a0);
            this.f661c = c0197a0.m8843r();
        }

        /* renamed from: h */
        private static WindowInsets m8836h() {
            if (!f658f) {
                try {
                    f657e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f658f = true;
            }
            Field field = f657e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f660h) {
                try {
                    f659g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f660h = true;
            }
            Constructor<WindowInsets> constructor = f659g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: b */
        C0197a0 mo8834b() {
            m8835a();
            C0197a0 m8842s = C0197a0.m8842s(this.f661c);
            m8842s.m8847n(this.f665b);
            m8842s.m8844q(this.f662d);
            return m8842s;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: d */
        void mo8832d(C0123b c0123b) {
            this.f662d = c0123b;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: f */
        void mo8830f(C0123b c0123b) {
            WindowInsets windowInsets = this.f661c;
            if (windowInsets != null) {
                this.f661c = windowInsets.replaceSystemWindowInsets(c0123b.f523a, c0123b.f524b, c0123b.f525c, c0123b.f526d);
            }
        }
    }

    /* renamed from: a.g.k.a0$d */
    /* loaded from: classes.dex */
    private static class C0201d extends C0203f {

        /* renamed from: c */
        final WindowInsets.Builder f663c;

        C0201d() {
            this.f663c = new WindowInsets.Builder();
        }

        C0201d(C0197a0 c0197a0) {
            super(c0197a0);
            WindowInsets m8843r = c0197a0.m8843r();
            this.f663c = m8843r != null ? new WindowInsets.Builder(m8843r) : new WindowInsets.Builder();
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: b */
        C0197a0 mo8834b() {
            m8835a();
            C0197a0 m8842s = C0197a0.m8842s(this.f663c.build());
            m8842s.m8847n(this.f665b);
            return m8842s;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: c */
        void mo8833c(C0123b c0123b) {
            this.f663c.setMandatorySystemGestureInsets(c0123b.m9043e());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: d */
        void mo8832d(C0123b c0123b) {
            this.f663c.setStableInsets(c0123b.m9043e());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: e */
        void mo8831e(C0123b c0123b) {
            this.f663c.setSystemGestureInsets(c0123b.m9043e());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: f */
        void mo8830f(C0123b c0123b) {
            this.f663c.setSystemWindowInsets(c0123b.m9043e());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0203f
        /* renamed from: g */
        void mo8829g(C0123b c0123b) {
            this.f663c.setTappableElementInsets(c0123b.m9043e());
        }
    }

    /* renamed from: a.g.k.a0$e */
    /* loaded from: classes.dex */
    private static class C0202e extends C0201d {
        C0202e() {
        }

        C0202e(C0197a0 c0197a0) {
            super(c0197a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.k.a0$f */
    /* loaded from: classes.dex */
    public static class C0203f {

        /* renamed from: a */
        private final C0197a0 f664a;

        /* renamed from: b */
        C0123b[] f665b;

        C0203f() {
            this(new C0197a0((C0197a0) null));
        }

        C0203f(C0197a0 c0197a0) {
            this.f664a = c0197a0;
        }

        /* renamed from: a */
        protected final void m8835a() {
            C0123b[] c0123bArr = this.f665b;
            if (c0123bArr != null) {
                C0123b c0123b = c0123bArr[C0210m.m8805a(1)];
                C0123b c0123b2 = this.f665b[C0210m.m8805a(2)];
                if (c0123b2 == null) {
                    c0123b2 = this.f664a.m8855f(2);
                }
                if (c0123b == null) {
                    c0123b = this.f664a.m8855f(1);
                }
                mo8830f(C0123b.m9047a(c0123b, c0123b2));
                C0123b c0123b3 = this.f665b[C0210m.m8805a(16)];
                if (c0123b3 != null) {
                    mo8831e(c0123b3);
                }
                C0123b c0123b4 = this.f665b[C0210m.m8805a(32)];
                if (c0123b4 != null) {
                    mo8833c(c0123b4);
                }
                C0123b c0123b5 = this.f665b[C0210m.m8805a(64)];
                if (c0123b5 != null) {
                    mo8829g(c0123b5);
                }
            }
        }

        /* renamed from: b */
        C0197a0 mo8834b() {
            m8835a();
            return this.f664a;
        }

        /* renamed from: c */
        void mo8833c(C0123b c0123b) {
        }

        /* renamed from: d */
        void mo8832d(C0123b c0123b) {
        }

        /* renamed from: e */
        void mo8831e(C0123b c0123b) {
        }

        /* renamed from: f */
        void mo8830f(C0123b c0123b) {
        }

        /* renamed from: g */
        void mo8829g(C0123b c0123b) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.k.a0$g */
    /* loaded from: classes.dex */
    public static class C0204g extends C0209l {

        /* renamed from: h */
        private static boolean f666h = false;

        /* renamed from: i */
        private static Method f667i;

        /* renamed from: j */
        private static Class<?> f668j;

        /* renamed from: k */
        private static Class<?> f669k;

        /* renamed from: l */
        private static Field f670l;

        /* renamed from: m */
        private static Field f671m;

        /* renamed from: c */
        final WindowInsets f672c;

        /* renamed from: d */
        private C0123b[] f673d;

        /* renamed from: e */
        private C0123b f674e;

        /* renamed from: f */
        private C0197a0 f675f;

        /* renamed from: g */
        C0123b f676g;

        C0204g(C0197a0 c0197a0, C0204g c0204g) {
            this(c0197a0, new WindowInsets(c0204g.f672c));
        }

        C0204g(C0197a0 c0197a0, WindowInsets windowInsets) {
            super(c0197a0);
            this.f674e = null;
            this.f672c = windowInsets;
        }

        /* renamed from: s */
        private C0123b m8828s(int i, boolean z) {
            C0123b c0123b = C0123b.f522e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    c0123b = C0123b.m9047a(c0123b, m8827t(i2, z));
                }
            }
            return c0123b;
        }

        /* renamed from: u */
        private C0123b m8826u() {
            C0197a0 c0197a0 = this.f675f;
            return c0197a0 != null ? c0197a0.m8854g() : C0123b.f522e;
        }

        /* renamed from: v */
        private C0123b m8825v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f666h) {
                    m8824w();
                }
                Method method = f667i;
                if (method != null && f669k != null && f670l != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f670l.get(f671m.get(invoke));
                        if (rect != null) {
                            return C0123b.m9045c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: w */
        private static void m8824w() {
            try {
                f667i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f668j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f669k = cls;
                f670l = cls.getDeclaredField("mVisibleInsets");
                f671m = f668j.getDeclaredField("mAttachInfo");
                f670l.setAccessible(true);
                f671m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f666h = true;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: d */
        void mo8820d(View view) {
            C0123b m8825v = m8825v(view);
            if (m8825v == null) {
                m8825v = C0123b.f522e;
            }
            mo8808p(m8825v);
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: e */
        void mo8819e(C0197a0 c0197a0) {
            c0197a0.m8845p(this.f675f);
            c0197a0.m8846o(this.f676g);
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f676g, ((C0204g) obj).f676g);
            }
            return false;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: g */
        public C0123b mo8817g(int i) {
            return m8828s(i, false);
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: k */
        final C0123b mo8813k() {
            if (this.f674e == null) {
                this.f674e = C0123b.m9046b(this.f672c.getSystemWindowInsetLeft(), this.f672c.getSystemWindowInsetTop(), this.f672c.getSystemWindowInsetRight(), this.f672c.getSystemWindowInsetBottom());
            }
            return this.f674e;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: n */
        boolean mo8810n() {
            return this.f672c.isRound();
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: o */
        public void mo8809o(C0123b[] c0123bArr) {
            this.f673d = c0123bArr;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: p */
        void mo8808p(C0123b c0123b) {
            this.f676g = c0123b;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: q */
        void mo8807q(C0197a0 c0197a0) {
            this.f675f = c0197a0;
        }

        /* renamed from: t */
        protected C0123b m8827t(int i, boolean z) {
            C0123b m8854g;
            int i2;
            if (i == 1) {
                return z ? C0123b.m9046b(0, Math.max(m8826u().f524b, mo8813k().f524b), 0, 0) : C0123b.m9046b(0, mo8813k().f524b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    C0123b m8826u = m8826u();
                    C0123b mo8815i = mo8815i();
                    return C0123b.m9046b(Math.max(m8826u.f523a, mo8815i.f523a), 0, Math.max(m8826u.f525c, mo8815i.f525c), Math.max(m8826u.f526d, mo8815i.f526d));
                }
                C0123b mo8813k = mo8813k();
                C0197a0 c0197a0 = this.f675f;
                m8854g = c0197a0 != null ? c0197a0.m8854g() : null;
                int i3 = mo8813k.f526d;
                if (m8854g != null) {
                    i3 = Math.min(i3, m8854g.f526d);
                }
                return C0123b.m9046b(mo8813k.f523a, 0, mo8813k.f525c, i3);
            } else if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                return C0123b.f522e;
                            }
                            C0197a0 c0197a02 = this.f675f;
                            C0235c m8856e = c0197a02 != null ? c0197a02.m8856e() : mo8818f();
                            return m8856e != null ? C0123b.m9046b(m8856e.m8711b(), m8856e.m8709d(), m8856e.m8710c(), m8856e.m8712a()) : C0123b.f522e;
                        }
                        return mo8812l();
                    }
                    return mo8816h();
                }
                return mo8814j();
            } else {
                C0123b[] c0123bArr = this.f673d;
                m8854g = c0123bArr != null ? c0123bArr[C0210m.m8805a(8)] : null;
                if (m8854g != null) {
                    return m8854g;
                }
                C0123b mo8813k2 = mo8813k();
                C0123b m8826u2 = m8826u();
                int i4 = mo8813k2.f526d;
                if (i4 > m8826u2.f526d) {
                    return C0123b.m9046b(0, 0, 0, i4);
                }
                C0123b c0123b = this.f676g;
                return (c0123b == null || c0123b.equals(C0123b.f522e) || (i2 = this.f676g.f526d) <= m8826u2.f526d) ? C0123b.f522e : C0123b.m9046b(0, 0, 0, i2);
            }
        }
    }

    /* renamed from: a.g.k.a0$h */
    /* loaded from: classes.dex */
    private static class C0205h extends C0204g {

        /* renamed from: n */
        private C0123b f677n;

        C0205h(C0197a0 c0197a0, C0205h c0205h) {
            super(c0197a0, c0205h);
            this.f677n = null;
            this.f677n = c0205h.f677n;
        }

        C0205h(C0197a0 c0197a0, WindowInsets windowInsets) {
            super(c0197a0, windowInsets);
            this.f677n = null;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: b */
        C0197a0 mo8822b() {
            return C0197a0.m8842s(this.f672c.consumeStableInsets());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: c */
        C0197a0 mo8821c() {
            return C0197a0.m8842s(this.f672c.consumeSystemWindowInsets());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: i */
        final C0123b mo8815i() {
            if (this.f677n == null) {
                this.f677n = C0123b.m9046b(this.f672c.getStableInsetLeft(), this.f672c.getStableInsetTop(), this.f672c.getStableInsetRight(), this.f672c.getStableInsetBottom());
            }
            return this.f677n;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: m */
        boolean mo8811m() {
            return this.f672c.isConsumed();
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: r */
        public void mo8806r(C0123b c0123b) {
            this.f677n = c0123b;
        }
    }

    /* renamed from: a.g.k.a0$i */
    /* loaded from: classes.dex */
    private static class C0206i extends C0205h {
        C0206i(C0197a0 c0197a0, C0206i c0206i) {
            super(c0197a0, c0206i);
        }

        C0206i(C0197a0 c0197a0, WindowInsets windowInsets) {
            super(c0197a0, windowInsets);
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: a */
        C0197a0 mo8823a() {
            return C0197a0.m8842s(this.f672c.consumeDisplayCutout());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0204g, p000a.p019g.p028k.C0197a0.C0209l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0206i) {
                C0206i c0206i = (C0206i) obj;
                return Objects.equals(this.f672c, c0206i.f672c) && Objects.equals(this.f676g, c0206i.f676g);
            }
            return false;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: f */
        C0235c mo8818f() {
            return C0235c.m8708e(this.f672c.getDisplayCutout());
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        public int hashCode() {
            return this.f672c.hashCode();
        }
    }

    /* renamed from: a.g.k.a0$j */
    /* loaded from: classes.dex */
    private static class C0207j extends C0206i {

        /* renamed from: o */
        private C0123b f678o;

        /* renamed from: p */
        private C0123b f679p;

        /* renamed from: q */
        private C0123b f680q;

        C0207j(C0197a0 c0197a0, C0207j c0207j) {
            super(c0197a0, c0207j);
            this.f678o = null;
            this.f679p = null;
            this.f680q = null;
        }

        C0207j(C0197a0 c0197a0, WindowInsets windowInsets) {
            super(c0197a0, windowInsets);
            this.f678o = null;
            this.f679p = null;
            this.f680q = null;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: h */
        C0123b mo8816h() {
            if (this.f679p == null) {
                this.f679p = C0123b.m9044d(this.f672c.getMandatorySystemGestureInsets());
            }
            return this.f679p;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: j */
        C0123b mo8814j() {
            if (this.f678o == null) {
                this.f678o = C0123b.m9044d(this.f672c.getSystemGestureInsets());
            }
            return this.f678o;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: l */
        C0123b mo8812l() {
            if (this.f680q == null) {
                this.f680q = C0123b.m9044d(this.f672c.getTappableElementInsets());
            }
            return this.f680q;
        }

        @Override // p000a.p019g.p028k.C0197a0.C0205h, p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: r */
        public void mo8806r(C0123b c0123b) {
        }
    }

    /* renamed from: a.g.k.a0$k */
    /* loaded from: classes.dex */
    private static class C0208k extends C0207j {

        /* renamed from: r */
        static final C0197a0 f681r = C0197a0.m8842s(WindowInsets.CONSUMED);

        C0208k(C0197a0 c0197a0, C0208k c0208k) {
            super(c0197a0, c0208k);
        }

        C0208k(C0197a0 c0197a0, WindowInsets windowInsets) {
            super(c0197a0, windowInsets);
        }

        @Override // p000a.p019g.p028k.C0197a0.C0204g, p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: d */
        final void mo8820d(View view) {
        }

        @Override // p000a.p019g.p028k.C0197a0.C0204g, p000a.p019g.p028k.C0197a0.C0209l
        /* renamed from: g */
        public C0123b mo8817g(int i) {
            return C0123b.m9044d(this.f672c.getInsets(C0211n.m8804a(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.k.a0$l */
    /* loaded from: classes.dex */
    public static class C0209l {

        /* renamed from: b */
        static final C0197a0 f682b = new C0199b().m8839a().m8860a().m8859b().m8858c();

        /* renamed from: a */
        final C0197a0 f683a;

        C0209l(C0197a0 c0197a0) {
            this.f683a = c0197a0;
        }

        /* renamed from: a */
        C0197a0 mo8823a() {
            return this.f683a;
        }

        /* renamed from: b */
        C0197a0 mo8822b() {
            return this.f683a;
        }

        /* renamed from: c */
        C0197a0 mo8821c() {
            return this.f683a;
        }

        /* renamed from: d */
        void mo8820d(View view) {
        }

        /* renamed from: e */
        void mo8819e(C0197a0 c0197a0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0209l) {
                C0209l c0209l = (C0209l) obj;
                return mo8810n() == c0209l.mo8810n() && mo8811m() == c0209l.mo8811m() && C0189d.m8873a(mo8813k(), c0209l.mo8813k()) && C0189d.m8873a(mo8815i(), c0209l.mo8815i()) && C0189d.m8873a(mo8818f(), c0209l.mo8818f());
            }
            return false;
        }

        /* renamed from: f */
        C0235c mo8818f() {
            return null;
        }

        /* renamed from: g */
        C0123b mo8817g(int i) {
            return C0123b.f522e;
        }

        /* renamed from: h */
        C0123b mo8816h() {
            return mo8813k();
        }

        public int hashCode() {
            return C0189d.m8872b(Boolean.valueOf(mo8810n()), Boolean.valueOf(mo8811m()), mo8813k(), mo8815i(), mo8818f());
        }

        /* renamed from: i */
        C0123b mo8815i() {
            return C0123b.f522e;
        }

        /* renamed from: j */
        C0123b mo8814j() {
            return mo8813k();
        }

        /* renamed from: k */
        C0123b mo8813k() {
            return C0123b.f522e;
        }

        /* renamed from: l */
        C0123b mo8812l() {
            return mo8813k();
        }

        /* renamed from: m */
        boolean mo8811m() {
            return false;
        }

        /* renamed from: n */
        boolean mo8810n() {
            return false;
        }

        /* renamed from: o */
        public void mo8809o(C0123b[] c0123bArr) {
        }

        /* renamed from: p */
        void mo8808p(C0123b c0123b) {
        }

        /* renamed from: q */
        void mo8807q(C0197a0 c0197a0) {
        }

        /* renamed from: r */
        public void mo8806r(C0123b c0123b) {
        }
    }

    /* renamed from: a.g.k.a0$m */
    /* loaded from: classes.dex */
    public static final class C0210m {
        /* renamed from: a */
        static int m8805a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a.g.k.a0$n */
    /* loaded from: classes.dex */
    private static final class C0211n {
        /* renamed from: a */
        static int m8804a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            C0197a0 c0197a0 = C0208k.f681r;
        } else {
            C0197a0 c0197a02 = C0209l.f682b;
        }
    }

    public C0197a0(C0197a0 c0197a0) {
        if (c0197a0 == null) {
            this.f651a = new C0209l(this);
            return;
        }
        C0209l c0209l = c0197a0.f651a;
        this.f651a = (Build.VERSION.SDK_INT < 30 || !(c0209l instanceof C0208k)) ? (Build.VERSION.SDK_INT < 29 || !(c0209l instanceof C0207j)) ? (Build.VERSION.SDK_INT < 28 || !(c0209l instanceof C0206i)) ? (Build.VERSION.SDK_INT < 21 || !(c0209l instanceof C0205h)) ? (Build.VERSION.SDK_INT < 20 || !(c0209l instanceof C0204g)) ? new C0209l(this) : new C0204g(this, (C0204g) c0209l) : new C0205h(this, (C0205h) c0209l) : new C0206i(this, (C0206i) c0209l) : new C0207j(this, (C0207j) c0209l) : new C0208k(this, (C0208k) c0209l);
        c0209l.mo8819e(this);
    }

    private C0197a0(WindowInsets windowInsets) {
        C0209l c0204g;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c0204g = new C0208k(this, windowInsets);
        } else if (i >= 29) {
            c0204g = new C0207j(this, windowInsets);
        } else if (i >= 28) {
            c0204g = new C0206i(this, windowInsets);
        } else if (i >= 21) {
            c0204g = new C0205h(this, windowInsets);
        } else if (i < 20) {
            this.f651a = new C0209l(this);
            return;
        } else {
            c0204g = new C0204g(this, windowInsets);
        }
        this.f651a = c0204g;
    }

    /* renamed from: s */
    public static C0197a0 m8842s(WindowInsets windowInsets) {
        return m8841t(windowInsets, null);
    }

    /* renamed from: t */
    public static C0197a0 m8841t(WindowInsets windowInsets, View view) {
        C0194i.m8866c(windowInsets);
        C0197a0 c0197a0 = new C0197a0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c0197a0.m8845p(C0252s.m8660C(view));
            c0197a0.m8857d(view.getRootView());
        }
        return c0197a0;
    }

    @Deprecated
    /* renamed from: a */
    public C0197a0 m8860a() {
        return this.f651a.mo8823a();
    }

    @Deprecated
    /* renamed from: b */
    public C0197a0 m8859b() {
        return this.f651a.mo8822b();
    }

    @Deprecated
    /* renamed from: c */
    public C0197a0 m8858c() {
        return this.f651a.mo8821c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m8857d(View view) {
        this.f651a.mo8820d(view);
    }

    /* renamed from: e */
    public C0235c m8856e() {
        return this.f651a.mo8818f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0197a0) {
            return C0189d.m8873a(this.f651a, ((C0197a0) obj).f651a);
        }
        return false;
    }

    /* renamed from: f */
    public C0123b m8855f(int i) {
        return this.f651a.mo8817g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C0123b m8854g() {
        return this.f651a.mo8815i();
    }

    @Deprecated
    /* renamed from: h */
    public int m8853h() {
        return this.f651a.mo8813k().f526d;
    }

    public int hashCode() {
        C0209l c0209l = this.f651a;
        if (c0209l == null) {
            return 0;
        }
        return c0209l.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m8852i() {
        return this.f651a.mo8813k().f523a;
    }

    @Deprecated
    /* renamed from: j */
    public int m8851j() {
        return this.f651a.mo8813k().f525c;
    }

    @Deprecated
    /* renamed from: k */
    public int m8850k() {
        return this.f651a.mo8813k().f524b;
    }

    /* renamed from: l */
    public boolean m8849l() {
        return this.f651a.mo8811m();
    }

    @Deprecated
    /* renamed from: m */
    public C0197a0 m8848m(int i, int i2, int i3, int i4) {
        C0199b c0199b = new C0199b(this);
        c0199b.m8837c(C0123b.m9046b(i, i2, i3, i4));
        return c0199b.m8839a();
    }

    /* renamed from: n */
    void m8847n(C0123b[] c0123bArr) {
        this.f651a.mo8809o(c0123bArr);
    }

    /* renamed from: o */
    void m8846o(C0123b c0123b) {
        this.f651a.mo8808p(c0123b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m8845p(C0197a0 c0197a0) {
        this.f651a.mo8807q(c0197a0);
    }

    /* renamed from: q */
    void m8844q(C0123b c0123b) {
        this.f651a.mo8806r(c0123b);
    }

    /* renamed from: r */
    public WindowInsets m8843r() {
        C0209l c0209l = this.f651a;
        if (c0209l instanceof C0204g) {
            return ((C0204g) c0209l).f672c;
        }
        return null;
    }
}
