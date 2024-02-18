package org.apache.commons.p008io.input;

import java.io.InputStream;
/* renamed from: org.apache.commons.io.input.CloseShieldInputStream */
/* loaded from: classes.dex */
public class CloseShieldInputStream extends ProxyInputStream {
    public CloseShieldInputStream(InputStream in) {
        super(in);
    }

    @Override // org.apache.commons.p008io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in = new ClosedInputStream();
    }
}
