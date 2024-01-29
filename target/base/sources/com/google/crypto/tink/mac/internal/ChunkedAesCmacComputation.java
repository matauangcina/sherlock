package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.InsecureSecretKeyAccess;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.ChunkedMacComputation;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EngineFactory;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
final class ChunkedAesCmacComputation implements ChunkedMacComputation {
    private static final byte[] FORMAT_VERSION = {0};
    private final Cipher aes;
    private boolean finalized = false;
    private final AesCmacKey key;
    private final ByteBuffer localStash;
    private final byte[] subKey1;
    private final byte[] subKey2;

    /* renamed from: x */
    private final ByteBuffer f183x;

    /* renamed from: y */
    private final ByteBuffer f184y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChunkedAesCmacComputation(AesCmacKey key) throws GeneralSecurityException {
        this.key = key;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        this.aes = engineFactory;
        engineFactory.init(1, new SecretKeySpec(key.getAesKey().toByteArray(InsecureSecretKeyAccess.get()), "AES"));
        byte[] zeroes = new byte[16];
        byte[] l = engineFactory.doFinal(zeroes);
        byte[] dbl = AesUtil.dbl(l);
        this.subKey1 = dbl;
        this.subKey2 = AesUtil.dbl(dbl);
        this.localStash = ByteBuffer.allocate(16);
        this.f183x = ByteBuffer.allocate(16);
        this.f184y = ByteBuffer.allocate(16);
    }

    private void munch(ByteBuffer data) throws GeneralSecurityException {
        this.f184y.rewind();
        this.f183x.rewind();
        Bytes.xor(this.f184y, this.f183x, data, 16);
        this.f184y.rewind();
        this.f183x.rewind();
        this.aes.doFinal(this.f184y, this.f183x);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public void update(ByteBuffer data) throws GeneralSecurityException {
        if (this.finalized) {
            throw new IllegalStateException("Can not update after computing the MAC tag. Please create a new object.");
        }
        if (this.localStash.remaining() != 16) {
            int bytesToCopy = Math.min(this.localStash.remaining(), data.remaining());
            for (int i = 0; i < bytesToCopy; i++) {
                this.localStash.put(data.get());
            }
        }
        if (this.localStash.remaining() == 0 && data.remaining() > 0) {
            this.localStash.rewind();
            munch(this.localStash);
            this.localStash.rewind();
        }
        while (data.remaining() > 16) {
            munch(data);
        }
        this.localStash.put(data);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public byte[] computeMac() throws GeneralSecurityException {
        byte[] lastChunkToPad;
        if (this.finalized) {
            throw new IllegalStateException("Can not compute after computing the MAC tag. Please create a new object.");
        }
        if (this.key.getParameters().getVariant() == AesCmacParameters.Variant.LEGACY) {
            update(ByteBuffer.wrap(FORMAT_VERSION));
        }
        this.finalized = true;
        if (this.localStash.remaining() > 0) {
            byte[] lastChunkToPad2 = Arrays.copyOf(this.localStash.array(), this.localStash.position());
            lastChunkToPad = Bytes.xor(AesUtil.cmacPad(lastChunkToPad2), this.subKey2);
        } else {
            lastChunkToPad = Bytes.xor(this.localStash.array(), 0, this.subKey1, 0, 16);
        }
        return Bytes.concat(this.key.getOutputPrefix().toByteArray(), Arrays.copyOf(this.aes.doFinal(Bytes.xor(lastChunkToPad, this.f183x.array())), this.key.getParameters().getCryptographicTagSizeBytes()));
    }
}
