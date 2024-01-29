package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
@Immutable
/* loaded from: classes.dex */
public final class PrfHmacJce implements Prf {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final String algorithm;
    private final Key key;
    private final ThreadLocal<Mac> localMac;
    private final int maxOutputLength;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public PrfHmacJce(String algorithm, Key key) throws GeneralSecurityException {
        char c;
        ThreadLocal<Mac> threadLocal = new ThreadLocal<Mac>() { // from class: com.google.crypto.tink.subtle.PrfHmacJce.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public Mac initialValue() {
                try {
                    Mac mac = EngineFactory.MAC.getInstance(PrfHmacJce.this.algorithm);
                    mac.init(PrfHmacJce.this.key);
                    return mac;
                } catch (GeneralSecurityException ex) {
                    throw new IllegalStateException(ex);
                }
            }
        };
        this.localMac = threadLocal;
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.algorithm = algorithm;
        this.key = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (algorithm.hashCode()) {
            case -1823053428:
                if (algorithm.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (algorithm.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                if (algorithm.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 392316170:
                if (algorithm.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (algorithm.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.maxOutputLength = 20;
                break;
            case 1:
                this.maxOutputLength = 28;
                break;
            case 2:
                this.maxOutputLength = 32;
                break;
            case 3:
                this.maxOutputLength = 48;
                break;
            case 4:
                this.maxOutputLength = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + algorithm);
        }
        threadLocal.get();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] data, int outputLength) throws GeneralSecurityException {
        if (outputLength > this.maxOutputLength) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.localMac.get().update(data);
        return Arrays.copyOf(this.localMac.get().doFinal(), outputLength);
    }

    public int getMaxOutputLength() {
        return this.maxOutputLength;
    }
}
