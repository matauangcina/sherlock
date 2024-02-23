package org.apache.commons.p008io.output;

import java.io.OutputStream;
/* renamed from: org.apache.commons.io.output.CloseShieldOutputStream */
/* loaded from: classes.dex */
public class CloseShieldOutputStream extends ProxyOutputStream {
    public CloseShieldOutputStream(OutputStream out) {
        super(out);
    }

    @Override // org.apache.commons.p008io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out = new ClosedOutputStream();
    }
}
