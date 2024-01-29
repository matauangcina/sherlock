package com.google.crypto.tink;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
class PrivateKeyManagerImpl<PrimitiveT, KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends KeyManagerImpl<PrimitiveT, KeyProtoT> implements PrivateKeyManager<PrimitiveT> {
    private final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyManager;
    private final KeyTypeManager<PublicKeyProtoT> publicKeyManager;

    public PrivateKeyManagerImpl(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyManager, KeyTypeManager<PublicKeyProtoT> publicKeyManager, Class<PrimitiveT> primitiveClass) {
        super(privateKeyManager, primitiveClass);
        this.privateKeyManager = privateKeyManager;
        this.publicKeyManager = publicKeyManager;
    }

    @Override // com.google.crypto.tink.PrivateKeyManager
    public KeyData getPublicKeyData(ByteString serializedKey) throws GeneralSecurityException {
        try {
            KeyProtoT privKeyProto = this.privateKeyManager.parseKey(serializedKey);
            this.privateKeyManager.validateKey(privKeyProto);
            PublicKeyProtoT publicKeyProto = this.privateKeyManager.getPublicKey(privKeyProto);
            this.publicKeyManager.validateKey(publicKeyProto);
            return (KeyData) KeyData.newBuilder().setTypeUrl(this.publicKeyManager.getKeyType()).setValue(publicKeyProto.toByteString()).setKeyMaterialType(this.publicKeyManager.keyMaterialType()).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
