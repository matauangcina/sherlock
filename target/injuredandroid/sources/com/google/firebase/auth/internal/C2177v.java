package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.AbstractC2126b;
import com.google.firebase.auth.C2130d;
import com.google.firebase.auth.C2141i0;
import com.google.firebase.auth.C2196q;
import com.google.firebase.auth.C2198r;
import com.google.firebase.auth.C2208w;
import com.google.firebase.auth.C2209x;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.internal.v */
/* loaded from: classes.dex */
public final class C2177v {
    /* renamed from: a */
    public static C1182a2 m2320a(AbstractC2126b abstractC2126b, String str) {
        C1679r.m3631h(abstractC2126b);
        if (C2198r.class.isAssignableFrom(abstractC2126b.getClass())) {
            return C2198r.m2282h((C2198r) abstractC2126b, str);
        }
        if (C2130d.class.isAssignableFrom(abstractC2126b.getClass())) {
            return C2130d.m2395h((C2130d) abstractC2126b, str);
        }
        if (C2209x.class.isAssignableFrom(abstractC2126b.getClass())) {
            return C2209x.m2268h((C2209x) abstractC2126b, str);
        }
        if (C2196q.class.isAssignableFrom(abstractC2126b.getClass())) {
            return C2196q.m2283h((C2196q) abstractC2126b, str);
        }
        if (C2208w.class.isAssignableFrom(abstractC2126b.getClass())) {
            return C2208w.m2271h((C2208w) abstractC2126b, str);
        }
        if (C2141i0.class.isAssignableFrom(abstractC2126b.getClass())) {
            return C2141i0.m2387n((C2141i0) abstractC2126b, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
