package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    private Timestamp() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TimestampOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long value) {
        this.seconds_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.TimestampOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int value) {
        this.nanos_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public static Timestamp parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Timestamp parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Timestamp parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Timestamp parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Timestamp parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Timestamp parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Timestamp parseFrom(InputStream input) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Timestamp parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Timestamp parseDelimitedFrom(InputStream input) throws IOException {
        return (Timestamp) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Timestamp parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Timestamp) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Timestamp parseFrom(CodedInputStream input) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Timestamp parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Timestamp prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
        /* synthetic */ Builder(C12151 x0) {
            this();
        }

        private Builder() {
            super(Timestamp.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TimestampOrBuilder
        public long getSeconds() {
            return ((Timestamp) this.instance).getSeconds();
        }

        public Builder setSeconds(long value) {
            copyOnWrite();
            ((Timestamp) this.instance).setSeconds(value);
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            ((Timestamp) this.instance).clearSeconds();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.TimestampOrBuilder
        public int getNanos() {
            return ((Timestamp) this.instance).getNanos();
        }

        public Builder setNanos(int value) {
            copyOnWrite();
            ((Timestamp) this.instance).setNanos(value);
            return this;
        }

        public Builder clearNanos() {
            copyOnWrite();
            ((Timestamp) this.instance).clearNanos();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Timestamp$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C12151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f319xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f319xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f319xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f319xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f319xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f319xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f319xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f319xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C12151.f319xa1df5c61[method.ordinal()]) {
            case 1:
                return new Timestamp();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"seconds_", "nanos_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Timestamp> parser = PARSER;
                if (parser == null) {
                    synchronized (Timestamp.class) {
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
        Timestamp defaultInstance = new Timestamp();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Timestamp.class, defaultInstance);
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Timestamp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
