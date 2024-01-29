package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
public final class C1763a implements Parcelable {
    public static final Parcelable.Creator<C1763a> CREATOR = new C1764a();

    /* renamed from: f */
    private final C1795l f5178f;

    /* renamed from: g */
    private final C1795l f5179g;

    /* renamed from: h */
    private final C1795l f5180h;

    /* renamed from: i */
    private final InterfaceC1766c f5181i;

    /* renamed from: j */
    private final int f5182j;

    /* renamed from: k */
    private final int f5183k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    public static class C1764a implements Parcelable.Creator<C1763a> {
        C1764a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1763a createFromParcel(Parcel parcel) {
            return new C1763a((C1795l) parcel.readParcelable(C1795l.class.getClassLoader()), (C1795l) parcel.readParcelable(C1795l.class.getClassLoader()), (C1795l) parcel.readParcelable(C1795l.class.getClassLoader()), (InterfaceC1766c) parcel.readParcelable(InterfaceC1766c.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1763a[] newArray(int i) {
            return new C1763a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: classes.dex */
    public static final class C1765b {

        /* renamed from: e */
        static final long f5184e = C1805r.m2972a(C1795l.m2999x(1900, 0).f5275l);

        /* renamed from: f */
        static final long f5185f = C1805r.m2972a(C1795l.m2999x(2100, 11).f5275l);

        /* renamed from: a */
        private long f5186a;

        /* renamed from: b */
        private long f5187b;

        /* renamed from: c */
        private Long f5188c;

        /* renamed from: d */
        private InterfaceC1766c f5189d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1765b(C1763a c1763a) {
            this.f5186a = f5184e;
            this.f5187b = f5185f;
            this.f5189d = C1771f.m3065a(Long.MIN_VALUE);
            this.f5186a = c1763a.f5178f.f5275l;
            this.f5187b = c1763a.f5179g.f5275l;
            this.f5188c = Long.valueOf(c1763a.f5180h.f5275l);
            this.f5189d = c1763a.f5181i;
        }

        /* renamed from: a */
        public C1763a m3083a() {
            if (this.f5188c == null) {
                long m3015S1 = C1787i.m3015S1();
                if (this.f5186a > m3015S1 || m3015S1 > this.f5187b) {
                    m3015S1 = this.f5186a;
                }
                this.f5188c = Long.valueOf(m3015S1);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f5189d);
            return new C1763a(C1795l.m2998y(this.f5186a), C1795l.m2998y(this.f5187b), C1795l.m2998y(this.f5188c.longValue()), (InterfaceC1766c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        /* renamed from: b */
        public C1765b m3082b(long j) {
            this.f5188c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1766c extends Parcelable {
        /* renamed from: g */
        boolean mo3064g(long j);
    }

    private C1763a(C1795l c1795l, C1795l c1795l2, C1795l c1795l3, InterfaceC1766c interfaceC1766c) {
        this.f5178f = c1795l;
        this.f5179g = c1795l2;
        this.f5180h = c1795l3;
        this.f5181i = interfaceC1766c;
        if (c1795l.compareTo(c1795l3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c1795l3.compareTo(c1795l2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f5183k = c1795l.m3002E(c1795l2) + 1;
        this.f5182j = (c1795l2.f5272i - c1795l.f5272i) + 1;
    }

    /* synthetic */ C1763a(C1795l c1795l, C1795l c1795l2, C1795l c1795l3, InterfaceC1766c interfaceC1766c, C1764a c1764a) {
        this(c1795l, c1795l2, c1795l3, interfaceC1766c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1763a) {
            C1763a c1763a = (C1763a) obj;
            return this.f5178f.equals(c1763a.f5178f) && this.f5179g.equals(c1763a.f5179g) && this.f5180h.equals(c1763a.f5180h) && this.f5181i.equals(c1763a.f5181i);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5178f, this.f5179g, this.f5180h, this.f5181i});
    }

    /* renamed from: j */
    public InterfaceC1766c m3091j() {
        return this.f5181i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C1795l m3090k() {
        return this.f5179g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m3089n() {
        return this.f5183k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C1795l m3088o() {
        return this.f5180h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C1795l m3087p() {
        return this.f5178f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m3086q() {
        return this.f5182j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5178f, 0);
        parcel.writeParcelable(this.f5179g, 0);
        parcel.writeParcelable(this.f5180h, 0);
        parcel.writeParcelable(this.f5181i, 0);
    }
}
