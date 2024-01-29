package p000a.p045o.p046a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.config.TinkConfig;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.p014d.C0068b;
/* renamed from: a.o.a.a */
/* loaded from: classes.dex */
public final class SharedPreferencesC0317a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f846a;

    /* renamed from: b */
    final List<SharedPreferences.OnSharedPreferenceChangeListener> f847b = new ArrayList();

    /* renamed from: c */
    final String f848c;

    /* renamed from: d */
    final Aead f849d;

    /* renamed from: e */
    final DeterministicAead f850e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.o.a.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0318a {

        /* renamed from: a */
        static final /* synthetic */ int[] f851a;

        static {
            int[] iArr = new int[EnumC0320c.values().length];
            f851a = iArr;
            try {
                iArr[EnumC0320c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f851a[EnumC0320c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f851a[EnumC0320c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f851a[EnumC0320c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f851a[EnumC0320c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f851a[EnumC0320c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a.o.a.a$b */
    /* loaded from: classes.dex */
    private static final class SharedPreferences$EditorC0319b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final SharedPreferencesC0317a f852a;

        /* renamed from: b */
        private final SharedPreferences.Editor f853b;

        /* renamed from: d */
        private AtomicBoolean f855d = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<String> f854c = new CopyOnWriteArrayList();

        SharedPreferences$EditorC0319b(SharedPreferencesC0317a sharedPreferencesC0317a, SharedPreferences.Editor editor) {
            this.f852a = sharedPreferencesC0317a;
            this.f853b = editor;
        }

        /* renamed from: a */
        private void m8393a() {
            if (this.f855d.getAndSet(false)) {
                for (String str : this.f852a.getAll().keySet()) {
                    if (!this.f854c.contains(str) && !this.f852a.m8394g(str)) {
                        this.f853b.remove(this.f852a.m8397d(str));
                    }
                }
            }
        }

        /* renamed from: b */
        private void m8392b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f852a.f847b) {
                for (String str : this.f854c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f852a, str);
                }
            }
        }

        /* renamed from: c */
        private void m8391c(String str, byte[] bArr) {
            if (this.f852a.m8394g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f854c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> m8396e = this.f852a.m8396e(str, bArr);
                this.f853b.putString((String) m8396e.first, (String) m8396e.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            m8393a();
            this.f853b.apply();
            m8392b();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f855d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            m8393a();
            try {
                return this.f853b.commit();
            } finally {
                m8392b();
                this.f854c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EnumC0320c.BOOLEAN.m8389e());
            allocate.put(z ? (byte) 1 : (byte) 0);
            m8391c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EnumC0320c.FLOAT.m8389e());
            allocate.putFloat(f);
            m8391c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EnumC0320c.INT.m8389e());
            allocate.putInt(i);
            m8391c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EnumC0320c.LONG.m8389e());
            allocate.putLong(j);
            m8391c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EnumC0320c.STRING.m8389e());
            allocate.putInt(length);
            allocate.put(bytes);
            m8391c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C0068b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EnumC0320c.STRING_SET.m8389e());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            m8391c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f852a.m8394g(str)) {
                this.f853b.remove(this.f852a.m8397d(str));
                this.f854c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a$c */
    /* loaded from: classes.dex */
    public enum EnumC0320c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: f */
        private final int f863f;

        EnumC0320c(int i) {
            this.f863f = i;
        }

        /* renamed from: d */
        public static EnumC0320c m8390d(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        /* renamed from: e */
        public int m8389e() {
            return this.f863f;
        }
    }

    /* renamed from: a.o.a.a$d */
    /* loaded from: classes.dex */
    public enum EnumC0321d {
        AES256_SIV(AesSivKeyManager.aes256SivTemplate());
        

        /* renamed from: f */
        private final KeyTemplate f866f;

        EnumC0321d(KeyTemplate keyTemplate) {
            this.f866f = keyTemplate;
        }

        /* renamed from: d */
        KeyTemplate m8388d() {
            return this.f866f;
        }
    }

    /* renamed from: a.o.a.a$e */
    /* loaded from: classes.dex */
    public enum EnumC0322e {
        AES256_GCM(AesGcmKeyManager.aes256GcmTemplate());
        

        /* renamed from: f */
        private final KeyTemplate f869f;

        EnumC0322e(KeyTemplate keyTemplate) {
            this.f869f = keyTemplate;
        }

        /* renamed from: d */
        KeyTemplate m8387d() {
            return this.f869f;
        }
    }

    SharedPreferencesC0317a(String str, String str2, SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.f848c = str;
        this.f846a = sharedPreferences;
        this.f849d = aead;
        this.f850e = deterministicAead;
    }

    /* renamed from: a */
    public static SharedPreferences m8400a(Context context, String str, C0323b c0323b, EnumC0321d enumC0321d, EnumC0322e enumC0322e) {
        return m8399b(str, c0323b.m8386a(), context, enumC0321d, enumC0322e);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m8399b(String str, String str2, Context context, EnumC0321d enumC0321d, EnumC0322e enumC0322e) {
        TinkConfig.register();
        Context applicationContext = context.getApplicationContext();
        AndroidKeysetManager.Builder withSharedPref = new AndroidKeysetManager.Builder().withKeyTemplate(enumC0321d.m8388d()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        KeysetHandle keysetHandle = withSharedPref.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        AndroidKeysetManager.Builder withSharedPref2 = new AndroidKeysetManager.Builder().withKeyTemplate(enumC0322e.m8387d()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        KeysetHandle keysetHandle2 = withSharedPref2.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        DeterministicAead deterministicAead = (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class);
        return new SharedPreferencesC0317a(str, str2, applicationContext.getSharedPreferences(str, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), deterministicAead);
    }

    /* renamed from: f */
    private Object m8395f(String str) {
        if (m8394g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String m8397d = m8397d(str);
            String string = this.f846a.getString(m8397d, null);
            if (string != null) {
                ByteBuffer wrap = ByteBuffer.wrap(this.f849d.decrypt(Base64.decode(string, 0), m8397d.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (C0318a.f851a[EnumC0320c.m8390d(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        return Boolean.valueOf(wrap.get() != 0);
                    case 6:
                        C0068b c0068b = new C0068b();
                        while (wrap.hasRemaining()) {
                            int i2 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i2);
                            wrap.position(wrap.position() + i2);
                            c0068b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (c0068b.size() == 1 && "__NULL__".equals(c0068b.m9390s(0))) {
                            return null;
                        }
                        return c0068b;
                    default:
                        return null;
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    String m8398c(String str) {
        try {
            String str2 = new String(this.f850e.decryptDeterministically(Base64.decode(str, 0), this.f848c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!m8394g(str)) {
            return this.f846a.contains(m8397d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: d */
    String m8397d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.encode(this.f850e.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.f848c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    /* renamed from: e */
    Pair<String, String> m8396e(String str, byte[] bArr) {
        String m8397d = m8397d(str);
        return new Pair<>(m8397d, Base64.encode(this.f849d.encrypt(bArr, m8397d.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC0319b(this, this.f846a.edit());
    }

    /* renamed from: g */
    boolean m8394g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f846a.getAll().entrySet()) {
            if (!m8394g(entry.getKey())) {
                String m8398c = m8398c(entry.getKey());
                hashMap.put(m8398c, m8395f(m8398c));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object m8395f = m8395f(str);
        return (m8395f == null || !(m8395f instanceof Boolean)) ? z : ((Boolean) m8395f).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object m8395f = m8395f(str);
        return (m8395f == null || !(m8395f instanceof Float)) ? f : ((Float) m8395f).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object m8395f = m8395f(str);
        return (m8395f == null || !(m8395f instanceof Integer)) ? i : ((Integer) m8395f).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object m8395f = m8395f(str);
        return (m8395f == null || !(m8395f instanceof Long)) ? j : ((Long) m8395f).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object m8395f = m8395f(str);
        return (m8395f == null || !(m8395f instanceof String)) ? str2 : (String) m8395f;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object m8395f = m8395f(str);
        Set<String> c0068b = m8395f instanceof Set ? (Set) m8395f : new C0068b<>();
        return c0068b.size() > 0 ? c0068b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f847b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f847b.remove(onSharedPreferenceChangeListener);
    }
}
