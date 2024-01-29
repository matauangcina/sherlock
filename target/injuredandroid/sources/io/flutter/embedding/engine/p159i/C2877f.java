package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import p108c.p109a.p110c.p111a.C1516i;
import p108c.p109a.p110c.p111a.C1531r;
/* renamed from: io.flutter.embedding.engine.i.f */
/* loaded from: classes.dex */
public class C2877f {

    /* renamed from: a */
    public final C1516i f7114a;

    /* renamed from: b */
    private InterfaceC2879b f7115b;

    /* renamed from: c */
    private final C1516i.InterfaceC1520c f7116c = new C2878a();

    /* renamed from: io.flutter.embedding.engine.i.f$a */
    /* loaded from: classes.dex */
    class C2878a implements C1516i.InterfaceC1520c {
        C2878a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return;
         */
        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo160b(p108c.p109a.p110c.p111a.C1515h r7, p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d r8) {
            /*
                r6 = this;
                java.lang.String r0 = "error"
                io.flutter.embedding.engine.i.f r1 = io.flutter.embedding.engine.p159i.C2877f.this
                io.flutter.embedding.engine.i.f$b r1 = io.flutter.embedding.engine.p159i.C2877f.m464a(r1)
                if (r1 != 0) goto Lb
                return
            Lb:
                java.lang.String r1 = r7.f4547a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MouseCursorChannel"
                p108c.p109a.C1499b.m4050d(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch: java.lang.Exception -> L75
                r5 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
                if (r4 == r5) goto L34
                goto L3d
            L34:
                java.lang.String r4 = "activateSystemCursor"
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L75
                if (r1 == 0) goto L3d
                r2 = 0
            L3d:
                if (r2 == 0) goto L40
                goto L8e
            L40:
                java.lang.Object r7 = r7.f4548b     // Catch: java.lang.Exception -> L75
                java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Exception -> L75
                java.lang.String r1 = "kind"
                java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Exception -> L75
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L75
                io.flutter.embedding.engine.i.f r1 = io.flutter.embedding.engine.p159i.C2877f.this     // Catch: java.lang.Exception -> L5b
                io.flutter.embedding.engine.i.f$b r1 = io.flutter.embedding.engine.p159i.C2877f.m464a(r1)     // Catch: java.lang.Exception -> L5b
                r1.mo462a(r7)     // Catch: java.lang.Exception -> L5b
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L75
                r8.mo419c(r7)     // Catch: java.lang.Exception -> L75
                goto L8e
            L5b:
                r7 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L75
                r1.<init>()     // Catch: java.lang.Exception -> L75
                java.lang.String r2 = "Error when setting cursors: "
                r1.append(r2)     // Catch: java.lang.Exception -> L75
                java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Exception -> L75
                r1.append(r7)     // Catch: java.lang.Exception -> L75
                java.lang.String r7 = r1.toString()     // Catch: java.lang.Exception -> L75
                r8.mo420b(r0, r7, r3)     // Catch: java.lang.Exception -> L75
                goto L8e
            L75:
                r7 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unhandled error: "
                r1.append(r2)
                java.lang.String r7 = r7.getMessage()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r8.mo420b(r0, r7, r3)
            L8e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.p159i.C2877f.C2878a.mo160b(c.a.c.a.h, c.a.c.a.i$d):void");
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2879b {
        /* renamed from: a */
        void mo462a(String str);
    }

    public C2877f(C2832a c2832a) {
        C1516i c1516i = new C1516i(c2832a, "flutter/mousecursor", C1531r.f4561b);
        this.f7114a = c1516i;
        c1516i.m4034e(this.f7116c);
    }

    /* renamed from: b */
    public void m463b(InterfaceC2879b interfaceC2879b) {
        this.f7115b = interfaceC2879b;
    }
}
