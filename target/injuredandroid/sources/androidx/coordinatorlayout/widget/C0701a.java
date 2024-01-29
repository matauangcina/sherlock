package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000a.p014d.C0079g;
import p000a.p019g.p027j.C0192g;
import p000a.p019g.p027j.InterfaceC0191f;
/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0701a<T> {

    /* renamed from: a */
    private final InterfaceC0191f<ArrayList<T>> f2525a = new C0192g(10);

    /* renamed from: b */
    private final C0079g<T, ArrayList<T>> f2526b = new C0079g<>();

    /* renamed from: c */
    private final ArrayList<T> f2527c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2528d = new HashSet<>();

    /* renamed from: e */
    private void m7007e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f2526b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m7007e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    /* renamed from: f */
    private ArrayList<T> m7006f() {
        ArrayList<T> mo8869b = this.f2525a.mo8869b();
        return mo8869b == null ? new ArrayList<>() : mo8869b;
    }

    /* renamed from: k */
    private void m7001k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2525a.mo8870a(arrayList);
    }

    /* renamed from: a */
    public void m7011a(T t, T t2) {
        if (!this.f2526b.containsKey(t) || !this.f2526b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f2526b.get(t);
        if (arrayList == null) {
            arrayList = m7006f();
            this.f2526b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void m7010b(T t) {
        if (this.f2526b.containsKey(t)) {
            return;
        }
        this.f2526b.put(t, null);
    }

    /* renamed from: c */
    public void m7009c() {
        int size = this.f2526b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m9330m = this.f2526b.m9330m(i);
            if (m9330m != null) {
                m7001k(m9330m);
            }
        }
        this.f2526b.clear();
    }

    /* renamed from: d */
    public boolean m7008d(T t) {
        return this.f2526b.containsKey(t);
    }

    /* renamed from: g */
    public List m7005g(T t) {
        return this.f2526b.get(t);
    }

    /* renamed from: h */
    public List<T> m7004h(T t) {
        int size = this.f2526b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m9330m = this.f2526b.m9330m(i);
            if (m9330m != null && m9330m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2526b.m9334i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m7003i() {
        this.f2527c.clear();
        this.f2528d.clear();
        int size = this.f2526b.size();
        for (int i = 0; i < size; i++) {
            m7007e(this.f2526b.m9334i(i), this.f2527c, this.f2528d);
        }
        return this.f2527c;
    }

    /* renamed from: j */
    public boolean m7002j(T t) {
        int size = this.f2526b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m9330m = this.f2526b.m9330m(i);
            if (m9330m != null && m9330m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
