package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p019g.p021e.p022a.InterfaceMenuC0139a;
/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class MenuC0526o extends AbstractC0497c implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC0139a f1671d;

    public MenuC0526o(Context context, InterfaceMenuC0139a interfaceMenuC0139a) {
        super(context);
        if (interfaceMenuC0139a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1671d = interfaceMenuC0139a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m7876c(this.f1671d.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m7876c(this.f1671d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m7876c(this.f1671d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m7876c(this.f1671d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f1671d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m7876c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m7875d(this.f1671d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m7875d(this.f1671d.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m7875d(this.f1671d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m7875d(this.f1671d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m7874e();
        this.f1671d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1671d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m7876c(this.f1671d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m7876c(this.f1671d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1671d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1671d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f1671d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1671d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m7873f(i);
        this.f1671d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m7872g(i);
        this.f1671d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1671d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f1671d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f1671d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1671d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1671d.size();
    }
}
