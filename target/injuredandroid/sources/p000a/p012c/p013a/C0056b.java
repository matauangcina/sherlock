package p000a.p012c.p013a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p000a.p012c.p013a.C0064h;
/* renamed from: a.c.a.b */
/* loaded from: classes.dex */
class C0056b extends C0059d {

    /* renamed from: a.c.a.b$a */
    /* loaded from: classes.dex */
    class C0057a implements C0064h.InterfaceC0065a {
        C0057a(C0056b c0056b) {
        }

        @Override // p000a.p012c.p013a.C0064h.InterfaceC0065a
        /* renamed from: a */
        public void mo9400a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // p000a.p012c.p013a.C0059d, p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: e */
    public void mo9438e() {
        C0064h.f184r = new C0057a(this);
    }
}
