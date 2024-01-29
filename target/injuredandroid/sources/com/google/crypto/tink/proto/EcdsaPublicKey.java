package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class EcdsaPublicKey extends GeneratedMessageLite<EcdsaPublicKey, Builder> implements EcdsaPublicKeyOrBuilder {
    private static final EcdsaPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<EcdsaPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private EcdsaParams params_;
    private int version_;

    /* renamed from: x_ */
    private ByteString f5776x_;

    /* renamed from: y_ */
    private ByteString f5777y_;

    /* renamed from: com.google.crypto.tink.proto.EcdsaPublicKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C20031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5778xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5778xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5778xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5778xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5778xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5778xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5778xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5778xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaPublicKey, Builder> implements EcdsaPublicKeyOrBuilder {
        private Builder() {
            super(EcdsaPublicKey.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C20031 c20031) {
            this();
        }

        public Builder clearParams() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearParams();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearVersion();
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearX();
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearY();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public EcdsaParams getParams() {
            return ((EcdsaPublicKey) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public int getVersion() {
            return ((EcdsaPublicKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public ByteString getX() {
            return ((EcdsaPublicKey) this.instance).getX();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public ByteString getY() {
            return ((EcdsaPublicKey) this.instance).getY();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public boolean hasParams() {
            return ((EcdsaPublicKey) this.instance).hasParams();
        }

        public Builder mergeParams(EcdsaParams ecdsaParams) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).mergeParams(ecdsaParams);
            return this;
        }

        public Builder setParams(EcdsaParams.Builder builder) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setParams(builder.build());
            return this;
        }

        public Builder setParams(EcdsaParams ecdsaParams) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setParams(ecdsaParams);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setVersion(i);
            return this;
        }

        public Builder setX(ByteString byteString) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setX(byteString);
            return this;
        }

        public Builder setY(ByteString byteString) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setY(byteString);
            return this;
        }
    }

    static {
        EcdsaPublicKey ecdsaPublicKey = new EcdsaPublicKey();
        DEFAULT_INSTANCE = ecdsaPublicKey;
        GeneratedMessageLite.registerDefaultInstance(EcdsaPublicKey.class, ecdsaPublicKey);
    }

    private EcdsaPublicKey() {
        ByteString byteString = ByteString.EMPTY;
        this.f5776x_ = byteString;
        this.f5777y_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.f5776x_ = getDefaultInstance().getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.f5777y_ = getDefaultInstance().getY();
    }

    public static EcdsaPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(EcdsaParams ecdsaParams) {
        ecdsaParams.getClass();
        EcdsaParams ecdsaParams2 = this.params_;
        if (ecdsaParams2 != null && ecdsaParams2 != EcdsaParams.getDefaultInstance()) {
            ecdsaParams = EcdsaParams.newBuilder(this.params_).mergeFrom((EcdsaParams.Builder) ecdsaParams).buildPartial();
        }
        this.params_ = ecdsaParams;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EcdsaPublicKey ecdsaPublicKey) {
        return DEFAULT_INSTANCE.createBuilder(ecdsaPublicKey);
    }

    public static EcdsaPublicKey parseDelimitedFrom(InputStream inputStream) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(ByteString byteString) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EcdsaPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(CodedInputStream codedInputStream) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EcdsaPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(InputStream inputStream) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(ByteBuffer byteBuffer) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EcdsaPublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EcdsaPublicKey parseFrom(byte[] bArr) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<EcdsaPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(EcdsaParams ecdsaParams) {
        ecdsaParams.getClass();
        this.params_ = ecdsaParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(ByteString byteString) {
        byteString.getClass();
        this.f5776x_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(ByteString byteString) {
        byteString.getClass();
        this.f5777y_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C20031.f5778xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EcdsaPublicKey();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaPublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (EcdsaPublicKey.class) {
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

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public EcdsaParams getParams() {
        EcdsaParams ecdsaParams = this.params_;
        return ecdsaParams == null ? EcdsaParams.getDefaultInstance() : ecdsaParams;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public ByteString getX() {
        return this.f5776x_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public ByteString getY() {
        return this.f5777y_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }
}
