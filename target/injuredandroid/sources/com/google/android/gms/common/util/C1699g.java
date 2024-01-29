package com.google.android.gms.common.util;

import android.content.Context;
/* renamed from: com.google.android.gms.common.util.g */
/* loaded from: classes.dex */
public final class C1699g {

    /* renamed from: a */
    private static Boolean f4865a;

    /* renamed from: b */
    private static Boolean f4866b;

    /* renamed from: c */
    private static Boolean f4867c;

    /* renamed from: a */
    public static boolean m3559a(Context context) {
        if (f4866b == null) {
            f4866b = Boolean.valueOf(C1701i.m3549f() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f4866b.booleanValue();
    }

    /* renamed from: b */
    public static boolean m3558b(Context context) {
        if (f4865a == null) {
            f4865a = Boolean.valueOf(C1701i.m3550e() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f4865a.booleanValue();
    }

    /* renamed from: c */
    public static boolean m3557c(Context context) {
        if (m3558b(context)) {
            if (C1701i.m3548g()) {
                return m3559a(context) && !C1701i.m3547h();
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m3556d(Context context) {
        if (f4867c == null) {
            f4867c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f4867c.booleanValue();
    }
}
