package org.apache.commons.p008io.input;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: org.apache.commons.io.input.DemuxInputStream */
/* loaded from: classes.dex */
public class DemuxInputStream extends InputStream {
    private final InheritableThreadLocal<InputStream> m_streams = new InheritableThreadLocal<>();

    public InputStream bindStream(InputStream input) {
        InputStream oldValue = this.m_streams.get();
        this.m_streams.set(input);
        return oldValue;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream input = this.m_streams.get();
        if (input != null) {
            input.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream input = this.m_streams.get();
        if (input != null) {
            return input.read();
        }
        return -1;
    }
}
