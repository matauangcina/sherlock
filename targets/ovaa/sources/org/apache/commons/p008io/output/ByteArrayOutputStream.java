package org.apache.commons.p008io.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p008io.input.ClosedInputStream;
/* renamed from: org.apache.commons.io.output.ByteArrayOutputStream */
/* loaded from: classes.dex */
public class ByteArrayOutputStream extends OutputStream {
    static final int DEFAULT_SIZE = 1024;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final List<byte[]> buffers;
    private int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;
    private boolean reuseBuffers;

    public ByteArrayOutputStream() {
        this(1024);
    }

    public ByteArrayOutputStream(int size) {
        this.buffers = new ArrayList();
        this.reuseBuffers = true;
        if (size < 0) {
            throw new IllegalArgumentException("Negative initial size: " + size);
        }
        synchronized (this) {
            needNewBuffer(size);
        }
    }

    private void needNewBuffer(int newcount) {
        int newBufferSize;
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            int i = this.currentBufferIndex + 1;
            this.currentBufferIndex = i;
            this.currentBuffer = this.buffers.get(i);
            return;
        }
        byte[] bArr = this.currentBuffer;
        if (bArr == null) {
            newBufferSize = newcount;
            this.filledBufferSum = 0;
        } else {
            int newBufferSize2 = bArr.length;
            newBufferSize = Math.max(newBufferSize2 << 1, newcount - this.filledBufferSum);
            this.filledBufferSum += this.currentBuffer.length;
        }
        this.currentBufferIndex++;
        byte[] bArr2 = new byte[newBufferSize];
        this.currentBuffer = bArr2;
        this.buffers.add(bArr2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int off, int len) {
        if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (len == 0) {
            return;
        }
        synchronized (this) {
            int i = this.count;
            int newcount = i + len;
            int remaining = len;
            int inBufferPos = i - this.filledBufferSum;
            while (remaining > 0) {
                int part = Math.min(remaining, this.currentBuffer.length - inBufferPos);
                System.arraycopy(b, (off + len) - remaining, this.currentBuffer, inBufferPos, part);
                remaining -= part;
                if (remaining > 0) {
                    needNewBuffer(newcount);
                    inBufferPos = 0;
                }
            }
            this.count = newcount;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int b) {
        int i = this.count;
        int inBufferPos = i - this.filledBufferSum;
        if (inBufferPos == this.currentBuffer.length) {
            needNewBuffer(i + 1);
            inBufferPos = 0;
        }
        this.currentBuffer[inBufferPos] = (byte) b;
        this.count++;
    }

    public synchronized int write(InputStream in) throws IOException {
        int readCount;
        readCount = 0;
        int inBufferPos = this.count - this.filledBufferSum;
        byte[] bArr = this.currentBuffer;
        int n = in.read(bArr, inBufferPos, bArr.length - inBufferPos);
        while (n != -1) {
            readCount += n;
            inBufferPos += n;
            this.count += n;
            byte[] bArr2 = this.currentBuffer;
            if (inBufferPos == bArr2.length) {
                needNewBuffer(bArr2.length);
                inBufferPos = 0;
            }
            byte[] bArr3 = this.currentBuffer;
            n = in.read(bArr3, inBufferPos, bArr3.length - inBufferPos);
        }
        return readCount;
    }

    public synchronized int size() {
        return this.count;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized void reset() {
        this.count = 0;
        this.filledBufferSum = 0;
        this.currentBufferIndex = 0;
        if (this.reuseBuffers) {
            this.currentBuffer = this.buffers.get(0);
        } else {
            this.currentBuffer = null;
            int size = this.buffers.get(0).length;
            this.buffers.clear();
            needNewBuffer(size);
            this.reuseBuffers = true;
        }
    }

    public synchronized void writeTo(OutputStream out) throws IOException {
        int remaining = this.count;
        for (byte[] buf : this.buffers) {
            int c = Math.min(buf.length, remaining);
            out.write(buf, 0, c);
            remaining -= c;
            if (remaining == 0) {
                break;
            }
        }
    }

    public static InputStream toBufferedInputStream(InputStream input) throws IOException {
        return toBufferedInputStream(input, 1024);
    }

    public static InputStream toBufferedInputStream(InputStream input, int size) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream(size);
        output.write(input);
        return output.toInputStream();
    }

    public synchronized InputStream toInputStream() {
        int remaining = this.count;
        if (remaining == 0) {
            return new ClosedInputStream();
        }
        List<ByteArrayInputStream> list = new ArrayList<>(this.buffers.size());
        for (byte[] buf : this.buffers) {
            int c = Math.min(buf.length, remaining);
            list.add(new ByteArrayInputStream(buf, 0, c));
            remaining -= c;
            if (remaining == 0) {
                break;
            }
        }
        this.reuseBuffers = false;
        return new SequenceInputStream(Collections.enumeration(list));
    }

    public synchronized byte[] toByteArray() {
        int remaining = this.count;
        if (remaining == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] newbuf = new byte[remaining];
        int pos = 0;
        for (byte[] buf : this.buffers) {
            int c = Math.min(buf.length, remaining);
            System.arraycopy(buf, 0, newbuf, pos, c);
            pos += c;
            remaining -= c;
            if (remaining == 0) {
                break;
            }
        }
        return newbuf;
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public String toString(String enc) throws UnsupportedEncodingException {
        return new String(toByteArray(), enc);
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }
}
