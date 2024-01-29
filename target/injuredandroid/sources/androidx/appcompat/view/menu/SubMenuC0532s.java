package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p019g.p021e.p022a.InterfaceSubMenuC0141c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
public class SubMenuC0532s extends MenuC0526o implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC0141c f1697e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0532s(Context context, InterfaceSubMenuC0141c interfaceSubMenuC0141c) {
        super(context, interfaceSubMenuC0141c);
        this.f1697e = interfaceSubMenuC0141c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1697e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m7876c(this.f1697e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f1697e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1697e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f1697e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1697e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1697e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1697e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1697e.setIcon(drawable);
        return this;
    }
}
