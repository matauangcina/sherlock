package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.C0925j;
import androidx.navigation.p053v.C0958a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000a.p014d.C0080h;
/* renamed from: androidx.navigation.k */
/* loaded from: classes.dex */
public class C0927k extends C0925j implements Iterable<C0925j> {

    /* renamed from: n */
    final C0080h<C0925j> f3249n;

    /* renamed from: o */
    private int f3250o;

    /* renamed from: p */
    private String f3251p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.k$a */
    /* loaded from: classes.dex */
    public class C0928a implements Iterator<C0925j> {

        /* renamed from: f */
        private int f3252f = -1;

        /* renamed from: g */
        private boolean f3253g = false;

        C0928a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C0925j next() {
            if (hasNext()) {
                this.f3253g = true;
                C0080h<C0925j> c0080h = C0927k.this.f3249n;
                int i = this.f3252f + 1;
                this.f3252f = i;
                return c0080h.m9317m(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3252f + 1 < C0927k.this.f3249n.m9318l();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3253g) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            C0927k.this.f3249n.m9317m(this.f3252f).m5964C(null);
            C0927k.this.f3249n.m9319k(this.f3252f);
            this.f3252f--;
            this.f3253g = false;
        }
    }

    public C0927k(AbstractC0952r<? extends C0927k> abstractC0952r) {
        super(abstractC0952r);
        this.f3249n = new C0080h<>();
    }

    /* renamed from: E */
    public final void m5949E(C0925j c0925j) {
        int m5956s = c0925j.m5956s();
        if (m5956s == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (m5956s == m5956s()) {
            throw new IllegalArgumentException("Destination " + c0925j + " cannot have the same id as graph " + this);
        }
        C0925j m9325e = this.f3249n.m9325e(m5956s);
        if (m9325e == c0925j) {
            return;
        }
        if (c0925j.m5954w() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (m9325e != null) {
            m9325e.m5964C(null);
        }
        c0925j.m5964C(this);
        this.f3249n.m9321i(c0925j.m5956s(), c0925j);
    }

    /* renamed from: F */
    public final C0925j m5948F(int i) {
        return m5947G(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final C0925j m5947G(int i, boolean z) {
        C0925j m9325e = this.f3249n.m9325e(i);
        if (m9325e != null) {
            return m9325e;
        }
        if (!z || m5954w() == null) {
            return null;
        }
        return m5954w().m5948F(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public String m5946H() {
        if (this.f3251p == null) {
            this.f3251p = Integer.toString(this.f3250o);
        }
        return this.f3251p;
    }

    /* renamed from: I */
    public final int m5945I() {
        return this.f3250o;
    }

    /* renamed from: J */
    public final void m5944J(int i) {
        if (i != m5956s()) {
            this.f3250o = i;
            this.f3251p = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i + " cannot use the same id as the graph " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator<C0925j> iterator() {
        return new C0928a();
    }

    @Override // androidx.navigation.C0925j
    /* renamed from: l */
    public String mo5943l() {
        return m5956s() != 0 ? super.mo5943l() : "the root navigation";
    }

    @Override // androidx.navigation.C0925j
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        C0925j m5948F = m5948F(m5945I());
        if (m5948F == null) {
            str = this.f3251p;
            if (str == null) {
                sb.append("0x");
                str = Integer.toHexString(this.f3250o);
            }
        } else {
            sb.append("{");
            sb.append(m5948F.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.navigation.C0925j
    /* renamed from: x */
    public C0925j.C0926a mo5942x(C0924i c0924i) {
        C0925j.C0926a mo5942x = super.mo5942x(c0924i);
        Iterator<C0925j> it = iterator();
        while (it.hasNext()) {
            C0925j.C0926a mo5942x2 = it.next().mo5942x(c0924i);
            if (mo5942x2 != null && (mo5942x == null || mo5942x2.compareTo(mo5942x) > 0)) {
                mo5942x = mo5942x2;
            }
        }
        return mo5942x;
    }

    @Override // androidx.navigation.C0925j
    /* renamed from: y */
    public void mo5941y(Context context, AttributeSet attributeSet) {
        super.mo5941y(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0958a.NavGraphNavigator);
        m5944J(obtainAttributes.getResourceId(C0958a.NavGraphNavigator_startDestination, 0));
        this.f3251p = C0925j.m5957m(context, this.f3250o);
        obtainAttributes.recycle();
    }
}
