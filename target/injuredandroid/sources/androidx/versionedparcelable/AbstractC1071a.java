package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p014d.C0066a;
/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC1071a {

    /* renamed from: a */
    protected final C0066a<String, Method> f3700a;

    /* renamed from: b */
    protected final C0066a<String, Method> f3701b;

    /* renamed from: c */
    protected final C0066a<String, Class> f3702c;

    public AbstractC1071a(C0066a<String, Method> c0066a, C0066a<String, Method> c0066a2, C0066a<String, Class> c0066a3) {
        this.f3700a = c0066a;
        this.f3701b = c0066a2;
        this.f3702c = c0066a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m5039N(InterfaceC1073c interfaceC1073c) {
        try {
            mo5019I(m5038c(interfaceC1073c.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC1073c.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m5038c(Class<? extends InterfaceC1073c> cls) {
        Class cls2 = this.f3702c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f3702c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    private Method m5037d(String str) {
        Method method = this.f3700a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC1071a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1071a.class);
            this.f3700a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    private Method m5036e(Class cls) {
        Method method = this.f3701b.get(cls.getName());
        if (method == null) {
            Class m5038c = m5038c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m5038c.getDeclaredMethod("write", cls, AbstractC1071a.class);
            this.f3701b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: A */
    protected abstract void mo5023A(byte[] bArr);

    /* renamed from: B */
    public void m5047B(byte[] bArr, int i) {
        mo5009w(i);
        mo5023A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo5022C(CharSequence charSequence);

    /* renamed from: D */
    public void m5046D(CharSequence charSequence, int i) {
        mo5009w(i);
        mo5022C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo5021E(int i);

    /* renamed from: F */
    public void m5045F(int i, int i2) {
        mo5009w(i2);
        mo5021E(i);
    }

    /* renamed from: G */
    protected abstract void mo5020G(Parcelable parcelable);

    /* renamed from: H */
    public void m5044H(Parcelable parcelable, int i) {
        mo5009w(i);
        mo5020G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo5019I(String str);

    /* renamed from: J */
    public void m5043J(String str, int i) {
        mo5009w(i);
        mo5019I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC1073c> void m5042K(T t, AbstractC1071a abstractC1071a) {
        try {
            m5036e(t.getClass()).invoke(null, t, abstractC1071a);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m5041L(InterfaceC1073c interfaceC1073c) {
        if (interfaceC1073c == null) {
            mo5019I(null);
            return;
        }
        m5039N(interfaceC1073c);
        AbstractC1071a mo5017b = mo5017b();
        m5042K(interfaceC1073c, mo5017b);
        mo5017b.mo5018a();
    }

    /* renamed from: M */
    public void m5040M(InterfaceC1073c interfaceC1073c, int i) {
        mo5009w(i);
        m5041L(interfaceC1073c);
    }

    /* renamed from: a */
    protected abstract void mo5018a();

    /* renamed from: b */
    protected abstract AbstractC1071a mo5017b();

    /* renamed from: f */
    public boolean m5035f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo5016g();

    /* renamed from: h */
    public boolean m5034h(boolean z, int i) {
        return !mo5013m(i) ? z : mo5016g();
    }

    /* renamed from: i */
    protected abstract byte[] mo5015i();

    /* renamed from: j */
    public byte[] m5033j(byte[] bArr, int i) {
        return !mo5013m(i) ? bArr : mo5015i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo5014k();

    /* renamed from: l */
    public CharSequence m5032l(CharSequence charSequence, int i) {
        return !mo5013m(i) ? charSequence : mo5014k();
    }

    /* renamed from: m */
    protected abstract boolean mo5013m(int i);

    /* renamed from: n */
    protected <T extends InterfaceC1073c> T m5031n(String str, AbstractC1071a abstractC1071a) {
        try {
            return (T) m5037d(str).invoke(null, abstractC1071a);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    protected abstract int mo5012o();

    /* renamed from: p */
    public int m5030p(int i, int i2) {
        return !mo5013m(i2) ? i : mo5012o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo5011q();

    /* renamed from: r */
    public <T extends Parcelable> T m5029r(T t, int i) {
        return !mo5013m(i) ? t : (T) mo5011q();
    }

    /* renamed from: s */
    protected abstract String mo5010s();

    /* renamed from: t */
    public String m5028t(String str, int i) {
        return !mo5013m(i) ? str : mo5010s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends InterfaceC1073c> T m5027u() {
        String mo5010s = mo5010s();
        if (mo5010s == null) {
            return null;
        }
        return (T) m5031n(mo5010s, mo5017b());
    }

    /* renamed from: v */
    public <T extends InterfaceC1073c> T m5026v(T t, int i) {
        return !mo5013m(i) ? t : (T) m5027u();
    }

    /* renamed from: w */
    protected abstract void mo5009w(int i);

    /* renamed from: x */
    public void m5025x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    protected abstract void mo5008y(boolean z);

    /* renamed from: z */
    public void m5024z(boolean z, int i) {
        mo5009w(i);
        mo5008y(z);
    }
}
