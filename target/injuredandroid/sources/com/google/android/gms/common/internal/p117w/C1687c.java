package com.google.android.gms.common.internal.p117w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* renamed from: com.google.android.gms.common.internal.w.c */
/* loaded from: classes.dex */
public class C1687c {
    /* renamed from: a */
    public static int m3597a(Parcel parcel) {
        return m3583o(parcel, 20293);
    }

    /* renamed from: b */
    public static void m3596b(Parcel parcel, int i) {
        m3581q(parcel, i);
    }

    /* renamed from: c */
    public static void m3595c(Parcel parcel, int i, boolean z) {
        m3580r(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m3594d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m3580r(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m3580r(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m3593e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        parcel.writeBundle(bundle);
        m3581q(parcel, m3583o);
    }

    /* renamed from: f */
    public static void m3592f(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m3581q(parcel, m3583o);
    }

    /* renamed from: g */
    public static void m3591g(Parcel parcel, int i, int i2) {
        m3580r(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: h */
    public static void m3590h(Parcel parcel, int i, long j) {
        m3580r(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: i */
    public static void m3589i(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m3580r(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m3580r(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m3588j(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m3581q(parcel, m3583o);
    }

    /* renamed from: k */
    public static void m3587k(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        parcel.writeString(str);
        m3581q(parcel, m3583o);
    }

    /* renamed from: l */
    public static void m3586l(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        parcel.writeStringList(list);
        m3581q(parcel, m3583o);
    }

    /* renamed from: m */
    public static <T extends Parcelable> void m3585m(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m3582p(parcel, t, i2);
            }
        }
        m3581q(parcel, m3583o);
    }

    /* renamed from: n */
    public static <T extends Parcelable> void m3584n(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m3580r(parcel, i, 0);
                return;
            }
            return;
        }
        int m3583o = m3583o(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m3582p(parcel, t, 0);
            }
        }
        m3581q(parcel, m3583o);
    }

    /* renamed from: o */
    private static int m3583o(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: p */
    private static <T extends Parcelable> void m3582p(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: q */
    private static void m3581q(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: r */
    private static void m3580r(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
            return;
        }
        parcel.writeInt(i | (-65536));
        parcel.writeInt(i2);
    }
}
