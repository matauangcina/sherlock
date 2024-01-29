package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0873h {

    /* renamed from: a */
    private final InterfaceC0867d[] f3089a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(InterfaceC0867d[] interfaceC0867dArr) {
        this.f3089a = interfaceC0867dArr;
    }

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        C0881n c0881n = new C0881n();
        for (InterfaceC0867d interfaceC0867d : this.f3089a) {
            interfaceC0867d.m6129a(interfaceC0875j, enumC0869a, false, c0881n);
        }
        for (InterfaceC0867d interfaceC0867d2 : this.f3089a) {
            interfaceC0867d2.m6129a(interfaceC0875j, enumC0869a, true, c0881n);
        }
    }
}
