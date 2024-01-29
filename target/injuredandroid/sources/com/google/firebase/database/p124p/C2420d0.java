package com.google.firebase.database.p124p;

import com.google.firebase.database.p124p.p128h0.C2488i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* renamed from: com.google.firebase.database.p.d0 */
/* loaded from: classes.dex */
public class C2420d0 implements InterfaceC2504j {

    /* renamed from: b */
    private static C2420d0 f6361b = new C2420d0();

    /* renamed from: a */
    final HashMap<AbstractC2503i, List<AbstractC2503i>> f6362a = new HashMap<>();

    private C2420d0() {
    }

    /* renamed from: b */
    public static C2420d0 m1710b() {
        return f6361b;
    }

    /* renamed from: d */
    private void m1708d(AbstractC2503i abstractC2503i) {
        AbstractC2503i mo1410a;
        List<AbstractC2503i> list;
        synchronized (this.f6362a) {
            List<AbstractC2503i> list2 = this.f6362a.get(abstractC2503i);
            int i = 0;
            if (list2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    } else if (list2.get(i2) == abstractC2503i) {
                        list2.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (list2.isEmpty()) {
                    this.f6362a.remove(abstractC2503i);
                }
            }
            if (!abstractC2503i.mo1406e().m1455f() && (list = this.f6362a.get((mo1410a = abstractC2503i.mo1410a(C2488i.m1460a(abstractC2503i.mo1406e().m1456e()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (list.get(i) == abstractC2503i) {
                        list.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (list.isEmpty()) {
                    this.f6362a.remove(mo1410a);
                }
            }
        }
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2504j
    /* renamed from: a */
    public void mo1399a(AbstractC2503i abstractC2503i) {
        m1708d(abstractC2503i);
    }

    /* renamed from: c */
    public void m1709c(AbstractC2503i abstractC2503i) {
        synchronized (this.f6362a) {
            List<AbstractC2503i> list = this.f6362a.get(abstractC2503i);
            if (list == null) {
                list = new ArrayList<>();
                this.f6362a.put(abstractC2503i, list);
            }
            list.add(abstractC2503i);
            if (!abstractC2503i.mo1406e().m1455f()) {
                AbstractC2503i mo1410a = abstractC2503i.mo1410a(C2488i.m1460a(abstractC2503i.mo1406e().m1456e()));
                List<AbstractC2503i> list2 = this.f6362a.get(mo1410a);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.f6362a.put(mo1410a, list2);
                }
                list2.add(abstractC2503i);
            }
            abstractC2503i.m1402i(true);
            abstractC2503i.m1401j(this);
        }
    }

    /* renamed from: e */
    public void m1707e(AbstractC2503i abstractC2503i) {
        synchronized (this.f6362a) {
            List<AbstractC2503i> list = this.f6362a.get(abstractC2503i);
            if (list != null && !list.isEmpty()) {
                if (abstractC2503i.mo1406e().m1455f()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        AbstractC2503i abstractC2503i2 = list.get(size);
                        if (!hashSet.contains(abstractC2503i2.mo1406e())) {
                            hashSet.add(abstractC2503i2.mo1406e());
                            abstractC2503i2.m1400k();
                        }
                    }
                } else {
                    list.get(0).m1400k();
                }
            }
        }
    }
}
