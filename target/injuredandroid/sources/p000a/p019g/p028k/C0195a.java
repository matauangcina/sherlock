package p000a.p019g.p028k;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p000a.p019g.C0120b;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p019g.p028k.p029b0.C0221d;
/* renamed from: a.g.k.a */
/* loaded from: classes.dex */
public class C0195a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f647c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f648a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f649b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.a$a */
    /* loaded from: classes.dex */
    public static final class C0196a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0195a f650a;

        C0196a(C0195a c0195a) {
            this.f650a = c0195a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f650a.mo5147a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0221d mo5146b = this.f650a.mo5146b(view);
            if (mo5146b != null) {
                return (AccessibilityNodeProvider) mo5146b.m8717e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f650a.mo2807f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0217c m8730v0 = C0217c.m8730v0(accessibilityNodeInfo);
            m8730v0.m8746n0(C0252s.m8647P(view));
            m8730v0.m8758h0(C0252s.m8652K(view));
            m8730v0.m8752k0(C0252s.m8614l(view));
            m8730v0.m8738r0(C0252s.m8659D(view));
            this.f650a.mo2517g(view, m8730v0);
            m8730v0.m8765e(accessibilityNodeInfo.getText(), view);
            List<C0217c.C0218a> m8864c = C0195a.m8864c(view);
            for (int i = 0; i < m8864c.size(); i++) {
                m8730v0.m8771b(m8864c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f650a.mo2516h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f650a.mo5145i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f650a.mo2659j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f650a.mo5144l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f650a.mo5143m(view, accessibilityEvent);
        }
    }

    public C0195a() {
        this(f647c);
    }

    public C0195a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f648a = accessibilityDelegate;
        this.f649b = new C0196a(this);
    }

    /* renamed from: c */
    static List<C0217c.C0218a> m8864c(View view) {
        List<C0217c.C0218a> list = (List) view.getTag(C0120b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m8862e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m8743p = C0217c.m8743p(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; m8743p != null && i < m8743p.length; i++) {
                if (clickableSpan.equals(m8743p[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m8861k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C0120b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (m8862e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5147a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f648a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0221d mo5146b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f648a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0221d(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate m8863d() {
        return this.f649b;
    }

    /* renamed from: f */
    public void mo2807f(View view, AccessibilityEvent accessibilityEvent) {
        this.f648a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2517g(View view, C0217c c0217c) {
        this.f648a.onInitializeAccessibilityNodeInfo(view, c0217c.m8732u0());
    }

    /* renamed from: h */
    public void mo2516h(View view, AccessibilityEvent accessibilityEvent) {
        this.f648a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo5145i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f648a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2659j(View view, int i, Bundle bundle) {
        List<C0217c.C0218a> m8864c = m8864c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= m8864c.size()) {
                break;
            }
            C0217c.C0218a c0218a = m8864c.get(i2);
            if (c0218a.m8724b() == i) {
                z = c0218a.m8722d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f648a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C0120b.accessibility_action_clickable_span) ? z : m8861k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo5144l(View view, int i) {
        this.f648a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo5143m(View view, AccessibilityEvent accessibilityEvent) {
        this.f648a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
