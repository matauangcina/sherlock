package com.google.firebase.database.p124p;

import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.database.p.h */
/* loaded from: classes.dex */
public class C2474h extends C2449g {
    /* renamed from: F */
    public void m1511F(InterfaceC2407a interfaceC2407a) {
        this.f6417c = interfaceC2407a;
    }

    /* renamed from: G */
    public synchronized void m1510G(C1415c c1415c) {
        this.f6425k = c1415c;
    }

    /* renamed from: H */
    public synchronized void m1509H(String str) {
        m1602a();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f6419e = str;
    }
}
