package com.google.crypto.tink.proto;

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
public final class AesGcmSivKey extends GeneratedMessageLite<AesGcmSivKey, Builder> implements AesGcmSivKeyOrBuilder {
    private static final AesGcmSivKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<AesGcmSivKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
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

    private AesGcmSivKey() {
    }

    @Override // com.google.crypto.tink.proto.AesGcmSivKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.AesGcmSivKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString value) {
        value.getClass();
        this.keyValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    public static AesGcmSivKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmSivKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmSivKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmSivKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmSivKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmSivKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmSivKey parseFrom(InputStream input) throws IOException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmSivKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesGcmSivKey parseDelimitedFrom(InputStream input) throws IOException {
        return (AesGcmSivKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmSivKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmSivKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesGcmSivKey parseFrom(CodedInputStream input) throws IOException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmSivKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmSivKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesGcmSivKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesGcmSivKey, Builder> implements AesGcmSivKeyOrBuilder {
        /* synthetic */ Builder(C10811 x0) {
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
            super(AesGcmSivKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesGcmSivKeyOrBuilder
        public int getVersion() {
            return ((AesGcmSivKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((AesGcmSivKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesGcmSivKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesGcmSivKeyOrBuilder
        public ByteString getKeyValue() {
            return ((AesGcmSivKey) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((AesGcmSivKey) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((AesGcmSivKey) this.instance).clearKeyValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesGcmSivKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10811 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f206xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f206xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f206xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f206xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f206xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f206xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f206xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f206xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C10811.f206xa1df5c61[method.ordinal()]) {
            case 1:
                return new AesGcmSivKey();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"version_", "keyValue_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesGcmSivKey> parser = PARSER;
                if (parser == null) {
                    synchronized (AesGcmSivKey.class) {
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
        AesGcmSivKey defaultInstance = new AesGcmSivKey();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(AesGcmSivKey.class, defaultInstance);
    }

    public static AesGcmSivKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesGcmSivKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
