package p054b.p059c.p060a.p075b.p087t;

import android.content.Context;
import android.graphics.Color;
import p000a.p019g.p020d.C0122a;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.p084q.C1377a;
import p054b.p059c.p060a.p075b.p091x.C1387b;
/* renamed from: b.c.a.b.t.a */
/* loaded from: classes.dex */
public class C1380a {

    /* renamed from: a */
    private final boolean f4280a;

    /* renamed from: b */
    private final int f4281b;

    /* renamed from: c */
    private final int f4282c;

    /* renamed from: d */
    private final float f4283d;

    public C1380a(Context context) {
        this.f4280a = C1387b.m4265b(context, C1338b.elevationOverlayEnabled, false);
        this.f4281b = C1377a.m4291a(context, C1338b.elevationOverlayColor, 0);
        this.f4282c = C1377a.m4291a(context, C1338b.colorSurface, 0);
        this.f4283d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m4279e(int i) {
        return C0122a.m9048d(i, 255) == this.f4282c;
    }

    /* renamed from: a */
    public float m4283a(float f) {
        float f2 = this.f4283d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m4282b(int i, float f) {
        float m4283a = m4283a(f);
        return C0122a.m9048d(C1377a.m4286f(C0122a.m9048d(i, 255), this.f4281b, m4283a), Color.alpha(i));
    }

    /* renamed from: c */
    public int m4281c(int i, float f) {
        return (this.f4280a && m4279e(i)) ? m4282b(i, f) : i;
    }

    /* renamed from: d */
    public boolean m4280d() {
        return this.f4280a;
    }
}
