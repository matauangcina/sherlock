package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.C2506l;
import java.util.Comparator;
/* renamed from: com.google.firebase.database.r.h */
/* loaded from: classes.dex */
public abstract class AbstractC2586h implements Comparator<C2593m> {
    /* renamed from: b */
    public static AbstractC2586h m1112b(String str) {
        if (str.equals(".value")) {
            return C2604u.m1052j();
        }
        if (str.equals(".key")) {
            return C2588j.m1098j();
        }
        if (str.equals(".priority")) {
            throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
        }
        return new C2598p(new C2506l(str));
    }

    /* renamed from: a */
    public int m1113a(C2593m c2593m, C2593m c2593m2, boolean z) {
        return z ? compare(c2593m2, c2593m) : compare(c2593m, c2593m2);
    }

    /* renamed from: c */
    public abstract String mo1057c();

    /* renamed from: d */
    public boolean m1111d(InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2) {
        return compare(new C2593m(C2570b.m1160l(), interfaceC2594n), new C2593m(C2570b.m1160l(), interfaceC2594n2)) != 0;
    }

    /* renamed from: e */
    public abstract boolean mo1056e(InterfaceC2594n interfaceC2594n);

    /* renamed from: f */
    public abstract C2593m mo1055f(C2570b c2570b, InterfaceC2594n interfaceC2594n);

    /* renamed from: g */
    public abstract C2593m mo1054g();

    /* renamed from: h */
    public C2593m m1110h() {
        return C2593m.m1090b();
    }
}
