package p135d.p148w;

import p135d.p142s.p144d.C2725g;
import p135d.p145t.C2741f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.w.r */
/* loaded from: classes.dex */
public class C2780r extends C2779q {
    /* renamed from: H */
    public static final String m774H(String str, int i) {
        int m842b;
        C2725g.m881e(str, "$this$drop");
        if (i >= 0) {
            m842b = C2741f.m842b(i, str.length());
            String substring = str.substring(m842b);
            C2725g.m882d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
