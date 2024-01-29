package p000a.p019g.p025h;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p000a.p019g.p027j.C0194i;
/* renamed from: a.g.h.f */
/* loaded from: classes.dex */
public class C0161f {

    /* renamed from: a.g.h.f$a */
    /* loaded from: classes.dex */
    public static class C0162a {

        /* renamed from: a */
        private final int f584a;

        /* renamed from: b */
        private final C0163b[] f585b;

        @Deprecated
        public C0162a(int i, C0163b[] c0163bArr) {
            this.f584a = i;
            this.f585b = c0163bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C0162a m8933a(int i, C0163b[] c0163bArr) {
            return new C0162a(i, c0163bArr);
        }

        /* renamed from: b */
        public C0163b[] m8932b() {
            return this.f585b;
        }

        /* renamed from: c */
        public int m8931c() {
            return this.f584a;
        }
    }

    /* renamed from: a.g.h.f$b */
    /* loaded from: classes.dex */
    public static class C0163b {

        /* renamed from: a */
        private final Uri f586a;

        /* renamed from: b */
        private final int f587b;

        /* renamed from: c */
        private final int f588c;

        /* renamed from: d */
        private final boolean f589d;

        /* renamed from: e */
        private final int f590e;

        @Deprecated
        public C0163b(Uri uri, int i, int i2, boolean z, int i3) {
            C0194i.m8866c(uri);
            this.f586a = uri;
            this.f587b = i;
            this.f588c = i2;
            this.f589d = z;
            this.f590e = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C0163b m8930a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C0163b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m8929b() {
            return this.f590e;
        }

        /* renamed from: c */
        public int m8928c() {
            return this.f587b;
        }

        /* renamed from: d */
        public Uri m8927d() {
            return this.f586a;
        }

        /* renamed from: e */
        public int m8926e() {
            return this.f588c;
        }

        /* renamed from: f */
        public boolean m8925f() {
            return this.f589d;
        }
    }

    /* renamed from: a.g.h.f$c */
    /* loaded from: classes.dex */
    public static class C0164c {
        /* renamed from: a */
        public abstract void mo8924a(int i);

        /* renamed from: b */
        public abstract void mo8923b(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m8934a(Context context, C0154d c0154d, int i, boolean z, int i2, Handler handler, C0164c c0164c) {
        C0148a c0148a = new C0148a(c0164c, handler);
        return z ? C0155e.m8940e(context, c0154d, c0148a, i, i2) : C0155e.m8941d(context, c0154d, i, null, c0148a);
    }
}
