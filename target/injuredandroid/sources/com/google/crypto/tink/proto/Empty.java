package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser<Empty> PARSER;

    /* renamed from: com.google.crypto.tink.proto.Empty$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C20151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5790xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5790xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5790xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5790xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5790xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5790xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5790xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5790xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements EmptyOrBuilder {
        private Builder() {
            super(Empty.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C20151 c20151) {
            this();
        }
    }

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        GeneratedMessageLite.registerDefaultInstance(Empty.class, empty);
    }

    private Empty() {
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Empty empty) {
        return DEFAULT_INSTANCE.createBuilder(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) {
        return (Empty) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Empty parseFrom(ByteString byteString) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Empty parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Empty parseFrom(CodedInputStream codedInputStream) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Empty parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Empty parseFrom(InputStream inputStream) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Empty parseFrom(byte[] bArr) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Empty parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Empty> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C20151.f5790xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Empty();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Empty> parser = PARSER;
                if (parser == null) {
                    synchronized (Empty.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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
}
