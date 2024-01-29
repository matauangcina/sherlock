package p054b.p055a.p056a;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: b.a.a.b */
/* loaded from: classes.dex */
public interface InterfaceC1078b {

    /* renamed from: b.a.a.b$a */
    /* loaded from: classes.dex */
    public static class C1079a {

        /* renamed from: a */
        public byte[] f3717a;

        /* renamed from: b */
        public String f3718b;

        /* renamed from: c */
        public long f3719c;

        /* renamed from: d */
        public long f3720d;

        /* renamed from: e */
        public long f3721e;

        /* renamed from: f */
        public long f3722f;

        /* renamed from: g */
        public Map<String, String> f3723g = Collections.emptyMap();

        /* renamed from: h */
        public List<C1088g> f3724h;

        /* renamed from: a */
        public boolean m5002a() {
            return this.f3721e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m5001b() {
            return this.f3722f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    void mo4910a();

    /* renamed from: b */
    void mo4909b(String str, C1079a c1079a);

    /* renamed from: c */
    C1079a mo4908c(String str);
}
