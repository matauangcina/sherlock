package p000a.p019g.p028k;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p019g.C0120b;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0197a0;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p019g.p028k.p029b0.InterfaceC0226f;
/* renamed from: a.g.k.s */
/* loaded from: classes.dex */
public class C0252s {

    /* renamed from: a */
    private static Field f725a;

    /* renamed from: b */
    private static boolean f726b;

    /* renamed from: c */
    private static Field f727c;

    /* renamed from: d */
    private static boolean f728d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f729e;

    /* renamed from: f */
    private static WeakHashMap<View, C0267w> f730f;

    /* renamed from: g */
    private static Field f731g;

    /* renamed from: h */
    private static boolean f732h;

    /* renamed from: i */
    private static ThreadLocal<Rect> f733i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.s$a */
    /* loaded from: classes.dex */
    public class C0253a extends AbstractC0258f<Boolean> {
        C0253a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: i */
        public Boolean mo8568d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: j */
        public void mo8567e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: k */
        public boolean mo8564h(Boolean bool, Boolean bool2) {
            return !m8571a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.s$b */
    /* loaded from: classes.dex */
    public class C0254b extends AbstractC0258f<CharSequence> {
        C0254b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: i */
        public CharSequence mo8568d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: j */
        public void mo8567e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: k */
        public boolean mo8564h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.s$c */
    /* loaded from: classes.dex */
    public class C0255c extends AbstractC0258f<CharSequence> {
        C0255c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: i */
        public CharSequence mo8568d(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: j */
        public void mo8567e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: k */
        public boolean mo8564h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.s$d */
    /* loaded from: classes.dex */
    public class C0256d extends AbstractC0258f<Boolean> {
        C0256d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: i */
        public Boolean mo8568d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: j */
        public void mo8567e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000a.p019g.p028k.C0252s.AbstractC0258f
        /* renamed from: k */
        public boolean mo8564h(Boolean bool, Boolean bool2) {
            return !m8571a(bool, bool2);
        }
    }

    /* renamed from: a.g.k.s$e */
    /* loaded from: classes.dex */
    static class ViewTreeObserver$OnGlobalLayoutListenerC0257e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f734f = new WeakHashMap<>();

        ViewTreeObserver$OnGlobalLayoutListenerC0257e() {
        }

        /* renamed from: a */
        private void m8573a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C0252s.m8646Q(view, z2 ? 16 : 32);
                this.f734f.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m8572b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f734f.entrySet()) {
                    m8573a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m8572b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.s$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0258f<T> {

        /* renamed from: a */
        private final int f735a;

        /* renamed from: b */
        private final Class<T> f736b;

        /* renamed from: c */
        private final int f737c;

        /* renamed from: d */
        private final int f738d;

        AbstractC0258f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        AbstractC0258f(int i, Class<T> cls, int i2, int i3) {
            this.f735a = i;
            this.f736b = cls;
            this.f738d = i2;
            this.f737c = i3;
        }

        /* renamed from: b */
        private boolean m8570b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m8569c() {
            return Build.VERSION.SDK_INT >= this.f737c;
        }

        /* renamed from: a */
        boolean m8571a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo8568d(View view);

        /* renamed from: e */
        abstract void mo8567e(View view, T t);

        /* renamed from: f */
        T m8566f(View view) {
            if (m8569c()) {
                return mo8568d(view);
            }
            if (m8570b()) {
                T t = (T) view.getTag(this.f735a);
                if (this.f736b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        void m8565g(View view, T t) {
            if (m8569c()) {
                mo8567e(view, t);
            } else if (m8570b() && mo8564h(m8566f(view), t)) {
                C0252s.m8586z(view);
                view.setTag(this.f735a, t);
                C0252s.m8646Q(view, this.f738d);
            }
        }

        /* renamed from: h */
        abstract boolean mo8564h(T t, T t2);
    }

    /* renamed from: a.g.k.s$g */
    /* loaded from: classes.dex */
    private static class C0259g {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a.g.k.s$g$a */
        /* loaded from: classes.dex */
        public class View$OnApplyWindowInsetsListenerC0260a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0197a0 f739a = null;

            /* renamed from: b */
            final /* synthetic */ View f740b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC0249p f741c;

            View$OnApplyWindowInsetsListenerC0260a(View view, InterfaceC0249p interfaceC0249p) {
                this.f740b = view;
                this.f741c = interfaceC0249p;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0197a0 m8841t = C0197a0.m8841t(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    C0259g.m8563a(windowInsets, this.f740b);
                    if (m8841t.equals(this.f739a)) {
                        return this.f741c.mo2660a(view, m8841t).m8843r();
                    }
                }
                this.f739a = m8841t;
                C0197a0 mo2660a = this.f741c.mo2660a(view, m8841t);
                if (Build.VERSION.SDK_INT >= 30) {
                    return mo2660a.m8843r();
                }
                C0252s.m8629d0(view);
                return mo2660a.m8843r();
            }
        }

        /* renamed from: a */
        static void m8563a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0120b.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C0197a0 m8562b(View view) {
            return C0197a0.C0198a.m8840a(view);
        }

        /* renamed from: c */
        static void m8561c(View view, InterfaceC0249p interfaceC0249p) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C0120b.tag_on_apply_window_listener, interfaceC0249p);
            }
            if (interfaceC0249p == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0120b.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0260a(view, interfaceC0249p));
            }
        }
    }

    /* renamed from: a.g.k.s$h */
    /* loaded from: classes.dex */
    private static class C0261h {
        /* renamed from: a */
        public static C0197a0 m8560a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0197a0 m8842s = C0197a0.m8842s(rootWindowInsets);
            m8842s.m8845p(m8842s);
            m8842s.m8857d(view.getRootView());
            return m8842s;
        }
    }

    /* renamed from: a.g.k.s$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0262i {
        /* renamed from: a */
        boolean m8559a(View view, KeyEvent keyEvent);
    }

    /* renamed from: a.g.k.s$j */
    /* loaded from: classes.dex */
    static class C0263j {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f742d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f743a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f744b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f745c = null;

        C0263j() {
        }

        /* renamed from: a */
        static C0263j m8558a(View view) {
            C0263j c0263j = (C0263j) view.getTag(C0120b.tag_unhandled_key_event_manager);
            if (c0263j == null) {
                C0263j c0263j2 = new C0263j();
                view.setTag(C0120b.tag_unhandled_key_event_manager, c0263j2);
                return c0263j2;
            }
            return c0263j;
        }

        /* renamed from: c */
        private View m8556c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f743a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m8556c = m8556c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m8556c != null) {
                            return m8556c;
                        }
                    }
                }
                if (m8554e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m8555d() {
            if (this.f744b == null) {
                this.f744b = new SparseArray<>();
            }
            return this.f744b;
        }

        /* renamed from: e */
        private boolean m8554e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0120b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC0262i) arrayList.get(size)).m8559a(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: g */
        private void m8552g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f743a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f742d.isEmpty()) {
                return;
            }
            synchronized (f742d) {
                if (this.f743a == null) {
                    this.f743a = new WeakHashMap<>();
                }
                for (int size = f742d.size() - 1; size >= 0; size--) {
                    View view = f742d.get(size).get();
                    if (view == null) {
                        f742d.remove(size);
                    } else {
                        this.f743a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f743a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m8557b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m8552g();
            }
            View m8556c = m8556c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m8556c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m8555d().put(keyCode, new WeakReference<>(m8556c));
                }
            }
            return m8556c != null;
        }

        /* renamed from: f */
        boolean m8553f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f745c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f745c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> m8555d = m8555d();
                if (keyEvent.getAction() == 1 && (indexOfKey = m8555d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = m8555d.valueAt(indexOfKey);
                    m8555d.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = m8555d.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && C0252s.m8651L(view)) {
                        m8554e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f730f = null;
        f732h = false;
        new ViewTreeObserver$OnGlobalLayoutListenerC0257e();
    }

    /* renamed from: A */
    public static int m8662A(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: B */
    public static int m8661B(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: C */
    public static C0197a0 m8660C(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0261h.m8560a(view);
        }
        if (i >= 21) {
            return C0259g.m8562b(view);
        }
        return null;
    }

    /* renamed from: D */
    public static final CharSequence m8659D(View view) {
        return m8591w0().m8566f(view);
    }

    /* renamed from: E */
    public static String m8658E(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f729e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: F */
    public static int m8657F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: G */
    public static float m8656G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: H */
    public static boolean m8655H(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m8654I(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: J */
    public static boolean m8653J(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m8652K(View view) {
        Boolean m8566f = m8636a().m8566f(view);
        if (m8566f == null) {
            return false;
        }
        return m8566f.booleanValue();
    }

    /* renamed from: L */
    public static boolean m8651L(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: M */
    public static boolean m8650M(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: N */
    public static boolean m8649N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC0243j) {
            return ((InterfaceC0243j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m8648O(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m8647P(View view) {
        Boolean m8566f = m8627e0().m8566f(view);
        if (m8566f == null) {
            return false;
        }
        return m8566f.booleanValue();
    }

    /* renamed from: Q */
    static void m8646Q(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m8614l(view) != null && view.getVisibility() == 0;
            if (m8616k(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m8614l(view));
                    m8593v0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m8614l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: R */
    public static void m8645R(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 < 21) {
            m8630d(view, i);
        } else {
            Rect m8600s = m8600s();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m8600s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m8600s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m8630d(view, i);
            if (z && m8600s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m8600s);
            }
        }
    }

    /* renamed from: S */
    public static void m8644S(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 < 21) {
            m8628e(view, i);
        } else {
            Rect m8600s = m8600s();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m8600s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m8600s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m8628e(view, i);
            if (z && m8600s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m8600s);
            }
        }
    }

    /* renamed from: T */
    public static C0197a0 m8643T(View view, C0197a0 c0197a0) {
        WindowInsets m8843r;
        if (Build.VERSION.SDK_INT >= 21 && (m8843r = c0197a0.m8843r()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(m8843r);
            if (!onApplyWindowInsets.equals(m8843r)) {
                return C0197a0.m8841t(onApplyWindowInsets, view);
            }
        }
        return c0197a0;
    }

    /* renamed from: U */
    public static void m8642U(View view, C0217c c0217c) {
        view.onInitializeAccessibilityNodeInfo(c0217c.m8732u0());
    }

    /* renamed from: V */
    private static AbstractC0258f<CharSequence> m8641V() {
        return new C0254b(C0120b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: W */
    public static boolean m8640W(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: X */
    public static void m8639X(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: Y */
    public static void m8638Y(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: Z */
    public static void m8637Z(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    private static AbstractC0258f<Boolean> m8636a() {
        return new C0256d(C0120b.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m8635a0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m8633b0(i, view);
            m8646Q(view, 0);
        }
    }

    /* renamed from: b */
    private static void m8634b(View view, C0217c.C0218a c0218a) {
        if (Build.VERSION.SDK_INT >= 21) {
            m8586z(view);
            m8633b0(c0218a.m8724b(), view);
            m8612m(view).add(c0218a);
            m8646Q(view, 0);
        }
    }

    /* renamed from: b0 */
    private static void m8633b0(int i, View view) {
        List<C0217c.C0218a> m8612m = m8612m(view);
        for (int i2 = 0; i2 < m8612m.size(); i2++) {
            if (m8612m.get(i2).m8724b() == i) {
                m8612m.remove(i2);
                return;
            }
        }
    }

    /* renamed from: c */
    public static C0267w m8632c(View view) {
        if (f730f == null) {
            f730f = new WeakHashMap<>();
        }
        C0267w c0267w = f730f.get(view);
        if (c0267w == null) {
            C0267w c0267w2 = new C0267w(view);
            f730f.put(view, c0267w2);
            return c0267w2;
        }
        return c0267w;
    }

    /* renamed from: c0 */
    public static void m8631c0(View view, C0217c.C0218a c0218a, CharSequence charSequence, InterfaceC0226f interfaceC0226f) {
        if (interfaceC0226f == null && charSequence == null) {
            m8635a0(view, c0218a.m8724b());
        } else {
            m8634b(view, c0218a.m8725a(charSequence, interfaceC0226f));
        }
    }

    /* renamed from: d */
    private static void m8630d(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m8587y0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m8587y0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    public static void m8629d0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: e */
    private static void m8628e(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m8587y0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m8587y0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    private static AbstractC0258f<Boolean> m8627e0() {
        return new C0253a(C0120b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m8626f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0263j.m8558a(view).m8557b(view, keyEvent);
    }

    /* renamed from: f0 */
    public static void m8625f0(View view, C0195a c0195a) {
        if (c0195a == null && (m8620i(view) instanceof C0195a.C0196a)) {
            c0195a = new C0195a();
        }
        view.setAccessibilityDelegate(c0195a == null ? null : c0195a.m8863d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m8624g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0263j.m8558a(view).m8553f(keyEvent);
    }

    /* renamed from: g0 */
    public static void m8623g0(View view, boolean z) {
        m8636a().m8565g(view, Boolean.valueOf(z));
    }

    /* renamed from: h */
    public static C0195a m8622h(View view) {
        View.AccessibilityDelegate m8620i = m8620i(view);
        if (m8620i == null) {
            return null;
        }
        return m8620i instanceof C0195a.C0196a ? ((C0195a.C0196a) m8620i).f650a : new C0195a(m8620i);
    }

    /* renamed from: h0 */
    public static void m8621h0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: i */
    private static View.AccessibilityDelegate m8620i(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m8618j(view);
    }

    /* renamed from: i0 */
    public static void m8619i0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: j */
    private static View.AccessibilityDelegate m8618j(View view) {
        if (f732h) {
            return null;
        }
        if (f731g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f731g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f732h = true;
                return null;
            }
        }
        try {
            Object obj = f731g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f732h = true;
            return null;
        }
    }

    /* renamed from: j0 */
    public static void m8617j0(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC0251r) {
                ((InterfaceC0251r) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: k */
    public static int m8616k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: k0 */
    public static void m8615k0(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC0251r) {
                ((InterfaceC0251r) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: l */
    public static CharSequence m8614l(View view) {
        return m8641V().m8566f(view);
    }

    /* renamed from: l0 */
    public static void m8613l0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: m */
    private static List<C0217c.C0218a> m8612m(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0120b.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(C0120b.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public static void m8611m0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: n */
    public static ColorStateList m8610n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0251r) {
            return ((InterfaceC0251r) view).getSupportBackgroundTintList();
        }
        return null;
    }

    @Deprecated
    /* renamed from: n0 */
    public static void m8609n0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: o */
    public static PorterDuff.Mode m8608o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceC0251r) {
            return ((InterfaceC0251r) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: o0 */
    public static void m8607o0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: p */
    public static Rect m8606p(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: p0 */
    public static void m8605p0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: q */
    public static Display m8604q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m8651L(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: q0 */
    public static void m8603q0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: r */
    public static float m8602r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: r0 */
    public static void m8601r0(View view, InterfaceC0249p interfaceC0249p) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0259g.m8561c(view, interfaceC0249p);
        }
    }

    /* renamed from: s */
    private static Rect m8600s() {
        if (f733i == null) {
            f733i = new ThreadLocal<>();
        }
        Rect rect = f733i.get();
        if (rect == null) {
            rect = new Rect();
            f733i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: s0 */
    public static void m8599s0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: t */
    public static boolean m8598t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: t0 */
    public static void m8597t0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: u */
    public static int m8596u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: u0 */
    public static void m8595u0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f729e == null) {
            f729e = new WeakHashMap<>();
        }
        f729e.put(view, str);
    }

    /* renamed from: v */
    public static int m8594v(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: v0 */
    private static void m8593v0(View view) {
        if (m8596u(view) == 0) {
            m8605p0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m8596u((View) parent) == 4) {
                m8605p0(view, 2);
                return;
            }
        }
    }

    /* renamed from: w */
    public static int m8592w(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: w0 */
    private static AbstractC0258f<CharSequence> m8591w0() {
        return new C0255c(C0120b.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: x */
    public static int m8590x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f728d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f727c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f728d = true;
        }
        Field field = f727c;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: x0 */
    public static void m8589x0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC0243j) {
            ((InterfaceC0243j) view).stopNestedScroll();
        }
    }

    /* renamed from: y */
    public static int m8588y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f726b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f725a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f726b = true;
        }
        Field field = f725a;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: y0 */
    private static void m8587y0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: z */
    static C0195a m8586z(View view) {
        C0195a m8622h = m8622h(view);
        if (m8622h == null) {
            m8622h = new C0195a();
        }
        m8625f0(view, m8622h);
        return m8622h;
    }
}
