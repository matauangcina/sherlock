package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_ = GeneratedMessageLite.emptyProtobufList();

    private FieldMask() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public List<String> getPathsList() {
        return this.paths_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public String getPaths(int index) {
        return this.paths_.get(index);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int index) {
        return ByteString.copyFromUtf8(this.paths_.get(index));
    }

    private void ensurePathsIsMutable() {
        Internal.ProtobufList<String> tmp = this.paths_;
        if (!tmp.isModifiable()) {
            this.paths_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int index, String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> values) {
        ensurePathsIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        ensurePathsIsMutable();
        this.paths_.add(value.toStringUtf8());
    }

    public static FieldMask parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FieldMask parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FieldMask parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FieldMask parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FieldMask parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FieldMask parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FieldMask parseFrom(InputStream input) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FieldMask parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FieldMask parseDelimitedFrom(InputStream input) throws IOException {
        return (FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static FieldMask parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FieldMask parseFrom(CodedInputStream input) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FieldMask parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(FieldMask prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        /* synthetic */ Builder(C11851 x0) {
            this();
        }

        private Builder() {
            super(FieldMask.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((FieldMask) this.instance).getPathsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public String getPaths(int index) {
            return ((FieldMask) this.instance).getPaths(index);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int index) {
            return ((FieldMask) this.instance).getPathsBytes(index);
        }

        public Builder setPaths(int index, String value) {
            copyOnWrite();
            ((FieldMask) this.instance).setPaths(index, value);
            return this;
        }

        public Builder addPaths(String value) {
            copyOnWrite();
            ((FieldMask) this.instance).addPaths(value);
            return this;
        }

        public Builder addAllPaths(Iterable<String> values) {
            copyOnWrite();
            ((FieldMask) this.instance).addAllPaths(values);
            return this;
        }

        public Builder clearPaths() {
            copyOnWrite();
            ((FieldMask) this.instance).clearPaths();
            return this;
        }

        public Builder addPathsBytes(ByteString value) {
            copyOnWrite();
            ((FieldMask) this.instance).addPathsBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.FieldMask$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f306xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f306xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f306xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f306xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f306xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f306xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f306xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f306xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11851.f306xa1df5c61[method.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"paths_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FieldMask> parser = PARSER;
                if (parser == null) {
                    synchronized (FieldMask.class) {
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
        FieldMask defaultInstance = new FieldMask();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, defaultInstance);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
