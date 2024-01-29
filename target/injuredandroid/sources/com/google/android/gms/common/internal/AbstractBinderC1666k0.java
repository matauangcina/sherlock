package com.google.android.gms.common.internal;

import android.os.Parcel;
import p054b.p059c.p060a.p061a.p067c.InterfaceC1168a;
import p054b.p059c.p060a.p061a.p068d.p070b.BinderC1176b;
import p054b.p059c.p060a.p061a.p068d.p070b.C1177c;
/* renamed from: com.google.android.gms.common.internal.k0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1666k0 extends BinderC1176b implements InterfaceC1664j0 {
    public AbstractBinderC1666k0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p070b.BinderC1176b
    /* renamed from: d */
    protected final boolean mo3646d(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC1168a mo3657a = mo3657a();
            parcel2.writeNoException();
            C1177c.m4737c(parcel2, mo3657a);
        } else if (i != 2) {
            return false;
        } else {
            int mo3656b = mo3656b();
            parcel2.writeNoException();
            parcel2.writeInt(mo3656b);
        }
        return true;
    }
}
