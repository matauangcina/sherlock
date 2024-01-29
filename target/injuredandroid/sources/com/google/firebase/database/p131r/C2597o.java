package com.google.firebase.database.p131r;

import com.google.firebase.database.C2307c;
import com.google.firebase.database.p121n.AbstractC2343c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.r.o */
/* loaded from: classes.dex */
public class C2597o {
    /* renamed from: a */
    public static InterfaceC2594n m1075a(Object obj) {
        return m1074b(obj, C2600r.m1069a());
    }

    /* renamed from: b */
    public static InterfaceC2594n m1074b(Object obj, InterfaceC2594n interfaceC2594n) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    interfaceC2594n = C2600r.m1066d(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return C2585g.m1115s();
            }
            if (obj instanceof String) {
                return new C2602t((String) obj, interfaceC2594n);
            }
            if (obj instanceof Long) {
                return new C2592l((Long) obj, interfaceC2594n);
            }
            if (obj instanceof Integer) {
                return new C2592l(Long.valueOf(((Integer) obj).intValue()), interfaceC2594n);
            }
            if (obj instanceof Double) {
                return new C2584f((Double) obj, interfaceC2594n);
            }
            if (obj instanceof Boolean) {
                return new C2569a((Boolean) obj, interfaceC2594n);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new C2307c("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new C2583e(map2, interfaceC2594n);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        InterfaceC2594n m1075a = m1075a(map2.get(str));
                        if (!m1075a.isEmpty()) {
                            hashMap.put(C2570b.m1162g(str), m1075a);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i = 0; i < list.size(); i++) {
                    String str2 = "" + i;
                    InterfaceC2594n m1075a2 = m1075a(list.get(i));
                    if (!m1075a2.isEmpty()) {
                        hashMap.put(C2570b.m1162g(str2), m1075a2);
                    }
                }
            }
            return hashMap.isEmpty() ? C2585g.m1115s() : new C2573c(AbstractC2343c.C2344a.m1981c(hashMap, C2573c.f6706i), interfaceC2594n);
        } catch (ClassCastException e) {
            throw new C2307c("Failed to parse node", e);
        }
    }

    /* renamed from: c */
    public static int m1073c(C2570b c2570b, InterfaceC2594n interfaceC2594n, C2570b c2570b2, InterfaceC2594n interfaceC2594n2) {
        int compareTo = interfaceC2594n.compareTo(interfaceC2594n2);
        return compareTo != 0 ? compareTo : c2570b.compareTo(c2570b2);
    }
}
