package com.google.crypto.tink.subtle;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StreamingAeadEncryptingStream extends FilterOutputStream {
    ByteBuffer ctBuffer;
    private StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    ByteBuffer ptBuffer;

    public StreamingAeadEncryptingStream(NonceBasedStreamingAead nonceBasedStreamingAead, OutputStream outputStream, byte[] bArr) {
        super(outputStream);
        this.encrypter = nonceBasedStreamingAead.newStreamSegmentEncrypter(bArr);
        int plaintextSegmentSize = nonceBasedStreamingAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        this.ptBuffer = ByteBuffer.allocate(plaintextSegmentSize);
        this.ctBuffer = ByteBuffer.allocate(nonceBasedStreamingAead.getCiphertextSegmentSize());
        this.ptBuffer.limit(this.plaintextSegmentSize - nonceBasedStreamingAead.getCiphertextOffset());
        ByteBuffer header = this.encrypter.getHeader();
        byte[] bArr2 = new byte[header.remaining()];
        header.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.open = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.open) {
            try {
                this.ptBuffer.flip();
                this.ctBuffer.clear();
                this.encrypter.encryptSegment(this.ptBuffer, true, this.ctBuffer);
                this.ctBuffer.flip();
                ((FilterOutputStream) this).out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());
                this.open = false;
                super.close();
            } catch (GeneralSecurityException e) {
                throw new IOException("ptBuffer.remaining():" + this.ptBuffer.remaining() + " ctBuffer.remaining():" + this.ctBuffer.remaining(), e);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (!this.open) {
            throw new IOException("Trying to write to closed stream");
        }
        while (i2 > this.ptBuffer.remaining()) {
            int remaining = this.ptBuffer.remaining();
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i, remaining);
            i += remaining;
            i2 -= remaining;
            try {
                this.ptBuffer.flip();
                this.ctBuffer.clear();
                this.encrypter.encryptSegment(this.ptBuffer, wrap, false, this.ctBuffer);
                this.ctBuffer.flip();
                ((FilterOutputStream) this).out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());
                this.ptBuffer.clear();
                this.ptBuffer.limit(this.plaintextSegmentSize);
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        }
        this.ptBuffer.put(bArr, i, i2);
    }
}
