package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public interface ChunkedMacComputation {
    byte[] computeMac() throws GeneralSecurityException;

    void update(ByteBuffer data) throws GeneralSecurityException;
}
