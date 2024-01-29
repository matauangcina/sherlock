package androidx.core.graphics;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    private Insets(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    /* renamed from: of */
    public static Insets m35of(int left, int top, int right, int bottom) {
        if (left == 0 && top == 0 && right == 0 && bottom == 0) {
            return NONE;
        }
        return new Insets(left, top, right, bottom);
    }

    /* renamed from: of */
    public static Insets m34of(Rect r) {
        return m35of(r.left, r.top, r.right, r.bottom);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Insets insets = (Insets) o;
        if (this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.left;
        return (((((result * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    @Deprecated
    public static Insets wrap(android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return m35of(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets toPlatformInsets() {
        return android.graphics.Insets.of(this.left, this.top, this.right, this.bottom);
    }
}
