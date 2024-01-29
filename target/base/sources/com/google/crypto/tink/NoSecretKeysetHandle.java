package com.google.crypto.tink;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes.dex */
public final class NoSecretKeysetHandle {
    @Deprecated
    public static final KeysetHandle parseFrom(final byte[] serialized) throws GeneralSecurityException {
        try {
            Keyset keyset = Keyset.parseFrom(serialized, ExtensionRegistryLite.getEmptyRegistry());
            validate(keyset);
            return KeysetHandle.fromKeyset(keyset);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle read(KeysetReader reader) throws GeneralSecurityException, IOException {
        Keyset keyset = reader.read();
        validate(keyset);
        return KeysetHandle.fromKeyset(keyset);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void validate(com.google.crypto.tink.proto.Keyset r4) throws java.security.GeneralSecurityException {
        /*
            java.util.List r0 = r4.getKeyList()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L39
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r2 == r3) goto L39
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "keyset contains secret key material"
            r0.<init>(r2)
            throw r0
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.NoSecretKeysetHandle.validate(com.google.crypto.tink.proto.Keyset):void");
    }

    private NoSecretKeysetHandle() {
    }
}
