package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY = new MessageInfoFactory() { // from class: com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory.1
        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final MessageInfoFactory messageInfoFactory;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.factories = messageInfoFactoryArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
            MessageInfoFactory[] messageInfoFactoryArr;
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (MessageInfoFactory) Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
        try {
            return (MessageInfoFactory) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(MessageInfo messageInfo) {
        return messageInfo.getSyntax() == ProtoSyntax.PROTO2;
    }

    private static <T> Schema<T> newSchema(Class<T> cls, MessageInfo messageInfo) {
        return GeneratedMessageLite.class.isAssignableFrom(cls) ? isProto2(messageInfo) ? MessageSchema.newSchema(cls, messageInfo, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), MapFieldSchemas.lite()) : MessageSchema.newSchema(cls, messageInfo, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), null, MapFieldSchemas.lite()) : isProto2(messageInfo) ? MessageSchema.newSchema(cls, messageInfo, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.proto2UnknownFieldSetSchema(), ExtensionSchemas.full(), MapFieldSchemas.full()) : MessageSchema.newSchema(cls, messageInfo, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.proto3UnknownFieldSetSchema(), null, MapFieldSchemas.full());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.SchemaFactory
    public <T> Schema<T> createSchema(Class<T> cls) {
        UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema;
        ExtensionSchema<?> full;
        SchemaUtil.requireGeneratedMessage(cls);
        MessageInfo messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                proto2UnknownFieldSetSchema = SchemaUtil.unknownFieldSetLiteSchema();
                full = ExtensionSchemas.lite();
            } else {
                proto2UnknownFieldSetSchema = SchemaUtil.proto2UnknownFieldSetSchema();
                full = ExtensionSchemas.full();
            }
            return MessageSetSchema.newSchema(proto2UnknownFieldSetSchema, full, messageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoFor);
    }
}
