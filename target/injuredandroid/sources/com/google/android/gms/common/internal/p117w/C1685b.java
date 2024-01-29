package com.google.android.gms.common.internal.p117w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.common.internal.w.b */
/* loaded from: classes.dex */
public class C1685b {

    /* renamed from: com.google.android.gms.common.internal.w.b$a */
    /* loaded from: classes.dex */
    public static class C1686a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C1686a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.p117w.C1685b.C1686a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static Bundle m3617a(Parcel parcel, int i) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m3602p);
        return readBundle;
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m3616b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m3602p);
        return createFromParcel;
    }

    /* renamed from: c */
    public static String m3615c(Parcel parcel, int i) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m3602p);
        return readString;
    }

    /* renamed from: d */
    public static ArrayList<String> m3614d(Parcel parcel, int i) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m3602p);
        return createStringArrayList;
    }

    /* renamed from: e */
    public static <T> T[] m3613e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m3602p);
        return tArr;
    }

    /* renamed from: f */
    public static <T> ArrayList<T> m3612f(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m3602p);
        return createTypedArrayList;
    }

    /* renamed from: g */
    public static void m3611g(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new C1686a(sb.toString(), parcel);
    }

    /* renamed from: h */
    public static int m3610h(int i) {
        return i & 65535;
    }

    /* renamed from: i */
    public static boolean m3609i(Parcel parcel, int i) {
        m3599s(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: j */
    public static Boolean m3608j(Parcel parcel, int i) {
        int m3602p = m3602p(parcel, i);
        if (m3602p == 0) {
            return null;
        }
        m3598t(parcel, i, m3602p, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: k */
    public static int m3607k(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: l */
    public static IBinder m3606l(Parcel parcel, int i) {
        int m3602p = m3602p(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m3602p == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m3602p);
        return readStrongBinder;
    }

    /* renamed from: m */
    public static int m3605m(Parcel parcel, int i) {
        m3599s(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: n */
    public static long m3604n(Parcel parcel, int i) {
        m3599s(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: o */
    public static Long m3603o(Parcel parcel, int i) {
        int m3602p = m3602p(parcel, i);
        if (m3602p == 0) {
            return null;
        }
        m3598t(parcel, i, m3602p, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: p */
    public static int m3602p(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: q */
    public static void m3601q(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m3602p(parcel, i));
    }

    /* renamed from: r */
    public static int m3600r(Parcel parcel) {
        int m3607k = m3607k(parcel);
        int m3602p = m3602p(parcel, m3607k);
        int dataPosition = parcel.dataPosition();
        if (m3610h(m3607k) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m3607k));
            throw new C1686a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = m3602p + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new C1686a(sb.toString(), parcel);
        }
        return i;
    }

    /* renamed from: s */
    private static void m3599s(Parcel parcel, int i, int i2) {
        int m3602p = m3602p(parcel, i);
        if (m3602p == i2) {
            return;
        }
        String hexString = Integer.toHexString(m3602p);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(m3602p);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C1686a(sb.toString(), parcel);
    }

    /* renamed from: t */
    private static void m3598t(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C1686a(sb.toString(), parcel);
    }
}
