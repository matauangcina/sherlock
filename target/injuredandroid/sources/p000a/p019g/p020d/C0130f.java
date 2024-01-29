package p000a.p019g.p020d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p052d.C0744c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000a.p014d.C0079g;
import p000a.p019g.p025h.C0161f;
/* renamed from: a.g.d.f */
/* loaded from: classes.dex */
class C0130f extends C0134j {

    /* renamed from: b */
    private static final Class<?> f539b;

    /* renamed from: c */
    private static final Constructor<?> f540c;

    /* renamed from: d */
    private static final Method f541d;

    /* renamed from: e */
    private static final Method f542e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f540c = constructor;
        f539b = cls;
        f541d = method2;
        f542e = method;
    }

    /* renamed from: k */
    private static boolean m9014k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f541d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m9013l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f539b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f542e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m9012m() {
        if (f541d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f541d != null;
    }

    /* renamed from: n */
    private static Object m9011n() {
        try {
            return f540c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: b */
    public Typeface mo8995b(Context context, C0744c.C0746b c0746b, Resources resources, int i) {
        C0744c.C0747c[] m6822a;
        Object m9011n = m9011n();
        if (m9011n == null) {
            return null;
        }
        for (C0744c.C0747c c0747c : c0746b.m6822a()) {
            ByteBuffer m8979b = C0138k.m8979b(context, resources, c0747c.m6820b());
            if (m8979b == null || !m9014k(m9011n, m8979b, c0747c.m6819c(), c0747c.m6817e(), c0747c.m6816f())) {
                return null;
            }
        }
        return m9013l(m9011n);
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: c */
    public Typeface mo8994c(Context context, CancellationSignal cancellationSignal, C0161f.C0163b[] c0163bArr, int i) {
        Object m9011n = m9011n();
        if (m9011n == null) {
            return null;
        }
        C0079g c0079g = new C0079g();
        for (C0161f.C0163b c0163b : c0163bArr) {
            Uri m8927d = c0163b.m8927d();
            ByteBuffer byteBuffer = (ByteBuffer) c0079g.get(m8927d);
            if (byteBuffer == null) {
                byteBuffer = C0138k.m8975f(context, cancellationSignal, m8927d);
                c0079g.put(m8927d, byteBuffer);
            }
            if (byteBuffer == null || !m9014k(m9011n, byteBuffer, c0163b.m8928c(), c0163b.m8926e(), c0163b.m8925f())) {
                return null;
            }
        }
        Typeface m9013l = m9013l(m9011n);
        if (m9013l == null) {
            return null;
        }
        return Typeface.create(m9013l, i);
    }
}
