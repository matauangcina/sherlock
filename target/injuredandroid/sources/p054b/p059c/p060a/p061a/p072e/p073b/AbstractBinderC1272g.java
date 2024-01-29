package p054b.p059c.p060a.p061a.p072e.p073b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p054b.p059c.p060a.p061a.p063b.C1144a;
import p054b.p059c.p060a.p061a.p068d.p069a.BinderC1171a;
import p054b.p059c.p060a.p061a.p068d.p069a.C1173c;
/* renamed from: b.c.a.a.e.b.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1272g extends BinderC1171a implements InterfaceC1269d {
    public AbstractBinderC1272g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p069a.BinderC1171a
    /* renamed from: Y */
    protected boolean mo4616Y(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            mo4620H((C1144a) C1173c.m4744a(parcel, C1144a.CREATOR), (C1268c) C1173c.m4744a(parcel, C1268c.CREATOR));
        } else if (i == 4) {
            mo4619V((Status) C1173c.m4744a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo4618k((Status) C1173c.m4744a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo4617p((Status) C1173c.m4744a(parcel, Status.CREATOR), (GoogleSignInAccount) C1173c.m4744a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo3903D((C1277l) C1173c.m4744a(parcel, C1277l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
