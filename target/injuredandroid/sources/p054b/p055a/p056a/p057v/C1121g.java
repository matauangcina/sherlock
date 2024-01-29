package p054b.p055a.p056a.p057v;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import p054b.p055a.p056a.C1088g;
import p054b.p055a.p056a.C1092k;
import p054b.p055a.p056a.C1108u;
import p054b.p055a.p056a.InterfaceC1078b;
/* renamed from: b.a.a.v.g */
/* loaded from: classes.dex */
public class C1121g {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m4880a(long j) {
        return m4879b().format(new Date(j));
    }

    /* renamed from: b */
    private static SimpleDateFormat m4879b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: c */
    public static InterfaceC1078b.C1079a m4878c(C1092k c1092k) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c1092k.f3753b;
        String str = map.get("Date");
        long m4875f = str != null ? m4875f(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long m4875f2 = str3 != null ? m4875f(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long m4875f3 = str4 != null ? m4875f(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (m4875f <= 0 || m4875f2 < m4875f) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (m4875f2 - m4875f);
                j3 = j4;
            }
        }
        InterfaceC1078b.C1079a c1079a = new InterfaceC1078b.C1079a();
        c1079a.f3717a = c1092k.f3752a;
        c1079a.f3718b = str5;
        c1079a.f3722f = j4;
        c1079a.f3721e = j3;
        c1079a.f3719c = m4875f;
        c1079a.f3720d = m4875f3;
        c1079a.f3723g = map;
        c1079a.f3724h = c1092k.f3754c;
        return c1079a;
    }

    /* renamed from: d */
    public static String m4877d(Map<String, String> map) {
        return m4876e(map, "ISO-8859-1");
    }

    /* renamed from: e */
    public static String m4876e(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: f */
    public static long m4875f(String str) {
        try {
            return m4879b().parse(str).getTime();
        } catch (ParseException e) {
            C1108u.m4925d(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static List<C1088g> m4874g(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C1088g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Map<String, String> m4873h(List<C1088g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1088g c1088g : list) {
            treeMap.put(c1088g.m4992a(), c1088g.m4991b());
        }
        return treeMap;
    }
}
