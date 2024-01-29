package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class RsaSsaPkcs1PrivateKey extends GeneratedMessageLite<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final RsaSsaPkcs1PrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<RsaSsaPkcs1PrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString crt_;

    /* renamed from: d_ */
    private ByteString f5810d_;
    private ByteString dp_;
    private ByteString dq_;

    /* renamed from: p_ */
    private ByteString f5811p_;
    private RsaSsaPkcs1PublicKey publicKey_;

    /* renamed from: q_ */
    private ByteString f5812q_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C20391 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5813xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5813xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5813xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5813xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5813xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5813xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5813xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5813xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
        private Builder() {
            super(RsaSsaPkcs1PrivateKey.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C20391 c20391) {
            this();
        }

        public Builder clearCrt() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearCrt();
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearD();
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDp();
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDq();
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearP();
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearPublicKey();
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearQ();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getCrt();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getD() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getD();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDp() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDp();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDq() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDq();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getP() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getP();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public RsaSsaPkcs1PublicKey getPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getPublicKey();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getQ() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getQ();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public int getVersion() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).hasPublicKey();
        }

        public Builder mergePublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).mergePublicKey(rsaSsaPkcs1PublicKey);
            return this;
        }

        public Builder setCrt(ByteString byteString) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setCrt(byteString);
            return this;
        }

        public Builder setD(ByteString byteString) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setD(byteString);
            return this;
        }

        public Builder setDp(ByteString byteString) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDp(byteString);
            return this;
        }

        public Builder setDq(ByteString byteString) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDq(byteString);
            return this;
        }

        public Builder setP(ByteString byteString) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setP(byteString);
            return this;
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey.Builder builder) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey(builder.build());
            return this;
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey(rsaSsaPkcs1PublicKey);
            return this;
        }

        public Builder setQ(ByteString byteString) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setQ(byteString);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setVersion(i);
            return this;
        }
    }

    static {
        RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = new RsaSsaPkcs1PrivateKey();
        DEFAULT_INSTANCE = rsaSsaPkcs1PrivateKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1PrivateKey.class, rsaSsaPkcs1PrivateKey);
    }

    private RsaSsaPkcs1PrivateKey() {
        ByteString byteString = ByteString.EMPTY;
        this.f5810d_ = byteString;
        this.f5811p_ = byteString;
        this.f5812q_ = byteString;
        this.dp_ = byteString;
        this.dq_ = byteString;
        this.crt_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrt() {
        this.crt_ = getDefaultInstance().getCrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.f5810d_ = getDefaultInstance().getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDp() {
        this.dp_ = getDefaultInstance().getDp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDq() {
        this.dq_ = getDefaultInstance().getDq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP() {
        this.f5811p_ = getDefaultInstance().getP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQ() {
        this.f5812q_ = getDefaultInstance().getQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static RsaSsaPkcs1PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
        rsaSsaPkcs1PublicKey.getClass();
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey2 = this.publicKey_;
        if (rsaSsaPkcs1PublicKey2 != null && rsaSsaPkcs1PublicKey2 != RsaSsaPkcs1PublicKey.getDefaultInstance()) {
            rsaSsaPkcs1PublicKey = RsaSsaPkcs1PublicKey.newBuilder(this.publicKey_).mergeFrom((RsaSsaPkcs1PublicKey.Builder) rsaSsaPkcs1PublicKey).buildPartial();
        }
        this.publicKey_ = rsaSsaPkcs1PublicKey;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPkcs1PrivateKey);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream inputStream) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteString byteString) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(CodedInputStream codedInputStream) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream inputStream) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer byteBuffer) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] bArr) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<RsaSsaPkcs1PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrt(ByteString byteString) {
        byteString.getClass();
        this.crt_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(ByteString byteString) {
        byteString.getClass();
        this.f5810d_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDp(ByteString byteString) {
        byteString.getClass();
        this.dp_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDq(ByteString byteString) {
        byteString.getClass();
        this.dq_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP(ByteString byteString) {
        byteString.getClass();
        this.f5811p_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
        rsaSsaPkcs1PublicKey.getClass();
        this.publicKey_ = rsaSsaPkcs1PublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQ(ByteString byteString) {
        byteString.getClass();
        this.f5812q_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C20391.f5813xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RsaSsaPkcs1PrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPkcs1PrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPkcs1PrivateKey.class) {
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

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getCrt() {
        return this.crt_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getD() {
        return this.f5810d_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getDp() {
        return this.dp_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getDq() {
        return this.dq_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getP() {
        return this.f5811p_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public RsaSsaPkcs1PublicKey getPublicKey() {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = this.publicKey_;
        return rsaSsaPkcs1PublicKey == null ? RsaSsaPkcs1PublicKey.getDefaultInstance() : rsaSsaPkcs1PublicKey;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getQ() {
        return this.f5812q_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }
}
