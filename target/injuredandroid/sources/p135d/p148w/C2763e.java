package p135d.p148w;

import java.io.Serializable;
import java.util.regex.Pattern;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.w.e */
/* loaded from: classes.dex */
public final class C2763e implements Serializable {

    /* renamed from: f */
    private final Pattern f6882f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2763e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p135d.p142s.p144d.C2725g.m881e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            p135d.p142s.p144d.C2725g.m882d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135d.p148w.C2763e.<init>(java.lang.String):void");
    }

    public C2763e(Pattern pattern) {
        C2725g.m881e(pattern, "nativePattern");
        this.f6882f = pattern;
    }

    /* renamed from: a */
    public final String m818a(CharSequence charSequence, String str) {
        C2725g.m881e(charSequence, "input");
        C2725g.m881e(str, "replacement");
        String replaceAll = this.f6882f.matcher(charSequence).replaceAll(str);
        C2725g.m882d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f6882f.toString();
        C2725g.m882d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
