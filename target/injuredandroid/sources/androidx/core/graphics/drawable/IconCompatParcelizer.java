package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC1071a;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1071a abstractC1071a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2678a = abstractC1071a.m5030p(iconCompat.f2678a, 1);
        iconCompat.f2680c = abstractC1071a.m5033j(iconCompat.f2680c, 2);
        iconCompat.f2681d = abstractC1071a.m5029r(iconCompat.f2681d, 3);
        iconCompat.f2682e = abstractC1071a.m5030p(iconCompat.f2682e, 4);
        iconCompat.f2683f = abstractC1071a.m5030p(iconCompat.f2683f, 5);
        iconCompat.f2684g = (ColorStateList) abstractC1071a.m5029r(iconCompat.f2684g, 6);
        iconCompat.f2686i = abstractC1071a.m5028t(iconCompat.f2686i, 7);
        iconCompat.f2687j = abstractC1071a.m5028t(iconCompat.f2687j, 8);
        iconCompat.m6766l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1071a abstractC1071a) {
        abstractC1071a.m5025x(true, true);
        iconCompat.m6765m(abstractC1071a.m5035f());
        int i = iconCompat.f2678a;
        if (-1 != i) {
            abstractC1071a.m5045F(i, 1);
        }
        byte[] bArr = iconCompat.f2680c;
        if (bArr != null) {
            abstractC1071a.m5047B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2681d;
        if (parcelable != null) {
            abstractC1071a.m5044H(parcelable, 3);
        }
        int i2 = iconCompat.f2682e;
        if (i2 != 0) {
            abstractC1071a.m5045F(i2, 4);
        }
        int i3 = iconCompat.f2683f;
        if (i3 != 0) {
            abstractC1071a.m5045F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2684g;
        if (colorStateList != null) {
            abstractC1071a.m5044H(colorStateList, 6);
        }
        String str = iconCompat.f2686i;
        if (str != null) {
            abstractC1071a.m5043J(str, 7);
        }
        String str2 = iconCompat.f2687j;
        if (str2 != null) {
            abstractC1071a.m5043J(str2, 8);
        }
    }
}
