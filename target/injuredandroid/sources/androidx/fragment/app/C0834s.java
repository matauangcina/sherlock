package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public class C0834s {

    /* renamed from: a */
    private final ArrayList<Fragment> f2997a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0832r> f2998b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6266a(Fragment fragment) {
        if (this.f2997a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2997a) {
            this.f2997a.add(fragment);
        }
        fragment.f2814p = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6265b() {
        this.f2998b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m6264c(String str) {
        return this.f2998b.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6263d(int i) {
        Iterator<Fragment> it = this.f2997a.iterator();
        while (it.hasNext()) {
            C0832r c0832r = this.f2998b.get(it.next().f2808j);
            if (c0832r != null) {
                c0832r.m6269q(i);
            }
        }
        for (C0832r c0832r2 : this.f2998b.values()) {
            if (c0832r2 != null) {
                c0832r2.m6269q(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6262e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2998b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0832r c0832r : this.f2998b.values()) {
                printWriter.print(str);
                if (c0832r != null) {
                    Fragment m6277i = c0832r.m6277i();
                    printWriter.println(m6277i);
                    m6277i.mo3785e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2997a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2997a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m6261f(String str) {
        C0832r c0832r = this.f2998b.get(str);
        if (c0832r != null) {
            return c0832r.m6277i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m6260g(int i) {
        for (int size = this.f2997a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2997a.get(size);
            if (fragment != null && fragment.f2778A == i) {
                return fragment;
            }
        }
        for (C0832r c0832r : this.f2998b.values()) {
            if (c0832r != null) {
                Fragment m6277i = c0832r.m6277i();
                if (m6277i.f2778A == i) {
                    return m6277i;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m6259h(String str) {
        if (str != null) {
            for (int size = this.f2997a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2997a.get(size);
                if (fragment != null && str.equals(fragment.f2780C)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0832r c0832r : this.f2998b.values()) {
                if (c0832r != null) {
                    Fragment m6277i = c0832r.m6277i();
                    if (str.equals(m6277i.f2780C)) {
                        return m6277i;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m6258i(String str) {
        Fragment m6560h;
        for (C0832r c0832r : this.f2998b.values()) {
            if (c0832r != null && (m6560h = c0832r.m6277i().m6560h(str)) != null) {
                return m6560h;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Fragment m6257j(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2788K;
        View view = fragment.f2789L;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f2997a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f2997a.get(indexOf);
                if (fragment2.f2788K == viewGroup && fragment2.f2789L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<Fragment> m6256k() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0832r> it = this.f2998b.values().iterator();
        while (it.hasNext()) {
            C0832r next = it.next();
            arrayList.add(next != null ? next.m6277i() : null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C0832r m6255l(String str) {
        return this.f2998b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Fragment> m6254m() {
        ArrayList arrayList;
        if (this.f2997a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2997a) {
            arrayList = new ArrayList(this.f2997a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m6253n(C0832r c0832r) {
        this.f2998b.put(c0832r.m6277i().f2808j, c0832r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m6252o(C0832r c0832r) {
        Fragment m6277i = c0832r.m6277i();
        for (C0832r c0832r2 : this.f2998b.values()) {
            if (c0832r2 != null) {
                Fragment m6277i2 = c0832r2.m6277i();
                if (m6277i.f2808j.equals(m6277i2.f2811m)) {
                    m6277i2.f2810l = m6277i;
                    m6277i2.f2811m = null;
                }
            }
        }
        this.f2998b.put(m6277i.f2808j, null);
        String str = m6277i.f2811m;
        if (str != null) {
            m6277i.f2810l = m6261f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m6251p(Fragment fragment) {
        synchronized (this.f2997a) {
            this.f2997a.remove(fragment);
        }
        fragment.f2814p = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m6250q() {
        this.f2998b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m6249r(List<String> list) {
        this.f2997a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m6261f = m6261f(str);
                if (m6261f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (AbstractC0814m.m6342p0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m6261f);
                }
                m6266a(m6261f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public ArrayList<C0830q> m6248s() {
        ArrayList<C0830q> arrayList = new ArrayList<>(this.f2998b.size());
        for (C0832r c0832r : this.f2998b.values()) {
            if (c0832r != null) {
                Fragment m6277i = c0832r.m6277i();
                C0830q m6271o = c0832r.m6271o();
                arrayList.add(m6271o);
                if (AbstractC0814m.m6342p0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m6277i + ": " + m6271o.f2992r);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public ArrayList<String> m6247t() {
        synchronized (this.f2997a) {
            if (this.f2997a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2997a.size());
            Iterator<Fragment> it = this.f2997a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2808j);
                if (AbstractC0814m.m6342p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2808j + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
