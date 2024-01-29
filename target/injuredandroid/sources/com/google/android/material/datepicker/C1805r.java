package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
class C1805r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m2972a(long j) {
        Calendar m2962k = m2962k();
        m2962k.setTimeInMillis(j);
        return m2969d(m2962k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static DateFormat m2971b(Locale locale) {
        return m2970c("MMMEd", locale);
    }

    /* renamed from: c */
    private static DateFormat m2970c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m2963j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m2969d(Calendar calendar) {
        Calendar m2961l = m2961l(calendar);
        Calendar m2962k = m2962k();
        m2962k.set(m2961l.get(1), m2961l.get(2), m2961l.get(5));
        return m2962k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m2968e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m2965h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m2967f(Locale locale) {
        return m2968e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m2966g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m2965h());
        return simpleDateFormat;
    }

    /* renamed from: h */
    private static TimeZone m2965h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m2964i() {
        return m2969d(Calendar.getInstance());
    }

    /* renamed from: j */
    private static android.icu.util.TimeZone m2963j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m2962k() {
        return m2961l(null);
    }

    /* renamed from: l */
    static Calendar m2961l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m2965h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static DateFormat m2960m(Locale locale) {
        return m2970c("yMMMEd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static SimpleDateFormat m2959n() {
        return m2958o(Locale.getDefault());
    }

    /* renamed from: o */
    private static SimpleDateFormat m2958o(Locale locale) {
        return m2966g("MMMM, yyyy", locale);
    }
}
