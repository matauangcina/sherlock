package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class AesEaxJce implements Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;

    /* renamed from: b */
    private final byte[] f5830b;
    private final int ivSizeInBytes;
    private final SecretKeySpec keySpec;

    /* renamed from: p */
    private final byte[] f5831p;
    private static final ThreadLocal<Cipher> localEcbCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private static final ThreadLocal<Cipher> localCtrCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };

    public AesEaxJce(byte[] bArr, int i) {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.ivSizeInBytes = i;
        Validators.validateAesKeySize(bArr.length);
        this.keySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = localEcbCipher.get();
        cipher.init(1, this.keySpec);
        byte[] multiplyByX = multiplyByX(cipher.doFinal(new byte[16]));
        this.f5830b = multiplyByX;
        this.f5831p = multiplyByX(multiplyByX);
    }

    private static byte[] multiplyByX(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    private byte[] omac(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(xor(bArr2, this.f5830b));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        return cipher.doFinal(xor(doFinal, pad(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
    }

    private byte[] pad(byte[] bArr) {
        if (bArr.length == 16) {
            return xor(bArr, this.f5830b);
        }
        byte[] copyOf = Arrays.copyOf(this.f5831p, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private static byte[] xor(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.ivSizeInBytes) - 16;
        if (length >= 0) {
            Cipher cipher = localEcbCipher.get();
            cipher.init(1, this.keySpec);
            byte[] omac = omac(cipher, 0, bArr, 0, this.ivSizeInBytes);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] omac2 = omac(cipher, 1, bArr3, 0, bArr3.length);
            byte[] omac3 = omac(cipher, 2, bArr, this.ivSizeInBytes, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ omac2[i]) ^ omac[i]) ^ omac3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = localCtrCipher.get();
                cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
                return cipher2.doFinal(bArr, this.ivSizeInBytes, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.ivSizeInBytes;
        if (length <= (Reader.READ_DONE - i) - 16) {
            byte[] bArr3 = new byte[bArr.length + i + 16];
            byte[] randBytes = Random.randBytes(i);
            System.arraycopy(randBytes, 0, bArr3, 0, this.ivSizeInBytes);
            Cipher cipher = localEcbCipher.get();
            cipher.init(1, this.keySpec);
            byte[] omac = omac(cipher, 0, randBytes, 0, randBytes.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] omac2 = omac(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = localCtrCipher.get();
            cipher2.init(1, this.keySpec, new IvParameterSpec(omac));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.ivSizeInBytes);
            byte[] omac3 = omac(cipher, 2, bArr3, this.ivSizeInBytes, bArr.length);
            int length2 = bArr.length + this.ivSizeInBytes;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr3[length2 + i2] = (byte) ((omac2[i2] ^ omac[i2]) ^ omac3[i2]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
