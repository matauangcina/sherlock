package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public abstract class AbstractC1802p<S> extends Fragment {

    /* renamed from: b0 */
    protected final LinkedHashSet<InterfaceC1801o<S>> f5289b0 = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public boolean m2976q1(InterfaceC1801o<S> interfaceC1801o) {
        return this.f5289b0.add(interfaceC1801o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void m2975r1() {
        this.f5289b0.clear();
    }
}
