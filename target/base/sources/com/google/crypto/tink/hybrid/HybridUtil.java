package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HybridUtil {
    public static void validate(EciesAeadHkdfParams params) throws GeneralSecurityException {
        EllipticCurves.getCurveSpec(toCurveType(params.getKemParams().getCurveType()));
        toHmacAlgo(params.getKemParams().getHkdfHashType());
        if (params.getEcPointFormat() == EcPointFormat.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        Registry.newKeyData(params.getDemParams().getAeadDem());
    }

    public static String toHmacAlgo(HashType hash) throws NoSuchAlgorithmException {
        switch (C09861.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha224";
            case 3:
                return "HmacSha256";
            case 4:
                return "HmacSha384";
            case 5:
                return "HmacSha512";
            default:
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hash);
        }
    }

    public static EllipticCurves.CurveType toCurveType(EllipticCurveType type) throws GeneralSecurityException {
        switch (C09861.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[type.ordinal()]) {
            case 1:
                return EllipticCurves.CurveType.NIST_P256;
            case 2:
                return EllipticCurves.CurveType.NIST_P384;
            case 3:
                return EllipticCurves.CurveType.NIST_P521;
            default:
                throw new GeneralSecurityException("unknown curve type: " + type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.hybrid.HybridUtil$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C09861 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcPointFormat;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[EcPointFormat.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcPointFormat = iArr;
            try {
                iArr[EcPointFormat.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcPointFormat[EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcPointFormat[EcPointFormat.COMPRESSED.ordinal()] = 3;
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
            int[] iArr3 = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr3;
            try {
                iArr3[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    public static EllipticCurves.PointFormatType toPointFormatType(EcPointFormat format) throws GeneralSecurityException {
        switch (C09861.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat[format.ordinal()]) {
            case 1:
                return EllipticCurves.PointFormatType.UNCOMPRESSED;
            case 2:
                return EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            case 3:
                return EllipticCurves.PointFormatType.COMPRESSED;
            default:
                throw new GeneralSecurityException("unknown point format: " + format);
        }
    }

    private HybridUtil() {
    }
}
