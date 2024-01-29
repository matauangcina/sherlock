package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0606i0;
import p054b.p059c.p060a.p075b.C1349k;
/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public class C1844d extends C0606i0 {

    /* renamed from: u */
    private Drawable f5480u;

    /* renamed from: v */
    private final Rect f5481v;

    /* renamed from: w */
    private final Rect f5482w;

    /* renamed from: x */
    private int f5483x;

    /* renamed from: y */
    protected boolean f5484y;

    /* renamed from: z */
    boolean f5485z;

    public C1844d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1844d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5481v = new Rect();
        this.f5482w = new Rect();
        this.f5483x = 119;
        this.f5484y = true;
        this.f5485z = false;
        TypedArray m2714k = C1851g.m2714k(context, attributeSet, C1349k.ForegroundLinearLayout, i, 0, new int[0]);
        this.f5483x = m2714k.getInt(C1349k.ForegroundLinearLayout_android_foregroundGravity, this.f5483x);
        Drawable drawable = m2714k.getDrawable(C1349k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5484y = m2714k.getBoolean(C1349k.ForegroundLinearLayout_foregroundInsidePadding, true);
        m2714k.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5480u;
        if (drawable != null) {
            if (this.f5485z) {
                this.f5485z = false;
                Rect rect = this.f5481v;
                Rect rect2 = this.f5482w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f5484y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f5483x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f5480u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5480u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5480u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f5480u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5483x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5480u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5485z = z | this.f5485z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5485z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f5480u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5480u);
            }
            this.f5480u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5483x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f5483x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5483x = i;
            if (i == 119 && this.f5480u != null) {
                this.f5480u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5480u;
    }
}
