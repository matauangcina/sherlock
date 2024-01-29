package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
@Immutable
/* loaded from: classes.dex */
final class AesGcmHpkeAead implements HpkeAead {
    private final int keyLength;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AesGcmHpkeAead(int keyLength) throws InvalidAlgorithmParameterException {
        if (keyLength != 16 && keyLength != 32) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + keyLength);
        }
        this.keyLength = keyLength;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] key, byte[] nonce, byte[] plaintext, byte[] associatedData) throws GeneralSecurityException {
        if (key.length != this.keyLength) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + key.length);
        }
        InsecureNonceAesGcmJce aead = new InsecureNonceAesGcmJce(key, false);
        return aead.encrypt(nonce, plaintext, associatedData);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] key, byte[] nonce, byte[] ciphertext, byte[] associatedData) throws GeneralSecurityException {
        if (key.length != this.keyLength) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + key.length);
        }
        InsecureNonceAesGcmJce aead = new InsecureNonceAesGcmJce(key, false);
        return aead.decrypt(nonce, ciphertext, associatedData);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() throws GeneralSecurityException {
        switch (this.keyLength) {
            case 16:
                return HpkeUtil.AES_128_GCM_AEAD_ID;
            case 32:
                return HpkeUtil.AES_256_GCM_AEAD_ID;
            default:
                throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
        return this.keyLength;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getNonceLength() {
        return 12;
    }
}
