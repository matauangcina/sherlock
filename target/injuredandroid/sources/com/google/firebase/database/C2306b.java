package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.b */
/* loaded from: classes.dex */
public class C2306b {

    /* renamed from: c */
    private static final Map<Integer, String> f6112c;

    /* renamed from: d */
    private static final Map<String, Integer> f6113d;

    /* renamed from: a */
    private final int f6114a;

    /* renamed from: b */
    private final String f6115b;

    static {
        HashMap hashMap = new HashMap();
        f6112c = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        f6112c.put(-2, "The server indicated that this operation failed");
        f6112c.put(-3, "This client does not have permission to perform this operation");
        f6112c.put(-4, "The operation had to be aborted due to a network disconnect");
        f6112c.put(-6, "The supplied auth token has expired");
        f6112c.put(-7, "The supplied auth token was invalid");
        f6112c.put(-8, "The transaction had too many retries");
        f6112c.put(-9, "The transaction was overridden by a subsequent set");
        f6112c.put(-10, "The service is unavailable");
        f6112c.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        f6112c.put(-24, "The operation could not be performed due to a network error");
        f6112c.put(-25, "The write was canceled by the user.");
        f6112c.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        f6113d = hashMap2;
        hashMap2.put("datastale", -1);
        f6113d.put("failure", -2);
        f6113d.put("permission_denied", -3);
        f6113d.put("disconnected", -4);
        f6113d.put("expired_token", -6);
        f6113d.put("invalid_token", -7);
        f6113d.put("maxretries", -8);
        f6113d.put("overriddenbyset", -9);
        f6113d.put("unavailable", -10);
        f6113d.put("network_error", -24);
        f6113d.put("write_canceled", -25);
    }

    private C2306b(int i, String str) {
        this(i, str, null);
    }

    private C2306b(int i, String str, String str2) {
        this.f6114a = i;
        this.f6115b = str;
    }

    /* renamed from: a */
    public static C2306b m2073a(int i) {
        if (f6112c.containsKey(Integer.valueOf(i))) {
            return new C2306b(i, f6112c.get(Integer.valueOf(i)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
    }

    /* renamed from: b */
    public static C2306b m2072b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new C2306b(-11, f6112c.get(-11) + stringWriter.toString());
    }

    /* renamed from: c */
    public static C2306b m2071c(String str) {
        return m2070d(str, null);
    }

    /* renamed from: d */
    public static C2306b m2070d(String str, String str2) {
        return m2069e(str, str2, null);
    }

    /* renamed from: e */
    public static C2306b m2069e(String str, String str2, String str3) {
        Integer num = f6113d.get(str.toLowerCase());
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = f6112c.get(num);
        }
        return new C2306b(num.intValue(), str2, str3);
    }

    /* renamed from: f */
    public int m2068f() {
        return this.f6114a;
    }

    /* renamed from: g */
    public C2307c m2067g() {
        return new C2307c("Firebase Database error: " + this.f6115b);
    }

    public String toString() {
        return "DatabaseError: " + this.f6115b;
    }
}
