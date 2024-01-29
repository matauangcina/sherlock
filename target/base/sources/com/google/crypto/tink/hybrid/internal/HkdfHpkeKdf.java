package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.subtle.EngineFactory;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
@Immutable
/* loaded from: classes.dex */
final class HkdfHpkeKdf implements HpkeKdf {
    private final String macAlgorithm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HkdfHpkeKdf(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    private byte[] extract(final byte[] ikm, final byte[] salt) throws GeneralSecurityException {
        Mac mac = EngineFactory.MAC.getInstance(this.macAlgorithm);
        if (salt == null || salt.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.macAlgorithm));
        } else {
            mac.init(new SecretKeySpec(salt, this.macAlgorithm));
        }
        return mac.doFinal(ikm);
    }

    private byte[] expand(final byte[] prk, final byte[] info, int length) throws GeneralSecurityException {
        Mac mac = EngineFactory.MAC.getInstance(this.macAlgorithm);
        if (length > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] result = new byte[length];
        int ctr = 1;
        int pos = 0;
        mac.init(new SecretKeySpec(prk, this.macAlgorithm));
        byte[] digest = new byte[0];
        while (true) {
            mac.update(digest);
            mac.update(info);
            mac.update((byte) ctr);
            digest = mac.doFinal();
            if (digest.length + pos < length) {
                System.arraycopy(digest, 0, result, pos, digest.length);
                pos += digest.length;
                ctr++;
            } else {
                System.arraycopy(digest, 0, result, pos, length - pos);
                return result;
            }
        }
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExtract(byte[] salt, byte[] ikm, String ikmLabel, byte[] suiteId) throws GeneralSecurityException {
        return extract(HpkeUtil.labelIkm(ikmLabel, ikm, suiteId), salt);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExpand(byte[] prk, byte[] info, String infoLabel, byte[] suiteId, int length) throws GeneralSecurityException {
        return expand(prk, HpkeUtil.labelInfo(infoLabel, info, suiteId, length), length);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] extractAndExpand(byte[] salt, byte[] ikm, String ikmLabel, byte[] info, String infoLabel, byte[] suiteId, int length) throws GeneralSecurityException {
        byte[] prk = extract(HpkeUtil.labelIkm(ikmLabel, ikm, suiteId), salt);
        return expand(prk, HpkeUtil.labelInfo(infoLabel, info, suiteId, length), length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] getKdfId() throws GeneralSecurityException {
        char c;
        String str = this.macAlgorithm;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return HpkeUtil.HKDF_SHA256_KDF_ID;
            case 1:
                return HpkeUtil.HKDF_SHA384_KDF_ID;
            case 2:
                return HpkeUtil.HKDF_SHA512_KDF_ID;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMacLength() throws GeneralSecurityException {
        return Mac.getInstance(this.macAlgorithm).getMacLength();
    }
}
