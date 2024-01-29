package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.core.graphics.drawable.C0759a;
import p000a.p001a.C0007h;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b;
import p000a.p019g.p028k.AbstractC0212b;
/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class C0511i implements InterfaceMenuItemC0140b {

    /* renamed from: A */
    private View f1615A;

    /* renamed from: B */
    private AbstractC0212b f1616B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1617C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1619E;

    /* renamed from: a */
    private final int f1620a;

    /* renamed from: b */
    private final int f1621b;

    /* renamed from: c */
    private final int f1622c;

    /* renamed from: d */
    private final int f1623d;

    /* renamed from: e */
    private CharSequence f1624e;

    /* renamed from: f */
    private CharSequence f1625f;

    /* renamed from: g */
    private Intent f1626g;

    /* renamed from: h */
    private char f1627h;

    /* renamed from: j */
    private char f1629j;

    /* renamed from: l */
    private Drawable f1631l;

    /* renamed from: n */
    C0507g f1633n;

    /* renamed from: o */
    private SubMenuC0531r f1634o;

    /* renamed from: p */
    private Runnable f1635p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1636q;

    /* renamed from: r */
    private CharSequence f1637r;

    /* renamed from: s */
    private CharSequence f1638s;

    /* renamed from: z */
    private int f1645z;

    /* renamed from: i */
    private int f1628i = 4096;

    /* renamed from: k */
    private int f1630k = 4096;

    /* renamed from: m */
    private int f1632m = 0;

    /* renamed from: t */
    private ColorStateList f1639t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1640u = null;

    /* renamed from: v */
    private boolean f1641v = false;

    /* renamed from: w */
    private boolean f1642w = false;

    /* renamed from: x */
    private boolean f1643x = false;

    /* renamed from: y */
    private int f1644y = 16;

    /* renamed from: D */
    private boolean f1618D = false;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    class C0512a implements AbstractC0212b.InterfaceC0214b {
        C0512a() {
        }

        @Override // p000a.p019g.p028k.AbstractC0212b.InterfaceC0214b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0511i c0511i = C0511i.this;
            c0511i.f1633n.m7850J(c0511i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0511i(C0507g c0507g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1645z = 0;
        this.f1633n = c0507g;
        this.f1620a = i2;
        this.f1621b = i;
        this.f1622c = i3;
        this.f1623d = i4;
        this.f1624e = charSequence;
        this.f1645z = i5;
    }

    /* renamed from: d */
    private static void m7801d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m7800e(Drawable drawable) {
        if (drawable != null && this.f1643x && (this.f1641v || this.f1642w)) {
            drawable = C0759a.m6744r(drawable).mutate();
            if (this.f1641v) {
                C0759a.m6747o(drawable, this.f1639t);
            }
            if (this.f1642w) {
                C0759a.m6746p(drawable, this.f1640u);
            }
            this.f1643x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m7806A() {
        return this.f1633n.mo7737H() && m7798g() != 0;
    }

    /* renamed from: B */
    public boolean m7805B() {
        return (this.f1645z & 4) == 4;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b
    /* renamed from: a */
    public InterfaceMenuItemC0140b mo7804a(AbstractC0212b abstractC0212b) {
        AbstractC0212b abstractC0212b2 = this.f1616B;
        if (abstractC0212b2 != null) {
            abstractC0212b2.m8803h();
        }
        this.f1615A = null;
        this.f1616B = abstractC0212b;
        this.f1633n.m7849K(true);
        AbstractC0212b abstractC0212b3 = this.f1616B;
        if (abstractC0212b3 != null) {
            abstractC0212b3.mo7770j(new C0512a());
        }
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b
    /* renamed from: b */
    public AbstractC0212b mo7803b() {
        return this.f1616B;
    }

    /* renamed from: c */
    public void m7802c() {
        this.f1633n.m7851I(this);
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1645z & 8) == 0) {
            return false;
        }
        if (this.f1615A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1617C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1633n.mo7734f(this);
        }
        return false;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public boolean expandActionView() {
        if (m7795j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f1617C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1633n.mo7732k(this);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public int m7799f() {
        return this.f1623d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public char m7798g() {
        return this.f1633n.mo7738G() ? this.f1629j : this.f1627h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1615A;
        if (view != null) {
            return view;
        }
        AbstractC0212b abstractC0212b = this.f1616B;
        if (abstractC0212b != null) {
            View mo7772d = abstractC0212b.mo7772d(this);
            this.f1615A = mo7772d;
            return mo7772d;
        }
        return null;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1630k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1629j;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1637r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1621b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1631l;
        if (drawable != null) {
            return m7800e(drawable);
        }
        if (this.f1632m != 0) {
            Drawable m9577d = C0010a.m9577d(this.f1633n.m7814u(), this.f1632m);
            this.f1632m = 0;
            this.f1631l = m9577d;
            return m7800e(m9577d);
        }
        return null;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1639t;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1640u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1626g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1620a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1619E;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1628i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1627h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1622c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1634o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1624e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1625f;
        if (charSequence == null) {
            charSequence = this.f1624e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1638s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m7797h() {
        int i;
        char m7798g = m7798g();
        if (m7798g == 0) {
            return "";
        }
        Resources resources = this.f1633n.m7814u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1633n.m7814u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0007h.abc_prepend_shortcut_label));
        }
        int i2 = this.f1633n.mo7738G() ? this.f1630k : this.f1628i;
        m7801d(sb, i2, 65536, resources.getString(C0007h.abc_menu_meta_shortcut_label));
        m7801d(sb, i2, 4096, resources.getString(C0007h.abc_menu_ctrl_shortcut_label));
        m7801d(sb, i2, 2, resources.getString(C0007h.abc_menu_alt_shortcut_label));
        m7801d(sb, i2, 1, resources.getString(C0007h.abc_menu_shift_shortcut_label));
        m7801d(sb, i2, 4, resources.getString(C0007h.abc_menu_sym_shortcut_label));
        m7801d(sb, i2, 8, resources.getString(C0007h.abc_menu_function_shortcut_label));
        if (m7798g == '\b') {
            i = C0007h.abc_menu_delete_shortcut_label;
        } else if (m7798g == '\n') {
            i = C0007h.abc_menu_enter_shortcut_label;
        } else if (m7798g != ' ') {
            sb.append(m7798g);
            return sb.toString();
        } else {
            i = C0007h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1634o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m7796i(InterfaceC0524n.InterfaceC0525a interfaceC0525a) {
        return (interfaceC0525a == null || !interfaceC0525a.mo2799d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1618D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1644y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1644y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1644y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0212b abstractC0212b = this.f1616B;
        return (abstractC0212b == null || !abstractC0212b.mo7771g()) ? (this.f1644y & 8) == 0 : (this.f1644y & 8) == 0 && this.f1616B.mo7773b();
    }

    /* renamed from: j */
    public boolean m7795j() {
        AbstractC0212b abstractC0212b;
        if ((this.f1645z & 8) != 0) {
            if (this.f1615A == null && (abstractC0212b = this.f1616B) != null) {
                this.f1615A = abstractC0212b.mo7772d(this);
            }
            return this.f1615A != null;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m7794k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1636q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C0507g c0507g = this.f1633n;
            if (c0507g.mo7733h(c0507g, this)) {
                return true;
            }
            Runnable runnable = this.f1635p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1626g != null) {
                try {
                    this.f1633n.m7814u().startActivity(this.f1626g);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            AbstractC0212b abstractC0212b = this.f1616B;
            return abstractC0212b != null && abstractC0212b.mo7775e();
        }
        return true;
    }

    /* renamed from: l */
    public boolean m7793l() {
        return (this.f1644y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m7792m() {
        return (this.f1644y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m7791n() {
        return (this.f1645z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m7790o() {
        return (this.f1645z & 2) == 2;
    }

    /* renamed from: p */
    public InterfaceMenuItemC0140b m7789p(int i) {
        Context m7814u = this.f1633n.m7814u();
        m7788q(LayoutInflater.from(m7814u).inflate(i, (ViewGroup) new LinearLayout(m7814u), false));
        return this;
    }

    /* renamed from: q */
    public InterfaceMenuItemC0140b m7788q(View view) {
        int i;
        this.f1615A = view;
        this.f1616B = null;
        if (view != null && view.getId() == -1 && (i = this.f1620a) > 0) {
            view.setId(i);
        }
        this.f1633n.m7851I(this);
        return this;
    }

    /* renamed from: r */
    public void m7787r(boolean z) {
        this.f1618D = z;
        this.f1633n.m7849K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m7786s(boolean z) {
        int i = this.f1644y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f1644y = i2;
        if (i != i2) {
            this.f1633n.m7849K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        m7789p(i);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m7788q(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1629j == c) {
            return this;
        }
        this.f1629j = Character.toLowerCase(c);
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1629j == c && this.f1630k == i) {
            return this;
        }
        this.f1629j = Character.toLowerCase(c);
        this.f1630k = KeyEvent.normalizeMetaState(i);
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1644y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f1644y = i2;
        if (i != i2) {
            this.f1633n.m7849K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1644y & 4) != 0) {
            this.f1633n.m7841T(this);
        } else {
            m7786s(z);
        }
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public InterfaceMenuItemC0140b setContentDescription(CharSequence charSequence) {
        this.f1637r = charSequence;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1644y = z ? this.f1644y | 16 : this.f1644y & (-17);
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1631l = null;
        this.f1632m = i;
        this.f1643x = true;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1632m = 0;
        this.f1631l = drawable;
        this.f1643x = true;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1639t = colorStateList;
        this.f1641v = true;
        this.f1643x = true;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1640u = mode;
        this.f1642w = true;
        this.f1643x = true;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1626g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1627h == c) {
            return this;
        }
        this.f1627h = c;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1627h == c && this.f1628i == i) {
            return this;
        }
        this.f1627h = c;
        this.f1628i = KeyEvent.normalizeMetaState(i);
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1617C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1636q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1627h = c;
        this.f1629j = Character.toLowerCase(c2);
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1627h = c;
        this.f1628i = KeyEvent.normalizeMetaState(i);
        this.f1629j = Character.toLowerCase(c2);
        this.f1630k = KeyEvent.normalizeMetaState(i2);
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1645z = i;
        this.f1633n.m7851I(this);
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        m7782w(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f1633n.m7814u().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1624e = charSequence;
        this.f1633n.m7849K(false);
        SubMenuC0531r subMenuC0531r = this.f1634o;
        if (subMenuC0531r != null) {
            subMenuC0531r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1625f = charSequence;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // p000a.p019g.p021e.p022a.InterfaceMenuItemC0140b, android.view.MenuItem
    public InterfaceMenuItemC0140b setTooltipText(CharSequence charSequence) {
        this.f1638s = charSequence;
        this.f1633n.m7849K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m7780y(z)) {
            this.f1633n.m7850J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m7785t(boolean z) {
        this.f1644y = (z ? 4 : 0) | (this.f1644y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1624e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m7784u(boolean z) {
        this.f1644y = z ? this.f1644y | 32 : this.f1644y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m7783v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1619E = contextMenuInfo;
    }

    /* renamed from: w */
    public InterfaceMenuItemC0140b m7782w(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m7781x(SubMenuC0531r subMenuC0531r) {
        this.f1634o = subMenuC0531r;
        subMenuC0531r.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m7780y(boolean z) {
        int i = this.f1644y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f1644y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean m7779z() {
        return this.f1633n.m7855A();
    }
}
