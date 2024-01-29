package androidx.navigation;

import android.os.Bundle;
/* renamed from: androidx.navigation.d */
/* loaded from: classes.dex */
public final class C0904d {

    /* renamed from: a */
    private final AbstractC0934p f3177a;

    /* renamed from: b */
    private final boolean f3178b;

    /* renamed from: c */
    private final boolean f3179c;

    /* renamed from: d */
    private final Object f3180d;

    /* renamed from: androidx.navigation.d$a */
    /* loaded from: classes.dex */
    public static final class C0905a {

        /* renamed from: a */
        private AbstractC0934p<?> f3181a;

        /* renamed from: c */
        private Object f3183c;

        /* renamed from: b */
        private boolean f3182b = false;

        /* renamed from: d */
        private boolean f3184d = false;

        /* renamed from: a */
        public C0904d m6033a() {
            if (this.f3181a == null) {
                this.f3181a = AbstractC0934p.m5909e(this.f3183c);
            }
            return new C0904d(this.f3181a, this.f3182b, this.f3183c, this.f3184d);
        }

        /* renamed from: b */
        public C0905a m6032b(Object obj) {
            this.f3183c = obj;
            this.f3184d = true;
            return this;
        }

        /* renamed from: c */
        public C0905a m6031c(boolean z) {
            this.f3182b = z;
            return this;
        }

        /* renamed from: d */
        public C0905a m6030d(AbstractC0934p<?> abstractC0934p) {
            this.f3181a = abstractC0934p;
            return this;
        }
    }

    C0904d(AbstractC0934p<?> abstractC0934p, boolean z, Object obj, boolean z2) {
        if (!abstractC0934p.m5908f() && z) {
            throw new IllegalArgumentException(abstractC0934p.mo5865c() + " does not allow nullable values");
        } else if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + abstractC0934p.mo5865c() + " has null value but is not nullable.");
        } else {
            this.f3177a = abstractC0934p;
            this.f3178b = z;
            this.f3180d = obj;
            this.f3179c = z2;
        }
    }

    /* renamed from: a */
    public AbstractC0934p<?> m6037a() {
        return this.f3177a;
    }

    /* renamed from: b */
    public boolean m6036b() {
        return this.f3179c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6035c(String str, Bundle bundle) {
        if (this.f3179c) {
            this.f3177a.mo5863i(bundle, str, this.f3180d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m6034d(String str, Bundle bundle) {
        if (!this.f3178b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f3177a.mo5866b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0904d.class != obj.getClass()) {
            return false;
        }
        C0904d c0904d = (C0904d) obj;
        if (this.f3178b == c0904d.f3178b && this.f3179c == c0904d.f3179c && this.f3177a.equals(c0904d.f3177a)) {
            Object obj2 = this.f3180d;
            Object obj3 = c0904d.f3180d;
            return obj2 != null ? obj2.equals(obj3) : obj3 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f3177a.hashCode() * 31) + (this.f3178b ? 1 : 0)) * 31) + (this.f3179c ? 1 : 0)) * 31;
        Object obj = this.f3180d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
