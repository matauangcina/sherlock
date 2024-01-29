package com.google.android.gms.common.internal;

import android.util.Log;
/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes.dex */
public final class C1663j {

    /* renamed from: a */
    private final String f4834a;

    /* renamed from: b */
    private final String f4835b;

    public C1663j(String str) {
        this(str, null);
    }

    public C1663j(String str, String str2) {
        C1679r.m3630i(str, "log tag cannot be null");
        C1679r.m3636c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f4834a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f4835b = null;
        } else {
            this.f4835b = str2;
        }
    }

    /* renamed from: f */
    private final String m3658f(String str) {
        String str2 = this.f4835b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public final boolean m3663a(int i) {
        return Log.isLoggable(this.f4834a, i);
    }

    /* renamed from: b */
    public final void m3662b(String str, String str2) {
        if (m3663a(3)) {
            Log.d(str, m3658f(str2));
        }
    }

    /* renamed from: c */
    public final void m3661c(String str, String str2) {
        if (m3663a(6)) {
            Log.e(str, m3658f(str2));
        }
    }

    /* renamed from: d */
    public final void m3660d(String str, String str2, Throwable th) {
        if (m3663a(6)) {
            Log.e(str, m3658f(str2), th);
        }
    }

    /* renamed from: e */
    public final void m3659e(String str, String str2) {
        if (m3663a(2)) {
            Log.v(str, m3658f(str2));
        }
    }
}
