package p000a.p001a.p007n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0511i;
import androidx.appcompat.view.menu.MenuItemC0513j;
import androidx.appcompat.widget.C0593e0;
import androidx.appcompat.widget.C0665w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.C0009j;
import p000a.p019g.p021e.p022a.InterfaceMenuC0139a;
import p000a.p019g.p028k.AbstractC0212b;
import p000a.p019g.p028k.C0241h;
/* renamed from: a.a.n.g */
/* loaded from: classes.dex */
public class C0037g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f94e;

    /* renamed from: f */
    static final Class<?>[] f95f;

    /* renamed from: a */
    final Object[] f96a;

    /* renamed from: b */
    final Object[] f97b;

    /* renamed from: c */
    Context f98c;

    /* renamed from: d */
    private Object f99d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.n.g$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC0038a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f100c = {MenuItem.class};

        /* renamed from: a */
        private Object f101a;

        /* renamed from: b */
        private Method f102b;

        public MenuItem$OnMenuItemClickListenerC0038a(Object obj, String str) {
            this.f101a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f102b = cls.getMethod(str, f100c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f102b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f102b.invoke(this.f101a, menuItem)).booleanValue();
                }
                this.f102b.invoke(this.f101a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.n.g$b */
    /* loaded from: classes.dex */
    public class C0039b {

        /* renamed from: A */
        AbstractC0212b f103A;

        /* renamed from: B */
        private CharSequence f104B;

        /* renamed from: C */
        private CharSequence f105C;

        /* renamed from: D */
        private ColorStateList f106D = null;

        /* renamed from: E */
        private PorterDuff.Mode f107E = null;

        /* renamed from: a */
        private Menu f109a;

        /* renamed from: b */
        private int f110b;

        /* renamed from: c */
        private int f111c;

        /* renamed from: d */
        private int f112d;

        /* renamed from: e */
        private int f113e;

        /* renamed from: f */
        private boolean f114f;

        /* renamed from: g */
        private boolean f115g;

        /* renamed from: h */
        private boolean f116h;

        /* renamed from: i */
        private int f117i;

        /* renamed from: j */
        private int f118j;

        /* renamed from: k */
        private CharSequence f119k;

        /* renamed from: l */
        private CharSequence f120l;

        /* renamed from: m */
        private int f121m;

        /* renamed from: n */
        private char f122n;

        /* renamed from: o */
        private int f123o;

        /* renamed from: p */
        private char f124p;

        /* renamed from: q */
        private int f125q;

        /* renamed from: r */
        private int f126r;

        /* renamed from: s */
        private boolean f127s;

        /* renamed from: t */
        private boolean f128t;

        /* renamed from: u */
        private boolean f129u;

        /* renamed from: v */
        private int f130v;

        /* renamed from: w */
        private int f131w;

        /* renamed from: x */
        private String f132x;

        /* renamed from: y */
        private String f133y;

        /* renamed from: z */
        private String f134z;

        public C0039b(Menu menu) {
            this.f109a = menu;
            m9481h();
        }

        /* renamed from: c */
        private char m9486c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m9484e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0037g.this.f98c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m9480i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f127s).setVisible(this.f128t).setEnabled(this.f129u).setCheckable(this.f126r >= 1).setTitleCondensed(this.f120l).setIcon(this.f121m);
            int i = this.f130v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f134z != null) {
                if (C0037g.this.f98c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0038a(C0037g.this.m9490b(), this.f134z));
            }
            boolean z2 = menuItem instanceof C0511i;
            if (z2) {
                C0511i c0511i = (C0511i) menuItem;
            }
            if (this.f126r >= 2) {
                if (z2) {
                    ((C0511i) menuItem).m7785t(true);
                } else if (menuItem instanceof MenuItemC0513j) {
                    ((MenuItemC0513j) menuItem).m7778h(true);
                }
            }
            String str = this.f132x;
            if (str != null) {
                menuItem.setActionView((View) m9484e(str, C0037g.f94e, C0037g.this.f96a));
                z = true;
            }
            int i2 = this.f131w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC0212b abstractC0212b = this.f103A;
            if (abstractC0212b != null) {
                C0241h.m8695a(menuItem, abstractC0212b);
            }
            C0241h.m8693c(menuItem, this.f104B);
            C0241h.m8689g(menuItem, this.f105C);
            C0241h.m8694b(menuItem, this.f122n, this.f123o);
            C0241h.m8690f(menuItem, this.f124p, this.f125q);
            PorterDuff.Mode mode = this.f107E;
            if (mode != null) {
                C0241h.m8691e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f106D;
            if (colorStateList != null) {
                C0241h.m8692d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m9488a() {
            this.f116h = true;
            m9480i(this.f109a.add(this.f110b, this.f117i, this.f118j, this.f119k));
        }

        /* renamed from: b */
        public SubMenu m9487b() {
            this.f116h = true;
            SubMenu addSubMenu = this.f109a.addSubMenu(this.f110b, this.f117i, this.f118j, this.f119k);
            m9480i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m9485d() {
            return this.f116h;
        }

        /* renamed from: f */
        public void m9483f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0037g.this.f98c.obtainStyledAttributes(attributeSet, C0009j.MenuGroup);
            this.f110b = obtainStyledAttributes.getResourceId(C0009j.MenuGroup_android_id, 0);
            this.f111c = obtainStyledAttributes.getInt(C0009j.MenuGroup_android_menuCategory, 0);
            this.f112d = obtainStyledAttributes.getInt(C0009j.MenuGroup_android_orderInCategory, 0);
            this.f113e = obtainStyledAttributes.getInt(C0009j.MenuGroup_android_checkableBehavior, 0);
            this.f114f = obtainStyledAttributes.getBoolean(C0009j.MenuGroup_android_visible, true);
            this.f115g = obtainStyledAttributes.getBoolean(C0009j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m9482g(AttributeSet attributeSet) {
            C0665w0 m7214t = C0665w0.m7214t(C0037g.this.f98c, attributeSet, C0009j.MenuItem);
            this.f117i = m7214t.m7220n(C0009j.MenuItem_android_id, 0);
            this.f118j = (m7214t.m7223k(C0009j.MenuItem_android_menuCategory, this.f111c) & (-65536)) | (m7214t.m7223k(C0009j.MenuItem_android_orderInCategory, this.f112d) & 65535);
            this.f119k = m7214t.m7218p(C0009j.MenuItem_android_title);
            this.f120l = m7214t.m7218p(C0009j.MenuItem_android_titleCondensed);
            this.f121m = m7214t.m7220n(C0009j.MenuItem_android_icon, 0);
            this.f122n = m9486c(m7214t.m7219o(C0009j.MenuItem_android_alphabeticShortcut));
            this.f123o = m7214t.m7223k(C0009j.MenuItem_alphabeticModifiers, 4096);
            this.f124p = m9486c(m7214t.m7219o(C0009j.MenuItem_android_numericShortcut));
            this.f125q = m7214t.m7223k(C0009j.MenuItem_numericModifiers, 4096);
            this.f126r = m7214t.m7216r(C0009j.MenuItem_android_checkable) ? m7214t.m7233a(C0009j.MenuItem_android_checkable, false) : this.f113e;
            this.f127s = m7214t.m7233a(C0009j.MenuItem_android_checked, false);
            this.f128t = m7214t.m7233a(C0009j.MenuItem_android_visible, this.f114f);
            this.f129u = m7214t.m7233a(C0009j.MenuItem_android_enabled, this.f115g);
            this.f130v = m7214t.m7223k(C0009j.MenuItem_showAsAction, -1);
            this.f134z = m7214t.m7219o(C0009j.MenuItem_android_onClick);
            this.f131w = m7214t.m7220n(C0009j.MenuItem_actionLayout, 0);
            this.f132x = m7214t.m7219o(C0009j.MenuItem_actionViewClass);
            String m7219o = m7214t.m7219o(C0009j.MenuItem_actionProviderClass);
            this.f133y = m7219o;
            boolean z = m7219o != null;
            if (z && this.f131w == 0 && this.f132x == null) {
                this.f103A = (AbstractC0212b) m9484e(this.f133y, C0037g.f95f, C0037g.this.f97b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f103A = null;
            }
            this.f104B = m7214t.m7218p(C0009j.MenuItem_contentDescription);
            this.f105C = m7214t.m7218p(C0009j.MenuItem_tooltipText);
            if (m7214t.m7216r(C0009j.MenuItem_iconTintMode)) {
                this.f107E = C0593e0.m7465d(m7214t.m7223k(C0009j.MenuItem_iconTintMode, -1), this.f107E);
            } else {
                this.f107E = null;
            }
            if (m7214t.m7216r(C0009j.MenuItem_iconTint)) {
                this.f106D = m7214t.m7231c(C0009j.MenuItem_iconTint);
            } else {
                this.f106D = null;
            }
            m7214t.m7212v();
            this.f116h = false;
        }

        /* renamed from: h */
        public void m9481h() {
            this.f110b = 0;
            this.f111c = 0;
            this.f112d = 0;
            this.f113e = 0;
            this.f114f = true;
            this.f115g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f94e = clsArr;
        f95f = clsArr;
    }

    public C0037g(Context context) {
        super(context);
        this.f98c = context;
        Object[] objArr = {context};
        this.f96a = objArr;
        this.f97b = objArr;
    }

    /* renamed from: a */
    private Object m9491a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m9491a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.m9481h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.m9485d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.f103A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.mo7777a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.m9487b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.m9488a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.m9483f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.m9482g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        m9489c(r13, r14, r0.m9487b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9489c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            a.a.n.g$b r0 = new a.a.n.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m9481h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m9485d()
            if (r15 != 0) goto Lb9
            a.g.k.b r15 = r0.f103A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo7777a()
            if (r15 == 0) goto L82
            r0.m9487b()
            goto Lb9
        L82:
            r0.m9488a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m9483f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m9482g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m9487b()
            r12.m9489c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p007n.C0037g.m9489c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m9490b() {
        if (this.f99d == null) {
            this.f99d = m9491a(this.f98c);
        }
        return this.f99d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0139a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f98c.getResources().getLayout(i);
                    m9489c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
