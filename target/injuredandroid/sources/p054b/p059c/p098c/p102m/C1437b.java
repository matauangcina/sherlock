package p054b.p059c.p098c.p102m;

import com.google.android.gms.common.internal.C1677q;
/* renamed from: b.c.c.m.b */
/* loaded from: classes.dex */
public class C1437b {

    /* renamed from: a */
    private String f4372a;

    public C1437b(String str) {
        this.f4372a = str;
    }

    /* renamed from: a */
    public String m4169a() {
        return this.f4372a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1437b) {
            return C1677q.m3642a(this.f4372a, ((C1437b) obj).f4372a);
        }
        return false;
    }

    public int hashCode() {
        return C1677q.m3641b(this.f4372a);
    }

    public String toString() {
        C1677q.C1678a m3640c = C1677q.m3640c(this);
        m3640c.m3639a("token", this.f4372a);
        return m3640c.toString();
    }
}
