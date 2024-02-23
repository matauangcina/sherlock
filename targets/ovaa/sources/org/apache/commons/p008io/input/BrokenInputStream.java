package org.apache.commons.p008io.input;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: org.apache.commons.io.input.BrokenInputStream */
/* loaded from: classes.dex */
public class BrokenInputStream extends InputStream {
    private final IOException exception;

    public BrokenInputStream(IOException exception) {
        this.exception = exception;
    }

    public BrokenInputStream() {
        this(new IOException("Broken input stream"));
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exception;
    }
}
