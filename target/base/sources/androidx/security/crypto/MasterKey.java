package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* loaded from: classes.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    private static final int DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS = 300;
    public static final String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    static final String KEYSTORE_PATH_URI = "android-keystore://";
    private final String mKeyAlias;
    private final KeyGenParameterSpec mKeyGenParameterSpec;

    /* loaded from: classes.dex */
    public enum KeyScheme {
        AES256_GCM
    }

    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return 300;
    }

    MasterKey(String keyAlias, Object keyGenParameterSpec) {
        this.mKeyAlias = keyAlias;
        this.mKeyGenParameterSpec = (KeyGenParameterSpec) keyGenParameterSpec;
    }

    public boolean isKeyStoreBacked() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.mKeyAlias);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            return false;
        }
    }

    public boolean isUserAuthenticationRequired() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        return keyGenParameterSpec != null && Api23Impl.isUserAuthenticationRequired(keyGenParameterSpec);
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        if (keyGenParameterSpec == null) {
            return 0;
        }
        return Api23Impl.getUserAuthenticationValidityDurationSeconds(keyGenParameterSpec);
    }

    public boolean isStrongBoxBacked() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        if (keyGenParameterSpec == null) {
            return false;
        }
        return Api28Impl.isStrongBoxBacked(keyGenParameterSpec);
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.mKeyAlias + ", isKeyStoreBacked=" + isKeyStoreBacked() + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getKeyAlias() {
        return this.mKeyAlias;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        boolean mAuthenticationRequired;
        final Context mContext;
        final String mKeyAlias;
        KeyGenParameterSpec mKeyGenParameterSpec;
        KeyScheme mKeyScheme;
        boolean mRequestStrongBoxBacked;
        int mUserAuthenticationValidityDurationSeconds;

        public Builder(Context context) {
            this(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        public Builder(Context context, String keyAlias) {
            this.mContext = context.getApplicationContext();
            this.mKeyAlias = keyAlias;
        }

        public Builder setKeyScheme(KeyScheme keyScheme) {
            switch (C05191.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme[keyScheme.ordinal()]) {
                case 1:
                    if (this.mKeyGenParameterSpec != null) {
                        throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                    }
                    this.mKeyScheme = keyScheme;
                    return this;
                default:
                    throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
            }
        }

        public Builder setUserAuthenticationRequired(boolean authenticationRequired) {
            return setUserAuthenticationRequired(authenticationRequired, MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }

        public Builder setUserAuthenticationRequired(boolean authenticationRequired, int userAuthenticationValidityDurationSeconds) {
            this.mAuthenticationRequired = authenticationRequired;
            this.mUserAuthenticationValidityDurationSeconds = userAuthenticationValidityDurationSeconds;
            return this;
        }

        public Builder setRequestStrongBoxBacked(boolean requestStrongBoxBacked) {
            this.mRequestStrongBoxBacked = requestStrongBoxBacked;
            return this;
        }

        public Builder setKeyGenParameterSpec(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.mKeyScheme != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (!this.mKeyAlias.equals(Api23Impl.getKeystoreAlias(keyGenParameterSpec))) {
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.mKeyAlias + " vs " + Api23Impl.getKeystoreAlias(keyGenParameterSpec));
            }
            this.mKeyGenParameterSpec = keyGenParameterSpec;
            return this;
        }

        public MasterKey build() throws GeneralSecurityException, IOException {
            return Api23Impl.build(this);
        }

        /* loaded from: classes.dex */
        static class Api23Impl {
            private Api23Impl() {
            }

            static String getKeystoreAlias(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }

            static MasterKey build(Builder builder) throws GeneralSecurityException, IOException {
                if (builder.mKeyScheme == null && builder.mKeyGenParameterSpec == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (builder.mKeyScheme == KeyScheme.AES256_GCM) {
                    KeyGenParameterSpec.Builder keyGenBuilder = new KeyGenParameterSpec.Builder(builder.mKeyAlias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (builder.mAuthenticationRequired) {
                        keyGenBuilder.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            Api30Impl.setUserAuthenticationParameters(keyGenBuilder, builder.mUserAuthenticationValidityDurationSeconds, 3);
                        } else {
                            keyGenBuilder.setUserAuthenticationValidityDurationSeconds(builder.mUserAuthenticationValidityDurationSeconds);
                        }
                    }
                    if (builder.mRequestStrongBoxBacked && builder.mContext.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        Api28Impl.setIsStrongBoxBacked(keyGenBuilder);
                    }
                    builder.mKeyGenParameterSpec = keyGenBuilder.build();
                }
                if (builder.mKeyGenParameterSpec == null) {
                    throw new NullPointerException("KeyGenParameterSpec was null after build() check");
                }
                String keyAlias = MasterKeys.getOrCreate(builder.mKeyGenParameterSpec);
                return new MasterKey(keyAlias, builder.mKeyGenParameterSpec);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static class Api28Impl {
                private Api28Impl() {
                }

                static void setIsStrongBoxBacked(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static class Api30Impl {
                private Api30Impl() {
                }

                static void setUserAuthenticationParameters(KeyGenParameterSpec.Builder builder, int timeout, int type) {
                    builder.setUserAuthenticationParameters(timeout, type);
                }
            }
        }
    }

    /* renamed from: androidx.security.crypto.MasterKey$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C05191 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean isUserAuthenticationRequired(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isUserAuthenticationRequired();
        }

        static int getUserAuthenticationValidityDurationSeconds(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
        }
    }

    /* loaded from: classes.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isStrongBoxBacked(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isStrongBoxBacked();
        }
    }
}
