package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.AbstractC2503i;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2593m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: com.google.firebase.database.p.h0.f */
/* loaded from: classes.dex */
public class C2481f {

    /* renamed from: a */
    private final C2488i f6477a;

    /* renamed from: b */
    private final AbstractC2586h f6478b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.h0.f$a */
    /* loaded from: classes.dex */
    public class C2482a implements Comparator<C2477c> {
        C2482a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C2477c c2477c, C2477c c2477c2) {
            return C2481f.this.f6478b.compare(new C2593m(c2477c.m1493i(), c2477c.m1491k().m1104l()), new C2593m(c2477c2.m1493i(), c2477c2.m1491k().m1104l()));
        }
    }

    public C2481f(C2488i c2488i) {
        this.f6477a = c2488i;
        this.f6478b = c2488i.m1458c();
    }

    /* renamed from: b */
    private Comparator<C2477c> m1484b() {
        return new C2482a();
    }

    /* renamed from: c */
    private C2478d m1483c(C2477c c2477c, AbstractC2503i abstractC2503i, C2587i c2587i) {
        if (!c2477c.m1492j().equals(InterfaceC2479e.EnumC2480a.VALUE) && !c2477c.m1492j().equals(InterfaceC2479e.EnumC2480a.CHILD_REMOVED)) {
            c2477c = c2477c.m1501a(c2587i.m1103m(c2477c.m1493i(), c2477c.m1491k().m1104l(), this.f6478b));
        }
        return abstractC2503i.mo1409b(c2477c, this.f6477a);
    }

    /* renamed from: e */
    private void m1481e(List<C2478d> list, InterfaceC2479e.EnumC2480a enumC2480a, List<C2477c> list2, List<AbstractC2503i> list3, C2587i c2587i) {
        ArrayList<C2477c> arrayList = new ArrayList();
        for (C2477c c2477c : list2) {
            if (c2477c.m1492j().equals(enumC2480a)) {
                arrayList.add(c2477c);
            }
        }
        Collections.sort(arrayList, m1484b());
        for (C2477c c2477c2 : arrayList) {
            for (AbstractC2503i abstractC2503i : list3) {
                if (abstractC2503i.mo1403h(enumC2480a)) {
                    list.add(m1483c(c2477c2, abstractC2503i, c2587i));
                }
            }
        }
    }

    /* renamed from: d */
    public List<C2478d> m1482d(List<C2477c> list, C2587i c2587i, List<AbstractC2503i> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2477c c2477c : list) {
            if (c2477c.m1492j().equals(InterfaceC2479e.EnumC2480a.CHILD_CHANGED) && this.f6478b.m1111d(c2477c.m1490l().m1104l(), c2477c.m1491k().m1104l())) {
                arrayList2.add(C2477c.m1496f(c2477c.m1493i(), c2477c.m1491k()));
            }
        }
        m1481e(arrayList, InterfaceC2479e.EnumC2480a.CHILD_REMOVED, list, list2, c2587i);
        m1481e(arrayList, InterfaceC2479e.EnumC2480a.CHILD_ADDED, list, list2, c2587i);
        m1481e(arrayList, InterfaceC2479e.EnumC2480a.CHILD_MOVED, arrayList2, list2, c2587i);
        m1481e(arrayList, InterfaceC2479e.EnumC2480a.CHILD_CHANGED, list, list2, c2587i);
        m1481e(arrayList, InterfaceC2479e.EnumC2480a.VALUE, list, list2, c2587i);
        return arrayList;
    }
}
