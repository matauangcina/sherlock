package p000a.p045o.p046a;

import android.security.keystore.KeyGenParameterSpec;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
@Deprecated
/* renamed from: a.o.a.c */
/* loaded from: classes.dex */
public final class C0327c {

    /* renamed from: a */
    public static final KeyGenParameterSpec f881a = m8381a("_androidx_security_master_key_");

    /* renamed from: a */
    private static KeyGenParameterSpec m8381a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    /* renamed from: b */
    private static void m8380b(KeyGenParameterSpec keyGenParameterSpec) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m8379c(KeyGenParameterSpec keyGenParameterSpec) {
        m8377e(keyGenParameterSpec);
        if (!m8378d(keyGenParameterSpec.getKeystoreAlias())) {
            m8380b(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: d */
    private static boolean m8378d(String str) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    /* renamed from: e */
    static void m8377e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        } else if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        } else if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
    }
}
