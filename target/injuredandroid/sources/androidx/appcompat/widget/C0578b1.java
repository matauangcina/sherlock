package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* renamed from: androidx.appcompat.widget.b1 */
/* loaded from: classes.dex */
public class C0578b1 extends Resources {

    /* renamed from: b */
    private static boolean f1948b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1949a;

    public C0578b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1949a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m7530a() {
        return f1948b;
    }

    /* renamed from: b */
    public static boolean m7529b() {
        return m7530a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Drawable m7528c(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f1949a.get();
        return context != null ? C0623m0.m7350h().m7338t(context, this, i) : super.getDrawable(i);
    }
}
