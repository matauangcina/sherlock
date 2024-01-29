package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.C2449g;
import com.google.firebase.database.p124p.InterfaceC2505k;
import com.google.firebase.database.p130q.C2566c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.firebase.database.p.h0.g */
/* loaded from: classes.dex */
public class C2483g {

    /* renamed from: a */
    private final InterfaceC2505k f6480a;

    /* renamed from: b */
    private final C2566c f6481b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.h0.g$a */
    /* loaded from: classes.dex */
    public class RunnableC2484a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f6482f;

        RunnableC2484a(ArrayList arrayList) {
            this.f6482f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6482f.iterator();
            while (it.hasNext()) {
                InterfaceC2479e interfaceC2479e = (InterfaceC2479e) it.next();
                if (C2483g.this.f6481b.m1174f()) {
                    C2566c c2566c = C2483g.this.f6481b;
                    c2566c.m1178b("Raising " + interfaceC2479e.toString(), new Object[0]);
                }
                interfaceC2479e.mo1486a();
            }
        }
    }

    public C2483g(C2449g c2449g) {
        this.f6480a = c2449g.m1591l();
        this.f6481b = c2449g.m1589n("EventRaiser");
    }

    /* renamed from: b */
    public void m1478b(List<? extends InterfaceC2479e> list) {
        if (this.f6481b.m1174f()) {
            C2566c c2566c = this.f6481b;
            c2566c.m1178b("Raising " + list.size() + " event(s)", new Object[0]);
        }
        this.f6480a.mo1397b(new RunnableC2484a(new ArrayList(list)));
    }
}
