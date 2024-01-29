package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import p054b.p059c.p060a.p061a.p063b.C1153i;
/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes.dex */
public class C1683v {

    /* renamed from: a */
    private final Resources f4857a;

    /* renamed from: b */
    private final String f4858b;

    public C1683v(Context context) {
        C1679r.m3631h(context);
        Resources resources = context.getResources();
        this.f4857a = resources;
        this.f4858b = resources.getResourcePackageName(C1153i.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m3618a(String str) {
        int identifier = this.f4857a.getIdentifier(str, "string", this.f4858b);
        if (identifier == 0) {
            return null;
        }
        return this.f4857a.getString(identifier);
    }
}
