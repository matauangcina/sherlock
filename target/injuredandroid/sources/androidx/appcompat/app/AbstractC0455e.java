package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000a.p014d.C0068b;
/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC0455e {

    /* renamed from: f */
    private static int f1294f = -100;

    /* renamed from: g */
    private static final C0068b<WeakReference<AbstractC0455e>> f1295g = new C0068b<>();

    /* renamed from: h */
    private static final Object f1296h = new Object();

    /* renamed from: E */
    public static void m8069E(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f1294f != i) {
            f1294f = i;
            m8068e();
        }
    }

    /* renamed from: e */
    private static void m8068e() {
        synchronized (f1296h) {
            Iterator<WeakReference<AbstractC0455e>> it = f1295g.iterator();
            while (it.hasNext()) {
                AbstractC0455e abstractC0455e = it.next().get();
                if (abstractC0455e != null) {
                    abstractC0455e.mo8020d();
                }
            }
        }
    }

    /* renamed from: g */
    public static AbstractC0455e m8067g(Activity activity, InterfaceC0454d interfaceC0454d) {
        return new LayoutInflater$Factory2C0456f(activity, interfaceC0454d);
    }

    /* renamed from: h */
    public static AbstractC0455e m8066h(Dialog dialog, InterfaceC0454d interfaceC0454d) {
        return new LayoutInflater$Factory2C0456f(dialog, interfaceC0454d);
    }

    /* renamed from: j */
    public static int m8065j() {
        return f1294f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static void m8064p(AbstractC0455e abstractC0455e) {
        synchronized (f1296h) {
            m8062z(abstractC0455e);
            f1295g.add(new WeakReference<>(abstractC0455e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static void m8063q(AbstractC0455e abstractC0455e) {
        synchronized (f1296h) {
            m8062z(abstractC0455e);
        }
    }

    /* renamed from: z */
    private static void m8062z(AbstractC0455e abstractC0455e) {
        synchronized (f1296h) {
            Iterator<WeakReference<AbstractC0455e>> it = f1295g.iterator();
            while (it.hasNext()) {
                AbstractC0455e abstractC0455e2 = it.next().get();
                if (abstractC0455e2 == abstractC0455e || abstractC0455e2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract boolean mo8061A(int i);

    /* renamed from: B */
    public abstract void mo8059B(int i);

    /* renamed from: C */
    public abstract void mo8057C(View view);

    /* renamed from: D */
    public abstract void mo8055D(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: F */
    public abstract void mo8052F(Toolbar toolbar);

    /* renamed from: G */
    public void mo8050G(int i) {
    }

    /* renamed from: H */
    public abstract void mo8048H(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo8022c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public abstract boolean mo8020d();

    /* renamed from: f */
    public void mo8017f(Context context) {
    }

    /* renamed from: i */
    public abstract <T extends View> T mo8013i(int i);

    /* renamed from: k */
    public int mo8010k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo8008l();

    /* renamed from: m */
    public abstract AbstractC0447a mo8006m();

    /* renamed from: n */
    public abstract void mo8004n();

    /* renamed from: o */
    public abstract void mo8002o();

    /* renamed from: r */
    public abstract void mo7998r(Configuration configuration);

    /* renamed from: s */
    public abstract void mo7996s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo7994t();

    /* renamed from: u */
    public abstract void mo7992u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo7990v();

    /* renamed from: w */
    public abstract void mo7988w(Bundle bundle);

    /* renamed from: x */
    public abstract void mo7986x();

    /* renamed from: y */
    public abstract void mo7984y();
}
