package p054b.p059c.p060a.p075b.p082p.p083e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p054b.p059c.p060a.p075b.p080n.C1362a;
import p054b.p059c.p060a.p075b.p082p.C1369c;
import p054b.p059c.p060a.p075b.p082p.InterfaceC1370d;
/* renamed from: b.c.a.b.p.e.a */
/* loaded from: classes.dex */
public class C1376a extends C1362a implements InterfaceC1370d {

    /* renamed from: s */
    private final C1369c f4275s;

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    /* renamed from: a */
    public void mo4293a() {
        this.f4275s.m4308b();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    /* renamed from: b */
    public void mo4292b() {
        this.f4275s.m4309a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C1369c c1369c = this.f4275s;
        if (c1369c != null) {
            c1369c.m4307c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f4275s.m4306d();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public int getCircularRevealScrimColor() {
        return this.f4275s.m4305e();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public InterfaceC1370d.C1375e getRevealInfo() {
        return this.f4275s.m4304f();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C1369c c1369c = this.f4275s;
        return c1369c != null ? c1369c.m4303g() : super.isOpaque();
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f4275s.m4302h(drawable);
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public void setCircularRevealScrimColor(int i) {
        this.f4275s.m4301i(i);
    }

    @Override // p054b.p059c.p060a.p075b.p082p.InterfaceC1370d
    public void setRevealInfo(InterfaceC1370d.C1375e c1375e) {
        this.f4275s.m4300j(c1375e);
    }
}
