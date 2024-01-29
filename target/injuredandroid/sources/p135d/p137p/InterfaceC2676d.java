package p135d.p137p;

import p135d.p142s.p143c.InterfaceC2710p;
import p135d.p142s.p144d.AbstractC2726h;
import p135d.p142s.p144d.C2725g;
/* renamed from: d.p.d */
/* loaded from: classes.dex */
public interface InterfaceC2676d {

    /* renamed from: d.p.d$a */
    /* loaded from: classes.dex */
    public static final class C2677a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d.p.d$a$a */
        /* loaded from: classes.dex */
        public static final class C2678a extends AbstractC2726h implements InterfaceC2710p<InterfaceC2676d, InterfaceC2679b, InterfaceC2676d> {

            /* renamed from: f */
            public static final C2678a f6831f = new C2678a();

            C2678a() {
                super(2);
            }

            @Override // p135d.p142s.p143c.InterfaceC2710p
            /* renamed from: d */
            public final InterfaceC2676d mo778a(InterfaceC2676d interfaceC2676d, InterfaceC2679b interfaceC2679b) {
                C2725g.m881e(interfaceC2676d, "acc");
                C2725g.m881e(interfaceC2679b, "element");
                InterfaceC2676d minusKey = interfaceC2676d.minusKey(interfaceC2679b.getKey());
                if (minusKey == C2682e.f6832f) {
                    return interfaceC2679b;
                }
                InterfaceC2674c interfaceC2674c = (InterfaceC2674c) minusKey.get(InterfaceC2674c.f6829c);
                if (interfaceC2674c == null) {
                    return new C2672b(minusKey, interfaceC2679b);
                }
                InterfaceC2676d minusKey2 = minusKey.minusKey(InterfaceC2674c.f6829c);
                return minusKey2 == C2682e.f6832f ? new C2672b(interfaceC2679b, interfaceC2674c) : new C2672b(new C2672b(minusKey2, interfaceC2679b), interfaceC2674c);
            }
        }

        /* renamed from: a */
        public static InterfaceC2676d m910a(InterfaceC2676d interfaceC2676d, InterfaceC2676d interfaceC2676d2) {
            C2725g.m881e(interfaceC2676d2, "context");
            return interfaceC2676d2 == C2682e.f6832f ? interfaceC2676d : (InterfaceC2676d) interfaceC2676d2.fold(interfaceC2676d, C2678a.f6831f);
        }
    }

    /* renamed from: d.p.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2679b extends InterfaceC2676d {

        /* renamed from: d.p.d$b$a */
        /* loaded from: classes.dex */
        public static final class C2680a {
            /* renamed from: a */
            public static <R> R m908a(InterfaceC2679b interfaceC2679b, R r, InterfaceC2710p<? super R, ? super InterfaceC2679b, ? extends R> interfaceC2710p) {
                C2725g.m881e(interfaceC2710p, "operation");
                return interfaceC2710p.mo778a(r, interfaceC2679b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends InterfaceC2679b> E m907b(InterfaceC2679b interfaceC2679b, InterfaceC2681c<E> interfaceC2681c) {
                C2725g.m881e(interfaceC2681c, "key");
                if (C2725g.m885a(interfaceC2679b.getKey(), interfaceC2681c)) {
                    if (interfaceC2679b != 0) {
                        return interfaceC2679b;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type E");
                }
                return null;
            }

            /* renamed from: c */
            public static InterfaceC2676d m906c(InterfaceC2679b interfaceC2679b, InterfaceC2681c<?> interfaceC2681c) {
                C2725g.m881e(interfaceC2681c, "key");
                return C2725g.m885a(interfaceC2679b.getKey(), interfaceC2681c) ? C2682e.f6832f : interfaceC2679b;
            }

            /* renamed from: d */
            public static InterfaceC2676d m905d(InterfaceC2679b interfaceC2679b, InterfaceC2676d interfaceC2676d) {
                C2725g.m881e(interfaceC2676d, "context");
                return C2677a.m910a(interfaceC2679b, interfaceC2676d);
            }
        }

        @Override // p135d.p137p.InterfaceC2676d
        <E extends InterfaceC2679b> E get(InterfaceC2681c<E> interfaceC2681c);

        InterfaceC2681c<?> getKey();
    }

    /* renamed from: d.p.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2681c<E extends InterfaceC2679b> {
    }

    <R> R fold(R r, InterfaceC2710p<? super R, ? super InterfaceC2679b, ? extends R> interfaceC2710p);

    <E extends InterfaceC2679b> E get(InterfaceC2681c<E> interfaceC2681c);

    InterfaceC2676d minusKey(InterfaceC2681c<?> interfaceC2681c);
}
