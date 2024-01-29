package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p014d.C0066a;
import p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b;
import p000a.p019g.p021e.p022a.InterfaceSubMenuC0141c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public abstract class AbstractC0497c {

    /* renamed from: a */
    final Context f1527a;

    /* renamed from: b */
    private Map<InterfaceMenuItemC0140b, MenuItem> f1528b;

    /* renamed from: c */
    private Map<InterfaceSubMenuC0141c, SubMenu> f1529c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0497c(Context context) {
        this.f1527a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m7876c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC0140b) {
            InterfaceMenuItemC0140b interfaceMenuItemC0140b = (InterfaceMenuItemC0140b) menuItem;
            if (this.f1528b == null) {
                this.f1528b = new C0066a();
            }
            MenuItem menuItem2 = this.f1528b.get(menuItem);
            if (menuItem2 == null) {
                MenuItemC0513j menuItemC0513j = new MenuItemC0513j(this.f1527a, interfaceMenuItemC0140b);
                this.f1528b.put(interfaceMenuItemC0140b, menuItemC0513j);
                return menuItemC0513j;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m7875d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC0141c) {
            InterfaceSubMenuC0141c interfaceSubMenuC0141c = (InterfaceSubMenuC0141c) subMenu;
            if (this.f1529c == null) {
                this.f1529c = new C0066a();
            }
            SubMenu subMenu2 = this.f1529c.get(interfaceSubMenuC0141c);
            if (subMenu2 == null) {
                SubMenuC0532s subMenuC0532s = new SubMenuC0532s(this.f1527a, interfaceSubMenuC0141c);
                this.f1529c.put(interfaceSubMenuC0141c, subMenuC0532s);
                return subMenuC0532s;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m7874e() {
        Map<InterfaceMenuItemC0140b, MenuItem> map = this.f1528b;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuC0141c, SubMenu> map2 = this.f1529c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m7873f(int i) {
        Map<InterfaceMenuItemC0140b, MenuItem> map = this.f1528b;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0140b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m7872g(int i) {
        Map<InterfaceMenuItemC0140b, MenuItem> map = this.f1528b;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0140b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
