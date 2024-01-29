package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0734a;
import androidx.core.graphics.drawable.C0759a;
import p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b;
import p000a.p019g.p028k.AbstractC0212b;
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0495a implements InterfaceMenuItemC0140b {

    /* renamed from: a */
    private final int f1500a;

    /* renamed from: b */
    private final int f1501b;

    /* renamed from: c */
    private final int f1502c;

    /* renamed from: d */
    private CharSequence f1503d;

    /* renamed from: e */
    private CharSequence f1504e;

    /* renamed from: f */
    private Intent f1505f;

    /* renamed from: g */
    private char f1506g;

    /* renamed from: i */
    private char f1508i;

    /* renamed from: k */
    private Drawable f1510k;

    /* renamed from: l */
    private Context f1511l;

    /* renamed from: m */
    private CharSequence f1512m;

    /* renamed from: n */
    private CharSequence f1513n;

    /* renamed from: h */
    private int f1507h = 4096;

    /* renamed from: j */
    private int f1509j = 4096;

    /* renamed from: o */
    private ColorStateList f1514o = null;

    /* renamed from: p */
    private PorterDuff.Mode f1515p = null;

    /* renamed from: q */
    private boolean f1516q = false;

    /* renamed from: r */
    private boolean f1517r = false;

    /* renamed from: s */
    private int f1518s = 16;

    public C0495a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1511l = context;
        this.f1500a = i2;
        this.f1501b = i;
        this.f1502c = i4;
        this.f1503d = charSequence;
    }

    /* renamed from: c */
    private void m7884c() {
        if (this.f1510k != null) {
            if (this.f1516q || this.f1517r) {
                Drawable m6744r = C0759a.m6744r(this.f1510k);
                this.f1510k = m6744r;
                Drawable mutate = m6744r.mutate();
                this.f1510k = mutate;
                if (this.f1516q) {
                    C0759a.m6747o(mutate, this.f1514o);
                }
                if (this.f1517r) {
                    C0759a.m6746p(this.f1510k, this.f1515p);
                }
            }
        }
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b
    /* renamed from: a */
    public InterfaceMenuItemC0140b mo7804a(AbstractC0212b abstractC0212b) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b
    /* renamed from: b */
    public AbstractC0212b mo7803b() {
        return null;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public InterfaceMenuItemC0140b m7883d(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public InterfaceMenuItemC0140b m7882e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public InterfaceMenuItemC0140b m7881f(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1509j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1508i;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1512m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1501b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1510k;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1514o;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1515p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1505f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1500a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1507h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1506g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1502c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1503d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1504e;
        return charSequence != null ? charSequence : this.f1503d;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1513n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1518s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1518s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1518s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1518s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        m7883d(i);
        throw null;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m7882e(view);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1508i = Character.toLowerCase(c);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1508i = Character.toLowerCase(c);
        this.f1509j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1518s = (z ? 1 : 0) | (this.f1518s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1518s = (z ? 2 : 0) | (this.f1518s & (-3));
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public InterfaceMenuItemC0140b setContentDescription(CharSequence charSequence) {
        this.f1512m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1518s = (z ? 16 : 0) | (this.f1518s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1510k = C0734a.m6874d(this.f1511l, i);
        m7884c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1510k = drawable;
        m7884c();
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1514o = colorStateList;
        this.f1516q = true;
        m7884c();
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1515p = mode;
        this.f1517r = true;
        m7884c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1505f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1506g = c;
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1506g = c;
        this.f1507h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1506g = c;
        this.f1508i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1506g = c;
        this.f1507h = KeyEvent.normalizeMetaState(i);
        this.f1508i = Character.toLowerCase(c2);
        this.f1509j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        m7881f(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1503d = this.f1511l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1503d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1504e = charSequence;
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public InterfaceMenuItemC0140b setTooltipText(CharSequence charSequence) {
        this.f1513n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1518s = (this.f1518s & 8) | (z ? 0 : 8);
        return this;
    }
}
