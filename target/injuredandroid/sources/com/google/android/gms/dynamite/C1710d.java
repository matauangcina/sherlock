package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p054b.p059c.p060a.p061a.p067c.InterfaceC1168a;
import p054b.p059c.p060a.p061a.p068d.p070b.C1175a;
import p054b.p059c.p060a.p061a.p068d.p070b.C1177c;
/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
public final class C1710d extends C1175a implements InterfaceC1709c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1710d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1709c
    /* renamed from: O */
    public final int mo3533O() {
        Parcel m4740g = m4740g(6, m4741d());
        int readInt = m4740g.readInt();
        m4740g.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1709c
    /* renamed from: j */
    public final int mo3532j(InterfaceC1168a interfaceC1168a, String str, boolean z) {
        Parcel m4741d = m4741d();
        C1177c.m4737c(m4741d, interfaceC1168a);
        m4741d.writeString(str);
        C1177c.m4739a(m4741d, z);
        Parcel m4740g = m4740g(5, m4741d);
        int readInt = m4740g.readInt();
        m4740g.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1709c
    /* renamed from: y */
    public final int mo3531y(InterfaceC1168a interfaceC1168a, String str, boolean z) {
        Parcel m4741d = m4741d();
        C1177c.m4737c(m4741d, interfaceC1168a);
        m4741d.writeString(str);
        C1177c.m4739a(m4741d, z);
        Parcel m4740g = m4740g(3, m4741d);
        int readInt = m4740g.readInt();
        m4740g.recycle();
        return readInt;
    }
}
