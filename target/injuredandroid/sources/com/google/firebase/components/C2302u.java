package com.google.firebase.components;
/* renamed from: com.google.firebase.components.u */
/* loaded from: classes.dex */
public final class C2302u {
    /* renamed from: a */
    public static void m2085a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m2084b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m2083c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m2082d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
