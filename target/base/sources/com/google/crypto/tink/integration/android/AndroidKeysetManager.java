package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* loaded from: classes.dex */
public final class AndroidKeysetManager {
    private KeysetManager keysetManager;
    private final Aead masterAead;
    private final KeysetWriter writer;
    private static final Object lock = new Object();
    private static final String TAG = AndroidKeysetManager.class.getSimpleName();

    /* synthetic */ AndroidKeysetManager(Builder x0, C09951 x1) {
        this(x0);
    }

    static /* synthetic */ boolean access$700() {
        return isAtLeastM();
    }

    private AndroidKeysetManager(Builder builder) {
        this.writer = new SharedPrefKeysetWriter(builder.context, builder.keysetName, builder.prefFileName);
        this.masterAead = builder.masterAead;
        this.keysetManager = builder.keysetManager;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private KeysetManager keysetManager;
        private Context context = null;
        private String keysetName = null;
        private String prefFileName = null;
        private String masterKeyUri = null;
        private Aead masterAead = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;

        public Builder withSharedPref(Context context, String keysetName, String prefFileName) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (keysetName == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.context = context;
            this.keysetName = keysetName;
            this.prefFileName = prefFileName;
            return this;
        }

        public Builder withMasterKeyUri(String val) {
            if (!val.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.useKeystore) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.masterKeyUri = val;
            return this;
        }

        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate val) {
            this.keyTemplate = KeyTemplate.create(val.getTypeUrl(), val.getValue().toByteArray(), AndroidKeysetManager.fromProto(val.getOutputPrefixType()));
            return this;
        }

        public Builder withKeyTemplate(KeyTemplate val) {
            this.keyTemplate = val;
            return this;
        }

        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        private static byte[] readKeysetFromPrefs(Context context, String keysetName, String prefFileName) throws IOException {
            SharedPreferences sharedPreferences;
            if (keysetName == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context appContext = context.getApplicationContext();
            if (prefFileName == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
            } else {
                sharedPreferences = appContext.getSharedPreferences(prefFileName, 0);
            }
            try {
                String keysetHex = sharedPreferences.getString(keysetName, null);
                if (keysetHex == null) {
                    return null;
                }
                return Hex.decode(keysetHex);
            } catch (ClassCastException | IllegalArgumentException e) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", keysetName));
            }
        }

        private KeysetManager readKeysetInCleartext(byte[] serializedKeyset) throws GeneralSecurityException, IOException {
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(serializedKeyset)));
        }

        public synchronized AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            AndroidKeysetManager androidKeysetManager;
            if (this.keysetName != null) {
                synchronized (AndroidKeysetManager.lock) {
                    byte[] serializedKeyset = readKeysetFromPrefs(this.context, this.keysetName, this.prefFileName);
                    if (serializedKeyset == null) {
                        if (this.masterKeyUri != null) {
                            this.masterAead = readOrGenerateNewMasterKey();
                        }
                        this.keysetManager = generateKeysetAndWriteToPrefs();
                    } else {
                        if (this.masterKeyUri != null && AndroidKeysetManager.access$700()) {
                            this.keysetManager = readMasterkeyDecryptAndParseKeyset(serializedKeyset);
                        }
                        this.keysetManager = readKeysetInCleartext(serializedKeyset);
                    }
                    androidKeysetManager = new AndroidKeysetManager(this, null);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            return androidKeysetManager;
        }

        private Aead readOrGenerateNewMasterKey() throws GeneralSecurityException {
            if (!AndroidKeysetManager.access$700()) {
                Log.w(AndroidKeysetManager.TAG, "Android Keystore requires at least Android M");
                return null;
            }
            AndroidKeystoreKmsClient client = new AndroidKeystoreKmsClient();
            try {
                boolean generated = AndroidKeystoreKmsClient.generateKeyIfNotExist(this.masterKeyUri);
                try {
                    return client.getAead(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException ex) {
                    if (generated) {
                        Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", ex);
                        return null;
                    }
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.masterKeyUri), ex);
                }
            } catch (GeneralSecurityException | ProviderException ex2) {
                Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", ex2);
                return null;
            }
        }

        private KeysetManager generateKeysetAndWriteToPrefs() throws GeneralSecurityException, IOException {
            if (this.keyTemplate == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            KeysetManager manager = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
            int keyId = manager.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId();
            KeysetManager manager2 = manager.setPrimary(keyId);
            KeysetWriter writer = new SharedPrefKeysetWriter(this.context, this.keysetName, this.prefFileName);
            if (this.masterAead != null) {
                manager2.getKeysetHandle().write(writer, this.masterAead);
            } else {
                CleartextKeysetHandle.write(manager2.getKeysetHandle(), writer);
            }
            return manager2;
        }

        private KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] serializedKeyset) throws GeneralSecurityException, IOException {
            try {
                this.masterAead = new AndroidKeystoreKmsClient().getAead(this.masterKeyUri);
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(BinaryKeysetReader.withBytes(serializedKeyset), this.masterAead));
                } catch (IOException | GeneralSecurityException ex) {
                    try {
                        return readKeysetInCleartext(serializedKeyset);
                    } catch (IOException e) {
                        throw ex;
                    }
                }
            } catch (GeneralSecurityException | ProviderException keystoreException) {
                try {
                    KeysetManager manager = readKeysetInCleartext(serializedKeyset);
                    Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", keystoreException);
                    return manager;
                } catch (IOException e2) {
                    throw keystoreException;
                }
            }
        }
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.keysetManager.getKeysetHandle();
    }

    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager rotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = rotate;
        write(rotate);
        return this;
    }

    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }

    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }

    public synchronized AndroidKeysetManager setPrimary(int keyId) throws GeneralSecurityException {
        KeysetManager primary = this.keysetManager.setPrimary(keyId);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    @Deprecated
    public synchronized AndroidKeysetManager promote(int keyId) throws GeneralSecurityException {
        return setPrimary(keyId);
    }

    public synchronized AndroidKeysetManager enable(int keyId) throws GeneralSecurityException {
        KeysetManager enable = this.keysetManager.enable(keyId);
        this.keysetManager = enable;
        write(enable);
        return this;
    }

    public synchronized AndroidKeysetManager disable(int keyId) throws GeneralSecurityException {
        KeysetManager disable = this.keysetManager.disable(keyId);
        this.keysetManager = disable;
        write(disable);
        return this;
    }

    public synchronized AndroidKeysetManager delete(int keyId) throws GeneralSecurityException {
        KeysetManager delete = this.keysetManager.delete(keyId);
        this.keysetManager = delete;
        write(delete);
        return this;
    }

    public synchronized AndroidKeysetManager destroy(int keyId) throws GeneralSecurityException {
        KeysetManager destroy = this.keysetManager.destroy(keyId);
        this.keysetManager = destroy;
        write(destroy);
        return this;
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    private void write(KeysetManager manager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                manager.getKeysetHandle().write(this.writer, this.masterAead);
            } else {
                CleartextKeysetHandle.write(manager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private boolean shouldUseKeystore() {
        return this.masterAead != null && isAtLeastM();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C09951 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        switch (C09951.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()]) {
            case 1:
                return KeyTemplate.OutputPrefixType.TINK;
            case 2:
                return KeyTemplate.OutputPrefixType.LEGACY;
            case 3:
                return KeyTemplate.OutputPrefixType.RAW;
            case 4:
                return KeyTemplate.OutputPrefixType.CRUNCHY;
            default:
                throw new IllegalArgumentException("Unknown output prefix type");
        }
    }

    private static boolean isAtLeastM() {
        return true;
    }
}
