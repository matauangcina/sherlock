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
public final class AesGcmSivKeyFormat extends GeneratedMessageLite<AesGcmSivKeyFormat, Builder> implements AesGcmSivKeyFormatOrBuilder {
    private static final AesGcmSivKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile Parser<AesGcmSivKeyFormat> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
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

    private AesGcmSivKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.AesGcmSivKeyFormatOrBuilder
    public int getKeySize() {
        return this.keySize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int value) {
        this.keySize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesGcmSivKeyFormatOrBuilder
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

    public static AesGcmSivKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmSivKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmSivKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmSivKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmSivKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmSivKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmSivKeyFormat parseFrom(InputStream input) throws IOException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmSivKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesGcmSivKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (AesGcmSivKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmSivKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmSivKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesGcmSivKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmSivKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmSivKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesGcmSivKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesGcmSivKeyFormat, Builder> implements AesGcmSivKeyFormatOrBuilder {
        /* synthetic */ Builder(C10821 x0) {
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
            super(AesGcmSivKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesGcmSivKeyFormatOrBuilder
        public int getKeySize() {
            return ((AesGcmSivKeyFormat) this.instance).getKeySize();
        }

        public Builder setKeySize(int value) {
            copyOnWrite();
            ((AesGcmSivKeyFormat) this.instance).setKeySize(value);
            return this;
        }

        public Builder clearKeySize() {
            copyOnWrite();
            ((AesGcmSivKeyFormat) this.instance).clearKeySize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesGcmSivKeyFormatOrBuilder
        public int getVersion() {
            return ((AesGcmSivKeyFormat) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((AesGcmSivKeyFormat) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesGcmSivKeyFormat) this.instance).clearVersion();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesGcmSivKeyFormat$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f207xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f207xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f207xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f207xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f207xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f207xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f207xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f207xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C10821.f207xa1df5c61[method.ordinal()]) {
            case 1:
                return new AesGcmSivKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"version_", "keySize_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesGcmSivKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (AesGcmSivKeyFormat.class) {
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
        AesGcmSivKeyFormat defaultInstance = new AesGcmSivKeyFormat();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(AesGcmSivKeyFormat.class, defaultInstance);
    }

    public static AesGcmSivKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesGcmSivKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
