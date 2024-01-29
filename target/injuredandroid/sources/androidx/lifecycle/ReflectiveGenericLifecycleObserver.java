package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0862a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0873h {

    /* renamed from: a */
    private final Object f3113a;

    /* renamed from: b */
    private final C0862a.C0863a f3114b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3113a = obj;
        this.f3114b = C0862a.f3121c.m6143c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        this.f3114b.m6140a(interfaceC0875j, enumC0869a, this.f3113a);
    }
}
