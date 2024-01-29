package p000a.p019g.p020d;

import android.graphics.Insets;
import android.graphics.Rect;
/* renamed from: a.g.d.b */
/* loaded from: classes.dex */
public final class C0123b {

    /* renamed from: e */
    public static final C0123b f522e = new C0123b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f523a;

    /* renamed from: b */
    public final int f524b;

    /* renamed from: c */
    public final int f525c;

    /* renamed from: d */
    public final int f526d;

    private C0123b(int i, int i2, int i3, int i4) {
        this.f523a = i;
        this.f524b = i2;
        this.f525c = i3;
        this.f526d = i4;
    }

    /* renamed from: a */
    public static C0123b m9047a(C0123b c0123b, C0123b c0123b2) {
        return m9046b(Math.max(c0123b.f523a, c0123b2.f523a), Math.max(c0123b.f524b, c0123b2.f524b), Math.max(c0123b.f525c, c0123b2.f525c), Math.max(c0123b.f526d, c0123b2.f526d));
    }

    /* renamed from: b */
    public static C0123b m9046b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f522e : new C0123b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0123b m9045c(Rect rect) {
        return m9046b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0123b m9044d(Insets insets) {
        return m9046b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m9043e() {
        return Insets.of(this.f523a, this.f524b, this.f525c, this.f526d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0123b.class != obj.getClass()) {
            return false;
        }
        C0123b c0123b = (C0123b) obj;
        return this.f526d == c0123b.f526d && this.f523a == c0123b.f523a && this.f525c == c0123b.f525c && this.f524b == c0123b.f524b;
    }

    public int hashCode() {
        return (((((this.f523a * 31) + this.f524b) * 31) + this.f525c) * 31) + this.f526d;
    }

    public String toString() {
        return "Insets{left=" + this.f523a + ", top=" + this.f524b + ", right=" + this.f525c + ", bottom=" + this.f526d + '}';
    }
}
