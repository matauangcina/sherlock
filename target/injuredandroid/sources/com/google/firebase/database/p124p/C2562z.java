package com.google.firebase.database.p124p;

import com.google.firebase.database.C2307c;
import com.google.firebase.database.p131r.C2570b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.z */
/* loaded from: classes.dex */
public class C2562z {

    /* renamed from: a */
    private final List<String> f6686a = new ArrayList();

    /* renamed from: b */
    private int f6687b;

    private C2562z(C2506l c2506l) {
        this.f6687b = 0;
        Iterator<C2570b> it = c2506l.iterator();
        while (it.hasNext()) {
            this.f6686a.add(it.next().m1164e());
        }
        this.f6687b = Math.max(1, this.f6686a.size());
        for (int i = 0; i < this.f6686a.size(); i++) {
            this.f6687b += m1188f(this.f6686a.get(i));
        }
        m1193a();
    }

    /* renamed from: a */
    private void m1193a() {
        if (this.f6687b > 768) {
            throw new C2307c("Data has a key path longer than 768 bytes (" + this.f6687b + ").");
        } else if (this.f6686a.size() <= 32) {
        } else {
            throw new C2307c("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + m1189e());
        }
    }

    /* renamed from: b */
    private static String m1192b(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: c */
    private String m1191c() {
        List<String> list;
        String remove = this.f6686a.remove(list.size() - 1);
        this.f6687b -= m1188f(remove);
        if (this.f6686a.size() > 0) {
            this.f6687b--;
        }
        return remove;
    }

    /* renamed from: d */
    private void m1190d(String str) {
        if (this.f6686a.size() > 0) {
            this.f6687b++;
        }
        this.f6686a.add(str);
        this.f6687b += m1188f(str);
        m1193a();
    }

    /* renamed from: e */
    private String m1189e() {
        if (this.f6686a.size() == 0) {
            return "";
        }
        return "in path '" + m1192b("/", this.f6686a) + "'";
    }

    /* renamed from: f */
    private static int m1188f(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: g */
    public static void m1187g(C2506l c2506l, Object obj) {
        new C2562z(c2506l).m1186h(obj);
    }

    /* renamed from: h */
    private void m1186h(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    m1190d(str);
                    m1186h(map.get(str));
                    m1191c();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                m1190d(Integer.toString(i));
                m1186h(list.get(i));
                m1191c();
            }
        }
    }
}
