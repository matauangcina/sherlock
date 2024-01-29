package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.android.gms.common.util.C1698f;
import com.google.android.gms.common.util.InterfaceC1696d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC1684a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1547b();

    /* renamed from: s */
    private static InterfaceC1696d f4576s = C1698f.m3560b();

    /* renamed from: f */
    private final int f4577f;

    /* renamed from: g */
    private String f4578g;

    /* renamed from: h */
    private String f4579h;

    /* renamed from: i */
    private String f4580i;

    /* renamed from: j */
    private String f4581j;

    /* renamed from: k */
    private Uri f4582k;

    /* renamed from: l */
    private String f4583l;

    /* renamed from: m */
    private long f4584m;

    /* renamed from: n */
    private String f4585n;

    /* renamed from: o */
    private List<Scope> f4586o;

    /* renamed from: p */
    private String f4587p;

    /* renamed from: q */
    private String f4588q;

    /* renamed from: r */
    private Set<Scope> f4589r = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f4577f = i;
        this.f4578g = str;
        this.f4579h = str2;
        this.f4580i = str3;
        this.f4581j = str4;
        this.f4582k = uri;
        this.f4583l = str5;
        this.f4584m = j;
        this.f4585n = str6;
        this.f4586o = list;
        this.f4587p = str7;
        this.f4588q = str8;
    }

    /* renamed from: t */
    public static GoogleSignInAccount m3979t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount m3978v = m3978v(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m3978v.f4583l = jSONObject.optString("serverAuthCode", null);
        return m3978v;
    }

    /* renamed from: v */
    private static GoogleSignInAccount m3978v(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f4576s.mo3561a() / 1000) : l).longValue();
        C1679r.m3633f(str7);
        C1679r.m3631h(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    /* renamed from: b */
    public Account m3989b() {
        if (this.f4580i == null) {
            return null;
        }
        return new Account(this.f4580i, "com.google");
    }

    /* renamed from: c */
    public String m3988c() {
        return this.f4581j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f4585n.equals(this.f4585n) && googleSignInAccount.m3981q().equals(m3981q());
        }
        return false;
    }

    /* renamed from: h */
    public String m3987h() {
        return this.f4580i;
    }

    public int hashCode() {
        return ((this.f4585n.hashCode() + 527) * 31) + m3981q().hashCode();
    }

    /* renamed from: j */
    public String m3986j() {
        return this.f4588q;
    }

    /* renamed from: k */
    public String m3985k() {
        return this.f4587p;
    }

    /* renamed from: n */
    public String m3984n() {
        return this.f4578g;
    }

    /* renamed from: o */
    public String m3983o() {
        return this.f4579h;
    }

    /* renamed from: p */
    public Uri m3982p() {
        return this.f4582k;
    }

    /* renamed from: q */
    public Set<Scope> m3981q() {
        HashSet hashSet = new HashSet(this.f4586o);
        hashSet.addAll(this.f4589r);
        return hashSet;
    }

    /* renamed from: r */
    public String m3980r() {
        return this.f4583l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4577f);
        C1687c.m3587k(parcel, 2, m3984n(), false);
        C1687c.m3587k(parcel, 3, m3983o(), false);
        C1687c.m3587k(parcel, 4, m3987h(), false);
        C1687c.m3587k(parcel, 5, m3988c(), false);
        C1687c.m3588j(parcel, 6, m3982p(), i, false);
        C1687c.m3587k(parcel, 7, m3980r(), false);
        C1687c.m3590h(parcel, 8, this.f4584m);
        C1687c.m3587k(parcel, 9, this.f4585n, false);
        C1687c.m3584n(parcel, 10, this.f4586o, false);
        C1687c.m3587k(parcel, 11, m3985k(), false);
        C1687c.m3587k(parcel, 12, m3986j(), false);
        C1687c.m3596b(parcel, m3597a);
    }
}
