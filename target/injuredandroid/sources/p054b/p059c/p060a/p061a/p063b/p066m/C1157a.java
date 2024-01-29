package p054b.p059c.p060a.p061a.p063b.p066m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* renamed from: b.c.a.a.b.m.a */
/* loaded from: classes.dex */
public class C1157a {

    /* renamed from: a */
    private final Context f3878a;

    public C1157a(Context context) {
        this.f3878a = context;
    }

    /* renamed from: a */
    public ApplicationInfo m4757a(String str, int i) {
        return this.f3878a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence m4756b(String str) {
        return this.f3878a.getPackageManager().getApplicationLabel(this.f3878a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: c */
    public PackageInfo m4755c(String str, int i) {
        return this.f3878a.getPackageManager().getPackageInfo(str, i);
    }
}
