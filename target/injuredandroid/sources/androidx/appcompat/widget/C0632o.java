package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.InterfaceC0783l;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public class C0632o extends ImageView implements InterfaceC0251r, InterfaceC0783l {

    /* renamed from: f */
    private final C0592e f2122f;

    /* renamed from: g */
    private final C0630n f2123g;

    public C0632o(Context context) {
        this(context, null);
    }

    public C0632o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0632o(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0592e c0592e = new C0592e(this);
        this.f2122f = c0592e;
        c0592e.m7475e(attributeSet, i);
        C0630n c0630n = new C0630n(this);
        this.f2123g = c0630n;
        c0630n.m7319f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            c0592e.m7478b();
        }
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7323b();
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public ColorStateList getSupportImageTintList() {
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            return c0630n.m7322c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public PorterDuff.Mode getSupportImageTintMode() {
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            return c0630n.m7321d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2123g.m7320e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7323b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7323b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7318g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7323b();
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f2122f;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7317h(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0630n c0630n = this.f2123g;
        if (c0630n != null) {
            c0630n.m7316i(mode);
        }
    }
}
