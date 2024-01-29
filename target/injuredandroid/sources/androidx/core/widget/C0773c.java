package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C0773c {

    /* renamed from: a */
    private static Field f2764a;

    /* renamed from: b */
    private static boolean f2765b;

    /* renamed from: a */
    public static Drawable m6657a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2765b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2764a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2765b = true;
        }
        Field field = f2764a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2764a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m6656b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof InterfaceC0781j) {
            return ((InterfaceC0781j) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m6655c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof InterfaceC0781j) {
            ((InterfaceC0781j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m6654d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof InterfaceC0781j) {
            ((InterfaceC0781j) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
