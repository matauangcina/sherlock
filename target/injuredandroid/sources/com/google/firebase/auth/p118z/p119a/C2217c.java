package com.google.firebase.auth.p118z.p119a;

import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
import java.util.Map;
/* renamed from: com.google.firebase.auth.z.a.c */
/* loaded from: classes.dex */
final class C2217c implements InterfaceC2229g {

    /* renamed from: a */
    private final int f5983a;

    /* renamed from: b */
    private final int f5984b;

    /* renamed from: c */
    private final Map<String, Integer> f5985c;

    public C2217c(int i, int i2, Map<String, Integer> map) {
        this.f5983a = m2258a() ? 0 : i;
        this.f5984b = i2;
        C1679r.m3631h(map);
        this.f5985c = map;
        m2258a();
    }

    /* renamed from: a */
    private static boolean m2258a() {
        boolean equals = "local".equals(C2240j1.m2235a("firebear.preference"));
        if (equals) {
            Log.e("BiChannelGoogleApi", "Found local preference, will always use local service instance");
        }
        return equals;
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2229g
    /* renamed from: f */
    public final boolean mo2255f(String str) {
        int i = this.f5983a;
        if (i == 0) {
            return true;
        }
        if (this.f5984b <= i) {
            return false;
        }
        Integer num = this.f5985c.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue() > this.f5983a && this.f5984b >= num.intValue();
    }
}
