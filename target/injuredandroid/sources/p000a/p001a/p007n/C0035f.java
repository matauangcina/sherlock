package p000a.p001a.p007n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuC0526o;
import androidx.appcompat.view.menu.MenuItemC0513j;
import java.util.ArrayList;
import p000a.p001a.p007n.AbstractC0030b;
import p000a.p014d.C0079g;
import p000a.p019g.p021e.p022a.InterfaceMenuC0139a;
import p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b;
/* renamed from: a.a.n.f */
/* loaded from: classes.dex */
public class C0035f extends ActionMode {

    /* renamed from: a */
    final Context f88a;

    /* renamed from: b */
    final AbstractC0030b f89b;

    /* renamed from: a.a.n.f$a */
    /* loaded from: classes.dex */
    public static class C0036a implements AbstractC0030b.InterfaceC0031a {

        /* renamed from: a */
        final ActionMode.Callback f90a;

        /* renamed from: b */
        final Context f91b;

        /* renamed from: c */
        final ArrayList<C0035f> f92c = new ArrayList<>();

        /* renamed from: d */
        final C0079g<Menu, Menu> f93d = new C0079g<>();

        public C0036a(Context context, ActionMode.Callback callback) {
            this.f91b = context;
            this.f90a = callback;
        }

        /* renamed from: f */
        private Menu m9492f(Menu menu) {
            Menu menu2 = this.f93d.get(menu);
            if (menu2 == null) {
                MenuC0526o menuC0526o = new MenuC0526o(this.f91b, (InterfaceMenuC0139a) menu);
                this.f93d.put(menu, menuC0526o);
                return menuC0526o;
            }
            return menu2;
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: a */
        public boolean mo7980a(AbstractC0030b abstractC0030b, Menu menu) {
            return this.f90a.onPrepareActionMode(m9493e(abstractC0030b), m9492f(menu));
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: b */
        public void mo7979b(AbstractC0030b abstractC0030b) {
            this.f90a.onDestroyActionMode(m9493e(abstractC0030b));
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: c */
        public boolean mo7978c(AbstractC0030b abstractC0030b, MenuItem menuItem) {
            return this.f90a.onActionItemClicked(m9493e(abstractC0030b), new MenuItemC0513j(this.f91b, (InterfaceMenuItemC0140b) menuItem));
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: d */
        public boolean mo7977d(AbstractC0030b abstractC0030b, Menu menu) {
            return this.f90a.onCreateActionMode(m9493e(abstractC0030b), m9492f(menu));
        }

        /* renamed from: e */
        public ActionMode m9493e(AbstractC0030b abstractC0030b) {
            int size = this.f92c.size();
            for (int i = 0; i < size; i++) {
                C0035f c0035f = this.f92c.get(i);
                if (c0035f != null && c0035f.f89b == abstractC0030b) {
                    return c0035f;
                }
            }
            C0035f c0035f2 = new C0035f(this.f91b, abstractC0030b);
            this.f92c.add(c0035f2);
            return c0035f2;
        }
    }

    public C0035f(Context context, AbstractC0030b abstractC0030b) {
        this.f88a = context;
        this.f89b = abstractC0030b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f89b.mo7908c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f89b.mo7907d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0526o(this.f88a, (InterfaceMenuC0139a) this.f89b.mo7906e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f89b.mo7905f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f89b.mo7904g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f89b.m9500h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f89b.mo7903i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f89b.m9499j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f89b.mo7902k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f89b.mo7901l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f89b.mo7900m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f89b.mo7899n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f89b.mo7898o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f89b.m9498p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f89b.mo7897q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f89b.mo7896r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f89b.mo7895s(z);
    }
}
