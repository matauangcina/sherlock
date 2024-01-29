package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: androidx.navigation.h */
/* loaded from: classes.dex */
public final class C0920h {

    /* renamed from: i */
    private static final Pattern f3217i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    private final ArrayList<String> f3218a = new ArrayList<>();

    /* renamed from: b */
    private final Map<String, C0923c> f3219b = new HashMap();

    /* renamed from: c */
    private Pattern f3220c;

    /* renamed from: d */
    private boolean f3221d;

    /* renamed from: e */
    private boolean f3222e;

    /* renamed from: f */
    private final String f3223f;

    /* renamed from: g */
    private Pattern f3224g;

    /* renamed from: h */
    private final String f3225h;

    /* renamed from: androidx.navigation.h$a */
    /* loaded from: classes.dex */
    public static final class C0921a {

        /* renamed from: a */
        private String f3226a;

        /* renamed from: b */
        private String f3227b;

        /* renamed from: c */
        private String f3228c;

        /* renamed from: a */
        public C0920h m5979a() {
            return new C0920h(this.f3226a, this.f3227b, this.f3228c);
        }

        /* renamed from: b */
        public C0921a m5978b(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f3227b = str;
            return this;
        }

        /* renamed from: c */
        public C0921a m5977c(String str) {
            this.f3228c = str;
            return this;
        }

        /* renamed from: d */
        public C0921a m5976d(String str) {
            this.f3226a = str;
            return this;
        }
    }

    /* renamed from: androidx.navigation.h$b */
    /* loaded from: classes.dex */
    private static class C0922b implements Comparable<C0922b> {

        /* renamed from: f */
        String f3229f;

        /* renamed from: g */
        String f3230g;

        C0922b(String str) {
            String[] split = str.split("/", -1);
            this.f3229f = split[0];
            this.f3230g = split[1];
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(C0922b c0922b) {
            int i = this.f3229f.equals(c0922b.f3229f) ? 2 : 0;
            return this.f3230g.equals(c0922b.f3230g) ? i + 1 : i;
        }
    }

    /* renamed from: androidx.navigation.h$c */
    /* loaded from: classes.dex */
    private static class C0923c {

        /* renamed from: a */
        private String f3231a;

        /* renamed from: b */
        private ArrayList<String> f3232b = new ArrayList<>();

        C0923c() {
        }

        /* renamed from: a */
        void m5974a(String str) {
            this.f3232b.add(str);
        }

        /* renamed from: b */
        String m5973b(int i) {
            return this.f3232b.get(i);
        }

        /* renamed from: c */
        String m5972c() {
            return this.f3231a;
        }

        /* renamed from: d */
        void m5971d(String str) {
            this.f3231a = str;
        }

        /* renamed from: e */
        public int m5970e() {
            return this.f3232b.size();
        }
    }

    C0920h(String str, String str2, String str3) {
        this.f3220c = null;
        this.f3221d = false;
        this.f3222e = false;
        this.f3224g = null;
        this.f3223f = str2;
        this.f3225h = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f3222e = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f3217i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f3222e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    m5985a(str.substring(0, matcher.start()), sb, compile);
                }
                this.f3221d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C0923c c0923c = new C0923c();
                    int i = 0;
                    while (matcher2.find()) {
                        c0923c.m5974a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(i, matcher2.start())));
                        sb2.append("(.+?)?");
                        i = matcher2.end();
                    }
                    if (i < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i)));
                    }
                    c0923c.m5971d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.f3219b.put(str4, c0923c);
                }
            } else {
                this.f3221d = m5985a(str, sb, compile);
            }
            this.f3220c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            C0922b c0922b = new C0922b(str3);
            this.f3224g = Pattern.compile(("^(" + c0922b.f3229f + "|[*]+)/(" + c0922b.f3230g + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    /* renamed from: a */
    private boolean m5985a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i = 0;
        while (matcher.find()) {
            this.f3218a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i, matcher.start())));
            sb.append("(.+?)");
            i = matcher.end();
            z = false;
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    /* renamed from: f */
    private boolean m5980f(Bundle bundle, String str, String str2, C0904d c0904d) {
        if (c0904d == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            c0904d.m6037a().m5907g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public String m5984b() {
        return this.f3223f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bundle m5983c(Uri uri, Map<String, C0904d> map) {
        Matcher matcher;
        Matcher matcher2 = this.f3220c.matcher(uri.toString());
        if (matcher2.matches()) {
            Bundle bundle = new Bundle();
            int size = this.f3218a.size();
            int i = 0;
            while (i < size) {
                String str = this.f3218a.get(i);
                i++;
                if (m5980f(bundle, str, Uri.decode(matcher2.group(i)), map.get(str))) {
                    return null;
                }
            }
            if (this.f3222e) {
                for (String str2 : this.f3219b.keySet()) {
                    C0923c c0923c = this.f3219b.get(str2);
                    String queryParameter = uri.getQueryParameter(str2);
                    if (queryParameter != null) {
                        matcher = Pattern.compile(c0923c.m5972c()).matcher(queryParameter);
                        if (!matcher.matches()) {
                            return null;
                        }
                    } else {
                        matcher = null;
                    }
                    for (int i2 = 0; i2 < c0923c.m5970e(); i2++) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i2 + 1)) : null;
                        String m5973b = c0923c.m5973b(i2);
                        C0904d c0904d = map.get(m5973b);
                        if (decode != null && !decode.replaceAll("[{}]", "").equals(m5973b) && m5980f(bundle, m5973b, decode, c0904d)) {
                            return null;
                        }
                    }
                }
            }
            return bundle;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m5982d(String str) {
        if (this.f3225h == null || !this.f3224g.matcher(str).matches()) {
            return -1;
        }
        return new C0922b(this.f3225h).compareTo(new C0922b(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m5981e() {
        return this.f3221d;
    }
}
