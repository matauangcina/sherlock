package p054b.p059c.p060a.p075b.p082p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p054b.p059c.p060a.p075b.p082p.InterfaceC1370d;
/* renamed from: b.c.a.b.p.c */
/* loaded from: classes.dex */
public class C1369c {

    /* renamed from: a */
    public static final int f4267a;

    static {
        int i = Build.VERSION.SDK_INT;
        f4267a = i >= 21 ? 2 : i >= 18 ? 1 : 0;
    }

    /* renamed from: a */
    public abstract void m4309a();

    /* renamed from: b */
    public abstract void m4308b();

    /* renamed from: c */
    public abstract void m4307c(Canvas canvas);

    /* renamed from: d */
    public abstract Drawable m4306d();

    /* renamed from: e */
    public abstract int m4305e();

    /* renamed from: f */
    public abstract InterfaceC1370d.C1375e m4304f();

    /* renamed from: g */
    public abstract boolean m4303g();

    /* renamed from: h */
    public abstract void m4302h(Drawable drawable);

    /* renamed from: i */
    public abstract void m4301i(int i);

    /* renamed from: j */
    public abstract void m4300j(InterfaceC1370d.C1375e c1375e);
}
