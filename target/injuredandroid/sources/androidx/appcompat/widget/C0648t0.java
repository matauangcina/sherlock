package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0648t0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f2189c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0648t0>> f2190d;

    /* renamed from: a */
    private final Resources f2191a;

    /* renamed from: b */
    private final Resources.Theme f2192b;

    private C0648t0(Context context) {
        super(context);
        if (!C0578b1.m7529b()) {
            this.f2191a = new C0652v0(this, context.getResources());
            this.f2192b = null;
            return;
        }
        C0578b1 c0578b1 = new C0578b1(this, context.getResources());
        this.f2191a = c0578b1;
        Resources.Theme newTheme = c0578b1.newTheme();
        this.f2192b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    private static boolean m7264a(Context context) {
        if ((context instanceof C0648t0) || (context.getResources() instanceof C0652v0) || (context.getResources() instanceof C0578b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0578b1.m7529b();
    }

    /* renamed from: b */
    public static Context m7263b(Context context) {
        if (m7264a(context)) {
            synchronized (f2189c) {
                if (f2190d == null) {
                    f2190d = new ArrayList<>();
                } else {
                    for (int size = f2190d.size() - 1; size >= 0; size--) {
                        WeakReference<C0648t0> weakReference = f2190d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f2190d.remove(size);
                        }
                    }
                    for (int size2 = f2190d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C0648t0> weakReference2 = f2190d.get(size2);
                        C0648t0 c0648t0 = weakReference2 != null ? weakReference2.get() : null;
                        if (c0648t0 != null && c0648t0.getBaseContext() == context) {
                            return c0648t0;
                        }
                    }
                }
                C0648t0 c0648t02 = new C0648t0(context);
                f2190d.add(new WeakReference<>(c0648t02));
                return c0648t02;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2191a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2191a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2192b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f2192b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
