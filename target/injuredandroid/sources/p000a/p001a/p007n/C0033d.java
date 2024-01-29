package p000a.p001a.p007n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p000a.p001a.C0008i;
/* renamed from: a.a.n.d */
/* loaded from: classes.dex */
public class C0033d extends ContextWrapper {

    /* renamed from: a */
    private int f77a;

    /* renamed from: b */
    private Resources.Theme f78b;

    /* renamed from: c */
    private LayoutInflater f79c;

    /* renamed from: d */
    private Configuration f80d;

    /* renamed from: e */
    private Resources f81e;

    public C0033d() {
        super(null);
    }

    public C0033d(Context context, int i) {
        super(context);
        this.f77a = i;
    }

    public C0033d(Context context, Resources.Theme theme) {
        super(context);
        this.f78b = theme;
    }

    /* renamed from: a */
    private Resources m9497a() {
        Resources resources;
        if (this.f81e == null) {
            Configuration configuration = this.f80d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f81e = resources;
        }
        return this.f81e;
    }

    /* renamed from: c */
    private void m9495c() {
        boolean z = this.f78b == null;
        if (z) {
            this.f78b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f78b.setTo(theme);
            }
        }
        m9494d(this.f78b, this.f77a, z);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public int m9496b() {
        return this.f77a;
    }

    /* renamed from: d */
    protected void m9494d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m9497a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f79c == null) {
                this.f79c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f79c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f78b;
        if (theme != null) {
            return theme;
        }
        if (this.f77a == 0) {
            this.f77a = C0008i.Theme_AppCompat_Light;
        }
        m9495c();
        return this.f78b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f77a != i) {
            this.f77a = i;
            m9495c();
        }
    }
}
