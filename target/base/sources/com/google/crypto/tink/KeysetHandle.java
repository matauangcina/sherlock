package com.google.crypto.tink;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.LegacyProtoParameters;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.internal.InternalKeyHandle;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class KeysetHandle {
    private final MonitoringAnnotations annotations;
    private final List<Entry> entries;
    private final Keyset keyset;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<Entry> entries = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class KeyIdStrategy {
            private static final KeyIdStrategy RANDOM_ID = new KeyIdStrategy();
            private final int fixedId;

            static /* synthetic */ KeyIdStrategy access$200() {
                return randomId();
            }

            private KeyIdStrategy() {
                this.fixedId = 0;
            }

            private KeyIdStrategy(int id) {
                this.fixedId = id;
            }

            private static KeyIdStrategy randomId() {
                return RANDOM_ID;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static KeyIdStrategy fixedId(int id) {
                return new KeyIdStrategy(id);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int getFixedId() {
                return this.fixedId;
            }
        }

        /* loaded from: classes.dex */
        public static final class Entry {
            @Nullable
            private Builder builder;
            private boolean isPrimary;
            @Nullable
            private final Key key;
            private KeyStatus keyStatus;
            @Nullable
            private final Parameters parameters;
            private KeyIdStrategy strategy;

            /* synthetic */ Entry(Key x0, C09421 x1) {
                this(x0);
            }

            /* synthetic */ Entry(Parameters x0, C09421 x1) {
                this(x0);
            }

            private Entry(Key key) {
                this.keyStatus = KeyStatus.ENABLED;
                this.strategy = null;
                this.builder = null;
                this.key = key;
                this.parameters = null;
            }

            private Entry(Parameters parameters) {
                this.keyStatus = KeyStatus.ENABLED;
                this.strategy = null;
                this.builder = null;
                this.key = null;
                this.parameters = parameters;
            }

            public Entry makePrimary() {
                Builder builder = this.builder;
                if (builder != null) {
                    builder.clearPrimary();
                }
                this.isPrimary = true;
                return this;
            }

            public boolean isPrimary() {
                return this.isPrimary;
            }

            public Entry setStatus(KeyStatus status) {
                this.keyStatus = status;
                return this;
            }

            public KeyStatus getStatus() {
                return this.keyStatus;
            }

            public Entry withFixedId(int id) {
                this.strategy = KeyIdStrategy.fixedId(id);
                return this;
            }

            public Entry withRandomId() {
                this.strategy = KeyIdStrategy.access$200();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimary() {
            for (Entry entry : this.entries) {
                entry.isPrimary = false;
            }
        }

        public Builder addEntry(Entry entry) {
            if (entry.builder == null) {
                if (entry.isPrimary) {
                    clearPrimary();
                }
                entry.builder = this;
                this.entries.add(entry);
                return this;
            }
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }

        public int size() {
            return this.entries.size();
        }

        public Entry getAt(int i) {
            return this.entries.get(i);
        }

        @Deprecated
        public Entry removeAt(int i) {
            return this.entries.remove(i);
        }

        public Builder deleteAt(int i) {
            this.entries.remove(i);
            return this;
        }

        private static void checkIdAssignments(List<Entry> entries) throws GeneralSecurityException {
            for (int i = 0; i < entries.size() - 1; i++) {
                if (entries.get(i).strategy == KeyIdStrategy.RANDOM_ID && entries.get(i + 1).strategy != KeyIdStrategy.RANDOM_ID) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        private static int randomIdNotInSet(Set<Integer> ids) {
            int id = 0;
            while (true) {
                if (id == 0 || ids.contains(Integer.valueOf(id))) {
                    id = com.google.crypto.tink.internal.Util.randKeyId();
                } else {
                    return id;
                }
            }
        }

        private static Keyset.Key createKeyFromParameters(Parameters parameters, int id, KeyStatusType keyStatusType) throws GeneralSecurityException {
            ProtoParametersSerialization serializedParameters;
            if (parameters instanceof LegacyProtoParameters) {
                serializedParameters = ((LegacyProtoParameters) parameters).getSerialization();
            } else {
                serializedParameters = (ProtoParametersSerialization) MutableSerializationRegistry.globalInstance().serializeParameters(parameters, ProtoParametersSerialization.class);
            }
            KeyData keyData = Registry.newKeyData(serializedParameters.getKeyTemplate());
            return (Keyset.Key) Keyset.Key.newBuilder().setKeyId(id).setStatus(keyStatusType).setKeyData(keyData).setOutputPrefixType(serializedParameters.getKeyTemplate().getOutputPrefixType()).build();
        }

        private static int getNextIdFromBuilderEntry(Entry builderEntry, Set<Integer> idsSoFar) throws GeneralSecurityException {
            if (builderEntry.strategy != null) {
                if (builderEntry.strategy != KeyIdStrategy.RANDOM_ID) {
                    int id = builderEntry.strategy.getFixedId();
                    return id;
                }
                int id2 = randomIdNotInSet(idsSoFar);
                return id2;
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        private static Keyset.Key createKeysetKeyFromBuilderEntry(Entry builderEntry, int id) throws GeneralSecurityException {
            ProtoKeySerialization serializedKey;
            if (builderEntry.key != null) {
                if (builderEntry.key instanceof LegacyProtoKey) {
                    serializedKey = ((LegacyProtoKey) builderEntry.key).getSerialization(InsecureSecretKeyAccess.get());
                } else {
                    serializedKey = (ProtoKeySerialization) MutableSerializationRegistry.globalInstance().serializeKey(builderEntry.key, ProtoKeySerialization.class, InsecureSecretKeyAccess.get());
                }
                Integer idRequirement = serializedKey.getIdRequirementOrNull();
                if (idRequirement == null || idRequirement.intValue() == id) {
                    return KeysetHandle.toKeysetKey(id, KeysetHandle.serializeStatus(builderEntry.getStatus()), serializedKey);
                }
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            return createKeyFromParameters(builderEntry.parameters, id, KeysetHandle.serializeStatus(builderEntry.getStatus()));
        }

        public KeysetHandle build() throws GeneralSecurityException {
            Keyset.Builder keysetBuilder = Keyset.newBuilder();
            Integer primaryId = null;
            checkIdAssignments(this.entries);
            Set<Integer> idsSoFar = new HashSet<>();
            for (Entry builderEntry : this.entries) {
                if (builderEntry.keyStatus == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int id = getNextIdFromBuilderEntry(builderEntry, idsSoFar);
                if (idsSoFar.contains(Integer.valueOf(id))) {
                    throw new GeneralSecurityException("Id " + id + " is used twice in the keyset");
                }
                idsSoFar.add(Integer.valueOf(id));
                Keyset.Key keysetKey = createKeysetKeyFromBuilderEntry(builderEntry, id);
                keysetBuilder.addKey(keysetKey);
                if (builderEntry.isPrimary) {
                    if (primaryId != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    primaryId = Integer.valueOf(id);
                }
            }
            if (primaryId == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            keysetBuilder.setPrimaryKeyId(primaryId.intValue());
            return KeysetHandle.fromKeyset((Keyset) keysetBuilder.build());
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Entry {

        /* renamed from: id */
        private final int f177id;
        private final boolean isPrimary;
        private final Key key;
        private final KeyStatus keyStatus;

        /* synthetic */ Entry(Key x0, KeyStatus x1, int x2, boolean x3, C09421 x4) {
            this(x0, x1, x2, x3);
        }

        private Entry(Key key, KeyStatus keyStatus, int id, boolean isPrimary) {
            this.key = key;
            this.keyStatus = keyStatus;
            this.f177id = id;
            this.isPrimary = isPrimary;
        }

        public Key getKey() {
            return this.key;
        }

        public KeyStatus getStatus() {
            return this.keyStatus;
        }

        public int getId() {
            return this.f177id;
        }

        public boolean isPrimary() {
            return this.isPrimary;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.KeysetHandle$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C09421 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private static KeyStatus parseStatus(KeyStatusType in) throws GeneralSecurityException {
        switch (C09421.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[in.ordinal()]) {
            case 1:
                return KeyStatus.ENABLED;
            case 2:
                return KeyStatus.DISABLED;
            case 3:
                return KeyStatus.DESTROYED;
            default:
                throw new GeneralSecurityException("Unknown key status");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyStatusType serializeStatus(KeyStatus in) {
        if (KeyStatus.ENABLED.equals(in)) {
            return KeyStatusType.ENABLED;
        }
        if (KeyStatus.DISABLED.equals(in)) {
            return KeyStatusType.DISABLED;
        }
        if (KeyStatus.DESTROYED.equals(in)) {
            return KeyStatusType.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Keyset.Key toKeysetKey(int id, KeyStatusType status, ProtoKeySerialization protoKeySerialization) {
        return (Keyset.Key) Keyset.Key.newBuilder().setKeyData(KeyData.newBuilder().setTypeUrl(protoKeySerialization.getTypeUrl()).setValue(protoKeySerialization.getValue()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType())).setStatus(status).setKeyId(id).setOutputPrefixType(protoKeySerialization.getOutputPrefixType()).build();
    }

    private static List<Entry> getEntriesFromKeyset(Keyset keyset) {
        List<Entry> result = new ArrayList<>(keyset.getKeyCount());
        for (Keyset.Key protoKey : keyset.getKeyList()) {
            int id = protoKey.getKeyId();
            ProtoKeySerialization protoKeySerialization = toProtoKeySerialization(protoKey);
            try {
                Key key = MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(protoKeySerialization, InsecureSecretKeyAccess.get());
                result.add(new Entry(key, parseStatus(protoKey.getStatus()), id, id == keyset.getPrimaryKeyId(), null));
            } catch (GeneralSecurityException e) {
                result.add(null);
            }
        }
        return Collections.unmodifiableList(result);
    }

    private static ProtoKeySerialization toProtoKeySerialization(Keyset.Key protoKey) {
        int id = protoKey.getKeyId();
        Integer idRequirement = protoKey.getOutputPrefixType() == OutputPrefixType.RAW ? null : Integer.valueOf(id);
        try {
            return ProtoKeySerialization.create(protoKey.getKeyData().getTypeUrl(), protoKey.getKeyData().getValue(), protoKey.getKeyData().getKeyMaterialType(), protoKey.getOutputPrefixType(), idRequirement);
        } catch (GeneralSecurityException e) {
            throw new TinkBugException("Creating a protokey serialization failed", e);
        }
    }

    private Entry entryByIndex(int i) {
        if (this.entries.get(i) == null) {
            throw new IllegalStateException("Keyset-Entry at position i has wrong status or key parsing failed");
        }
        return this.entries.get(i);
    }

    public static Builder.Entry importKey(Key key) {
        Builder.Entry importedEntry = new Builder.Entry(key, (C09421) null);
        Integer requirement = key.getIdRequirementOrNull();
        if (requirement != null) {
            importedEntry.withFixedId(requirement.intValue());
        }
        return importedEntry;
    }

    public static Builder.Entry generateEntryFromParametersName(String namedParameters) throws GeneralSecurityException {
        if (!Registry.keyTemplateMap().containsKey(namedParameters)) {
            throw new GeneralSecurityException("cannot find key template: " + namedParameters);
        }
        KeyTemplate template = Registry.keyTemplateMap().get(namedParameters);
        ProtoParametersSerialization serialization = ProtoParametersSerialization.create(template.getProto());
        Parameters parameters = MutableSerializationRegistry.globalInstance().parseParametersWithLegacyFallback(serialization);
        return new Builder.Entry(parameters, (C09421) null);
    }

    public static Builder.Entry generateEntryFromParameters(Parameters parameters) {
        return new Builder.Entry(parameters, (C09421) null);
    }

    private KeysetHandle(Keyset keyset, List<Entry> entries) {
        this.keyset = keyset;
        this.entries = entries;
        this.annotations = MonitoringAnnotations.EMPTY;
    }

    private KeysetHandle(Keyset keyset, List<Entry> entries, MonitoringAnnotations annotations) {
        this.keyset = keyset;
        this.entries = entries;
        this.annotations = annotations;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final KeysetHandle fromKeyset(Keyset keyset) throws GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        List<Entry> entries = getEntriesFromKeyset(keyset);
        return new KeysetHandle(keyset, entries);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final KeysetHandle fromKeysetAndAnnotations(Keyset keyset, MonitoringAnnotations annotations) throws GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        List<Entry> entries = getEntriesFromKeyset(keyset);
        return new KeysetHandle(keyset, entries, annotations);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyset getKeyset() {
        return this.keyset;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(KeysetHandle handle) {
        Builder builder = new Builder();
        for (int i = 0; i < handle.size(); i++) {
            Entry entry = handle.entryByIndex(i);
            Builder.Entry builderEntry = importKey(entry.getKey()).withFixedId(entry.getId());
            builderEntry.setStatus(entry.getStatus());
            if (entry.isPrimary()) {
                builderEntry.makePrimary();
            }
            builder.addEntry(builderEntry);
        }
        return builder;
    }

    public Entry getPrimary() {
        for (int i = 0; i < this.keyset.getKeyCount(); i++) {
            if (this.keyset.getKey(i).getKeyId() == this.keyset.getPrimaryKeyId()) {
                Entry result = entryByIndex(i);
                if (result.getStatus() != KeyStatus.ENABLED) {
                    throw new IllegalStateException("Keyset has primary which isn't enabled");
                }
                return result;
            }
        }
        throw new IllegalStateException("Keyset has no primary");
    }

    public int size() {
        return this.keyset.getKeyCount();
    }

    public Entry getAt(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + size());
        }
        return entryByIndex(i);
    }

    @Deprecated
    public List<KeyHandle> getKeys() {
        ArrayList<KeyHandle> result = new ArrayList<>();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            KeyData keyData = key.getKeyData();
            result.add(new InternalKeyHandle(new ProtoKey(keyData, KeyTemplate.fromProto(key.getOutputPrefixType())), key.getStatus(), key.getKeyId()));
        }
        return Collections.unmodifiableList(result);
    }

    public KeysetInfo getKeysetInfo() {
        return Util.getKeysetInfo(this.keyset);
    }

    @Deprecated
    public static final KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        LegacyProtoParameters parameters = new LegacyProtoParameters(ProtoParametersSerialization.create(keyTemplate));
        return newBuilder().addEntry(generateEntryFromParameters(parameters).makePrimary().withRandomId()).build();
    }

    public static final KeysetHandle generateNew(KeyTemplate keyTemplate) throws GeneralSecurityException {
        LegacyProtoParameters parameters = new LegacyProtoParameters(ProtoParametersSerialization.create(keyTemplate.getProto()));
        return newBuilder().addEntry(generateEntryFromParameters(parameters).makePrimary().withRandomId()).build();
    }

    @Deprecated
    public static final KeysetHandle createFromKey(KeyHandle keyHandle, KeyAccess access) throws GeneralSecurityException {
        KeysetManager km = KeysetManager.withEmptyKeyset().add(keyHandle);
        km.setPrimary(km.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
        return km.getKeysetHandle();
    }

    public static final KeysetHandle read(KeysetReader reader, Aead masterKey) throws GeneralSecurityException, IOException {
        return readWithAssociatedData(reader, masterKey, new byte[0]);
    }

    public static final KeysetHandle readWithAssociatedData(KeysetReader reader, Aead masterKey, byte[] associatedData) throws GeneralSecurityException, IOException {
        EncryptedKeyset encryptedKeyset = reader.readEncrypted();
        assertEnoughEncryptedKeyMaterial(encryptedKeyset);
        return fromKeyset(decrypt(encryptedKeyset, masterKey, associatedData));
    }

    public static final KeysetHandle readNoSecret(KeysetReader reader) throws GeneralSecurityException, IOException {
        try {
            Keyset keyset = reader.read();
            assertNoSecretKeyMaterial(keyset);
            return fromKeyset(keyset);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    public static final KeysetHandle readNoSecret(final byte[] serialized) throws GeneralSecurityException {
        try {
            Keyset keyset = Keyset.parseFrom(serialized, ExtensionRegistryLite.getEmptyRegistry());
            assertNoSecretKeyMaterial(keyset);
            return fromKeyset(keyset);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public void write(KeysetWriter keysetWriter, Aead masterKey) throws GeneralSecurityException, IOException {
        writeWithAssociatedData(keysetWriter, masterKey, new byte[0]);
    }

    public void writeWithAssociatedData(KeysetWriter keysetWriter, Aead masterKey, byte[] associatedData) throws GeneralSecurityException, IOException {
        EncryptedKeyset encryptedKeyset = encrypt(this.keyset, masterKey, associatedData);
        keysetWriter.write(encryptedKeyset);
    }

    public void writeNoSecret(KeysetWriter writer) throws GeneralSecurityException, IOException {
        assertNoSecretKeyMaterial(this.keyset);
        writer.write(this.keyset);
    }

    private static EncryptedKeyset encrypt(Keyset keyset, Aead masterKey, byte[] associatedData) throws GeneralSecurityException {
        byte[] encryptedKeyset = masterKey.encrypt(keyset.toByteArray(), associatedData);
        try {
            Keyset keyset2 = Keyset.parseFrom(masterKey.decrypt(encryptedKeyset, associatedData), ExtensionRegistryLite.getEmptyRegistry());
            if (!keyset2.equals(keyset)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            return (EncryptedKeyset) EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(encryptedKeyset)).setKeysetInfo(Util.getKeysetInfo(keyset)).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static Keyset decrypt(EncryptedKeyset encryptedKeyset, Aead masterKey, byte[] associatedData) throws GeneralSecurityException {
        try {
            Keyset keyset = Keyset.parseFrom(masterKey.decrypt(encryptedKeyset.getEncryptedKeyset().toByteArray(), associatedData), ExtensionRegistryLite.getEmptyRegistry());
            assertEnoughKeyMaterial(keyset);
            return keyset;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public KeysetHandle getPublicKeysetHandle() throws GeneralSecurityException {
        if (this.keyset == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        Keyset.Builder keysetBuilder = Keyset.newBuilder();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            KeyData keyData = createPublicKeyData(key.getKeyData());
            keysetBuilder.addKey((Keyset.Key) ((Keyset.Key.Builder) key.toBuilder()).setKeyData(keyData).build());
        }
        keysetBuilder.setPrimaryKeyId(this.keyset.getPrimaryKeyId());
        return fromKeyset((Keyset) keysetBuilder.build());
    }

    private static KeyData createPublicKeyData(KeyData privateKeyData) throws GeneralSecurityException {
        if (privateKeyData.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
            throw new GeneralSecurityException("The keyset contains a non-private key");
        }
        KeyData publicKeyData = Registry.getPublicKeyData(privateKeyData.getTypeUrl(), privateKeyData.getValue());
        validate(publicKeyData);
        return publicKeyData;
    }

    private static void validate(KeyData keyData) throws GeneralSecurityException {
        Registry.getPrimitive(keyData);
    }

    public String toString() {
        return getKeysetInfo().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void assertNoSecretKeyMaterial(com.google.crypto.tink.proto.Keyset r4) throws java.security.GeneralSecurityException {
        /*
            java.util.List r0 = r4.getKeyList()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L39
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r2 == r3) goto L39
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            java.lang.String r2 = r2.name()
            com.google.crypto.tink.proto.KeyData r3 = r1.getKeyData()
            java.lang.String r3 = r3.getTypeUrl()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "keyset contains key material of type %s for type url %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.KeysetHandle.assertNoSecretKeyMaterial(com.google.crypto.tink.proto.Keyset):void");
    }

    private static void assertEnoughKeyMaterial(Keyset keyset) throws GeneralSecurityException {
        if (keyset == null || keyset.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void assertEnoughEncryptedKeyMaterial(EncryptedKeyset keyset) throws GeneralSecurityException {
        if (keyset == null || keyset.getEncryptedKeyset().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P getPrimitiveWithKnownInputPrimitive(Class<P> classObject, Class<B> inputPrimitiveClassObject) throws GeneralSecurityException {
        Util.validateKeyset(this.keyset);
        PrimitiveSet.Builder newBuilder = PrimitiveSet.newBuilder(inputPrimitiveClassObject);
        newBuilder.setAnnotations(this.annotations);
        for (int i = 0; i < size(); i++) {
            Keyset.Key protoKey = this.keyset.getKey(i);
            if (protoKey.getStatus().equals(KeyStatusType.ENABLED)) {
                Object legacyPrimitiveOrNull = getLegacyPrimitiveOrNull(protoKey, inputPrimitiveClassObject);
                Object obj = null;
                if (this.entries.get(i) != null) {
                    obj = getFullPrimitiveOrNull(this.entries.get(i).getKey(), inputPrimitiveClassObject);
                }
                if (protoKey.getKeyId() == this.keyset.getPrimaryKeyId()) {
                    newBuilder.addPrimaryFullPrimitiveAndOptionalPrimitive(obj, legacyPrimitiveOrNull, protoKey);
                } else {
                    newBuilder.addFullPrimitiveAndOptionalPrimitive(obj, legacyPrimitiveOrNull, protoKey);
                }
            }
        }
        return (P) Registry.wrap(newBuilder.build(), classObject);
    }

    public <P> P getPrimitive(Class<P> targetClassObject) throws GeneralSecurityException {
        Class<?> inputPrimitiveClassObject = Registry.getInputPrimitive(targetClassObject);
        if (inputPrimitiveClassObject == null) {
            throw new GeneralSecurityException("No wrapper found for " + targetClassObject.getName());
        }
        return (P) getPrimitiveWithKnownInputPrimitive(targetClassObject, inputPrimitiveClassObject);
    }

    @Deprecated
    public KeyHandle primaryKey() throws GeneralSecurityException {
        int primaryKeyId = this.keyset.getPrimaryKeyId();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            if (key.getKeyId() == primaryKeyId) {
                return new InternalKeyHandle(new ProtoKey(key.getKeyData(), KeyTemplate.fromProto(key.getOutputPrefixType())), key.getStatus(), key.getKeyId());
            }
        }
        throw new GeneralSecurityException("No primary key found in keyset.");
    }

    @Nullable
    private static <B> B getLegacyPrimitiveOrNull(Keyset.Key key, Class<B> inputPrimitiveClassObject) throws GeneralSecurityException {
        try {
            return (B) Registry.getPrimitive(key.getKeyData(), inputPrimitiveClassObject);
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    @Nullable
    private <B> B getFullPrimitiveOrNull(Key key, Class<B> inputPrimitiveClassObject) throws GeneralSecurityException {
        try {
            return (B) Registry.getFullPrimitive(key, inputPrimitiveClassObject);
        } catch (GeneralSecurityException e) {
            return null;
        }
    }
}
