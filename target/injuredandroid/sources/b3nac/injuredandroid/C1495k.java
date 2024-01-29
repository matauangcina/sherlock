package b3nac.injuredandroid;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
/* renamed from: b3nac.injuredandroid.k */
/* loaded from: classes.dex */
public class C1495k {

    /* renamed from: a */
    private static final byte[] f4527a = C1491h.m4068b();

    /* renamed from: b */
    private static final byte[] f4528b = C1491h.m4069a();

    /* renamed from: a */
    public static String m4061a(String str) {
        if (m4059c(str)) {
            try {
                SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(f4527a));
                byte[] decode = Base64.decode(str, 0);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(2, generateSecret);
                return new String(cipher.doFinal(decode));
            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Not a string!");
        }
        return str;
    }

    /* renamed from: b */
    public static String m4060b(String str) {
        if (m4059c(str)) {
            try {
                SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(f4528b));
                byte[] decode = Base64.decode(str, 0);
                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(2, generateSecret);
                return new String(cipher.doFinal(decode));
            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Not a string!");
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m4059c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Base64.decode(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
