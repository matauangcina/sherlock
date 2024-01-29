package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: a.e.a.j.h */
/* loaded from: classes.dex */
public class C0105h {

    /* renamed from: a */
    public List<C0101f> f476a;

    /* renamed from: b */
    int f477b;

    /* renamed from: c */
    int f478c;

    /* renamed from: d */
    public boolean f479d;

    /* renamed from: e */
    public final int[] f480e;

    /* renamed from: f */
    List<C0101f> f481f;

    /* renamed from: g */
    List<C0101f> f482g;

    /* renamed from: h */
    HashSet<C0101f> f483h;

    /* renamed from: i */
    HashSet<C0101f> f484i;

    /* renamed from: j */
    List<C0101f> f485j;

    /* renamed from: k */
    List<C0101f> f486k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0105h(List<C0101f> list) {
        this.f477b = -1;
        this.f478c = -1;
        this.f479d = false;
        this.f480e = new int[]{-1, -1};
        this.f481f = new ArrayList();
        this.f482g = new ArrayList();
        this.f483h = new HashSet<>();
        this.f484i = new HashSet<>();
        this.f485j = new ArrayList();
        this.f486k = new ArrayList();
        this.f476a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0105h(List<C0101f> list, boolean z) {
        this.f477b = -1;
        this.f478c = -1;
        this.f479d = false;
        this.f480e = new int[]{-1, -1};
        this.f481f = new ArrayList();
        this.f482g = new ArrayList();
        this.f483h = new HashSet<>();
        this.f484i = new HashSet<>();
        this.f485j = new ArrayList();
        this.f486k = new ArrayList();
        this.f476a = list;
        this.f479d = z;
    }

    /* renamed from: e */
    private void m9104e(ArrayList<C0101f> arrayList, C0101f c0101f) {
        if (c0101f.f420d0) {
            return;
        }
        arrayList.add(c0101f);
        c0101f.f420d0 = true;
        if (c0101f.m9186L()) {
            return;
        }
        if (c0101f instanceof C0108j) {
            C0108j c0108j = (C0108j) c0101f;
            int i = c0108j.f495l0;
            for (int i2 = 0; i2 < i; i2++) {
                m9104e(arrayList, c0108j.f494k0[i2]);
            }
        }
        int length = c0101f.f387A.length;
        for (int i3 = 0; i3 < length; i3++) {
            C0096e c0096e = c0101f.f387A[i3].f362d;
            if (c0096e != null) {
                C0101f c0101f2 = c0096e.f360b;
                if (c0096e != null && c0101f2 != c0101f.m9139u()) {
                    m9104e(arrayList, c0101f2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9103f(p000a.p015e.p016a.p017j.C0101f r7) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0105h.m9103f(a.e.a.j.f):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9108a(C0101f c0101f, int i) {
        HashSet<C0101f> hashSet;
        if (i == 0) {
            hashSet = this.f483h;
        } else if (i != 1) {
            return;
        } else {
            hashSet = this.f484i;
        }
        hashSet.add(c0101f);
    }

    /* renamed from: b */
    public List<C0101f> m9107b(int i) {
        if (i == 0) {
            return this.f481f;
        }
        if (i == 1) {
            return this.f482g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C0101f> m9106c(int i) {
        if (i == 0) {
            return this.f483h;
        }
        if (i == 1) {
            return this.f484i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C0101f> m9105d() {
        if (this.f485j.isEmpty()) {
            int size = this.f476a.size();
            for (int i = 0; i < size; i++) {
                C0101f c0101f = this.f476a.get(i);
                if (!c0101f.f416b0) {
                    m9104e((ArrayList) this.f485j, c0101f);
                }
            }
            this.f486k.clear();
            this.f486k.addAll(this.f476a);
            this.f486k.removeAll(this.f485j);
            return this.f485j;
        }
        return this.f485j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m9102g() {
        int size = this.f486k.size();
        for (int i = 0; i < size; i++) {
            m9103f(this.f486k.get(i));
        }
    }
}
