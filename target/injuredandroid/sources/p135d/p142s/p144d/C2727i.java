package p135d.p142s.p144d;
/* renamed from: d.s.d.i */
/* loaded from: classes.dex */
public final class C2727i implements InterfaceC2720b {

    /* renamed from: a */
    private final Class<?> f6853a;

    public C2727i(Class<?> cls, String str) {
        C2725g.m881e(cls, "jClass");
        C2725g.m881e(str, "moduleName");
        this.f6853a = cls;
    }

    @Override // p135d.p142s.p144d.InterfaceC2720b
    /* renamed from: a */
    public Class<?> mo871a() {
        return this.f6853a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2727i) && C2725g.m885a(mo871a(), ((C2727i) obj).mo871a());
    }

    public int hashCode() {
        return mo871a().hashCode();
    }

    public String toString() {
        return mo871a().toString() + " (Kotlin reflection is not available)";
    }
}
