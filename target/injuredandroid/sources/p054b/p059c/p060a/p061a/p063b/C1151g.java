package p054b.p059c.p060a.p061a.p063b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C1670l0;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.util.C1699g;
import com.google.android.gms.common.util.C1701i;
import com.google.android.gms.common.util.C1704l;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: b.c.a.a.b.g */
/* loaded from: classes.dex */
public class C1151g {
    @Deprecated

    /* renamed from: a */
    public static final int f3867a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f3868b = new AtomicBoolean();

    /* renamed from: c */
    private static final AtomicBoolean f3869c = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m4781a(int i) {
        return C1144a.m4806n(i);
    }

    /* renamed from: b */
    public static Resources m4780b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static int m4779c(Context context, int i) {
        try {
            context.getResources().getString(C1153i.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f3869c.get()) {
            int m3651a = C1670l0.m3651a(context);
            if (m3651a == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (m3651a != f3867a) {
                int i2 = f3867a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(m3651a);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return m4774h(context, (C1699g.m3557c(context) || C1699g.m3556d(context)) ? false : true, i);
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m4778d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m4776f(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m4777e(Context context) {
        Bundle applicationRestrictions;
        return C1701i.m3551d() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    /* renamed from: f */
    static boolean m4776f(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C1701i.m3549f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m4777e(context);
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m4775g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* renamed from: h */
    private static int m4774h(Context context, boolean z, int i) {
        String str;
        C1679r.m3638a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Google Play Store is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1152h.m4773a(context);
            if (!C1152h.m4771c(packageInfo2, true)) {
                str = "Google Play services signature invalid.";
            } else if (!z || (C1152h.m4771c(packageInfo, true) && packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                if (C1704l.m3541a(packageInfo2.versionCode) >= C1704l.m3541a(i)) {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                str = "Google Play Store signature invalid.";
            }
            Log.w("GooglePlayServicesUtil", str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }
}
