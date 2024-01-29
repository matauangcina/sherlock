package p000a.p019g.p028k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: a.g.k.b */
/* loaded from: classes.dex */
public abstract class AbstractC0212b {

    /* renamed from: a */
    private InterfaceC0214b f684a;

    /* renamed from: a.g.k.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0213a {
    }

    /* renamed from: a.g.k.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0214b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0212b(Context context) {
    }

    /* renamed from: a */
    public boolean mo7777a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo7773b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo7776c();

    /* renamed from: d */
    public View mo7772d(MenuItem menuItem) {
        return mo7776c();
    }

    /* renamed from: e */
    public boolean mo7775e() {
        return false;
    }

    /* renamed from: f */
    public void mo7774f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo7771g() {
        return false;
    }

    /* renamed from: h */
    public void m8803h() {
        this.f684a = null;
    }

    /* renamed from: i */
    public void m8802i(InterfaceC0213a interfaceC0213a) {
    }

    /* renamed from: j */
    public void mo7770j(InterfaceC0214b interfaceC0214b) {
        if (this.f684a != null && interfaceC0214b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f684a = interfaceC0214b;
    }
}
