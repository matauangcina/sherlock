package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import androidx.savedstate.InterfaceC1069b;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0873h {

    /* renamed from: a */
    private final String f3115a;

    /* renamed from: b */
    private boolean f3116b;

    /* renamed from: c */
    private final C0888s f3117c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C0861a implements SavedStateRegistry.InterfaceC1066a {
        C0861a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1066a
        /* renamed from: a */
        public void mo5056a(InterfaceC1069b interfaceC1069b) {
            if (!(interfaceC1069b instanceof InterfaceC0895w)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            C0894v mo6025f = ((InterfaceC0895w) interfaceC1069b).mo6025f();
            SavedStateRegistry mo5050j = interfaceC1069b.mo5050j();
            for (String str : mo6025f.m6077c()) {
                SavedStateHandleController.m6149h(mo6025f.m6078b(str), mo5050j, interfaceC1069b.mo698a());
            }
            if (mo6025f.m6077c().isEmpty()) {
                return;
            }
            mo5050j.m5057e(C0861a.class);
        }
    }

    /* renamed from: h */
    static void m6149h(AbstractC0889t abstractC0889t, SavedStateRegistry savedStateRegistry, AbstractC0868e abstractC0868e) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0889t.m6084c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m6147j()) {
            return;
        }
        savedStateHandleController.m6148i(savedStateRegistry, abstractC0868e);
        m6146k(savedStateRegistry, abstractC0868e);
    }

    /* renamed from: k */
    private static void m6146k(final SavedStateRegistry savedStateRegistry, final AbstractC0868e abstractC0868e) {
        AbstractC0868e.EnumC0870b mo6123b = abstractC0868e.mo6123b();
        if (mo6123b == AbstractC0868e.EnumC0870b.INITIALIZED || mo6123b.m6128d(AbstractC0868e.EnumC0870b.STARTED)) {
            savedStateRegistry.m5057e(C0861a.class);
        } else {
            abstractC0868e.mo6124a(new InterfaceC0873h() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0873h
                /* renamed from: d */
                public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
                    if (enumC0869a == AbstractC0868e.EnumC0869a.ON_START) {
                        AbstractC0868e.this.mo6122c(this);
                        savedStateRegistry.m5057e(C0861a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        if (enumC0869a == AbstractC0868e.EnumC0869a.ON_DESTROY) {
            this.f3116b = false;
            interfaceC0875j.mo698a().mo6122c(this);
        }
    }

    /* renamed from: i */
    void m6148i(SavedStateRegistry savedStateRegistry, AbstractC0868e abstractC0868e) {
        if (this.f3116b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3116b = true;
        abstractC0868e.mo6124a(this);
        savedStateRegistry.m5058d(this.f3115a, this.f3117c.m6087a());
    }

    /* renamed from: j */
    boolean m6147j() {
        return this.f3116b;
    }
}
