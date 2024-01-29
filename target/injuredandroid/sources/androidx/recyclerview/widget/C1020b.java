package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C1020b {

    /* renamed from: a */
    final InterfaceC1022b f3535a;

    /* renamed from: b */
    final C1021a f3536b = new C1021a();

    /* renamed from: c */
    final List<View> f3537c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class C1021a {

        /* renamed from: a */
        long f3538a = 0;

        /* renamed from: b */
        C1021a f3539b;

        C1021a() {
        }

        /* renamed from: c */
        private void m5270c() {
            if (this.f3539b == null) {
                this.f3539b = new C1021a();
            }
        }

        /* renamed from: a */
        void m5272a(int i) {
            if (i < 64) {
                this.f3538a &= ~(1 << i);
                return;
            }
            C1021a c1021a = this.f3539b;
            if (c1021a != null) {
                c1021a.m5272a(i - 64);
            }
        }

        /* renamed from: b */
        int m5271b(int i) {
            C1021a c1021a = this.f3539b;
            return c1021a == null ? i >= 64 ? Long.bitCount(this.f3538a) : Long.bitCount(this.f3538a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3538a & ((1 << i) - 1)) : c1021a.m5271b(i - 64) + Long.bitCount(this.f3538a);
        }

        /* renamed from: d */
        boolean m5269d(int i) {
            if (i < 64) {
                return (this.f3538a & (1 << i)) != 0;
            }
            m5270c();
            return this.f3539b.m5269d(i - 64);
        }

        /* renamed from: e */
        void m5268e(int i, boolean z) {
            if (i >= 64) {
                m5270c();
                this.f3539b.m5268e(i - 64, z);
                return;
            }
            boolean z2 = (this.f3538a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f3538a;
            this.f3538a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                m5265h(i);
            } else {
                m5272a(i);
            }
            if (z2 || this.f3539b != null) {
                m5270c();
                this.f3539b.m5268e(0, z2);
            }
        }

        /* renamed from: f */
        boolean m5267f(int i) {
            if (i >= 64) {
                m5270c();
                return this.f3539b.m5267f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3538a & j) != 0;
            long j2 = this.f3538a & (~j);
            this.f3538a = j2;
            long j3 = j - 1;
            this.f3538a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            C1021a c1021a = this.f3539b;
            if (c1021a != null) {
                if (c1021a.m5269d(0)) {
                    m5265h(63);
                }
                this.f3539b.m5267f(0);
            }
            return z;
        }

        /* renamed from: g */
        void m5266g() {
            this.f3538a = 0L;
            C1021a c1021a = this.f3539b;
            if (c1021a != null) {
                c1021a.m5266g();
            }
        }

        /* renamed from: h */
        void m5265h(int i) {
            if (i < 64) {
                this.f3538a |= 1 << i;
                return;
            }
            m5270c();
            this.f3539b.m5265h(i - 64);
        }

        public String toString() {
            if (this.f3539b == null) {
                return Long.toBinaryString(this.f3538a);
            }
            return this.f3539b.toString() + "xx" + Long.toBinaryString(this.f3538a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1022b {
        /* renamed from: a */
        int mo5264a();

        /* renamed from: b */
        View mo5263b(int i);

        /* renamed from: c */
        void mo5262c(View view);

        /* renamed from: d */
        RecyclerView.AbstractC0974d0 mo5261d(View view);

        /* renamed from: e */
        void mo5260e(int i);

        /* renamed from: f */
        void mo5259f(View view);

        /* renamed from: g */
        void mo5258g(View view, int i);

        /* renamed from: h */
        void mo5257h(int i);

        /* renamed from: i */
        void mo5256i();

        /* renamed from: j */
        void mo5255j(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: k */
        int mo5254k(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1020b(InterfaceC1022b interfaceC1022b) {
        this.f3535a = interfaceC1022b;
    }

    /* renamed from: h */
    private int m5285h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo5264a = this.f3535a.mo5264a();
        int i2 = i;
        while (i2 < mo5264a) {
            int m5271b = i - (i2 - this.f3536b.m5271b(i2));
            if (m5271b == 0) {
                while (this.f3536b.m5269d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m5271b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m5281l(View view) {
        this.f3537c.add(view);
        this.f3535a.mo5262c(view);
    }

    /* renamed from: t */
    private boolean m5273t(View view) {
        if (this.f3537c.remove(view)) {
            this.f3535a.mo5259f(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5292a(View view, int i, boolean z) {
        int mo5264a = i < 0 ? this.f3535a.mo5264a() : m5285h(i);
        this.f3536b.m5268e(mo5264a, z);
        if (z) {
            m5281l(view);
        }
        this.f3535a.mo5258g(view, mo5264a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5291b(View view, boolean z) {
        m5292a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5290c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int mo5264a = i < 0 ? this.f3535a.mo5264a() : m5285h(i);
        this.f3536b.m5268e(mo5264a, z);
        if (z) {
            m5281l(view);
        }
        this.f3535a.mo5255j(view, mo5264a, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5289d(int i) {
        int m5285h = m5285h(i);
        this.f3536b.m5267f(m5285h);
        this.f3535a.mo5260e(m5285h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m5288e(int i) {
        int size = this.f3537c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3537c.get(i2);
            RecyclerView.AbstractC0974d0 mo5261d = this.f3535a.mo5261d(view);
            if (mo5261d.m5707m() == i && !mo5261d.m5700t() && !mo5261d.m5698v()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m5287f(int i) {
        return this.f3535a.mo5263b(m5285h(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m5286g() {
        return this.f3535a.mo5264a() - this.f3537c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m5284i(int i) {
        return this.f3535a.mo5263b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m5283j() {
        return this.f3535a.mo5264a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m5282k(View view) {
        int mo5254k = this.f3535a.mo5254k(view);
        if (mo5254k >= 0) {
            this.f3536b.m5265h(mo5254k);
            m5281l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m5280m(View view) {
        int mo5254k = this.f3535a.mo5254k(view);
        if (mo5254k == -1 || this.f3536b.m5269d(mo5254k)) {
            return -1;
        }
        return mo5254k - this.f3536b.m5271b(mo5254k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m5279n(View view) {
        return this.f3537c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m5278o() {
        this.f3536b.m5266g();
        for (int size = this.f3537c.size() - 1; size >= 0; size--) {
            this.f3535a.mo5259f(this.f3537c.get(size));
            this.f3537c.remove(size);
        }
        this.f3535a.mo5256i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m5277p(View view) {
        int mo5254k = this.f3535a.mo5254k(view);
        if (mo5254k < 0) {
            return;
        }
        if (this.f3536b.m5267f(mo5254k)) {
            m5273t(view);
        }
        this.f3535a.mo5257h(mo5254k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m5276q(int i) {
        int m5285h = m5285h(i);
        View mo5263b = this.f3535a.mo5263b(m5285h);
        if (mo5263b == null) {
            return;
        }
        if (this.f3536b.m5267f(m5285h)) {
            m5273t(mo5263b);
        }
        this.f3535a.mo5257h(m5285h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m5275r(View view) {
        int mo5254k = this.f3535a.mo5254k(view);
        if (mo5254k == -1) {
            m5273t(view);
            return true;
        } else if (this.f3536b.m5269d(mo5254k)) {
            this.f3536b.m5267f(mo5254k);
            m5273t(view);
            this.f3535a.mo5257h(mo5254k);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m5274s(View view) {
        int mo5254k = this.f3535a.mo5254k(view);
        if (mo5254k < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3536b.m5269d(mo5254k)) {
            this.f3536b.m5272a(mo5254k);
            m5273t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3536b.toString() + ", hidden list:" + this.f3537c.size();
    }
}
