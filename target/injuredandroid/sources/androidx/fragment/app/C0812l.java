package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0814m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class C0812l {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0813a> f2918a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final AbstractC0814m f2919b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes.dex */
    public static final class C0813a {

        /* renamed from: a */
        final AbstractC0814m.AbstractC0820f f2920a;

        /* renamed from: b */
        final boolean f2921b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0812l(AbstractC0814m abstractC0814m) {
        this.f2919b = abstractC0814m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6438a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6438a(fragment, bundle, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6320a(this.f2919b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6437b(Fragment fragment, Context context, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6437b(fragment, context, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6319b(this.f2919b, fragment, context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6436c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6436c(fragment, bundle, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6318c(this.f2919b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6435d(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6435d(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6317d(this.f2919b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6434e(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6434e(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6316e(this.f2919b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m6433f(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6433f(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6315f(this.f2919b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6432g(Fragment fragment, Context context, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6432g(fragment, context, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6314g(this.f2919b, fragment, context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6431h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6431h(fragment, bundle, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6313h(this.f2919b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m6430i(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6430i(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6312i(this.f2919b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m6429j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6429j(fragment, bundle, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6311j(this.f2919b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m6428k(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6428k(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6310k(this.f2919b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m6427l(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6427l(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6309l(this.f2919b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m6426m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6426m(fragment, view, bundle, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6308m(this.f2919b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m6425n(Fragment fragment, boolean z) {
        Fragment m6356i0 = this.f2919b.m6356i0();
        if (m6356i0 != null) {
            m6356i0.m6617C().m6358h0().m6425n(fragment, true);
        }
        Iterator<C0813a> it = this.f2918a.iterator();
        while (it.hasNext()) {
            C0813a next = it.next();
            if (!z || next.f2921b) {
                next.f2920a.m6307n(this.f2919b, fragment);
            }
        }
    }
}
