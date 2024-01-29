package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.C2133e0;
import java.util.ArrayList;
import java.util.List;
import p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1253w;
import p054b.p059c.p060a.p061a.p068d.p071c.C1243s1;
/* renamed from: com.google.firebase.auth.internal.m */
/* loaded from: classes.dex */
public final class C2166m {
    /* renamed from: a */
    public static AbstractC2205u0 m2349a(C1243s1 c1243s1) {
        if (c1243s1 == null || TextUtils.isEmpty(c1243s1.m4665b())) {
            return null;
        }
        return new C2133e0(c1243s1.m4664c(), c1243s1.m4663h(), c1243s1.m4662j(), c1243s1.m4665b());
    }

    /* renamed from: b */
    public static List<AbstractC2205u0> m2348b(List<C1243s1> list) {
        if (list == null || list.isEmpty()) {
            return AbstractC1253w.m4647l();
        }
        ArrayList arrayList = new ArrayList();
        for (C1243s1 c1243s1 : list) {
            AbstractC2205u0 m2349a = m2349a(c1243s1);
            if (m2349a != null) {
                arrayList.add(m2349a);
            }
        }
        return arrayList;
    }
}
