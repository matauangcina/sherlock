package p135d.p145t;

import java.util.NoSuchElementException;
import p135d.p136o.AbstractC2666v;
/* renamed from: d.t.b */
/* loaded from: classes.dex */
public final class C2736b extends AbstractC2666v {

    /* renamed from: f */
    private final int f6860f;

    /* renamed from: g */
    private boolean f6861g;

    /* renamed from: h */
    private int f6862h;

    /* renamed from: i */
    private final int f6863i;

    public C2736b(int i, int i2, int i3) {
        this.f6863i = i3;
        this.f6860f = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f6861g = z;
        this.f6862h = z ? i : this.f6860f;
    }

    @Override // p135d.p136o.AbstractC2666v
    /* renamed from: b */
    public int mo853b() {
        int i = this.f6862h;
        if (i != this.f6860f) {
            this.f6862h = this.f6863i + i;
        } else if (!this.f6861g) {
            throw new NoSuchElementException();
        } else {
            this.f6861g = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6861g;
    }
}
