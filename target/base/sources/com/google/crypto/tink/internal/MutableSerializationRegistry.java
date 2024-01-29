package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.SerializationRegistry;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class MutableSerializationRegistry {
    private static final MutableSerializationRegistry GLOBAL_INSTANCE = new MutableSerializationRegistry();
    private final AtomicReference<SerializationRegistry> registry = new AtomicReference<>(new SerializationRegistry.Builder().build());

    public static MutableSerializationRegistry globalInstance() {
        return GLOBAL_INSTANCE;
    }

    public synchronized <KeyT extends Key, SerializationT extends Serialization> void registerKeySerializer(KeySerializer<KeyT, SerializationT> serializer) throws GeneralSecurityException {
        SerializationRegistry newRegistry = new SerializationRegistry.Builder(this.registry.get()).registerKeySerializer(serializer).build();
        this.registry.set(newRegistry);
    }

    public synchronized <SerializationT extends Serialization> void registerKeyParser(KeyParser<SerializationT> parser) throws GeneralSecurityException {
        SerializationRegistry newRegistry = new SerializationRegistry.Builder(this.registry.get()).registerKeyParser(parser).build();
        this.registry.set(newRegistry);
    }

    public synchronized <ParametersT extends Parameters, SerializationT extends Serialization> void registerParametersSerializer(ParametersSerializer<ParametersT, SerializationT> serializer) throws GeneralSecurityException {
        SerializationRegistry newRegistry = new SerializationRegistry.Builder(this.registry.get()).registerParametersSerializer(serializer).build();
        this.registry.set(newRegistry);
    }

    public synchronized <SerializationT extends Serialization> void registerParametersParser(ParametersParser<SerializationT> parser) throws GeneralSecurityException {
        SerializationRegistry newRegistry = new SerializationRegistry.Builder(this.registry.get()).registerParametersParser(parser).build();
        this.registry.set(newRegistry);
    }

    public <SerializationT extends Serialization> boolean hasParserForKey(SerializationT serializedKey) {
        return this.registry.get().hasParserForKey(serializedKey);
    }

    public <SerializationT extends Serialization> Key parseKey(SerializationT serializedKey, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        return this.registry.get().parseKey(serializedKey, access);
    }

    public Key parseKeyWithLegacyFallback(ProtoKeySerialization protoKeySerialization, SecretKeyAccess access) throws GeneralSecurityException {
        if (access == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (!hasParserForKey(protoKeySerialization)) {
            try {
                return new LegacyProtoKey(protoKeySerialization, access);
            } catch (GeneralSecurityException e2) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e2);
            }
        }
        return parseKey(protoKeySerialization, access);
    }

    public <KeyT extends Key, SerializationT extends Serialization> boolean hasSerializerForKey(KeyT key, Class<SerializationT> serializationClass) {
        return this.registry.get().hasSerializerForKey(key, serializationClass);
    }

    public <KeyT extends Key, SerializationT extends Serialization> SerializationT serializeKey(KeyT key, Class<SerializationT> serializationClass, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        return (SerializationT) this.registry.get().serializeKey(key, serializationClass, access);
    }

    public <SerializationT extends Serialization> boolean hasParserForParameters(SerializationT serializedParameters) {
        return this.registry.get().hasParserForParameters(serializedParameters);
    }

    public <SerializationT extends Serialization> Parameters parseParameters(SerializationT serializedParameters) throws GeneralSecurityException {
        return this.registry.get().parseParameters(serializedParameters);
    }

    public Parameters parseParametersWithLegacyFallback(ProtoParametersSerialization protoParametersSerialization) {
        try {
            return parseParameters(protoParametersSerialization);
        } catch (GeneralSecurityException e) {
            return new LegacyProtoParameters(protoParametersSerialization);
        }
    }

    public <ParametersT extends Parameters, SerializationT extends Serialization> boolean hasSerializerForParameters(ParametersT parameters, Class<SerializationT> serializationClass) {
        return this.registry.get().hasSerializerForParameters(parameters, serializationClass);
    }

    public <ParametersT extends Parameters, SerializationT extends Serialization> SerializationT serializeParameters(ParametersT parameters, Class<SerializationT> serializationClass) throws GeneralSecurityException {
        return (SerializationT) this.registry.get().serializeParameters(parameters, serializationClass);
    }
}
