package p054b.p055a.p056a.p057v;

import java.io.ByteArrayOutputStream;
/* renamed from: b.a.a.v.k */
/* loaded from: classes.dex */
public class C1127k extends ByteArrayOutputStream {

    /* renamed from: f */
    private final C1114d f3833f;

    public C1127k(C1114d c1114d, int i) {
        this.f3833f = c1114d;
        ((ByteArrayOutputStream) this).buf = c1114d.m4914a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m4856a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] m4914a = this.f3833f.m4914a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m4914a, 0, ((ByteArrayOutputStream) this).count);
        this.f3833f.m4913b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m4914a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3833f.m4913b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f3833f.m4913b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m4856a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m4856a(i2);
        super.write(bArr, i, i2);
    }
}
