package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1581e;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: classes.dex */
public final class C1599l0 extends AbstractC1595j0<Boolean> {

    /* renamed from: b */
    private final C1590h<?> f4698b;

    public C1599l0(C1590h<?> c1590h, C1289h<Boolean> c1289h) {
        super(4, c1289h);
        this.f4698b = c1590h;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo3817c(C1608p0 c1608p0, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1611r
    /* renamed from: g */
    public final C1146c[] mo3790g(C1581e.C1582a<?> c1582a) {
        C1622z c1622z = c1582a.m3843x().get(this.f4698b);
        if (c1622z == null) {
            return null;
        }
        return c1622z.f4739a.m3824b();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1611r
    /* renamed from: h */
    public final boolean mo3789h(C1581e.C1582a<?> c1582a) {
        C1622z c1622z = c1582a.m3843x().get(this.f4698b);
        if (c1622z == null) {
            return false;
        }
        c1622z.f4739a.m3822d();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1595j0
    /* renamed from: i */
    public final void mo3816i(C1581e.C1582a<?> c1582a) {
        C1622z remove = c1582a.m3843x().remove(this.f4698b);
        if (remove == null) {
            this.f4694a.m4606e(Boolean.FALSE);
            return;
        }
        remove.f4740b.m3804a(c1582a.m3852o(), this.f4694a);
        remove.f4739a.m3825a();
    }
}
