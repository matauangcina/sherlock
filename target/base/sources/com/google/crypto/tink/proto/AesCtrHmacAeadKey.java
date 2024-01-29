package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.HmacKey;
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
public final class AesCtrHmacAeadKey extends GeneratedMessageLite<AesCtrHmacAeadKey, Builder> implements AesCtrHmacAeadKeyOrBuilder {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final AesCtrHmacAeadKey DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Parser<AesCtrHmacAeadKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AesCtrKey aesCtrKey_;
    private HmacKey hmacKey_;
    private int version_;

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

    private AesCtrHmacAeadKey() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public boolean hasAesCtrKey() {
        return this.aesCtrKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public AesCtrKey getAesCtrKey() {
        AesCtrKey aesCtrKey = this.aesCtrKey_;
        return aesCtrKey == null ? AesCtrKey.getDefaultInstance() : aesCtrKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAesCtrKey(AesCtrKey value) {
        value.getClass();
        this.aesCtrKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAesCtrKey(AesCtrKey value) {
        value.getClass();
        AesCtrKey aesCtrKey = this.aesCtrKey_;
        if (aesCtrKey != null && aesCtrKey != AesCtrKey.getDefaultInstance()) {
            this.aesCtrKey_ = (AesCtrKey) AesCtrKey.newBuilder(this.aesCtrKey_).mergeFrom((AesCtrKey.Builder) value).buildPartial();
        } else {
            this.aesCtrKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAesCtrKey() {
        this.aesCtrKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public boolean hasHmacKey() {
        return this.hmacKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public HmacKey getHmacKey() {
        HmacKey hmacKey = this.hmacKey_;
        return hmacKey == null ? HmacKey.getDefaultInstance() : hmacKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacKey(HmacKey value) {
        value.getClass();
        this.hmacKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacKey(HmacKey value) {
        value.getClass();
        HmacKey hmacKey = this.hmacKey_;
        if (hmacKey != null && hmacKey != HmacKey.getDefaultInstance()) {
            this.hmacKey_ = (HmacKey) HmacKey.newBuilder(this.hmacKey_).mergeFrom((HmacKey.Builder) value).buildPartial();
        } else {
            this.hmacKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacKey() {
        this.hmacKey_ = null;
    }

    public static AesCtrHmacAeadKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(InputStream input) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseDelimitedFrom(InputStream input) throws IOException {
        return (AesCtrHmacAeadKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(CodedInputStream input) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacAeadKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacAeadKey, Builder> implements AesCtrHmacAeadKeyOrBuilder {
        /* synthetic */ Builder(C10651 x0) {
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
            super(AesCtrHmacAeadKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public int getVersion() {
            return ((AesCtrHmacAeadKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public boolean hasAesCtrKey() {
            return ((AesCtrHmacAeadKey) this.instance).hasAesCtrKey();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public AesCtrKey getAesCtrKey() {
            return ((AesCtrHmacAeadKey) this.instance).getAesCtrKey();
        }

        public Builder setAesCtrKey(AesCtrKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setAesCtrKey(value);
            return this;
        }

        public Builder setAesCtrKey(AesCtrKey.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setAesCtrKey((AesCtrKey) builderForValue.build());
            return this;
        }

        public Builder mergeAesCtrKey(AesCtrKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).mergeAesCtrKey(value);
            return this;
        }

        public Builder clearAesCtrKey() {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).clearAesCtrKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public boolean hasHmacKey() {
            return ((AesCtrHmacAeadKey) this.instance).hasHmacKey();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public HmacKey getHmacKey() {
            return ((AesCtrHmacAeadKey) this.instance).getHmacKey();
        }

        public Builder setHmacKey(HmacKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setHmacKey(value);
            return this;
        }

        public Builder setHmacKey(HmacKey.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setHmacKey((HmacKey) builderForValue.build());
            return this;
        }

        public Builder mergeHmacKey(HmacKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).mergeHmacKey(value);
            return this;
        }

        public Builder clearHmacKey() {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).clearHmacKey();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacAeadKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f190xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f190xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f190xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f190xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f190xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f190xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f190xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f190xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C10651.f190xa1df5c61[method.ordinal()]) {
            case 1:
                return new AesCtrHmacAeadKey();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"version_", "aesCtrKey_", "hmacKey_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacAeadKey> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrHmacAeadKey.class) {
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
        AesCtrHmacAeadKey defaultInstance = new AesCtrHmacAeadKey();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKey.class, defaultInstance);
    }

    public static AesCtrHmacAeadKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesCtrHmacAeadKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
