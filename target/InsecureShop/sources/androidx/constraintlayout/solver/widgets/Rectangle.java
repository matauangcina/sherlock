package androidx.constraintlayout.solver.widgets;
/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f20x;

    /* renamed from: y */
    public int f21y;

    public void setBounds(int x, int y, int width, int height) {
        this.f20x = x;
        this.f21y = y;
        this.width = width;
        this.height = height;
    }

    void grow(int w, int h) {
        this.f20x -= w;
        this.f21y -= h;
        this.width += w * 2;
        this.height += h * 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean intersects(Rectangle bounds) {
        int i;
        int i2;
        int i3 = this.f20x;
        int i4 = bounds.f20x;
        return i3 >= i4 && i3 < i4 + bounds.width && (i = this.f21y) >= (i2 = bounds.f21y) && i < i2 + bounds.height;
    }

    public boolean contains(int x, int y) {
        int i;
        int i2 = this.f20x;
        return x >= i2 && x < i2 + this.width && y >= (i = this.f21y) && y < i + this.height;
    }

    public int getCenterX() {
        return (this.f20x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f21y + this.height) / 2;
    }
}
