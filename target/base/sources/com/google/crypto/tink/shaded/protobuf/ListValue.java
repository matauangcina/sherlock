package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = emptyProtobufList();

    private ListValue() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
    public List<Value> getValuesList() {
        return this.values_;
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
    public Value getValues(int index) {
        return this.values_.get(index);
    }

    public ValueOrBuilder getValuesOrBuilder(int index) {
        return this.values_.get(index);
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Value> tmp = this.values_;
        if (!tmp.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int index, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int index, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> values) {
        ensureValuesIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int index) {
        ensureValuesIsMutable();
        this.values_.remove(index);
    }

    public static ListValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ListValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ListValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ListValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ListValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ListValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ListValue parseFrom(InputStream input) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ListValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ListValue parseDelimitedFrom(InputStream input) throws IOException {
        return (ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static ListValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ListValue parseFrom(CodedInputStream input) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ListValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ListValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements ListValueOrBuilder {
        /* synthetic */ Builder(C11951 x0) {
            this();
        }

        private Builder() {
            super(ListValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((ListValue) this.instance).getValuesCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListValueOrBuilder
        public Value getValues(int index) {
            return ((ListValue) this.instance).getValues(index);
        }

        public Builder setValues(int index, Value value) {
            copyOnWrite();
            ((ListValue) this.instance).setValues(index, value);
            return this;
        }

        public Builder setValues(int index, Value.Builder builderForValue) {
            copyOnWrite();
            ((ListValue) this.instance).setValues(index, builderForValue.build());
            return this;
        }

        public Builder addValues(Value value) {
            copyOnWrite();
            ((ListValue) this.instance).addValues(value);
            return this;
        }

        public Builder addValues(int index, Value value) {
            copyOnWrite();
            ((ListValue) this.instance).addValues(index, value);
            return this;
        }

        public Builder addValues(Value.Builder builderForValue) {
            copyOnWrite();
            ((ListValue) this.instance).addValues(builderForValue.build());
            return this;
        }

        public Builder addValues(int index, Value.Builder builderForValue) {
            copyOnWrite();
            ((ListValue) this.instance).addValues(index, builderForValue.build());
            return this;
        }

        public Builder addAllValues(Iterable<? extends Value> values) {
            copyOnWrite();
            ((ListValue) this.instance).addAllValues(values);
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((ListValue) this.instance).clearValues();
            return this;
        }

        public Builder removeValues(int index) {
            copyOnWrite();
            ((ListValue) this.instance).removeValues(index);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ListValue$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f311xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f311xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f311xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f311xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f311xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f311xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f311xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f311xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (C11951.f311xa1df5c61[method.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new Builder(null);
            case 3:
                Object[] objects = {"values_", Value.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objects);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListValue> parser = PARSER;
                if (parser == null) {
                    synchronized (ListValue.class) {
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
        ListValue defaultInstance = new ListValue();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, defaultInstance);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
