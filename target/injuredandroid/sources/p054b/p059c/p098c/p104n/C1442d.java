package p054b.p059c.p098c.p104n;

import java.util.HashSet;
/* renamed from: b.c.c.n.d */
/* loaded from: classes.dex */
public class C1442d {

    /* renamed from: a */
    private static volatile C1442d f4376a;

    C1442d() {
        new HashSet();
    }

    /* renamed from: a */
    public static C1442d m4164a() {
        C1442d c1442d = f4376a;
        if (c1442d == null) {
            synchronized (C1442d.class) {
                c1442d = f4376a;
                if (c1442d == null) {
                    c1442d = new C1442d();
                    f4376a = c1442d;
                }
            }
        }
        return c1442d;
    }
}
