package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.r.k */
/* loaded from: classes.dex */
public abstract class AbstractC2589k<T extends AbstractC2589k> implements InterfaceC2594n {

    /* renamed from: f */
    protected final InterfaceC2594n f6734f;

    /* renamed from: g */
    private String f6735g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.r.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2590a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6736a;

        static {
            int[] iArr = new int[InterfaceC2594n.EnumC2596b.values().length];
            f6736a = iArr;
            try {
                iArr[InterfaceC2594n.EnumC2596b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6736a[InterfaceC2594n.EnumC2596b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.firebase.database.r.k$b */
    /* loaded from: classes.dex */
    public enum EnumC2591b {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2589k(InterfaceC2594n interfaceC2594n) {
        this.f6734f = interfaceC2594n;
    }

    /* renamed from: e */
    private static int m1097e(C2592l c2592l, C2584f c2584f) {
        return Double.valueOf(((Long) c2592l.getValue()).longValue()).compareTo((Double) c2584f.getValue());
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: a */
    public int mo1087a() {
        return 0;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: b */
    public InterfaceC2594n mo1079b(C2570b c2570b) {
        return c2570b.m1158w() ? this.f6734f : C2585g.m1115s();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: c */
    public InterfaceC2594n mo1078c() {
        return this.f6734f;
    }

    /* renamed from: d */
    protected abstract int mo1063d(T t);

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(InterfaceC2594n interfaceC2594n) {
        if (interfaceC2594n.isEmpty()) {
            return 1;
        }
        if (interfaceC2594n instanceof C2573c) {
            return -1;
        }
        return ((this instanceof C2592l) && (interfaceC2594n instanceof C2584f)) ? m1097e((C2592l) this, (C2584f) interfaceC2594n) : ((this instanceof C2584f) && (interfaceC2594n instanceof C2592l)) ? m1097e((C2592l) interfaceC2594n, (C2584f) this) * (-1) : m1094l((AbstractC2589k) interfaceC2594n);
    }

    /* renamed from: g */
    protected abstract EnumC2591b mo1062g();

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public String getHash() {
        if (this.f6735g == null) {
            this.f6735g = C2472l.m1517h(mo1058v(InterfaceC2594n.EnumC2596b.V1));
        }
        return this.f6735g;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: h */
    public InterfaceC2594n mo1086h(C2506l c2506l) {
        return c2506l.isEmpty() ? this : c2506l.m1384x().m1158w() ? this.f6734f : C2585g.m1115s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public String m1095i(InterfaceC2594n.EnumC2596b enumC2596b) {
        int i = C2590a.f6736a[enumC2596b.ordinal()];
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Unknown hash version: " + enumC2596b);
        } else if (this.f6734f.isEmpty()) {
            return "";
        } else {
            return "priority:" + this.f6734f.mo1058v(enumC2596b) + ":";
        }
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<C2593m> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: k */
    public boolean mo1085k() {
        return true;
    }

    /* renamed from: l */
    protected int m1094l(AbstractC2589k<?> abstractC2589k) {
        EnumC2591b mo1062g = mo1062g();
        EnumC2591b mo1062g2 = abstractC2589k.mo1062g();
        return mo1062g.equals(mo1062g2) ? mo1063d(abstractC2589k) : mo1062g.compareTo(mo1062g2);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: n */
    public C2570b mo1084n(C2570b c2570b) {
        return null;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: o */
    public boolean mo1076o(C2570b c2570b) {
        return false;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: p */
    public InterfaceC2594n mo1083p(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return c2570b.m1158w() ? mo1061j(interfaceC2594n) : interfaceC2594n.isEmpty() ? this : C2585g.m1115s().mo1083p(c2570b, interfaceC2594n).mo1061j(this.f6734f);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: q */
    public InterfaceC2594n mo1082q(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        C2570b m1384x = c2506l.m1384x();
        return m1384x == null ? interfaceC2594n : (!interfaceC2594n.isEmpty() || m1384x.m1158w()) ? mo1083p(m1384x, C2585g.m1115s().mo1082q(c2506l.m1396A(), interfaceC2594n)) : this;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: r */
    public Object mo1081r(boolean z) {
        if (!z || this.f6734f.isEmpty()) {
            return getValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(".value", getValue());
        hashMap.put(".priority", this.f6734f.getValue());
        return hashMap;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: t */
    public Iterator<C2593m> mo1080t() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = mo1081r(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }
}
