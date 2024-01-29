package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.C2569a;
import com.google.firebase.database.p131r.C2584f;
import com.google.firebase.database.p131r.C2592l;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.C2602t;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.p.g0.e */
/* loaded from: classes.dex */
public class C2461e {
    /* renamed from: a */
    private static long m1547a(AbstractC2589k<?> abstractC2589k) {
        long j = 8;
        if (!(abstractC2589k instanceof C2584f) && !(abstractC2589k instanceof C2592l)) {
            if (abstractC2589k instanceof C2569a) {
                j = 4;
            } else if (!(abstractC2589k instanceof C2602t)) {
                throw new IllegalArgumentException("Unknown leaf node type: " + abstractC2589k.getClass());
            } else {
                j = ((String) abstractC2589k.getValue()).length() + 2;
            }
        }
        return abstractC2589k.mo1078c().isEmpty() ? j : j + 24 + m1547a((AbstractC2589k) abstractC2589k.mo1078c());
    }

    /* renamed from: b */
    public static long m1546b(InterfaceC2594n interfaceC2594n) {
        if (interfaceC2594n.isEmpty()) {
            return 4L;
        }
        if (interfaceC2594n.mo1085k()) {
            return m1547a((AbstractC2589k) interfaceC2594n);
        }
        long j = 1;
        for (C2593m c2593m : interfaceC2594n) {
            j = j + c2593m.m1089c().m1164e().length() + 4 + m1546b(c2593m.m1088d());
        }
        return !interfaceC2594n.mo1078c().isEmpty() ? j + 12 + m1547a((AbstractC2589k) interfaceC2594n.mo1078c()) : j;
    }

    /* renamed from: c */
    public static int m1545c(InterfaceC2594n interfaceC2594n) {
        int i = 0;
        if (interfaceC2594n.isEmpty()) {
            return 0;
        }
        if (interfaceC2594n.mo1085k()) {
            return 1;
        }
        Iterator<C2593m> it = interfaceC2594n.iterator();
        while (it.hasNext()) {
            i += m1545c(it.next().m1088d());
        }
        return i;
    }
}
