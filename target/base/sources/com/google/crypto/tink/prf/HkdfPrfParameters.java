package com.google.crypto.tink.prf;

import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class HkdfPrfParameters extends PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final HashType hashType;
    private final int keySizeBytes;
    @Nullable
    private final Bytes salt;

    @Immutable
    /* loaded from: classes.dex */
    public static final class HashType {
        public static final HashType SHA1 = new HashType("SHA1");
        public static final HashType SHA224 = new HashType("SHA224");
        public static final HashType SHA256 = new HashType("SHA256");
        public static final HashType SHA384 = new HashType("SHA384");
        public static final HashType SHA512 = new HashType("SHA512");
        private final String name;

        private HashType(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        @Nullable
        private HashType hashType;
        @Nullable
        private Integer keySizeBytes;
        @Nullable
        private Bytes salt;

        private Builder() {
            this.keySizeBytes = null;
            this.hashType = null;
            this.salt = null;
        }

        public Builder setKeySizeBytes(int keySizeBytes) throws GeneralSecurityException {
            if (keySizeBytes < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", Integer.valueOf(keySizeBytes * 8)));
            }
            this.keySizeBytes = Integer.valueOf(keySizeBytes);
            return this;
        }

        public Builder setHashType(HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        public Builder setSalt(Bytes salt) {
            if (salt.size() == 0) {
                return this;
            }
            this.salt = salt;
            return this;
        }

        public HkdfPrfParameters build() throws GeneralSecurityException {
            if (this.keySizeBytes == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.hashType == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            return new HkdfPrfParameters(this.keySizeBytes.intValue(), this.hashType, this.salt);
        }
    }

    private HkdfPrfParameters(int keySizeBytes, HashType hashType, Bytes salt) {
        this.keySizeBytes = keySizeBytes;
        this.hashType = hashType;
        this.salt = salt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    @Nullable
    public Bytes getSalt() {
        return this.salt;
    }

    public boolean equals(Object o) {
        if (o instanceof HkdfPrfParameters) {
            HkdfPrfParameters that = (HkdfPrfParameters) o;
            return that.getKeySizeBytes() == getKeySizeBytes() && that.getHashType() == getHashType() && Objects.equals(that.getSalt(), getSalt());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), this.hashType, this.salt);
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return false;
    }

    public String toString() {
        return "HKDF PRF Parameters (hashType: " + this.hashType + ", salt: " + this.salt + ", and " + this.keySizeBytes + "-byte key)";
    }
}
