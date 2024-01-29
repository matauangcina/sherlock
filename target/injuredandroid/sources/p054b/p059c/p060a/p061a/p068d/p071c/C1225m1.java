package p054b.p059c.p060a.p061a.p068d.p071c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.C2141i0;
import java.util.List;
/* renamed from: b.c.a.a.d.c.m1 */
/* loaded from: classes.dex */
public final class C1225m1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1225m1> CREATOR = new C1228n1();

    /* renamed from: f */
    private String f3966f;

    /* renamed from: g */
    private String f3967g;

    /* renamed from: h */
    private boolean f3968h;

    /* renamed from: i */
    private String f3969i;

    /* renamed from: j */
    private String f3970j;

    /* renamed from: k */
    private C1255w1 f3971k;

    /* renamed from: l */
    private String f3972l;

    /* renamed from: m */
    private String f3973m;

    /* renamed from: n */
    private long f3974n;

    /* renamed from: o */
    private long f3975o;

    /* renamed from: p */
    private boolean f3976p;

    /* renamed from: q */
    private C2141i0 f3977q;

    /* renamed from: r */
    private List<C1243s1> f3978r;

    public C1225m1() {
        this.f3971k = new C1255w1();
    }

    public C1225m1(String str, String str2, boolean z, String str3, String str4, C1255w1 c1255w1, String str5, String str6, long j, long j2, boolean z2, C2141i0 c2141i0, List<C1243s1> list) {
        this.f3966f = str;
        this.f3967g = str2;
        this.f3968h = z;
        this.f3969i = str3;
        this.f3970j = str4;
        this.f3971k = c1255w1 == null ? new C1255w1() : C1255w1.m4643b(c1255w1);
        this.f3972l = str5;
        this.f3973m = str6;
        this.f3974n = j;
        this.f3975o = j2;
        this.f3976p = z2;
        this.f3977q = c2141i0;
        this.f3978r = list == null ? AbstractC1253w.m4647l() : list;
    }

    /* renamed from: b */
    public final String m4692b() {
        return this.f3967g;
    }

    /* renamed from: c */
    public final boolean m4691c() {
        return this.f3968h;
    }

    /* renamed from: h */
    public final String m4690h() {
        return this.f3966f;
    }

    /* renamed from: j */
    public final String m4689j() {
        return this.f3969i;
    }

    /* renamed from: k */
    public final Uri m4688k() {
        if (TextUtils.isEmpty(this.f3970j)) {
            return null;
        }
        return Uri.parse(this.f3970j);
    }

    /* renamed from: n */
    public final String m4687n() {
        return this.f3973m;
    }

    /* renamed from: o */
    public final long m4686o() {
        return this.f3974n;
    }

    /* renamed from: p */
    public final long m4685p() {
        return this.f3975o;
    }

    /* renamed from: q */
    public final boolean m4684q() {
        return this.f3976p;
    }

    /* renamed from: r */
    public final List<C1249u1> m4683r() {
        return this.f3971k.m4642c();
    }

    /* renamed from: t */
    public final C2141i0 m4682t() {
        return this.f3977q;
    }

    /* renamed from: v */
    public final List<C1243s1> m4681v() {
        return this.f3978r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 2, this.f3966f, false);
        C1687c.m3587k(parcel, 3, this.f3967g, false);
        C1687c.m3595c(parcel, 4, this.f3968h);
        C1687c.m3587k(parcel, 5, this.f3969i, false);
        C1687c.m3587k(parcel, 6, this.f3970j, false);
        C1687c.m3588j(parcel, 7, this.f3971k, i, false);
        C1687c.m3587k(parcel, 8, this.f3972l, false);
        C1687c.m3587k(parcel, 9, this.f3973m, false);
        C1687c.m3590h(parcel, 10, this.f3974n);
        C1687c.m3590h(parcel, 11, this.f3975o);
        C1687c.m3595c(parcel, 12, this.f3976p);
        C1687c.m3588j(parcel, 13, this.f3977q, i, false);
        C1687c.m3584n(parcel, 14, this.f3978r, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
