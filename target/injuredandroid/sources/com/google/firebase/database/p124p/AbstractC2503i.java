package com.google.firebase.database.p124p;

import com.google.firebase.database.C2306b;
import com.google.firebase.database.p124p.p128h0.C2477c;
import com.google.firebase.database.p124p.p128h0.C2478d;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.firebase.database.p.i */
/* loaded from: classes.dex */
public abstract class AbstractC2503i {

    /* renamed from: b */
    private InterfaceC2504j f6527b;

    /* renamed from: a */
    private AtomicBoolean f6526a = new AtomicBoolean(false);

    /* renamed from: c */
    private boolean f6528c = false;

    /* renamed from: a */
    public abstract AbstractC2503i mo1410a(C2488i c2488i);

    /* renamed from: b */
    public abstract C2478d mo1409b(C2477c c2477c, C2488i c2488i);

    /* renamed from: c */
    public abstract void mo1408c(C2306b c2306b);

    /* renamed from: d */
    public abstract void mo1407d(C2478d c2478d);

    /* renamed from: e */
    public abstract C2488i mo1406e();

    /* renamed from: f */
    public abstract boolean mo1405f(AbstractC2503i abstractC2503i);

    /* renamed from: g */
    public boolean m1404g() {
        return this.f6526a.get();
    }

    /* renamed from: h */
    public abstract boolean mo1403h(InterfaceC2479e.EnumC2480a enumC2480a);

    /* renamed from: i */
    public void m1402i(boolean z) {
        this.f6528c = z;
    }

    /* renamed from: j */
    public void m1401j(InterfaceC2504j interfaceC2504j) {
        this.f6527b = interfaceC2504j;
    }

    /* renamed from: k */
    public void m1400k() {
        InterfaceC2504j interfaceC2504j;
        if (!this.f6526a.compareAndSet(false, true) || (interfaceC2504j = this.f6527b) == null) {
            return;
        }
        interfaceC2504j.mo1399a(this);
        this.f6527b = null;
    }
}
