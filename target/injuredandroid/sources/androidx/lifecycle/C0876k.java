package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000a.p008b.p009a.p011b.C0047a;
import p000a.p008b.p009a.p011b.C0048b;
/* renamed from: androidx.lifecycle.k */
/* loaded from: classes.dex */
public class C0876k extends AbstractC0868e {

    /* renamed from: c */
    private final WeakReference<InterfaceC0875j> f3138c;

    /* renamed from: a */
    private C0047a<InterfaceC0874i, C0878b> f3136a = new C0047a<>();

    /* renamed from: d */
    private int f3139d = 0;

    /* renamed from: e */
    private boolean f3140e = false;

    /* renamed from: f */
    private boolean f3141f = false;

    /* renamed from: g */
    private ArrayList<AbstractC0868e.EnumC0870b> f3142g = new ArrayList<>();

    /* renamed from: b */
    private AbstractC0868e.EnumC0870b f3137b = AbstractC0868e.EnumC0870b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0877a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3143a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3144b;

        static {
            int[] iArr = new int[AbstractC0868e.EnumC0870b.values().length];
            f3144b = iArr;
            try {
                iArr[AbstractC0868e.EnumC0870b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3144b[AbstractC0868e.EnumC0870b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3144b[AbstractC0868e.EnumC0870b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3144b[AbstractC0868e.EnumC0870b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3144b[AbstractC0868e.EnumC0870b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[AbstractC0868e.EnumC0869a.values().length];
            f3143a = iArr2;
            try {
                iArr2[AbstractC0868e.EnumC0869a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3143a[AbstractC0868e.EnumC0869a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3143a[AbstractC0868e.EnumC0869a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3143a[AbstractC0868e.EnumC0869a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3143a[AbstractC0868e.EnumC0869a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3143a[AbstractC0868e.EnumC0869a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3143a[AbstractC0868e.EnumC0869a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.k$b */
    /* loaded from: classes.dex */
    public static class C0878b {

        /* renamed from: a */
        AbstractC0868e.EnumC0870b f3145a;

        /* renamed from: b */
        InterfaceC0873h f3146b;

        C0878b(InterfaceC0874i interfaceC0874i, AbstractC0868e.EnumC0870b enumC0870b) {
            this.f3146b = C0880m.m6100f(interfaceC0874i);
            this.f3145a = enumC0870b;
        }

        /* renamed from: a */
        void m6106a(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
            AbstractC0868e.EnumC0870b m6117h = C0876k.m6117h(enumC0869a);
            this.f3145a = C0876k.m6113l(this.f3145a, m6117h);
            this.f3146b.mo5007d(interfaceC0875j, enumC0869a);
            this.f3145a = m6117h;
        }
    }

    public C0876k(InterfaceC0875j interfaceC0875j) {
        this.f3138c = new WeakReference<>(interfaceC0875j);
    }

    /* renamed from: d */
    private void m6121d(InterfaceC0875j interfaceC0875j) {
        Iterator<Map.Entry<InterfaceC0874i, C0878b>> m9466d = this.f3136a.m9466d();
        while (m9466d.hasNext() && !this.f3141f) {
            Map.Entry<InterfaceC0874i, C0878b> next = m9466d.next();
            C0878b value = next.getValue();
            while (value.f3145a.compareTo(this.f3137b) > 0 && !this.f3141f && this.f3136a.contains(next.getKey())) {
                AbstractC0868e.EnumC0869a m6119f = m6119f(value.f3145a);
                m6110o(m6117h(m6119f));
                value.m6106a(interfaceC0875j, m6119f);
                m6111n();
            }
        }
    }

    /* renamed from: e */
    private AbstractC0868e.EnumC0870b m6120e(InterfaceC0874i interfaceC0874i) {
        Map.Entry<InterfaceC0874i, C0878b> m9467u = this.f3136a.m9467u(interfaceC0874i);
        AbstractC0868e.EnumC0870b enumC0870b = null;
        AbstractC0868e.EnumC0870b enumC0870b2 = m9467u != null ? m9467u.getValue().f3145a : null;
        if (!this.f3142g.isEmpty()) {
            ArrayList<AbstractC0868e.EnumC0870b> arrayList = this.f3142g;
            enumC0870b = arrayList.get(arrayList.size() - 1);
        }
        return m6113l(m6113l(this.f3137b, enumC0870b2), enumC0870b);
    }

    /* renamed from: f */
    private static AbstractC0868e.EnumC0869a m6119f(AbstractC0868e.EnumC0870b enumC0870b) {
        int i = C0877a.f3144b[enumC0870b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException("Unexpected state value " + enumC0870b);
                        }
                        throw new IllegalArgumentException();
                    }
                    return AbstractC0868e.EnumC0869a.ON_PAUSE;
                }
                return AbstractC0868e.EnumC0869a.ON_STOP;
            }
            return AbstractC0868e.EnumC0869a.ON_DESTROY;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private void m6118g(InterfaceC0875j interfaceC0875j) {
        C0048b<InterfaceC0874i, C0878b>.C0052d m9463g = this.f3136a.m9463g();
        while (m9463g.hasNext() && !this.f3141f) {
            Map.Entry next = m9463g.next();
            C0878b c0878b = (C0878b) next.getValue();
            while (c0878b.f3145a.compareTo(this.f3137b) < 0 && !this.f3141f && this.f3136a.contains(next.getKey())) {
                m6110o(c0878b.f3145a);
                c0878b.m6106a(interfaceC0875j, m6107r(c0878b.f3145a));
                m6111n();
            }
        }
    }

    /* renamed from: h */
    static AbstractC0868e.EnumC0870b m6117h(AbstractC0868e.EnumC0869a enumC0869a) {
        switch (C0877a.f3143a[enumC0869a.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0868e.EnumC0870b.CREATED;
            case 3:
            case 4:
                return AbstractC0868e.EnumC0870b.STARTED;
            case 5:
                return AbstractC0868e.EnumC0870b.RESUMED;
            case 6:
                return AbstractC0868e.EnumC0870b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + enumC0869a);
        }
    }

    /* renamed from: j */
    private boolean m6115j() {
        if (this.f3136a.size() == 0) {
            return true;
        }
        AbstractC0868e.EnumC0870b enumC0870b = this.f3136a.m9465e().getValue().f3145a;
        AbstractC0868e.EnumC0870b enumC0870b2 = this.f3136a.m9462i().getValue().f3145a;
        return enumC0870b == enumC0870b2 && this.f3137b == enumC0870b2;
    }

    /* renamed from: l */
    static AbstractC0868e.EnumC0870b m6113l(AbstractC0868e.EnumC0870b enumC0870b, AbstractC0868e.EnumC0870b enumC0870b2) {
        return (enumC0870b2 == null || enumC0870b2.compareTo(enumC0870b) >= 0) ? enumC0870b : enumC0870b2;
    }

    /* renamed from: m */
    private void m6112m(AbstractC0868e.EnumC0870b enumC0870b) {
        if (this.f3137b == enumC0870b) {
            return;
        }
        this.f3137b = enumC0870b;
        if (this.f3140e || this.f3139d != 0) {
            this.f3141f = true;
            return;
        }
        this.f3140e = true;
        m6108q();
        this.f3140e = false;
    }

    /* renamed from: n */
    private void m6111n() {
        ArrayList<AbstractC0868e.EnumC0870b> arrayList = this.f3142g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: o */
    private void m6110o(AbstractC0868e.EnumC0870b enumC0870b) {
        this.f3142g.add(enumC0870b);
    }

    /* renamed from: q */
    private void m6108q() {
        InterfaceC0875j interfaceC0875j = this.f3138c.get();
        if (interfaceC0875j == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean m6115j = m6115j();
            this.f3141f = false;
            if (m6115j) {
                return;
            }
            if (this.f3137b.compareTo(this.f3136a.m9465e().getValue().f3145a) < 0) {
                m6121d(interfaceC0875j);
            }
            Map.Entry<InterfaceC0874i, C0878b> m9462i = this.f3136a.m9462i();
            if (!this.f3141f && m9462i != null && this.f3137b.compareTo(m9462i.getValue().f3145a) > 0) {
                m6118g(interfaceC0875j);
            }
        }
    }

    /* renamed from: r */
    private static AbstractC0868e.EnumC0869a m6107r(AbstractC0868e.EnumC0870b enumC0870b) {
        int i = C0877a.f3144b[enumC0870b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0868e.EnumC0869a.ON_START;
            }
            if (i == 3) {
                return AbstractC0868e.EnumC0869a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + enumC0870b);
            }
        }
        return AbstractC0868e.EnumC0869a.ON_CREATE;
    }

    @Override // androidx.lifecycle.AbstractC0868e
    /* renamed from: a */
    public void mo6124a(InterfaceC0874i interfaceC0874i) {
        InterfaceC0875j interfaceC0875j;
        AbstractC0868e.EnumC0870b enumC0870b = this.f3137b;
        AbstractC0868e.EnumC0870b enumC0870b2 = AbstractC0868e.EnumC0870b.DESTROYED;
        if (enumC0870b != enumC0870b2) {
            enumC0870b2 = AbstractC0868e.EnumC0870b.INITIALIZED;
        }
        C0878b c0878b = new C0878b(interfaceC0874i, enumC0870b2);
        if (this.f3136a.mo9460m(interfaceC0874i, c0878b) == null && (interfaceC0875j = this.f3138c.get()) != null) {
            boolean z = this.f3139d != 0 || this.f3140e;
            AbstractC0868e.EnumC0870b m6120e = m6120e(interfaceC0874i);
            this.f3139d++;
            while (c0878b.f3145a.compareTo(m6120e) < 0 && this.f3136a.contains(interfaceC0874i)) {
                m6110o(c0878b.f3145a);
                c0878b.m6106a(interfaceC0875j, m6107r(c0878b.f3145a));
                m6111n();
                m6120e = m6120e(interfaceC0874i);
            }
            if (!z) {
                m6108q();
            }
            this.f3139d--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0868e
    /* renamed from: b */
    public AbstractC0868e.EnumC0870b mo6123b() {
        return this.f3137b;
    }

    @Override // androidx.lifecycle.AbstractC0868e
    /* renamed from: c */
    public void mo6122c(InterfaceC0874i interfaceC0874i) {
        this.f3136a.mo9459s(interfaceC0874i);
    }

    /* renamed from: i */
    public void m6116i(AbstractC0868e.EnumC0869a enumC0869a) {
        m6112m(m6117h(enumC0869a));
    }

    @Deprecated
    /* renamed from: k */
    public void m6114k(AbstractC0868e.EnumC0870b enumC0870b) {
        m6109p(enumC0870b);
    }

    /* renamed from: p */
    public void m6109p(AbstractC0868e.EnumC0870b enumC0870b) {
        m6112m(enumC0870b);
    }
}
