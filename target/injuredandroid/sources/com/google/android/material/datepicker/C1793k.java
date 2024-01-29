package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C1793k<S> extends AbstractC1802p<S> {

    /* renamed from: c0 */
    private InterfaceC1769d<S> f5266c0;

    /* renamed from: d0 */
    private C1763a f5267d0;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* loaded from: classes.dex */
    class C1794a implements InterfaceC1801o<S> {
        C1794a() {
        }

        @Override // com.google.android.material.datepicker.InterfaceC1801o
        /* renamed from: a */
        public void mo2977a(S s) {
            Iterator<InterfaceC1801o<S>> it = C1793k.this.f5289b0.iterator();
            while (it.hasNext()) {
                it.next().mo2977a(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1 */
    public static <T> C1793k<T> m3007s1(InterfaceC1769d<T> interfaceC1769d, C1763a c1763a) {
        C1793k<T> c1793k = new C1793k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", interfaceC1769d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1763a);
        c1793k.m6556j1(bundle);
        return c1793k;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public void mo3010A0(Bundle bundle) {
        super.mo3010A0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5266c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5267d0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public void mo3009e0(Bundle bundle) {
        super.mo3009e0(bundle);
        if (bundle == null) {
            bundle = m6543p();
        }
        this.f5266c0 = (InterfaceC1769d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5267d0 = (C1763a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i0 */
    public View mo3008i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f5266c0.m3070u(layoutInflater, viewGroup, bundle, this.f5267d0, new C1794a());
    }
}
