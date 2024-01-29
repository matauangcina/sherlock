package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
public class C1676p {

    /* renamed from: b */
    private static final C1663j f4842b = new C1663j("LibraryVersion", "");

    /* renamed from: c */
    private static C1676p f4843c = new C1676p();

    /* renamed from: a */
    private ConcurrentHashMap<String, String> f4844a = new ConcurrentHashMap<>();

    protected C1676p() {
    }

    /* renamed from: a */
    public static C1676p m3644a() {
        return f4843c;
    }

    /* renamed from: b */
    public String m3643b(String str) {
        C1679r.m3632g(str, "Please provide a valid libraryName");
        if (this.f4844a.containsKey(str)) {
            return this.f4844a.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = C1676p.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                C1663j c1663j = f4842b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                c1663j.m3659e("LibraryVersion", sb.toString());
            } else {
                C1663j c1663j2 = f4842b;
                String valueOf = String.valueOf(str);
                c1663j2.m3661c("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            C1663j c1663j3 = f4842b;
            String valueOf2 = String.valueOf(str);
            c1663j3.m3660d("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            f4842b.m3662b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.f4844a.put(str, str2);
        return str2;
    }
}
