package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0763e extends C0762d {

    /* renamed from: m */
    private static Method f2699m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0763e(Drawable drawable) {
        super(drawable);
        m6737g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0763e(C0764f c0764f, Resources resources) {
        super(c0764f, resources);
        m6737g();
    }

    /* renamed from: g */
    private void m6737g() {
        if (f2699m == null) {
            try {
                f2699m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C0762d
    /* renamed from: c */
    protected boolean mo6738c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f2698k;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2698k.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2698k.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2698k;
        if (drawable != null && (method = f2699m) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f2698k.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2698k.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.C0762d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.C0762d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTint(int i) {
        if (mo6738c()) {
            super.setTint(i);
        } else {
            this.f2698k.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0762d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        if (mo6738c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2698k.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0762d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo6738c()) {
            super.setTintMode(mode);
        } else {
            this.f2698k.setTintMode(mode);
        }
    }
}
