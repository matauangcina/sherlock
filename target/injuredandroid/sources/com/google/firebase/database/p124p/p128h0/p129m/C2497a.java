package com.google.firebase.database.p124p.p128h0.p129m;

import com.google.firebase.database.p124p.p128h0.C2477c;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import com.google.firebase.database.p131r.C2570b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.h0.m.a */
/* loaded from: classes.dex */
public class C2497a {

    /* renamed from: a */
    private final Map<C2570b, C2477c> f6516a = new HashMap();

    /* renamed from: a */
    public List<C2477c> m1426a() {
        return new ArrayList(this.f6516a.values());
    }

    /* renamed from: b */
    public void m1425b(C2477c c2477c) {
        Map<C2570b, C2477c> map;
        InterfaceC2479e.EnumC2480a m1492j = c2477c.m1492j();
        C2570b m1493i = c2477c.m1493i();
        if (this.f6516a.containsKey(m1493i)) {
            C2477c c2477c2 = this.f6516a.get(m1493i);
            InterfaceC2479e.EnumC2480a m1492j2 = c2477c2.m1492j();
            if (m1492j == InterfaceC2479e.EnumC2480a.CHILD_ADDED && m1492j2 == InterfaceC2479e.EnumC2480a.CHILD_REMOVED) {
                this.f6516a.put(c2477c.m1493i(), C2477c.m1498d(m1493i, c2477c.m1491k(), c2477c2.m1491k()));
                return;
            } else if (m1492j == InterfaceC2479e.EnumC2480a.CHILD_REMOVED && m1492j2 == InterfaceC2479e.EnumC2480a.CHILD_ADDED) {
                this.f6516a.remove(m1493i);
                return;
            } else if (m1492j == InterfaceC2479e.EnumC2480a.CHILD_REMOVED && m1492j2 == InterfaceC2479e.EnumC2480a.CHILD_CHANGED) {
                this.f6516a.put(m1493i, C2477c.m1495g(m1493i, c2477c2.m1490l()));
                return;
            } else if (m1492j == InterfaceC2479e.EnumC2480a.CHILD_CHANGED && m1492j2 == InterfaceC2479e.EnumC2480a.CHILD_ADDED) {
                map = this.f6516a;
                c2477c = C2477c.m1500b(m1493i, c2477c.m1491k());
            } else {
                InterfaceC2479e.EnumC2480a enumC2480a = InterfaceC2479e.EnumC2480a.CHILD_CHANGED;
                if (m1492j != enumC2480a || m1492j2 != enumC2480a) {
                    throw new IllegalStateException("Illegal combination of changes: " + c2477c + " occurred after " + c2477c2);
                }
                map = this.f6516a;
                c2477c = C2477c.m1498d(m1493i, c2477c.m1491k(), c2477c2.m1490l());
            }
        } else {
            map = this.f6516a;
            m1493i = c2477c.m1493i();
        }
        map.put(m1493i, c2477c);
    }
}
