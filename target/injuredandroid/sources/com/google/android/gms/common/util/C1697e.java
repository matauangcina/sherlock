package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
/* renamed from: com.google.android.gms.common.util.e */
/* loaded from: classes.dex */
public final class C1697e {
    /* renamed from: a */
    public static boolean m3563a(Context context, Throwable th) {
        return m3562b(context, th, 536870912);
    }

    /* renamed from: b */
    private static boolean m3562b(Context context, Throwable th, int i) {
        try {
            C1679r.m3631h(context);
            C1679r.m3631h(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
