package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Keyset extends GeneratedMessageLite<Keyset, Builder> implements KeysetOrBuilder {
    private static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Parser<Keyset> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Key> key_ = GeneratedMessageLite.emptyProtobufList();
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.Keyset$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C20291 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5801xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f5801xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5801xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5801xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5801xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5801xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5801xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5801xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Keyset, Builder> implements KeysetOrBuilder {
        private Builder() {
            super(Keyset.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(C20291 c20291) {
            this();
        }

        public Builder addAllKey(Iterable<? extends Key> iterable) {
            copyOnWrite();
            ((Keyset) this.instance).addAllKey(iterable);
            return this;
        }

        public Builder addKey(int i, Key.Builder builder) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(i, builder.build());
            return this;
        }

        public Builder addKey(int i, Key key) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(i, key);
            return this;
        }

        public Builder addKey(Key.Builder builder) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(builder.build());
            return this;
        }

        public Builder addKey(Key key) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(key);
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((Keyset) this.instance).clearKey();
            return this;
        }

        public Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((Keyset) this.instance).clearPrimaryKeyId();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public Key getKey(int i) {
            return ((Keyset) this.instance).getKey(i);
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public int getKeyCount() {
            return ((Keyset) this.instance).getKeyCount();
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public List<Key> getKeyList() {
            return Collections.unmodifiableList(((Keyset) this.instance).getKeyList());
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public int getPrimaryKeyId() {
            return ((Keyset) this.instance).getPrimaryKeyId();
        }

        public Builder removeKey(int i) {
            copyOnWrite();
            ((Keyset) this.instance).removeKey(i);
            return this;
        }

        public Builder setKey(int i, Key.Builder builder) {
            copyOnWrite();
            ((Keyset) this.instance).setKey(i, builder.build());
            return this;
        }

        public Builder setKey(int i, Key key) {
            copyOnWrite();
            ((Keyset) this.instance).setKey(i, key);
            return this;
        }

        public Builder setPrimaryKeyId(int i) {
            copyOnWrite();
            ((Keyset) this.instance).setPrimaryKeyId(i);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class Key extends GeneratedMessageLite<Key, Builder> implements KeyOrBuilder {
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<Key> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Key, Builder> implements KeyOrBuilder {
            private Builder() {
                super(Key.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(C20291 c20291) {
                this();
            }

            public Builder clearKeyData() {
                copyOnWrite();
                ((Key) this.instance).clearKeyData();
                return this;
            }

            public Builder clearKeyId() {
                copyOnWrite();
                ((Key) this.instance).clearKeyId();
                return this;
            }

            public Builder clearOutputPrefixType() {
                copyOnWrite();
                ((Key) this.instance).clearOutputPrefixType();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Key) this.instance).clearStatus();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public KeyData getKeyData() {
                return ((Key) this.instance).getKeyData();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getKeyId() {
                return ((Key) this.instance).getKeyId();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public OutputPrefixType getOutputPrefixType() {
                return ((Key) this.instance).getOutputPrefixType();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getOutputPrefixTypeValue() {
                return ((Key) this.instance).getOutputPrefixTypeValue();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public KeyStatusType getStatus() {
                return ((Key) this.instance).getStatus();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getStatusValue() {
                return ((Key) this.instance).getStatusValue();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public boolean hasKeyData() {
                return ((Key) this.instance).hasKeyData();
            }

            public Builder mergeKeyData(KeyData keyData) {
                copyOnWrite();
                ((Key) this.instance).mergeKeyData(keyData);
                return this;
            }

            public Builder setKeyData(KeyData.Builder builder) {
                copyOnWrite();
                ((Key) this.instance).setKeyData(builder.build());
                return this;
            }

            public Builder setKeyData(KeyData keyData) {
                copyOnWrite();
                ((Key) this.instance).setKeyData(keyData);
                return this;
            }

            public Builder setKeyId(int i) {
                copyOnWrite();
                ((Key) this.instance).setKeyId(i);
                return this;
            }

            public Builder setOutputPrefixType(OutputPrefixType outputPrefixType) {
                copyOnWrite();
                ((Key) this.instance).setOutputPrefixType(outputPrefixType);
                return this;
            }

            public Builder setOutputPrefixTypeValue(int i) {
                copyOnWrite();
                ((Key) this.instance).setOutputPrefixTypeValue(i);
                return this;
            }

            public Builder setStatus(KeyStatusType keyStatusType) {
                copyOnWrite();
                ((Key) this.instance).setStatus(keyStatusType);
                return this;
            }

            public Builder setStatusValue(int i) {
                copyOnWrite();
                ((Key) this.instance).setStatusValue(i);
                return this;
            }
        }

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            GeneratedMessageLite.registerDefaultInstance(Key.class, key);
        }

        private Key() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyData() {
            this.keyData_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyId() {
            this.keyId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutputPrefixType() {
            this.outputPrefixType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static Key getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeKeyData(KeyData keyData) {
            keyData.getClass();
            KeyData keyData2 = this.keyData_;
            if (keyData2 != null && keyData2 != KeyData.getDefaultInstance()) {
                keyData = KeyData.newBuilder(this.keyData_).mergeFrom((KeyData.Builder) keyData).buildPartial();
            }
            this.keyData_ = keyData;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Key key) {
            return DEFAULT_INSTANCE.createBuilder(key);
        }

        public static Key parseDelimitedFrom(InputStream inputStream) {
            return (Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Key parseFrom(ByteString byteString) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Key parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Key parseFrom(CodedInputStream codedInputStream) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Key parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Key parseFrom(InputStream inputStream) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Key parseFrom(ByteBuffer byteBuffer) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Key parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Key parseFrom(byte[] bArr) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Key parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<Key> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyData(KeyData keyData) {
            keyData.getClass();
            this.keyData_ = keyData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyId(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputPrefixType(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputPrefixTypeValue(int i) {
            this.outputPrefixType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C20291.f5801xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Key();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Key> parser = PARSER;
                    if (parser == null) {
                        synchronized (Key.class) {
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

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public KeyData getKeyData() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.getDefaultInstance() : keyData;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getKeyId() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public OutputPrefixType getOutputPrefixType() {
            OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public KeyStatusType getStatus() {
            KeyStatusType forNumber = KeyStatusType.forNumber(this.status_);
            return forNumber == null ? KeyStatusType.UNRECOGNIZED : forNumber;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public boolean hasKeyData() {
            return this.keyData_ != null;
        }
    }

    /* loaded from: classes.dex */
    public interface KeyOrBuilder extends MessageLiteOrBuilder {
        KeyData getKeyData();

        int getKeyId();

        OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        KeyStatusType getStatus();

        int getStatusValue();

        boolean hasKeyData();
    }

    static {
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        GeneratedMessageLite.registerDefaultInstance(Keyset.class, keyset);
    }

    private Keyset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKey(Iterable<? extends Key> iterable) {
        ensureKeyIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.key_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(int i, Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.add(i, key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.add(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyIsMutable() {
        if (this.key_.isModifiable()) {
            return;
        }
        this.key_ = GeneratedMessageLite.mutableCopy(this.key_);
    }

    public static Keyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Keyset keyset) {
        return DEFAULT_INSTANCE.createBuilder(keyset);
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream) {
        return (Keyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Keyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(ByteString byteString) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Keyset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Keyset parseFrom(CodedInputStream codedInputStream) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Keyset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(InputStream inputStream) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Keyset parseFrom(byte[] bArr) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Keyset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Keyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKey(int i) {
        ensureKeyIsMutable();
        this.key_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(int i, Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.set(i, key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryKeyId(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C20291.f5801xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Keyset();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Keyset> parser = PARSER;
                if (parser == null) {
                    synchronized (Keyset.class) {
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

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public Key getKey(int i) {
        return this.key_.get(i);
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public int getKeyCount() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public List<Key> getKeyList() {
        return this.key_;
    }

    public KeyOrBuilder getKeyOrBuilder(int i) {
        return this.key_.get(i);
    }

    public List<? extends KeyOrBuilder> getKeyOrBuilderList() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }
}
