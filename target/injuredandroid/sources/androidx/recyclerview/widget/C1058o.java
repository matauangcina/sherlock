package androidx.recyclerview.widget;

import android.view.View;
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
class C1058o {

    /* renamed from: a */
    final InterfaceC1060b f3676a;

    /* renamed from: b */
    C1059a f3677b = new C1059a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    static class C1059a {

        /* renamed from: a */
        int f3678a = 0;

        /* renamed from: b */
        int f3679b;

        /* renamed from: c */
        int f3680c;

        /* renamed from: d */
        int f3681d;

        /* renamed from: e */
        int f3682e;

        C1059a() {
        }

        /* renamed from: a */
        void m5097a(int i) {
            this.f3678a = i | this.f3678a;
        }

        /* renamed from: b */
        boolean m5096b() {
            int i = this.f3678a;
            if ((i & 7) == 0 || (i & (m5095c(this.f3681d, this.f3679b) << 0)) != 0) {
                int i2 = this.f3678a;
                if ((i2 & 112) == 0 || (i2 & (m5095c(this.f3681d, this.f3680c) << 4)) != 0) {
                    int i3 = this.f3678a;
                    if ((i3 & 1792) == 0 || (i3 & (m5095c(this.f3682e, this.f3679b) << 8)) != 0) {
                        int i4 = this.f3678a;
                        return (i4 & 28672) == 0 || (i4 & (m5095c(this.f3682e, this.f3680c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* renamed from: c */
        int m5095c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        void m5094d() {
            this.f3678a = 0;
        }

        /* renamed from: e */
        void m5093e(int i, int i2, int i3, int i4) {
            this.f3679b = i;
            this.f3680c = i2;
            this.f3681d = i3;
            this.f3682e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: classes.dex */
    interface InterfaceC1060b {
        /* renamed from: a */
        int mo5092a();

        /* renamed from: b */
        View mo5091b(int i);

        /* renamed from: c */
        int mo5090c(View view);

        /* renamed from: d */
        int mo5089d();

        /* renamed from: e */
        int mo5088e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1058o(InterfaceC1060b interfaceC1060b) {
        this.f3676a = interfaceC1060b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m5099a(int i, int i2, int i3, int i4) {
        int mo5089d = this.f3676a.mo5089d();
        int mo5092a = this.f3676a.mo5092a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo5091b = this.f3676a.mo5091b(i);
            this.f3677b.m5093e(mo5089d, mo5092a, this.f3676a.mo5090c(mo5091b), this.f3676a.mo5088e(mo5091b));
            if (i3 != 0) {
                this.f3677b.m5094d();
                this.f3677b.m5097a(i3);
                if (this.f3677b.m5096b()) {
                    return mo5091b;
                }
            }
            if (i4 != 0) {
                this.f3677b.m5094d();
                this.f3677b.m5097a(i4);
                if (this.f3677b.m5096b()) {
                    view = mo5091b;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m5098b(View view, int i) {
        this.f3677b.m5093e(this.f3676a.mo5089d(), this.f3676a.mo5092a(), this.f3676a.mo5090c(view), this.f3676a.mo5088e(view));
        if (i != 0) {
            this.f3677b.m5094d();
            this.f3677b.m5097a(i);
            return this.f3677b.m5096b();
        }
        return false;
    }
}
