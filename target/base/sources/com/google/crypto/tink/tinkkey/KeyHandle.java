package com.google.crypto.tink.tinkkey;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
@Immutable
@Deprecated
/* loaded from: classes.dex */
public class KeyHandle {

    /* renamed from: id */
    private final int f340id;
    private final TinkKey key;
    private final KeyStatusType status;

    /* loaded from: classes.dex */
    public enum KeyStatusType {
        ENABLED,
        DISABLED,
        DESTROYED
    }

    public static KeyHandle createFromKey(TinkKey key, KeyAccess access) throws GeneralSecurityException {
        KeyHandle result = new KeyHandle(key);
        result.checkAccess(access);
        return result;
    }

    @Deprecated
    public static KeyHandle createFromKey(KeyData keyData, KeyTemplate.OutputPrefixType opt) {
        return new KeyHandle(new ProtoKey(keyData, opt));
    }

    private KeyHandle(TinkKey key) {
        this.key = key;
        this.status = KeyStatusType.ENABLED;
        this.f340id = Util.randKeyId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KeyHandle(TinkKey key, KeyStatusType status, int keyId) {
        this.key = key;
        this.status = status;
        this.f340id = keyId;
    }

    public static KeyHandle generateNew(KeyTemplate keyTemplate) throws GeneralSecurityException {
        ProtoKey protoKey = new ProtoKey(Registry.newKeyData(keyTemplate), keyTemplate.getOutputPrefixType());
        return new KeyHandle(protoKey);
    }

    public boolean hasSecret() {
        return this.key.hasSecret();
    }

    public KeyStatusType getStatus() {
        return this.status;
    }

    public int getId() {
        return this.f340id;
    }

    public TinkKey getKey(KeyAccess access) throws GeneralSecurityException {
        checkAccess(access);
        return this.key;
    }

    public KeyTemplate getKeyTemplate() {
        return this.key.getKeyTemplate();
    }

    private void checkAccess(KeyAccess access) throws GeneralSecurityException {
        if (hasSecret() && !access.canAccessSecret()) {
            throw new GeneralSecurityException("No access");
        }
    }
}
