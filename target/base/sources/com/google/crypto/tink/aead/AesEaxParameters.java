package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class AesEaxParameters extends AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    @Immutable
    /* loaded from: classes.dex */
    public static final class Variant {
        private final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        private Variant(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        @Nullable
        private Integer ivSizeBytes;
        @Nullable
        private Integer keySizeBytes;
        @Nullable
        private Integer tagSizeBytes;
        private Variant variant;

        private Builder() {
            this.keySizeBytes = null;
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = Variant.NO_PREFIX;
        }

        public Builder setKeySizeBytes(int keySizeBytes) throws GeneralSecurityException {
            if (keySizeBytes != 16 && keySizeBytes != 24 && keySizeBytes != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(keySizeBytes)));
            }
            this.keySizeBytes = Integer.valueOf(keySizeBytes);
            return this;
        }

        public Builder setIvSizeBytes(int ivSizeBytes) throws GeneralSecurityException {
            if (ivSizeBytes != 12 && ivSizeBytes != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(ivSizeBytes)));
            }
            this.ivSizeBytes = Integer.valueOf(ivSizeBytes);
            return this;
        }

        public Builder setTagSizeBytes(int tagSizeBytes) throws GeneralSecurityException {
            if (tagSizeBytes < 0 || tagSizeBytes > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(tagSizeBytes)));
            }
            this.tagSizeBytes = Integer.valueOf(tagSizeBytes);
            return this;
        }

        public Builder setVariant(Variant variant) {
            this.variant = variant;
            return this;
        }

        public AesEaxParameters build() throws GeneralSecurityException {
            if (this.keySizeBytes == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.ivSizeBytes == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.variant == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.tagSizeBytes == null) {
                throw new GeneralSecurityException("Tag size is not set");
            }
            return new AesEaxParameters(this.keySizeBytes.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant);
        }
    }

    private AesEaxParameters(int keySizeBytes, int ivSizeBytes, int tagSizeBytes, Variant variant) {
        this.keySizeBytes = keySizeBytes;
        this.ivSizeBytes = ivSizeBytes;
        this.tagSizeBytes = tagSizeBytes;
        this.variant = variant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public int getIvSizeBytes() {
        return this.ivSizeBytes;
    }

    public int getTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public Variant getVariant() {
        return this.variant;
    }

    public boolean equals(Object o) {
        if (o instanceof AesEaxParameters) {
            AesEaxParameters that = (AesEaxParameters) o;
            return that.getKeySizeBytes() == getKeySizeBytes() && that.getIvSizeBytes() == getIvSizeBytes() && that.getTagSizeBytes() == getTagSizeBytes() && that.getVariant() == getVariant();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.variant + ", " + this.ivSizeBytes + "-byte IV, " + this.tagSizeBytes + "-byte tag, and " + this.keySizeBytes + "-byte key)";
    }
}
