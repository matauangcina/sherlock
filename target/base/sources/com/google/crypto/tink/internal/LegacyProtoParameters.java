package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
@Immutable
/* loaded from: classes.dex */
public final class LegacyProtoParameters extends Parameters {
    private final ProtoParametersSerialization serialization;

    public LegacyProtoParameters(ProtoParametersSerialization serialization) {
        this.serialization = serialization;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.serialization.getKeyTemplate().getOutputPrefixType() != OutputPrefixType.RAW;
    }

    public ProtoParametersSerialization getSerialization() {
        return this.serialization;
    }

    public boolean equals(Object o) {
        if (o instanceof LegacyProtoParameters) {
            ProtoParametersSerialization other = ((LegacyProtoParameters) o).serialization;
            return this.serialization.getKeyTemplate().getOutputPrefixType().equals(other.getKeyTemplate().getOutputPrefixType()) && this.serialization.getKeyTemplate().getTypeUrl().equals(other.getKeyTemplate().getTypeUrl()) && this.serialization.getKeyTemplate().getValue().equals(other.getKeyTemplate().getValue());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.serialization.getKeyTemplate(), this.serialization.getObjectIdentifier());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.LegacyProtoParameters$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10031 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    private static String outputPrefixToString(OutputPrefixType outputPrefixType) {
        switch (C10031.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()]) {
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
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.serialization.getKeyTemplate().getTypeUrl(), outputPrefixToString(this.serialization.getKeyTemplate().getOutputPrefixType()));
    }
}
