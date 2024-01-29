package p054b.p059c.p098c.p102m;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.C0734a;
import java.util.concurrent.atomic.AtomicBoolean;
import p054b.p059c.p098c.p099j.InterfaceC1429c;
/* renamed from: b.c.c.m.a */
/* loaded from: classes.dex */
public class C1436a {

    /* renamed from: a */
    private final Context f4370a;

    /* renamed from: b */
    private final SharedPreferences f4371b;

    public C1436a(Context context, String str, InterfaceC1429c interfaceC1429c) {
        this.f4370a = m4171a(context);
        this.f4371b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        new AtomicBoolean(m4170b());
    }

    /* renamed from: a */
    private static Context m4171a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || C0734a.m6871g(context)) ? context : C0734a.m6877a(context);
    }

    /* renamed from: b */
    private boolean m4170b() {
        ApplicationInfo applicationInfo;
        if (this.f4371b.contains("firebase_data_collection_default_enabled")) {
            return this.f4371b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f4370a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f4370a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
