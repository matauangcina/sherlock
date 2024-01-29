package p000a.p019g.p020d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p052d.C0744c;
import androidx.core.content.p052d.C0752f;
import p000a.p014d.C0072e;
import p000a.p019g.p025h.C0161f;
/* renamed from: a.g.d.d */
/* loaded from: classes.dex */
public class C0127d {

    /* renamed from: a */
    private static final C0134j f531a;

    /* renamed from: b */
    private static final C0072e<String, Typeface> f532b;

    /* renamed from: a.g.d.d$a */
    /* loaded from: classes.dex */
    public static class C0128a extends C0161f.C0164c {

        /* renamed from: a */
        private C0752f.AbstractC0755c f533a;

        public C0128a(C0752f.AbstractC0755c abstractC0755c) {
            this.f533a = abstractC0755c;
        }

        @Override // p000a.p019g.p025h.C0161f.C0164c
        /* renamed from: a */
        public void mo8924a(int i) {
            C0752f.AbstractC0755c abstractC0755c = this.f533a;
            if (abstractC0755c != null) {
                abstractC0755c.mo4245d(i);
            }
        }

        @Override // p000a.p019g.p025h.C0161f.C0164c
        /* renamed from: b */
        public void mo8923b(Typeface typeface) {
            C0752f.AbstractC0755c abstractC0755c = this.f533a;
            if (abstractC0755c != null) {
                abstractC0755c.mo4244e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f531a = i >= 29 ? new C0133i() : i >= 28 ? new C0132h() : i >= 26 ? new C0131g() : (i < 24 || !C0130f.m9012m()) ? Build.VERSION.SDK_INT >= 21 ? new C0129e() : new C0134j() : new C0130f();
        f532b = new C0072e<>(16);
    }

    /* renamed from: a */
    public static Typeface m9027a(Context context, Typeface typeface, int i) {
        Typeface m9021g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (m9021g = m9021g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : m9021g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m9026b(Context context, CancellationSignal cancellationSignal, C0161f.C0163b[] c0163bArr, int i) {
        return f531a.mo8994c(context, cancellationSignal, c0163bArr, i);
    }

    /* renamed from: c */
    public static Typeface m9025c(Context context, C0744c.InterfaceC0745a interfaceC0745a, Resources resources, int i, int i2, C0752f.AbstractC0755c abstractC0755c, Handler handler, boolean z) {
        Typeface mo8995b;
        if (interfaceC0745a instanceof C0744c.C0748d) {
            C0744c.C0748d c0748d = (C0744c.C0748d) interfaceC0745a;
            Typeface m9020h = m9020h(c0748d.m6813c());
            if (m9020h != null) {
                if (abstractC0755c != null) {
                    abstractC0755c.m6791b(m9020h, handler);
                }
                return m9020h;
            }
            mo8995b = C0161f.m8934a(context, c0748d.m6814b(), i2, !z ? abstractC0755c != null : c0748d.m6815a() != 0, z ? c0748d.m6812d() : -1, C0752f.AbstractC0755c.m6790c(handler), new C0128a(abstractC0755c));
        } else {
            mo8995b = f531a.mo8995b(context, (C0744c.C0746b) interfaceC0745a, resources, i2);
            if (abstractC0755c != null) {
                if (mo8995b != null) {
                    abstractC0755c.m6791b(mo8995b, handler);
                } else {
                    abstractC0755c.m6792a(-3, handler);
                }
            }
        }
        if (mo8995b != null) {
            f532b.m9366d(m9023e(resources, i, i2), mo8995b);
        }
        return mo8995b;
    }

    /* renamed from: d */
    public static Typeface m9024d(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo8992e = f531a.mo8992e(context, resources, i, str, i2);
        if (mo8992e != null) {
            f532b.m9366d(m9023e(resources, i, i2), mo8992e);
        }
        return mo8992e;
    }

    /* renamed from: e */
    private static String m9023e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m9022f(Resources resources, int i, int i2) {
        return f532b.m9367c(m9023e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m9021g(Context context, Typeface typeface, int i) {
        C0744c.C0746b m8988i = f531a.m8988i(typeface);
        if (m8988i == null) {
            return null;
        }
        return f531a.mo8995b(context, m8988i, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m9020h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
