package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class StringValue extends GeneratedMessageLite<StringValue, Builder> implements StringValueOrBuilder {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile Parser<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    private StringValue() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StringValueOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StringValueOrBuilder
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.value_ = value.toStringUtf8();
    }

    public static StringValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StringValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StringValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StringValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StringValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StringValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StringValue parseFrom(InputStream input) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static StringValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static StringValue parseDelimitedFrom(InputStream input) throws IOException {
        return (StringValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static StringValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (StringValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static StringValue parseFrom(CodedInputStream input) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static StringValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(StringValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StringValue, Builder> implements StringValueOrBuilder {
        /* synthetic */ Builder(C12101 x0) {
            this();
        }

        private Builder() {
            super(StringValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StringValueOrBuilder
        public String getValue() {
            return ((StringValue) this.instance).getValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StringValueOrBuilder
        public ByteString getValueBytes() {
            return ((StringValue) this.instance).getValueBytes();
        }

        public Builder setValue(String value) {
            copyOnWrite();
            ((StringValue) this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((StringValue) this.instance).clearValue();
            return this;
        }

        public Builder setValueBytes(ByteString value) {
            copyOnWrite();
            ((StringValue) this.instance).setValueBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.StringValue$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C12101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f317xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f317xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f317xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f317xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f317xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f317xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f317xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f317xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C12101.f317xa1df5c61[method.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"value_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StringValue> parser = PARSER;
                if (parser == null) {
                    synchronized (StringValue.class) {
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
        StringValue defaultInstance = new StringValue();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, defaultInstance);
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: of */
    public static StringValue m29of(String value) {
        return newBuilder().setValue(value).build();
    }

    public static Parser<StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
