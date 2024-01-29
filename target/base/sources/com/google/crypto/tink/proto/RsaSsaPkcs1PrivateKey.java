package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
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
    private RsaSsaPkcs1PublicKey publicKey_;
    private int version_;

    /* renamed from: d_ */
    private ByteString f278d_ = ByteString.EMPTY;

    /* renamed from: p_ */
    private ByteString f279p_ = ByteString.EMPTY;

    /* renamed from: q_ */
    private ByteString f280q_ = ByteString.EMPTY;
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

    private RsaSsaPkcs1PrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public RsaSsaPkcs1PublicKey getPublicKey() {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = this.publicKey_;
        return rsaSsaPkcs1PublicKey == null ? RsaSsaPkcs1PublicKey.getDefaultInstance() : rsaSsaPkcs1PublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(RsaSsaPkcs1PublicKey value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(RsaSsaPkcs1PublicKey value) {
        value.getClass();
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = this.publicKey_;
        if (rsaSsaPkcs1PublicKey != null && rsaSsaPkcs1PublicKey != RsaSsaPkcs1PublicKey.getDefaultInstance()) {
            this.publicKey_ = (RsaSsaPkcs1PublicKey) RsaSsaPkcs1PublicKey.newBuilder(this.publicKey_).mergeFrom((RsaSsaPkcs1PublicKey.Builder) value).buildPartial();
        } else {
            this.publicKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getD() {
        return this.f278d_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(ByteString value) {
        value.getClass();
        this.f278d_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.f278d_ = getDefaultInstance().getD();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getP() {
        return this.f279p_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP(ByteString value) {
        value.getClass();
        this.f279p_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP() {
        this.f279p_ = getDefaultInstance().getP();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getQ() {
        return this.f280q_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQ(ByteString value) {
        value.getClass();
        this.f280q_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQ() {
        this.f280q_ = getDefaultInstance().getQ();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
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

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1PrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(CodedInputStream input) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1PrivateKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
        /* synthetic */ Builder(C11511 x0) {
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
            super(RsaSsaPkcs1PrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public int getVersion() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public RsaSsaPkcs1PublicKey getPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey.Builder builderForValue) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey((RsaSsaPkcs1PublicKey) builderForValue.build());
            return this;
        }

        public Builder mergePublicKey(RsaSsaPkcs1PublicKey value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).mergePublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearPublicKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getD() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getD();
        }

        public Builder setD(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setD(value);
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearD();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getP() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getP();
        }

        public Builder setP(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setP(value);
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearP();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getQ() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getQ();
        }

        public Builder setQ(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setQ(value);
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearQ();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDp() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDp();
        }

        public Builder setDp(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDp(value);
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDp();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDq() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDq();
        }

        public Builder setDq(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDq(value);
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDq();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getCrt();
        }

        public Builder setCrt(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setCrt(value);
            return this;
        }

        public Builder clearCrt() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearCrt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f281xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f281xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f281xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f281xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f281xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f281xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f281xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f281xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11511.f281xa1df5c61[method.ordinal()]) {
            case 1:
                return new RsaSsaPkcs1PrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPkcs1PrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPkcs1PrivateKey.class) {
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
        RsaSsaPkcs1PrivateKey defaultInstance = new RsaSsaPkcs1PrivateKey();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1PrivateKey.class, defaultInstance);
    }

    public static RsaSsaPkcs1PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RsaSsaPkcs1PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
