package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
/* loaded from: classes.dex */
public enum OutputPrefixType implements Internal.EnumLite {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final Internal.EnumLiteMap<OutputPrefixType> internalValueMap = new Internal.EnumLiteMap<OutputPrefixType>() { // from class: com.google.crypto.tink.proto.OutputPrefixType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public OutputPrefixType findValueByNumber(int i) {
            return OutputPrefixType.forNumber(i);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class OutputPrefixTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new OutputPrefixTypeVerifier();

        private OutputPrefixTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public static Internal.EnumLiteMap<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return OutputPrefixTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
