package p000a.p019g.p025h;

import android.util.Base64;
import java.util.List;
import p000a.p019g.p027j.C0194i;
/* renamed from: a.g.h.d */
/* loaded from: classes.dex */
public final class C0154d {

    /* renamed from: a */
    private final String f562a;

    /* renamed from: b */
    private final String f563b;

    /* renamed from: c */
    private final String f564c;

    /* renamed from: d */
    private final List<List<byte[]>> f565d;

    /* renamed from: e */
    private final int f566e;

    /* renamed from: f */
    private final String f567f;

    public C0154d(String str, String str2, String str3, List<List<byte[]>> list) {
        C0194i.m8866c(str);
        this.f562a = str;
        C0194i.m8866c(str2);
        this.f563b = str2;
        C0194i.m8866c(str3);
        this.f564c = str3;
        C0194i.m8866c(list);
        this.f565d = list;
        this.f566e = 0;
        this.f567f = m8951a(str, str2, str3);
    }

    /* renamed from: a */
    private String m8951a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m8950b() {
        return this.f565d;
    }

    /* renamed from: c */
    public int m8949c() {
        return this.f566e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m8948d() {
        return this.f567f;
    }

    /* renamed from: e */
    public String m8947e() {
        return this.f562a;
    }

    /* renamed from: f */
    public String m8946f() {
        return this.f563b;
    }

    /* renamed from: g */
    public String m8945g() {
        return this.f564c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f562a + ", mProviderPackage: " + this.f563b + ", mQuery: " + this.f564c + ", mCertificates:");
        for (int i = 0; i < this.f565d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f565d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f566e);
        return sb.toString();
    }
}
