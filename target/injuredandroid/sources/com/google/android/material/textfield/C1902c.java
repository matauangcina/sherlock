package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes.dex */
class C1902c extends C1315g {

    /* renamed from: B */
    private final Paint f5660B;

    /* renamed from: C */
    private final RectF f5661C;

    /* renamed from: D */
    private int f5662D;

    C1902c() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1902c(C1322k c1322k) {
        super(c1322k == null ? new C1322k() : c1322k);
        this.f5660B = new Paint(1);
        m2545n0();
        this.f5661C = new RectF();
    }

    /* renamed from: h0 */
    private void m2551h0(Canvas canvas) {
        if (m2544o0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f5662D);
    }

    /* renamed from: i0 */
    private void m2550i0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!m2544o0(callback)) {
            m2548k0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    /* renamed from: k0 */
    private void m2548k0(Canvas canvas) {
        this.f5662D = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    /* renamed from: n0 */
    private void m2545n0() {
        this.f5660B.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5660B.setColor(-1);
        this.f5660B.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: o0 */
    private boolean m2544o0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m2550i0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f5661C, this.f5660B);
        m2551h0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public boolean m2552g0() {
        return !this.f5661C.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void m2549j0() {
        m2547l0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: l0 */
    void m2547l0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f5661C;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        this.f5661C.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void m2546m0(RectF rectF) {
        m2547l0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
