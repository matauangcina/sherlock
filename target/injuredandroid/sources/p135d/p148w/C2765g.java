package p135d.p148w;

import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.w.g */
/* loaded from: classes.dex */
public class C2765g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* renamed from: a */
    public static <T> void m813a(Appendable appendable, T t, InterfaceC2706l<? super T, ? extends CharSequence> interfaceC2706l) {
        CharSequence valueOf;
        C2725g.m881e(appendable, "$this$appendElement");
        if (interfaceC2706l != null) {
            t = (T) interfaceC2706l.mo776c(t);
        } else {
            if (!(t != 0 ? t instanceof CharSequence : true)) {
                if (t instanceof Character) {
                    appendable.append(((Character) t).charValue());
                    return;
                }
                valueOf = String.valueOf((Object) t);
                appendable.append(valueOf);
            }
        }
        valueOf = (CharSequence) t;
        appendable.append(valueOf);
    }
}
