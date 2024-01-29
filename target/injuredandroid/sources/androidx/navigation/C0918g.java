package androidx.navigation;

import androidx.lifecycle.AbstractC0889t;
import androidx.lifecycle.C0890u;
import androidx.lifecycle.C0894v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
/* renamed from: androidx.navigation.g */
/* loaded from: classes.dex */
class C0918g extends AbstractC0889t {

    /* renamed from: c */
    private static final C0890u.InterfaceC0891a f3215c = new C0919a();

    /* renamed from: b */
    private final HashMap<UUID, C0894v> f3216b = new HashMap<>();

    /* renamed from: androidx.navigation.g$a */
    /* loaded from: classes.dex */
    class C0919a implements C0890u.InterfaceC0891a {
        C0919a() {
        }

        @Override // androidx.lifecycle.C0890u.InterfaceC0891a
        /* renamed from: a */
        public <T extends AbstractC0889t> T mo5986a(Class<T> cls) {
            return new C0918g();
        }
    }

    C0918g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C0918g m5988f(C0894v c0894v) {
        return (C0918g) new C0890u(c0894v, f3215c).m6083a(C0918g.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0889t
    /* renamed from: d */
    public void mo5990d() {
        for (C0894v c0894v : this.f3216b.values()) {
            c0894v.m6079a();
        }
        this.f3216b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5989e(UUID uuid) {
        C0894v remove = this.f3216b.remove(uuid);
        if (remove != null) {
            remove.m6079a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0894v m5987g(UUID uuid) {
        C0894v c0894v = this.f3216b.get(uuid);
        if (c0894v == null) {
            C0894v c0894v2 = new C0894v();
            this.f3216b.put(uuid, c0894v2);
            return c0894v2;
        }
        return c0894v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f3216b.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
