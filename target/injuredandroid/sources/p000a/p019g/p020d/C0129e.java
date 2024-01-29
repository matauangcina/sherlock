package p000a.p019g.p020d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p052d.C0744c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p019g.p025h.C0161f;
/* renamed from: a.g.d.e */
/* loaded from: classes.dex */
class C0129e extends C0134j {

    /* renamed from: b */
    private static Class<?> f534b = null;

    /* renamed from: c */
    private static Constructor<?> f535c = null;

    /* renamed from: d */
    private static Method f536d = null;

    /* renamed from: e */
    private static Method f537e = null;

    /* renamed from: f */
    private static boolean f538f = false;

    /* renamed from: k */
    private static boolean m9019k(Object obj, String str, int i, boolean z) {
        m9016n();
        try {
            return ((Boolean) f536d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface m9018l(Object obj) {
        m9016n();
        try {
            Object newInstance = Array.newInstance(f534b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f537e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m9017m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m9016n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f538f) {
            return;
        }
        f538f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f535c = constructor;
        f534b = cls;
        f536d = method2;
        f537e = method;
    }

    /* renamed from: o */
    private static Object m9015o() {
        m9016n();
        try {
            return f535c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: b */
    public Typeface mo8995b(Context context, C0744c.C0746b c0746b, Resources resources, int i) {
        C0744c.C0747c[] m6822a;
        Object m9015o = m9015o();
        for (C0744c.C0747c c0747c : c0746b.m6822a()) {
            File m8976e = C0138k.m8976e(context);
            if (m8976e == null) {
                return null;
            }
            try {
                if (!C0138k.m8978c(m8976e, resources, c0747c.m6820b())) {
                    return null;
                }
                if (!m9019k(m9015o, m8976e.getPath(), c0747c.m6817e(), c0747c.m6816f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m8976e.delete();
            }
        }
        return m9018l(m9015o);
    }

    @Override // p000a.p019g.p020d.C0134j
    /* renamed from: c */
    public Typeface mo8994c(Context context, CancellationSignal cancellationSignal, C0161f.C0163b[] c0163bArr, int i) {
        if (c0163bArr.length < 1) {
            return null;
        }
        C0161f.C0163b mo8989h = mo8989h(c0163bArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo8989h.m8927d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m9017m = m9017m(openFileDescriptor);
            if (m9017m != null && m9017m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m9017m);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface mo8993d = super.mo8993d(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return mo8993d;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
