package p054b.p059c.p060a.p075b.p084q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p000a.p019g.p020d.C0122a;
import p054b.p059c.p060a.p075b.p091x.C1387b;
/* renamed from: b.c.a.b.q.a */
/* loaded from: classes.dex */
public class C1377a {
    /* renamed from: a */
    public static int m4291a(Context context, int i, int i2) {
        TypedValue m4266a = C1387b.m4266a(context, i);
        return m4266a != null ? m4266a.data : i2;
    }

    /* renamed from: b */
    public static int m4290b(Context context, int i, String str) {
        return C1387b.m4264c(context, i, str);
    }

    /* renamed from: c */
    public static int m4289c(View view, int i) {
        return C1387b.m4263d(view, i);
    }

    /* renamed from: d */
    public static int m4288d(View view, int i, int i2) {
        return m4291a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m4287e(int i, int i2) {
        return C0122a.m9050b(i2, i);
    }

    /* renamed from: f */
    public static int m4286f(int i, int i2, float f) {
        return m4287e(i, C0122a.m9048d(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: g */
    public static int m4285g(View view, int i, int i2, float f) {
        return m4286f(m4289c(view, i), m4289c(view, i2), f);
    }
}
