package p000a.p019g.p026i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
/* renamed from: a.g.i.f */
/* loaded from: classes.dex */
public final class C0185f {

    /* renamed from: a */
    private static final Locale f639a = new Locale("", "");

    /* renamed from: a */
    private static int m8878a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m8877b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f639a)) {
            return 0;
        }
        String m8896c = C0173b.m8896c(locale);
        return m8896c == null ? m8878a(locale) : (m8896c.equalsIgnoreCase("Arab") || m8896c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
