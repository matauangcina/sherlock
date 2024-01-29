package com.google.firebase.auth.internal;

import com.google.firebase.auth.C2194p;
import com.google.firebase.auth.p118z.C2273b;
import java.util.Map;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1184b0;
/* renamed from: com.google.firebase.auth.internal.k */
/* loaded from: classes.dex */
public final class C2162k {

    /* renamed from: a */
    private static final C1155a f5920a = new C1155a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C2194p m2353a(String str) {
        Map m4731a;
        try {
            m4731a = C2160j.m2357b(str);
        } catch (C2273b e) {
            f5920a.m4768a("Error parsing token claims", e, new Object[0]);
            m4731a = AbstractC1184b0.m4731a();
        }
        return new C2194p(str, m4731a);
    }
}
