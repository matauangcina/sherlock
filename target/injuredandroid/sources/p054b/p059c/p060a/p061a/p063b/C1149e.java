package p054b.p059c.p060a.p061a.p063b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1659h0;
import com.google.android.gms.common.util.C1699g;
import p054b.p059c.p060a.p061a.p063b.p066m.C1158b;
/* renamed from: b.c.a.a.b.e */
/* loaded from: classes.dex */
public class C1149e {

    /* renamed from: a */
    public static final int f3865a = C1151g.f3867a;

    /* renamed from: b */
    private static final C1149e f3866b = new C1149e();

    /* renamed from: e */
    public static C1149e m4787e() {
        return f3866b;
    }

    /* renamed from: i */
    private static String m4783i(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f3865a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C1158b.m4754a(context).m4755c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public Intent mo4791a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !C1699g.m3557c(context)) ? C1659h0.m3677a("com.google.android.gms", m4783i(context, str)) : C1659h0.m3675c();
        } else if (i != 3) {
            return null;
        } else {
            return C1659h0.m3676b("com.google.android.gms");
        }
    }

    /* renamed from: b */
    public PendingIntent mo4790b(Context context, int i, int i2) {
        return m4789c(context, i, i2, null);
    }

    /* renamed from: c */
    public PendingIntent m4789c(Context context, int i, int i2, String str) {
        Intent mo4791a = mo4791a(context, i, str);
        if (mo4791a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, mo4791a, 134217728);
    }

    /* renamed from: d */
    public String mo4788d(int i) {
        return C1151g.m4781a(i);
    }

    /* renamed from: f */
    public int mo4786f(Context context) {
        return mo4785g(context, f3865a);
    }

    /* renamed from: g */
    public int mo4785g(Context context, int i) {
        int m4779c = C1151g.m4779c(context, i);
        if (C1151g.m4778d(context, m4779c)) {
            return 18;
        }
        return m4779c;
    }

    /* renamed from: h */
    public boolean mo4784h(int i) {
        return C1151g.m4775g(i);
    }
}
