package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
/* renamed from: androidx.core.widget.e */
/* loaded from: classes.dex */
public class C0775e {
    /* renamed from: a */
    public static ColorStateList m6652a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof InterfaceC0783l) {
            return ((InterfaceC0783l) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m6651b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof InterfaceC0783l) {
            return ((InterfaceC0783l) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m6650c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 21) {
            if (imageView instanceof InterfaceC0783l) {
                ((InterfaceC0783l) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: d */
    public static void m6649d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 21) {
            if (imageView instanceof InterfaceC0783l) {
                ((InterfaceC0783l) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        imageView.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
