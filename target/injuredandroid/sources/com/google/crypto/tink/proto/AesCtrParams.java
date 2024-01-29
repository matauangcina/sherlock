package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class AesCtrParams extends GeneratedMessageLite<AesCtrParams, Builder> implements AesCtrParamsOrBuilder {
    private static final AesCtrParams DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile Parser<AesCtrParams> PARSER;
    private int ivSize_;

    /* renamed from: com.google.crypto.tink.proto.AesCtrParams$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C19861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5760xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5760xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5760xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5760xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5760xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5760xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5760xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5760xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrParams, Builder> implements AesCtrParamsOrBuilder {
        private Builder() {
            super(AesCtrParams.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C19861 c19861) {
            this();
        }

        public Builder clearIvSize() {
            copyOnWrite();
            ((AesCtrParams) this.instance).clearIvSize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrParamsOrBuilder
        public int getIvSize() {
            return ((AesCtrParams) this.instance).getIvSize();
        }

        public Builder setIvSize(int i) {
            copyOnWrite();
            ((AesCtrParams) this.instance).setIvSize(i);
            return this;
        }
    }

    static {
        AesCtrParams aesCtrParams = new AesCtrParams();
        DEFAULT_INSTANCE = aesCtrParams;
        GeneratedMessageLite.registerDefaultInstance(AesCtrParams.class, aesCtrParams);
    }

    private AesCtrParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIvSize() {
        this.ivSize_ = 0;
    }

    public static AesCtrParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrParams aesCtrParams) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrParams);
    }

    public static AesCtrParams parseDelimitedFrom(InputStream inputStream) {
        return (AesCtrParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrParams parseFrom(ByteString byteString) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCtrParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCtrParams parseFrom(CodedInputStream codedInputStream) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCtrParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AesCtrParams parseFrom(InputStream inputStream) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrParams parseFrom(ByteBuffer byteBuffer) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesCtrParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCtrParams parseFrom(byte[] bArr) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AesCtrParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIvSize(int i) {
        this.ivSize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C19861.f5760xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCtrParams();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrParams> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrParams.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.proto.AesCtrParamsOrBuilder
    public int getIvSize() {
        return this.ivSize_;
    }
}
