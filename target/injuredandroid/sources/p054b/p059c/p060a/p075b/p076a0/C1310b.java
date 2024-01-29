package p054b.p059c.p060a.p075b.p076a0;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: b.c.a.b.a0.b */
/* loaded from: classes.dex */
public final class C1310b implements InterfaceC1311c {

    /* renamed from: a */
    private final InterfaceC1311c f4097a;

    /* renamed from: b */
    private final float f4098b;

    public C1310b(float f, InterfaceC1311c interfaceC1311c) {
        while (interfaceC1311c instanceof C1310b) {
            interfaceC1311c = ((C1310b) interfaceC1311c).f4097a;
            f += ((C1310b) interfaceC1311c).f4098b;
        }
        this.f4097a = interfaceC1311c;
        this.f4098b = f;
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1311c
    /* renamed from: a */
    public float mo4500a(RectF rectF) {
        return Math.max(0.0f, this.f4097a.mo4500a(rectF) + this.f4098b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1310b) {
            C1310b c1310b = (C1310b) obj;
            return this.f4097a.equals(c1310b.f4097a) && this.f4098b == c1310b.f4098b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4097a, Float.valueOf(this.f4098b)});
    }
}
