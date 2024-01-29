package com.google.firebase.database.p121n;

import java.lang.Comparable;
import java.util.Comparator;
/* renamed from: com.google.firebase.database.n.l */
/* loaded from: classes.dex */
public class C2362l<A extends Comparable<A>> implements Comparator<A> {

    /* renamed from: f */
    private static C2362l f6198f = new C2362l();

    private C2362l() {
    }

    /* renamed from: b */
    public static <T extends Comparable<T>> C2362l<T> m1927b(Class<T> cls) {
        return f6198f;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(A a, A a2) {
        return a.compareTo(a2);
    }
}
