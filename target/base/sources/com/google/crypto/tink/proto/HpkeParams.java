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
public final class HpkeParams extends GeneratedMessageLite<HpkeParams, Builder> implements HpkeParamsOrBuilder {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final HpkeParams DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile Parser<HpkeParams> PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

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

    private HpkeParams() {
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public int getKemValue() {
        return this.kem_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public HpkeKem getKem() {
        HpkeKem result = HpkeKem.forNumber(this.kem_);
        return result == null ? HpkeKem.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemValue(int value) {
        this.kem_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKem(HpkeKem value) {
        this.kem_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKem() {
        this.kem_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public int getKdfValue() {
        return this.kdf_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public HpkeKdf getKdf() {
        HpkeKdf result = HpkeKdf.forNumber(this.kdf_);
        return result == null ? HpkeKdf.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdfValue(int value) {
        this.kdf_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdf(HpkeKdf value) {
        this.kdf_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKdf() {
        this.kdf_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public int getAeadValue() {
        return this.aead_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public HpkeAead getAead() {
        HpkeAead result = HpkeAead.forNumber(this.aead_);
        return result == null ? HpkeAead.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAeadValue(int value) {
        this.aead_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAead(HpkeAead value) {
        this.aead_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAead() {
        this.aead_ = 0;
    }

    public static HpkeParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkeParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkeParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkeParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkeParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkeParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkeParams parseFrom(InputStream input) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkeParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HpkeParams parseDelimitedFrom(InputStream input) throws IOException {
        return (HpkeParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkeParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkeParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HpkeParams parseFrom(CodedInputStream input) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkeParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HpkeParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HpkeParams, Builder> implements HpkeParamsOrBuilder {
        /* synthetic */ Builder(C11181 x0) {
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
            super(HpkeParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public int getKemValue() {
            return ((HpkeParams) this.instance).getKemValue();
        }

        public Builder setKemValue(int value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKemValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public HpkeKem getKem() {
            return ((HpkeParams) this.instance).getKem();
        }

        public Builder setKem(HpkeKem value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKem(value);
            return this;
        }

        public Builder clearKem() {
            copyOnWrite();
            ((HpkeParams) this.instance).clearKem();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public int getKdfValue() {
            return ((HpkeParams) this.instance).getKdfValue();
        }

        public Builder setKdfValue(int value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKdfValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public HpkeKdf getKdf() {
            return ((HpkeParams) this.instance).getKdf();
        }

        public Builder setKdf(HpkeKdf value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKdf(value);
            return this;
        }

        public Builder clearKdf() {
            copyOnWrite();
            ((HpkeParams) this.instance).clearKdf();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public int getAeadValue() {
            return ((HpkeParams) this.instance).getAeadValue();
        }

        public Builder setAeadValue(int value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setAeadValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public HpkeAead getAead() {
            return ((HpkeParams) this.instance).getAead();
        }

        public Builder setAead(HpkeAead value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setAead(value);
            return this;
        }

        public Builder clearAead() {
            copyOnWrite();
            ((HpkeParams) this.instance).clearAead();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HpkeParams$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f240xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f240xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f240xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f240xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f240xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f240xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f240xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f240xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11181.f240xa1df5c61[method.ordinal()]) {
            case 1:
                return new HpkeParams();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"kem_", "kdf_", "aead_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HpkeParams> parser = PARSER;
                if (parser == null) {
                    synchronized (HpkeParams.class) {
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
        HpkeParams defaultInstance = new HpkeParams();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(HpkeParams.class, defaultInstance);
    }

    public static HpkeParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HpkeParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
