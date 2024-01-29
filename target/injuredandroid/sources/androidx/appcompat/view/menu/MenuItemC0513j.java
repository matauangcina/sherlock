package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p001a.p007n.InterfaceC0032c;
import p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b;
import p000a.p019g.p028k.AbstractC0212b;
/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public class MenuItemC0513j extends AbstractC0497c implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC0140b f1647d;

    /* renamed from: e */
    private Method f1648e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* loaded from: classes.dex */
    private class C0514a extends AbstractC0212b {

        /* renamed from: b */
        final ActionProvider f1649b;

        C0514a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1649b = actionProvider;
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: a */
        public boolean mo7777a() {
            return this.f1649b.hasSubMenu();
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: c */
        public View mo7776c() {
            return this.f1649b.onCreateActionView();
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: e */
        public boolean mo7775e() {
            return this.f1649b.onPerformDefaultAction();
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: f */
        public void mo7774f(SubMenu subMenu) {
            this.f1649b.onPrepareSubMenu(MenuItemC0513j.this.m7875d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* loaded from: classes.dex */
    private class ActionProvider$VisibilityListenerC0515b extends C0514a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private AbstractC0212b.InterfaceC0214b f1651d;

        ActionProvider$VisibilityListenerC0515b(MenuItemC0513j menuItemC0513j, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: b */
        public boolean mo7773b() {
            return this.f1649b.isVisible();
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: d */
        public View mo7772d(MenuItem menuItem) {
            return this.f1649b.onCreateActionView(menuItem);
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: g */
        public boolean mo7771g() {
            return this.f1649b.overridesItemVisibility();
        }

        @Override // p000a.p019g.p028k.AbstractC0212b
        /* renamed from: j */
        public void mo7770j(AbstractC0212b.InterfaceC0214b interfaceC0214b) {
            this.f1651d = interfaceC0214b;
            this.f1649b.setVisibilityListener(interfaceC0214b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0212b.InterfaceC0214b interfaceC0214b = this.f1651d;
            if (interfaceC0214b != null) {
                interfaceC0214b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* loaded from: classes.dex */
    static class C0516c extends FrameLayout implements InterfaceC0032c {

        /* renamed from: f */
        final CollapsibleActionView f1652f;

        C0516c(View view) {
            super(view.getContext());
            this.f1652f = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m7769a() {
            return (View) this.f1652f;
        }

        @Override // p000a.p001a.p007n.InterfaceC0032c
        /* renamed from: c */
        public void mo7649c() {
            this.f1652f.onActionViewExpanded();
        }

        @Override // p000a.p001a.p007n.InterfaceC0032c
        /* renamed from: f */
        public void mo7645f() {
            this.f1652f.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnActionExpandListenerC0517d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1653a;

        MenuItem$OnActionExpandListenerC0517d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1653a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1653a.onMenuItemActionCollapse(MenuItemC0513j.this.m7876c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1653a.onMenuItemActionExpand(MenuItemC0513j.this.m7876c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0518e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1655a;

        MenuItem$OnMenuItemClickListenerC0518e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1655a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1655a.onMenuItemClick(MenuItemC0513j.this.m7876c(menuItem));
        }
    }

    public MenuItemC0513j(Context context, InterfaceMenuItemC0140b interfaceMenuItemC0140b) {
        super(context);
        if (interfaceMenuItemC0140b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1647d = interfaceMenuItemC0140b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1647d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1647d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0212b mo7803b = this.f1647d.mo7803b();
        if (mo7803b instanceof C0514a) {
            return ((C0514a) mo7803b).f1649b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1647d.getActionView();
        return actionView instanceof C0516c ? ((C0516c) actionView).m7769a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1647d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1647d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1647d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1647d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1647d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1647d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1647d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1647d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1647d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1647d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1647d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1647d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1647d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m7875d(this.f1647d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1647d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1647d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1647d.getTooltipText();
    }

    /* renamed from: h */
    public void m7778h(boolean z) {
        try {
            if (this.f1648e == null) {
                this.f1648e = this.f1647d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1648e.invoke(this.f1647d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1647d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1647d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1647d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1647d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1647d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1647d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC0212b actionProvider$VisibilityListenerC0515b = Build.VERSION.SDK_INT >= 16 ? new ActionProvider$VisibilityListenerC0515b(this, this.f1527a, actionProvider) : new C0514a(this.f1527a, actionProvider);
        InterfaceMenuItemC0140b interfaceMenuItemC0140b = this.f1647d;
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC0515b = null;
        }
        interfaceMenuItemC0140b.mo7804a(actionProvider$VisibilityListenerC0515b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f1647d.setActionView(i);
        View actionView = this.f1647d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1647d.setActionView(new C0516c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0516c(view);
        }
        this.f1647d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1647d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1647d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1647d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1647d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1647d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1647d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1647d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1647d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1647d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1647d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1647d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1647d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1647d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1647d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC0517d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1647d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0518e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1647d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1647d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f1647d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f1647d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1647d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1647d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1647d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1647d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f1647d.setVisible(z);
    }
}
