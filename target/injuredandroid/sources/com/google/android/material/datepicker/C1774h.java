package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C1045h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p000a.p019g.p027j.C0190e;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.C1345g;
import p054b.p059c.p060a.p075b.C1346h;
import p054b.p059c.p060a.p075b.C1347i;
/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C1774h<S> extends AbstractC1802p<S> {

    /* renamed from: m0 */
    static final Object f5209m0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n0 */
    static final Object f5210n0 = "NAVIGATION_PREV_TAG";

    /* renamed from: o0 */
    static final Object f5211o0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: p0 */
    static final Object f5212p0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0 */
    private int f5213c0;

    /* renamed from: d0 */
    private InterfaceC1769d<S> f5214d0;

    /* renamed from: e0 */
    private C1763a f5215e0;

    /* renamed from: f0 */
    private C1795l f5216f0;

    /* renamed from: g0 */
    private EnumC1785k f5217g0;

    /* renamed from: h0 */
    private C1768c f5218h0;

    /* renamed from: i0 */
    private RecyclerView f5219i0;

    /* renamed from: j0 */
    private RecyclerView f5220j0;

    /* renamed from: k0 */
    private View f5221k0;

    /* renamed from: l0 */
    private View f5222l0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$a */
    /* loaded from: classes.dex */
    public class RunnableC1775a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f5223f;

        RunnableC1775a(int i) {
            this.f5223f = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1774h.this.f5220j0.smoothScrollToPosition(this.f5223f);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* loaded from: classes.dex */
    class C1776b extends C0195a {
        C1776b(C1774h c1774h) {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            c0217c.m8775Y(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    /* loaded from: classes.dex */
    class C1777c extends C1803q {

        /* renamed from: I */
        final /* synthetic */ int f5225I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1777c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f5225I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: M1 */
        protected void mo3039M1(RecyclerView.C0968a0 c0968a0, int[] iArr) {
            if (this.f5225I == 0) {
                iArr[0] = C1774h.this.f5220j0.getWidth();
                iArr[1] = C1774h.this.f5220j0.getWidth();
                return;
            }
            iArr[0] = C1774h.this.f5220j0.getHeight();
            iArr[1] = C1774h.this.f5220j0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    /* loaded from: classes.dex */
    class C1778d implements InterfaceC1786l {
        C1778d() {
        }

        @Override // com.google.android.material.datepicker.C1774h.InterfaceC1786l
        /* renamed from: a */
        public void mo3035a(long j) {
            if (C1774h.this.f5215e0.m3091j().mo3064g(j)) {
                C1774h.this.f5214d0.m3071s(j);
                Iterator<InterfaceC1801o<S>> it = C1774h.this.f5289b0.iterator();
                while (it.hasNext()) {
                    it.next().mo2977a((S) C1774h.this.f5214d0.m3072m());
                }
                C1774h.this.f5220j0.getAdapter().m5687h();
                if (C1774h.this.f5219i0 != null) {
                    C1774h.this.f5219i0.getAdapter().m5687h();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$e */
    /* loaded from: classes.dex */
    public class C1779e extends RecyclerView.AbstractC0987n {

        /* renamed from: a */
        private final Calendar f5228a = C1805r.m2962k();

        /* renamed from: b */
        private final Calendar f5229b = C1805r.m2962k();

        C1779e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0987n
        /* renamed from: g */
        public void mo3038g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0968a0 c0968a0) {
            if ((recyclerView.getAdapter() instanceof C1806s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C1806s c1806s = (C1806s) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0190e<Long, Long> c0190e : C1774h.this.f5214d0.m3075f()) {
                    Long l = c0190e.f642a;
                    if (l != null && c0190e.f643b != null) {
                        this.f5228a.setTimeInMillis(l.longValue());
                        this.f5229b.setTimeInMillis(c0190e.f643b.longValue());
                        int m2952w = c1806s.m2952w(this.f5228a.get(1));
                        int m2952w2 = c1806s.m2952w(this.f5229b.get(1));
                        View mo5646C = gridLayoutManager.mo5646C(m2952w);
                        View mo5646C2 = gridLayoutManager.mo5646C(m2952w2);
                        int m5833X2 = m2952w / gridLayoutManager.m5833X2();
                        int m5833X22 = m2952w2 / gridLayoutManager.m5833X2();
                        int i = m5833X2;
                        while (i <= m5833X22) {
                            View mo5646C3 = gridLayoutManager.mo5646C(gridLayoutManager.m5833X2() * i);
                            if (mo5646C3 != null) {
                                canvas.drawRect(i == m5833X2 ? mo5646C.getLeft() + (mo5646C.getWidth() / 2) : 0, mo5646C3.getTop() + C1774h.this.f5218h0.f5199d.m3079c(), i == m5833X22 ? mo5646C2.getLeft() + (mo5646C2.getWidth() / 2) : recyclerView.getWidth(), mo5646C3.getBottom() - C1774h.this.f5218h0.f5199d.m3080b(), C1774h.this.f5218h0.f5203h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$f */
    /* loaded from: classes.dex */
    public class C1780f extends C0195a {
        C1780f() {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            C1774h c1774h;
            int i;
            super.mo2517g(view, c0217c);
            if (C1774h.this.f5222l0.getVisibility() == 0) {
                c1774h = C1774h.this;
                i = C1347i.mtrl_picker_toggle_to_year_selection;
            } else {
                c1774h = C1774h.this;
                i = C1347i.mtrl_picker_toggle_to_day_selection;
            }
            c0217c.m8756i0(c1774h.m6603K(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$g */
    /* loaded from: classes.dex */
    public class C1781g extends RecyclerView.AbstractC0997t {

        /* renamed from: a */
        final /* synthetic */ C1798n f5232a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f5233b;

        C1781g(C1798n c1798n, MaterialButton materialButton) {
            this.f5232a = c1798n;
            this.f5233b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0997t
        /* renamed from: a */
        public void mo3037a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f5233b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0997t
        /* renamed from: b */
        public void mo3036b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager m3053G1 = C1774h.this.m3053G1();
            int m5789Z1 = i < 0 ? m3053G1.m5789Z1() : m3053G1.m5786c2();
            C1774h.this.f5216f0 = this.f5232a.m2982v(m5789Z1);
            this.f5233b.setText(this.f5232a.m2981w(m5789Z1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1782h implements View.OnClickListener {
        View$OnClickListenerC1782h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1774h.this.m3048L1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$i */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1783i implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1798n f5236f;

        View$OnClickListenerC1783i(C1798n c1798n) {
            this.f5236f = c1798n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m5789Z1 = C1774h.this.m3053G1().m5789Z1() + 1;
            if (m5789Z1 < C1774h.this.f5220j0.getAdapter().mo2957c()) {
                C1774h.this.m3050J1(this.f5236f.m2982v(m5789Z1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$j */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1784j implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1798n f5238f;

        View$OnClickListenerC1784j(C1798n c1798n) {
            this.f5238f = c1798n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m5786c2 = C1774h.this.m3053G1().m5786c2() - 1;
            if (m5786c2 >= 0) {
                C1774h.this.m3050J1(this.f5238f.m2982v(m5786c2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$k */
    /* loaded from: classes.dex */
    public enum EnumC1785k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$l */
    /* loaded from: classes.dex */
    public interface InterfaceC1786l {
        /* renamed from: a */
        void mo3035a(long j);
    }

    /* renamed from: A1 */
    private RecyclerView.AbstractC0987n m3059A1() {
        return new C1779e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F1 */
    public static int m3054F1(Context context) {
        return context.getResources().getDimensionPixelSize(C1342d.mtrl_calendar_day_height);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H1 */
    public static <T> C1774h<T> m3052H1(InterfaceC1769d<T> interfaceC1769d, int i, C1763a c1763a) {
        C1774h<T> c1774h = new C1774h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC1769d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1763a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c1763a.m3088o());
        c1774h.m6556j1(bundle);
        return c1774h;
    }

    /* renamed from: I1 */
    private void m3051I1(int i) {
        this.f5220j0.post(new RunnableC1775a(i));
    }

    /* renamed from: z1 */
    private void m3040z1(View view, C1798n c1798n) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C1344f.month_navigation_fragment_toggle);
        materialButton.setTag(f5212p0);
        C0252s.m8625f0(materialButton, new C1780f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C1344f.month_navigation_previous);
        materialButton2.setTag(f5210n0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C1344f.month_navigation_next);
        materialButton3.setTag(f5211o0);
        this.f5221k0 = view.findViewById(C1344f.mtrl_calendar_year_selector_frame);
        this.f5222l0 = view.findViewById(C1344f.mtrl_calendar_day_selector_frame);
        m3049K1(EnumC1785k.DAY);
        materialButton.setText(this.f5216f0.m3005B());
        this.f5220j0.addOnScrollListener(new C1781g(c1798n, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC1782h());
        materialButton3.setOnClickListener(new View$OnClickListenerC1783i(c1798n));
        materialButton2.setOnClickListener(new View$OnClickListenerC1784j(c1798n));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public void mo3010A0(Bundle bundle) {
        super.mo3010A0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5213c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f5214d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5215e0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5216f0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B1 */
    public C1763a m3058B1() {
        return this.f5215e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C1 */
    public C1768c m3057C1() {
        return this.f5218h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D1 */
    public C1795l m3056D1() {
        return this.f5216f0;
    }

    /* renamed from: E1 */
    public InterfaceC1769d<S> m3055E1() {
        return this.f5214d0;
    }

    /* renamed from: G1 */
    LinearLayoutManager m3053G1() {
        return (LinearLayoutManager) this.f5220j0.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void m3050J1(C1795l c1795l) {
        RecyclerView recyclerView;
        int i;
        C1798n c1798n = (C1798n) this.f5220j0.getAdapter();
        int m2980x = c1798n.m2980x(c1795l);
        int m2980x2 = m2980x - c1798n.m2980x(this.f5216f0);
        boolean z = Math.abs(m2980x2) > 3;
        boolean z2 = m2980x2 > 0;
        this.f5216f0 = c1795l;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f5220j0;
                i = m2980x + 3;
            }
            m3051I1(m2980x);
        }
        recyclerView = this.f5220j0;
        i = m2980x - 3;
        recyclerView.scrollToPosition(i);
        m3051I1(m2980x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K1 */
    public void m3049K1(EnumC1785k enumC1785k) {
        this.f5217g0 = enumC1785k;
        if (enumC1785k == EnumC1785k.YEAR) {
            this.f5219i0.getLayoutManager().mo5376x1(((C1806s) this.f5219i0.getAdapter()).m2952w(this.f5216f0.f5272i));
            this.f5221k0.setVisibility(0);
            this.f5222l0.setVisibility(8);
        } else if (enumC1785k == EnumC1785k.DAY) {
            this.f5221k0.setVisibility(8);
            this.f5222l0.setVisibility(0);
            m3050J1(this.f5216f0);
        }
    }

    /* renamed from: L1 */
    void m3048L1() {
        EnumC1785k enumC1785k;
        EnumC1785k enumC1785k2 = this.f5217g0;
        if (enumC1785k2 == EnumC1785k.YEAR) {
            enumC1785k = EnumC1785k.DAY;
        } else if (enumC1785k2 != EnumC1785k.DAY) {
            return;
        } else {
            enumC1785k = EnumC1785k.YEAR;
        }
        m3049K1(enumC1785k);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public void mo3009e0(Bundle bundle) {
        super.mo3009e0(bundle);
        if (bundle == null) {
            bundle = m6543p();
        }
        this.f5213c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f5214d0 = (InterfaceC1769d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f5215e0 = (C1763a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5216f0 = (C1795l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i0 */
    public View mo3008i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m6539r(), this.f5213c0);
        this.f5218h0 = new C1768c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C1795l m3087p = this.f5215e0.m3087p();
        if (C1787i.m3017Q1(contextThemeWrapper)) {
            i = C1346h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C1346h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C1344f.mtrl_calendar_days_of_week);
        C0252s.m8625f0(gridView, new C1776b(this));
        gridView.setAdapter((ListAdapter) new C1773g());
        gridView.setNumColumns(m3087p.f5273j);
        gridView.setEnabled(false);
        this.f5220j0 = (RecyclerView) inflate.findViewById(C1344f.mtrl_calendar_months);
        this.f5220j0.setLayoutManager(new C1777c(m6539r(), i2, false, i2));
        this.f5220j0.setTag(f5209m0);
        C1798n c1798n = new C1798n(contextThemeWrapper, this.f5214d0, this.f5215e0, new C1778d());
        this.f5220j0.setAdapter(c1798n);
        int integer = contextThemeWrapper.getResources().getInteger(C1345g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1344f.mtrl_calendar_year_selector_frame);
        this.f5219i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5219i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f5219i0.setAdapter(new C1806s(this));
            this.f5219i0.addItemDecoration(m3059A1());
        }
        if (inflate.findViewById(C1344f.month_navigation_fragment_toggle) != null) {
            m3040z1(inflate, c1798n);
        }
        if (!C1787i.m3017Q1(contextThemeWrapper)) {
            new C1045h().m5111b(this.f5220j0);
        }
        this.f5220j0.scrollToPosition(c1798n.m2980x(this.f5216f0));
        return inflate;
    }
}
