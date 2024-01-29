package p000a.p001a.p007n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* renamed from: a.a.n.b */
/* loaded from: classes.dex */
public abstract class AbstractC0030b {

    /* renamed from: f */
    private Object f75f;

    /* renamed from: g */
    private boolean f76g;

    /* renamed from: a.a.n.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0031a {
        /* renamed from: a */
        boolean mo7980a(AbstractC0030b abstractC0030b, Menu menu);

        /* renamed from: b */
        void mo7979b(AbstractC0030b abstractC0030b);

        /* renamed from: c */
        boolean mo7978c(AbstractC0030b abstractC0030b, MenuItem menuItem);

        /* renamed from: d */
        boolean mo7977d(AbstractC0030b abstractC0030b, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo7908c();

    /* renamed from: d */
    public abstract View mo7907d();

    /* renamed from: e */
    public abstract Menu mo7906e();

    /* renamed from: f */
    public abstract MenuInflater mo7905f();

    /* renamed from: g */
    public abstract CharSequence mo7904g();

    /* renamed from: h */
    public Object m9500h() {
        return this.f75f;
    }

    /* renamed from: i */
    public abstract CharSequence mo7903i();

    /* renamed from: j */
    public boolean m9499j() {
        return this.f76g;
    }

    /* renamed from: k */
    public abstract void mo7902k();

    /* renamed from: l */
    public abstract boolean mo7901l();

    /* renamed from: m */
    public abstract void mo7900m(View view);

    /* renamed from: n */
    public abstract void mo7899n(int i);

    /* renamed from: o */
    public abstract void mo7898o(CharSequence charSequence);

    /* renamed from: p */
    public void m9498p(Object obj) {
        this.f75f = obj;
    }

    /* renamed from: q */
    public abstract void mo7897q(int i);

    /* renamed from: r */
    public abstract void mo7896r(CharSequence charSequence);

    /* renamed from: s */
    public void mo7895s(boolean z) {
        this.f76g = z;
    }
}
