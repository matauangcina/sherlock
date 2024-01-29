package io.flutter.plugin.platform;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.C2788b;
import io.flutter.embedding.android.C2798g;
import io.flutter.embedding.android.C2806j;
import io.flutter.embedding.android.C2812k;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.C2918a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.p149e.C2832a;
import io.flutter.embedding.engine.p159i.C2893i;
import io.flutter.embedding.engine.renderer.C2919a;
import io.flutter.plugin.editing.C2934d;
import io.flutter.plugin.platform.C2958j;
import io.flutter.view.C2974c;
import io.flutter.view.InterfaceC2987e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.plugin.platform.j */
/* loaded from: classes.dex */
public class C2958j implements InterfaceC2957i {

    /* renamed from: b */
    private C2788b f7375b;

    /* renamed from: c */
    private Context f7376c;

    /* renamed from: d */
    private View f7377d;

    /* renamed from: e */
    private InterfaceC2987e f7378e;

    /* renamed from: f */
    private C2934d f7379f;

    /* renamed from: g */
    private C2893i f7380g;

    /* renamed from: n */
    private int f7387n = 0;

    /* renamed from: o */
    private boolean f7388o = false;

    /* renamed from: s */
    private final C2893i.InterfaceC2899e f7392s = new C2959a();

    /* renamed from: a */
    private final C2956h f7374a = new C2956h();

    /* renamed from: i */
    final HashMap<Integer, C2961k> f7382i = new HashMap<>();

    /* renamed from: h */
    private final C2948c f7381h = new C2948c();

    /* renamed from: j */
    private final HashMap<Context, View> f7383j = new HashMap<>();

    /* renamed from: m */
    private final SparseArray<C2798g> f7386m = new SparseArray<>();

    /* renamed from: p */
    private HashSet<Integer> f7389p = new HashSet<>();

    /* renamed from: q */
    private HashSet<Integer> f7390q = new HashSet<>();

    /* renamed from: k */
    private final SparseArray<InterfaceC2953e> f7384k = new SparseArray<>();

    /* renamed from: l */
    private final SparseArray<C2918a> f7385l = new SparseArray<>();

    /* renamed from: r */
    private final C2812k f7391r = C2812k.m625a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.j$a */
    /* loaded from: classes.dex */
    public class C2959a implements C2893i.InterfaceC2899e {

        /* renamed from: io.flutter.plugin.platform.j$a$a */
        /* loaded from: classes.dex */
        class RunnableC2960a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C2961k f7394f;

            /* renamed from: g */
            final /* synthetic */ Runnable f7395g;

            RunnableC2960a(C2961k c2961k, Runnable runnable) {
                this.f7394f = c2961k;
                this.f7395g = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2958j.this.m210Z(this.f7394f);
                this.f7395g.run();
            }
        }

        C2959a() {
        }

        /* renamed from: i */
        private void m173i(int i) {
            if (Build.VERSION.SDK_INT >= i) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + Build.VERSION.SDK_INT + ", required API level is: " + i);
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: a */
        public void mo181a(C2893i.C2897c c2897c, Runnable runnable) {
            m173i(20);
            C2961k c2961k = C2958j.this.f7382i.get(Integer.valueOf(c2897c.f7171a));
            if (c2961k == null) {
                throw new IllegalStateException("Trying to resize a platform view with unknown id: " + c2897c.f7171a);
            }
            int m211Y = C2958j.this.m211Y(c2897c.f7172b);
            int m211Y2 = C2958j.this.m211Y(c2897c.f7173c);
            C2958j.this.m206b0(m211Y, m211Y2);
            C2958j.this.m224L(c2961k);
            c2961k.m163i(m211Y, m211Y2, new RunnableC2960a(c2961k, runnable));
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: b */
        public void mo180b(int i) {
            InterfaceC2953e interfaceC2953e = (InterfaceC2953e) C2958j.this.f7384k.get(i);
            C2918a c2918a = (C2918a) C2958j.this.f7385l.get(i);
            if (interfaceC2953e != null) {
                if (c2918a != null) {
                    c2918a.removeView(interfaceC2953e.m242c());
                }
                C2958j.this.f7384k.remove(i);
                interfaceC2953e.m244a();
            }
            if (c2918a != null) {
                ((ViewGroup) c2918a.getParent()).removeView(c2918a);
                C2958j.this.f7385l.remove(i);
            }
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: c */
        public void mo179c(int i, int i2) {
            if (!C2958j.m208a0(i2)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
            }
            m173i(20);
            View m168d = C2958j.this.f7382i.get(Integer.valueOf(i)).m168d();
            if (m168d != null) {
                m168d.setLayoutDirection(i2);
                return;
            }
            throw new IllegalStateException("Sending touch to an unknown view with id: " + i2);
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: d */
        public long mo178d(final C2893i.C2896b c2896b) {
            m173i(20);
            if (!C2958j.m208a0(c2896b.f7169e)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + c2896b.f7169e + "(view id: " + c2896b.f7165a + ")");
            } else if (C2958j.this.f7382i.containsKey(Integer.valueOf(c2896b.f7165a))) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + c2896b.f7165a);
            } else {
                AbstractC2954f m236a = C2958j.this.f7374a.m236a(c2896b.f7166b);
                if (m236a == null) {
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + c2896b.f7166b);
                }
                Object mo4005b = c2896b.f7170f != null ? m236a.m237b().mo4005b(c2896b.f7170f) : null;
                int m211Y = C2958j.this.m211Y(c2896b.f7167c);
                int m211Y2 = C2958j.this.m211Y(c2896b.f7168d);
                C2958j.this.m206b0(m211Y, m211Y2);
                InterfaceC2987e.InterfaceC2988a mo13a = C2958j.this.f7378e.mo13a();
                C2961k m171a = C2961k.m171a(C2958j.this.f7376c, C2958j.this.f7381h, m236a, mo13a, m211Y, m211Y2, c2896b.f7165a, mo4005b, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.a
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        C2958j.C2959a.this.m172j(c2896b, view, z);
                    }
                });
                if (m171a == null) {
                    throw new IllegalStateException("Failed creating virtual display for a " + c2896b.f7166b + " with id: " + c2896b.f7165a);
                }
                if (C2958j.this.f7377d != null) {
                    m171a.m167e(C2958j.this.f7377d);
                }
                C2958j.this.f7382i.put(Integer.valueOf(c2896b.f7165a), m171a);
                View m168d = m171a.m168d();
                m168d.setLayoutDirection(c2896b.f7169e);
                C2958j.this.f7383j.put(m168d.getContext(), m168d);
                return mo13a.mo10c();
            }
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: e */
        public void mo177e(int i) {
            m173i(20);
            C2958j.this.f7382i.get(Integer.valueOf(i)).m168d().clearFocus();
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: f */
        public void mo176f(int i) {
            m173i(20);
            C2961k c2961k = C2958j.this.f7382i.get(Integer.valueOf(i));
            if (c2961k == null) {
                throw new IllegalStateException("Trying to dispose a platform view with unknown id: " + i);
            }
            if (C2958j.this.f7379f != null) {
                C2958j.this.f7379f.m321j(i);
            }
            C2958j.this.f7383j.remove(c2961k.m168d().getContext());
            c2961k.m169c();
            C2958j.this.f7382i.remove(Integer.valueOf(i));
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: g */
        public void mo175g(C2893i.C2896b c2896b) {
            m173i(19);
            if (!C2958j.m208a0(c2896b.f7169e)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + c2896b.f7169e + "(view id: " + c2896b.f7165a + ")");
            }
            AbstractC2954f m236a = C2958j.this.f7374a.m236a(c2896b.f7166b);
            if (m236a != null) {
                C2958j.this.f7384k.put(c2896b.f7165a, m236a.m238a(C2958j.this.f7376c, c2896b.f7165a, c2896b.f7170f != null ? m236a.m237b().mo4005b(c2896b.f7170f) : null));
                return;
            }
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + c2896b.f7166b);
        }

        @Override // io.flutter.embedding.engine.p159i.C2893i.InterfaceC2899e
        /* renamed from: h */
        public void mo174h(C2893i.C2898d c2898d) {
            int i = c2898d.f7174a;
            float f = C2958j.this.f7376c.getResources().getDisplayMetrics().density;
            m173i(20);
            if (C2958j.this.f7382i.containsKey(Integer.valueOf(i))) {
                C2958j.this.f7382i.get(Integer.valueOf(c2898d.f7174a)).m170b(C2958j.this.m212X(f, c2898d, true));
            } else if (C2958j.this.f7384k.get(i) == null) {
                throw new IllegalStateException("Sending touch to an unknown view with id: " + i);
            } else {
                MotionEvent m212X = C2958j.this.m212X(f, c2898d, false);
                View m242c = ((InterfaceC2953e) C2958j.this.f7384k.get(c2898d.f7174a)).m242c();
                if (m242c != null) {
                    m242c.dispatchTouchEvent(m212X);
                }
            }
        }

        /* renamed from: j */
        public /* synthetic */ void m172j(C2893i.C2896b c2896b, View view, boolean z) {
            if (z) {
                C2958j.this.f7380g.m439d(c2896b.f7165a);
            }
        }
    }

    /* renamed from: E */
    private void m231E(boolean z) {
        for (int i = 0; i < this.f7386m.size(); i++) {
            int keyAt = this.f7386m.keyAt(i);
            C2798g valueAt = this.f7386m.valueAt(i);
            if (this.f7389p.contains(Integer.valueOf(keyAt))) {
                ((C2806j) this.f7377d).m643i(valueAt);
                z &= valueAt.m675d();
            } else {
                if (!this.f7388o) {
                    valueAt.mo364a();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.f7385l.size(); i2++) {
            int keyAt2 = this.f7385l.keyAt(i2);
            C2918a c2918a = this.f7385l.get(keyAt2);
            if (z && this.f7390q.contains(Integer.valueOf(keyAt2))) {
                c2918a.setVisibility(0);
            } else {
                c2918a.setVisibility(8);
            }
        }
    }

    /* renamed from: F */
    private void m230F() {
        for (C2961k c2961k : this.f7382i.values()) {
            c2961k.m169c();
        }
        this.f7382i.clear();
        while (this.f7384k.size() > 0) {
            this.f7392s.mo180b(this.f7384k.keyAt(0));
        }
    }

    /* renamed from: G */
    private float m229G() {
        return this.f7376c.getResources().getDisplayMetrics().density;
    }

    /* renamed from: J */
    private void m226J() {
        if (this.f7388o) {
            return;
        }
        ((C2806j) this.f7377d).m640l();
        this.f7388o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m224L(C2961k c2961k) {
        C2934d c2934d = this.f7379f;
        if (c2934d == null) {
            return;
        }
        c2934d.m312s();
        c2961k.m165g();
    }

    /* renamed from: T */
    private static MotionEvent.PointerCoords m216T(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f;
        return pointerCoords;
    }

    /* renamed from: U */
    private static List<MotionEvent.PointerCoords> m215U(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(m216T(obj2, f));
        }
        return arrayList;
    }

    /* renamed from: V */
    private static MotionEvent.PointerProperties m214V(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: W */
    private static List<MotionEvent.PointerProperties> m213W(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(m214V(obj2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public int m211Y(double d) {
        return (int) Math.round(d * m229G());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m210Z(C2961k c2961k) {
        C2934d c2934d = this.f7379f;
        if (c2934d == null) {
            return;
        }
        c2934d.m332F();
        c2961k.m164h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static boolean m208a0(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m206b0(int i, int i2) {
        DisplayMetrics displayMetrics = this.f7376c.getResources().getDisplayMetrics();
        if (i2 > displayMetrics.heightPixels || i > displayMetrics.widthPixels) {
            C1499b.m4049e("PlatformViewsController", "Creating a virtual display of size: [" + i + ", " + i2 + "] may result in problems(https://github.com/flutter/flutter/issues/2897).It is larger than the device screen size: [" + displayMetrics.widthPixels + ", " + displayMetrics.heightPixels + "].");
        }
    }

    /* renamed from: A */
    public void m235A() {
        for (int i = 0; i < this.f7386m.size(); i++) {
            this.f7386m.keyAt(i);
            C2798g valueAt = this.f7386m.valueAt(i);
            valueAt.mo364a();
            ((C2806j) this.f7377d).removeView(valueAt);
        }
        this.f7386m.clear();
    }

    /* renamed from: B */
    public void m234B() {
        C2893i c2893i = this.f7380g;
        if (c2893i != null) {
            c2893i.m438e(null);
        }
        this.f7380g = null;
        this.f7376c = null;
        this.f7378e = null;
    }

    /* renamed from: C */
    public void m233C() {
        this.f7377d = null;
        for (C2961k c2961k : this.f7382i.values()) {
            c2961k.m166f();
        }
    }

    /* renamed from: D */
    public void m232D() {
        this.f7379f = null;
    }

    /* renamed from: H */
    public InterfaceC2955g m228H() {
        return this.f7374a;
    }

    /* renamed from: I */
    void m227I(int i) {
        InterfaceC2953e interfaceC2953e = this.f7384k.get(i);
        if (interfaceC2953e == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f7385l.get(i) != null) {
            return;
        }
        if (interfaceC2953e.m242c() == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (interfaceC2953e.m242c().getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f7376c;
        C2918a c2918a = new C2918a(context, context.getResources().getDisplayMetrics().density, this.f7375b);
        this.f7385l.put(i, c2918a);
        c2918a.addView(interfaceC2953e.m242c());
        ((C2806j) this.f7377d).addView(c2918a);
    }

    /* renamed from: K */
    public /* synthetic */ void m225K() {
        m231E(false);
    }

    /* renamed from: M */
    public void m223M() {
    }

    /* renamed from: N */
    public void m222N() {
        this.f7389p.clear();
        this.f7390q.clear();
    }

    /* renamed from: O */
    public void m221O() {
        m230F();
    }

    /* renamed from: P */
    public void m220P(int i, int i2, int i3, int i4, int i5) {
        m226J();
        C2798g c2798g = this.f7386m.get(i);
        if (c2798g.getParent() == null) {
            ((C2806j) this.f7377d).addView(c2798g);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        c2798g.setLayoutParams(layoutParams);
        c2798g.setVisibility(0);
        c2798g.bringToFront();
        this.f7389p.add(Integer.valueOf(i));
    }

    /* renamed from: Q */
    public void m219Q(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        m226J();
        m227I(i);
        C2918a c2918a = this.f7385l.get(i);
        c2918a.m388a(flutterMutatorsStack, i2, i3, i4, i5);
        c2918a.setVisibility(0);
        c2918a.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View m242c = this.f7384k.get(i).m242c();
        if (m242c != null) {
            m242c.setLayoutParams(layoutParams);
            m242c.bringToFront();
        }
        this.f7390q.add(Integer.valueOf(i));
    }

    /* renamed from: R */
    public void m218R() {
        C2806j c2806j = (C2806j) this.f7377d;
        boolean z = false;
        if (this.f7388o && this.f7390q.isEmpty()) {
            this.f7388o = false;
            c2806j.m630v(new Runnable() { // from class: io.flutter.plugin.platform.b
                @Override // java.lang.Runnable
                public final void run() {
                    C2958j.this.m225K();
                }
            });
            return;
        }
        if (this.f7388o && c2806j.m646f()) {
            z = true;
        }
        m231E(z);
    }

    /* renamed from: S */
    public void m217S() {
        m230F();
    }

    /* renamed from: X */
    public MotionEvent m212X(float f, C2893i.C2898d c2898d, boolean z) {
        MotionEvent m624b = this.f7391r.m624b(C2812k.C2813a.m620c(c2898d.f7189p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) m213W(c2898d.f7179f).toArray(new MotionEvent.PointerProperties[c2898d.f7178e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m215U(c2898d.f7180g, f).toArray(new MotionEvent.PointerCoords[c2898d.f7178e]);
        return (z || m624b == null) ? MotionEvent.obtain(c2898d.f7175b.longValue(), c2898d.f7176c.longValue(), c2898d.f7177d, c2898d.f7178e, pointerPropertiesArr, pointerCoordsArr, c2898d.f7181h, c2898d.f7182i, c2898d.f7183j, c2898d.f7184k, c2898d.f7185l, c2898d.f7186m, c2898d.f7187n, c2898d.f7188o) : MotionEvent.obtain(m624b.getDownTime(), m624b.getEventTime(), m624b.getAction(), c2898d.f7178e, pointerPropertiesArr, pointerCoordsArr, m624b.getMetaState(), m624b.getButtonState(), m624b.getXPrecision(), m624b.getYPrecision(), m624b.getDeviceId(), m624b.getEdgeFlags(), m624b.getSource(), m624b.getFlags());
    }

    @Override // io.flutter.plugin.platform.InterfaceC2957i
    /* renamed from: a */
    public void mo209a(C2974c c2974c) {
        this.f7381h.m278b(c2974c);
    }

    @Override // io.flutter.plugin.platform.InterfaceC2957i
    /* renamed from: b */
    public void mo207b() {
        this.f7381h.m278b(null);
    }

    @Override // io.flutter.plugin.platform.InterfaceC2957i
    /* renamed from: c */
    public boolean mo205c(Integer num) {
        return this.f7382i.containsKey(num);
    }

    @Override // io.flutter.plugin.platform.InterfaceC2957i
    /* renamed from: d */
    public View mo204d(Integer num) {
        if (this.f7384k.get(num.intValue()) != null) {
            return this.f7384k.get(num.intValue()).m242c();
        }
        C2961k c2961k = this.f7382i.get(num);
        if (c2961k == null) {
            return null;
        }
        return c2961k.m168d();
    }

    /* renamed from: t */
    public void m188t(Context context, InterfaceC2987e interfaceC2987e, C2832a c2832a) {
        if (this.f7376c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f7376c = context;
        this.f7378e = interfaceC2987e;
        C2893i c2893i = new C2893i(c2832a);
        this.f7380g = c2893i;
        c2893i.m438e(this.f7392s);
    }

    /* renamed from: u */
    public void m187u(C2934d c2934d) {
        this.f7379f = c2934d;
    }

    /* renamed from: v */
    public void m186v(C2919a c2919a) {
        this.f7375b = new C2788b(c2919a, true);
    }

    /* renamed from: w */
    public void m185w(View view) {
        this.f7377d = view;
        for (C2961k c2961k : this.f7382i.values()) {
            c2961k.m167e(view);
        }
    }

    /* renamed from: x */
    public boolean m184x(View view) {
        if (view != null && this.f7383j.containsKey(view.getContext())) {
            View view2 = this.f7383j.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return false;
    }

    /* renamed from: y */
    public FlutterOverlaySurface m183y() {
        return m182z(new C2798g(this.f7377d.getContext(), this.f7377d.getWidth(), this.f7377d.getHeight(), C2798g.EnumC2800b.overlay));
    }

    /* renamed from: z */
    public FlutterOverlaySurface m182z(C2798g c2798g) {
        int i = this.f7387n;
        this.f7387n = i + 1;
        this.f7386m.put(i, c2798g);
        return new FlutterOverlaySurface(i, c2798g.getSurface());
    }
}
