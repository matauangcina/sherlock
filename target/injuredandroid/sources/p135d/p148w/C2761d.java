package p135d.p148w;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p135d.C2638i;
import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p144d.C2725g;
import p135d.p145t.C2737c;
import p135d.p145t.C2741f;
import p135d.p147v.InterfaceC2749b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.w.d */
/* loaded from: classes.dex */
public final class C2761d implements InterfaceC2749b<C2737c> {

    /* renamed from: a */
    private final CharSequence f6872a;

    /* renamed from: b */
    private final int f6873b;

    /* renamed from: c */
    private final int f6874c;

    /* renamed from: d */
    private final InterfaceC2710p<CharSequence, Integer, C2638i<Integer, Integer>> f6875d;

    /* renamed from: d.w.d$a */
    /* loaded from: classes.dex */
    public static final class C2762a implements Iterator<C2737c> {

        /* renamed from: f */
        private int f6876f = -1;

        /* renamed from: g */
        private int f6877g;

        /* renamed from: h */
        private int f6878h;

        /* renamed from: i */
        private C2737c f6879i;

        /* renamed from: j */
        private int f6880j;

        C2762a() {
            int m841c;
            m841c = C2741f.m841c(C2761d.this.f6873b, 0, C2761d.this.f6872a.length());
            this.f6877g = m841c;
            this.f6878h = m841c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f6881k.f6874c) goto L15;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m820a() {
            /*
                r6 = this;
                int r0 = r6.f6878h
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f6876f = r1
                r0 = 0
                r6.f6879i = r0
                goto L99
            Lc:
                d.w.d r0 = p135d.p148w.C2761d.this
                int r0 = p135d.p148w.C2761d.m822c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f6880j
                int r0 = r0 + r3
                r6.f6880j = r0
                d.w.d r4 = p135d.p148w.C2761d.this
                int r4 = p135d.p148w.C2761d.m822c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f6878h
                d.w.d r4 = p135d.p148w.C2761d.this
                java.lang.CharSequence r4 = p135d.p148w.C2761d.m823b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                int r0 = r6.f6877g
                d.t.c r1 = new d.t.c
                d.w.d r4 = p135d.p148w.C2761d.this
                java.lang.CharSequence r4 = p135d.p148w.C2761d.m823b(r4)
                int r4 = p135d.p148w.C2776p.m794k(r4)
                r1.<init>(r0, r4)
            L42:
                r6.f6879i = r1
            L44:
                r6.f6878h = r2
                goto L97
            L47:
                d.w.d r0 = p135d.p148w.C2761d.this
                d.s.c.p r0 = p135d.p148w.C2761d.m824a(r0)
                d.w.d r4 = p135d.p148w.C2761d.this
                java.lang.CharSequence r4 = p135d.p148w.C2761d.m823b(r4)
                int r5 = r6.f6878h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo778a(r4, r5)
                d.i r0 = (p135d.C2638i) r0
                if (r0 != 0) goto L73
                int r0 = r6.f6877g
                d.t.c r1 = new d.t.c
                d.w.d r4 = p135d.p148w.C2761d.this
                java.lang.CharSequence r4 = p135d.p148w.C2761d.m823b(r4)
                int r4 = p135d.p148w.C2776p.m794k(r4)
                r1.<init>(r0, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.m976a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m975b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f6877g
                d.t.c r4 = p135d.p145t.C2739d.m844e(r4, r2)
                r6.f6879i = r4
                int r2 = r2 + r0
                r6.f6877g = r2
                if (r0 != 0) goto L95
                r1 = 1
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f6876f = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p135d.p148w.C2761d.C2762a.m820a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public C2737c next() {
            if (this.f6876f == -1) {
                m820a();
            }
            if (this.f6876f != 0) {
                C2737c c2737c = this.f6879i;
                if (c2737c != null) {
                    this.f6879i = null;
                    this.f6876f = -1;
                    return c2737c;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6876f == -1) {
                m820a();
            }
            return this.f6876f == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2761d(CharSequence charSequence, int i, int i2, InterfaceC2710p<? super CharSequence, ? super Integer, C2638i<Integer, Integer>> interfaceC2710p) {
        C2725g.m881e(charSequence, "input");
        C2725g.m881e(interfaceC2710p, "getNextMatch");
        this.f6872a = charSequence;
        this.f6873b = i;
        this.f6874c = i2;
        this.f6875d = interfaceC2710p;
    }

    @Override // p135d.p147v.InterfaceC2749b
    public Iterator<C2737c> iterator() {
        return new C2762a();
    }
}
