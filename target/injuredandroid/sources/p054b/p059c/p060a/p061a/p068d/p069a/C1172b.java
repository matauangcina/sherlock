package p054b.p059c.p060a.p061a.p068d.p069a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: b.c.a.a.d.a.b */
/* loaded from: classes.dex */
public class C1172b implements IInterface {

    /* renamed from: a */
    private final IBinder f3888a;

    /* renamed from: b */
    private final String f3889b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1172b(IBinder iBinder, String str) {
        this.f3888a = iBinder;
        this.f3889b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3888a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m4746d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3889b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m4745g(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3888a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
