package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.AbstractC0952r;
@AbstractC0952r.InterfaceC0954b("navigation")
/* renamed from: androidx.navigation.l */
/* loaded from: classes.dex */
public class C0929l extends AbstractC0952r<C0927k> {

    /* renamed from: a */
    private final C0955s f3255a;

    public C0929l(C0955s c0955s) {
        this.f3255a = c0955s;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: e */
    public boolean mo5851e() {
        return true;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: f */
    public C0927k mo5855a() {
        return new C0927k(this);
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: g */
    public C0925j mo5854b(C0927k c0927k, Bundle bundle, C0932o c0932o, AbstractC0952r.InterfaceC0953a interfaceC0953a) {
        int m5945I = c0927k.m5945I();
        if (m5945I == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + c0927k.mo5943l());
        }
        C0925j m5947G = c0927k.m5947G(m5945I, false);
        if (m5947G != null) {
            return this.f3255a.m5846e(m5947G.m5955u()).mo5854b(m5947G, m5947G.m5960f(bundle), c0932o, interfaceC0953a);
        }
        String m5946H = c0927k.m5946H();
        throw new IllegalArgumentException("navigation destination " + m5946H + " is not a direct child of this NavGraph");
    }
}
