package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0713d;
/* renamed from: androidx.core.content.c */
/* loaded from: classes.dex */
public final class C0741c {
    /* renamed from: a */
    public static int m6852a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m6980b = C0713d.m6980b(str);
        if (m6980b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0713d.m6981a(context, m6980b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m6851b(Context context, String str) {
        return m6852a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
