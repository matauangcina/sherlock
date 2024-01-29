package com.google.firebase.database.p124p.p125e0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p131r.C2570b;
/* renamed from: com.google.firebase.database.p.e0.d */
/* loaded from: classes.dex */
public abstract class AbstractC2425d {

    /* renamed from: a */
    protected final EnumC2426a f6368a;

    /* renamed from: b */
    protected final C2427e f6369b;

    /* renamed from: c */
    protected final C2506l f6370c;

    /* renamed from: com.google.firebase.database.p.e0.d$a */
    /* loaded from: classes.dex */
    public enum EnumC2426a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2425d(EnumC2426a enumC2426a, C2427e c2427e, C2506l c2506l) {
        this.f6368a = enumC2426a;
        this.f6369b = c2427e;
        this.f6370c = c2506l;
    }

    /* renamed from: a */
    public C2506l m1702a() {
        return this.f6370c;
    }

    /* renamed from: b */
    public C2427e m1701b() {
        return this.f6369b;
    }

    /* renamed from: c */
    public EnumC2426a m1700c() {
        return this.f6368a;
    }

    /* renamed from: d */
    public abstract AbstractC2425d mo1695d(C2570b c2570b);
}
