package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EciesAeadDemParams;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
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
public final class EciesAeadHkdfParams extends GeneratedMessageLite<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
    private static final EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<EciesAeadHkdfParams> PARSER;
    private EciesAeadDemParams demParams_;
    private int ecPointFormat_;
    private EciesHkdfKemParams kemParams_;

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

    private EciesAeadHkdfParams() {
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public boolean hasKemParams() {
        return this.kemParams_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EciesHkdfKemParams getKemParams() {
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemParams(EciesHkdfKemParams value) {
        value.getClass();
        this.kemParams_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKemParams(EciesHkdfKemParams value) {
        value.getClass();
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        if (eciesHkdfKemParams != null && eciesHkdfKemParams != EciesHkdfKemParams.getDefaultInstance()) {
            this.kemParams_ = (EciesHkdfKemParams) EciesHkdfKemParams.newBuilder(this.kemParams_).mergeFrom((EciesHkdfKemParams.Builder) value).buildPartial();
        } else {
            this.kemParams_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKemParams() {
        this.kemParams_ = null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public boolean hasDemParams() {
        return this.demParams_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EciesAeadDemParams getDemParams() {
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDemParams(EciesAeadDemParams value) {
        value.getClass();
        this.demParams_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDemParams(EciesAeadDemParams value) {
        value.getClass();
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        if (eciesAeadDemParams != null && eciesAeadDemParams != EciesAeadDemParams.getDefaultInstance()) {
            this.demParams_ = (EciesAeadDemParams) EciesAeadDemParams.newBuilder(this.demParams_).mergeFrom((EciesAeadDemParams.Builder) value).buildPartial();
        } else {
            this.demParams_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDemParams() {
        this.demParams_ = null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public int getEcPointFormatValue() {
        return this.ecPointFormat_;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EcPointFormat getEcPointFormat() {
        EcPointFormat result = EcPointFormat.forNumber(this.ecPointFormat_);
        return result == null ? EcPointFormat.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormatValue(int value) {
        this.ecPointFormat_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormat(EcPointFormat value) {
        this.ecPointFormat_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcPointFormat() {
        this.ecPointFormat_ = 0;
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream input) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
        /* synthetic */ Builder(C10951 x0) {
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
            super(EciesAeadHkdfParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public boolean hasKemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasKemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EciesHkdfKemParams getKemParams() {
            return ((EciesAeadHkdfParams) this.instance).getKemParams();
        }

        public Builder setKemParams(EciesHkdfKemParams value) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setKemParams(value);
            return this;
        }

        public Builder setKemParams(EciesHkdfKemParams.Builder builderForValue) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setKemParams((EciesHkdfKemParams) builderForValue.build());
            return this;
        }

        public Builder mergeKemParams(EciesHkdfKemParams value) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).mergeKemParams(value);
            return this;
        }

        public Builder clearKemParams() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearKemParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public boolean hasDemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasDemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EciesAeadDemParams getDemParams() {
            return ((EciesAeadHkdfParams) this.instance).getDemParams();
        }

        public Builder setDemParams(EciesAeadDemParams value) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setDemParams(value);
            return this;
        }

        public Builder setDemParams(EciesAeadDemParams.Builder builderForValue) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setDemParams((EciesAeadDemParams) builderForValue.build());
            return this;
        }

        public Builder mergeDemParams(EciesAeadDemParams value) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).mergeDemParams(value);
            return this;
        }

        public Builder clearDemParams() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearDemParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public int getEcPointFormatValue() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormatValue();
        }

        public Builder setEcPointFormatValue(int value) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setEcPointFormatValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EcPointFormat getEcPointFormat() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormat();
        }

        public Builder setEcPointFormat(EcPointFormat value) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setEcPointFormat(value);
            return this;
        }

        public Builder clearEcPointFormat() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearEcPointFormat();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfParams$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f220xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f220xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f220xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f220xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f220xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f220xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f220xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f220xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C10951.f220xa1df5c61[method.ordinal()]) {
            case 1:
                return new EciesAeadHkdfParams();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"kemParams_", "demParams_", "ecPointFormat_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadHkdfParams> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesAeadHkdfParams.class) {
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
        EciesAeadHkdfParams defaultInstance = new EciesAeadHkdfParams();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfParams.class, defaultInstance);
    }

    public static EciesAeadHkdfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesAeadHkdfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
