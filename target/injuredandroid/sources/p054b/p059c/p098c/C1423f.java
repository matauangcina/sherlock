package p054b.p059c.p098c;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1598l;
/* renamed from: b.c.c.f */
/* loaded from: classes.dex */
public class C1423f implements InterfaceC1598l {
    @Override // com.google.android.gms.common.api.internal.InterfaceC1598l
    /* renamed from: a */
    public Exception mo3818a(Status status) {
        return status.m3969b() == 8 ? new C1422e(status.m3966j()) : new C1413a(status.m3966j());
    }
}
