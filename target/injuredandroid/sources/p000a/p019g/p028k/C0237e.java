package p000a.p019g.p028k;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: a.g.k.e */
/* loaded from: classes.dex */
public class C0237e {

    /* renamed from: a */
    private static boolean f709a = false;

    /* renamed from: b */
    private static Method f710b = null;

    /* renamed from: c */
    private static boolean f711c = false;

    /* renamed from: d */
    private static Field f712d;

    /* renamed from: a.g.k.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0238a {
        /* renamed from: b */
        boolean mo6979b(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m8705a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f709a) {
            try {
                f710b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f709a = true;
        }
        Method method = f710b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8704b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m8705a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0252s.m8626f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m8703c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m8700f = m8700f(dialog);
        if (m8700f == null || !m8700f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C0252s.m8626f(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m8702d(View view, KeyEvent keyEvent) {
        return C0252s.m8624g(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m8701e(InterfaceC0238a interfaceC0238a, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC0238a == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? interfaceC0238a.mo6979b(keyEvent) : callback instanceof Activity ? m8704b((Activity) callback, keyEvent) : callback instanceof Dialog ? m8703c((Dialog) callback, keyEvent) : (view != null && C0252s.m8626f(view, keyEvent)) || interfaceC0238a.mo6979b(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m8700f(Dialog dialog) {
        if (!f711c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f712d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f711c = true;
        }
        Field field = f712d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
