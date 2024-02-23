package okhttp3;

import androidx.appcompat.app.AppCompatDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class CipherSuite {
    private static final Map<String, CipherSuite> INSTANCES;
    static final Comparator<String> ORDER_BY_NAME;
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final CipherSuite TLS_FALLBACK_SCSV;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    final String javaName;

    static {
        Comparator<String> comparator = new Comparator<String>() { // from class: okhttp3.CipherSuite.1
            @Override // java.util.Comparator
            public int compare(String a, String b) {
                int limit = Math.min(a.length(), b.length());
                for (int i = 4; i < limit; i++) {
                    char charA = a.charAt(i);
                    char charB = b.charAt(i);
                    if (charA != charB) {
                        return charA < charB ? -1 : 1;
                    }
                }
                int lengthA = a.length();
                int lengthB = b.length();
                if (lengthA != lengthB) {
                    return lengthA < lengthB ? -1 : 1;
                }
                return 0;
            }
        };
        ORDER_BY_NAME = comparator;
        INSTANCES = new TreeMap(comparator);
        TLS_RSA_WITH_NULL_MD5 = m7of("SSL_RSA_WITH_NULL_MD5", 1);
        TLS_RSA_WITH_NULL_SHA = m7of("SSL_RSA_WITH_NULL_SHA", 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = m7of("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        TLS_RSA_WITH_RC4_128_MD5 = m7of("SSL_RSA_WITH_RC4_128_MD5", 4);
        TLS_RSA_WITH_RC4_128_SHA = m7of("SSL_RSA_WITH_RC4_128_SHA", 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = m7of("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        TLS_RSA_WITH_DES_CBC_SHA = m7of("SSL_RSA_WITH_DES_CBC_SHA", 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = m7of("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = m7of("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = m7of("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = m7of("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = m7of("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = m7of("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = m7of("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = m7of("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = m7of("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = m7of("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = m7of("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = m7of("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        TLS_KRB5_WITH_DES_CBC_SHA = m7of("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = m7of("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        TLS_KRB5_WITH_RC4_128_SHA = m7of("TLS_KRB5_WITH_RC4_128_SHA", 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = m7of("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = m7of("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        TLS_KRB5_WITH_RC4_128_MD5 = m7of("TLS_KRB5_WITH_RC4_128_MD5", 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = m7of("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = m7of("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = m7of("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = m7of("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = m7of("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = m7of("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = m7of("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = m7of("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = m7of("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = m7of("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = m7of("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = m7of("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        TLS_RSA_WITH_NULL_SHA256 = m7of("TLS_RSA_WITH_NULL_SHA256", 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = m7of("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = m7of("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = m7of("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = m7of("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = m7of("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = m7of("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = m7of("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = m7of("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = m7of("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = m7of("TLS_DH_anon_WITH_AES_128_CBC_SHA256", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = m7of("TLS_DH_anon_WITH_AES_256_CBC_SHA256", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = m7of("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = m7of("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = m7of("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        TLS_PSK_WITH_RC4_128_SHA = m7of("TLS_PSK_WITH_RC4_128_SHA", 138);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = m7of("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        TLS_PSK_WITH_AES_128_CBC_SHA = m7of("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = m7of("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        TLS_RSA_WITH_SEED_CBC_SHA = m7of("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = m7of("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = m7of("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = m7of("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = m7of("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = m7of("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = m7of("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = m7of("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = m7of("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = m7of("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        TLS_FALLBACK_SCSV = m7of("TLS_FALLBACK_SCSV", 22016);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = m7of("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = m7of("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = m7of("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = m7of("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = m7of("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = m7of("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = m7of("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = m7of("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = m7of("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = m7of("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        TLS_ECDH_RSA_WITH_NULL_SHA = m7of("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = m7of("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = m7of("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = m7of("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = m7of("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        TLS_ECDHE_RSA_WITH_NULL_SHA = m7of("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = m7of("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = m7of("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = m7of("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = m7of("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        TLS_ECDH_anon_WITH_NULL_SHA = m7of("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        TLS_ECDH_anon_WITH_RC4_128_SHA = m7of("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = m7of("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = m7of("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = m7of("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = m7of("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = m7of("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = m7of("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = m7of("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = m7of("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = m7of("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = m7of("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = m7of("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = m7of("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = m7of("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = m7of("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = m7of("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = m7of("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = m7of("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = m7of("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = m7of("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = m7of("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = m7of("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = m7of("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = m7of("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    }

    public static synchronized CipherSuite forJavaName(String javaName) {
        CipherSuite result;
        synchronized (CipherSuite.class) {
            Map<String, CipherSuite> map = INSTANCES;
            result = map.get(javaName);
            if (result == null) {
                result = new CipherSuite(javaName);
                map.put(javaName, result);
            }
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<CipherSuite> forJavaNames(String... cipherSuites) {
        List<CipherSuite> result = new ArrayList<>(cipherSuites.length);
        for (String cipherSuite : cipherSuites) {
            result.add(forJavaName(cipherSuite));
        }
        return Collections.unmodifiableList(result);
    }

    private CipherSuite(String javaName) {
        if (javaName == null) {
            throw new NullPointerException();
        }
        this.javaName = javaName;
    }

    /* renamed from: of */
    private static CipherSuite m7of(String javaName, int value) {
        return forJavaName(javaName);
    }

    public String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }
}
