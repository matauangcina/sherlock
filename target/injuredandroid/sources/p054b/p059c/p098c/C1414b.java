package p054b.p059c.p098c;

import android.content.Context;
import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.c.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1414b implements InterfaceC1435a {

    /* renamed from: a */
    private final C1415c f4342a;

    /* renamed from: b */
    private final Context f4343b;

    private C1414b(C1415c c1415c, Context context) {
        this.f4342a = c1415c;
        this.f4343b = context;
    }

    /* renamed from: a */
    public static InterfaceC1435a m4210a(C1415c c1415c, Context context) {
        return new C1414b(c1415c, context);
    }

    @Override // p054b.p059c.p098c.p101l.InterfaceC1435a
    public Object get() {
        return C1415c.m4189u(this.f4342a, this.f4343b);
    }
}
