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
public final class EciesHkdfKemParams extends GeneratedMessageLite<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final EciesHkdfKemParams DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile Parser<EciesHkdfKemParams> PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private ByteString hkdfSalt_ = ByteString.EMPTY;

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

    private EciesHkdfKemParams() {
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getCurveTypeValue() {
        return this.curveType_;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public EllipticCurveType getCurveType() {
        EllipticCurveType result = EllipticCurveType.forNumber(this.curveType_);
        return result == null ? EllipticCurveType.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveTypeValue(int value) {
        this.curveType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveType(EllipticCurveType value) {
        this.curveType_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurveType() {
        this.curveType_ = 0;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public HashType getHkdfHashType() {
        HashType result = HashType.forNumber(this.hkdfHashType_);
        return result == null ? HashType.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashTypeValue(int value) {
        this.hkdfHashType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashType(HashType value) {
        this.hkdfHashType_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public ByteString getHkdfSalt() {
        return this.hkdfSalt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfSalt(ByteString value) {
        value.getClass();
        this.hkdfSalt_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfSalt() {
        this.hkdfSalt_ = getDefaultInstance().getHkdfSalt();
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesHkdfKemParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesHkdfKemParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(InputStream input) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesHkdfKemParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesHkdfKemParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesHkdfKemParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream input) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesHkdfKemParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
        /* synthetic */ Builder(C10981 x0) {
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
            super(EciesHkdfKemParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getCurveTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getCurveTypeValue();
        }

        public Builder setCurveTypeValue(int value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setCurveTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public EllipticCurveType getCurveType() {
            return ((EciesHkdfKemParams) this.instance).getCurveType();
        }

        public Builder setCurveType(EllipticCurveType value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setCurveType(value);
            return this;
        }

        public Builder clearCurveType() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearCurveType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getHkdfHashTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashTypeValue();
        }

        public Builder setHkdfHashTypeValue(int value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfHashTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public HashType getHkdfHashType() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashType();
        }

        public Builder setHkdfHashType(HashType value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfHashType(value);
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearHkdfHashType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public ByteString getHkdfSalt() {
            return ((EciesHkdfKemParams) this.instance).getHkdfSalt();
        }

        public Builder setHkdfSalt(ByteString value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfSalt(value);
            return this;
        }

        public Builder clearHkdfSalt() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearHkdfSalt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesHkdfKemParams$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f225xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f225xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f225xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f225xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f225xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f225xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f225xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f225xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C10981.f225xa1df5c61[method.ordinal()]) {
            case 1:
                return new EciesHkdfKemParams();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"curveType_", "hkdfHashType_", "hkdfSalt_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesHkdfKemParams> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesHkdfKemParams.class) {
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
        EciesHkdfKemParams defaultInstance = new EciesHkdfKemParams();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(EciesHkdfKemParams.class, defaultInstance);
    }

    public static EciesHkdfKemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesHkdfKemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
