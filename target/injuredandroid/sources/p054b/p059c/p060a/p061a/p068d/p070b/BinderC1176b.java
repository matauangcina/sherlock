package p054b.p059c.p060a.p061a.p068d.p070b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: b.c.a.a.d.b.b */
/* loaded from: classes.dex */
public class BinderC1176b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC1176b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    /* renamed from: d */
    protected boolean mo3646d(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
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
        return mo3646d(i, parcel, parcel2, i2);
    }
}
