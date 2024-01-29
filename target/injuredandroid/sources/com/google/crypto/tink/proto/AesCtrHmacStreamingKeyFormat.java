package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class AesCtrHmacStreamingKeyFormat extends GeneratedMessageLite<AesCtrHmacStreamingKeyFormat, Builder> implements AesCtrHmacStreamingKeyFormatOrBuilder {
    private static final AesCtrHmacStreamingKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<AesCtrHmacStreamingKeyFormat> PARSER;
    private int keySize_;
    private AesCtrHmacStreamingParams params_;

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C19821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5756xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5756xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5756xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5756xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5756xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5756xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5756xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5756xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacStreamingKeyFormat, Builder> implements AesCtrHmacStreamingKeyFormatOrBuilder {
        private Builder() {
            super(AesCtrHmacStreamingKeyFormat.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C19821 c19821) {
            this();
        }

        public Builder clearKeySize() {
            copyOnWrite();
            ((AesCtrHmacStreamingKeyFormat) this.instance).clearKeySize();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((AesCtrHmacStreamingKeyFormat) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormatOrBuilder
        public int getKeySize() {
            return ((AesCtrHmacStreamingKeyFormat) this.instance).getKeySize();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormatOrBuilder
        public AesCtrHmacStreamingParams getParams() {
            return ((AesCtrHmacStreamingKeyFormat) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormatOrBuilder
        public boolean hasParams() {
            return ((AesCtrHmacStreamingKeyFormat) this.instance).hasParams();
        }

        public Builder mergeParams(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
            copyOnWrite();
            ((AesCtrHmacStreamingKeyFormat) this.instance).mergeParams(aesCtrHmacStreamingParams);
            return this;
        }

        public Builder setKeySize(int i) {
            copyOnWrite();
            ((AesCtrHmacStreamingKeyFormat) this.instance).setKeySize(i);
            return this;
        }

        public Builder setParams(AesCtrHmacStreamingParams.Builder builder) {
            copyOnWrite();
            ((AesCtrHmacStreamingKeyFormat) this.instance).setParams(builder.build());
            return this;
        }

        public Builder setParams(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
            copyOnWrite();
            ((AesCtrHmacStreamingKeyFormat) this.instance).setParams(aesCtrHmacStreamingParams);
            return this;
        }
    }

    static {
        AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = new AesCtrHmacStreamingKeyFormat();
        DEFAULT_INSTANCE = aesCtrHmacStreamingKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacStreamingKeyFormat.class, aesCtrHmacStreamingKeyFormat);
    }

    private AesCtrHmacStreamingKeyFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    public static AesCtrHmacStreamingKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingParams.getClass();
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams2 = this.params_;
        if (aesCtrHmacStreamingParams2 != null && aesCtrHmacStreamingParams2 != AesCtrHmacStreamingParams.getDefaultInstance()) {
            aesCtrHmacStreamingParams = AesCtrHmacStreamingParams.newBuilder(this.params_).mergeFrom((AesCtrHmacStreamingParams.Builder) aesCtrHmacStreamingParams).buildPartial();
        }
        this.params_ = aesCtrHmacStreamingParams;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(aesCtrHmacStreamingKeyFormat);
    }

    public static AesCtrHmacStreamingKeyFormat parseDelimitedFrom(InputStream inputStream) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(ByteString byteString) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(CodedInputStream codedInputStream) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(InputStream inputStream) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(ByteBuffer byteBuffer) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(byte[] bArr) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesCtrHmacStreamingKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AesCtrHmacStreamingKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AesCtrHmacStreamingKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) {
        aesCtrHmacStreamingParams.getClass();
        this.params_ = aesCtrHmacStreamingParams;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C19821.f5756xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AesCtrHmacStreamingKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacStreamingKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrHmacStreamingKeyFormat.class) {
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormatOrBuilder
    public int getKeySize() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormatOrBuilder
    public AesCtrHmacStreamingParams getParams() {
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams = this.params_;
        return aesCtrHmacStreamingParams == null ? AesCtrHmacStreamingParams.getDefaultInstance() : aesCtrHmacStreamingParams;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }
}
