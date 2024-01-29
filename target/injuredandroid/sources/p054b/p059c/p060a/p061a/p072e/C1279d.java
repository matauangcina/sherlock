package p054b.p059c.p060a.p061a.p072e;

import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.Scope;
import p054b.p059c.p060a.p061a.p072e.p073b.C1266a;
/* renamed from: b.c.a.a.e.d */
/* loaded from: classes.dex */
public final class C1279d {

    /* renamed from: a */
    private static final C1548a.C1557g<C1266a> f4054a = new C1548a.C1557g<>();

    /* renamed from: b */
    private static final C1548a.C1557g<C1266a> f4055b = new C1548a.C1557g<>();

    /* renamed from: c */
    public static final C1548a.AbstractC1549a<C1266a, C1265a> f4056c = new C1278c();

    /* renamed from: d */
    private static final C1548a.AbstractC1549a<C1266a, Object> f4057d = new C1281f();

    static {
        new Scope("profile");
        new Scope("email");
        new C1548a("SignIn.API", f4056c, f4054a);
        new C1548a("SignIn.INTERNAL_API", f4057d, f4055b);
    }
}
