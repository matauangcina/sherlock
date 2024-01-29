package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p019g.p028k.p029b0.C0221d;
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C1051k extends C0195a {

    /* renamed from: d */
    final RecyclerView f3665d;

    /* renamed from: e */
    private final C1052a f3666e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public static class C1052a extends C0195a {

        /* renamed from: d */
        final C1051k f3667d;

        /* renamed from: e */
        private Map<View, C0195a> f3668e = new WeakHashMap();

        public C1052a(C1051k c1051k) {
            this.f3667d = c1051k;
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: a */
        public boolean mo5147a(View view, AccessibilityEvent accessibilityEvent) {
            C0195a c0195a = this.f3668e.get(view);
            return c0195a != null ? c0195a.mo5147a(view, accessibilityEvent) : super.mo5147a(view, accessibilityEvent);
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: b */
        public C0221d mo5146b(View view) {
            C0195a c0195a = this.f3668e.get(view);
            return c0195a != null ? c0195a.mo5146b(view) : super.mo5146b(view);
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: f */
        public void mo2807f(View view, AccessibilityEvent accessibilityEvent) {
            C0195a c0195a = this.f3668e.get(view);
            if (c0195a != null) {
                c0195a.mo2807f(view, accessibilityEvent);
            } else {
                super.mo2807f(view, accessibilityEvent);
            }
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            if (!this.f3667d.m5148o() && this.f3667d.f3665d.getLayoutManager() != null) {
                this.f3667d.f3665d.getLayoutManager().m5623O0(view, c0217c);
                C0195a c0195a = this.f3668e.get(view);
                if (c0195a != null) {
                    c0195a.mo2517g(view, c0217c);
                    return;
                }
            }
            super.mo2517g(view, c0217c);
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: h */
        public void mo2516h(View view, AccessibilityEvent accessibilityEvent) {
            C0195a c0195a = this.f3668e.get(view);
            if (c0195a != null) {
                c0195a.mo2516h(view, accessibilityEvent);
            } else {
                super.mo2516h(view, accessibilityEvent);
            }
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: i */
        public boolean mo5145i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0195a c0195a = this.f3668e.get(viewGroup);
            return c0195a != null ? c0195a.mo5145i(viewGroup, view, accessibilityEvent) : super.mo5145i(viewGroup, view, accessibilityEvent);
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: j */
        public boolean mo2659j(View view, int i, Bundle bundle) {
            if (this.f3667d.m5148o() || this.f3667d.f3665d.getLayoutManager() == null) {
                return super.mo2659j(view, i, bundle);
            }
            C0195a c0195a = this.f3668e.get(view);
            if (c0195a != null) {
                if (c0195a.mo2659j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2659j(view, i, bundle)) {
                return true;
            }
            return this.f3667d.f3665d.getLayoutManager().m5587i1(view, i, bundle);
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: l */
        public void mo5144l(View view, int i) {
            C0195a c0195a = this.f3668e.get(view);
            if (c0195a != null) {
                c0195a.mo5144l(view, i);
            } else {
                super.mo5144l(view, i);
            }
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: m */
        public void mo5143m(View view, AccessibilityEvent accessibilityEvent) {
            C0195a c0195a = this.f3668e.get(view);
            if (c0195a != null) {
                c0195a.mo5143m(view, accessibilityEvent);
            } else {
                super.mo5143m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C0195a m5142n(View view) {
            return this.f3668e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m5141o(View view) {
            C0195a m8622h = C0252s.m8622h(view);
            if (m8622h == null || m8622h == this) {
                return;
            }
            this.f3668e.put(view, m8622h);
        }
    }

    public C1051k(RecyclerView recyclerView) {
        this.f3665d = recyclerView;
        C0195a m5149n = m5149n();
        this.f3666e = (m5149n == null || !(m5149n instanceof C1052a)) ? new C1052a(this) : (C1052a) m5149n;
    }

    @Override // p000a.p019g.p028k.C0195a
    /* renamed from: f */
    public void mo2807f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2807f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m5148o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo5450K0(accessibilityEvent);
        }
    }

    @Override // p000a.p019g.p028k.C0195a
    /* renamed from: g */
    public void mo2517g(View view, C0217c c0217c) {
        super.mo2517g(view, c0217c);
        if (m5148o() || this.f3665d.getLayoutManager() == null) {
            return;
        }
        this.f3665d.getLayoutManager().m5626M0(c0217c);
    }

    @Override // p000a.p019g.p028k.C0195a
    /* renamed from: j */
    public boolean mo2659j(View view, int i, Bundle bundle) {
        if (super.mo2659j(view, i, bundle)) {
            return true;
        }
        if (m5148o() || this.f3665d.getLayoutManager() == null) {
            return false;
        }
        return this.f3665d.getLayoutManager().m5593g1(i, bundle);
    }

    /* renamed from: n */
    public C0195a m5149n() {
        return this.f3666e;
    }

    /* renamed from: o */
    boolean m5148o() {
        return this.f3665d.hasPendingAdapterUpdates();
    }
}
