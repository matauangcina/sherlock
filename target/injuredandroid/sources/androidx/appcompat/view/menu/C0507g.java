package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0734a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p019g.p021e.p022a.InterfaceMenuC0139a;
import p000a.p019g.p028k.C0264t;
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0507g implements InterfaceMenuC0139a {

    /* renamed from: A */
    private static final int[] f1584A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1585a;

    /* renamed from: b */
    private final Resources f1586b;

    /* renamed from: c */
    private boolean f1587c;

    /* renamed from: d */
    private boolean f1588d;

    /* renamed from: e */
    private InterfaceC0508a f1589e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1597m;

    /* renamed from: n */
    CharSequence f1598n;

    /* renamed from: o */
    Drawable f1599o;

    /* renamed from: p */
    View f1600p;

    /* renamed from: x */
    private C0511i f1608x;

    /* renamed from: z */
    private boolean f1610z;

    /* renamed from: l */
    private int f1596l = 0;

    /* renamed from: q */
    private boolean f1601q = false;

    /* renamed from: r */
    private boolean f1602r = false;

    /* renamed from: s */
    private boolean f1603s = false;

    /* renamed from: t */
    private boolean f1604t = false;

    /* renamed from: u */
    private boolean f1605u = false;

    /* renamed from: v */
    private ArrayList<C0511i> f1606v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0522m>> f1607w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1609y = false;

    /* renamed from: f */
    private ArrayList<C0511i> f1590f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0511i> f1591g = new ArrayList<>();

    /* renamed from: h */
    private boolean f1592h = true;

    /* renamed from: i */
    private ArrayList<C0511i> f1593i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0511i> f1594j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1595k = true;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0508a {
        /* renamed from: a */
        boolean mo7687a(C0507g c0507g, MenuItem menuItem);

        /* renamed from: b */
        void mo7686b(C0507g c0507g);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0509b {
        /* renamed from: a */
        boolean mo7688a(C0511i c0511i);
    }

    public C0507g(Context context) {
        this.f1585a = context;
        this.f1586b = context.getResources();
        m7831b0(true);
    }

    /* renamed from: B */
    private static int m7854B(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1584A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m7846N(int i, boolean z) {
        if (i < 0 || i >= this.f1590f.size()) {
            return;
        }
        this.f1590f.remove(i);
        if (z) {
            m7849K(true);
        }
    }

    /* renamed from: W */
    private void m7838W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m7853C = m7853C();
        if (view != null) {
            this.f1600p = view;
            this.f1598n = null;
            this.f1599o = null;
        } else {
            if (i > 0) {
                this.f1598n = m7853C.getText(i);
            } else if (charSequence != null) {
                this.f1598n = charSequence;
            }
            if (i2 > 0) {
                this.f1599o = C0734a.m6874d(m7814u(), i2);
            } else if (drawable != null) {
                this.f1599o = drawable;
            }
            this.f1600p = null;
        }
        m7849K(false);
    }

    /* renamed from: b0 */
    private void m7831b0(boolean z) {
        boolean z2 = true;
        this.f1588d = (z && this.f1586b.getConfiguration().keyboard != 1 && C0264t.m8547e(ViewConfiguration.get(this.f1585a), this.f1585a)) ? false : false;
    }

    /* renamed from: g */
    private C0511i m7825g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0511i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m7824i(boolean z) {
        if (this.f1607w.isEmpty()) {
            return;
        }
        m7827d0();
        Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0522m> next = it.next();
            InterfaceC0522m interfaceC0522m = next.get();
            if (interfaceC0522m == null) {
                this.f1607w.remove(next);
            } else {
                interfaceC0522m.mo7513f(z);
            }
        }
        m7829c0();
    }

    /* renamed from: j */
    private boolean m7823j(SubMenuC0531r subMenuC0531r, InterfaceC0522m interfaceC0522m) {
        if (this.f1607w.isEmpty()) {
            return false;
        }
        boolean mo7514e = interfaceC0522m != null ? interfaceC0522m.mo7514e(subMenuC0531r) : false;
        Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0522m> next = it.next();
            InterfaceC0522m interfaceC0522m2 = next.get();
            if (interfaceC0522m2 == null) {
                this.f1607w.remove(next);
            } else if (!mo7514e) {
                mo7514e = interfaceC0522m2.mo7514e(subMenuC0531r);
            }
        }
        return mo7514e;
    }

    /* renamed from: n */
    private static int m7820n(ArrayList<C0511i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m7799f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m7855A() {
        return this.f1604t;
    }

    /* renamed from: C */
    Resources m7853C() {
        return this.f1586b;
    }

    /* renamed from: D */
    public C0507g mo7740D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0511i> m7852E() {
        if (this.f1592h) {
            this.f1591g.clear();
            int size = this.f1590f.size();
            for (int i = 0; i < size; i++) {
                C0511i c0511i = this.f1590f.get(i);
                if (c0511i.isVisible()) {
                    this.f1591g.add(c0511i);
                }
            }
            this.f1592h = false;
            this.f1595k = true;
            return this.f1591g;
        }
        return this.f1591g;
    }

    /* renamed from: F */
    public boolean mo7739F() {
        return this.f1609y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo7738G() {
        return this.f1587c;
    }

    /* renamed from: H */
    public boolean mo7737H() {
        return this.f1588d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m7851I(C0511i c0511i) {
        this.f1595k = true;
        m7849K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m7850J(C0511i c0511i) {
        this.f1592h = true;
        m7849K(true);
    }

    /* renamed from: K */
    public void m7849K(boolean z) {
        if (this.f1601q) {
            this.f1602r = true;
            if (z) {
                this.f1603s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f1592h = true;
            this.f1595k = true;
        }
        m7824i(z);
    }

    /* renamed from: L */
    public boolean m7848L(MenuItem menuItem, int i) {
        return m7847M(menuItem, null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        m7826e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return r1;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7847M(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0522m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0511i) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.m7794k()
            a.g.k.b r2 = r7.mo7803b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.mo7777a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.m7795j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.m7826e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.m7826e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.m7814u()
            r9.<init>(r0, r6, r7)
            r7.m7781x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.SubMenuC0531r) r7
            if (r4 == 0) goto L63
            r2.mo7774f(r7)
        L63:
            boolean r7 = r6.m7823j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0507g.m7847M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: O */
    public void m7845O(InterfaceC0522m interfaceC0522m) {
        Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0522m> next = it.next();
            InterfaceC0522m interfaceC0522m2 = next.get();
            if (interfaceC0522m2 == null || interfaceC0522m2 == interfaceC0522m) {
                this.f1607w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m7844P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo7731t());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0531r) item.getSubMenu()).m7844P(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: Q */
    public void m7843Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0531r) item.getSubMenu()).m7843Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo7731t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo7736R(InterfaceC0508a interfaceC0508a) {
        this.f1589e = interfaceC0508a;
    }

    /* renamed from: S */
    public C0507g m7842S(int i) {
        this.f1596l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m7841T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1590f.size();
        m7827d0();
        for (int i = 0; i < size; i++) {
            C0511i c0511i = this.f1590f.get(i);
            if (c0511i.getGroupId() == groupId && c0511i.m7792m() && c0511i.isCheckable()) {
                c0511i.m7786s(c0511i == menuItem);
            }
        }
        m7829c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public C0507g m7840U(int i) {
        m7838W(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public C0507g m7839V(Drawable drawable) {
        m7838W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public C0507g m7837X(int i) {
        m7838W(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0507g m7836Y(CharSequence charSequence) {
        m7838W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0507g m7835Z(View view) {
        m7838W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m7834a(int i, int i2, int i3, CharSequence charSequence) {
        int m7854B = m7854B(i3);
        C0511i m7825g = m7825g(i, i2, i3, m7854B, charSequence, this.f1596l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1597m;
        if (contextMenuInfo != null) {
            m7825g.m7783v(contextMenuInfo);
        }
        ArrayList<C0511i> arrayList = this.f1590f;
        arrayList.add(m7820n(arrayList, m7854B), m7825g);
        m7849K(true);
        return m7825g;
    }

    /* renamed from: a0 */
    public void m7833a0(boolean z) {
        this.f1610z = z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m7834a(0, 0, 0, this.f1586b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m7834a(i, i2, i3, this.f1586b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m7834a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m7834a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1585a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1586b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1586b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0511i c0511i = (C0511i) m7834a(i, i2, i3, charSequence);
        SubMenuC0531r subMenuC0531r = new SubMenuC0531r(this.f1585a, this, c0511i);
        c0511i.m7781x(subMenuC0531r);
        return subMenuC0531r;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m7832b(InterfaceC0522m interfaceC0522m) {
        m7830c(interfaceC0522m, this.f1585a);
    }

    /* renamed from: c */
    public void m7830c(InterfaceC0522m interfaceC0522m, Context context) {
        this.f1607w.add(new WeakReference<>(interfaceC0522m));
        interfaceC0522m.mo7515d(context, this);
        this.f1595k = true;
    }

    /* renamed from: c0 */
    public void m7829c0() {
        this.f1601q = false;
        if (this.f1602r) {
            this.f1602r = false;
            m7849K(this.f1603s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0511i c0511i = this.f1608x;
        if (c0511i != null) {
            mo7734f(c0511i);
        }
        this.f1590f.clear();
        m7849K(true);
    }

    public void clearHeader() {
        this.f1599o = null;
        this.f1598n = null;
        this.f1600p = null;
        m7849K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m7826e(true);
    }

    /* renamed from: d */
    public void m7828d() {
        InterfaceC0508a interfaceC0508a = this.f1589e;
        if (interfaceC0508a != null) {
            interfaceC0508a.mo7686b(this);
        }
    }

    /* renamed from: d0 */
    public void m7827d0() {
        if (this.f1601q) {
            return;
        }
        this.f1601q = true;
        this.f1602r = false;
        this.f1603s = false;
    }

    /* renamed from: e */
    public final void m7826e(boolean z) {
        if (this.f1605u) {
            return;
        }
        this.f1605u = true;
        Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0522m> next = it.next();
            InterfaceC0522m interfaceC0522m = next.get();
            if (interfaceC0522m == null) {
                this.f1607w.remove(next);
            } else {
                interfaceC0522m.mo7517b(this, z);
            }
        }
        this.f1605u = false;
    }

    /* renamed from: f */
    public boolean mo7734f(C0511i c0511i) {
        boolean z = false;
        if (!this.f1607w.isEmpty() && this.f1608x == c0511i) {
            m7827d0();
            Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0522m> next = it.next();
                InterfaceC0522m interfaceC0522m = next.get();
                if (interfaceC0522m == null) {
                    this.f1607w.remove(next);
                } else {
                    z = interfaceC0522m.mo7582i(this, c0511i);
                    if (z) {
                        break;
                    }
                }
            }
            m7829c0();
            if (z) {
                this.f1608x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0511i c0511i = this.f1590f.get(i2);
            if (c0511i.getItemId() == i) {
                return c0511i;
            }
            if (c0511i.hasSubMenu() && (findItem = c0511i.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1590f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo7733h(C0507g c0507g, MenuItem menuItem) {
        InterfaceC0508a interfaceC0508a = this.f1589e;
        return interfaceC0508a != null && interfaceC0508a.mo7687a(c0507g, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1610z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1590f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m7818p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo7732k(C0511i c0511i) {
        boolean z = false;
        if (this.f1607w.isEmpty()) {
            return false;
        }
        m7827d0();
        Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0522m> next = it.next();
            InterfaceC0522m interfaceC0522m = next.get();
            if (interfaceC0522m == null) {
                this.f1607w.remove(next);
            } else {
                z = interfaceC0522m.mo7581j(this, c0511i);
                if (z) {
                    break;
                }
            }
        }
        m7829c0();
        if (z) {
            this.f1608x = c0511i;
        }
        return z;
    }

    /* renamed from: l */
    public int m7822l(int i) {
        return m7821m(i, 0);
    }

    /* renamed from: m */
    public int m7821m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1590f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m7819o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1590f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C0511i m7818p(int i, KeyEvent keyEvent) {
        ArrayList<C0511i> arrayList = this.f1606v;
        arrayList.clear();
        m7817q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo7738G = mo7738G();
        for (int i2 = 0; i2 < size; i2++) {
            C0511i c0511i = arrayList.get(i2);
            char alphabeticShortcut = mo7738G ? c0511i.getAlphabeticShortcut() : c0511i.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (mo7738G && alphabeticShortcut == '\b' && i == 67))) {
                return c0511i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m7848L(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0511i m7818p = m7818p(i, keyEvent);
        boolean m7848L = m7818p != null ? m7848L(m7818p, i2) : false;
        if ((i2 & 2) != 0) {
            m7826e(true);
        }
        return m7848L;
    }

    /* renamed from: q */
    void m7817q(List<C0511i> list, int i, KeyEvent keyEvent) {
        boolean mo7738G = mo7738G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1590f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0511i c0511i = this.f1590f.get(i2);
                if (c0511i.hasSubMenu()) {
                    ((C0507g) c0511i.getSubMenu()).m7817q(list, i, keyEvent);
                }
                char alphabeticShortcut = mo7738G ? c0511i.getAlphabeticShortcut() : c0511i.getNumericShortcut();
                if (((modifiers & 69647) == ((mo7738G ? c0511i.getAlphabeticModifiers() : c0511i.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo7738G && alphabeticShortcut == '\b' && i == 67)) && c0511i.isEnabled()) {
                        list.add(c0511i);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m7816r() {
        ArrayList<C0511i> m7852E = m7852E();
        if (this.f1595k) {
            Iterator<WeakReference<InterfaceC0522m>> it = this.f1607w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0522m> next = it.next();
                InterfaceC0522m interfaceC0522m = next.get();
                if (interfaceC0522m == null) {
                    this.f1607w.remove(next);
                } else {
                    z |= interfaceC0522m.mo7512g();
                }
            }
            if (z) {
                this.f1593i.clear();
                this.f1594j.clear();
                int size = m7852E.size();
                for (int i = 0; i < size; i++) {
                    C0511i c0511i = m7852E.get(i);
                    (c0511i.m7793l() ? this.f1593i : this.f1594j).add(c0511i);
                }
            } else {
                this.f1593i.clear();
                this.f1594j.clear();
                this.f1594j.addAll(m7852E());
            }
            this.f1595k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m7822l = m7822l(i);
        if (m7822l >= 0) {
            int size = this.f1590f.size() - m7822l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1590f.get(m7822l).getGroupId() != i) {
                    break;
                }
                m7846N(m7822l, false);
                i2 = i3;
            }
            m7849K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m7846N(m7819o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0511i> m7815s() {
        m7816r();
        return this.f1593i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1590f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0511i c0511i = this.f1590f.get(i2);
            if (c0511i.getGroupId() == i) {
                c0511i.m7785t(z2);
                c0511i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1609y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1590f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0511i c0511i = this.f1590f.get(i2);
            if (c0511i.getGroupId() == i) {
                c0511i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1590f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0511i c0511i = this.f1590f.get(i2);
            if (c0511i.getGroupId() == i && c0511i.m7780y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m7849K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1587c = z;
        m7849K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1590f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public String mo7731t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m7814u() {
        return this.f1585a;
    }

    /* renamed from: v */
    public C0511i m7813v() {
        return this.f1608x;
    }

    /* renamed from: w */
    public Drawable m7812w() {
        return this.f1599o;
    }

    /* renamed from: x */
    public CharSequence m7811x() {
        return this.f1598n;
    }

    /* renamed from: y */
    public View m7810y() {
        return this.f1600p;
    }

    /* renamed from: z */
    public ArrayList<C0511i> m7809z() {
        m7816r();
        return this.f1594j;
    }
}
