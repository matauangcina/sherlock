package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0868e;
/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C1068a {

    /* renamed from: a */
    private final InterfaceC1069b f3697a;

    /* renamed from: b */
    private final SavedStateRegistry f3698b = new SavedStateRegistry();

    private C1068a(InterfaceC1069b interfaceC1069b) {
        this.f3697a = interfaceC1069b;
    }

    /* renamed from: a */
    public static C1068a m5054a(InterfaceC1069b interfaceC1069b) {
        return new C1068a(interfaceC1069b);
    }

    /* renamed from: b */
    public SavedStateRegistry m5053b() {
        return this.f3698b;
    }

    /* renamed from: c */
    public void m5052c(Bundle bundle) {
        AbstractC0868e mo698a = this.f3697a.mo698a();
        if (mo698a.mo6123b() != AbstractC0868e.EnumC0870b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo698a.mo6124a(new Recreator(this.f3697a));
        this.f3698b.m5060b(mo698a, bundle);
    }

    /* renamed from: d */
    public void m5051d(Bundle bundle) {
        this.f3698b.m5059c(bundle);
    }
}
