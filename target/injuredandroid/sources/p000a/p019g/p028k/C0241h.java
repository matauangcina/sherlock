package p000a.p019g.p028k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b;
/* renamed from: a.g.k.h */
/* loaded from: classes.dex */
public final class C0241h {
    /* renamed from: a */
    public static MenuItem m8695a(MenuItem menuItem, AbstractC0212b abstractC0212b) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            return ((InterfaceMenuItemC0140b) menuItem).mo7804a(abstractC0212b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m8694b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            ((InterfaceMenuItemC0140b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: c */
    public static void m8693c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            ((InterfaceMenuItemC0140b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m8692d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            ((InterfaceMenuItemC0140b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m8691e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            ((InterfaceMenuItemC0140b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m8690f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            ((InterfaceMenuItemC0140b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: g */
    public static void m8689g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            ((InterfaceMenuItemC0140b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
