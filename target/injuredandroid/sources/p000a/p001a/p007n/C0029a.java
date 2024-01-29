package p000a.p001a.p007n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p000a.p001a.C0000a;
import p000a.p001a.C0001b;
import p000a.p001a.C0003d;
import p000a.p001a.C0009j;
/* renamed from: a.a.n.a */
/* loaded from: classes.dex */
public class C0029a {

    /* renamed from: a */
    private Context f74a;

    private C0029a(Context context) {
        this.f74a = context;
    }

    /* renamed from: b */
    public static C0029a m9507b(Context context) {
        return new C0029a(context);
    }

    /* renamed from: a */
    public boolean m9508a() {
        return this.f74a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m9506c() {
        return this.f74a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m9505d() {
        Configuration configuration = this.f74a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m9504e() {
        return this.f74a.getResources().getDimensionPixelSize(C0003d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m9503f() {
        TypedArray obtainStyledAttributes = this.f74a.obtainStyledAttributes(null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0009j.ActionBar_height, 0);
        Resources resources = this.f74a.getResources();
        if (!m9502g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0003d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m9502g() {
        return this.f74a.getResources().getBoolean(C0001b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m9501h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f74a).hasPermanentMenuKey();
    }
}
