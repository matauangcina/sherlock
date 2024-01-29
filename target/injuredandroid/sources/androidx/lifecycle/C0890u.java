package androidx.lifecycle;
/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public class C0890u {

    /* renamed from: a */
    private final InterfaceC0891a f3151a;

    /* renamed from: b */
    private final C0894v f3152b;

    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0891a {
        /* renamed from: a */
        <T extends AbstractC0889t> T mo5986a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.u$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0892b extends C0893c implements InterfaceC0891a {
        AbstractC0892b() {
        }

        @Override // androidx.lifecycle.C0890u.InterfaceC0891a
        /* renamed from: a */
        public <T extends AbstractC0889t> T mo5986a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC0889t> T m6081c(String str, Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.u$c */
    /* loaded from: classes.dex */
    public static class C0893c {
        C0893c() {
        }

        /* renamed from: b */
        void m6080b(AbstractC0889t abstractC0889t) {
        }
    }

    public C0890u(C0894v c0894v, InterfaceC0891a interfaceC0891a) {
        this.f3151a = interfaceC0891a;
        this.f3152b = c0894v;
    }

    /* renamed from: a */
    public <T extends AbstractC0889t> T m6083a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m6082b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC0889t> T m6082b(String str, Class<T> cls) {
        T t = (T) this.f3152b.m6078b(str);
        if (cls.isInstance(t)) {
            InterfaceC0891a interfaceC0891a = this.f3151a;
            if (interfaceC0891a instanceof C0893c) {
                ((C0893c) interfaceC0891a).m6080b(t);
            }
            return t;
        }
        InterfaceC0891a interfaceC0891a2 = this.f3151a;
        T t2 = interfaceC0891a2 instanceof AbstractC0892b ? (T) ((AbstractC0892b) interfaceC0891a2).m6081c(str, cls) : (T) interfaceC0891a2.mo5986a(cls);
        this.f3152b.m6076d(str, t2);
        return t2;
    }
}
