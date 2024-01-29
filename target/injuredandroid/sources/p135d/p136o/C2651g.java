package p135d.p136o;

import java.util.List;
/* renamed from: d.o.g */
/* loaded from: classes.dex */
public final class C2651g extends C2661q {
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ <T> int m963c(List<? extends T> list) {
        return C2653i.m952c(list);
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m960f() {
        C2653i.m949f();
        throw null;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ <T> int m959g(Iterable<? extends T> iterable, int i) {
        return C2654j.m948g(iterable, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: d.o.q.i(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, d.s.c.l, int, java.lang.Object):java.lang.Appendable
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
        	... 1 more
        */
    /* renamed from: i */
    public static /* bridge */ /* synthetic */ java.lang.Appendable m958i(java.lang.Iterable r0, java.lang.Appendable r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, p135d.p142s.p143c.InterfaceC2706l r7, int r8, java.lang.Object r9) {
        /*
            p135d.p136o.C2661q.m946i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p135d.p136o.C2651g.m958i(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, d.s.c.l, int, java.lang.Object):java.lang.Appendable");
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T m956l(Iterable<? extends T> iterable) {
        return (T) C2661q.m943l(iterable);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ <T> T m955m(Iterable<? extends T> iterable) {
        return (T) C2661q.m942m(iterable);
    }
}
