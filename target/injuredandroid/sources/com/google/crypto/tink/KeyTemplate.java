package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
/* loaded from: classes.dex */
public final class KeyTemplate {

    /* renamed from: kt */
    private final com.google.crypto.tink.proto.KeyTemplate f5749kt;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.KeyTemplate$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C19341 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        this.f5749kt = keyTemplate;
    }

    public static KeyTemplate create(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        return new KeyTemplate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(str).setValue(ByteString.copyFrom(bArr)).setOutputPrefixType(toProto(outputPrefixType)).build());
    }

    private static OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        int i = C19341.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return OutputPrefixType.RAW;
            }
            return OutputPrefixType.LEGACY;
        }
        return OutputPrefixType.TINK;
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProto(OutputPrefixType outputPrefixType) {
        int i = C19341.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return com.google.crypto.tink.proto.OutputPrefixType.RAW;
            }
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        return com.google.crypto.tink.proto.OutputPrefixType.TINK;
    }

    public OutputPrefixType getOutputPrefixType() {
        return fromProto(this.f5749kt.getOutputPrefixType());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.crypto.tink.proto.KeyTemplate getProto() {
        return this.f5749kt;
    }

    public String getTypeUrl() {
        return this.f5749kt.getTypeUrl();
    }

    public byte[] getValue() {
        return this.f5749kt.getValue().toByteArray();
    }
}
