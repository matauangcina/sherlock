package com.google.firebase.database.p131r;

import com.google.firebase.database.C2307c;
import com.google.firebase.database.p124p.C2506l;
/* renamed from: com.google.firebase.database.r.r */
/* loaded from: classes.dex */
public class C2600r {
    /* renamed from: a */
    public static InterfaceC2594n m1069a() {
        return C2585g.m1115s();
    }

    /* renamed from: b */
    public static boolean m1068b(InterfaceC2594n interfaceC2594n) {
        return interfaceC2594n.mo1078c().isEmpty() && (interfaceC2594n.isEmpty() || (interfaceC2594n instanceof C2584f) || (interfaceC2594n instanceof C2602t) || (interfaceC2594n instanceof C2583e));
    }

    /* renamed from: c */
    public static InterfaceC2594n m1067c(C2506l c2506l, Object obj) {
        String str;
        InterfaceC2594n m1075a = C2597o.m1075a(obj);
        if (m1075a instanceof C2592l) {
            m1075a = new C2584f(Double.valueOf(((Long) m1075a.getValue()).longValue()), m1069a());
        }
        if (m1068b(m1075a)) {
            return m1075a;
        }
        StringBuilder sb = new StringBuilder();
        if (c2506l != null) {
            str = "Path '" + c2506l + "'";
        } else {
            str = "Node";
        }
        sb.append(str);
        sb.append(" contains invalid priority: Must be a string, double, ServerValue, or null");
        throw new C2307c(sb.toString());
    }

    /* renamed from: d */
    public static InterfaceC2594n m1066d(Object obj) {
        return m1067c(null, obj);
    }
}
