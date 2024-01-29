package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.jwt.JwtFormat;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.crypto.tink.subtle.Validators;
import com.google.gson.JsonObject;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Optional;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JwtRsaSsaPssVerifyKeyManager extends KeyTypeManager<JwtRsaSsaPssPublicKey> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10292 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Enums.HashType hashForPssAlgorithm(JwtRsaSsaPssAlgorithm algorithm) throws GeneralSecurityException {
        switch (C10292.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[algorithm.ordinal()]) {
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
    public static final int saltLengthForPssAlgorithm(JwtRsaSsaPssAlgorithm algorithm) throws GeneralSecurityException {
        switch (C10292.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[algorithm.ordinal()]) {
            case 1:
                return 32;
            case 2:
                return 48;
            case 3:
                return 64;
            default:
                throw new GeneralSecurityException("unknown algorithm " + algorithm.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RSAPublicKey createPublicKey(JwtRsaSsaPssPublicKey keyProto) throws GeneralSecurityException {
        KeyFactory kf = EngineFactory.KEY_FACTORY.getInstance("RSA");
        BigInteger modulus = new BigInteger(1, keyProto.getN().toByteArray());
        BigInteger exponent = new BigInteger(1, keyProto.getE().toByteArray());
        return (RSAPublicKey) kf.generatePublic(new RSAPublicKeySpec(modulus, exponent));
    }

    public JwtRsaSsaPssVerifyKeyManager() {
        super(JwtRsaSsaPssPublicKey.class, new PrimitiveFactory<JwtPublicKeyVerifyInternal, JwtRsaSsaPssPublicKey>(JwtPublicKeyVerifyInternal.class) { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public JwtPublicKeyVerifyInternal getPrimitive(JwtRsaSsaPssPublicKey keyProto) throws GeneralSecurityException {
                final Optional<String> customKidFromRsaSsaPssPublicKey;
                RSAPublicKey publickey = JwtRsaSsaPssVerifyKeyManager.createPublicKey(keyProto);
                Enums.HashType hash = JwtRsaSsaPssVerifyKeyManager.hashForPssAlgorithm(keyProto.getAlgorithm());
                int saltLength = JwtRsaSsaPssVerifyKeyManager.saltLengthForPssAlgorithm(keyProto.getAlgorithm());
                final RsaSsaPssVerifyJce verifier = new RsaSsaPssVerifyJce(publickey, hash, hash, saltLength);
                final String algorithmName = keyProto.getAlgorithm().name();
                if (keyProto.hasCustomKid()) {
                    customKidFromRsaSsaPssPublicKey = Optional.of(keyProto.getCustomKid().getValue());
                } else {
                    customKidFromRsaSsaPssPublicKey = Optional.empty();
                }
                return new JwtPublicKeyVerifyInternal() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.1.1
                    @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal
                    public VerifiedJwt verifyAndDecodeWithKid(String compact, JwtValidator validator, Optional<String> kid) throws GeneralSecurityException {
                        JwtFormat.Parts parts = JwtFormat.splitSignedCompact(compact);
                        verifier.verify(parts.signatureOrMac, parts.unsignedCompact.getBytes(StandardCharsets.US_ASCII));
                        JsonObject parsedHeader = JsonUtil.parseJson(parts.header);
                        JwtFormat.validateHeader(algorithmName, kid, customKidFromRsaSsaPssPublicKey, parsedHeader);
                        RawJwt token = RawJwt.fromJsonPayload(JwtFormat.getTypeHeader(parsedHeader), parts.payload);
                        return validator.validate(token);
                    }
                };
            }
        });
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";
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
    public JwtRsaSsaPssPublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtRsaSsaPssPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtRsaSsaPssPublicKey pubKey) throws GeneralSecurityException {
        Validators.validateVersion(pubKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, pubKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, pubKey.getE().toByteArray()));
    }
}
