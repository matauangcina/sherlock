package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0507g;
/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public class SubMenuC0531r extends C0507g implements SubMenu {

    /* renamed from: B */
    private C0507g f1695B;

    /* renamed from: C */
    private C0511i f1696C;

    public SubMenuC0531r(Context context, C0507g c0507g, C0511i c0511i) {
        super(context);
        this.f1695B = c0507g;
        this.f1696C = c0511i;
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: D */
    public C0507g mo7740D() {
        return this.f1695B.mo7740D();
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: F */
    public boolean mo7739F() {
        return this.f1695B.mo7739F();
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: G */
    public boolean mo7738G() {
        return this.f1695B.mo7738G();
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: H */
    public boolean mo7737H() {
        return this.f1695B.mo7737H();
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: R */
    public void mo7736R(C0507g.InterfaceC0508a interfaceC0508a) {
        this.f1695B.mo7736R(interfaceC0508a);
    }

    /* renamed from: e0 */
    public Menu m7735e0() {
        return this.f1695B;
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: f */
    public boolean mo7734f(C0511i c0511i) {
        return this.f1695B.mo7734f(c0511i);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1696C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: h */
    public boolean mo7733h(C0507g c0507g, MenuItem menuItem) {
        return super.mo7733h(c0507g, menuItem) || this.f1695B.mo7733h(c0507g, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: k */
    public boolean mo7732k(C0511i c0511i) {
        return this.f1695B.mo7732k(c0511i);
    }

    @Override // androidx.appcompat.view.menu.C0507g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1695B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.m7840U(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m7839V(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.m7837X(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m7836Y(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m7835Z(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1696C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1696C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0507g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1695B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0507g
    /* renamed from: t */
    public String mo7731t() {
        C0511i c0511i = this.f1696C;
        int itemId = c0511i != null ? c0511i.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo7731t() + ":" + itemId;
    }
}
