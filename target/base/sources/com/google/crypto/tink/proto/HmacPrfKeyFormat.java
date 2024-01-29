package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.HmacPrfParams;
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
public final class HmacPrfKeyFormat extends GeneratedMessageLite<HmacPrfKeyFormat, Builder> implements HmacPrfKeyFormatOrBuilder {
    private static final HmacPrfKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<HmacPrfKeyFormat> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private HmacPrfParams params_;
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

    private HmacPrfKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
    public HmacPrfParams getParams() {
        HmacPrfParams hmacPrfParams = this.params_;
        return hmacPrfParams == null ? HmacPrfParams.getDefaultInstance() : hmacPrfParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(HmacPrfParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(HmacPrfParams value) {
        value.getClass();
        HmacPrfParams hmacPrfParams = this.params_;
        if (hmacPrfParams != null && hmacPrfParams != HmacPrfParams.getDefaultInstance()) {
            this.params_ = (HmacPrfParams) HmacPrfParams.newBuilder(this.params_).mergeFrom((HmacPrfParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
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

    @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
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

    public static HmacPrfKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfKeyFormat parseFrom(InputStream input) throws IOException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HmacPrfKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (HmacPrfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HmacPrfKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HmacPrfKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HmacPrfKeyFormat, Builder> implements HmacPrfKeyFormatOrBuilder {
        /* synthetic */ Builder(C11121 x0) {
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
            super(HmacPrfKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
        public boolean hasParams() {
            return ((HmacPrfKeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
        public HmacPrfParams getParams() {
            return ((HmacPrfKeyFormat) this.instance).getParams();
        }

        public Builder setParams(HmacPrfParams value) {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(HmacPrfParams.Builder builderForValue) {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).setParams((HmacPrfParams) builderForValue.build());
            return this;
        }

        public Builder mergeParams(HmacPrfParams value) {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
        public int getKeySize() {
            return ((HmacPrfKeyFormat) this.instance).getKeySize();
        }

        public Builder setKeySize(int value) {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).setKeySize(value);
            return this;
        }

        public Builder clearKeySize() {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).clearKeySize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyFormatOrBuilder
        public int getVersion() {
            return ((HmacPrfKeyFormat) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HmacPrfKeyFormat) this.instance).clearVersion();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HmacPrfKeyFormat$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f237xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f237xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f237xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f237xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f237xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f237xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f237xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f237xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11121.f237xa1df5c61[method.ordinal()]) {
            case 1:
                return new HmacPrfKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"params_", "keySize_", "version_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HmacPrfKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (HmacPrfKeyFormat.class) {
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
        HmacPrfKeyFormat defaultInstance = new HmacPrfKeyFormat();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(HmacPrfKeyFormat.class, defaultInstance);
    }

    public static HmacPrfKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HmacPrfKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
