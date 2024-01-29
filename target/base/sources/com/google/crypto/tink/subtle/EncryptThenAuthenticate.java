package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Mac;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class EncryptThenAuthenticate implements Aead {
    private final IndCpaCipher cipher;
    private final Mac mac;
    private final int macLength;

    public EncryptThenAuthenticate(final IndCpaCipher cipher, final Mac mac, int macLength) {
        this.cipher = cipher;
        this.mac = mac;
        this.macLength = macLength;
    }

    public static Aead newAesCtrHmac(final byte[] aesCtrKey, int ivSize, String hmacAlgorithm, final byte[] hmacKey, int tagSize) throws GeneralSecurityException {
        IndCpaCipher cipher = new AesCtrJceCipher(aesCtrKey, ivSize);
        SecretKeySpec hmacKeySpec = new SecretKeySpec(hmacKey, "HMAC");
        Mac hmac = new PrfMac(new PrfHmacJce(hmacAlgorithm, hmacKeySpec), tagSize);
        return new EncryptThenAuthenticate(cipher, hmac, tagSize);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        byte[] ciphertext = this.cipher.encrypt(plaintext);
        byte[] ad = associatedData;
        if (ad == null) {
            ad = new byte[0];
        }
        byte[] adLengthInBits = Arrays.copyOf(ByteBuffer.allocate(8).putLong(ad.length * 8).array(), 8);
        byte[] macValue = this.mac.computeMac(Bytes.concat(ad, ciphertext, adLengthInBits));
        return Bytes.concat(ciphertext, macValue);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = ciphertext.length;
        int i = this.macLength;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] rawCiphertext = Arrays.copyOfRange(ciphertext, 0, ciphertext.length - i);
        byte[] macValue = Arrays.copyOfRange(ciphertext, ciphertext.length - this.macLength, ciphertext.length);
        byte[] ad = associatedData;
        if (ad == null) {
            ad = new byte[0];
        }
        byte[] adLengthInBits = Arrays.copyOf(ByteBuffer.allocate(8).putLong(ad.length * 8).array(), 8);
        this.mac.verifyMac(macValue, Bytes.concat(ad, rawCiphertext, adLengthInBits));
        return this.cipher.decrypt(rawCiphertext);
    }
}
