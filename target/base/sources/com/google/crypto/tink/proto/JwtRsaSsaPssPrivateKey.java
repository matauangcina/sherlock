package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class JwtRsaSsaPssPrivateKey extends GeneratedMessageLite<JwtRsaSsaPssPrivateKey, Builder> implements JwtRsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final JwtRsaSsaPssPrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<JwtRsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private JwtRsaSsaPssPublicKey publicKey_;
    private int version_;

    /* renamed from: d_ */
    private ByteString f259d_ = ByteString.EMPTY;

    /* renamed from: p_ */
    private ByteString f260p_ = ByteString.EMPTY;

    /* renamed from: q_ */
    private ByteString f261q_ = ByteString.EMPTY;
    private ByteString dp_ = ByteString.EMPTY;
    private ByteString dq_ = ByteString.EMPTY;
    private ByteString crt_ = ByteString.EMPTY;

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        return super.toBuilder();
    }

    private JwtRsaSsaPssPrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int value) {
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public JwtRsaSsaPssPublicKey getPublicKey() {
        JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = this.publicKey_;
        return jwtRsaSsaPssPublicKey == null ? JwtRsaSsaPssPublicKey.getDefaultInstance() : jwtRsaSsaPssPublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(JwtRsaSsaPssPublicKey value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(JwtRsaSsaPssPublicKey value) {
        value.getClass();
        JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = this.publicKey_;
        if (jwtRsaSsaPssPublicKey != null && jwtRsaSsaPssPublicKey != JwtRsaSsaPssPublicKey.getDefaultInstance()) {
            this.publicKey_ = (JwtRsaSsaPssPublicKey) JwtRsaSsaPssPublicKey.newBuilder(this.publicKey_).mergeFrom((JwtRsaSsaPssPublicKey.Builder) value).buildPartial();
        } else {
            this.publicKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getD() {
        return this.f259d_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(ByteString value) {
        value.getClass();
        this.f259d_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.f259d_ = getDefaultInstance().getD();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getP() {
        return this.f260p_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP(ByteString value) {
        value.getClass();
        this.f260p_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP() {
        this.f260p_ = getDefaultInstance().getP();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getQ() {
        return this.f261q_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQ(ByteString value) {
        value.getClass();
        this.f261q_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQ() {
        this.f261q_ = getDefaultInstance().getQ();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getDp() {
        return this.dp_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDp(ByteString value) {
        value.getClass();
        this.dp_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDp() {
        this.dp_ = getDefaultInstance().getDp();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getDq() {
        return this.dq_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDq(ByteString value) {
        value.getClass();
        this.dq_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDq() {
        this.dq_ = getDefaultInstance().getDq();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public ByteString getCrt() {
        return this.crt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrt(ByteString value) {
        value.getClass();
        this.crt_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrt() {
        this.crt_ = getDefaultInstance().getCrt();
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(InputStream input) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static JwtRsaSsaPssPrivateKey parseDelimitedFrom(InputStream input) throws IOException {
        return (JwtRsaSsaPssPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static JwtRsaSsaPssPrivateKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (JwtRsaSsaPssPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(CodedInputStream input) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static JwtRsaSsaPssPrivateKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (JwtRsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(JwtRsaSsaPssPrivateKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<JwtRsaSsaPssPrivateKey, Builder> implements JwtRsaSsaPssPrivateKeyOrBuilder {
        /* synthetic */ Builder(C11341 x0) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder clear() {
            return super.clear();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder clone() {
            return super.mo233clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder clone() {
            return super.mo233clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo233clone() throws CloneNotSupportedException {
            return super.mo233clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite message) {
            return super.internalMergeFrom((Builder) ((GeneratedMessageLite) message));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return super.mergeFrom(input, extensionRegistry);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(byte[] input, int offset, int length) throws InvalidProtocolBufferException {
            return super.mergeFrom(input, offset, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(byte[] input, int offset, int length, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return super.mergeFrom(input, offset, length, extensionRegistry);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString data) throws InvalidProtocolBufferException {
            return super.mergeFrom(data);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return super.mergeFrom(data, extensionRegistry);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream input) throws IOException {
            return super.mergeFrom(input);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return super.mergeFrom(input, extensionRegistry);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(MessageLite other) {
            return super.mergeFrom(other);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(InputStream input) throws IOException {
            return super.mergeFrom(input);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return super.mergeFrom(input, extensionRegistry);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] data) throws InvalidProtocolBufferException {
            return super.mergeFrom(data);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] input, int offset, int length) throws InvalidProtocolBufferException {
            return super.mergeFrom(input, offset, length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] input, int offset, int length, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return super.mergeFrom(input, offset, length, extensionRegistry);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return super.mergeFrom(data, extensionRegistry);
        }

        private Builder() {
            super(JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public int getVersion() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public JwtRsaSsaPssPublicKey getPublicKey() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(JwtRsaSsaPssPublicKey value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder setPublicKey(JwtRsaSsaPssPublicKey.Builder builderForValue) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setPublicKey((JwtRsaSsaPssPublicKey) builderForValue.build());
            return this;
        }

        public Builder mergePublicKey(JwtRsaSsaPssPublicKey value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).mergePublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearPublicKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getD() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getD();
        }

        public Builder setD(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setD(value);
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearD();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getP() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getP();
        }

        public Builder setP(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setP(value);
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearP();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getQ() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getQ();
        }

        public Builder setQ(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setQ(value);
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearQ();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getDp() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getDp();
        }

        public Builder setDp(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setDp(value);
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearDp();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getDq() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getDq();
        }

        public Builder setDq(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setDq(value);
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearDq();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((JwtRsaSsaPssPrivateKey) this.instance).getCrt();
        }

        public Builder setCrt(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).setCrt(value);
            return this;
        }

        public Builder clearCrt() {
            copyOnWrite();
            ((JwtRsaSsaPssPrivateKey) this.instance).clearCrt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f262xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f262xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f262xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f262xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f262xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f262xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f262xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f262xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11341.f262xa1df5c61[method.ordinal()]) {
            case 1:
                return new JwtRsaSsaPssPrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtRsaSsaPssPrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (JwtRsaSsaPssPrivateKey.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    static {
        JwtRsaSsaPssPrivateKey defaultInstance = new JwtRsaSsaPssPrivateKey();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(JwtRsaSsaPssPrivateKey.class, defaultInstance);
    }

    public static JwtRsaSsaPssPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<JwtRsaSsaPssPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
