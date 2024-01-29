package net.gotev.uploadservice.http;

import java.io.IOException;
import java.io.InputStream;
import net.gotev.uploadservice.UploadService;
/* loaded from: classes.dex */
public abstract class BodyWriter {

    /* loaded from: classes.dex */
    public interface OnStreamWriteListener {
        void onBytesWritten(int i);

        boolean shouldContinueWriting();
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr) throws IOException;

    public abstract void write(byte[] bArr, int i) throws IOException;

    public final void writeStream(InputStream stream, OnStreamWriteListener listener) throws IOException {
        int bytesRead;
        if (listener == null) {
            throw new IllegalArgumentException("listener MUST not be null!");
        }
        byte[] buffer = new byte[UploadService.BUFFER_SIZE];
        while (listener.shouldContinueWriting() && (bytesRead = stream.read(buffer, 0, buffer.length)) > 0) {
            write(buffer, bytesRead);
            flush();
            listener.onBytesWritten(bytesRead);
        }
    }
}
