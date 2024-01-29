package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.common.util.k */
/* loaded from: classes.dex */
public class C1703k {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    /* renamed from: a */
    public static String m3543a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m3542b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
