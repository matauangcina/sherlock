package p135d.p138q;

import java.lang.reflect.Method;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.q.a */
/* loaded from: classes.dex */
public class C2683a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.q.a$a */
    /* loaded from: classes.dex */
    public static final class C2684a {

        /* renamed from: a */
        public static final Method f6833a;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[LOOP:0: B:3:0x000e->B:13:0x003e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[EDGE_INSN: B:23:0x0042->B:15:0x0042 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p135d.p142s.p144d.C2725g.m882d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                java.lang.String r5 = "it"
                if (r4 >= r2) goto L41
                r6 = r1[r4]
                p135d.p142s.p144d.C2725g.m882d(r6, r5)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p135d.p142s.p144d.C2725g.m885a(r7, r8)
                if (r7 == 0) goto L3a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                p135d.p142s.p144d.C2725g.m882d(r7, r8)
                java.lang.Object r7 = p135d.p136o.C2644a.m968c(r7)
                java.lang.Class r7 = (java.lang.Class) r7
                boolean r7 = p135d.p142s.p144d.C2725g.m885a(r7, r0)
                if (r7 == 0) goto L3a
                r7 = 1
                goto L3b
            L3a:
                r7 = 0
            L3b:
                if (r7 == 0) goto L3e
                goto L42
            L3e:
                int r4 = r4 + 1
                goto Le
            L41:
                r6 = 0
            L42:
                p135d.p138q.C2683a.C2684a.f6833a = r6
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L5c
                r2 = r1[r3]
                p135d.p142s.p144d.C2725g.m882d(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = p135d.p142s.p144d.C2725g.m885a(r2, r4)
                if (r2 == 0) goto L59
                goto L5c
            L59:
                int r3 = r3 + 1
                goto L45
            L5c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p135d.p138q.C2683a.C2684a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo900a(Throwable th, Throwable th2) {
        C2725g.m881e(th, "cause");
        C2725g.m881e(th2, "exception");
        Method method = C2684a.f6833a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
