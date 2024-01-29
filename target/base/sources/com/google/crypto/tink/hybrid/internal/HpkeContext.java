package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.proto.HpkePublicKey;
import com.google.crypto.tink.subtle.Bytes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
final class HpkeContext {
    private static final byte[] EMPTY_IKM = new byte[0];
    private final HpkeAead aead;
    private final byte[] baseNonce;
    private final byte[] encapsulatedKey;
    private final byte[] key;
    private final BigInteger maxSequenceNumber;
    private BigInteger sequenceNumber = BigInteger.ZERO;

    private HpkeContext(byte[] encapsulatedKey, byte[] key, byte[] baseNonce, BigInteger maxSequenceNumber, HpkeAead aead) {
        this.encapsulatedKey = encapsulatedKey;
        this.key = key;
        this.baseNonce = baseNonce;
        this.maxSequenceNumber = maxSequenceNumber;
        this.aead = aead;
    }

    static HpkeContext createContext(byte[] encapsulatedKey, byte[] sharedSecret, HpkeKem kem, HpkeKdf kdf, HpkeAead aead, byte[] info) throws GeneralSecurityException {
        byte[] suiteId = HpkeUtil.hpkeSuiteId(kem.getKemId(), kdf.getKdfId(), aead.getAeadId());
        byte[] bArr = HpkeUtil.EMPTY_SALT;
        byte[] bArr2 = EMPTY_IKM;
        byte[] pskIdHash = kdf.labeledExtract(bArr, bArr2, "psk_id_hash", suiteId);
        byte[] infoHash = kdf.labeledExtract(HpkeUtil.EMPTY_SALT, info, "info_hash", suiteId);
        byte[] keyScheduleContext = Bytes.concat(HpkeUtil.BASE_MODE, pskIdHash, infoHash);
        byte[] secret = kdf.labeledExtract(sharedSecret, bArr2, "secret", suiteId);
        byte[] key = kdf.labeledExpand(secret, keyScheduleContext, "key", suiteId, aead.getKeyLength());
        byte[] baseNonce = kdf.labeledExpand(secret, keyScheduleContext, "base_nonce", suiteId, aead.getNonceLength());
        BigInteger maxSeqNo = maxSequenceNumber(aead.getNonceLength());
        return new HpkeContext(encapsulatedKey, key, baseNonce, maxSeqNo, aead);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HpkeContext createSenderContext(HpkePublicKey recipientPublicKey, HpkeKem kem, HpkeKdf kdf, HpkeAead aead, byte[] info) throws GeneralSecurityException {
        HpkeKemEncapOutput encapOutput = kem.encapsulate(recipientPublicKey.getPublicKey().toByteArray());
        byte[] encapsulatedKey = encapOutput.getEncapsulatedKey();
        byte[] sharedSecret = encapOutput.getSharedSecret();
        return createContext(encapsulatedKey, sharedSecret, kem, kdf, aead, info);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HpkeContext createRecipientContext(byte[] encapsulatedKey, HpkeKemPrivateKey recipientPrivateKey, HpkeKem kem, HpkeKdf kdf, HpkeAead aead, byte[] info) throws GeneralSecurityException {
        byte[] sharedSecret = kem.decapsulate(encapsulatedKey, recipientPrivateKey);
        return createContext(encapsulatedKey, sharedSecret, kem, kdf, aead, info);
    }

    private static BigInteger maxSequenceNumber(int nonceLength) {
        return BigInteger.ONE.shiftLeft(nonceLength * 8).subtract(BigInteger.ONE);
    }

    private void incrementSequenceNumber() throws GeneralSecurityException {
        if (this.sequenceNumber.compareTo(this.maxSequenceNumber) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.sequenceNumber = this.sequenceNumber.add(BigInteger.ONE);
    }

    private byte[] computeNonce() throws GeneralSecurityException {
        return Bytes.xor(this.baseNonce, BigIntegerEncoding.toBigEndianBytesOfFixedLength(this.sequenceNumber, this.aead.getNonceLength()));
    }

    private synchronized byte[] computeNonceAndIncrementSequenceNumber() throws GeneralSecurityException {
        byte[] nonce;
        nonce = computeNonce();
        incrementSequenceNumber();
        return nonce;
    }

    byte[] getKey() {
        return this.key;
    }

    byte[] getBaseNonce() {
        return this.baseNonce;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] getEncapsulatedKey() {
        return this.encapsulatedKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] seal(byte[] plaintext, byte[] associatedData) throws GeneralSecurityException {
        byte[] nonce = computeNonceAndIncrementSequenceNumber();
        return this.aead.seal(this.key, nonce, plaintext, associatedData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] open(byte[] ciphertext, byte[] associatedData) throws GeneralSecurityException {
        byte[] nonce = computeNonceAndIncrementSequenceNumber();
        return this.aead.open(this.key, nonce, ciphertext, associatedData);
    }
}
