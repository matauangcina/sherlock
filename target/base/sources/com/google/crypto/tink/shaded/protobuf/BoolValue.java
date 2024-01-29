package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class BoolValue extends GeneratedMessageLite<BoolValue, Builder> implements BoolValueOrBuilder {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile Parser<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    private BoolValue() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.BoolValueOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean value) {
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(InputStream input) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BoolValue parseDelimitedFrom(InputStream input) throws IOException {
        return (BoolValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BoolValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BoolValue parseFrom(CodedInputStream input) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BoolValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BoolValue, Builder> implements BoolValueOrBuilder {
        /* synthetic */ Builder(C11661 x0) {
            this();
        }

        private Builder() {
            super(BoolValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BoolValueOrBuilder
        public boolean getValue() {
            return ((BoolValue) this.instance).getValue();
        }

        public Builder setValue(boolean value) {
            copyOnWrite();
            ((BoolValue) this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((BoolValue) this.instance).clearValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.BoolValue$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f298xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f298xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f298xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f298xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f298xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f298xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f298xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f298xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11661.f298xa1df5c61[method.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"value_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BoolValue> parser = PARSER;
                if (parser == null) {
                    synchronized (BoolValue.class) {
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
        BoolValue defaultInstance = new BoolValue();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, defaultInstance);
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: of */
    public static BoolValue m37of(boolean value) {
        return newBuilder().setValue(value).build();
    }

    public static Parser<BoolValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
