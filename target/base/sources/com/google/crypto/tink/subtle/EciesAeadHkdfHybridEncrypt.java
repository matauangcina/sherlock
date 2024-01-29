package com.google.crypto.tink.subtle;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.hybrid.subtle.AeadOrDaead;
import com.google.crypto.tink.subtle.EciesHkdfSenderKem;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes.dex */
public final class EciesAeadHkdfHybridEncrypt implements HybridEncrypt {
    private static final byte[] EMPTY_AAD = new byte[0];
    private final EciesAeadHkdfDemHelper demHelper;
    private final EllipticCurves.PointFormatType ecPointFormat;
    private final String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final EciesHkdfSenderKem senderKem;

    public EciesAeadHkdfHybridEncrypt(final ECPublicKey recipientPublicKey, final byte[] hkdfSalt, String hkdfHmacAlgo, EllipticCurves.PointFormatType ecPointFormat, EciesAeadHkdfDemHelper demHelper) throws GeneralSecurityException {
        EllipticCurves.checkPublicKey(recipientPublicKey);
        this.senderKem = new EciesHkdfSenderKem(recipientPublicKey);
        this.hkdfSalt = hkdfSalt;
        this.hkdfHmacAlgo = hkdfHmacAlgo;
        this.ecPointFormat = ecPointFormat;
        this.demHelper = demHelper;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(final byte[] plaintext, final byte[] contextInfo) throws GeneralSecurityException {
        EciesHkdfSenderKem.KemKey kemKey = this.senderKem.generateKey(this.hkdfHmacAlgo, this.hkdfSalt, contextInfo, this.demHelper.getSymmetricKeySizeInBytes(), this.ecPointFormat);
        AeadOrDaead aead = this.demHelper.getAeadOrDaead(kemKey.getSymmetricKey());
        byte[] ciphertext = aead.encrypt(plaintext, EMPTY_AAD);
        byte[] header = kemKey.getKemBytes();
        return ByteBuffer.allocate(header.length + ciphertext.length).put(header).put(ciphertext).array();
    }
}
