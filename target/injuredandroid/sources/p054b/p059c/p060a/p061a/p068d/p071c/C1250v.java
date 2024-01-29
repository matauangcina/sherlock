package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.v */
/* loaded from: classes.dex */
final class C1250v {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4648a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 != null) {
        } else {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }
}
