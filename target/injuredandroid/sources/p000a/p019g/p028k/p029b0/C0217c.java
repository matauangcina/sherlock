package p000a.p019g.p028k.p029b0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p019g.C0120b;
import p000a.p019g.p024g.C0143a;
import p000a.p019g.p028k.p029b0.InterfaceC0226f;
/* renamed from: a.g.k.b0.c */
/* loaded from: classes.dex */
public class C0217c {

    /* renamed from: d */
    private static int f688d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f689a;

    /* renamed from: b */
    public int f690b = -1;

    /* renamed from: c */
    private int f691c = -1;

    /* renamed from: a.g.k.b0.c$a */
    /* loaded from: classes.dex */
    public static class C0218a {

        /* renamed from: e */
        public static final C0218a f692e;

        /* renamed from: f */
        public static final C0218a f693f;

        /* renamed from: g */
        public static final C0218a f694g;

        /* renamed from: h */
        public static final C0218a f695h;

        /* renamed from: i */
        public static final C0218a f696i;

        /* renamed from: j */
        public static final C0218a f697j;

        /* renamed from: k */
        public static final C0218a f698k;

        /* renamed from: l */
        public static final C0218a f699l;

        /* renamed from: a */
        final Object f700a;

        /* renamed from: b */
        private final int f701b;

        /* renamed from: c */
        private final Class<? extends InterfaceC0226f.AbstractC0227a> f702c;

        /* renamed from: d */
        protected final InterfaceC0226f f703d;

        static {
            new C0218a(1, null);
            new C0218a(2, null);
            new C0218a(4, null);
            new C0218a(8, null);
            f692e = new C0218a(16, null);
            new C0218a(32, null);
            new C0218a(64, null);
            new C0218a(128, null);
            new C0218a(256, null, InterfaceC0226f.C0228b.class);
            new C0218a(512, null, InterfaceC0226f.C0228b.class);
            new C0218a(1024, null, InterfaceC0226f.C0229c.class);
            new C0218a(2048, null, InterfaceC0226f.C0229c.class);
            f693f = new C0218a(4096, null);
            f694g = new C0218a(8192, null);
            new C0218a(16384, null);
            new C0218a(32768, null);
            new C0218a(65536, null);
            new C0218a(131072, null, InterfaceC0226f.C0233g.class);
            f695h = new C0218a(262144, null);
            f696i = new C0218a(524288, null);
            f697j = new C0218a(1048576, null);
            new C0218a(2097152, null, InterfaceC0226f.C0234h.class);
            new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, InterfaceC0226f.C0231e.class);
            f698k = new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f699l = new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, InterfaceC0226f.C0232f.class);
            new C0218a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, InterfaceC0226f.C0230d.class);
            new C0218a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new C0218a(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public C0218a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        private C0218a(int i, CharSequence charSequence, Class<? extends InterfaceC0226f.AbstractC0227a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C0218a(Object obj) {
            this(obj, 0, null, null, null);
        }

        C0218a(Object obj, int i, CharSequence charSequence, InterfaceC0226f interfaceC0226f, Class<? extends InterfaceC0226f.AbstractC0227a> cls) {
            this.f701b = i;
            this.f703d = interfaceC0226f;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f700a = obj;
            this.f702c = cls;
        }

        /* renamed from: a */
        public C0218a m8725a(CharSequence charSequence, InterfaceC0226f interfaceC0226f) {
            return new C0218a(null, this.f701b, charSequence, interfaceC0226f, this.f702c);
        }

        /* renamed from: b */
        public int m8724b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f700a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence m8723c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f700a).getLabel();
            }
            return null;
        }

        /* renamed from: d */
        public boolean m8722d(View view, Bundle bundle) {
            InterfaceC0226f.AbstractC0227a newInstance;
            if (this.f703d != null) {
                InterfaceC0226f.AbstractC0227a abstractC0227a = null;
                Class<? extends InterfaceC0226f.AbstractC0227a> cls = this.f702c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        newInstance.m8713a(bundle);
                        abstractC0227a = newInstance;
                    } catch (Exception e2) {
                        e = e2;
                        abstractC0227a = newInstance;
                        Class<? extends InterfaceC0226f.AbstractC0227a> cls2 = this.f702c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        return this.f703d.mo3322a(view, abstractC0227a);
                    }
                }
                return this.f703d.mo3322a(view, abstractC0227a);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0218a)) {
                Object obj2 = this.f700a;
                Object obj3 = ((C0218a) obj).f700a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f700a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: a.g.k.b0.c$b */
    /* loaded from: classes.dex */
    public static class C0219b {

        /* renamed from: a */
        final Object f704a;

        C0219b(Object obj) {
            this.f704a = obj;
        }

        /* renamed from: a */
        public static C0219b m8721a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C0219b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C0219b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0219b(null);
        }
    }

    /* renamed from: a.g.k.b0.c$c */
    /* loaded from: classes.dex */
    public static class C0220c {

        /* renamed from: a */
        final Object f705a;

        C0220c(Object obj) {
            this.f705a = obj;
        }

        /* renamed from: a */
        public static C0220c m8720a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0220c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0220c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0220c(null);
        }
    }

    private C0217c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f689a = accessibilityNodeInfo;
    }

    /* renamed from: K */
    public static C0217c m8789K() {
        return m8730v0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: L */
    public static C0217c m8788L(View view) {
        return m8730v0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: M */
    public static C0217c m8787M(C0217c c0217c) {
        return m8730v0(AccessibilityNodeInfo.obtain(c0217c.f689a));
    }

    /* renamed from: P */
    private void m8784P(View view) {
        SparseArray<WeakReference<ClickableSpan>> m8733u = m8733u(view);
        if (m8733u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m8733u.size(); i++) {
                if (m8733u.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m8733u.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: R */
    private void m8782R(int i, boolean z) {
        Bundle m8739r = m8739r();
        if (m8739r != null) {
            int i2 = m8739r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            m8739r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: d */
    private void m8767d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m8763f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f689a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f689a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f689a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f689a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: g */
    private List<Integer> m8761g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f689a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f689a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: i */
    private static String m8757i(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: k */
    private boolean m8753k(int i) {
        Bundle m8739r = m8739r();
        return m8739r != null && (m8739r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: p */
    public static ClickableSpan[] m8743p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: s */
    private SparseArray<WeakReference<ClickableSpan>> m8737s(View view) {
        SparseArray<WeakReference<ClickableSpan>> m8733u = m8733u(view);
        if (m8733u == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(C0120b.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m8733u;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m8733u(View view) {
        return (SparseArray) view.getTag(C0120b.tag_accessibility_clickable_spans);
    }

    /* renamed from: v0 */
    public static C0217c m8730v0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0217c(accessibilityNodeInfo);
    }

    /* renamed from: x */
    private boolean m8728x() {
        return !m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y */
    private int m8727y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f688d;
        f688d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean m8799A() {
        return this.f689a.isChecked();
    }

    /* renamed from: B */
    public boolean m8798B() {
        return this.f689a.isClickable();
    }

    /* renamed from: C */
    public boolean m8797C() {
        return this.f689a.isEnabled();
    }

    /* renamed from: D */
    public boolean m8796D() {
        return this.f689a.isFocusable();
    }

    /* renamed from: E */
    public boolean m8795E() {
        return this.f689a.isFocused();
    }

    /* renamed from: F */
    public boolean m8794F() {
        return this.f689a.isLongClickable();
    }

    /* renamed from: G */
    public boolean m8793G() {
        return this.f689a.isPassword();
    }

    /* renamed from: H */
    public boolean m8792H() {
        return this.f689a.isScrollable();
    }

    /* renamed from: I */
    public boolean m8791I() {
        return this.f689a.isSelected();
    }

    /* renamed from: J */
    public boolean m8790J() {
        return Build.VERSION.SDK_INT >= 26 ? this.f689a.isShowingHintText() : m8753k(4);
    }

    /* renamed from: N */
    public boolean m8786N(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f689a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: O */
    public void m8785O() {
        this.f689a.recycle();
    }

    /* renamed from: Q */
    public void m8783Q(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f689a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: S */
    public void m8781S(Rect rect) {
        this.f689a.setBoundsInParent(rect);
    }

    /* renamed from: T */
    public void m8780T(Rect rect) {
        this.f689a.setBoundsInScreen(rect);
    }

    /* renamed from: U */
    public void m8779U(boolean z) {
        this.f689a.setCheckable(z);
    }

    /* renamed from: V */
    public void m8778V(boolean z) {
        this.f689a.setChecked(z);
    }

    /* renamed from: W */
    public void m8777W(CharSequence charSequence) {
        this.f689a.setClassName(charSequence);
    }

    /* renamed from: X */
    public void m8776X(boolean z) {
        this.f689a.setClickable(z);
    }

    /* renamed from: Y */
    public void m8775Y(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f689a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0219b) obj).f704a);
        }
    }

    /* renamed from: Z */
    public void m8774Z(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f689a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0220c) obj).f705a);
        }
    }

    /* renamed from: a */
    public void m8773a(int i) {
        this.f689a.addAction(i);
    }

    /* renamed from: a0 */
    public void m8772a0(CharSequence charSequence) {
        this.f689a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void m8771b(C0218a c0218a) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f689a.addAction((AccessibilityNodeInfo.AccessibilityAction) c0218a.f700a);
        }
    }

    /* renamed from: b0 */
    public void m8770b0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f689a.setContentInvalid(z);
        }
    }

    /* renamed from: c */
    public void m8769c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f689a.addChild(view, i);
        }
    }

    /* renamed from: c0 */
    public void m8768c0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f689a.setDismissable(z);
        }
    }

    /* renamed from: d0 */
    public void m8766d0(boolean z) {
        this.f689a.setEnabled(z);
    }

    /* renamed from: e */
    public void m8765e(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        m8763f();
        m8784P(view);
        ClickableSpan[] m8743p = m8743p(charSequence);
        if (m8743p == null || m8743p.length <= 0) {
            return;
        }
        m8739r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0120b.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> m8737s = m8737s(view);
        for (int i2 = 0; m8743p != null && i2 < m8743p.length; i2++) {
            int m8727y = m8727y(m8743p[i2], m8737s);
            m8737s.put(m8727y, new WeakReference<>(m8743p[i2]));
            m8767d(m8743p[i2], (Spanned) charSequence, m8727y);
        }
    }

    /* renamed from: e0 */
    public void m8764e0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f689a.setError(charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0217c)) {
            C0217c c0217c = (C0217c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f689a;
            if (accessibilityNodeInfo == null) {
                if (c0217c.f689a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(c0217c.f689a)) {
                return false;
            }
            return this.f691c == c0217c.f691c && this.f690b == c0217c.f690b;
        }
        return false;
    }

    /* renamed from: f0 */
    public void m8762f0(boolean z) {
        this.f689a.setFocusable(z);
    }

    /* renamed from: g0 */
    public void m8760g0(boolean z) {
        this.f689a.setFocused(z);
    }

    /* renamed from: h */
    public List<C0218a> m8759h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f689a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C0218a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: h0 */
    public void m8758h0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f689a.setHeading(z);
        } else {
            m8782R(2, z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f689a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void m8756i0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f689a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f689a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: j */
    public int m8755j() {
        return this.f689a.getActions();
    }

    /* renamed from: j0 */
    public void m8754j0(CharSequence charSequence) {
        this.f689a.setPackageName(charSequence);
    }

    /* renamed from: k0 */
    public void m8752k0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f689a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f689a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: l */
    public void m8751l(Rect rect) {
        this.f689a.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void m8750l0(View view) {
        this.f690b = -1;
        this.f689a.setParent(view);
    }

    /* renamed from: m */
    public void m8749m(Rect rect) {
        this.f689a.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void m8748m0(View view, int i) {
        this.f690b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f689a.setParent(view, i);
        }
    }

    /* renamed from: n */
    public int m8747n() {
        return this.f689a.getChildCount();
    }

    /* renamed from: n0 */
    public void m8746n0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f689a.setScreenReaderFocusable(z);
        } else {
            m8782R(1, z);
        }
    }

    /* renamed from: o */
    public CharSequence m8745o() {
        return this.f689a.getClassName();
    }

    /* renamed from: o0 */
    public void m8744o0(boolean z) {
        this.f689a.setScrollable(z);
    }

    /* renamed from: p0 */
    public void m8742p0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f689a.setShowingHintText(z);
        } else {
            m8782R(4, z);
        }
    }

    /* renamed from: q */
    public CharSequence m8741q() {
        return this.f689a.getContentDescription();
    }

    /* renamed from: q0 */
    public void m8740q0(View view, int i) {
        this.f691c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f689a.setSource(view, i);
        }
    }

    /* renamed from: r */
    public Bundle m8739r() {
        return Build.VERSION.SDK_INT >= 19 ? this.f689a.getExtras() : new Bundle();
    }

    /* renamed from: r0 */
    public void m8738r0(CharSequence charSequence) {
        if (C0143a.m8970a()) {
            this.f689a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f689a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: s0 */
    public void m8736s0(CharSequence charSequence) {
        this.f689a.setText(charSequence);
    }

    /* renamed from: t */
    public CharSequence m8735t() {
        return this.f689a.getPackageName();
    }

    /* renamed from: t0 */
    public void m8734t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f689a.setVisibleToUser(z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m8751l(rect);
        sb.append("; boundsInParent: " + rect);
        m8749m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m8735t());
        sb.append("; className: ");
        sb.append(m8745o());
        sb.append("; text: ");
        sb.append(m8731v());
        sb.append("; contentDescription: ");
        sb.append(m8741q());
        sb.append("; viewId: ");
        sb.append(m8729w());
        sb.append("; checkable: ");
        sb.append(m8726z());
        sb.append("; checked: ");
        sb.append(m8799A());
        sb.append("; focusable: ");
        sb.append(m8796D());
        sb.append("; focused: ");
        sb.append(m8795E());
        sb.append("; selected: ");
        sb.append(m8791I());
        sb.append("; clickable: ");
        sb.append(m8798B());
        sb.append("; longClickable: ");
        sb.append(m8794F());
        sb.append("; enabled: ");
        sb.append(m8797C());
        sb.append("; password: ");
        sb.append(m8793G());
        sb.append("; scrollable: " + m8792H());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0218a> m8759h = m8759h();
            for (int i = 0; i < m8759h.size(); i++) {
                C0218a c0218a = m8759h.get(i);
                String m8757i = m8757i(c0218a.m8724b());
                if (m8757i.equals("ACTION_UNKNOWN") && c0218a.m8723c() != null) {
                    m8757i = c0218a.m8723c().toString();
                }
                sb.append(m8757i);
                if (i != m8759h.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int m8755j = m8755j();
            while (m8755j != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m8755j);
                m8755j &= ~numberOfTrailingZeros;
                sb.append(m8757i(numberOfTrailingZeros));
                if (m8755j != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public AccessibilityNodeInfo m8732u0() {
        return this.f689a;
    }

    /* renamed from: v */
    public CharSequence m8731v() {
        if (m8728x()) {
            List<Integer> m8761g = m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m8761g2 = m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m8761g3 = m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m8761g4 = m8761g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f689a.getText(), 0, this.f689a.getText().length()));
            for (int i = 0; i < m8761g.size(); i++) {
                spannableString.setSpan(new C0215a(m8761g4.get(i).intValue(), this, m8739r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m8761g.get(i).intValue(), m8761g2.get(i).intValue(), m8761g3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f689a.getText();
    }

    /* renamed from: w */
    public String m8729w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f689a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: z */
    public boolean m8726z() {
        return this.f689a.isCheckable();
    }
}
