package com.google.crypto.tink;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final AtomicReference<KeyManagerRegistry> keyManagerRegistry = new AtomicReference<>(new KeyManagerRegistry());
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyTemplate> keyTemplateMap = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    private interface KeyDeriverContainer {
        KeyData deriveKey(ByteString serializedKeyFormat, InputStream stream) throws GeneralSecurityException;
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.1
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString serializedKeyFormat, InputStream stream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    KeyFormatProtoT keyFormat = keyFactory.parseKeyFormat(serializedKeyFormat);
                    keyFactory.validateKeyFormat(keyFormat);
                    return keyFactory.deriveKey(keyFormat, stream);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString serializedKeyFormat, InputStream stream) throws GeneralSecurityException {
                MessageLite keyValue = deriveKeyWithFactory(serializedKeyFormat, stream, KeyTypeManager.this.keyFactory());
                return (KeyData) KeyData.newBuilder().setTypeUrl(KeyTypeManager.this.getKeyType()).setValue(keyValue.toByteString()).setKeyMaterialType(KeyTypeManager.this.keyMaterialType()).build();
            }
        };
    }

    static synchronized void reset() {
        synchronized (Registry.class) {
            keyManagerRegistry.set(new KeyManagerRegistry());
            MutablePrimitiveRegistry.resetGlobalInstanceTestOnly();
            keyDeriverMap.clear();
            newKeyAllowedMap.clear();
            catalogueMap.clear();
            keyTemplateMap.clear();
        }
    }

    @Deprecated
    public static synchronized void addCatalogue(String catalogueName, Catalogue<?> catalogue) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (catalogueName == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
            ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
            if (concurrentMap.containsKey(catalogueName.toLowerCase(Locale.US))) {
                Catalogue<?> existing = concurrentMap.get(catalogueName.toLowerCase(Locale.US));
                if (!catalogue.getClass().getName().equals(existing.getClass().getName())) {
                    logger.warning("Attempted overwrite of a catalogueName catalogue for name " + catalogueName);
                    throw new GeneralSecurityException("catalogue for name " + catalogueName + " has been already registered");
                }
            }
            concurrentMap.put(catalogueName.toLowerCase(Locale.US), catalogue);
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String catalogueName) throws GeneralSecurityException {
        if (catalogueName == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        Catalogue<?> catalogue = catalogueMap.get(catalogueName.toLowerCase(Locale.US));
        if (catalogue == null) {
            String error = String.format("no catalogue found for %s. ", catalogueName);
            if (catalogueName.toLowerCase(Locale.US).startsWith("tinkaead")) {
                error = error + "Maybe call AeadConfig.register().";
            }
            if (catalogueName.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                error = error + "Maybe call DeterministicAeadConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                error = error + "Maybe call StreamingAeadConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || catalogueName.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                error = error + "Maybe call HybridConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkmac")) {
                error = error + "Maybe call MacConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || catalogueName.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                error = error + "Maybe call SignatureConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tink")) {
                error = error + "Maybe call TinkConfig.register().";
            }
            throw new GeneralSecurityException(error);
        }
        return catalogue;
    }

    public static synchronized <P> void registerKeyManager(final KeyManager<P> manager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager((KeyManager) manager, true);
        }
    }

    public static synchronized <P> void registerKeyManager(final KeyManager<P> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (manager == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
                KeyManagerRegistry newKeyManagerRegistry = new KeyManagerRegistry(atomicReference.get());
                newKeyManagerRegistry.registerKeyManager(manager);
                if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                String typeUrl = manager.getKeyType();
                ensureKeyManagerInsertable(typeUrl, Collections.emptyMap(), newKeyAllowed);
                newKeyAllowedMap.put(typeUrl, Boolean.valueOf(newKeyAllowed));
                atomicReference.set(newKeyManagerRegistry);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(final KeyTypeManager<KeyProtoT> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (manager == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
            KeyManagerRegistry newKeyManagerRegistry = new KeyManagerRegistry(atomicReference.get());
            newKeyManagerRegistry.registerKeyManager(manager);
            String typeUrl = manager.getKeyType();
            ensureKeyManagerInsertable(typeUrl, newKeyAllowed ? manager.keyFactory().keyFormats() : Collections.emptyMap(), newKeyAllowed);
            if (!atomicReference.get().typeUrlExists(typeUrl)) {
                keyDeriverMap.put(typeUrl, createDeriverFor(manager));
                if (newKeyAllowed) {
                    registerKeyTemplates(typeUrl, manager.keyFactory().keyFormats());
                }
            }
            newKeyAllowedMap.put(typeUrl, Boolean.valueOf(newKeyAllowed));
            atomicReference.set(newKeyManagerRegistry);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String typeUrl, final KeyManager<P> manager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager(typeUrl, manager, true);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String typeUrl, final KeyManager<P> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (manager == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                if (!typeUrl.equals(manager.getKeyType())) {
                    throw new GeneralSecurityException("Manager does not support key type " + typeUrl + ".");
                }
                registerKeyManager(manager, newKeyAllowed);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (com.google.crypto.tink.Registry.keyManagerRegistry.get().typeUrlExists(r5) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        r1 = r6.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r1.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        r2 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (com.google.crypto.tink.Registry.keyTemplateMap.containsKey(r2.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r2.getKey() + " from an existing key manager of type " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        r1 = r6.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (r1.hasNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        r2 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
        if (com.google.crypto.tink.Registry.keyTemplateMap.containsKey(r2.getKey()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r2.getKey());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void ensureKeyManagerInsertable(java.lang.String r5, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r6, boolean r7) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r7 == 0) goto L36
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L33
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L36
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L1a
            goto L36
        L1a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "New keys are already disallowed for key type "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r5 = move-exception
            goto Ld1
        L36:
            if (r7 == 0) goto Ld3
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r1 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L33
            com.google.crypto.tink.KeyManagerRegistry r1 = (com.google.crypto.tink.KeyManagerRegistry) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.typeUrlExists(r5)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L91
            java.util.Set r1 = r6.entrySet()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L4e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L90
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r3 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L33
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L67
            goto L4e
        L67:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "Attempted to register a new key template "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = " from an existing key manager of type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L90:
            goto Ld3
        L91:
            java.util.Set r1 = r6.entrySet()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L99:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto Ld3
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r3 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L33
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto Lb2
            goto L99
        Lb2:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "Attempted overwrite of a registered key template "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        Ld1:
            monitor-exit(r0)
            throw r5
        Ld3:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.Registry.ensureKeyManagerInsertable(java.lang.String, java.util.Map, boolean):void");
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> publicKeyTypeManager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (privateKeyTypeManager == null || publicKeyTypeManager == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
            KeyManagerRegistry newKeyManagerRegistry = new KeyManagerRegistry(atomicReference.get());
            newKeyManagerRegistry.registerAsymmetricKeyManagers(privateKeyTypeManager, publicKeyTypeManager);
            String privateTypeUrl = privateKeyTypeManager.getKeyType();
            String publicTypeUrl = publicKeyTypeManager.getKeyType();
            ensureKeyManagerInsertable(privateTypeUrl, newKeyAllowed ? privateKeyTypeManager.keyFactory().keyFormats() : Collections.emptyMap(), newKeyAllowed);
            ensureKeyManagerInsertable(publicTypeUrl, Collections.emptyMap(), false);
            if (!atomicReference.get().typeUrlExists(privateTypeUrl)) {
                keyDeriverMap.put(privateTypeUrl, createDeriverFor(privateKeyTypeManager));
                if (newKeyAllowed) {
                    registerKeyTemplates(privateKeyTypeManager.getKeyType(), privateKeyTypeManager.keyFactory().keyFormats());
                }
            }
            ConcurrentMap<String, Boolean> concurrentMap = newKeyAllowedMap;
            concurrentMap.put(privateTypeUrl, Boolean.valueOf(newKeyAllowed));
            concurrentMap.put(publicTypeUrl, false);
            atomicReference.set(newKeyManagerRegistry);
        }
    }

    private static <KeyFormatProtoT extends MessageLite> void registerKeyTemplates(String typeUrl, Map<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> keyFormats) {
        for (Map.Entry<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> entry : keyFormats.entrySet()) {
            keyTemplateMap.put(entry.getKey(), KeyTemplate.create(typeUrl, entry.getValue().keyFormat.toByteArray(), entry.getValue().outputPrefixType));
        }
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(final PrimitiveWrapper<B, P> wrapper) throws GeneralSecurityException {
        synchronized (Registry.class) {
            MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(wrapper);
        }
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String typeUrl) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl);
    }

    public static <P> KeyManager<P> getKeyManager(String typeUrl, Class<P> primitiveClass) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl, primitiveClass);
    }

    public static KeyManager<?> getUntypedKeyManager(String typeUrl) throws GeneralSecurityException {
        return keyManagerRegistry.get().getUntypedKeyManager(typeUrl);
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            KeyManager<?> manager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKeyData = manager.newKeyData(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKeyData;
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            newKeyData = newKeyData(keyTemplate.getProto());
        }
        return newKeyData;
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager<?> manager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKey = manager.newKey(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKey;
    }

    public static synchronized MessageLite newKey(String typeUrl, MessageLite format) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager<?> manager = getKeyManager(typeUrl);
            if (newKeyAllowedMap.get(typeUrl).booleanValue()) {
                newKey = manager.newKey(format);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + typeUrl);
            }
        }
        return newKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream randomStream) throws GeneralSecurityException {
        KeyData deriveKey;
        synchronized (Registry.class) {
            String typeUrl = keyTemplate.getTypeUrl();
            ConcurrentMap<String, KeyDeriverContainer> concurrentMap = keyDeriverMap;
            if (!concurrentMap.containsKey(typeUrl)) {
                throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
            }
            KeyDeriverContainer deriver = concurrentMap.get(typeUrl);
            deriveKey = deriver.deriveKey(keyTemplate.getValue(), randomStream);
        }
        return deriveKey;
    }

    public static KeyData getPublicKeyData(String typeUrl, ByteString serializedPrivateKey) throws GeneralSecurityException {
        KeyManager<?> manager = getKeyManager(typeUrl);
        if (!(manager instanceof PrivateKeyManager)) {
            throw new GeneralSecurityException("manager for key type " + typeUrl + " is not a PrivateKeyManager");
        }
        return ((PrivateKeyManager) manager).getPublicKeyData(serializedPrivateKey);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, MessageLite key) throws GeneralSecurityException {
        KeyManager<P> manager = keyManagerRegistry.get().getKeyManager(typeUrl);
        return manager.getPrimitive(key);
    }

    public static <P> P getPrimitive(String typeUrl, MessageLite key, Class<P> primitiveClass) throws GeneralSecurityException {
        KeyManager<P> manager = keyManagerRegistry.get().getKeyManager(typeUrl, primitiveClass);
        return manager.getPrimitive(key);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, ByteString serializedKey) throws GeneralSecurityException {
        KeyManager<P> manager = keyManagerRegistry.get().getKeyManager(typeUrl);
        return manager.getPrimitive(serializedKey);
    }

    public static <P> P getPrimitive(String typeUrl, ByteString serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        KeyManager<P> manager = keyManagerRegistry.get().getKeyManager(typeUrl, primitiveClass);
        return manager.getPrimitive(serializedKey);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, byte[] serializedKey) throws GeneralSecurityException {
        return (P) getPrimitive(typeUrl, ByteString.copyFrom(serializedKey));
    }

    public static <P> P getPrimitive(String typeUrl, byte[] serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitive(typeUrl, ByteString.copyFrom(serializedKey), primitiveClass);
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), primitiveClass);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <KeyT extends Key, P> P getFullPrimitive(KeyT key, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) MutablePrimitiveRegistry.globalInstance().getPrimitive(key, primitiveClass);
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> clazz) throws GeneralSecurityException {
        return (P) MutablePrimitiveRegistry.globalInstance().wrap(primitiveSet, clazz);
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }

    public static synchronized List<String> keyTemplates() {
        List<String> unmodifiableList;
        synchronized (Registry.class) {
            List<String> results = new ArrayList<>();
            results.addAll(keyTemplateMap.keySet());
            unmodifiableList = Collections.unmodifiableList(results);
        }
        return unmodifiableList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map<String, KeyTemplate> keyTemplateMap() {
        Map<String, KeyTemplate> unmodifiableMap;
        synchronized (Registry.class) {
            unmodifiableMap = Collections.unmodifiableMap(keyTemplateMap);
        }
        return unmodifiableMap;
    }

    @Nullable
    public static Class<?> getInputPrimitive(Class<?> wrappedPrimitive) {
        try {
            return MutablePrimitiveRegistry.globalInstance().getInputPrimitiveClass(wrappedPrimitive);
        } catch (GeneralSecurityException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageLite parseKeyData(KeyData keyData) throws GeneralSecurityException, InvalidProtocolBufferException {
        return keyManagerRegistry.get().parseKeyData(keyData);
    }

    public static synchronized void restrictToFipsIfEmpty() throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (TinkFipsUtil.useOnlyFips()) {
                return;
            }
            if (keyManagerRegistry.get().isEmpty()) {
                TinkFipsUtil.setFipsRestricted();
                return;
            }
            throw new GeneralSecurityException("Could not enable FIPS mode as Registry is not empty.");
        }
    }

    private Registry() {
    }
}
