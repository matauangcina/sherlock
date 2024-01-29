package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
public class C0762d extends Drawable implements Drawable.Callback, InterfaceC0761c, InterfaceC0760b {

    /* renamed from: l */
    static final PorterDuff.Mode f2692l = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    private int f2693f;

    /* renamed from: g */
    private PorterDuff.Mode f2694g;

    /* renamed from: h */
    private boolean f2695h;

    /* renamed from: i */
    C0764f f2696i;

    /* renamed from: j */
    private boolean f2697j;

    /* renamed from: k */
    Drawable f2698k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0762d(Drawable drawable) {
        this.f2696i = m6741d();
        mo6743a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0762d(C0764f c0764f, Resources resources) {
        this.f2696i = c0764f;
        m6740e(resources);
    }

    /* renamed from: d */
    private C0764f m6741d() {
        return new C0764f(this.f2696i);
    }

    /* renamed from: e */
    private void m6740e(Resources resources) {
        Drawable.ConstantState constantState;
        C0764f c0764f = this.f2696i;
        if (c0764f == null || (constantState = c0764f.f2701b) == null) {
            return;
        }
        mo6743a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m6739f(int[] iArr) {
        if (mo6738c()) {
            C0764f c0764f = this.f2696i;
            ColorStateList colorStateList = c0764f.f2702c;
            PorterDuff.Mode mode = c0764f.f2703d;
            if (colorStateList == null || mode == null) {
                this.f2695h = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2695h || colorForState != this.f2693f || mode != this.f2694g) {
                    setColorFilter(colorForState, mode);
                    this.f2693f = colorForState;
                    this.f2694g = mode;
                    this.f2695h = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0761c
    /* renamed from: a */
    public final void mo6743a(Drawable drawable) {
        Drawable drawable2 = this.f2698k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2698k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0764f c0764f = this.f2696i;
            if (c0764f != null) {
                c0764f.f2701b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0761c
    /* renamed from: b */
    public final Drawable mo6742b() {
        return this.f2698k;
    }

    /* renamed from: c */
    protected boolean mo6738c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2698k.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0764f c0764f = this.f2696i;
        return changingConfigurations | (c0764f != null ? c0764f.getChangingConfigurations() : 0) | this.f2698k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0764f c0764f = this.f2696i;
        if (c0764f == null || !c0764f.m6736a()) {
            return null;
        }
        this.f2696i.f2700a = getChangingConfigurations();
        return this.f2696i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2698k.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2698k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2698k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C0759a.m6756f(this.f2698k);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2698k.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2698k.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2698k.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2698k.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2698k.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2698k.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C0759a.m6754h(this.f2698k);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0764f c0764f;
        ColorStateList colorStateList = (!mo6738c() || (c0764f = this.f2696i) == null) ? null : c0764f.f2702c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2698k.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2698k.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2697j && super.mutate() == this) {
            this.f2696i = m6741d();
            Drawable drawable = this.f2698k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0764f c0764f = this.f2696i;
            if (c0764f != null) {
                Drawable drawable2 = this.f2698k;
                c0764f.f2701b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2697j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2698k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return C0759a.m6749m(this.f2698k, i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f2698k.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2698k.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        C0759a.m6752j(this.f2698k, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f2698k.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2698k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2698k.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2698k.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m6739f(iArr) || this.f2698k.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        this.f2696i.f2702c = colorStateList;
        m6739f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2696i.f2703d = mode;
        m6739f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2698k.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
