package p054b.p059c.p060a.p061a.p068d.p069a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: b.c.a.a.d.a.a */
/* loaded from: classes.dex */
public class BinderC1171a extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC1171a(String str) {
        attachInterface(this, str);
    }

    /* renamed from: Y */
    protected abstract boolean mo4616Y(int i, Parcel parcel, Parcel parcel2, int i2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo4616Y(i, parcel, parcel2, i2);
    }
}
