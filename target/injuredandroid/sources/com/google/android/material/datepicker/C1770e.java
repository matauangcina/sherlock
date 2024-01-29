package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
class C1770e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m3069a(long j) {
        return m3068b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m3068b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C1805r.m2971b(locale).format(new Date(j)) : C1805r.m2967f(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m3067c(long j) {
        return m3066d(j, Locale.getDefault());
    }

    /* renamed from: d */
    static String m3066d(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C1805r.m2960m(locale).format(new Date(j)) : C1805r.m2967f(locale).format(new Date(j));
    }
}
