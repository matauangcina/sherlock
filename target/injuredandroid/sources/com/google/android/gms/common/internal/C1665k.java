package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C1548a;
import p054b.p059c.p060a.p061a.p063b.C1149e;
/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes.dex */
public class C1665k {

    /* renamed from: a */
    private final SparseIntArray f4836a = new SparseIntArray();

    /* renamed from: b */
    private C1149e f4837b;

    public C1665k(C1149e c1149e) {
        C1679r.m3631h(c1149e);
        this.f4837b = c1149e;
    }

    /* renamed from: a */
    public void m3655a() {
        this.f4836a.clear();
    }

    /* renamed from: b */
    public int m3654b(Context context, C1548a.InterfaceC1556f interfaceC1556f) {
        C1679r.m3631h(context);
        C1679r.m3631h(interfaceC1556f);
        int i = 0;
        if (interfaceC1556f.mo2215j()) {
            int mo2214k = interfaceC1556f.mo2214k();
            int i2 = this.f4836a.get(mo2214k, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.f4836a.size()) {
                    i = i2;
                    break;
                }
                int keyAt = this.f4836a.keyAt(i3);
                if (keyAt > mo2214k && this.f4836a.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            if (i == -1) {
                i = this.f4837b.mo4785g(context, mo2214k);
            }
            this.f4836a.put(mo2214k, i);
            return i;
        }
        return 0;
    }
}
