package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes.dex */
final class C1674n implements InterfaceC1675o {

    /* renamed from: a */
    private final IBinder f4841a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1674n(IBinder iBinder) {
        this.f4841a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1675o
    /* renamed from: C */
    public final void mo3645C(InterfaceC1671m interfaceC1671m, C1656g c1656g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC1671m != null ? interfaceC1671m.asBinder() : null);
            if (c1656g != null) {
                obtain.writeInt(1);
                c1656g.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4841a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4841a;
    }
}
