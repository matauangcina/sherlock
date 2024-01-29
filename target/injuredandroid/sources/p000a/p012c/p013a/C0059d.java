package p000a.p012c.p013a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p000a.p012c.p013a.C0064h;
/* renamed from: a.c.a.d */
/* loaded from: classes.dex */
class C0059d implements InterfaceC0062f {

    /* renamed from: a */
    final RectF f170a = new RectF();

    /* renamed from: a.c.a.d$a */
    /* loaded from: classes.dex */
    class C0060a implements C0064h.InterfaceC0065a {
        C0060a() {
        }

        @Override // p000a.p012c.p013a.C0064h.InterfaceC0065a
        /* renamed from: a */
        public void mo9400a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0059d.this.f170a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C0059d.this.f170a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0059d.this.f170a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0059d.this.f170a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0059d.this.f170a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    /* renamed from: n */
    private C0064h m9450n(InterfaceC0061e interfaceC0061e) {
        return (C0064h) interfaceC0061e.m9443f();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: a */
    public float mo9442a(InterfaceC0061e interfaceC0061e) {
        return m9450n(interfaceC0061e).m9412i();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: b */
    public ColorStateList mo9441b(InterfaceC0061e interfaceC0061e) {
        return m9450n(interfaceC0061e).m9415f();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: c */
    public void mo9440c(InterfaceC0061e interfaceC0061e, float f) {
        m9450n(interfaceC0061e).m9405p(f);
        m9449o(interfaceC0061e);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: d */
    public float mo9439d(InterfaceC0061e interfaceC0061e) {
        return m9450n(interfaceC0061e).m9409l();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: e */
    public void mo9438e() {
        C0064h.f184r = new C0060a();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: f */
    public float mo9437f(InterfaceC0061e interfaceC0061e) {
        return m9450n(interfaceC0061e).m9414g();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: g */
    public float mo9436g(InterfaceC0061e interfaceC0061e) {
        return m9450n(interfaceC0061e).m9411j();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: h */
    public float mo9435h(InterfaceC0061e interfaceC0061e) {
        return m9450n(interfaceC0061e).m9410k();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: i */
    public void mo9434i(InterfaceC0061e interfaceC0061e) {
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: j */
    public void mo9433j(InterfaceC0061e interfaceC0061e, float f) {
        m9450n(interfaceC0061e).m9403r(f);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: k */
    public void mo9432k(InterfaceC0061e interfaceC0061e) {
        m9450n(interfaceC0061e).m9408m(interfaceC0061e.m9445d());
        m9449o(interfaceC0061e);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: l */
    public void mo9431l(InterfaceC0061e interfaceC0061e, ColorStateList colorStateList) {
        m9450n(interfaceC0061e).m9406o(colorStateList);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: m */
    public void mo9430m(InterfaceC0061e interfaceC0061e, float f) {
        m9450n(interfaceC0061e).m9404q(f);
        m9449o(interfaceC0061e);
    }

    /* renamed from: o */
    public void m9449o(InterfaceC0061e interfaceC0061e) {
        Rect rect = new Rect();
        m9450n(interfaceC0061e).m9413h(rect);
        interfaceC0061e.m9446c((int) Math.ceil(mo9435h(interfaceC0061e)), (int) Math.ceil(mo9436g(interfaceC0061e)));
        interfaceC0061e.m9448a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
