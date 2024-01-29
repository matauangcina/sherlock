package p054b.p059c.p060a.p075b.p076a0;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: b.c.a.b.a0.a */
/* loaded from: classes.dex */
public final class C1309a implements InterfaceC1311c {

    /* renamed from: a */
    private final float f4096a;

    public C1309a(float f) {
        this.f4096a = f;
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1311c
    /* renamed from: a */
    public float mo4500a(RectF rectF) {
        return this.f4096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1309a) && this.f4096a == ((C1309a) obj).f4096a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4096a)});
    }
}
