package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.ActivityC0797d;
import com.google.android.gms.common.internal.C1679r;
/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes.dex */
public class C1586f {

    /* renamed from: a */
    private final Object f4689a;

    public C1586f(Activity activity) {
        C1679r.m3630i(activity, "Activity must not be null");
        this.f4689a = activity;
    }

    /* renamed from: a */
    public Activity m3831a() {
        return (Activity) this.f4689a;
    }

    /* renamed from: b */
    public ActivityC0797d m3830b() {
        return (ActivityC0797d) this.f4689a;
    }

    /* renamed from: c */
    public boolean m3829c() {
        return this.f4689a instanceof ActivityC0797d;
    }

    /* renamed from: d */
    public final boolean m3828d() {
        return this.f4689a instanceof Activity;
    }
}
