package p054b.p059c.p060a.p075b.p078l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p000a.p036k.p037a.p038a.C0298a;
import p000a.p036k.p037a.p038a.C0299b;
import p000a.p036k.p037a.p038a.C0300c;
/* renamed from: b.c.a.b.l.a */
/* loaded from: classes.dex */
public class C1350a {

    /* renamed from: a */
    public static final TimeInterpolator f4230a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f4231b = new C0299b();

    /* renamed from: c */
    public static final TimeInterpolator f4232c = new C0298a();

    /* renamed from: d */
    public static final TimeInterpolator f4233d = new C0300c();

    /* renamed from: e */
    public static final TimeInterpolator f4234e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m4377a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
