package p135d.p148w;

import java.util.ArrayList;
import java.util.List;
import p135d.p136o.C2651g;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.AbstractC2726h;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.w.h */
/* loaded from: classes.dex */
public class C2766h extends C2765g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.w.h$a */
    /* loaded from: classes.dex */
    public static final class C2767a extends AbstractC2726h implements InterfaceC2706l<String, String> {

        /* renamed from: f */
        public static final C2767a f6883f = new C2767a();

        C2767a() {
            super(1);
        }

        @Override // p135d.p142s.p143c.InterfaceC2706l
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo776c(String str) {
            String str2 = str;
            m808d(str2);
            return str2;
        }

        /* renamed from: d */
        public final String m808d(String str) {
            C2725g.m881e(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.w.h$b */
    /* loaded from: classes.dex */
    public static final class C2768b extends AbstractC2726h implements InterfaceC2706l<String, String> {

        /* renamed from: f */
        final /* synthetic */ String f6884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2768b(String str) {
            super(1);
            this.f6884f = str;
        }

        @Override // p135d.p142s.p143c.InterfaceC2706l
        /* renamed from: d */
        public final String mo776c(String str) {
            C2725g.m881e(str, "line");
            return this.f6884f + str;
        }
    }

    /* renamed from: b */
    private static final InterfaceC2706l<String, String> m812b(String str) {
        return str.length() == 0 ? C2767a.f6883f : new C2768b(str);
    }

    /* renamed from: c */
    private static final int m811c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C2758a.m826a(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m810d(String str, String str2) {
        String mo776c;
        C2725g.m881e(str, "$this$replaceIndent");
        C2725g.m881e(str2, "newIndent");
        List<String> m780y = C2776p.m780y(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : m780y) {
            if (!C2775o.m806f((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2651g.m959g(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(m811c(str3)));
        }
        Integer num = (Integer) C2651g.m956l(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * m780y.size());
        InterfaceC2706l<String, String> m812b = m812b(str2);
        int m963c = C2651g.m963c(m780y);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m780y) {
            int i2 = i + 1;
            String str4 = null;
            if (i < 0) {
                C2651g.m960f();
                throw null;
            }
            String str5 = (String) obj2;
            if ((i != 0 && i != m963c) || !C2775o.m806f(str5)) {
                String m774H = C2780r.m774H(str5, intValue);
                str4 = (m774H == null || (mo776c = m812b.mo776c(m774H)) == null) ? str5 : mo776c;
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        C2651g.m958i(arrayList3, sb, "\n", null, null, 0, null, null, 124, null);
        String sb2 = sb.toString();
        C2725g.m882d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static String m809e(String str) {
        C2725g.m881e(str, "$this$trimIndent");
        return m810d(str, "");
    }
}
