package p000a.p045o.p046a;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* renamed from: a.o.a.b */
/* loaded from: classes.dex */
public final class C0323b {

    /* renamed from: a */
    private final String f870a;

    /* renamed from: a.o.a.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0324a {

        /* renamed from: a */
        static final /* synthetic */ int[] f871a;

        static {
            int[] iArr = new int[EnumC0326c.values().length];
            f871a = iArr;
            try {
                iArr[EnumC0326c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a.o.a.b$b */
    /* loaded from: classes.dex */
    public static final class C0325b {

        /* renamed from: a */
        private final String f872a;

        /* renamed from: b */
        private KeyGenParameterSpec f873b;

        /* renamed from: c */
        private EnumC0326c f874c;

        /* renamed from: d */
        private boolean f875d;

        /* renamed from: e */
        private int f876e;

        /* renamed from: f */
        private boolean f877f;

        /* renamed from: g */
        private final Context f878g;

        public C0325b(Context context, String str) {
            this.f878g = context.getApplicationContext();
            this.f872a = str;
        }

        /* renamed from: b */
        private C0323b m8383b() {
            if (this.f874c == null && this.f873b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (this.f874c == EnumC0326c.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f872a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                if (this.f875d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f876e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f877f && this.f878g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.f873b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f873b;
            if (keyGenParameterSpec != null) {
                return new C0323b(C0327c.m8379c(keyGenParameterSpec), this.f873b);
            }
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }

        /* renamed from: a */
        public C0323b m8384a() {
            return Build.VERSION.SDK_INT >= 23 ? m8383b() : new C0323b(this.f872a, null);
        }

        /* renamed from: c */
        public C0325b m8382c(EnumC0326c enumC0326c) {
            if (C0324a.f871a[enumC0326c.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + enumC0326c);
            } else if (Build.VERSION.SDK_INT < 23 || this.f873b == null) {
                this.f874c = enumC0326c;
                return this;
            } else {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
        }
    }

    /* renamed from: a.o.a.b$c */
    /* loaded from: classes.dex */
    public enum EnumC0326c {
        AES256_GCM
    }

    C0323b(String str, Object obj) {
        this.f870a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m8386a() {
        return this.f870a;
    }

    /* renamed from: b */
    public boolean m8385b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f870a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f870a + ", isKeyStoreBacked=" + m8385b() + "}";
    }
}
