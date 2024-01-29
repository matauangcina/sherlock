package p135d.p148w;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p135d.C2638i;
import p135d.C2640k;
import p135d.p136o.C2648d;
import p135d.p136o.C2649e;
import p135d.p136o.C2651g;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p144d.AbstractC2726h;
import p135d.p142s.p144d.C2725g;
import p135d.p145t.C2734a;
import p135d.p145t.C2737c;
import p135d.p145t.C2739d;
import p135d.p147v.C2750c;
import p135d.p147v.InterfaceC2749b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.w.p */
/* loaded from: classes.dex */
public class C2776p extends C2775o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.w.p$a */
    /* loaded from: classes.dex */
    public static final class C2777a extends AbstractC2726h implements InterfaceC2710p<CharSequence, Integer, C2638i<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List f6885f;

        /* renamed from: g */
        final /* synthetic */ boolean f6886g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2777a(List list, boolean z) {
            super(2);
            this.f6885f = list;
            this.f6886g = z;
        }

        @Override // p135d.p142s.p143c.InterfaceC2710p
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C2638i<? extends Integer, ? extends Integer> mo778a(CharSequence charSequence, Integer num) {
            return m777d(charSequence, num.intValue());
        }

        /* renamed from: d */
        public final C2638i<Integer, Integer> m777d(CharSequence charSequence, int i) {
            C2725g.m881e(charSequence, "$receiver");
            C2638i m796i = C2776p.m796i(charSequence, this.f6885f, i, this.f6886g, false);
            if (m796i != null) {
                return C2640k.m971a(m796i.m974c(), Integer.valueOf(((String) m796i.m973d()).length()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.w.p$b */
    /* loaded from: classes.dex */
    public static final class C2778b extends AbstractC2726h implements InterfaceC2706l<C2737c, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f6887f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2778b(CharSequence charSequence) {
            super(1);
            this.f6887f = charSequence;
        }

        @Override // p135d.p142s.p143c.InterfaceC2706l
        /* renamed from: d */
        public final String mo776c(C2737c c2737c) {
            C2725g.m881e(c2737c, "it");
            return C2776p.m800E(this.f6887f, c2737c);
        }
    }

    /* renamed from: A */
    static /* synthetic */ InterfaceC2749b m804A(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m779z(charSequence, strArr, i, z, i2);
    }

    /* renamed from: B */
    public static final boolean m803B(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C2725g.m881e(charSequence, "$this$regionMatchesImpl");
        C2725g.m881e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C2759b.m825b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static final InterfaceC2749b<String> m802C(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C2725g.m881e(charSequence, "$this$splitToSequence");
        C2725g.m881e(strArr, "delimiters");
        return C2750c.m835b(m804A(charSequence, strArr, 0, z, i, 2, null), new C2778b(charSequence));
    }

    /* renamed from: D */
    public static /* synthetic */ InterfaceC2749b m801D(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m802C(charSequence, strArr, z, i);
    }

    /* renamed from: E */
    public static final String m800E(CharSequence charSequence, C2737c c2737c) {
        C2725g.m881e(charSequence, "$this$substring");
        C2725g.m881e(c2737c, "range");
        return charSequence.subSequence(c2737c.m850m().intValue(), c2737c.m851l().intValue() + 1).toString();
    }

    /* renamed from: F */
    public static final String m799F(String str, char c, String str2) {
        C2725g.m881e(str, "$this$substringAfterLast");
        C2725g.m881e(str2, "missingDelimiterValue");
        int m784u = m784u(str, c, 0, false, 6, null);
        if (m784u == -1) {
            return str2;
        }
        String substring = str.substring(m784u + 1, str.length());
        C2725g.m882d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G */
    public static /* synthetic */ String m798G(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m799F(str, c, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final C2638i<Integer, String> m796i(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int m858d;
        Object obj;
        String str;
        Object obj2;
        if (!z && collection.size() == 1) {
            String str2 = (String) C2651g.m955m(collection);
            int m788q = !z2 ? m788q(charSequence, str2, i, false, 4, null) : m783v(charSequence, str2, i, false, 4, null);
            if (m788q < 0) {
                return null;
            }
            return C2640k.m971a(Integer.valueOf(m788q), str2);
        }
        C2734a c2737c = !z2 ? new C2737c(C2739d.m848a(i, 0), charSequence.length()) : C2739d.m845d(C2739d.m847b(i, m794k(charSequence)), 0);
        if (!(charSequence instanceof String)) {
            m858d = c2737c.m858d();
            int m857e = c2737c.m857e();
            int m856f = c2737c.m856f();
            if (m856f < 0 ? m858d >= m857e : m858d <= m857e) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        String str3 = (String) obj;
                        if (m803B(str3, 0, charSequence, m858d, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) obj;
                    if (str == null) {
                        if (m858d == m857e) {
                            break;
                        }
                        m858d += m856f;
                    } else {
                        break;
                    }
                }
            }
            return null;
        }
        m858d = c2737c.m858d();
        int m857e2 = c2737c.m857e();
        int m856f2 = c2737c.m856f();
        if (m856f2 < 0 ? m858d >= m857e2 : m858d <= m857e2) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    String str4 = (String) obj2;
                    if (C2775o.m805g(str4, 0, (String) charSequence, m858d, str4.length(), z)) {
                        break;
                    }
                }
                str = (String) obj2;
                if (str == null) {
                    if (m858d == m857e2) {
                        break;
                    }
                    m858d += m856f2;
                } else {
                    break;
                }
            }
            return C2640k.m971a(Integer.valueOf(m858d), str);
        }
        return null;
    }

    /* renamed from: j */
    public static final C2737c m795j(CharSequence charSequence) {
        C2725g.m881e(charSequence, "$this$indices");
        return new C2737c(0, charSequence.length() - 1);
    }

    /* renamed from: k */
    public static final int m794k(CharSequence charSequence) {
        C2725g.m881e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: l */
    public static final int m793l(CharSequence charSequence, char c, int i, boolean z) {
        C2725g.m881e(charSequence, "$this$indexOf");
        return (z || !(charSequence instanceof String)) ? m787r(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    /* renamed from: m */
    public static final int m792m(CharSequence charSequence, String str, int i, boolean z) {
        C2725g.m881e(charSequence, "$this$indexOf");
        C2725g.m881e(str, "string");
        return (z || !(charSequence instanceof String)) ? m790o(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: n */
    private static final int m791n(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C2734a c2737c = !z2 ? new C2737c(C2739d.m848a(i, 0), C2739d.m847b(i2, charSequence.length())) : C2739d.m845d(C2739d.m847b(i, m794k(charSequence)), C2739d.m848a(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m858d = c2737c.m858d();
            int m857e = c2737c.m857e();
            int m856f = c2737c.m856f();
            if (m856f >= 0) {
                if (m858d > m857e) {
                    return -1;
                }
            } else if (m858d < m857e) {
                return -1;
            }
            while (!C2775o.m805g((String) charSequence2, 0, (String) charSequence, m858d, charSequence2.length(), z)) {
                if (m858d == m857e) {
                    return -1;
                }
                m858d += m856f;
            }
            return m858d;
        }
        int m858d2 = c2737c.m858d();
        int m857e2 = c2737c.m857e();
        int m856f2 = c2737c.m856f();
        if (m856f2 >= 0) {
            if (m858d2 > m857e2) {
                return -1;
            }
        } else if (m858d2 < m857e2) {
            return -1;
        }
        while (!m803B(charSequence2, 0, charSequence, m858d2, charSequence2.length(), z)) {
            if (m858d2 == m857e2) {
                return -1;
            }
            m858d2 += m856f2;
        }
        return m858d2;
    }

    /* renamed from: o */
    static /* synthetic */ int m790o(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m791n(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: p */
    public static /* synthetic */ int m789p(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m793l(charSequence, c, i, z);
    }

    /* renamed from: q */
    public static /* synthetic */ int m788q(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m792m(charSequence, str, i, z);
    }

    /* renamed from: r */
    public static final int m787r(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        char m966b;
        C2725g.m881e(charSequence, "$this$indexOfAny");
        C2725g.m881e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            m966b = C2649e.m966b(cArr);
            return ((String) charSequence).indexOf(m966b, i);
        }
        int m848a = C2739d.m848a(i, 0);
        int m794k = m794k(charSequence);
        if (m848a > m794k) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(m848a);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (C2759b.m825b(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m848a;
            }
            if (m848a == m794k) {
                return -1;
            }
            m848a++;
        }
    }

    /* renamed from: s */
    public static final int m786s(CharSequence charSequence, char c, int i, boolean z) {
        C2725g.m881e(charSequence, "$this$lastIndexOf");
        return (z || !(charSequence instanceof String)) ? m782w(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    /* renamed from: t */
    public static final int m785t(CharSequence charSequence, String str, int i, boolean z) {
        C2725g.m881e(charSequence, "$this$lastIndexOf");
        C2725g.m881e(str, "string");
        return (z || !(charSequence instanceof String)) ? m791n(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: u */
    public static /* synthetic */ int m784u(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m794k(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m786s(charSequence, c, i, z);
    }

    /* renamed from: v */
    public static /* synthetic */ int m783v(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m794k(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m785t(charSequence, str, i, z);
    }

    /* renamed from: w */
    public static final int m782w(CharSequence charSequence, char[] cArr, int i, boolean z) {
        char m966b;
        C2725g.m881e(charSequence, "$this$lastIndexOfAny");
        C2725g.m881e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            m966b = C2649e.m966b(cArr);
            return ((String) charSequence).lastIndexOf(m966b, i);
        }
        for (int m847b = C2739d.m847b(i, m794k(charSequence)); m847b >= 0; m847b--) {
            char charAt = charSequence.charAt(m847b);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C2759b.m825b(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m847b;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public static final InterfaceC2749b<String> m781x(CharSequence charSequence) {
        C2725g.m881e(charSequence, "$this$lineSequence");
        return m801D(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: y */
    public static final List<String> m780y(CharSequence charSequence) {
        C2725g.m881e(charSequence, "$this$lines");
        return C2750c.m834d(m781x(charSequence));
    }

    /* renamed from: z */
    private static final InterfaceC2749b<C2737c> m779z(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List m967a;
        if (i2 >= 0) {
            m967a = C2648d.m967a(strArr);
            return new C2761d(charSequence, i, i2, new C2777a(m967a, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }
}
