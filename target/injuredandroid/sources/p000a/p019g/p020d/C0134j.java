package p000a.p019g.p020d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p052d.C0744c;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p019g.p025h.C0161f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.g.d.j */
/* loaded from: classes.dex */
public class C0134j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0744c.C0746b> f550a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.d.j$a */
    /* loaded from: classes.dex */
    public class C0135a implements InterfaceC0137c<C0161f.C0163b> {
        C0135a(C0134j c0134j) {
        }

        @Override // p000a.p019g.p020d.C0134j.InterfaceC0137c
        /* renamed from: c */
        public int mo8982a(C0161f.C0163b c0163b) {
            return c0163b.m8926e();
        }

        @Override // p000a.p019g.p020d.C0134j.InterfaceC0137c
        /* renamed from: d */
        public boolean mo8981b(C0161f.C0163b c0163b) {
            return c0163b.m8925f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.d.j$b */
    /* loaded from: classes.dex */
    public class C0136b implements InterfaceC0137c<C0744c.C0747c> {
        C0136b(C0134j c0134j) {
        }

        @Override // p000a.p019g.p020d.C0134j.InterfaceC0137c
        /* renamed from: c */
        public int mo8982a(C0744c.C0747c c0747c) {
            return c0747c.m6817e();
        }

        @Override // p000a.p019g.p020d.C0134j.InterfaceC0137c
        /* renamed from: d */
        public boolean mo8981b(C0744c.C0747c c0747c) {
            return c0747c.m6816f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.d.j$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0137c<T> {
        /* renamed from: a */
        int mo8982a(T t);

        /* renamed from: b */
        boolean mo8981b(T t);
    }

    /* renamed from: a */
    private void m8996a(Typeface typeface, C0744c.C0746b c0746b) {
        long m8987j = m8987j(typeface);
        if (m8987j != 0) {
            this.f550a.put(Long.valueOf(m8987j), c0746b);
        }
    }

    /* renamed from: f */
    private C0744c.C0747c m8991f(C0744c.C0746b c0746b, int i) {
        return (C0744c.C0747c) m8990g(c0746b.m6822a(), i, new C0136b(this));
    }

    /* renamed from: g */
    private static <T> T m8990g(T[] tArr, int i, InterfaceC0137c<T> interfaceC0137c) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Reader.READ_DONE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC0137c.mo8982a(t2) - i2) * 2) + (interfaceC0137c.mo8981b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m8987j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* renamed from: b */
    public Typeface mo8995b(Context context, C0744c.C0746b c0746b, Resources resources, int i) {
        C0744c.C0747c m8991f = m8991f(c0746b, i);
        if (m8991f == null) {
            return null;
        }
        Typeface m9024d = C0127d.m9024d(context, resources, m8991f.m6820b(), m8991f.m6821a(), i);
        m8996a(m9024d, c0746b);
        return m9024d;
    }

    /* renamed from: c */
    public Typeface mo8994c(Context context, CancellationSignal cancellationSignal, C0161f.C0163b[] c0163bArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c0163bArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo8989h(c0163bArr, i).m8927d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo8993d = mo8993d(context, inputStream);
            C0138k.m8980a(inputStream);
            return mo8993d;
        } catch (IOException unused2) {
            C0138k.m8980a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            C0138k.m8980a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo8993d(Context context, InputStream inputStream) {
        File m8976e = C0138k.m8976e(context);
        if (m8976e == null) {
            return null;
        }
        try {
            if (C0138k.m8977d(m8976e, inputStream)) {
                return Typeface.createFromFile(m8976e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m8976e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo8992e(Context context, Resources resources, int i, String str, int i2) {
        File m8976e = C0138k.m8976e(context);
        if (m8976e == null) {
            return null;
        }
        try {
            if (C0138k.m8978c(m8976e, resources, i)) {
                return Typeface.createFromFile(m8976e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m8976e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public C0161f.C0163b mo8989h(C0161f.C0163b[] c0163bArr, int i) {
        return (C0161f.C0163b) m8990g(c0163bArr, i, new C0135a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0744c.C0746b m8988i(Typeface typeface) {
        long m8987j = m8987j(typeface);
        if (m8987j == 0) {
            return null;
        }
        return this.f550a.get(Long.valueOf(m8987j));
    }
}
