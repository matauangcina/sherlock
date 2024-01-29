package com.google.android.gms.common.util;

import android.util.Base64;
/* renamed from: com.google.android.gms.common.util.b */
/* loaded from: classes.dex */
public final class C1694b {
    /* renamed from: a */
    public static byte[] m3568a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    /* renamed from: b */
    public static byte[] m3567b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* renamed from: c */
    public static String m3566c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: d */
    public static String m3565d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
