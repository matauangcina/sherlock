package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EciesAeadHkdfParams;
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
public final class EciesAeadHkdfPublicKey extends GeneratedMessageLite<EciesAeadHkdfPublicKey, Builder> implements EciesAeadHkdfPublicKeyOrBuilder {
    private static final EciesAeadHkdfPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<EciesAeadHkdfPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private EciesAeadHkdfParams params_;
    private int version_;

    /* renamed from: x_ */
    private ByteString f222x_ = ByteString.EMPTY;

    /* renamed from: y_ */
    private ByteString f223y_ = ByteString.EMPTY;

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

    private EciesAeadHkdfPublicKey() {
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public EciesAeadHkdfParams getParams() {
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        return eciesAeadHkdfParams == null ? EciesAeadHkdfParams.getDefaultInstance() : eciesAeadHkdfParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(EciesAeadHkdfParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(EciesAeadHkdfParams value) {
        value.getClass();
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        if (eciesAeadHkdfParams != null && eciesAeadHkdfParams != EciesAeadHkdfParams.getDefaultInstance()) {
            this.params_ = (EciesAeadHkdfParams) EciesAeadHkdfParams.newBuilder(this.params_).mergeFrom((EciesAeadHkdfParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public ByteString getX() {
        return this.f222x_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(ByteString value) {
        value.getClass();
        this.f222x_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.f222x_ = getDefaultInstance().getX();
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public ByteString getY() {
        return this.f223y_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(ByteString value) {
        value.getClass();
        this.f223y_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.f223y_ = getDefaultInstance().getY();
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfPublicKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfPublicKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfPublicKey parseFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfPublicKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfPublicKey parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfPublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfPublicKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfPublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfPublicKey parseFrom(CodedInputStream input) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfPublicKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfPublicKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfPublicKey, Builder> implements EciesAeadHkdfPublicKeyOrBuilder {
        /* synthetic */ Builder(C10971 x0) {
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
            super(EciesAeadHkdfPublicKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public int getVersion() {
            return ((EciesAeadHkdfPublicKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public boolean hasParams() {
            return ((EciesAeadHkdfPublicKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public EciesAeadHkdfParams getParams() {
            return ((EciesAeadHkdfPublicKey) this.instance).getParams();
        }

        public Builder setParams(EciesAeadHkdfParams value) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(EciesAeadHkdfParams.Builder builderForValue) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setParams((EciesAeadHkdfParams) builderForValue.build());
            return this;
        }

        public Builder mergeParams(EciesAeadHkdfParams value) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public ByteString getX() {
            return ((EciesAeadHkdfPublicKey) this.instance).getX();
        }

        public Builder setX(ByteString value) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setX(value);
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearX();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public ByteString getY() {
            return ((EciesAeadHkdfPublicKey) this.instance).getY();
        }

        public Builder setY(ByteString value) {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).setY(value);
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((EciesAeadHkdfPublicKey) this.instance).clearY();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f224xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f224xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f224xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f224xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f224xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f224xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f224xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f224xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C10971.f224xa1df5c61[method.ordinal()]) {
            case 1:
                return new EciesAeadHkdfPublicKey();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"version_", "params_", "x_", "y_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadHkdfPublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesAeadHkdfPublicKey.class) {
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
        EciesAeadHkdfPublicKey defaultInstance = new EciesAeadHkdfPublicKey();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfPublicKey.class, defaultInstance);
    }

    public static EciesAeadHkdfPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesAeadHkdfPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
