package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C1795l implements Comparable<C1795l>, Parcelable {
    public static final Parcelable.Creator<C1795l> CREATOR = new C1796a();

    /* renamed from: f */
    private final Calendar f5269f;

    /* renamed from: g */
    private final String f5270g;

    /* renamed from: h */
    final int f5271h;

    /* renamed from: i */
    final int f5272i;

    /* renamed from: j */
    final int f5273j;

    /* renamed from: k */
    final int f5274k;

    /* renamed from: l */
    final long f5275l;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* loaded from: classes.dex */
    static class C1796a implements Parcelable.Creator<C1795l> {
        C1796a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1795l createFromParcel(Parcel parcel) {
            return C1795l.m2999x(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1795l[] newArray(int i) {
            return new C1795l[i];
        }
    }

    private C1795l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m2969d = C1805r.m2969d(calendar);
        this.f5269f = m2969d;
        this.f5271h = m2969d.get(2);
        this.f5272i = this.f5269f.get(1);
        this.f5273j = this.f5269f.getMaximum(7);
        this.f5274k = this.f5269f.getActualMaximum(5);
        this.f5270g = C1805r.m2959n().format(this.f5269f.getTime());
        this.f5275l = this.f5269f.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static C1795l m3001F() {
        return new C1795l(C1805r.m2964i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static C1795l m2999x(int i, int i2) {
        Calendar m2962k = C1805r.m2962k();
        m2962k.set(1, i);
        m2962k.set(2, i2);
        return new C1795l(m2962k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static C1795l m2998y(long j) {
        Calendar m2962k = C1805r.m2962k();
        m2962k.setTimeInMillis(j);
        return new C1795l(m2962k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public long m3006A(int i) {
        Calendar m2969d = C1805r.m2969d(this.f5269f);
        m2969d.set(5, i);
        return m2969d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public String m3005B() {
        return this.f5270g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public long m3004C() {
        return this.f5269f.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public C1795l m3003D(int i) {
        Calendar m2969d = C1805r.m2969d(this.f5269f);
        m2969d.add(2, i);
        return new C1795l(m2969d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public int m3002E(C1795l c1795l) {
        if (this.f5269f instanceof GregorianCalendar) {
            return ((c1795l.f5272i - this.f5272i) * 12) + (c1795l.f5271h - this.f5271h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1795l) {
            C1795l c1795l = (C1795l) obj;
            return this.f5271h == c1795l.f5271h && this.f5272i == c1795l.f5272i;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5271h), Integer.valueOf(this.f5272i)});
    }

    @Override // java.lang.Comparable
    /* renamed from: w */
    public int compareTo(C1795l c1795l) {
        return this.f5269f.compareTo(c1795l.f5269f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5272i);
        parcel.writeInt(this.f5271h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m2997z() {
        int firstDayOfWeek = this.f5269f.get(7) - this.f5269f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f5273j : firstDayOfWeek;
    }
}
