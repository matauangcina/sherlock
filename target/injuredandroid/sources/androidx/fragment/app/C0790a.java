package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0814m;
import androidx.fragment.app.AbstractC0835t;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;
import p000a.p019g.p027j.C0188c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0790a extends AbstractC0835t implements AbstractC0814m.InterfaceC0822h {

    /* renamed from: r */
    final AbstractC0814m f2846r;

    /* renamed from: s */
    boolean f2847s;

    /* renamed from: t */
    int f2848t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0790a(androidx.fragment.app.AbstractC0814m r3) {
        /*
            r2 = this;
            androidx.fragment.app.i r0 = r3.m6364e0()
            androidx.fragment.app.j<?> r1 = r3.f2942o
            if (r1 == 0) goto L11
            android.content.Context r1 = r1.m6445g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L12
        L11:
            r1 = 0
        L12:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f2848t = r0
            r2.f2846r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0790a.<init>(androidx.fragment.app.m):void");
    }

    /* renamed from: D */
    private static boolean m6520D(AbstractC0835t.C0836a c0836a) {
        Fragment fragment = c0836a.f3017b;
        return (fragment == null || !fragment.f2814p || fragment.f2789L == null || fragment.f2782E || fragment.f2781D || !fragment.m6585T()) ? false : true;
    }

    /* renamed from: A */
    public String m6523A() {
        return this.f3007i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m6522B(int i) {
        int size = this.f2999a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2999a.get(i2).f3017b;
            int i3 = fragment != null ? fragment.f2779B : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m6521C(ArrayList<C0790a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2999a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2999a.get(i4).f3017b;
            int i5 = fragment != null ? fragment.f2779B : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0790a c0790a = arrayList.get(i6);
                    int size2 = c0790a.f2999a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c0790a.f2999a.get(i7).f3017b;
                        if ((fragment2 != null ? fragment2.f2779B : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean m6519E() {
        for (int i = 0; i < this.f2999a.size(); i++) {
            if (m6520D(this.f2999a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public void m6518F() {
        if (this.f3015q != null) {
            for (int i = 0; i < this.f3015q.size(); i++) {
                this.f3015q.get(i).run();
            }
            this.f3015q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m6517G(Fragment.InterfaceC0789e interfaceC0789e) {
        for (int i = 0; i < this.f2999a.size(); i++) {
            AbstractC0835t.C0836a c0836a = this.f2999a.get(i);
            if (m6520D(c0836a)) {
                c0836a.f3017b.m6547n1(interfaceC0789e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public Fragment m6516H(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2999a.size() - 1; size >= 0; size--) {
            AbstractC0835t.C0836a c0836a = this.f2999a.get(size);
            int i = c0836a.f3016a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0836a.f3017b;
                            break;
                        case 10:
                            c0836a.f3023h = c0836a.f3022g;
                            break;
                    }
                }
                arrayList.add(c0836a.f3017b);
            }
            arrayList.remove(c0836a.f3017b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.AbstractC0814m.InterfaceC0822h
    /* renamed from: a */
    public boolean mo6305a(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0814m.m6342p0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f3005g) {
            this.f2846r.m6371b(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: h */
    public int mo6240h() {
        return m6514u(false);
    }

    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: i */
    public int mo6239i() {
        return m6514u(true);
    }

    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: j */
    public void mo6238j() {
        m6236l();
        this.f2846r.m6390R(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: k */
    public void mo6237k() {
        m6236l();
        this.f2846r.m6390R(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: m */
    public void mo6235m(int i, Fragment fragment, String str, int i2) {
        super.mo6235m(i, fragment, str, i2);
        fragment.f2821w = this.f2846r;
    }

    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: n */
    public AbstractC0835t mo6234n(Fragment fragment) {
        AbstractC0814m abstractC0814m = fragment.f2821w;
        if (abstractC0814m == null || abstractC0814m == this.f2846r) {
            super.mo6234n(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0835t
    /* renamed from: r */
    public AbstractC0835t mo6230r(Fragment fragment) {
        AbstractC0814m abstractC0814m;
        if (fragment == null || (abstractC0814m = fragment.f2821w) == null || abstractC0814m == this.f2846r) {
            super.mo6230r(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m6515t(int i) {
        AbstractC0835t.C0836a c0836a;
        if (this.f3005g) {
            if (AbstractC0814m.m6342p0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2999a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f2999a.get(i2).f3017b;
                if (fragment != null) {
                    fragment.f2820v += i;
                    if (AbstractC0814m.m6342p0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0836a.f3017b + " to " + c0836a.f3017b.f2820v);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2848t >= 0) {
            sb.append(" #");
            sb.append(this.f2848t);
        }
        if (this.f3007i != null) {
            sb.append(" ");
            sb.append(this.f3007i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    int m6514u(boolean z) {
        if (this.f2847s) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0814m.m6342p0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0188c("FragmentManager"));
            m6513v("  ", printWriter);
            printWriter.close();
        }
        this.f2847s = true;
        this.f2848t = this.f3005g ? this.f2846r.m6363f() : -1;
        this.f2846r.m6396O(this, z);
        return this.f2848t;
    }

    /* renamed from: v */
    public void m6513v(String str, PrintWriter printWriter) {
        m6512w(str, printWriter, true);
    }

    /* renamed from: w */
    public void m6512w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3007i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2848t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2847s);
            if (this.f3004f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3004f));
            }
            if (this.f3000b != 0 || this.f3001c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3000b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3001c));
            }
            if (this.f3002d != 0 || this.f3003e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3002d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3003e));
            }
            if (this.f3008j != 0 || this.f3009k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3008j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3009k);
            }
            if (this.f3010l != 0 || this.f3011m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3010l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3011m);
            }
        }
        if (this.f2999a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2999a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0835t.C0836a c0836a = this.f2999a.get(i);
            switch (c0836a.f3016a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0836a.f3016a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0836a.f3017b);
            if (z) {
                if (c0836a.f3018c != 0 || c0836a.f3019d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0836a.f3018c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0836a.f3019d));
                }
                if (c0836a.f3020e != 0 || c0836a.f3021f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0836a.f3020e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0836a.f3021f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m6511x() {
        int size = this.f2999a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0835t.C0836a c0836a = this.f2999a.get(i);
            Fragment fragment = c0836a.f3017b;
            if (fragment != null) {
                fragment.m6549m1(this.f3004f);
            }
            switch (c0836a.f3016a) {
                case 1:
                    fragment.m6551l1(c0836a.f3018c);
                    this.f2846r.m6387S0(fragment, false);
                    this.f2846r.m6367d(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0836a.f3016a);
                case 3:
                    fragment.m6551l1(c0836a.f3019d);
                    this.f2846r.m6403K0(fragment);
                    break;
                case 4:
                    fragment.m6551l1(c0836a.f3019d);
                    this.f2846r.m6346n0(fragment);
                    break;
                case 5:
                    fragment.m6551l1(c0836a.f3018c);
                    this.f2846r.m6387S0(fragment, false);
                    this.f2846r.m6379W0(fragment);
                    break;
                case 6:
                    fragment.m6551l1(c0836a.f3019d);
                    this.f2846r.m6341q(fragment);
                    break;
                case 7:
                    fragment.m6551l1(c0836a.f3018c);
                    this.f2846r.m6387S0(fragment, false);
                    this.f2846r.m6359h(fragment);
                    break;
                case 8:
                    this.f2846r.m6383U0(fragment);
                    break;
                case 9:
                    this.f2846r.m6383U0(null);
                    break;
                case 10:
                    this.f2846r.m6385T0(fragment, c0836a.f3023h);
                    break;
            }
            if (!this.f3014p && c0836a.f3016a != 1 && fragment != null) {
                this.f2846r.m6326x0(fragment);
            }
        }
        if (this.f3014p) {
            return;
        }
        AbstractC0814m abstractC0814m = this.f2846r;
        abstractC0814m.m6324y0(abstractC0814m.f2941n, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m6510y(boolean z) {
        for (int size = this.f2999a.size() - 1; size >= 0; size--) {
            AbstractC0835t.C0836a c0836a = this.f2999a.get(size);
            Fragment fragment = c0836a.f3017b;
            if (fragment != null) {
                fragment.m6549m1(AbstractC0814m.m6393P0(this.f3004f));
            }
            switch (c0836a.f3016a) {
                case 1:
                    fragment.m6551l1(c0836a.f3021f);
                    this.f2846r.m6387S0(fragment, true);
                    this.f2846r.m6403K0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0836a.f3016a);
                case 3:
                    fragment.m6551l1(c0836a.f3020e);
                    this.f2846r.m6367d(fragment);
                    break;
                case 4:
                    fragment.m6551l1(c0836a.f3020e);
                    this.f2846r.m6379W0(fragment);
                    break;
                case 5:
                    fragment.m6551l1(c0836a.f3021f);
                    this.f2846r.m6387S0(fragment, true);
                    this.f2846r.m6346n0(fragment);
                    break;
                case 6:
                    fragment.m6551l1(c0836a.f3020e);
                    this.f2846r.m6359h(fragment);
                    break;
                case 7:
                    fragment.m6551l1(c0836a.f3021f);
                    this.f2846r.m6387S0(fragment, true);
                    this.f2846r.m6341q(fragment);
                    break;
                case 8:
                    this.f2846r.m6383U0(null);
                    break;
                case 9:
                    this.f2846r.m6383U0(fragment);
                    break;
                case 10:
                    this.f2846r.m6385T0(fragment, c0836a.f3022g);
                    break;
            }
            if (!this.f3014p && c0836a.f3016a != 3 && fragment != null) {
                this.f2846r.m6326x0(fragment);
            }
        }
        if (this.f3014p || !z) {
            return;
        }
        AbstractC0814m abstractC0814m = this.f2846r;
        abstractC0814m.m6324y0(abstractC0814m.f2941n, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public Fragment m6509z(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2999a.size()) {
            AbstractC0835t.C0836a c0836a = this.f2999a.get(i);
            int i2 = c0836a.f3016a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = c0836a.f3017b;
                    int i3 = fragment3.f2779B;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f2779B == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2999a.add(i, new AbstractC0835t.C0836a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                AbstractC0835t.C0836a c0836a2 = new AbstractC0835t.C0836a(3, fragment4);
                                c0836a2.f3018c = c0836a.f3018c;
                                c0836a2.f3020e = c0836a.f3020e;
                                c0836a2.f3019d = c0836a.f3019d;
                                c0836a2.f3021f = c0836a.f3021f;
                                this.f2999a.add(i, c0836a2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2999a.remove(i);
                        i--;
                    } else {
                        c0836a.f3016a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c0836a.f3017b);
                    Fragment fragment5 = c0836a.f3017b;
                    if (fragment5 == fragment2) {
                        this.f2999a.add(i, new AbstractC0835t.C0836a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2999a.add(i, new AbstractC0835t.C0836a(9, fragment2));
                        i++;
                        fragment2 = c0836a.f3017b;
                    }
                }
                i++;
            }
            arrayList.add(c0836a.f3017b);
            i++;
        }
        return fragment2;
    }
}
