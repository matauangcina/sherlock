package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser<Empty> PARSER;

    private Empty() {
    }

    public static Empty parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Empty parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Empty parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Empty parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Empty parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Empty parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Empty parseFrom(InputStream input) throws IOException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Empty parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Empty parseDelimitedFrom(InputStream input) throws IOException {
        return (Empty) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Empty parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Empty) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Empty parseFrom(CodedInputStream input) throws IOException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Empty parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Empty prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements EmptyOrBuilder {
        /* synthetic */ Builder(C11771 x0) {
            this();
        }

        private Builder() {
            super(Empty.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Empty$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f302xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f302xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f302xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f302xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f302xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f302xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f302xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f302xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11771.f302xa1df5c61[method.ordinal()]) {
            case 1:
                return new Empty();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Empty> parser = PARSER;
                if (parser == null) {
                    synchronized (Empty.class) {
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
        Empty defaultInstance = new Empty();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Empty.class, defaultInstance);
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Empty> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
