package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0868e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public abstract class AbstractC0835t {

    /* renamed from: b */
    int f3000b;

    /* renamed from: c */
    int f3001c;

    /* renamed from: d */
    int f3002d;

    /* renamed from: e */
    int f3003e;

    /* renamed from: f */
    int f3004f;

    /* renamed from: g */
    boolean f3005g;

    /* renamed from: i */
    String f3007i;

    /* renamed from: j */
    int f3008j;

    /* renamed from: k */
    CharSequence f3009k;

    /* renamed from: l */
    int f3010l;

    /* renamed from: m */
    CharSequence f3011m;

    /* renamed from: n */
    ArrayList<String> f3012n;

    /* renamed from: o */
    ArrayList<String> f3013o;

    /* renamed from: q */
    ArrayList<Runnable> f3015q;

    /* renamed from: a */
    ArrayList<C0836a> f2999a = new ArrayList<>();

    /* renamed from: h */
    boolean f3006h = true;

    /* renamed from: p */
    boolean f3014p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.t$a */
    /* loaded from: classes.dex */
    public static final class C0836a {

        /* renamed from: a */
        int f3016a;

        /* renamed from: b */
        Fragment f3017b;

        /* renamed from: c */
        int f3018c;

        /* renamed from: d */
        int f3019d;

        /* renamed from: e */
        int f3020e;

        /* renamed from: f */
        int f3021f;

        /* renamed from: g */
        AbstractC0868e.EnumC0870b f3022g;

        /* renamed from: h */
        AbstractC0868e.EnumC0870b f3023h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0836a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0836a(int i, Fragment fragment) {
            this.f3016a = i;
            this.f3017b = fragment;
            AbstractC0868e.EnumC0870b enumC0870b = AbstractC0868e.EnumC0870b.RESUMED;
            this.f3022g = enumC0870b;
            this.f3023h = enumC0870b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0835t(C0809i c0809i, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public AbstractC0835t m6246b(int i, Fragment fragment, String str) {
        mo6235m(i, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC0835t m6245c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2788K = viewGroup;
        m6246b(viewGroup.getId(), fragment, str);
        return this;
    }

    /* renamed from: d */
    public AbstractC0835t m6244d(Fragment fragment, String str) {
        mo6235m(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6243e(C0836a c0836a) {
        this.f2999a.add(c0836a);
        c0836a.f3018c = this.f3000b;
        c0836a.f3019d = this.f3001c;
        c0836a.f3020e = this.f3002d;
        c0836a.f3021f = this.f3003e;
    }

    /* renamed from: f */
    public AbstractC0835t m6242f(View view, String str) {
        if (C0837u.m6225D()) {
            String m8658E = C0252s.m8658E(view);
            if (m8658E == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f3012n == null) {
                this.f3012n = new ArrayList<>();
                this.f3013o = new ArrayList<>();
            } else if (this.f3013o.contains(str)) {
                throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
            } else if (this.f3012n.contains(m8658E)) {
                throw new IllegalArgumentException("A shared element with the source name '" + m8658E + "' has already been added to the transaction.");
            }
            this.f3012n.add(m8658E);
            this.f3013o.add(str);
        }
        return this;
    }

    /* renamed from: g */
    public AbstractC0835t m6241g(String str) {
        if (this.f3006h) {
            this.f3005g = true;
            this.f3007i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public abstract int mo6240h();

    /* renamed from: i */
    public abstract int mo6239i();

    /* renamed from: j */
    public abstract void mo6238j();

    /* renamed from: k */
    public abstract void mo6237k();

    /* renamed from: l */
    public AbstractC0835t m6236l() {
        if (this.f3005g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3006h = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6235m(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2780C;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2780C + " now " + str);
            }
            fragment.f2780C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.f2778A;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2778A + " now " + i);
            }
            fragment.f2778A = i;
            fragment.f2779B = i;
        }
        m6243e(new C0836a(i2, fragment));
    }

    /* renamed from: n */
    public AbstractC0835t mo6234n(Fragment fragment) {
        m6243e(new C0836a(3, fragment));
        return this;
    }

    /* renamed from: o */
    public AbstractC0835t m6233o(int i, Fragment fragment) {
        m6232p(i, fragment, null);
        return this;
    }

    /* renamed from: p */
    public AbstractC0835t m6232p(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo6235m(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: q */
    public AbstractC0835t m6231q(int i, int i2, int i3, int i4) {
        this.f3000b = i;
        this.f3001c = i2;
        this.f3002d = i3;
        this.f3003e = i4;
        return this;
    }

    /* renamed from: r */
    public AbstractC0835t mo6230r(Fragment fragment) {
        m6243e(new C0836a(8, fragment));
        return this;
    }

    /* renamed from: s */
    public AbstractC0835t m6229s(boolean z) {
        this.f3014p = z;
        return this;
    }
}
