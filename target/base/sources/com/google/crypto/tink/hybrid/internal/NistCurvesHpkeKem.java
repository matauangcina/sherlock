package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
@Immutable
/* loaded from: classes.dex */
final class NistCurvesHpkeKem implements HpkeKem {
    private final EllipticCurves.CurveType curve;
    private final HkdfHpkeKdf hkdf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C09941 {

        /* renamed from: $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType */
        static final /* synthetic */ int[] f178x7c2ee98b;

        static {
            int[] iArr = new int[EllipticCurves.CurveType.values().length];
            f178x7c2ee98b = iArr;
            try {
                iArr[EllipticCurves.CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f178x7c2ee98b[EllipticCurves.CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f178x7c2ee98b[EllipticCurves.CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NistCurvesHpkeKem fromCurve(EllipticCurves.CurveType curve) throws GeneralSecurityException {
        switch (C09941.f178x7c2ee98b[curve.ordinal()]) {
            case 1:
                return new NistCurvesHpkeKem(new HkdfHpkeKdf("HmacSha256"), EllipticCurves.CurveType.NIST_P256);
            case 2:
                return new NistCurvesHpkeKem(new HkdfHpkeKdf("HmacSha384"), EllipticCurves.CurveType.NIST_P384);
            case 3:
                return new NistCurvesHpkeKem(new HkdfHpkeKdf("HmacSha512"), EllipticCurves.CurveType.NIST_P521);
            default:
                throw new GeneralSecurityException("invalid curve type: " + curve);
        }
    }

    private NistCurvesHpkeKem(HkdfHpkeKdf hkdf, EllipticCurves.CurveType curve) {
        this.hkdf = hkdf;
        this.curve = curve;
    }

    private byte[] deriveKemSharedSecret(byte[] dhSharedSecret, byte[] senderPublicKey, byte[] recipientPublicKey) throws GeneralSecurityException {
        byte[] kemContext = Bytes.concat(senderPublicKey, recipientPublicKey);
        byte[] kemSuiteID = HpkeUtil.kemSuiteId(getKemId());
        HkdfHpkeKdf hkdfHpkeKdf = this.hkdf;
        return hkdfHpkeKdf.extractAndExpand(null, dhSharedSecret, "eae_prk", kemContext, "shared_secret", kemSuiteID, hkdfHpkeKdf.getMacLength());
    }

    HpkeKemEncapOutput encapsulate(byte[] recipientPublicKey, KeyPair senderKeyPair) throws GeneralSecurityException {
        ECPublicKey recipientECPublicKey = EllipticCurves.getEcPublicKey(this.curve, EllipticCurves.PointFormatType.UNCOMPRESSED, recipientPublicKey);
        byte[] dhSharedSecret = EllipticCurves.computeSharedSecret((ECPrivateKey) senderKeyPair.getPrivate(), recipientECPublicKey);
        byte[] senderPublicKey = EllipticCurves.pointEncode(this.curve, EllipticCurves.PointFormatType.UNCOMPRESSED, ((ECPublicKey) senderKeyPair.getPublic()).getW());
        byte[] kemSharedSecret = deriveKemSharedSecret(dhSharedSecret, senderPublicKey, recipientPublicKey);
        return new HpkeKemEncapOutput(kemSharedSecret, senderPublicKey);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public HpkeKemEncapOutput encapsulate(byte[] recipientPublicKey) throws GeneralSecurityException {
        KeyPair keyPair = EllipticCurves.generateKeyPair(this.curve);
        return encapsulate(recipientPublicKey, keyPair);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] decapsulate(byte[] encapsulatedKey, HpkeKemPrivateKey recipientPrivateKey) throws GeneralSecurityException {
        ECPrivateKey privateKey = EllipticCurves.getEcPrivateKey(this.curve, recipientPrivateKey.getSerializedPrivate().toByteArray());
        ECPublicKey publicKey = EllipticCurves.getEcPublicKey(this.curve, EllipticCurves.PointFormatType.UNCOMPRESSED, encapsulatedKey);
        byte[] dhSharedSecret = EllipticCurves.computeSharedSecret(privateKey, publicKey);
        return deriveKemSharedSecret(dhSharedSecret, encapsulatedKey, recipientPrivateKey.getSerializedPublic().toByteArray());
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] getKemId() throws GeneralSecurityException {
        switch (C09941.f178x7c2ee98b[this.curve.ordinal()]) {
            case 1:
                return HpkeUtil.P256_HKDF_SHA256_KEM_ID;
            case 2:
                return HpkeUtil.P384_HKDF_SHA384_KEM_ID;
            case 3:
                return HpkeUtil.P521_HKDF_SHA512_KEM_ID;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
    }
}
