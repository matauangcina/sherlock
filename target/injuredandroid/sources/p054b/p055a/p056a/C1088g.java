package p054b.p055a.p056a;

import android.text.TextUtils;
/* renamed from: b.a.a.g */
/* loaded from: classes.dex */
public final class C1088g {

    /* renamed from: a */
    private final String f3745a;

    /* renamed from: b */
    private final String f3746b;

    public C1088g(String str, String str2) {
        this.f3745a = str;
        this.f3746b = str2;
    }

    /* renamed from: a */
    public final String m4992a() {
        return this.f3745a;
    }

    /* renamed from: b */
    public final String m4991b() {
        return this.f3746b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1088g.class != obj.getClass()) {
            return false;
        }
        C1088g c1088g = (C1088g) obj;
        return TextUtils.equals(this.f3745a, c1088g.f3745a) && TextUtils.equals(this.f3746b, c1088g.f3746b);
    }

    public int hashCode() {
        return (this.f3745a.hashCode() * 31) + this.f3746b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f3745a + ",value=" + this.f3746b + "]";
    }
}
