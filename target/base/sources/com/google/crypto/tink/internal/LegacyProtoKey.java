package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;
@Immutable
/* loaded from: classes.dex */
public final class LegacyProtoKey extends Key {
    private final ProtoKeySerialization serialization;

    @Immutable
    /* loaded from: classes.dex */
    private static class LegacyProtoParametersNotForCreation extends Parameters {
        private final OutputPrefixType outputPrefixType;
        private final String typeUrl;

        /* synthetic */ LegacyProtoParametersNotForCreation(String x0, OutputPrefixType x1, C10021 x2) {
            this(x0, x1);
        }

        @Override // com.google.crypto.tink.Parameters
        public boolean hasIdRequirement() {
            return this.outputPrefixType != OutputPrefixType.RAW;
        }

        private static String outputPrefixToString(OutputPrefixType outputPrefixType) {
            switch (C10021.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()]) {
                case 1:
                    return "TINK";
                case 2:
                    return "LEGACY";
                case 3:
                    return "RAW";
                case 4:
                    return "CRUNCHY";
                default:
                    return "UNKNOWN";
            }
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.typeUrl, outputPrefixToString(this.outputPrefixType));
        }

        private LegacyProtoParametersNotForCreation(String typeUrl, OutputPrefixType outputPrefixType) {
            this.typeUrl = typeUrl;
            this.outputPrefixType = outputPrefixType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.LegacyProtoKey$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10021 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[KeyData.KeyMaterialType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = iArr;
            try {
                iArr[KeyData.KeyMaterialType.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            int[] iArr2 = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    private static void throwIfMissingAccess(ProtoKeySerialization protoKeySerialization, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        switch (C10021.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[protoKeySerialization.getKeyMaterialType().ordinal()]) {
            case 1:
            case 2:
                SecretKeyAccess.requireAccess(access);
                return;
            default:
                return;
        }
    }

    public LegacyProtoKey(ProtoKeySerialization serialization, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        throwIfMissingAccess(serialization, access);
        this.serialization = serialization;
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (key instanceof LegacyProtoKey) {
            ProtoKeySerialization other = ((LegacyProtoKey) key).serialization;
            if (other.getOutputPrefixType().equals(this.serialization.getOutputPrefixType()) && other.getKeyMaterialType().equals(this.serialization.getKeyMaterialType()) && other.getTypeUrl().equals(this.serialization.getTypeUrl()) && Objects.equals(other.getIdRequirementOrNull(), this.serialization.getIdRequirementOrNull())) {
                return Bytes.equal(this.serialization.getValue().toByteArray(), other.getValue().toByteArray());
            }
            return false;
        }
        return false;
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.serialization.getIdRequirementOrNull();
    }

    public ProtoKeySerialization getSerialization(@Nullable SecretKeyAccess access) throws GeneralSecurityException {
        throwIfMissingAccess(this.serialization, access);
        return this.serialization;
    }

    @Override // com.google.crypto.tink.Key
    public Parameters getParameters() {
        return new LegacyProtoParametersNotForCreation(this.serialization.getTypeUrl(), this.serialization.getOutputPrefixType(), null);
    }
}
