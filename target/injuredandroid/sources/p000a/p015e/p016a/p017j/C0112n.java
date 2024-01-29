package p000a.p015e.p016a.p017j;

import java.util.HashSet;
import java.util.Iterator;
/* renamed from: a.e.a.j.n */
/* loaded from: classes.dex */
public class C0112n {

    /* renamed from: a */
    HashSet<C0112n> f509a = new HashSet<>(2);

    /* renamed from: b */
    int f510b = 0;

    /* renamed from: a */
    public void m9070a(C0112n c0112n) {
        this.f509a.add(c0112n);
    }

    /* renamed from: b */
    public void m9069b() {
        this.f510b = 1;
        Iterator<C0112n> it = this.f509a.iterator();
        while (it.hasNext()) {
            it.next().mo9065f();
        }
    }

    /* renamed from: c */
    public void m9068c() {
        this.f510b = 0;
        Iterator<C0112n> it = this.f509a.iterator();
        while (it.hasNext()) {
            it.next().m9068c();
        }
    }

    /* renamed from: d */
    public boolean m9067d() {
        return this.f510b == 1;
    }

    /* renamed from: e */
    public void mo9066e() {
        this.f510b = 0;
        this.f509a.clear();
    }

    /* renamed from: f */
    public void mo9065f() {
    }
}
