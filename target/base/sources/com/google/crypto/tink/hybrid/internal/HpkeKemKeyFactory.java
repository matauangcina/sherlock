package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.proto.HpkePrivateKey;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HpkeKemKeyFactory {

    /* renamed from: com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C09881 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.HpkeKem.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HpkeKem = iArr;
            try {
                iArr[com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HpkeKem[com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HpkeKem[com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HpkeKem[com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HpkeKemPrivateKey createPrivate(HpkePrivateKey privateKey) throws GeneralSecurityException {
        switch (C09881.$SwitchMap$com$google$crypto$tink$proto$HpkeKem[privateKey.getPublicKey().getParams().getKem().ordinal()]) {
            case 1:
                return X25519HpkeKemPrivateKey.fromBytes(privateKey.getPrivateKey().toByteArray());
            case 2:
            case 3:
            case 4:
                return NistCurvesHpkeKemPrivateKey.fromBytes(privateKey.getPrivateKey().toByteArray(), privateKey.getPublicKey().getPublicKey().toByteArray(), HpkeUtil.nistHpkeKemToCurve(privateKey.getPublicKey().getParams().getKem()));
            default:
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
        }
    }

    private HpkeKemKeyFactory() {
    }
}
