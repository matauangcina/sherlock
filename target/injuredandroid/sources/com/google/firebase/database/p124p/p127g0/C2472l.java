package com.google.firebase.database.p124p.p127g0;

import android.net.Uri;
import android.util.Base64;
import com.google.firebase.database.C2307c;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2530o;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.google.firebase.database.p.g0.l */
/* loaded from: classes.dex */
public class C2472l {

    /* renamed from: a */
    private static final char[] f6456a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static int m1524a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: b */
    public static int m1523b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: c */
    public static String m1522c(double d) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 7; i >= 0; i--) {
            int i2 = (int) ((doubleToLongBits >>> (i * 8)) & 255);
            sb.append(f6456a[(i2 >> 4) & 15]);
            sb.append(f6456a[i2 & 15]);
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static String m1521d(String str) {
        int indexOf = str.indexOf("//");
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 != -1) {
                int indexOf3 = substring.indexOf("?");
                int i = indexOf2 + 1;
                return indexOf3 != -1 ? substring.substring(i, indexOf3) : substring.substring(i);
            }
            return "";
        }
        throw new C2307c("Firebase Database URL is missing URL scheme");
    }

    /* renamed from: e */
    public static void m1520e(boolean z) {
        m1519f(z, "");
    }

    /* renamed from: f */
    public static void m1519f(boolean z, String str) {
        if (z) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + str);
    }

    /* renamed from: g */
    public static C2464h m1518g(String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                String host = parse.getHost();
                if (host != null) {
                    C2530o c2530o = new C2530o();
                    c2530o.f6605a = host.toLowerCase();
                    int port = parse.getPort();
                    boolean z = true;
                    if (port != -1) {
                        if (!scheme.equals("https") && !scheme.equals("wss")) {
                            z = false;
                        }
                        c2530o.f6606b = z;
                        c2530o.f6605a += ":" + port;
                    } else {
                        c2530o.f6606b = true;
                    }
                    String queryParameter = parse.getQueryParameter("ns");
                    if (queryParameter == null) {
                        queryParameter = host.split("\\.", -1)[0].toLowerCase();
                    }
                    c2530o.f6607c = queryParameter;
                    String replace = m1521d(str).replace("+", " ");
                    C2473m.m1512c(replace);
                    C2464h c2464h = new C2464h();
                    c2464h.f6447b = new C2506l(replace);
                    c2464h.f6446a = c2530o;
                    return c2464h;
                }
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
        } catch (Exception e) {
            throw new C2307c("Invalid Firebase Database url specified: " + str, e);
        }
    }

    /* renamed from: h */
    public static String m1517h(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e);
        }
    }

    /* renamed from: i */
    public static String m1516i(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return '\"' + replace + '\"';
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r2 > 2147483647L) goto L33;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer m1515j(java.lang.String r8) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = 11
            if (r0 > r2) goto L5d
            int r0 = r8.length()
            if (r0 != 0) goto L10
            goto L5d
        L10:
            r0 = 0
            char r2 = r8.charAt(r0)
            r3 = 45
            r4 = 1
            if (r2 != r3) goto L23
            int r0 = r8.length()
            if (r0 != r4) goto L21
            return r1
        L21:
            r0 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            r2 = 0
        L26:
            int r5 = r8.length()
            if (r0 >= r5) goto L45
            char r5 = r8.charAt(r0)
            r6 = 48
            if (r5 < r6) goto L44
            r6 = 57
            if (r5 <= r6) goto L39
            goto L44
        L39:
            r6 = 10
            long r2 = r2 * r6
            int r5 = r5 + (-48)
            long r5 = (long) r5
            long r2 = r2 + r5
            int r0 = r0 + 1
            goto L26
        L44:
            return r1
        L45:
            if (r4 == 0) goto L56
            long r2 = -r2
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L50
            return r1
        L50:
            int r8 = (int) r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L56:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L50
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p124p.p127g0.C2472l.m1515j(java.lang.String):java.lang.Integer");
    }
}
