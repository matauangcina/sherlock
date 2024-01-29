package p054b.p059c.p060a.p075b.p082p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p054b.p059c.p060a.p075b.p082p.InterfaceC1370d;
/* renamed from: b.c.a.b.p.b */
/* loaded from: classes.dex */
public class C1368b extends FrameLayout implements InterfaceC1370d {

    /* renamed from: f */
    private final C1369c f4266f;

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    /* renamed from: a */
    public void mo4293a() {
        this.f4266f.m4308b();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    /* renamed from: b */
    public void mo4292b() {
        this.f4266f.m4309a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C1369c c1369c = this.f4266f;
        if (c1369c != null) {
            c1369c.m4307c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f4266f.m4306d();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public int getCircularRevealScrimColor() {
        return this.f4266f.m4305e();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public InterfaceC1370d.C1375e getRevealInfo() {
        return this.f4266f.m4304f();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C1369c c1369c = this.f4266f;
        return c1369c != null ? c1369c.m4303g() : super.isOpaque();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f4266f.m4302h(drawable);
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public void setCircularRevealScrimColor(int i) {
        this.f4266f.m4301i(i);
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public void setRevealInfo(InterfaceC1370d.C1375e c1375e) {
        this.f4266f.m4300j(c1375e);
    }
}
