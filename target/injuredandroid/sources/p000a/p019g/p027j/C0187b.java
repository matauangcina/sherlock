package p000a.p019g.p027j;
/* renamed from: a.g.j.b */
/* loaded from: classes.dex */
public class C0187b {
    /* renamed from: a */
    public static void m8875a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }
}
