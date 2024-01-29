package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class AesGcmHkdfStreamingKey extends GeneratedMessageLite<AesGcmHkdfStreamingKey, Builder> implements AesGcmHkdfStreamingKeyOrBuilder {
    private static final AesGcmHkdfStreamingKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<AesGcmHkdfStreamingKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesGcmHkdfStreamingParams params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.AesGcmHkdfStreamingKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C19901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5764xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5764xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5764xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5764xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5764xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5764xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5764xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5764xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesGcmHkdfStreamingKey, Builder> implements AesGcmHkdfStreamingKeyOrBuilder {
        private Builder() {
            super(AesGcmHkdfStreamingKey.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C19901 c19901) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).clearParams();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public ByteString getKeyValue() {
            return ((AesGcmHkdfStreamingKey) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public AesGcmHkdfStreamingParams getParams() {
            return ((AesGcmHkdfStreamingKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public int getVersion() {
            return ((AesGcmHkdfStreamingKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
        public boolean hasParams() {
            return ((AesGcmHkdfStreamingKey) this.instance).hasParams();
        }

        public Builder mergeParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).mergeParams(aesGcmHkdfStreamingParams);
            return this;
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).setKeyValue(byteString);
            return this;
        }

        public Builder setParams(AesGcmHkdfStreamingParams.Builder builder) {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).setParams(builder.build());
            return this;
        }

        public Builder setParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).setParams(aesGcmHkdfStreamingParams);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((AesGcmHkdfStreamingKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = new AesGcmHkdfStreamingKey();
        DEFAULT_INSTANCE = aesGcmHkdfStreamingKey;
        GeneratedMessageLite.registerDefaultInstance(AesGcmHkdfStreamingKey.class, aesGcmHkdfStreamingKey);
    }

    private AesGcmHkdfStreamingKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static AesGcmHkdfStreamingKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        aesGcmHkdfStreamingParams.getClass();
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams2 = this.params_;
        if (aesGcmHkdfStreamingParams2 != null && aesGcmHkdfStreamingParams2 != AesGcmHkdfStreamingParams.getDefaultInstance()) {
            aesGcmHkdfStreamingParams = AesGcmHkdfStreamingParams.newBuilder(this.params_).mergeFrom((AesGcmHkdfStreamingParams.Builder) aesGcmHkdfStreamingParams).buildPartial();
        }
        this.params_ = aesGcmHkdfStreamingParams;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) {
        return DEFAULT_INSTANCE.createBuilder(aesGcmHkdfStreamingKey);
    }

    public static AesGcmHkdfStreamingKey parseDelimitedFrom(InputStream inputStream) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteString byteString) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(CodedInputStream codedInputStream) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesGcmHkdfStreamingKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(InputStream inputStream) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteBuffer byteBuffer) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesGcmHkdfStreamingKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingKey parseFrom(byte[] bArr) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesGcmHkdfStreamingKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AesGcmHkdfStreamingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AesGcmHkdfStreamingKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        aesGcmHkdfStreamingParams.getClass();
        this.params_ = aesGcmHkdfStreamingParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C19901.f5764xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AesGcmHkdfStreamingKey();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesGcmHkdfStreamingKey> parser = PARSER;
                if (parser == null) {
                    synchronized (AesGcmHkdfStreamingKey.class) {
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

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public AesGcmHkdfStreamingParams getParams() {
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = this.params_;
        return aesGcmHkdfStreamingParams == null ? AesGcmHkdfStreamingParams.getDefaultInstance() : aesGcmHkdfStreamingParams;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }
}
