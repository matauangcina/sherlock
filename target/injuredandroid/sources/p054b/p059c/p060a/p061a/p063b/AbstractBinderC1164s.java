package p054b.p059c.p060a.p061a.p063b;

import java.lang.ref.WeakReference;
/* renamed from: b.c.a.a.b.s */
/* loaded from: classes.dex */
abstract class AbstractBinderC1164s extends AbstractBinderC1162q {

    /* renamed from: c */
    private static final WeakReference<byte[]> f3884c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f3885b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC1164s(byte[] bArr) {
        super(bArr);
        this.f3885b = f3884c;
    }

    /* renamed from: Y */
    protected abstract byte[] mo4749Y();

    @Override // p054b.p059c.p060a.p061a.p063b.AbstractBinderC1162q
    /* renamed from: g */
    final byte[] mo4750g() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f3885b.get();
            if (bArr == null) {
                bArr = mo4749Y();
                this.f3885b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
