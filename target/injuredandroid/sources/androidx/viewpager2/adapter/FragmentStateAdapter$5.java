package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0873h {

    /* renamed from: a */
    final /* synthetic */ Handler f3713a;

    /* renamed from: b */
    final /* synthetic */ Runnable f3714b;

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        if (enumC0869a == AbstractC0868e.EnumC0869a.ON_DESTROY) {
            this.f3713a.removeCallbacks(this.f3714b);
            interfaceC0875j.mo698a().mo6122c(this);
        }
    }
}
