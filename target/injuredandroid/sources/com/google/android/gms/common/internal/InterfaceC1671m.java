package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p054b.p059c.p060a.p061a.p068d.p070b.BinderC1176b;
import p054b.p059c.p060a.p061a.p068d.p070b.C1177c;
/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes.dex */
public interface InterfaceC1671m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC1672a extends BinderC1176b implements InterfaceC1671m {
        public AbstractBinderC1672a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // p054b.p059c.p060a.p061a.p068d.p070b.BinderC1176b
        /* renamed from: d */
        protected final boolean mo3646d(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                mo3647X(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C1177c.m4738b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo3648Q(parcel.readInt(), (Bundle) C1177c.m4738b(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo3649N(parcel.readInt(), parcel.readStrongBinder(), (C1647c0) C1177c.m4738b(parcel, C1647c0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: N */
    void mo3649N(int i, IBinder iBinder, C1647c0 c1647c0);

    /* renamed from: Q */
    void mo3648Q(int i, Bundle bundle);

    /* renamed from: X */
    void mo3647X(int i, IBinder iBinder, Bundle bundle);
}
