package com.google.firebase.auth.p118z.p119a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C2202t;
import p054b.p059c.p060a.p061a.p068d.p071c.BinderC1179a;
import p054b.p059c.p060a.p061a.p068d.p071c.C1205g1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1209h1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1219k1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1225m1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1248u0;
import p054b.p059c.p060a.p061a.p068d.p071c.C1258x1;
/* renamed from: com.google.firebase.auth.z.a.q0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2254q0 extends BinderC1179a implements InterfaceC2256r0 {
    public AbstractBinderC2254q0() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.BinderC1179a
    /* renamed from: d */
    protected final boolean mo2209d(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2205I((C1237q1) C1248u0.m4658a(parcel, C1237q1.CREATOR));
                return true;
            case 2:
                mo2196t((C1237q1) C1248u0.m4658a(parcel, C1237q1.CREATOR), (C1225m1) C1248u0.m4658a(parcel, C1225m1.CREATOR));
                return true;
            case 3:
                mo2195w((C1219k1) C1248u0.m4658a(parcel, C1219k1.CREATOR));
                return true;
            case 4:
                mo2206F((C1258x1) C1248u0.m4658a(parcel, C1258x1.CREATOR));
                return true;
            case 5:
                mo2201e((Status) C1248u0.m4658a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo2208A();
                return true;
            case 7:
                mo2203a();
                return true;
            case 8:
                mo2200f(parcel.readString());
                return true;
            case 9:
                mo2194z(parcel.readString());
                return true;
            case 10:
                mo2197q((C2202t) C1248u0.m4658a(parcel, C2202t.CREATOR));
                return true;
            case 11:
                mo2198o(parcel.readString());
                return true;
            case 12:
                mo2199i((Status) C1248u0.m4658a(parcel, Status.CREATOR), (C2202t) C1248u0.m4658a(parcel, C2202t.CREATOR));
                return true;
            case 13:
                mo2202b();
                return true;
            case 14:
                mo2204T((C1205g1) C1248u0.m4658a(parcel, C1205g1.CREATOR));
                return true;
            case 15:
                mo2207E((C1209h1) C1248u0.m4658a(parcel, C1209h1.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
