package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.AbstractC2190n;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.AbstractC2207v0;
import com.google.firebase.auth.C2141i0;
import com.google.firebase.auth.C2194p;
import com.google.firebase.auth.InterfaceC2192o;
import com.google.firebase.auth.InterfaceC2210y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1253w;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.auth.internal.d0 */
/* loaded from: classes.dex */
public class C2149d0 extends AbstractC2190n {
    public static final Parcelable.Creator<C2149d0> CREATOR = new C2153f0();

    /* renamed from: f */
    private C1237q1 f5894f;

    /* renamed from: g */
    private C2181z f5895g;

    /* renamed from: h */
    private String f5896h;

    /* renamed from: i */
    private String f5897i;

    /* renamed from: j */
    private List<C2181z> f5898j;

    /* renamed from: k */
    private List<String> f5899k;

    /* renamed from: l */
    private String f5900l;

    /* renamed from: m */
    private Boolean f5901m;

    /* renamed from: n */
    private C2151e0 f5902n;

    /* renamed from: o */
    private boolean f5903o;

    /* renamed from: p */
    private C2141i0 f5904p;

    /* renamed from: q */
    private C2164l f5905q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2149d0(C1237q1 c1237q1, C2181z c2181z, String str, String str2, List<C2181z> list, List<String> list2, String str3, Boolean bool, C2151e0 c2151e0, boolean z, C2141i0 c2141i0, C2164l c2164l) {
        this.f5894f = c1237q1;
        this.f5895g = c2181z;
        this.f5896h = str;
        this.f5897i = str2;
        this.f5898j = list;
        this.f5899k = list2;
        this.f5900l = str3;
        this.f5901m = bool;
        this.f5902n = c2151e0;
        this.f5903o = z;
        this.f5904p = c2141i0;
        this.f5905q = c2164l;
    }

    public C2149d0(C1415c c1415c, List<? extends InterfaceC2210y> list) {
        C1679r.m3631h(c1415c);
        this.f5896h = c1415c.m4197m();
        this.f5897i = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f5900l = "2";
        mo2299n(list);
    }

    /* renamed from: A */
    public InterfaceC2192o m2375A() {
        return this.f5902n;
    }

    /* renamed from: B */
    public final C2149d0 m2374B(String str) {
        this.f5900l = str;
        return this;
    }

    /* renamed from: C */
    public final void m2373C(C2151e0 c2151e0) {
        this.f5902n = c2151e0;
    }

    /* renamed from: D */
    public final void m2372D(C2141i0 c2141i0) {
        this.f5904p = c2141i0;
    }

    /* renamed from: E */
    public final void m2371E(boolean z) {
        this.f5903o = z;
    }

    /* renamed from: F */
    public final List<C2181z> m2370F() {
        return this.f5898j;
    }

    /* renamed from: G */
    public final boolean m2369G() {
        return this.f5903o;
    }

    /* renamed from: H */
    public final C2141i0 m2368H() {
        return this.f5904p;
    }

    /* renamed from: I */
    public final List<AbstractC2205u0> m2367I() {
        C2164l c2164l = this.f5905q;
        return c2164l != null ? c2164l.m2351c() : AbstractC1253w.m4647l();
    }

    @Override // com.google.firebase.auth.InterfaceC2210y
    /* renamed from: a */
    public String mo2267a() {
        return this.f5895g.mo2267a();
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: b */
    public List<? extends InterfaceC2210y> mo2304b() {
        return this.f5898j;
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: c */
    public String mo2303c() {
        return this.f5895g.m2312j();
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: h */
    public boolean mo2302h() {
        C2194p m2353a;
        Boolean bool = this.f5901m;
        if (bool == null || bool.booleanValue()) {
            C1237q1 c1237q1 = this.f5894f;
            String str = "";
            if (c1237q1 != null && (m2353a = C2162k.m2353a(c1237q1.m4672k())) != null) {
                str = m2353a.m2285b();
            }
            boolean z = true;
            if (mo2304b().size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.f5901m = Boolean.valueOf(z);
        }
        return this.f5901m.booleanValue();
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: n */
    public final AbstractC2190n mo2299n(List<? extends InterfaceC2210y> list) {
        C1679r.m3631h(list);
        this.f5898j = new ArrayList(list.size());
        this.f5899k = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2210y interfaceC2210y = list.get(i);
            if (interfaceC2210y.mo2267a().equals("firebase")) {
                this.f5895g = (C2181z) interfaceC2210y;
            } else {
                this.f5899k.add(interfaceC2210y.mo2267a());
            }
            this.f5898j.add((C2181z) interfaceC2210y);
        }
        if (this.f5895g == null) {
            this.f5895g = this.f5898j.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: o */
    public final List<String> mo2298o() {
        return this.f5899k;
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: p */
    public final void mo2297p(C1237q1 c1237q1) {
        C1679r.m3631h(c1237q1);
        this.f5894f = c1237q1;
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: q */
    public final /* synthetic */ AbstractC2190n mo2296q() {
        this.f5901m = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: r */
    public final void mo2295r(List<AbstractC2205u0> list) {
        this.f5905q = C2164l.m2352b(list);
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: t */
    public final C1415c mo2294t() {
        return C1415c.m4198l(this.f5896h);
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: v */
    public final String mo2293v() {
        Map map;
        C1237q1 c1237q1 = this.f5894f;
        if (c1237q1 == null || c1237q1.m4672k() == null || (map = (Map) C2162k.m2353a(this.f5894f.m4672k()).m2286a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: w */
    public final C1237q1 mo2292w() {
        return this.f5894f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3588j(parcel, 1, mo2292w(), i, false);
        C1687c.m3588j(parcel, 2, this.f5895g, i, false);
        C1687c.m3587k(parcel, 3, this.f5896h, false);
        C1687c.m3587k(parcel, 4, this.f5897i, false);
        C1687c.m3584n(parcel, 5, this.f5898j, false);
        C1687c.m3586l(parcel, 6, mo2298o(), false);
        C1687c.m3587k(parcel, 7, this.f5900l, false);
        C1687c.m3594d(parcel, 8, Boolean.valueOf(mo2302h()), false);
        C1687c.m3588j(parcel, 9, m2375A(), i, false);
        C1687c.m3595c(parcel, 10, this.f5903o);
        C1687c.m3588j(parcel, 11, this.f5904p, i, false);
        C1687c.m3588j(parcel, 12, this.f5905q, i, false);
        C1687c.m3596b(parcel, m3597a);
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: x */
    public final String mo2291x() {
        return this.f5894f.m4669p();
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: y */
    public final String mo2290y() {
        return mo2292w().m4672k();
    }

    @Override // com.google.firebase.auth.AbstractC2190n
    /* renamed from: z */
    public final /* synthetic */ AbstractC2207v0 mo2289z() {
        return new C2155g0(this);
    }
}
