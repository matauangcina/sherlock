package p108c.p109a.p114d;

import android.content.Context;
import android.os.Build;
/* renamed from: c.a.d.a */
/* loaded from: classes.dex */
public final class C1538a {
    /* renamed from: a */
    public static String m3996a(Context context) {
        return (Build.VERSION.SDK_INT >= 21 ? context.getCodeCacheDir() : context.getCacheDir()).getPath();
    }

    /* renamed from: b */
    public static String m3995b(Context context) {
        return context.getDir("flutter", 0).getPath();
    }

    /* renamed from: c */
    public static String m3994c(Context context) {
        return context.getFilesDir().getPath();
    }
}
