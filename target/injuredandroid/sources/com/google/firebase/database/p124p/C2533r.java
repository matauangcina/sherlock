package com.google.firebase.database.p124p;

import com.google.firebase.database.p124p.p127g0.InterfaceC2451a;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2573c;
import com.google.firebase.database.p131r.C2597o;
import com.google.firebase.database.p131r.C2600r;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.r */
/* loaded from: classes.dex */
public class C2533r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.r$a */
    /* loaded from: classes.dex */
    public class C2534a extends C2573c.AbstractC2576c {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2594n f6610a;

        /* renamed from: b */
        final /* synthetic */ Map f6611b;

        /* renamed from: c */
        final /* synthetic */ C2535s f6612c;

        C2534a(InterfaceC2594n interfaceC2594n, Map map, C2535s c2535s) {
            this.f6610a = interfaceC2594n;
            this.f6611b = map;
            this.f6612c = c2535s;
        }

        @Override // com.google.firebase.database.p131r.C2573c.AbstractC2576c
        /* renamed from: b */
        public void mo1138b(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
            InterfaceC2594n m1290f = C2533r.m1290f(interfaceC2594n, this.f6610a.mo1079b(c2570b), this.f6611b);
            if (m1290f != interfaceC2594n) {
                this.f6612c.m1286c(new C2506l(c2570b.m1164e()), m1290f);
            }
        }
    }

    /* renamed from: a */
    private static boolean m1295a(Number number) {
        return ((number instanceof Double) || (number instanceof Float)) ? false : true;
    }

    /* renamed from: b */
    public static Map<String, Object> m1294b(InterfaceC2451a interfaceC2451a) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(interfaceC2451a.mo1544a()));
        return hashMap;
    }

    /* renamed from: c */
    static Object m1293c(Map<String, Object> map, InterfaceC2594n interfaceC2594n, Map<String, Object> map2) {
        if (map.containsKey("increment")) {
            Object obj = map.get("increment");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (interfaceC2594n.mo1085k() && (interfaceC2594n.getValue() instanceof Number)) {
                    Number number2 = (Number) interfaceC2594n.getValue();
                    if (m1295a(number) && m1295a(number2)) {
                        long longValue = number.longValue();
                        long longValue2 = number2.longValue();
                        long j = longValue + longValue2;
                        if (((longValue ^ j) & (longValue2 ^ j)) >= 0) {
                            return Long.valueOf(j);
                        }
                    }
                    return Double.valueOf(number.doubleValue() + number2.doubleValue());
                }
                return number;
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    public static Object m1292d(Object obj, InterfaceC2594n interfaceC2594n, Map<String, Object> map) {
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            if (map2.containsKey(".sv")) {
                Object obj2 = map2.get(".sv");
                Object obj3 = null;
                if (obj2 instanceof String) {
                    obj3 = m1289g((String) obj2, interfaceC2594n, map);
                } else if (obj2 instanceof Map) {
                    obj3 = m1293c((Map) obj2, interfaceC2594n, map);
                }
                return obj3 == null ? obj : obj3;
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: e */
    public static C2411b m1291e(C2411b c2411b, InterfaceC2594n interfaceC2594n, Map<String, Object> map) {
        C2411b m1745s = C2411b.m1745s();
        Iterator<Map.Entry<C2506l, InterfaceC2594n>> it = c2411b.iterator();
        while (it.hasNext()) {
            Map.Entry<C2506l, InterfaceC2594n> next = it.next();
            m1745s = m1745s.m1752d(next.getKey(), m1290f(next.getValue(), interfaceC2594n.mo1086h(next.getKey()), map));
        }
        return m1745s;
    }

    /* renamed from: f */
    public static InterfaceC2594n m1290f(InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2, Map<String, Object> map) {
        InterfaceC2594n m1066d = C2600r.m1066d(m1292d(interfaceC2594n.mo1078c().getValue(), interfaceC2594n2.mo1078c(), map));
        if (interfaceC2594n.mo1085k()) {
            Object m1292d = m1292d(interfaceC2594n.getValue(), interfaceC2594n2, map);
            return (m1292d.equals(interfaceC2594n.getValue()) && m1066d.equals(interfaceC2594n.mo1078c())) ? interfaceC2594n : C2597o.m1074b(m1292d, m1066d);
        } else if (interfaceC2594n.isEmpty()) {
            return interfaceC2594n;
        } else {
            C2573c c2573c = (C2573c) interfaceC2594n;
            C2535s c2535s = new C2535s(c2573c);
            c2573c.m1154f(new C2534a(interfaceC2594n2, map, c2535s));
            return !c2535s.m1287b().mo1078c().equals(m1066d) ? c2535s.m1287b().mo1061j(m1066d) : c2535s.m1287b();
        }
    }

    /* renamed from: g */
    static Object m1289g(String str, InterfaceC2594n interfaceC2594n, Map<String, Object> map) {
        if ("timestamp".equals(str) && map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
