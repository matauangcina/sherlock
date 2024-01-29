package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.jwt.JwtFormat;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EcdsaVerifyJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Validators;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.util.Optional;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JwtEcdsaVerifyKeyManager extends KeyTypeManager<JwtEcdsaPublicKey> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10141 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm;

        static {
            int[] iArr = new int[JwtEcdsaAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = iArr;
            try {
                iArr[JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final EllipticCurves.CurveType getCurve(JwtEcdsaAlgorithm algorithm) throws GeneralSecurityException {
        switch (C10141.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[algorithm.ordinal()]) {
            case 1:
                return EllipticCurves.CurveType.NIST_P256;
            case 2:
                return EllipticCurves.CurveType.NIST_P384;
            case 3:
                return EllipticCurves.CurveType.NIST_P521;
            default:
                throw new GeneralSecurityException("unknown algorithm " + algorithm.name());
        }
    }

    public static Enums.HashType hashForEcdsaAlgorithm(JwtEcdsaAlgorithm algorithm) throws GeneralSecurityException {
        switch (C10141.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[algorithm.ordinal()]) {
            case 1:
                return Enums.HashType.SHA256;
            case 2:
                return Enums.HashType.SHA384;
            case 3:
                return Enums.HashType.SHA512;
            default:
                throw new GeneralSecurityException("unknown algorithm " + algorithm.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void validateEcdsaAlgorithm(JwtEcdsaAlgorithm algorithm) throws GeneralSecurityException {
        hashForEcdsaAlgorithm(algorithm);
    }

    /* loaded from: classes.dex */
    private static class JwtPublicKeyVerifyFactory extends PrimitiveFactory<JwtPublicKeyVerifyInternal, JwtEcdsaPublicKey> {
        public JwtPublicKeyVerifyFactory() {
            super(JwtPublicKeyVerifyInternal.class);
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public JwtPublicKeyVerifyInternal getPrimitive(JwtEcdsaPublicKey keyProto) throws GeneralSecurityException {
            final Optional<String> customKidFromEcdsaPublicKey;
            EllipticCurves.CurveType curve = JwtEcdsaVerifyKeyManager.getCurve(keyProto.getAlgorithm());
            ECPublicKey publicKey = EllipticCurves.getEcPublicKey(curve, keyProto.getX().toByteArray(), keyProto.getY().toByteArray());
            Enums.HashType hash = JwtEcdsaVerifyKeyManager.hashForEcdsaAlgorithm(keyProto.getAlgorithm());
            final EcdsaVerifyJce verifier = new EcdsaVerifyJce(publicKey, hash, EllipticCurves.EcdsaEncoding.IEEE_P1363);
            final String algorithmName = keyProto.getAlgorithm().name();
            if (keyProto.hasCustomKid()) {
                customKidFromEcdsaPublicKey = Optional.of(keyProto.getCustomKid().getValue());
            } else {
                customKidFromEcdsaPublicKey = Optional.empty();
            }
            return new JwtPublicKeyVerifyInternal() { // from class: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.JwtPublicKeyVerifyFactory.1
                @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal
                public VerifiedJwt verifyAndDecodeWithKid(String compact, JwtValidator validator, Optional<String> kid) throws GeneralSecurityException {
                    JwtFormat.Parts parts = JwtFormat.splitSignedCompact(compact);
                    verifier.verify(parts.signatureOrMac, parts.unsignedCompact.getBytes(StandardCharsets.US_ASCII));
                    JsonObject parsedHeader = JsonUtil.parseJson(parts.header);
                    JwtFormat.validateHeader(algorithmName, kid, customKidFromEcdsaPublicKey, parsedHeader);
                    RawJwt token = RawJwt.fromJsonPayload(JwtFormat.getTypeHeader(parsedHeader), parts.payload);
                    return validator.validate(token);
                }
            };
        }
    }

    public JwtEcdsaVerifyKeyManager() {
        super(JwtEcdsaPublicKey.class, new JwtPublicKeyVerifyFactory());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtEcdsaPublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtEcdsaPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtEcdsaPublicKey pubKey) throws GeneralSecurityException {
        Validators.validateVersion(pubKey.getVersion(), getVersion());
        validateEcdsaAlgorithm(pubKey.getAlgorithm());
    }
}
