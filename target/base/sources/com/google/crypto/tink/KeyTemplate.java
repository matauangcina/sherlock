package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;
@Immutable
/* loaded from: classes.dex */
public final class KeyTemplate {

    /* renamed from: kt */
    private final com.google.crypto.tink.proto.KeyTemplate f176kt;

    /* loaded from: classes.dex */
    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        switch (C09411.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()]) {
            case 1:
                return OutputPrefixType.TINK;
            case 2:
                return OutputPrefixType.LEGACY;
            case 3:
                return OutputPrefixType.RAW;
            case 4:
                return OutputPrefixType.CRUNCHY;
            default:
                throw new IllegalArgumentException("Unknown output prefix type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.KeyTemplate$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C09411 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.crypto.tink.proto.OutputPrefixType toProto(OutputPrefixType outputPrefixType) {
        switch (C09411.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[outputPrefixType.ordinal()]) {
            case 1:
                return com.google.crypto.tink.proto.OutputPrefixType.TINK;
            case 2:
                return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
            case 3:
                return com.google.crypto.tink.proto.OutputPrefixType.RAW;
            case 4:
                return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
            default:
                throw new IllegalArgumentException("Unknown output prefix type");
        }
    }

    public static KeyTemplate create(String typeUrl, byte[] value, OutputPrefixType outputPrefixType) {
        return new KeyTemplate((com.google.crypto.tink.proto.KeyTemplate) com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(typeUrl).setValue(ByteString.copyFrom(value)).setOutputPrefixType(toProto(outputPrefixType)).build());
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate kt) {
        this.f176kt = kt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.crypto.tink.proto.KeyTemplate getProto() {
        return this.f176kt;
    }

    public String getTypeUrl() {
        return this.f176kt.getTypeUrl();
    }

    public byte[] getValue() {
        return this.f176kt.getValue().toByteArray();
    }

    public OutputPrefixType getOutputPrefixType() {
        return fromProto(this.f176kt.getOutputPrefixType());
    }
}
