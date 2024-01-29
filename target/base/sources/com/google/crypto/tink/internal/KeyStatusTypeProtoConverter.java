package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.tinkkey.KeyHandle;
/* loaded from: classes.dex */
public final class KeyStatusTypeProtoConverter {
    public static KeyHandle.KeyStatusType fromProto(KeyStatusType keyStatusTypeProto) {
        switch (C10001.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[keyStatusTypeProto.ordinal()]) {
            case 1:
                return KeyHandle.KeyStatusType.ENABLED;
            case 2:
                return KeyHandle.KeyStatusType.DISABLED;
            case 3:
                return KeyHandle.KeyStatusType.DESTROYED;
            default:
                throw new IllegalArgumentException("Unknown key status type.");
        }
    }

    /* renamed from: com.google.crypto.tink.internal.KeyStatusTypeProtoConverter$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10001 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        /* renamed from: $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType */
        static final /* synthetic */ int[] f182x12482d20;

        static {
            int[] iArr = new int[KeyHandle.KeyStatusType.values().length];
            f182x12482d20 = iArr;
            try {
                iArr[KeyHandle.KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f182x12482d20[KeyHandle.KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f182x12482d20[KeyHandle.KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr2;
            try {
                iArr2[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    public static KeyStatusType toProto(KeyHandle.KeyStatusType status) {
        switch (C10001.f182x12482d20[status.ordinal()]) {
            case 1:
                return KeyStatusType.ENABLED;
            case 2:
                return KeyStatusType.DISABLED;
            case 3:
                return KeyStatusType.DESTROYED;
            default:
                throw new IllegalArgumentException("Unknown key status type.");
        }
    }

    private KeyStatusTypeProtoConverter() {
    }
}
