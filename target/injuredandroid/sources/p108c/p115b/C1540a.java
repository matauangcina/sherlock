package p108c.p115b;

import java.util.BitSet;
import java.util.Locale;
import p054b.p059c.p094b.p095a.C1400a;
import p054b.p059c.p094b.p095a.C1403d;
import p054b.p059c.p094b.p096b.AbstractC1405a;
/* renamed from: c.b.a */
/* loaded from: classes.dex */
public final class C1540a {

    /* renamed from: a */
    public static final InterfaceC1544d<String> f4571a = new C1542b();

    /* renamed from: b */
    static final AbstractC1405a f4572b = AbstractC1405a.m4222a().mo4218b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.b.a$a */
    /* loaded from: classes.dex */
    public class C1541a {
    }

    /* renamed from: c.b.a$b */
    /* loaded from: classes.dex */
    class C1542b implements InterfaceC1544d<String> {
        C1542b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.b.a$c */
    /* loaded from: classes.dex */
    public static class C1543c<T> extends AbstractC1545e<T> {
        private C1543c(String str, boolean z, InterfaceC1544d<T> interfaceC1544d) {
            super(str, z, null);
            C1403d.m4227f(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            C1403d.m4225h(interfaceC1544d, "marshaller");
        }

        /* synthetic */ C1543c(String str, boolean z, InterfaceC1544d interfaceC1544d, C1541a c1541a) {
            this(str, z, interfaceC1544d);
        }
    }

    /* renamed from: c.b.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1544d<T> {
    }

    /* renamed from: c.b.a$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1545e<T> {

        /* renamed from: c */
        private static final BitSet f4573c = m3993a();

        /* renamed from: a */
        private final String f4574a;

        /* renamed from: b */
        private final String f4575b;

        private AbstractC1545e(String str, boolean z) {
            C1403d.m4225h(str, "name");
            String str2 = str;
            this.f4574a = str2;
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            m3990d(lowerCase, z);
            this.f4575b = lowerCase;
            lowerCase.getBytes(C1400a.f4329a);
        }

        /* synthetic */ AbstractC1545e(String str, boolean z, C1541a c1541a) {
            this(str, z);
        }

        /* renamed from: a */
        private static BitSet m3993a() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* renamed from: b */
        public static <T> AbstractC1545e<T> m3992b(String str, InterfaceC1544d<T> interfaceC1544d) {
            return m3991c(str, false, interfaceC1544d);
        }

        /* renamed from: c */
        static <T> AbstractC1545e<T> m3991c(String str, boolean z, InterfaceC1544d<T> interfaceC1544d) {
            return new C1543c(str, z, interfaceC1544d, null);
        }

        /* renamed from: d */
        private static String m3990d(String str, boolean z) {
            C1403d.m4225h(str, "name");
            C1403d.m4231b(!str.isEmpty(), "token must have at least 1 tchar");
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    C1403d.m4229d(f4573c.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4575b.equals(((AbstractC1545e) obj).f4575b);
        }

        public final int hashCode() {
            return this.f4575b.hashCode();
        }

        public String toString() {
            return "Key{name='" + this.f4575b + "'}";
        }
    }
}
