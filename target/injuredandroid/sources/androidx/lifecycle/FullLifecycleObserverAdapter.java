package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0873h {

    /* renamed from: a */
    private final InterfaceC0866c f3090a;

    /* renamed from: b */
    private final InterfaceC0873h f3091b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0858a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3092a;

        static {
            int[] iArr = new int[AbstractC0868e.EnumC0869a.values().length];
            f3092a = iArr;
            try {
                iArr[AbstractC0868e.EnumC0869a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3092a[AbstractC0868e.EnumC0869a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3092a[AbstractC0868e.EnumC0869a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3092a[AbstractC0868e.EnumC0869a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3092a[AbstractC0868e.EnumC0869a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3092a[AbstractC0868e.EnumC0869a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3092a[AbstractC0868e.EnumC0869a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(InterfaceC0866c interfaceC0866c, InterfaceC0873h interfaceC0873h) {
        this.f3090a = interfaceC0866c;
        this.f3091b = interfaceC0873h;
    }

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        switch (C0858a.f3092a[enumC0869a.ordinal()]) {
            case 1:
                this.f3090a.m6133c(interfaceC0875j);
                break;
            case 2:
                this.f3090a.m6131f(interfaceC0875j);
                break;
            case 3:
                this.f3090a.m6135a(interfaceC0875j);
                break;
            case 4:
                this.f3090a.m6132e(interfaceC0875j);
                break;
            case 5:
                this.f3090a.m6130g(interfaceC0875j);
                break;
            case 6:
                this.f3090a.m6134b(interfaceC0875j);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0873h interfaceC0873h = this.f3091b;
        if (interfaceC0873h != null) {
            interfaceC0873h.mo5007d(interfaceC0875j, enumC0869a);
        }
    }
}
