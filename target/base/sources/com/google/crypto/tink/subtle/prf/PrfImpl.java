package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
@Immutable
/* loaded from: classes.dex */
public class PrfImpl implements Prf {
    private final StreamingPrf prfStreamer;

    private PrfImpl(StreamingPrf prfStreamer) {
        this.prfStreamer = prfStreamer;
    }

    public static PrfImpl wrap(StreamingPrf prfStreamer) {
        return new PrfImpl(prfStreamer);
    }

    private static byte[] readBytesFromStream(InputStream stream, int outputLength) throws GeneralSecurityException {
        try {
            byte[] output = new byte[outputLength];
            int offset = 0;
            while (offset < outputLength) {
                int bytesRead = stream.read(output, offset, outputLength - offset);
                if (bytesRead <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                offset += bytesRead;
            }
            return output;
        } catch (IOException exception) {
            throw new GeneralSecurityException(exception);
        }
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException {
        if (input == null) {
            throw new GeneralSecurityException("Invalid input provided.");
        }
        if (outputLength <= 0) {
            throw new GeneralSecurityException("Invalid outputLength specified.");
        }
        InputStream prfStream = this.prfStreamer.computePrf(input);
        return readBytesFromStream(prfStream, outputLength);
    }
}
