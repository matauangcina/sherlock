package com.google.crypto.tink.signature.internal;

import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class SigUtil {
    static final String INVALID_PARAMS = "Invalid ECDSA parameters";

    public static void validateEcdsaParams(EcdsaParams params) throws GeneralSecurityException {
        EcdsaSignatureEncoding encoding = params.getEncoding();
        HashType hash = params.getHashType();
        EllipticCurveType curve = params.getCurve();
        switch (C12481.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[encoding.ordinal()]) {
            case 1:
            case 2:
                switch (C12481.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[curve.ordinal()]) {
                    case 1:
                        if (hash != HashType.SHA256) {
                            throw new GeneralSecurityException(INVALID_PARAMS);
                        }
                        return;
                    case 2:
                        if (hash != HashType.SHA384 && hash != HashType.SHA512) {
                            throw new GeneralSecurityException(INVALID_PARAMS);
                        }
                        return;
                    case 3:
                        if (hash != HashType.SHA512) {
                            throw new GeneralSecurityException(INVALID_PARAMS);
                        }
                        return;
                    default:
                        throw new GeneralSecurityException(INVALID_PARAMS);
                }
            default:
                throw new GeneralSecurityException("unsupported signature encoding");
        }
    }

    public static void validateRsaSsaPkcs1Params(RsaSsaPkcs1Params params) throws GeneralSecurityException {
        toHashType(params.getHashType());
    }

    public static void validateRsaSsaPssParams(RsaSsaPssParams params) throws GeneralSecurityException {
        toHashType(params.getSigHash());
        if (params.getSigHash() != params.getMgf1Hash()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        if (params.getSaltLength() < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.signature.internal.SigUtil$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C12481 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            int[] iArr3 = new int[EcdsaSignatureEncoding.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = iArr3;
            try {
                iArr3[EcdsaSignatureEncoding.DER.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    public static Enums.HashType toHashType(HashType hash) throws GeneralSecurityException {
        switch (C12481.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()]) {
            case 1:
                return Enums.HashType.SHA256;
            case 2:
                return Enums.HashType.SHA384;
            case 3:
                return Enums.HashType.SHA512;
            default:
                throw new GeneralSecurityException("unsupported hash type: " + hash.name());
        }
    }

    public static EllipticCurves.CurveType toCurveType(EllipticCurveType type) throws GeneralSecurityException {
        switch (C12481.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[type.ordinal()]) {
            case 1:
                return EllipticCurves.CurveType.NIST_P256;
            case 2:
                return EllipticCurves.CurveType.NIST_P384;
            case 3:
                return EllipticCurves.CurveType.NIST_P521;
            default:
                throw new GeneralSecurityException("unknown curve type: " + type.name());
        }
    }

    public static EllipticCurves.EcdsaEncoding toEcdsaEncoding(EcdsaSignatureEncoding encoding) throws GeneralSecurityException {
        switch (C12481.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[encoding.ordinal()]) {
            case 1:
                return EllipticCurves.EcdsaEncoding.DER;
            case 2:
                return EllipticCurves.EcdsaEncoding.IEEE_P1363;
            default:
                throw new GeneralSecurityException("unknown ECDSA encoding: " + encoding.name());
        }
    }

    public static ByteString toUnsignedIntByteString(BigInteger i) {
        byte[] twosComplement = i.toByteArray();
        if (twosComplement[0] == 0) {
            return ByteString.copyFrom(twosComplement, 1, twosComplement.length - 1);
        }
        return ByteString.copyFrom(twosComplement);
    }

    private SigUtil() {
    }
}
