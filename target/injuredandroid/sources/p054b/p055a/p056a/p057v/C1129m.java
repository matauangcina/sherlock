package p054b.p055a.p056a.p057v;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;
import p054b.p055a.p056a.C1098n;
import p054b.p055a.p056a.InterfaceC1089h;
/* renamed from: b.a.a.v.m */
/* loaded from: classes.dex */
public class C1129m {
    /* renamed from: a */
    public static C1098n m4852a(Context context) {
        return m4850c(context, null);
    }

    /* renamed from: b */
    private static C1098n m4851b(Context context, InterfaceC1089h interfaceC1089h) {
        C1098n c1098n = new C1098n(new C1116e(new File(context.getCacheDir(), "volley")), interfaceC1089h);
        c1098n.m4941d();
        return c1098n;
    }

    /* renamed from: c */
    public static C1098n m4850c(Context context, AbstractC1112b abstractC1112b) {
        C1113c c1113c;
        C1113c c1113c2;
        String str;
        if (abstractC1112b != null) {
            c1113c = new C1113c(abstractC1112b);
        } else if (Build.VERSION.SDK_INT >= 9) {
            c1113c2 = new C1113c((AbstractC1112b) new C1124j());
            return m4851b(context, c1113c2);
        } else {
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "volley/0";
            }
            c1113c = new C1113c(new C1119f(AndroidHttpClient.newInstance(str)));
        }
        c1113c2 = c1113c;
        return m4851b(context, c1113c2);
    }
}
