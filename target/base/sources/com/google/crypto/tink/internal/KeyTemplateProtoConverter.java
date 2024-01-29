package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class KeyTemplateProtoConverter {
    public static KeyTemplate.OutputPrefixType prefixFromProto(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        switch (C10011.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()]) {
            case 1:
                return KeyTemplate.OutputPrefixType.TINK;
            case 2:
                return KeyTemplate.OutputPrefixType.LEGACY;
            case 3:
                return KeyTemplate.OutputPrefixType.RAW;
            case 4:
                return KeyTemplate.OutputPrefixType.CRUNCHY;
            default:
                throw new GeneralSecurityException("Unknown output prefix type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.KeyTemplateProtoConverter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10011 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[KeyTemplate.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = iArr;
            try {
                iArr[KeyTemplate.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[KeyTemplate.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[KeyTemplate.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[KeyTemplate.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    private static OutputPrefixType prefixToProto(KeyTemplate.OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        switch (C10011.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[outputPrefixType.ordinal()]) {
            case 1:
                return OutputPrefixType.TINK;
            case 2:
                return OutputPrefixType.LEGACY;
            case 3:
                return OutputPrefixType.RAW;
            case 4:
                return OutputPrefixType.CRUNCHY;
            default:
                throw new GeneralSecurityException("Unknown output prefix type");
        }
    }

    public static com.google.crypto.tink.proto.KeyTemplate toProto(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return (com.google.crypto.tink.proto.KeyTemplate) com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(keyTemplate.getTypeUrl()).setValue(ByteString.copyFrom(keyTemplate.getValue())).setOutputPrefixType(prefixToProto(keyTemplate.getOutputPrefixType())).build();
    }

    public static byte[] toByteArray(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return toProto(keyTemplate).toByteArray();
    }

    public static KeyTemplate fromProto(com.google.crypto.tink.proto.KeyTemplate proto) throws GeneralSecurityException {
        return KeyTemplate.create(proto.getTypeUrl(), proto.getValue().toByteArray(), prefixFromProto(proto.getOutputPrefixType()));
    }

    public static KeyTemplate fromByteArray(byte[] bytes) throws GeneralSecurityException {
        try {
            com.google.crypto.tink.proto.KeyTemplate proto = com.google.crypto.tink.proto.KeyTemplate.parseFrom(bytes, ExtensionRegistryLite.getEmptyRegistry());
            return fromProto(proto);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid key template", e);
        }
    }

    private KeyTemplateProtoConverter() {
    }
}
