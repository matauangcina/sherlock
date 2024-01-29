package p135d.p136o;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.C2725g;
import p135d.p148w.C2765g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.q */
/* loaded from: classes.dex */
public class C2661q extends C2660p {
    /* renamed from: h */
    public static final <T, A extends Appendable> A m947h(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC2706l<? super T, ? extends CharSequence> interfaceC2706l) {
        C2725g.m881e(iterable, "$this$joinTo");
        C2725g.m881e(a, "buffer");
        C2725g.m881e(charSequence, "separator");
        C2725g.m881e(charSequence2, "prefix");
        C2725g.m881e(charSequence3, "postfix");
        C2725g.m881e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C2765g.m813a(a, t, interfaceC2706l);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    /* renamed from: i */
    public static /* synthetic */ java.lang.Appendable m946i(java.lang.Iterable r6, java.lang.Appendable r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, java.lang.CharSequence r12, p135d.p142s.p143c.InterfaceC2706l r13, int r14, java.lang.Object r15) {
        /*
            r0 = r14 & 2
            if (r0 == 0) goto L7
            java.lang.String r0 = ", "
            goto L8
        L7:
            r0 = r8
        L8:
            r1 = r14 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L10
            r1 = r2
            goto L11
        L10:
            r1 = r9
        L11:
            r3 = r14 & 8
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = r10
        L17:
            r3 = r14 & 16
            if (r3 == 0) goto L1d
            r3 = -1
            goto L1e
        L1d:
            r3 = r11
        L1e:
            r4 = r14 & 32
            if (r4 == 0) goto L25
            java.lang.String r4 = "..."
            goto L26
        L25:
            r4 = r12
        L26:
            r5 = r14 & 64
            if (r5 == 0) goto L2c
            r5 = 0
            goto L2d
        L2c:
            r5 = r13
        L2d:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            m947h(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p135d.p136o.C2661q.m946i(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, d.s.c.l, int, java.lang.Object):java.lang.Appendable");
    }

    /* renamed from: j */
    public static final <T> String m945j(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC2706l<? super T, ? extends CharSequence> interfaceC2706l) {
        C2725g.m881e(iterable, "$this$joinToString");
        C2725g.m881e(charSequence, "separator");
        C2725g.m881e(charSequence2, "prefix");
        C2725g.m881e(charSequence3, "postfix");
        C2725g.m881e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m947h(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC2706l);
        String sb2 = sb.toString();
        C2725g.m882d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: k */
    public static /* synthetic */ String m944k(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC2706l interfaceC2706l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            interfaceC2706l = null;
        }
        return m945j(iterable, charSequence, str, str2, i3, charSequence5, interfaceC2706l);
    }

    /* renamed from: l */
    public static <T extends Comparable<? super T>> T m943l(Iterable<? extends T> iterable) {
        C2725g.m881e(iterable, "$this$minOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    /* renamed from: m */
    public static <T> T m942m(Iterable<? extends T> iterable) {
        C2725g.m881e(iterable, "$this$single");
        if (iterable instanceof List) {
            return (T) m941n((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: n */
    public static final <T> T m941n(List<? extends T> list) {
        C2725g.m881e(list, "$this$single");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }
}
