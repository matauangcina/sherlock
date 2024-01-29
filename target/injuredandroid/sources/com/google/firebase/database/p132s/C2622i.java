package com.google.firebase.database.p132s;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.google.firebase.database.s.i */
/* loaded from: classes.dex */
class C2622i {

    /* renamed from: a */
    private BlockingQueue<ByteBuffer> f6798a;

    /* renamed from: e */
    private C2612c f6802e;

    /* renamed from: f */
    private WritableByteChannel f6803f;

    /* renamed from: b */
    private final Random f6799b = new Random();

    /* renamed from: c */
    private volatile boolean f6800c = false;

    /* renamed from: d */
    private boolean f6801d = false;

    /* renamed from: g */
    private final Thread f6804g = C2612c.m1036j().newThread(new RunnableC2623a());

    /* renamed from: com.google.firebase.database.s.i$a */
    /* loaded from: classes.dex */
    class RunnableC2623a implements Runnable {
        RunnableC2623a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2622i.this.m1002f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2622i(C2612c c2612c, String str, int i) {
        InterfaceC2611b m1037i = C2612c.m1037i();
        Thread m1004d = m1004d();
        m1037i.mo1027a(m1004d, str + "Writer-" + i);
        this.f6802e = c2612c;
        this.f6798a = new LinkedBlockingQueue();
    }

    /* renamed from: b */
    private ByteBuffer m1006b(byte b, boolean z, byte[] bArr) {
        int i = z ? 6 : 2;
        int length = bArr.length;
        if (length >= 126) {
            i = length <= 65535 ? i + 2 : i + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i);
        allocate.put((byte) (b | Byte.MIN_VALUE));
        if (length < 126) {
            if (z) {
                length |= 128;
            }
            allocate.put((byte) length);
        } else if (length <= 65535) {
            allocate.put((byte) (z ? 254 : 126));
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) (z ? 255 : 127));
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z) {
            byte[] m1005c = m1005c();
            allocate.put(m1005c);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                allocate.put((byte) (bArr[i2] ^ m1005c[i2 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: c */
    private byte[] m1005c() {
        byte[] bArr = new byte[4];
        this.f6799b.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: e */
    private void m1003e(C2618e c2618e) {
        this.f6802e.m1035k(c2618e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m1002f() {
        while (!this.f6800c && !Thread.interrupted()) {
            try {
                m998j();
            } catch (IOException e) {
                m1003e(new C2618e("IO Exception", e));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i = 0; i < this.f6798a.size(); i++) {
            m998j();
        }
    }

    /* renamed from: j */
    private void m998j() {
        this.f6803f.write(this.f6798a.take());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Thread m1004d() {
        return this.f6804g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1.f6801d = true;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m1001g(byte r2, boolean r3, byte[] r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r3 = r1.m1006b(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            boolean r4 = r1.f6800c     // Catch: java.lang.Throwable -> L26
            r0 = 8
            if (r4 == 0) goto L1a
            boolean r4 = r1.f6801d     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L12
            if (r2 != r0) goto L12
            goto L1a
        L12:
            com.google.firebase.database.s.e r2 = new com.google.firebase.database.s.e     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Shouldn't be sending"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L1a:
            if (r2 != r0) goto L1f
            r2 = 1
            r1.f6801d = r2     // Catch: java.lang.Throwable -> L26
        L1f:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r1.f6798a     // Catch: java.lang.Throwable -> L26
            r2.add(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)
            return
        L26:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p132s.C2622i.m1001g(byte, boolean, byte[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1000h(OutputStream outputStream) {
        this.f6803f = Channels.newChannel(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m999i() {
        this.f6800c = true;
    }
}
