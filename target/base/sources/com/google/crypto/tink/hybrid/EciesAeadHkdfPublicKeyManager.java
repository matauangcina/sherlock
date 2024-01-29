package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class EciesAeadHkdfPublicKeyManager extends KeyTypeManager<EciesAeadHkdfPublicKey> {
    public EciesAeadHkdfPublicKeyManager() {
        super(EciesAeadHkdfPublicKey.class, new PrimitiveFactory<HybridEncrypt, EciesAeadHkdfPublicKey>(HybridEncrypt.class) { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public HybridEncrypt getPrimitive(EciesAeadHkdfPublicKey recipientKeyProto) throws GeneralSecurityException {
                EciesAeadHkdfParams eciesParams = recipientKeyProto.getParams();
                EciesHkdfKemParams kemParams = eciesParams.getKemParams();
                ECPublicKey recipientPublicKey = EllipticCurves.getEcPublicKey(HybridUtil.toCurveType(kemParams.getCurveType()), recipientKeyProto.getX().toByteArray(), recipientKeyProto.getY().toByteArray());
                EciesAeadHkdfDemHelper demHelper = new RegistryEciesAeadHkdfDemHelper(eciesParams.getDemParams().getAeadDem());
                return new EciesAeadHkdfHybridEncrypt(recipientPublicKey, kemParams.getHkdfSalt().toByteArray(), HybridUtil.toHmacAlgo(kemParams.getHkdfHashType()), HybridUtil.toPointFormatType(eciesParams.getEcPointFormat()), demHelper);
            }
        });
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
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
    public EciesAeadHkdfPublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return EciesAeadHkdfPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(EciesAeadHkdfPublicKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        HybridUtil.validate(key.getParams());
    }
}
