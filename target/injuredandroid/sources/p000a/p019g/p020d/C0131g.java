package p000a.p019g.p020d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p052d.C0744c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000a.p019g.p025h.C0161f;
/* renamed from: a.g.d.g */
/* loaded from: classes.dex */
public class C0131g extends C0129e {

    /* renamed from: g */
    protected final Class<?> f543g;

    /* renamed from: h */
    protected final Constructor<?> f544h;

    /* renamed from: i */
    protected final Method f545i;

    /* renamed from: j */
    protected final Method f546j;

    /* renamed from: k */
    protected final Method f547k;

    /* renamed from: l */
    protected final Method f548l;

    /* renamed from: m */
    protected final Method f549m;

    public C0131g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m9000y = m9000y();
            constructor = m8999z(m9000y);
            method2 = m9002v(m9000y);
            method3 = m9001w(m9000y);
            method4 = m9010A(m9000y);
            method5 = m9003u(m9000y);
            method = mo8997x(m9000y);
            cls = m9000y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f543g = cls;
        this.f544h = constructor;
        this.f545i = method2;
        this.f546j = method3;
        this.f547k = method4;
        this.f548l = method5;
        this.f549m = method;
    }

    /* renamed from: o */
    private Object m9009o() {
        try {
            return this.f544h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m9008p(Object obj) {
        try {
            this.f548l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m9007q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f545i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m9006r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f546j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m9005s(Object obj) {
        try {
            return ((Boolean) this.f547k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m9004t() {
        if (this.f545i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f545i != null;
    }

    /* renamed from: A */
    protected Method m9010A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p000a.p019g.p020d.C0129e, p000a.p019g.p020d.C0134j
    /* renamed from: b */
    public Typeface mo8995b(Context context, C0744c.C0746b c0746b, Resources resources, int i) {
        C0744c.C0747c[] m6822a;
        if (m9004t()) {
            Object m9009o = m9009o();
            if (m9009o == null) {
                return null;
            }
            for (C0744c.C0747c c0747c : c0746b.m6822a()) {
                if (!m9007q(context, m9009o, c0747c.m6821a(), c0747c.m6819c(), c0747c.m6817e(), c0747c.m6816f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0747c.m6818d()))) {
                    m9008p(m9009o);
                    return null;
                }
            }
            if (m9005s(m9009o)) {
                return mo8998l(m9009o);
            }
            return null;
        }
        return super.mo8995b(context, c0746b, resources, i);
    }

    @Override // p000a.p019g.p020d.C0129e, p000a.p019g.p020d.C0134j
    /* renamed from: c */
    public Typeface mo8994c(Context context, CancellationSignal cancellationSignal, C0161f.C0163b[] c0163bArr, int i) {
        Typeface mo8998l;
        if (c0163bArr.length < 1) {
            return null;
        }
        if (!m9004t()) {
            C0161f.C0163b mo8989h = mo8989h(c0163bArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo8989h.m8927d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo8989h.m8926e()).setItalic(mo8989h.m8925f()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m8973h = C0138k.m8973h(context, c0163bArr, cancellationSignal);
        Object m9009o = m9009o();
        if (m9009o == null) {
            return null;
        }
        boolean z = false;
        for (C0161f.C0163b c0163b : c0163bArr) {
            ByteBuffer byteBuffer = m8973h.get(c0163b.m8927d());
            if (byteBuffer != null) {
                if (!m9006r(m9009o, byteBuffer, c0163b.m8928c(), c0163b.m8926e(), c0163b.m8925f() ? 1 : 0)) {
                    m9008p(m9009o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m9008p(m9009o);
            return null;
        } else if (m9005s(m9009o) && (mo8998l = mo8998l(m9009o)) != null) {
            return Typeface.create(mo8998l, i);
        } else {
            return null;
        }
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: e */
    public Typeface mo8992e(Context context, Resources resources, int i, String str, int i2) {
        if (m9004t()) {
            Object m9009o = m9009o();
            if (m9009o == null) {
                return null;
            }
            if (!m9007q(context, m9009o, str, 0, -1, -1, null)) {
                m9008p(m9009o);
                return null;
            } else if (m9005s(m9009o)) {
                return mo8998l(m9009o);
            } else {
                return null;
            }
        }
        return super.mo8992e(context, resources, i, str, i2);
    }

    /* renamed from: l */
    protected Typeface mo8998l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f543g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f549m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u */
    protected Method m9003u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    protected Method m9002v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    protected Method m9001w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    protected Method mo8997x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    protected Class<?> m9000y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    protected Constructor<?> m8999z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
