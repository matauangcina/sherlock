package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeysetInfo;
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
public final class EncryptedKeyset extends GeneratedMessageLite<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
    private static final EncryptedKeyset DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile Parser<EncryptedKeyset> PARSER;
    private ByteString encryptedKeyset_ = ByteString.EMPTY;
    private KeysetInfo keysetInfo_;

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

    private EncryptedKeyset() {
    }

    @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
    public ByteString getEncryptedKeyset() {
        return this.encryptedKeyset_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedKeyset(ByteString value) {
        value.getClass();
        this.encryptedKeyset_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedKeyset() {
        this.encryptedKeyset_ = getDefaultInstance().getEncryptedKeyset();
    }

    @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
    public boolean hasKeysetInfo() {
        return this.keysetInfo_ != null;
    }

    @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
    public KeysetInfo getKeysetInfo() {
        KeysetInfo keysetInfo = this.keysetInfo_;
        return keysetInfo == null ? KeysetInfo.getDefaultInstance() : keysetInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeysetInfo(KeysetInfo value) {
        value.getClass();
        this.keysetInfo_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeysetInfo(KeysetInfo value) {
        value.getClass();
        KeysetInfo keysetInfo = this.keysetInfo_;
        if (keysetInfo != null && keysetInfo != KeysetInfo.getDefaultInstance()) {
            this.keysetInfo_ = (KeysetInfo) KeysetInfo.newBuilder(this.keysetInfo_).mergeFrom((KeysetInfo.Builder) value).buildPartial();
        } else {
            this.keysetInfo_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeysetInfo() {
        this.keysetInfo_ = null;
    }

    public static EncryptedKeyset parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EncryptedKeyset parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EncryptedKeyset parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EncryptedKeyset parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EncryptedKeyset parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EncryptedKeyset parseFrom(InputStream input) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EncryptedKeyset parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream input) throws IOException {
        return (EncryptedKeyset) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EncryptedKeyset) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EncryptedKeyset parseFrom(CodedInputStream input) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EncryptedKeyset parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EncryptedKeyset prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
        /* synthetic */ Builder(C11031 x0) {
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
            super(EncryptedKeyset.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
        public ByteString getEncryptedKeyset() {
            return ((EncryptedKeyset) this.instance).getEncryptedKeyset();
        }

        public Builder setEncryptedKeyset(ByteString value) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setEncryptedKeyset(value);
            return this;
        }

        public Builder clearEncryptedKeyset() {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).clearEncryptedKeyset();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
        public boolean hasKeysetInfo() {
            return ((EncryptedKeyset) this.instance).hasKeysetInfo();
        }

        @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
        public KeysetInfo getKeysetInfo() {
            return ((EncryptedKeyset) this.instance).getKeysetInfo();
        }

        public Builder setKeysetInfo(KeysetInfo value) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setKeysetInfo(value);
            return this;
        }

        public Builder setKeysetInfo(KeysetInfo.Builder builderForValue) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setKeysetInfo((KeysetInfo) builderForValue.build());
            return this;
        }

        public Builder mergeKeysetInfo(KeysetInfo value) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).mergeKeysetInfo(value);
            return this;
        }

        public Builder clearKeysetInfo() {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).clearKeysetInfo();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EncryptedKeyset$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f229xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f229xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f229xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f229xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f229xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f229xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f229xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f229xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11031.f229xa1df5c61[method.ordinal()]) {
            case 1:
                return new EncryptedKeyset();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"encryptedKeyset_", "keysetInfo_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EncryptedKeyset> parser = PARSER;
                if (parser == null) {
                    synchronized (EncryptedKeyset.class) {
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
        EncryptedKeyset defaultInstance = new EncryptedKeyset();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(EncryptedKeyset.class, defaultInstance);
    }

    public static EncryptedKeyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EncryptedKeyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
