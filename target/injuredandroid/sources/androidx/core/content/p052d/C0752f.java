package androidx.core.content.p052d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p000a.p019g.p027j.C0189d;
import p000a.p019g.p027j.C0194i;
/* renamed from: androidx.core.content.d.f */
/* loaded from: classes.dex */
public final class C0752f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2666a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0754b, SparseArray<C0753a>> f2667b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2668c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.content.d.f$a */
    /* loaded from: classes.dex */
    public static class C0753a {

        /* renamed from: a */
        final ColorStateList f2669a;

        /* renamed from: b */
        final Configuration f2670b;

        C0753a(ColorStateList colorStateList, Configuration configuration) {
            this.f2669a = colorStateList;
            this.f2670b = configuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.content.d.f$b */
    /* loaded from: classes.dex */
    public static final class C0754b {

        /* renamed from: a */
        final Resources f2671a;

        /* renamed from: b */
        final Resources.Theme f2672b;

        C0754b(Resources resources, Resources.Theme theme) {
            this.f2671a = resources;
            this.f2672b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0754b.class != obj.getClass()) {
                return false;
            }
            C0754b c0754b = (C0754b) obj;
            return this.f2671a.equals(c0754b.f2671a) && C0189d.m8873a(this.f2672b, c0754b.f2672b);
        }

        public int hashCode() {
            return C0189d.m8872b(this.f2671a, this.f2672b);
        }
    }

    /* renamed from: androidx.core.content.d.f$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0755c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.d.f$c$a */
        /* loaded from: classes.dex */
        public class RunnableC0756a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f2673f;

            RunnableC0756a(Typeface typeface) {
                this.f2673f = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC0755c.this.mo4244e(this.f2673f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.d.f$c$b */
        /* loaded from: classes.dex */
        public class RunnableC0757b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f2675f;

            RunnableC0757b(int i) {
                this.f2675f = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC0755c.this.mo4245d(this.f2675f);
            }
        }

        /* renamed from: c */
        public static Handler m6790c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void m6792a(int i, Handler handler) {
            m6790c(handler).post(new RunnableC0757b(i));
        }

        /* renamed from: b */
        public final void m6791b(Typeface typeface, Handler handler) {
            m6790c(handler).post(new RunnableC0756a(typeface));
        }

        /* renamed from: d */
        public abstract void mo4245d(int i);

        /* renamed from: e */
        public abstract void mo4244e(Typeface typeface);
    }

    /* renamed from: a */
    private static void m6804a(C0754b c0754b, int i, ColorStateList colorStateList) {
        synchronized (f2668c) {
            SparseArray<C0753a> sparseArray = f2667b.get(c0754b);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f2667b.put(c0754b, sparseArray);
            }
            sparseArray.append(i, new C0753a(colorStateList, c0754b.f2671a.getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m6803b(C0754b c0754b, int i) {
        C0753a c0753a;
        synchronized (f2668c) {
            SparseArray<C0753a> sparseArray = f2667b.get(c0754b);
            if (sparseArray != null && sparseArray.size() > 0 && (c0753a = sparseArray.get(i)) != null) {
                if (c0753a.f2670b.equals(c0754b.f2671a.getConfiguration())) {
                    return c0753a.f2669a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m6802c(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        C0754b c0754b = new C0754b(resources, theme);
        ColorStateList m6803b = m6803b(c0754b, i);
        if (m6803b != null) {
            return m6803b;
        }
        ColorStateList m6796i = m6796i(resources, i, theme);
        if (m6796i != null) {
            m6804a(c0754b, i, m6796i);
            return m6796i;
        }
        return resources.getColorStateList(i);
    }

    /* renamed from: d */
    public static Drawable m6801d(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: e */
    public static Typeface m6800e(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m6794k(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: f */
    public static Typeface m6799f(Context context, int i, TypedValue typedValue, int i2, AbstractC0755c abstractC0755c) {
        if (context.isRestricted()) {
            return null;
        }
        return m6794k(context, i, typedValue, i2, abstractC0755c, null, true, false);
    }

    /* renamed from: g */
    public static void m6798g(Context context, int i, AbstractC0755c abstractC0755c, Handler handler) {
        C0194i.m8866c(abstractC0755c);
        if (context.isRestricted()) {
            abstractC0755c.m6792a(-4, handler);
        } else {
            m6794k(context, i, new TypedValue(), 0, abstractC0755c, handler, false, false);
        }
    }

    /* renamed from: h */
    private static TypedValue m6797h() {
        TypedValue typedValue = f2666a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f2666a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: i */
    private static ColorStateList m6796i(Resources resources, int i, Resources.Theme theme) {
        if (m6795j(resources, i)) {
            return null;
        }
        try {
            return C0742a.m6850a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m6795j(Resources resources, int i) {
        TypedValue m6797h = m6797h();
        resources.getValue(i, m6797h, true);
        int i2 = m6797h.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: k */
    private static Typeface m6794k(Context context, int i, TypedValue typedValue, int i2, AbstractC0755c abstractC0755c, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m6793l = m6793l(context, resources, typedValue, i, i2, abstractC0755c, handler, z, z2);
        if (m6793l == null && abstractC0755c == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m6793l;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface m6793l(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p052d.C0752f.AbstractC0755c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L9d
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.m6792a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = p000a.p019g.p020d.C0127d.m9022f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.m6791b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            androidx.core.content.d.c$a r2 = androidx.core.content.p052d.C0744c.m6829b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r9 == 0) goto L55
            r9.m6792a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p000a.p019g.p020d.C0127d.m9025c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = p000a.p019g.p020d.C0127d.m9024d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.m6791b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
            goto L78
        L75:
            r9.m6792a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L82
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L8a
        L82:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L8a:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L9c
            r9.m6792a(r13, r10)
        L9c:
            return r14
        L9d:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p052d.C0752f.m6793l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.d.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
