package com.google.android.gms.common.internal.p117w;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.util.C1694b;
/* renamed from: com.google.android.gms.common.internal.w.e */
/* loaded from: classes.dex */
public final class C1689e {
    /* renamed from: a */
    public static <T extends InterfaceC1688d> T m3579a(byte[] bArr, Parcelable.Creator<T> creator) {
        C1679r.m3631h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: b */
    public static <T extends InterfaceC1688d> T m3578b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m3579a(byteArrayExtra, creator);
    }

    /* renamed from: c */
    public static <T extends InterfaceC1688d> T m3577c(String str, Parcelable.Creator<T> creator) {
        return (T) m3579a(C1694b.m3568a(str), creator);
    }

    /* renamed from: d */
    public static <T extends InterfaceC1688d> byte[] m3576d(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: e */
    public static <T extends InterfaceC1688d> void m3575e(T t, Intent intent, String str) {
        intent.putExtra(str, m3576d(t));
    }

    /* renamed from: f */
    public static <T extends InterfaceC1688d> String m3574f(T t) {
        return C1694b.m3566c(m3576d(t));
    }
}
