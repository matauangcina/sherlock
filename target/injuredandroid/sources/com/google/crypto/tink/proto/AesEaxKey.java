package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesEaxParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class AesEaxKey extends GeneratedMessageLite<AesEaxKey, Builder> implements AesEaxKeyOrBuilder {
    private static final AesEaxKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<AesEaxKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private AesEaxParams params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.AesEaxKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C19871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5761xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5761xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5761xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5761xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5761xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5761xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5761xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5761xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesEaxKey, Builder> implements AesEaxKeyOrBuilder {
        private Builder() {
            super(AesEaxKey.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C19871 c19871) {
            this();
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((AesEaxKey) this.instance).clearKeyValue();
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((AesEaxKey) this.instance).clearParams();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesEaxKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
        public ByteString getKeyValue() {
            return ((AesEaxKey) this.instance).getKeyValue();
        }

        @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
        public AesEaxParams getParams() {
            return ((AesEaxKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
        public int getVersion() {
            return ((AesEaxKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
        public boolean hasParams() {
            return ((AesEaxKey) this.instance).hasParams();
        }

        public Builder mergeParams(AesEaxParams aesEaxParams) {
            copyOnWrite();
            ((AesEaxKey) this.instance).mergeParams(aesEaxParams);
            return this;
        }

        public Builder setKeyValue(ByteString byteString) {
            copyOnWrite();
            ((AesEaxKey) this.instance).setKeyValue(byteString);
            return this;
        }

        public Builder setParams(AesEaxParams.Builder builder) {
            copyOnWrite();
            ((AesEaxKey) this.instance).setParams(builder.build());
            return this;
        }

        public Builder setParams(AesEaxParams aesEaxParams) {
            copyOnWrite();
            ((AesEaxKey) this.instance).setParams(aesEaxParams);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((AesEaxKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        AesEaxKey aesEaxKey = new AesEaxKey();
        DEFAULT_INSTANCE = aesEaxKey;
        GeneratedMessageLite.registerDefaultInstance(AesEaxKey.class, aesEaxKey);
    }

    private AesEaxKey() {
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

    public static AesEaxKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(AesEaxParams aesEaxParams) {
        aesEaxParams.getClass();
        AesEaxParams aesEaxParams2 = this.params_;
        if (aesEaxParams2 != null && aesEaxParams2 != AesEaxParams.getDefaultInstance()) {
            aesEaxParams = AesEaxParams.newBuilder(this.params_).mergeFrom((AesEaxParams.Builder) aesEaxParams).buildPartial();
        }
        this.params_ = aesEaxParams;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesEaxKey aesEaxKey) {
        return DEFAULT_INSTANCE.createBuilder(aesEaxKey);
    }

    public static AesEaxKey parseDelimitedFrom(InputStream inputStream) {
        return (AesEaxKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesEaxKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesEaxKey parseFrom(ByteString byteString) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesEaxKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesEaxKey parseFrom(CodedInputStream codedInputStream) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesEaxKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AesEaxKey parseFrom(InputStream inputStream) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesEaxKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesEaxKey parseFrom(ByteBuffer byteBuffer) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AesEaxKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesEaxKey parseFrom(byte[] bArr) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesEaxKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AesEaxKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AesEaxKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(AesEaxParams aesEaxParams) {
        aesEaxParams.getClass();
        this.params_ = aesEaxParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C19871.f5761xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AesEaxKey();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesEaxKey> parser = PARSER;
                if (parser == null) {
                    synchronized (AesEaxKey.class) {
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

    @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
    public AesEaxParams getParams() {
        AesEaxParams aesEaxParams = this.params_;
        return aesEaxParams == null ? AesEaxParams.getDefaultInstance() : aesEaxParams;
    }

    @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.AesEaxKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }
}
