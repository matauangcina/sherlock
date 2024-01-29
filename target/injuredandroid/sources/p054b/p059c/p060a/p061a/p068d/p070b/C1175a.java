package p054b.p059c.p060a.p061a.p068d.p070b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: b.c.a.a.d.b.a */
/* loaded from: classes.dex */
public class C1175a implements IInterface {

    /* renamed from: a */
    private final IBinder f3890a;

    /* renamed from: b */
    private final String f3891b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1175a(IBinder iBinder, String str) {
        this.f3890a = iBinder;
        this.f3891b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3890a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m4741d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3891b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final Parcel m4740g(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3890a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
