package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: b.c.a.a.d.c.p */
/* loaded from: classes.dex */
public class C1232p implements IInterface {

    /* renamed from: a */
    private final IBinder f3985a;

    /* renamed from: b */
    private final String f3986b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1232p(IBinder iBinder, String str) {
        this.f3985a = iBinder;
        this.f3986b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3985a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m4679d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3986b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m4678g(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3985a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
