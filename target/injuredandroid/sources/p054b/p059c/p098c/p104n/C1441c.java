package p054b.p059c.p098c.p104n;

import com.google.firebase.components.C2277d;
import com.google.firebase.components.C2295n;
import com.google.firebase.components.InterfaceC2280e;
import java.util.Iterator;
import java.util.Set;
/* renamed from: b.c.c.n.c */
/* loaded from: classes.dex */
public class C1441c implements InterfaceC1446h {
    C1441c(Set<AbstractC1444f> set, C1442d c1442d) {
        m4165c(set);
    }

    /* renamed from: a */
    public static C2277d<InterfaceC1446h> m4167a() {
        C2277d.C2279b m2146a = C2277d.m2146a(InterfaceC1446h.class);
        m2146a.m2131b(C2295n.m2091h(AbstractC1444f.class));
        m2146a.m2128e(C1440b.m4168b());
        return m2146a.m2130c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC1446h m4166b(InterfaceC2280e interfaceC2280e) {
        return new C1441c(interfaceC2280e.mo2080b(AbstractC1444f.class), C1442d.m4164a());
    }

    /* renamed from: c */
    private static String m4165c(Set<AbstractC1444f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC1444f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC1444f next = it.next();
            sb.append(next.mo4161b());
            sb.append('/');
            sb.append(next.mo4160c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
