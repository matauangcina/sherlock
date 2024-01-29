package com.google.crypto.tink;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class KeyManagerRegistry {
    private static final Logger logger = Logger.getLogger(KeyManagerRegistry.class.getName());
    private final ConcurrentMap<String, KeyManagerContainer> keyManagerMap;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface KeyManagerContainer {
        Class<?> getImplementingClass();

        <P> KeyManager<P> getKeyManager(Class<P> primitiveClass) throws GeneralSecurityException;

        KeyManager<?> getUntypedKeyManager();

        MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException;

        Class<?> publicKeyManagerClassOrNull();

        Set<Class<?>> supportedPrimitives();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyManagerRegistry(KeyManagerRegistry original) {
        this.keyManagerMap = new ConcurrentHashMap(original.keyManagerMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyManagerRegistry() {
        this.keyManagerMap = new ConcurrentHashMap();
    }

    private static <P> KeyManagerContainer createContainerFor(final KeyManager<P> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.KeyManagerRegistry.1
            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> primitiveClass) throws GeneralSecurityException {
                if (!KeyManager.this.getPrimitiveClass().equals(primitiveClass)) {
                    throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
                }
                KeyManager<Q> result = KeyManager.this;
                return result;
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                return KeyManager.this;
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return KeyManager.this.getClass();
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return Collections.singleton(KeyManager.this.getPrimitiveClass());
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException {
                return null;
            }
        };
    }

    private static <KeyProtoT extends MessageLite> KeyManagerContainer createContainerFor(final KeyTypeManager<KeyProtoT> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.KeyManagerRegistry.2
            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> primitiveClass) throws GeneralSecurityException {
                try {
                    return new KeyManagerImpl(KeyTypeManager.this, primitiveClass);
                } catch (IllegalArgumentException e) {
                    throw new GeneralSecurityException("Primitive type not supported", e);
                }
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                KeyTypeManager keyTypeManager = KeyTypeManager.this;
                return new KeyManagerImpl(keyTypeManager, keyTypeManager.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return KeyTypeManager.this.getClass();
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return KeyTypeManager.this.supportedPrimitives();
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException {
                MessageLite parseKey = KeyTypeManager.this.parseKey(serializedKey);
                KeyTypeManager.this.validateKey(parseKey);
                return parseKey;
            }
        };
    }

    private static <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> KeyManagerContainer createPrivateKeyContainerFor(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> publicKeyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.KeyManagerRegistry.3
            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> primitiveClass) throws GeneralSecurityException {
                try {
                    return new PrivateKeyManagerImpl(PrivateKeyTypeManager.this, publicKeyTypeManager, primitiveClass);
                } catch (IllegalArgumentException e) {
                    throw new GeneralSecurityException("Primitive type not supported", e);
                }
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                PrivateKeyTypeManager privateKeyTypeManager2 = PrivateKeyTypeManager.this;
                return new PrivateKeyManagerImpl(privateKeyTypeManager2, publicKeyTypeManager, privateKeyTypeManager2.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return PrivateKeyTypeManager.this.getClass();
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return PrivateKeyTypeManager.this.supportedPrimitives();
            }

            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return publicKeyTypeManager.getClass();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.crypto.tink.shaded.protobuf.MessageLite] */
            @Override // com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer
            public MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException {
                ?? parseKey = PrivateKeyTypeManager.this.parseKey(serializedKey);
                PrivateKeyTypeManager.this.validateKey(parseKey);
                return parseKey;
            }
        };
    }

    private synchronized KeyManagerContainer getKeyManagerContainerOrThrow(String typeUrl) throws GeneralSecurityException {
        if (!this.keyManagerMap.containsKey(typeUrl)) {
            throw new GeneralSecurityException("No key manager found for key type " + typeUrl);
        }
        return this.keyManagerMap.get(typeUrl);
    }

    private static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
        r7.keyManagerMap.putIfAbsent(r0, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized <P> void registerKeyManagerContainer(final com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer r8, boolean r9) throws java.security.GeneralSecurityException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.crypto.tink.KeyManager r0 = r8.getUntypedKeyManager()     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.getKeyType()     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r1 = r7.keyManagerMap     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L71
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r1 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r1     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L62
            java.lang.Class r2 = r1.getImplementingClass()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r3 = r8.getImplementingClass()     // Catch: java.lang.Throwable -> L71
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L22
            goto L62
        L22:
            java.util.logging.Logger r2 = com.google.crypto.tink.KeyManagerRegistry.logger     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r3.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "Attempted overwrite of a registered key manager for key type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L71
            r2.warning(r3)     // Catch: java.lang.Throwable -> L71
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L71
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L71
            java.lang.Class r5 = r1.getImplementingClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L71
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Class r5 = r8.getImplementingClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L71
            r6 = 2
            r4[r6] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L71
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L71
            throw r2     // Catch: java.lang.Throwable -> L71
        L62:
            if (r9 != 0) goto L6a
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r2 = r7.keyManagerMap     // Catch: java.lang.Throwable -> L71
            r2.putIfAbsent(r0, r8)     // Catch: java.lang.Throwable -> L71
            goto L6f
        L6a:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r2 = r7.keyManagerMap     // Catch: java.lang.Throwable -> L71
            r2.put(r0, r8)     // Catch: java.lang.Throwable -> L71
        L6f:
            monitor-exit(r7)
            return
        L71:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.KeyManagerRegistry.registerKeyManagerContainer(com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <P> void registerKeyManager(final KeyManager<P> manager) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        registerKeyManagerContainer(createContainerFor(manager), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <KeyProtoT extends MessageLite> void registerKeyManager(final KeyTypeManager<KeyProtoT> manager) throws GeneralSecurityException {
        if (!manager.fipsStatus().isCompatible()) {
            throw new GeneralSecurityException("failed to register key manager " + manager.getClass() + " as it is not FIPS compatible.");
        }
        registerKeyManagerContainer(createContainerFor(manager), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> publicKeyTypeManager) throws GeneralSecurityException {
        Class<?> existingPublicKeyManagerClass;
        TinkFipsUtil.AlgorithmFipsCompatibility fipsStatusPrivateKey = privateKeyTypeManager.fipsStatus();
        TinkFipsUtil.AlgorithmFipsCompatibility fipsStatusPublicKey = publicKeyTypeManager.fipsStatus();
        if (!fipsStatusPrivateKey.isCompatible()) {
            throw new GeneralSecurityException("failed to register key manager " + privateKeyTypeManager.getClass() + " as it is not FIPS compatible.");
        }
        if (!fipsStatusPublicKey.isCompatible()) {
            throw new GeneralSecurityException("failed to register key manager " + publicKeyTypeManager.getClass() + " as it is not FIPS compatible.");
        }
        String privateTypeUrl = privateKeyTypeManager.getKeyType();
        String publicTypeUrl = publicKeyTypeManager.getKeyType();
        if (this.keyManagerMap.containsKey(privateTypeUrl) && this.keyManagerMap.get(privateTypeUrl).publicKeyManagerClassOrNull() != null && (existingPublicKeyManagerClass = this.keyManagerMap.get(privateTypeUrl).publicKeyManagerClassOrNull()) != null && !existingPublicKeyManagerClass.getName().equals(publicKeyTypeManager.getClass().getName())) {
            logger.warning("Attempted overwrite of a registered key manager for key type " + privateTypeUrl + " with inconsistent public key type " + publicTypeUrl);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", privateKeyTypeManager.getClass().getName(), existingPublicKeyManagerClass.getName(), publicKeyTypeManager.getClass().getName()));
        }
        registerKeyManagerContainer(createPrivateKeyContainerFor(privateKeyTypeManager, publicKeyTypeManager), true);
        registerKeyManagerContainer(createContainerFor(publicKeyTypeManager), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean typeUrlExists(String typeUrl) {
        return this.keyManagerMap.containsKey(typeUrl);
    }

    private static String toCommaSeparatedString(Set<Class<?>> setOfClasses) {
        StringBuilder b = new StringBuilder();
        boolean first = true;
        for (Class<?> clazz : setOfClasses) {
            if (!first) {
                b.append(", ");
            }
            b.append(clazz.getCanonicalName());
            first = false;
        }
        return b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public <P> KeyManager<P> getKeyManager(String typeUrl) throws GeneralSecurityException {
        return getKeyManagerInternal(typeUrl, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <P> KeyManager<P> getKeyManager(String typeUrl, Class<P> primitiveClass) throws GeneralSecurityException {
        return getKeyManagerInternal(typeUrl, (Class) checkNotNull(primitiveClass));
    }

    private <P> KeyManager<P> getKeyManagerInternal(String typeUrl, Class<P> primitiveClass) throws GeneralSecurityException {
        KeyManagerContainer container = getKeyManagerContainerOrThrow(typeUrl);
        if (primitiveClass == null) {
            KeyManager<P> result = (KeyManager<P>) container.getUntypedKeyManager();
            return result;
        } else if (container.supportedPrimitives().contains(primitiveClass)) {
            return container.getKeyManager(primitiveClass);
        } else {
            throw new GeneralSecurityException("Primitive type " + primitiveClass.getName() + " not supported by key manager of type " + container.getImplementingClass() + ", supported primitives: " + toCommaSeparatedString(container.supportedPrimitives()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyManager<?> getUntypedKeyManager(String typeUrl) throws GeneralSecurityException {
        KeyManagerContainer container = getKeyManagerContainerOrThrow(typeUrl);
        return container.getUntypedKeyManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageLite parseKeyData(KeyData keyData) throws GeneralSecurityException, InvalidProtocolBufferException {
        KeyManagerContainer container = getKeyManagerContainerOrThrow(keyData.getTypeUrl());
        return container.parseKey(keyData.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEmpty() {
        return this.keyManagerMap.isEmpty();
    }
}
