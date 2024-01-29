package com.google.android.material.bottomappbar;

import p054b.p059c.p060a.p075b.p076a0.C1314f;
import p054b.p059c.p060a.p075b.p076a0.C1329m;
/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes.dex */
public class C1740a extends C1314f implements Cloneable {

    /* renamed from: f */
    private float f4989f;

    /* renamed from: g */
    private float f4990g;

    /* renamed from: h */
    private float f4991h;

    /* renamed from: i */
    private float f4992i;

    /* renamed from: j */
    private float f4993j;

    @Override // p054b.p059c.p060a.p075b.p076a0.C1314f
    /* renamed from: a */
    public void mo3381a(float f, float f2, float f3, C1329m c1329m) {
        float f4 = this.f4991h;
        if (f4 == 0.0f) {
            c1329m.m4417l(f, 0.0f);
            return;
        }
        float f5 = ((this.f4990g * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f4989f;
        float f7 = f2 + this.f4993j;
        float f8 = (this.f4992i * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            c1329m.m4417l(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f10));
        float f13 = 90.0f - degrees;
        c1329m.m4417l(f11, 0.0f);
        float f14 = f6 * 2.0f;
        c1329m.m4428a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        c1329m.m4428a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        c1329m.m4428a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        c1329m.m4417l(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m3380b() {
        return this.f4992i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m3379c() {
        return this.f4990g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m3378d() {
        return this.f4989f;
    }

    /* renamed from: e */
    public float m3377e() {
        return this.f4991h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3376f(float f) {
        this.f4992i = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m3375g(float f) {
        this.f4990g = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m3374h(float f) {
        this.f4989f = f;
    }

    /* renamed from: i */
    public void m3373i(float f) {
        this.f4991h = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m3372j(float f) {
        this.f4993j = f;
    }
}
