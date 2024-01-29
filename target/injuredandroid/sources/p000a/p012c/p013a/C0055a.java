package p000a.p012c.p013a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
/* renamed from: a.c.a.a */
/* loaded from: classes.dex */
public class C0055a extends FrameLayout {

    /* renamed from: j */
    private static final InterfaceC0062f f165j;

    /* renamed from: f */
    private boolean f166f;

    /* renamed from: g */
    private boolean f167g;

    /* renamed from: h */
    final Rect f168h;

    /* renamed from: i */
    private final InterfaceC0061e f169i;

    static {
        int i = Build.VERSION.SDK_INT;
        f165j = i >= 21 ? new C0058c() : i >= 17 ? new C0056b() : new C0059d();
        f165j.mo9438e();
    }

    public ColorStateList getCardBackgroundColor() {
        return f165j.mo9441b(this.f169i);
    }

    public float getCardElevation() {
        return f165j.mo9439d(this.f169i);
    }

    public int getContentPaddingBottom() {
        return this.f168h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f168h.left;
    }

    public int getContentPaddingRight() {
        return this.f168h.right;
    }

    public int getContentPaddingTop() {
        return this.f168h.top;
    }

    public float getMaxCardElevation() {
        return f165j.mo9442a(this.f169i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f167g;
    }

    public float getRadius() {
        return f165j.mo9437f(this.f169i);
    }

    public boolean getUseCompatPadding() {
        return this.f166f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(f165j instanceof C0058c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f165j.mo9435h(this.f169i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f165j.mo9436g(this.f169i)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f165j.mo9431l(this.f169i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f165j.mo9431l(this.f169i, colorStateList);
    }

    public void setCardElevation(float f) {
        f165j.mo9433j(this.f169i, f);
    }

    public void setMaxCardElevation(float f) {
        f165j.mo9430m(this.f169i, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f167g) {
            this.f167g = z;
            f165j.mo9432k(this.f169i);
        }
    }

    public void setRadius(float f) {
        f165j.mo9440c(this.f169i, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f166f != z) {
            this.f166f = z;
            f165j.mo9434i(this.f169i);
        }
    }
}
