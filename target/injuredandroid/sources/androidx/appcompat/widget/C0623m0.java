package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.C0734a;
import androidx.core.graphics.drawable.C0759a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p004l.p005a.C0012a;
import p000a.p001a.p006m.C0027a;
import p000a.p014d.C0066a;
import p000a.p014d.C0071d;
import p000a.p014d.C0072e;
import p000a.p014d.C0080h;
import p000a.p048q.p049a.p050a.C0405b;
import p000a.p048q.p049a.p050a.C0415h;
/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public final class C0623m0 {

    /* renamed from: i */
    private static C0623m0 f2108i;

    /* renamed from: a */
    private WeakHashMap<Context, C0080h<ColorStateList>> f2110a;

    /* renamed from: b */
    private C0066a<String, InterfaceC0627d> f2111b;

    /* renamed from: c */
    private C0080h<String> f2112c;

    /* renamed from: d */
    private final WeakHashMap<Context, C0071d<WeakReference<Drawable.ConstantState>>> f2113d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f2114e;

    /* renamed from: f */
    private boolean f2115f;

    /* renamed from: g */
    private InterfaceC0628e f2116g;

    /* renamed from: h */
    private static final PorterDuff.Mode f2107h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final C0626c f2109j = new C0626c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.m0$a */
    /* loaded from: classes.dex */
    public static class C0624a implements InterfaceC0627d {
        C0624a() {
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0627d
        /* renamed from: a */
        public Drawable mo7325a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0012a.m9572m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$b */
    /* loaded from: classes.dex */
    public static class C0625b implements InterfaceC0627d {
        C0625b() {
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0627d
        /* renamed from: a */
        public Drawable mo7325a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0405b.m8209a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$c */
    /* loaded from: classes.dex */
    public static class C0626c extends C0072e<Integer, PorterDuffColorFilter> {
        public C0626c(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m7333h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: i */
        PorterDuffColorFilter m7332i(int i, PorterDuff.Mode mode) {
            return m9367c(Integer.valueOf(m7333h(i, mode)));
        }

        /* renamed from: j */
        PorterDuffColorFilter m7331j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m9366d(Integer.valueOf(m7333h(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0627d {
        /* renamed from: a */
        Drawable mo7325a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.m0$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0628e {
        /* renamed from: a */
        boolean mo7330a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo7329b(int i);

        /* renamed from: c */
        Drawable mo7328c(C0623m0 c0623m0, Context context, int i);

        /* renamed from: d */
        ColorStateList mo7327d(Context context, int i);

        /* renamed from: e */
        boolean mo7326e(Context context, int i, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$f */
    /* loaded from: classes.dex */
    public static class C0629f implements InterfaceC0627d {
        C0629f() {
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0627d
        /* renamed from: a */
        public Drawable mo7325a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0415h.m8176c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m7357a(String str, InterfaceC0627d interfaceC0627d) {
        if (this.f2111b == null) {
            this.f2111b = new C0066a<>();
        }
        this.f2111b.put(str, interfaceC0627d);
    }

    /* renamed from: b */
    private synchronized boolean m7356b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0071d<WeakReference<Drawable.ConstantState>> c0071d = this.f2113d.get(context);
            if (c0071d == null) {
                c0071d = new C0071d<>();
                this.f2113d.put(context, c0071d);
            }
            c0071d.m9374j(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m7355c(Context context, int i, ColorStateList colorStateList) {
        if (this.f2110a == null) {
            this.f2110a = new WeakHashMap<>();
        }
        C0080h<ColorStateList> c0080h = this.f2110a.get(context);
        if (c0080h == null) {
            c0080h = new C0080h<>();
            this.f2110a.put(context, c0080h);
        }
        c0080h.m9329a(i, colorStateList);
    }

    /* renamed from: d */
    private void m7354d(Context context) {
        if (this.f2115f) {
            return;
        }
        this.f2115f = true;
        Drawable m7348j = m7348j(context, C0027a.abc_vector_test);
        if (m7348j == null || !m7341q(m7348j)) {
            this.f2115f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: e */
    private static long m7353e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m7352f(Context context, int i) {
        if (this.f2114e == null) {
            this.f2114e = new TypedValue();
        }
        TypedValue typedValue = this.f2114e;
        context.getResources().getValue(i, typedValue, true);
        long m7353e = m7353e(typedValue);
        Drawable m7349i = m7349i(context, m7353e);
        if (m7349i != null) {
            return m7349i;
        }
        InterfaceC0628e interfaceC0628e = this.f2116g;
        Drawable mo7328c = interfaceC0628e == null ? null : interfaceC0628e.mo7328c(this, context, i);
        if (mo7328c != null) {
            mo7328c.setChangingConfigurations(typedValue.changingConfigurations);
            m7356b(context, m7353e, mo7328c);
        }
        return mo7328c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m7351g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m7346l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0623m0 m7350h() {
        C0623m0 c0623m0;
        synchronized (C0623m0.class) {
            if (f2108i == null) {
                C0623m0 c0623m02 = new C0623m0();
                f2108i = c0623m02;
                m7342p(c0623m02);
            }
            c0623m0 = f2108i;
        }
        return c0623m0;
    }

    /* renamed from: i */
    private synchronized Drawable m7349i(Context context, long j) {
        C0071d<WeakReference<Drawable.ConstantState>> c0071d = this.f2113d.get(context);
        if (c0071d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m9378f = c0071d.m9378f(j);
        if (m9378f != null) {
            Drawable.ConstantState constantState = m9378f.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0071d.m9380d(j);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m7346l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m7332i;
        synchronized (C0623m0.class) {
            m7332i = f2109j.m7332i(i, mode);
            if (m7332i == null) {
                m7332i = new PorterDuffColorFilter(i, mode);
                f2109j.m7331j(i, mode, m7332i);
            }
        }
        return m7332i;
    }

    /* renamed from: n */
    private ColorStateList m7344n(Context context, int i) {
        C0080h<ColorStateList> c0080h;
        WeakHashMap<Context, C0080h<ColorStateList>> weakHashMap = this.f2110a;
        if (weakHashMap == null || (c0080h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c0080h.m9325e(i);
    }

    /* renamed from: p */
    private static void m7342p(C0623m0 c0623m0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0623m0.m7357a("vector", new C0629f());
            c0623m0.m7357a("animated-vector", new C0625b());
            c0623m0.m7357a("animated-selector", new C0624a());
        }
    }

    /* renamed from: q */
    private static boolean m7341q(Drawable drawable) {
        return (drawable instanceof C0415h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: r */
    private Drawable m7340r(Context context, int i) {
        int next;
        C0066a<String, InterfaceC0627d> c0066a = this.f2111b;
        if (c0066a == null || c0066a.isEmpty()) {
            return null;
        }
        C0080h<String> c0080h = this.f2112c;
        if (c0080h != null) {
            String m9325e = c0080h.m9325e(i);
            if ("appcompat_skip_skip".equals(m9325e) || (m9325e != null && this.f2111b.get(m9325e) == null)) {
                return null;
            }
        } else {
            this.f2112c = new C0080h<>();
        }
        if (this.f2114e == null) {
            this.f2114e = new TypedValue();
        }
        TypedValue typedValue = this.f2114e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m7353e = m7353e(typedValue);
        Drawable m7349i = m7349i(context, m7353e);
        if (m7349i != null) {
            return m7349i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2112c.m9329a(i, name);
                InterfaceC0627d interfaceC0627d = this.f2111b.get(name);
                if (interfaceC0627d != null) {
                    m7349i = interfaceC0627d.mo7325a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m7349i != null) {
                    m7349i.setChangingConfigurations(typedValue.changingConfigurations);
                    m7356b(context, m7353e, m7349i);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (m7349i == null) {
            this.f2112c.m9329a(i, "appcompat_skip_skip");
        }
        return m7349i;
    }

    /* renamed from: v */
    private Drawable m7336v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m7345m = m7345m(context, i);
        if (m7345m == null) {
            InterfaceC0628e interfaceC0628e = this.f2116g;
            if ((interfaceC0628e == null || !interfaceC0628e.mo7326e(context, i, drawable)) && !m7334x(context, i, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (C0593e0.m7468a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable m6744r = C0759a.m6744r(drawable);
        C0759a.m6747o(m6744r, m7345m);
        PorterDuff.Mode m7343o = m7343o(i);
        if (m7343o != null) {
            C0759a.m6746p(m6744r, m7343o);
            return m6744r;
        }
        return m6744r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m7335w(Drawable drawable, C0650u0 c0650u0, int[] iArr) {
        if (C0593e0.m7468a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (c0650u0.f2197d || c0650u0.f2196c) {
            drawable.setColorFilter(m7351g(c0650u0.f2197d ? c0650u0.f2194a : null, c0650u0.f2196c ? c0650u0.f2195b : f2107h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m7348j(Context context, int i) {
        return m7347k(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable m7347k(Context context, int i, boolean z) {
        Drawable m7340r;
        m7354d(context);
        m7340r = m7340r(context, i);
        if (m7340r == null) {
            m7340r = m7352f(context, i);
        }
        if (m7340r == null) {
            m7340r = C0734a.m6874d(context, i);
        }
        if (m7340r != null) {
            m7340r = m7336v(context, i, z, m7340r);
        }
        if (m7340r != null) {
            C0593e0.m7467b(m7340r);
        }
        return m7340r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList m7345m(Context context, int i) {
        ColorStateList m7344n;
        m7344n = m7344n(context, i);
        if (m7344n == null) {
            m7344n = this.f2116g == null ? null : this.f2116g.mo7327d(context, i);
            if (m7344n != null) {
                m7355c(context, i, m7344n);
            }
        }
        return m7344n;
    }

    /* renamed from: o */
    PorterDuff.Mode m7343o(int i) {
        InterfaceC0628e interfaceC0628e = this.f2116g;
        if (interfaceC0628e == null) {
            return null;
        }
        return interfaceC0628e.mo7329b(i);
    }

    /* renamed from: s */
    public synchronized void m7339s(Context context) {
        C0071d<WeakReference<Drawable.ConstantState>> c0071d = this.f2113d.get(context);
        if (c0071d != null) {
            c0071d.m9382b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable m7338t(Context context, C0578b1 c0578b1, int i) {
        Drawable m7340r = m7340r(context, i);
        if (m7340r == null) {
            m7340r = c0578b1.m7528c(i);
        }
        if (m7340r != null) {
            return m7336v(context, i, false, m7340r);
        }
        return null;
    }

    /* renamed from: u */
    public synchronized void m7337u(InterfaceC0628e interfaceC0628e) {
        this.f2116g = interfaceC0628e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m7334x(Context context, int i, Drawable drawable) {
        InterfaceC0628e interfaceC0628e = this.f2116g;
        return interfaceC0628e != null && interfaceC0628e.mo7330a(context, i, drawable);
    }
}
