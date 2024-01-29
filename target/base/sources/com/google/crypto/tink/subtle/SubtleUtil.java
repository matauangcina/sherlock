package com.google.crypto.tink.subtle;

import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class SubtleUtil {
    public static String toEcdsaAlgo(Enums.HashType hash) throws GeneralSecurityException {
        Validators.validateSignatureHash(hash);
        return hash + "withECDSA";
    }

    public static String toRsaSsaPkcs1Algo(Enums.HashType hash) throws GeneralSecurityException {
        Validators.validateSignatureHash(hash);
        return hash + "withRSA";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.subtle.SubtleUtil$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C12641 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public static String toDigestAlgo(Enums.HashType hash) throws GeneralSecurityException {
        switch (C12641.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hash.ordinal()]) {
            case 1:
                return "SHA-1";
            case 2:
                return "SHA-224";
            case 3:
                return "SHA-256";
            case 4:
                return "SHA-384";
            case 5:
                return "SHA-512";
            default:
                throw new GeneralSecurityException("Unsupported hash " + hash);
        }
    }

    public static boolean isAndroid() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    @Deprecated
    public static int androidApiLevel() {
        Integer androidApiLevel = Util.getAndroidApiLevel();
        if (androidApiLevel != null) {
            return androidApiLevel.intValue();
        }
        return -1;
    }

    public static BigInteger bytes2Integer(byte[] bs) {
        return BigIntegerEncoding.fromUnsignedBigEndianBytes(bs);
    }

    public static byte[] integer2Bytes(BigInteger num, int intendedLength) throws GeneralSecurityException {
        return BigIntegerEncoding.toBigEndianBytesOfFixedLength(num, intendedLength);
    }

    public static byte[] mgf1(byte[] mgfSeed, int maskLen, Enums.HashType mgfHash) throws GeneralSecurityException {
        MessageDigest digest = EngineFactory.MESSAGE_DIGEST.getInstance(toDigestAlgo(mgfHash));
        int hLen = digest.getDigestLength();
        byte[] t = new byte[maskLen];
        int tPos = 0;
        for (int counter = 0; counter <= (maskLen - 1) / hLen; counter++) {
            digest.reset();
            digest.update(mgfSeed);
            digest.update(integer2Bytes(BigInteger.valueOf(counter), 4));
            byte[] c = digest.digest();
            System.arraycopy(c, 0, t, tPos, Math.min(c.length, t.length - tPos));
            tPos += c.length;
        }
        return t;
    }

    public static void putAsUnsigedInt(ByteBuffer buffer, long value) throws GeneralSecurityException {
        if (0 > value || value >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        buffer.putInt((int) value);
    }

    private SubtleUtil() {
    }
}
