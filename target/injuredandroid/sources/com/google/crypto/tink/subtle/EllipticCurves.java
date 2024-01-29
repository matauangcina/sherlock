package com.google.crypto.tink.subtle;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
/* loaded from: classes.dex */
public final class EllipticCurves {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.subtle.EllipticCurves$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C21141 {

        /* renamed from: $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType */
        static final /* synthetic */ int[] f5844x7c2ee98b;

        /* renamed from: $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType */
        static final /* synthetic */ int[] f5845xc12280c3;

        static {
            int[] iArr = new int[CurveType.values().length];
            f5844x7c2ee98b = iArr;
            try {
                iArr[CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5844x7c2ee98b[CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5844x7c2ee98b[CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PointFormatType.values().length];
            f5845xc12280c3 = iArr2;
            try {
                iArr2[PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5845xc12280c3[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5845xc12280c3[PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    /* loaded from: classes.dex */
    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    /* loaded from: classes.dex */
    public enum PointFormatType {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    static void checkPointOnCurve(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger modulus = getModulus(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(modulus).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(modulus))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkPublicKey(ECPublicKey eCPublicKey) {
        checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        return computeSharedSecret(eCPrivateKey, eCPublicKey.getW());
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPoint eCPoint) {
        checkPointOnCurve(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement engineFactory = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(eCPrivateKey);
        try {
            engineFactory.doPhase(generatePublic, true);
            byte[] generateSecret = engineFactory.generateSecret();
            validateSharedSecret(generateSecret, eCPrivateKey);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }

    @Deprecated
    public static ECPoint ecPointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) {
        return pointDecode(ellipticCurve, pointFormatType, bArr);
    }

    public static byte[] ecdsaDer2Ieee(byte[] bArr, int i) {
        if (isValidDerEncoding(bArr)) {
            byte[] bArr2 = new byte[i];
            int i2 = ((bArr[1] & 255) >= 128 ? 3 : 2) + 1;
            int i3 = i2 + 1;
            int i4 = bArr[i2];
            int i5 = bArr[i3] == 0 ? 1 : 0;
            System.arraycopy(bArr, i3 + i5, bArr2, ((i / 2) - i4) + i5, i4 - i5);
            int i6 = i3 + i4 + 1;
            int i7 = i6 + 1;
            int i8 = bArr[i6];
            int i9 = bArr[i7] != 0 ? 0 : 1;
            System.arraycopy(bArr, i7 + i9, bArr2, (i - i8) + i9, i8 - i9);
            return bArr2;
        }
        throw new GeneralSecurityException("Invalid DER encoding");
    }

    public static byte[] ecdsaIeee2Der(byte[] bArr) {
        byte[] bArr2;
        int i;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] minimalSignedNumber = toMinimalSignedNumber(Arrays.copyOf(bArr, bArr.length / 2));
        byte[] minimalSignedNumber2 = toMinimalSignedNumber(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = minimalSignedNumber.length + 2 + 1 + 1 + minimalSignedNumber2.length;
        if (length >= 128) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) length;
            i = 3;
        } else {
            bArr2 = new byte[length + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) length;
            i = 2;
        }
        int i2 = i + 1;
        bArr2[i] = 2;
        int i3 = i2 + 1;
        bArr2[i2] = (byte) minimalSignedNumber.length;
        System.arraycopy(minimalSignedNumber, 0, bArr2, i3, minimalSignedNumber.length);
        int length2 = i3 + minimalSignedNumber.length;
        int i4 = length2 + 1;
        bArr2[length2] = 2;
        bArr2[i4] = (byte) minimalSignedNumber2.length;
        System.arraycopy(minimalSignedNumber2, 0, bArr2, i4 + 1, minimalSignedNumber2.length);
        return bArr2;
    }

    public static int encodingSizeInBytes(EllipticCurve ellipticCurve, PointFormatType pointFormatType) {
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = C21141.f5845xc12280c3[pointFormatType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return fieldSizeInBytes + 1;
                }
                throw new GeneralSecurityException("unknown EC point format");
            }
            return fieldSizeInBytes * 2;
        }
        return (fieldSizeInBytes * 2) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fieldSizeInBits(EllipticCurve ellipticCurve) {
        return getModulus(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve ellipticCurve) {
        return (fieldSizeInBits(ellipticCurve) + 7) / 8;
    }

    public static KeyPair generateKeyPair(CurveType curveType) {
        return generateKeyPair(getCurveSpec(curveType));
    }

    public static KeyPair generateKeyPair(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("EC");
        engineFactory.initialize(eCParameterSpec);
        return engineFactory.generateKeyPair();
    }

    public static ECParameterSpec getCurveSpec(CurveType curveType) {
        int i = C21141.f5844x7c2ee98b[curveType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return getNistP521Params();
                }
                throw new NoSuchAlgorithmException("curve not implemented:" + curveType);
            }
            return getNistP384Params();
        }
        return getNistP256Params();
    }

    public static ECPrivateKey getEcPrivateKey(CurveType curveType, byte[] bArr) {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), getCurveSpec(curveType)));
    }

    public static ECPrivateKey getEcPrivateKey(byte[] bArr) {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) {
        return getEcPublicKey(getCurveSpec(curveType), pointFormatType, bArr);
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, byte[] bArr, byte[] bArr2) {
        ECParameterSpec curveSpec = getCurveSpec(curveType);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, curveSpec));
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec eCParameterSpec, PointFormatType pointFormatType, byte[] bArr) {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new ECPublicKeySpec(pointDecode(eCParameterSpec.getCurve(), pointFormatType, bArr), eCParameterSpec));
    }

    public static ECPublicKey getEcPublicKey(byte[] bArr) {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static BigInteger getModulus(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    private static ECParameterSpec getNistCurveSpec(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static ECParameterSpec getNistP256Params() {
        return getNistCurveSpec("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    public static ECParameterSpec getNistP384Params() {
        return getNistCurveSpec("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    public static ECParameterSpec getNistP521Params() {
        return getNistCurveSpec("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    public static BigInteger getY(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger modulus = getModulus(ellipticCurve);
        BigInteger modSqrt = modSqrt(bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(modulus), modulus);
        return z != modSqrt.testBit(0) ? modulus.subtract(modSqrt).mod(modulus) : modSqrt;
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec eCParameterSpec) {
        return isSameEcParameterSpec(eCParameterSpec, getNistP256Params()) || isSameEcParameterSpec(eCParameterSpec, getNistP384Params()) || isSameEcParameterSpec(eCParameterSpec, getNistP521Params());
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    public static boolean isValidDerEncoding(byte[] bArr) {
        int i;
        if (bArr.length >= 8 && bArr[0] == 48) {
            int i2 = bArr[1] & 255;
            if (i2 == 129) {
                i2 = bArr[2] & 255;
                if (i2 < 128) {
                    return false;
                }
                i = 2;
            } else if (i2 == 128 || i2 > 129) {
                return false;
            } else {
                i = 1;
            }
            if (i2 != (bArr.length - 1) - i) {
                return false;
            }
            int i3 = i + 1;
            if (bArr[i3] != 2) {
                return false;
            }
            int i4 = i3 + 1;
            int i5 = bArr[i4] & 255;
            int i6 = i4 + 1 + i5 + 1;
            if (i6 < bArr.length && i5 != 0) {
                int i7 = i + 3;
                if ((bArr[i7] & 255) >= 128) {
                    return false;
                }
                if ((i5 <= 1 || bArr[i7] != 0 || (bArr[i + 4] & 255) >= 128) && bArr[i7 + i5] == 2) {
                    int i8 = bArr[i6] & 255;
                    if (i6 + 1 + i8 == bArr.length && i8 != 0) {
                        int i9 = i + 5 + i5;
                        if ((bArr[i9] & 255) >= 128) {
                            return false;
                        }
                        return i8 <= 1 || bArr[i9] != 0 || (bArr[(i + 6) + i5] & 255) >= 128;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    protected static BigInteger modSqrt(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 1) {
            BigInteger mod = bigInteger.mod(bigInteger2);
            BigInteger bigInteger3 = null;
            if (mod.equals(BigInteger.ZERO)) {
                return BigInteger.ZERO;
            }
            int i = 0;
            if (bigInteger2.testBit(0) && bigInteger2.testBit(1)) {
                bigInteger3 = mod.modPow(bigInteger2.add(BigInteger.ONE).shiftRight(2), bigInteger2);
            } else if (bigInteger2.testBit(0) && !bigInteger2.testBit(1)) {
                BigInteger bigInteger4 = BigInteger.ONE;
                BigInteger shiftRight = bigInteger2.subtract(bigInteger4).shiftRight(1);
                while (true) {
                    BigInteger mod2 = bigInteger4.multiply(bigInteger4).subtract(mod).mod(bigInteger2);
                    if (mod2.equals(BigInteger.ZERO)) {
                        return bigInteger4;
                    }
                    BigInteger modPow = mod2.modPow(shiftRight, bigInteger2);
                    if (modPow.add(BigInteger.ONE).equals(bigInteger2)) {
                        BigInteger shiftRight2 = bigInteger2.add(BigInteger.ONE).shiftRight(1);
                        BigInteger bigInteger5 = BigInteger.ONE;
                        BigInteger bigInteger6 = bigInteger5;
                        BigInteger bigInteger7 = bigInteger4;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger7.multiply(bigInteger6);
                            bigInteger7 = bigInteger7.multiply(bigInteger7).add(bigInteger6.multiply(bigInteger6).mod(bigInteger2).multiply(mod2)).mod(bigInteger2);
                            bigInteger6 = multiply.add(multiply).mod(bigInteger2);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod3 = bigInteger7.multiply(bigInteger4).add(bigInteger6.multiply(mod2)).mod(bigInteger2);
                                bigInteger6 = bigInteger4.multiply(bigInteger6).add(bigInteger7).mod(bigInteger2);
                                bigInteger7 = mod3;
                            }
                        }
                        bigInteger3 = bigInteger7;
                    } else if (!modPow.equals(BigInteger.ONE)) {
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    } else {
                        bigInteger4 = bigInteger4.add(BigInteger.ONE);
                        i++;
                        if (i == 128 && !bigInteger2.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
            }
            if (bigInteger3 == null || bigInteger3.multiply(bigInteger3).mod(bigInteger2).compareTo(mod) == 0) {
                return bigInteger3;
            }
            throw new GeneralSecurityException("Could not find a modular square root");
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECPoint pointDecode(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) {
        return pointDecode(getCurveSpec(curveType).getCurve(), pointFormatType, bArr);
    }

    public static ECPoint pointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) {
        ECPoint eCPoint;
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = C21141.f5845xc12280c3[pointFormatType.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new GeneralSecurityException("invalid format:" + pointFormatType);
                }
                BigInteger modulus = getModulus(ellipticCurve);
                if (bArr.length == fieldSizeInBytes + 1) {
                    if (bArr[0] != 2) {
                        if (bArr[0] != 3) {
                            throw new GeneralSecurityException("invalid format");
                        }
                        z = true;
                    }
                    BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                    if (bigInteger.signum() == -1 || bigInteger.compareTo(modulus) >= 0) {
                        throw new GeneralSecurityException("x is out of range");
                    }
                    return new ECPoint(bigInteger, getY(bigInteger, z, ellipticCurve));
                }
                throw new GeneralSecurityException("compressed point has wrong length");
            } else if (bArr.length != fieldSizeInBytes * 2) {
                throw new GeneralSecurityException("invalid point size");
            } else {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, fieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(bArr, fieldSizeInBytes, bArr.length)));
            }
        } else if (bArr.length != (fieldSizeInBytes * 2) + 1) {
            throw new GeneralSecurityException("invalid point size");
        } else {
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i2 = fieldSizeInBytes + 1;
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, bArr.length)));
        }
        checkPointOnCurve(eCPoint, ellipticCurve);
        return eCPoint;
    }

    public static byte[] pointEncode(CurveType curveType, PointFormatType pointFormatType, ECPoint eCPoint) {
        return pointEncode(getCurveSpec(curveType).getCurve(), pointFormatType, eCPoint);
    }

    public static byte[] pointEncode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, ECPoint eCPoint) {
        checkPointOnCurve(eCPoint, ellipticCurve);
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = C21141.f5845xc12280c3[pointFormatType.ordinal()];
        if (i == 1) {
            int i2 = (fieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i2];
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr, i2 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr, (fieldSizeInBytes + 1) - byteArray.length, byteArray.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i != 2) {
            if (i != 3) {
                throw new GeneralSecurityException("invalid format:" + pointFormatType);
            }
            int i3 = fieldSizeInBytes + 1;
            byte[] bArr2 = new byte[i3];
            byte[] byteArray3 = eCPoint.getAffineX().toByteArray();
            System.arraycopy(byteArray3, 0, bArr2, i3 - byteArray3.length, byteArray3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        int i4 = fieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i4];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        if (byteArray4.length > fieldSizeInBytes) {
            byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - fieldSizeInBytes, byteArray4.length);
        }
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        if (byteArray5.length > fieldSizeInBytes) {
            byteArray5 = Arrays.copyOfRange(byteArray5, byteArray5.length - fieldSizeInBytes, byteArray5.length);
        }
        System.arraycopy(byteArray5, 0, bArr3, i4 - byteArray5.length, byteArray5.length);
        System.arraycopy(byteArray4, 0, bArr3, fieldSizeInBytes - byteArray4.length, byteArray4.length);
        return bArr3;
    }

    private static byte[] toMinimalSignedNumber(byte[] bArr) {
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        if (i == bArr.length) {
            i = bArr.length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - i) + i2];
        System.arraycopy(bArr, i, bArr2, i2, bArr.length - i);
        return bArr2;
    }

    public static void validatePublicKey(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        checkPointOnCurve(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void validatePublicKeySpec(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            if (isSameEcParameterSpec(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }

    private static void validateSharedSecret(byte[] bArr, ECPrivateKey eCPrivateKey) {
        EllipticCurve curve = eCPrivateKey.getParams().getCurve();
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.signum() == -1 || bigInteger.compareTo(getModulus(curve)) >= 0) {
            throw new GeneralSecurityException("shared secret is out of range");
        }
        getY(bigInteger, true, curve);
    }
}
