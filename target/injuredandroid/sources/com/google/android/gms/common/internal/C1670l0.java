package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p054b.p059c.p060a.p061a.p063b.p066m.C1158b;
/* renamed from: com.google.android.gms.common.internal.l0 */
/* loaded from: classes.dex */
public final class C1670l0 {

    /* renamed from: a */
    private static Object f4838a = new Object();

    /* renamed from: b */
    private static boolean f4839b;

    /* renamed from: c */
    private static int f4840c;

    /* renamed from: a */
    public static int m3651a(Context context) {
        m3650b(context);
        return f4840c;
    }

    /* renamed from: b */
    private static void m3650b(Context context) {
        Bundle bundle;
        synchronized (f4838a) {
            if (f4839b) {
                return;
            }
            f4839b = true;
            try {
                bundle = C1158b.m4754a(context).m4757a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            bundle.getString("com.google.app.id");
            f4840c = bundle.getInt("com.google.android.gms.version");
        }
    }
}
