package p054b.p059c.p060a.p075b.p076a0;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: b.c.a.b.a0.i */
/* loaded from: classes.dex */
public final class C1320i implements InterfaceC1311c {

    /* renamed from: a */
    private final float f4146a;

    public C1320i(float f) {
        this.f4146a = f;
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1311c
    /* renamed from: a */
    public float mo4500a(RectF rectF) {
        return this.f4146a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1320i) && this.f4146a == ((C1320i) obj).f4146a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4146a)});
    }
}
