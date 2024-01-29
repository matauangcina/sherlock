package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.Iterator;
import java.util.Set;
/* renamed from: b.c.a.a.d.c.i0 */
/* loaded from: classes.dex */
public final class C1212i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m4706a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m4705b(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
