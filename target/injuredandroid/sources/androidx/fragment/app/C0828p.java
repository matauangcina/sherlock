package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0889t;
import androidx.lifecycle.C0890u;
import androidx.lifecycle.C0894v;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C0828p extends AbstractC0889t {

    /* renamed from: h */
    private static final C0890u.InterfaceC0891a f2973h = new C0829a();

    /* renamed from: e */
    private final boolean f2977e;

    /* renamed from: b */
    private final HashMap<String, Fragment> f2974b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C0828p> f2975c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0894v> f2976d = new HashMap<>();

    /* renamed from: f */
    private boolean f2978f = false;

    /* renamed from: g */
    private boolean f2979g = false;

    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: classes.dex */
    static class C0829a implements C0890u.InterfaceC0891a {
        C0829a() {
        }

        @Override // androidx.lifecycle.C0890u.InterfaceC0891a
        /* renamed from: a */
        public <T extends AbstractC0889t> T mo5986a(Class<T> cls) {
            return new C0828p(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0828p(boolean z) {
        this.f2977e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C0828p m6293i(C0894v c0894v) {
        return (C0828p) new C0890u(c0894v, f2973h).m6083a(C0828p.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0889t
    /* renamed from: d */
    public void mo5990d() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2978f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m6297e(Fragment fragment) {
        if (this.f2974b.containsKey(fragment.f2808j)) {
            return false;
        }
        this.f2974b.put(fragment.f2808j, fragment);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0828p.class != obj.getClass()) {
            return false;
        }
        C0828p c0828p = (C0828p) obj;
        return this.f2974b.equals(c0828p.f2974b) && this.f2975c.equals(c0828p.f2975c) && this.f2976d.equals(c0828p.f2976d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m6296f(Fragment fragment) {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0828p c0828p = this.f2975c.get(fragment.f2808j);
        if (c0828p != null) {
            c0828p.mo5990d();
            this.f2975c.remove(fragment.f2808j);
        }
        C0894v c0894v = this.f2976d.get(fragment.f2808j);
        if (c0894v != null) {
            c0894v.m6079a();
            this.f2976d.remove(fragment.f2808j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m6295g(String str) {
        return this.f2974b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C0828p m6294h(Fragment fragment) {
        C0828p c0828p = this.f2975c.get(fragment.f2808j);
        if (c0828p == null) {
            C0828p c0828p2 = new C0828p(this.f2977e);
            this.f2975c.put(fragment.f2808j, c0828p2);
            return c0828p2;
        }
        return c0828p;
    }

    public int hashCode() {
        return (((this.f2974b.hashCode() * 31) + this.f2975c.hashCode()) * 31) + this.f2976d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<Fragment> m6292j() {
        return this.f2974b.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C0894v m6291k(Fragment fragment) {
        C0894v c0894v = this.f2976d.get(fragment.f2808j);
        if (c0894v == null) {
            C0894v c0894v2 = new C0894v();
            this.f2976d.put(fragment.f2808j, c0894v2);
            return c0894v2;
        }
        return c0894v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m6290l() {
        return this.f2978f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m6289m(Fragment fragment) {
        return this.f2974b.remove(fragment.f2808j) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m6288n(Fragment fragment) {
        if (this.f2974b.containsKey(fragment.f2808j)) {
            return this.f2977e ? this.f2978f : !this.f2979g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2974b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2975c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2976d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
