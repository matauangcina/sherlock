package com.google.android.gms.common.api.internal;

import java.util.Map;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.C1289h;
import p054b.p059c.p060a.p061a.p074f.InterfaceC1284c;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes.dex */
public final class C1605o<TResult> implements InterfaceC1284c<TResult> {

    /* renamed from: a */
    private final /* synthetic */ C1289h f4709a;

    /* renamed from: b */
    private final /* synthetic */ C1608p0 f4710b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1605o(C1608p0 c1608p0, C1289h c1289h) {
        this.f4710b = c1608p0;
        this.f4709a = c1289h;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1284c
    /* renamed from: a */
    public final void mo3802a(AbstractC1288g<TResult> abstractC1288g) {
        Map map;
        map = this.f4710b.f4712b;
        map.remove(this.f4709a);
    }
}
