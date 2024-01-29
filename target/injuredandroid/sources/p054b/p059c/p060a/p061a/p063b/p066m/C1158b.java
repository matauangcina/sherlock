package p054b.p059c.p060a.p061a.p063b.p066m;

import android.content.Context;
/* renamed from: b.c.a.a.b.m.b */
/* loaded from: classes.dex */
public class C1158b {

    /* renamed from: b */
    private static C1158b f3879b = new C1158b();

    /* renamed from: a */
    private C1157a f3880a = null;

    /* renamed from: a */
    public static C1157a m4754a(Context context) {
        return f3879b.m4753b(context);
    }

    /* renamed from: b */
    private final synchronized C1157a m4753b(Context context) {
        if (this.f3880a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3880a = new C1157a(context);
        }
        return this.f3880a;
    }
}
