package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.p128h0.p129m.C2498b;
import com.google.firebase.database.p124p.p128h0.p129m.C2499c;
import com.google.firebase.database.p124p.p128h0.p129m.C2502e;
import com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2569a;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2584f;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2592l;
import com.google.firebase.database.p131r.C2597o;
import com.google.firebase.database.p131r.C2599q;
import com.google.firebase.database.p131r.C2600r;
import com.google.firebase.database.p131r.C2602t;
import com.google.firebase.database.p131r.InterfaceC2594n;
import com.google.firebase.database.p133t.C2625b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.h0.h */
/* loaded from: classes.dex */
public final class C2485h {

    /* renamed from: i */
    public static final C2485h f6484i = new C2485h();

    /* renamed from: a */
    private Integer f6485a;

    /* renamed from: b */
    private EnumC2487b f6486b;

    /* renamed from: c */
    private InterfaceC2594n f6487c = null;

    /* renamed from: d */
    private C2570b f6488d = null;

    /* renamed from: e */
    private InterfaceC2594n f6489e = null;

    /* renamed from: f */
    private C2570b f6490f = null;

    /* renamed from: g */
    private AbstractC2586h f6491g = C2599q.m1070j();

    /* renamed from: h */
    private String f6492h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.h0.h$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2486a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6493a;

        static {
            int[] iArr = new int[EnumC2487b.values().length];
            f6493a = iArr;
            try {
                iArr[EnumC2487b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6493a[EnumC2487b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.p.h0.h$b */
    /* loaded from: classes.dex */
    public enum EnumC2487b {
        LEFT,
        RIGHT
    }

    /* renamed from: a */
    public static C2485h m1477a(Map<String, Object> map) {
        C2485h c2485h = new C2485h();
        c2485h.f6485a = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            c2485h.f6487c = m1462p(C2597o.m1075a(map.get("sp")));
            String str = (String) map.get("sn");
            if (str != null) {
                c2485h.f6488d = C2570b.m1162g(str);
            }
        }
        if (map.containsKey("ep")) {
            c2485h.f6489e = m1462p(C2597o.m1075a(map.get("ep")));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                c2485h.f6490f = C2570b.m1162g(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            c2485h.f6486b = str3.equals("l") ? EnumC2487b.LEFT : EnumC2487b.RIGHT;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            c2485h.f6491g = AbstractC2586h.m1112b(str4);
        }
        return c2485h;
    }

    /* renamed from: p */
    private static InterfaceC2594n m1462p(InterfaceC2594n interfaceC2594n) {
        if ((interfaceC2594n instanceof C2602t) || (interfaceC2594n instanceof C2569a) || (interfaceC2594n instanceof C2584f) || (interfaceC2594n instanceof C2585g)) {
            return interfaceC2594n;
        }
        if (interfaceC2594n instanceof C2592l) {
            return new C2584f(Double.valueOf(((Long) interfaceC2594n.getValue()).doubleValue()), C2600r.m1069a());
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + interfaceC2594n.getValue());
    }

    /* renamed from: b */
    public AbstractC2586h m1476b() {
        return this.f6491g;
    }

    /* renamed from: c */
    public C2570b m1475c() {
        if (m1468j()) {
            C2570b c2570b = this.f6490f;
            return c2570b != null ? c2570b : C2570b.m1161i();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    /* renamed from: d */
    public InterfaceC2594n m1474d() {
        if (m1468j()) {
            return this.f6489e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    /* renamed from: e */
    public C2570b m1473e() {
        if (m1466l()) {
            C2570b c2570b = this.f6488d;
            return c2570b != null ? c2570b : C2570b.m1160l();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2485h.class != obj.getClass()) {
            return false;
        }
        C2485h c2485h = (C2485h) obj;
        Integer num = this.f6485a;
        if (num == null ? c2485h.f6485a == null : num.equals(c2485h.f6485a)) {
            AbstractC2586h abstractC2586h = this.f6491g;
            if (abstractC2586h == null ? c2485h.f6491g == null : abstractC2586h.equals(c2485h.f6491g)) {
                C2570b c2570b = this.f6490f;
                if (c2570b == null ? c2485h.f6490f == null : c2570b.equals(c2485h.f6490f)) {
                    InterfaceC2594n interfaceC2594n = this.f6489e;
                    if (interfaceC2594n == null ? c2485h.f6489e == null : interfaceC2594n.equals(c2485h.f6489e)) {
                        C2570b c2570b2 = this.f6488d;
                        if (c2570b2 == null ? c2485h.f6488d == null : c2570b2.equals(c2485h.f6488d)) {
                            InterfaceC2594n interfaceC2594n2 = this.f6487c;
                            if (interfaceC2594n2 == null ? c2485h.f6487c == null : interfaceC2594n2.equals(c2485h.f6487c)) {
                                return m1464n() == c2485h.m1464n();
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public InterfaceC2594n m1472f() {
        if (m1466l()) {
            return this.f6487c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    /* renamed from: g */
    public int m1471g() {
        if (m1467k()) {
            return this.f6485a.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    /* renamed from: h */
    public InterfaceC2500d m1470h() {
        return m1463o() ? new C2498b(m1476b()) : m1467k() ? new C2499c(this) : new C2502e(this);
    }

    public int hashCode() {
        Integer num = this.f6485a;
        int intValue = (((num != null ? num.intValue() : 0) * 31) + (m1464n() ? 1231 : 1237)) * 31;
        InterfaceC2594n interfaceC2594n = this.f6487c;
        int hashCode = (intValue + (interfaceC2594n != null ? interfaceC2594n.hashCode() : 0)) * 31;
        C2570b c2570b = this.f6488d;
        int hashCode2 = (hashCode + (c2570b != null ? c2570b.hashCode() : 0)) * 31;
        InterfaceC2594n interfaceC2594n2 = this.f6489e;
        int hashCode3 = (hashCode2 + (interfaceC2594n2 != null ? interfaceC2594n2.hashCode() : 0)) * 31;
        C2570b c2570b2 = this.f6490f;
        int hashCode4 = (hashCode3 + (c2570b2 != null ? c2570b2.hashCode() : 0)) * 31;
        AbstractC2586h abstractC2586h = this.f6491g;
        return hashCode4 + (abstractC2586h != null ? abstractC2586h.hashCode() : 0);
    }

    /* renamed from: i */
    public Map<String, Object> m1469i() {
        HashMap hashMap = new HashMap();
        if (m1466l()) {
            hashMap.put("sp", this.f6487c.getValue());
            C2570b c2570b = this.f6488d;
            if (c2570b != null) {
                hashMap.put("sn", c2570b.m1164e());
            }
        }
        if (m1468j()) {
            hashMap.put("ep", this.f6489e.getValue());
            C2570b c2570b2 = this.f6490f;
            if (c2570b2 != null) {
                hashMap.put("en", c2570b2.m1164e());
            }
        }
        Integer num = this.f6485a;
        if (num != null) {
            hashMap.put("l", num);
            EnumC2487b enumC2487b = this.f6486b;
            if (enumC2487b == null) {
                enumC2487b = m1466l() ? EnumC2487b.LEFT : EnumC2487b.RIGHT;
            }
            int i = C2486a.f6493a[enumC2487b.ordinal()];
            if (i == 1) {
                hashMap.put("vf", "l");
            } else if (i == 2) {
                hashMap.put("vf", "r");
            }
        }
        if (!this.f6491g.equals(C2599q.m1070j())) {
            hashMap.put("i", this.f6491g.mo1057c());
        }
        return hashMap;
    }

    /* renamed from: j */
    public boolean m1468j() {
        return this.f6489e != null;
    }

    /* renamed from: k */
    public boolean m1467k() {
        return this.f6485a != null;
    }

    /* renamed from: l */
    public boolean m1466l() {
        return this.f6487c != null;
    }

    /* renamed from: m */
    public boolean m1465m() {
        return m1463o() && this.f6491g.equals(C2599q.m1070j());
    }

    /* renamed from: n */
    public boolean m1464n() {
        EnumC2487b enumC2487b = this.f6486b;
        return enumC2487b != null ? enumC2487b == EnumC2487b.LEFT : m1466l();
    }

    /* renamed from: o */
    public boolean m1463o() {
        return (m1466l() || m1468j() || m1467k()) ? false : true;
    }

    /* renamed from: q */
    public String m1461q() {
        if (this.f6492h == null) {
            try {
                this.f6492h = C2625b.m992c(m1469i());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f6492h;
    }

    public String toString() {
        return m1469i().toString();
    }
}
