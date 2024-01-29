package p000a.p019g.p027j;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;
/* renamed from: a.g.j.d */
/* loaded from: classes.dex */
public class C0189d {
    /* renamed from: a */
    public static boolean m8873a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m8872b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }
}
