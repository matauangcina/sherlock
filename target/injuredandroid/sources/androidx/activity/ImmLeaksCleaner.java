package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0873h {

    /* renamed from: b */
    private static int f1157b;

    /* renamed from: c */
    private static Field f1158c;

    /* renamed from: d */
    private static Field f1159d;

    /* renamed from: e */
    private static Field f1160e;

    /* renamed from: a */
    private Activity f1161a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f1161a = activity;
    }

    /* renamed from: h */
    private static void m8136h() {
        try {
            f1157b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f1159d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f1160e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f1158c = declaredField3;
            declaredField3.setAccessible(true);
            f1157b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        if (enumC0869a != AbstractC0868e.EnumC0869a.ON_DESTROY) {
            return;
        }
        if (f1157b == 0) {
            m8136h();
        }
        if (f1157b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1161a.getSystemService("input_method");
            try {
                Object obj = f1158c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1159d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1160e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
