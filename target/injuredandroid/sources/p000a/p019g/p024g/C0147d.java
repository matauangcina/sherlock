package p000a.p019g.p024g;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* renamed from: a.g.g.d */
/* loaded from: classes.dex */
public class C0147d {
    /* renamed from: a */
    public static boolean m8963a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
