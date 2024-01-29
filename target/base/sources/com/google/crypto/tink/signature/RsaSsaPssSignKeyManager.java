package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPrivateKey;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPssSignJce;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class RsaSsaPssSignKeyManager extends PrivateKeyTypeManager<RsaSsaPssPrivateKey, RsaSsaPssPublicKey> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RsaSsaPssSignKeyManager() {
        super(RsaSsaPssPrivateKey.class, RsaSsaPssPublicKey.class, new PrimitiveFactory<PublicKeySign, RsaSsaPssPrivateKey>(PublicKeySign.class) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public PublicKeySign getPrimitive(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
                KeyFactory kf = EngineFactory.KEY_FACTORY.getInstance("RSA");
                RSAPrivateCrtKey privateKey = (RSAPrivateCrtKey) kf.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()), new BigInteger(1, keyProto.getD().toByteArray()), new BigInteger(1, keyProto.getP().toByteArray()), new BigInteger(1, keyProto.getQ().toByteArray()), new BigInteger(1, keyProto.getDp().toByteArray()), new BigInteger(1, keyProto.getDq().toByteArray()), new BigInteger(1, keyProto.getCrt().toByteArray())));
                RsaSsaPssParams params = keyProto.getPublicKey().getParams();
                RSAPublicKey publicKey = (RSAPublicKey) kf.generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray())));
                SelfKeyTestValidators.validateRsaSsaPss(privateKey, publicKey, SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
                return new RsaSsaPssSignJce(privateKey, SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
            }
        });
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public RsaSsaPssPublicKey getPublicKey(RsaSsaPssPrivateKey privKeyProto) throws GeneralSecurityException {
        return privKeyProto.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public RsaSsaPssPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return RsaSsaPssPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
        Validators.validateVersion(keyProto.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()));
        SigUtil.validateRsaSsaPssParams(keyProto.getPublicKey().getParams());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey>(RsaSsaPssKeyFormat.class) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.2
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(RsaSsaPssKeyFormat format) throws GeneralSecurityException {
                SigUtil.validateRsaSsaPssParams(format.getParams());
                Validators.validateRsaModulusSize(format.getModulusSizeInBits());
                Validators.validateRsaPublicExponent(new BigInteger(1, format.getPublicExponent().toByteArray()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public RsaSsaPssKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return RsaSsaPssKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public RsaSsaPssPrivateKey createKey(RsaSsaPssKeyFormat format) throws GeneralSecurityException {
                RsaSsaPssParams params = format.getParams();
                Validators.validateRsaModulusSize(format.getModulusSizeInBits());
                Validators.validateSignatureHash(SigUtil.toHashType(params.getSigHash()));
                KeyPairGenerator keyGen = EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
                RSAKeyGenParameterSpec spec = new RSAKeyGenParameterSpec(format.getModulusSizeInBits(), new BigInteger(1, format.getPublicExponent().toByteArray()));
                keyGen.initialize(spec);
                KeyPair keyPair = keyGen.generateKeyPair();
                RSAPublicKey pubKey = (RSAPublicKey) keyPair.getPublic();
                RSAPrivateCrtKey privKey = (RSAPrivateCrtKey) keyPair.getPrivate();
                RsaSsaPssPublicKey pssPubKey = (RsaSsaPssPublicKey) RsaSsaPssPublicKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setParams(params).setE(ByteString.copyFrom(pubKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(pubKey.getModulus().toByteArray())).build();
                return (RsaSsaPssPrivateKey) RsaSsaPssPrivateKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setPublicKey(pssPubKey).setD(ByteString.copyFrom(privKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(privKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(privKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(privKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(privKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(privKey.getCrtCoefficient().toByteArray())).build();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<RsaSsaPssKeyFormat>> keyFormats() throws GeneralSecurityException {
                Map<String, KeyTypeManager.KeyFactory.KeyFormat<RsaSsaPssKeyFormat>> result = new HashMap<>();
                result.put("RSA_SSA_PSS_3072_SHA256_F4", new KeyTypeManager.KeyFactory.KeyFormat<>(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                result.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat<>(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.RAW));
                result.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new KeyTypeManager.KeyFactory.KeyFormat<>(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                result.put("RSA_SSA_PSS_4096_SHA512_F4", new KeyTypeManager.KeyFactory.KeyFormat<>(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                result.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat<>(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.RAW));
                result.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new KeyTypeManager.KeyFactory.KeyFormat<>(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                return Collections.unmodifiableMap(result);
            }
        };
    }

    public static void registerPair(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new RsaSsaPssSignKeyManager(), new RsaSsaPssVerifyKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate rsa3072PssSha256F4Template() {
        return createKeyTemplate(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawRsa3072PssSha256F4Template() {
        return createKeyTemplate(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rsa4096PssSha512F4Template() {
        return createKeyTemplate(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawRsa4096PssSha512F4Template() {
        return createKeyTemplate(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    private static KeyTemplate createKeyTemplate(HashType sigHash, HashType mgf1Hash, int saltLength, int modulusSize, BigInteger publicExponent, KeyTemplate.OutputPrefixType prefixType) {
        RsaSsaPssKeyFormat format = createKeyFormat(sigHash, mgf1Hash, saltLength, modulusSize, publicExponent);
        return KeyTemplate.create(new RsaSsaPssSignKeyManager().getKeyType(), format.toByteArray(), prefixType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RsaSsaPssKeyFormat createKeyFormat(HashType sigHash, HashType mgf1Hash, int saltLength, int modulusSize, BigInteger publicExponent) {
        RsaSsaPssParams params = (RsaSsaPssParams) RsaSsaPssParams.newBuilder().setSigHash(sigHash).setMgf1Hash(mgf1Hash).setSaltLength(saltLength).build();
        return (RsaSsaPssKeyFormat) RsaSsaPssKeyFormat.newBuilder().setParams(params).setModulusSizeInBits(modulusSize).setPublicExponent(ByteString.copyFrom(publicExponent.toByteArray())).build();
    }
}
