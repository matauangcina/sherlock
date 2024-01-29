package com.google.firebase.database.p132s;

import com.google.firebase.database.p132s.C2605a;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
/* renamed from: com.google.firebase.database.s.h */
/* loaded from: classes.dex */
class C2621h {

    /* renamed from: b */
    private C2612c f6793b;

    /* renamed from: e */
    private C2605a.InterfaceC2607b f6796e;

    /* renamed from: a */
    private DataInputStream f6792a = null;

    /* renamed from: c */
    private InterfaceC2617d f6794c = null;

    /* renamed from: d */
    private byte[] f6795d = new byte[112];

    /* renamed from: f */
    private volatile boolean f6797f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2621h(C2612c c2612c) {
        this.f6793b = null;
        this.f6793b = c2612c;
    }

    /* renamed from: a */
    private void m1015a(boolean z, byte b, byte[] bArr) {
        if (b == 9) {
            if (!z) {
                throw new C2618e("PING must not fragment across frames");
            }
            m1013c(bArr);
        } else if (this.f6796e != null && b != 0) {
            throw new C2618e("Failed to continue outstanding frame");
        } else {
            if (this.f6796e == null && b == 0) {
                throw new C2618e("Received continuing frame, but there's nothing to continue");
            }
            if (this.f6796e == null) {
                this.f6796e = C2605a.m1051a(b);
            }
            if (!this.f6796e.mo1050a(bArr)) {
                throw new C2618e("Failed to decode frame");
            }
            if (z) {
                C2620g mo1049b = this.f6796e.mo1049b();
                this.f6796e = null;
                if (mo1049b == null) {
                    throw new C2618e("Failed to decode whole message");
                }
                this.f6794c.mo1024e(mo1049b);
            }
        }
    }

    /* renamed from: b */
    private void m1014b(C2618e c2618e) {
        m1008h();
        this.f6793b.m1035k(c2618e);
    }

    /* renamed from: c */
    private void m1013c(byte[] bArr) {
        if (bArr.length > 125) {
            throw new C2618e("PING frame too long");
        }
        this.f6793b.m1033m(bArr);
    }

    /* renamed from: d */
    private long m1012d(byte[] bArr, int i) {
        return (bArr[i + 0] << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + ((bArr[i + 7] & 255) << 0);
    }

    /* renamed from: e */
    private int m1011e(byte[] bArr, int i, int i2) {
        this.f6792a.readFully(bArr, i, i2);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1010f() {
        boolean z;
        this.f6794c = this.f6793b.m1039g();
        while (!this.f6797f) {
            try {
                m1011e(this.f6795d, 0, 1);
                z = (this.f6795d[0] & 128) != 0;
            } catch (C2618e e) {
                m1014b(e);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                m1014b(new C2618e("IO Error", e2));
            }
            if ((this.f6795d[0] & 112) != 0) {
                throw new C2618e("Invalid frame received");
            }
            byte b = (byte) (this.f6795d[0] & 15);
            m1011e(this.f6795d, 1, 1);
            byte b2 = this.f6795d[1];
            long j = 0;
            if (b2 < 126) {
                j = b2;
            } else if (b2 == 126) {
                m1011e(this.f6795d, 2, 2);
                j = ((this.f6795d[2] & 255) << 8) | (this.f6795d[3] & 255);
            } else if (b2 == Byte.MAX_VALUE) {
                m1011e(this.f6795d, 2, 8);
                j = m1012d(this.f6795d, 2);
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            m1011e(bArr, 0, i);
            if (b == 8) {
                this.f6793b.m1034l();
            } else if (b != 10) {
                if (b != 1 && b != 2 && b != 9 && b != 0) {
                    throw new C2618e("Unsupported opcode: " + ((int) b));
                }
                m1015a(z, b, bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1009g(DataInputStream dataInputStream) {
        this.f6792a = dataInputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1008h() {
        this.f6797f = true;
    }
}
