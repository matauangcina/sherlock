package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p054b.p059c.p060a.p061a.p068d.p070b.BinderC1176b;
import p054b.p059c.p060a.p061a.p068d.p070b.C1175a;
import p054b.p059c.p060a.p061a.p068d.p070b.C1177c;
/* renamed from: com.google.android.gms.common.internal.l */
/* loaded from: classes.dex */
public interface InterfaceC1667l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC1668a extends BinderC1176b implements InterfaceC1667l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a */
        /* loaded from: classes.dex */
        public static class C1669a extends C1175a implements InterfaceC1667l {
            C1669a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.InterfaceC1667l
            /* renamed from: c */
            public final Account mo3652c() {
                Parcel m4740g = m4740g(2, m4741d());
                Account account = (Account) C1177c.m4738b(m4740g, Account.CREATOR);
                m4740g.recycle();
                return account;
            }
        }

        /* renamed from: g */
        public static InterfaceC1667l m3653g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC1667l ? (InterfaceC1667l) queryLocalInterface : new C1669a(iBinder);
        }
    }

    /* renamed from: c */
    Account mo3652c();
}
