package p135d.p142s.p144d;

import java.io.Serializable;
import p135d.p142s.C2694b;
import p135d.p146u.InterfaceC2742a;
import p135d.p146u.InterfaceC2744c;
/* renamed from: d.s.d.a */
/* loaded from: classes.dex */
public abstract class AbstractC2718a implements InterfaceC2742a, Serializable {

    /* renamed from: l */
    public static final Object f6839l = C2719a.f6846f;

    /* renamed from: f */
    private transient InterfaceC2742a f6840f;

    /* renamed from: g */
    protected final Object f6841g;

    /* renamed from: h */
    private final Class f6842h;

    /* renamed from: i */
    private final String f6843i;

    /* renamed from: j */
    private final String f6844j;

    /* renamed from: k */
    private final boolean f6845k;

    /* renamed from: d.s.d.a$a */
    /* loaded from: classes.dex */
    private static class C2719a implements Serializable {

        /* renamed from: f */
        private static final C2719a f6846f = new C2719a();

        private C2719a() {
        }
    }

    public AbstractC2718a() {
        this(f6839l);
    }

    protected AbstractC2718a(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2718a(Object obj, Class cls, String str, String str2, boolean z) {
        this.f6841g = obj;
        this.f6842h = cls;
        this.f6843i = str;
        this.f6844j = str2;
        this.f6845k = z;
    }

    @Override // p135d.p146u.InterfaceC2742a
    /* renamed from: a */
    public Object mo838a(Object... objArr) {
        return mo869i().mo838a(objArr);
    }

    /* renamed from: d */
    public InterfaceC2742a m893d() {
        InterfaceC2742a interfaceC2742a = this.f6840f;
        if (interfaceC2742a == null) {
            mo870e();
            this.f6840f = this;
            return this;
        }
        return interfaceC2742a;
    }

    /* renamed from: e */
    protected abstract InterfaceC2742a mo870e();

    /* renamed from: f */
    public Object m892f() {
        return this.f6841g;
    }

    /* renamed from: g */
    public String m891g() {
        return this.f6843i;
    }

    /* renamed from: h */
    public InterfaceC2744c m890h() {
        Class cls = this.f6842h;
        if (cls == null) {
            return null;
        }
        return this.f6845k ? C2731m.m866b(cls) : C2731m.m867a(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public InterfaceC2742a mo869i() {
        InterfaceC2742a m893d = m893d();
        if (m893d != this) {
            return m893d;
        }
        throw new C2694b();
    }

    /* renamed from: j */
    public String m889j() {
        return this.f6844j;
    }
}
