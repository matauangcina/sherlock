package com.google.firebase.database.p122o;

import java.net.URI;
/* renamed from: com.google.firebase.database.o.f */
/* loaded from: classes.dex */
public class C2372f {

    /* renamed from: a */
    private final String f6221a;

    /* renamed from: b */
    private final String f6222b;

    /* renamed from: c */
    private final boolean f6223c;

    public C2372f(String str, String str2, boolean z) {
        this.f6221a = str;
        this.f6222b = str2;
        this.f6223c = z;
    }

    /* renamed from: a */
    public static URI m1901a(String str, boolean z, String str2, String str3) {
        String str4 = (z ? "wss" : "ws") + "://" + str + "/.ws?ns=" + str2 + "&v=5";
        if (str3 != null) {
            str4 = str4 + "&ls=" + str3;
        }
        return URI.create(str4);
    }

    /* renamed from: b */
    public String m1900b() {
        return this.f6221a;
    }

    /* renamed from: c */
    public String m1899c() {
        return this.f6222b;
    }

    /* renamed from: d */
    public boolean m1898d() {
        return this.f6223c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f6223c ? "s" : "");
        sb.append("://");
        sb.append(this.f6221a);
        return sb.toString();
    }
}
