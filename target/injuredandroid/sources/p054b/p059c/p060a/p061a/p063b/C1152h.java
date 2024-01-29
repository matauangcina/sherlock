package p054b.p059c.p060a.p061a.p063b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
/* renamed from: b.c.a.a.b.h */
/* loaded from: classes.dex */
public class C1152h {

    /* renamed from: a */
    private static C1152h f3870a;

    private C1152h(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1152h m4773a(Context context) {
        C1679r.m3631h(context);
        synchronized (C1152h.class) {
            if (f3870a == null) {
                C1161p.m4752a(context);
                f3870a = new C1152h(context);
            }
        }
        return f3870a;
    }

    /* renamed from: b */
    private static AbstractBinderC1162q m4772b(PackageInfo packageInfo, AbstractBinderC1162q... abstractBinderC1162qArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC1163r binderC1163r = new BinderC1163r(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC1162qArr.length; i++) {
            if (abstractBinderC1162qArr[i].equals(binderC1163r)) {
                return abstractBinderC1162qArr[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m4771c(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m4772b(packageInfo, C1165t.f3886a) : m4772b(packageInfo, C1165t.f3886a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
