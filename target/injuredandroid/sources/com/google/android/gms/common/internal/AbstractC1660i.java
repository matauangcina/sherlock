package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes.dex */
public abstract class AbstractC1660i {

    /* renamed from: a */
    private static final Object f4825a = new Object();

    /* renamed from: b */
    private static AbstractC1660i f4826b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.i$a */
    /* loaded from: classes.dex */
    public static final class C1661a {

        /* renamed from: a */
        private final String f4827a;

        /* renamed from: b */
        private final String f4828b;

        /* renamed from: c */
        private final ComponentName f4829c;

        /* renamed from: d */
        private final int f4830d;

        public C1661a(String str, String str2, int i) {
            C1679r.m3633f(str);
            this.f4827a = str;
            C1679r.m3633f(str2);
            this.f4828b = str2;
            this.f4829c = null;
            this.f4830d = i;
        }

        /* renamed from: a */
        public final ComponentName m3670a() {
            return this.f4829c;
        }

        /* renamed from: b */
        public final String m3669b() {
            return this.f4828b;
        }

        /* renamed from: c */
        public final Intent m3668c(Context context) {
            return this.f4827a != null ? new Intent(this.f4827a).setPackage(this.f4828b) : new Intent().setComponent(this.f4829c);
        }

        /* renamed from: d */
        public final int m3667d() {
            return this.f4830d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1661a) {
                C1661a c1661a = (C1661a) obj;
                return C1677q.m3642a(this.f4827a, c1661a.f4827a) && C1677q.m3642a(this.f4828b, c1661a.f4828b) && C1677q.m3642a(this.f4829c, c1661a.f4829c) && this.f4830d == c1661a.f4830d;
            }
            return false;
        }

        public final int hashCode() {
            return C1677q.m3641b(this.f4827a, this.f4828b, this.f4829c, Integer.valueOf(this.f4830d));
        }

        public final String toString() {
            String str = this.f4827a;
            return str == null ? this.f4829c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static AbstractC1660i m3674a(Context context) {
        synchronized (f4825a) {
            if (f4826b == null) {
                f4826b = new C1655f0(context.getApplicationContext());
            }
        }
        return f4826b;
    }

    /* renamed from: b */
    public final void m3673b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo3671d(new C1661a(str, str2, i), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo3672c(C1661a c1661a, ServiceConnection serviceConnection, String str);

    /* renamed from: d */
    protected abstract void mo3671d(C1661a c1661a, ServiceConnection serviceConnection, String str);
}
