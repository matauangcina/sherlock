package com.google.firebase.database.p122o;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.firebase.database.o.e */
/* loaded from: classes.dex */
public class C2371e {
    /* renamed from: a */
    public static void m1906a(boolean z) {
        m1905b(z, "", new Object[0]);
    }

    /* renamed from: b */
    public static void m1905b(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
    }

    /* renamed from: c */
    public static Long m1904c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    /* renamed from: d */
    public static String m1903d(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static List<String> m1902e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }
}
