package net.gotev.uploadservice.http.impl;

import java.io.IOException;
import java.io.OutputStream;
import net.gotev.uploadservice.http.BodyWriter;
/* loaded from: classes.dex */
public class HurlBodyWriter extends BodyWriter {
    private OutputStream mOutputStream;

    public HurlBodyWriter(OutputStream outputStream) {
        this.mOutputStream = outputStream;
    }

    @Override // net.gotev.uploadservice.http.BodyWriter
    public void write(byte[] bytes) throws IOException {
        this.mOutputStream.write(bytes);
    }

    @Override // net.gotev.uploadservice.http.BodyWriter
    public void write(byte[] bytes, int lengthToWriteFromStart) throws IOException {
        this.mOutputStream.write(bytes, 0, lengthToWriteFromStart);
    }

    @Override // net.gotev.uploadservice.http.BodyWriter
    public void flush() throws IOException {
        this.mOutputStream.flush();
    }
}
