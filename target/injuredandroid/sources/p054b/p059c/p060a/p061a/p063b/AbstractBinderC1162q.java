package p054b.p059c.p060a.p061a.p063b;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC1666k0;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.InterfaceC1664j0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p054b.p059c.p060a.p061a.p067c.BinderC1170b;
import p054b.p059c.p060a.p061a.p067c.InterfaceC1168a;
/* renamed from: b.c.a.a.b.q */
/* loaded from: classes.dex */
abstract class AbstractBinderC1162q extends AbstractBinderC1666k0 {

    /* renamed from: a */
    private int f3882a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC1162q(byte[] bArr) {
        C1679r.m3638a(bArr.length == 25);
        this.f3882a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public static byte[] m4751h(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1664j0
    /* renamed from: a */
    public final InterfaceC1168a mo3657a() {
        return BinderC1170b.m4747h(mo4750g());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1664j0
    /* renamed from: b */
    public final int mo3656b() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        InterfaceC1168a mo3657a;
        if (obj != null && (obj instanceof InterfaceC1664j0)) {
            try {
                InterfaceC1664j0 interfaceC1664j0 = (InterfaceC1664j0) obj;
                if (interfaceC1664j0.mo3656b() == hashCode() && (mo3657a = interfaceC1664j0.mo3657a()) != null) {
                    return Arrays.equals(mo4750g(), (byte[]) BinderC1170b.m4748g(mo3657a));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: g */
    abstract byte[] mo4750g();

    public int hashCode() {
        return this.f3882a;
    }
}
