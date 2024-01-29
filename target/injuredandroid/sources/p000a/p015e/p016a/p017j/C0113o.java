package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import p000a.p015e.p016a.p017j.C0096e;
/* renamed from: a.e.a.j.o */
/* loaded from: classes.dex */
public class C0113o {

    /* renamed from: a */
    private int f511a;

    /* renamed from: b */
    private int f512b;

    /* renamed from: c */
    private int f513c;

    /* renamed from: d */
    private int f514d;

    /* renamed from: e */
    private ArrayList<C0114a> f515e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.j.o$a */
    /* loaded from: classes.dex */
    public static class C0114a {

        /* renamed from: a */
        private C0096e f516a;

        /* renamed from: b */
        private C0096e f517b;

        /* renamed from: c */
        private int f518c;

        /* renamed from: d */
        private C0096e.EnumC0099c f519d;

        /* renamed from: e */
        private int f520e;

        public C0114a(C0096e c0096e) {
            this.f516a = c0096e;
            this.f517b = c0096e.m9209i();
            this.f518c = c0096e.m9214d();
            this.f519d = c0096e.m9210h();
            this.f520e = c0096e.m9215c();
        }

        /* renamed from: a */
        public void m9062a(C0101f c0101f) {
            c0101f.mo9092h(this.f516a.m9208j()).m9216b(this.f517b, this.f518c, this.f519d, this.f520e);
        }

        /* renamed from: b */
        public void m9061b(C0101f c0101f) {
            int i;
            C0096e mo9092h = c0101f.mo9092h(this.f516a.m9208j());
            this.f516a = mo9092h;
            if (mo9092h != null) {
                this.f517b = mo9092h.m9209i();
                this.f518c = this.f516a.m9214d();
                this.f519d = this.f516a.m9210h();
                i = this.f516a.m9215c();
            } else {
                this.f517b = null;
                i = 0;
                this.f518c = 0;
                this.f519d = C0096e.EnumC0099c.STRONG;
            }
            this.f520e = i;
        }
    }

    public C0113o(C0101f c0101f) {
        this.f511a = c0101f.m9192G();
        this.f512b = c0101f.m9191H();
        this.f513c = c0101f.m9197D();
        this.f514d = c0101f.m9145r();
        ArrayList<C0096e> mo9091i = c0101f.mo9091i();
        int size = mo9091i.size();
        for (int i = 0; i < size; i++) {
            this.f515e.add(new C0114a(mo9091i.get(i)));
        }
    }

    /* renamed from: a */
    public void m9064a(C0101f c0101f) {
        c0101f.m9198C0(this.f511a);
        c0101f.m9196D0(this.f512b);
        c0101f.m9130y0(this.f513c);
        c0101f.m9171b0(this.f514d);
        int size = this.f515e.size();
        for (int i = 0; i < size; i++) {
            this.f515e.get(i).m9062a(c0101f);
        }
    }

    /* renamed from: b */
    public void m9063b(C0101f c0101f) {
        this.f511a = c0101f.m9192G();
        this.f512b = c0101f.m9191H();
        this.f513c = c0101f.m9197D();
        this.f514d = c0101f.m9145r();
        int size = this.f515e.size();
        for (int i = 0; i < size; i++) {
            this.f515e.get(i).m9061b(c0101f);
        }
    }
}
