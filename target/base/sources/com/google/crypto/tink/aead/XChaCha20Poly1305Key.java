package com.google.crypto.tink.aead;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;
@Immutable
/* loaded from: classes.dex */
public final class XChaCha20Poly1305Key extends AeadKey {
    @Nullable
    private final Integer idRequirement;
    private final SecretBytes keyBytes;
    private final Bytes outputPrefix;
    private final XChaCha20Poly1305Parameters parameters;

    private XChaCha20Poly1305Key(XChaCha20Poly1305Parameters parameters, SecretBytes keyBytes, Bytes outputPrefix, @Nullable Integer idRequirement) {
        this.parameters = parameters;
        this.keyBytes = keyBytes;
        this.outputPrefix = outputPrefix;
        this.idRequirement = idRequirement;
    }

    private static Bytes getOutputPrefix(XChaCha20Poly1305Parameters parameters, @Nullable Integer idRequirement) {
        if (parameters.getVariant() == XChaCha20Poly1305Parameters.Variant.NO_PREFIX) {
            return Bytes.copyFrom(new byte[0]);
        }
        if (parameters.getVariant() == XChaCha20Poly1305Parameters.Variant.CRUNCHY) {
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(idRequirement.intValue()).array());
        }
        if (parameters.getVariant() == XChaCha20Poly1305Parameters.Variant.TINK) {
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(idRequirement.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + parameters.getVariant());
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    public static XChaCha20Poly1305Key create(SecretBytes secretBytes) throws GeneralSecurityException {
        return create(XChaCha20Poly1305Parameters.Variant.NO_PREFIX, secretBytes, null);
    }

    public static XChaCha20Poly1305Key create(XChaCha20Poly1305Parameters.Variant variant, SecretBytes secretBytes, @Nullable Integer idRequirement) throws GeneralSecurityException {
        if (variant != XChaCha20Poly1305Parameters.Variant.NO_PREFIX && idRequirement == null) {
            throw new GeneralSecurityException("For given Variant " + variant + " the value of idRequirement must be non-null");
        }
        if (variant == XChaCha20Poly1305Parameters.Variant.NO_PREFIX && idRequirement != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (secretBytes.size() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + secretBytes.size());
        }
        XChaCha20Poly1305Parameters parameters = XChaCha20Poly1305Parameters.create(variant);
        return new XChaCha20Poly1305Key(parameters, secretBytes, getOutputPrefix(parameters, idRequirement), idRequirement);
    }

    public SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public XChaCha20Poly1305Parameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key o) {
        if (o instanceof XChaCha20Poly1305Key) {
            XChaCha20Poly1305Key that = (XChaCha20Poly1305Key) o;
            return that.parameters.equals(this.parameters) && that.keyBytes.equalsSecretBytes(this.keyBytes) && Objects.equals(that.idRequirement, this.idRequirement);
        }
        return false;
    }
}
