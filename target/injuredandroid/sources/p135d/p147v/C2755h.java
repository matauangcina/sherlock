package p135d.p147v;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p135d.p136o.C2653i;
import p135d.p142s.p143c.InterfaceC2706l;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.v.h */
/* loaded from: classes.dex */
public class C2755h extends C2754g {
    /* renamed from: b */
    public static <T, R> InterfaceC2749b<R> m832b(InterfaceC2749b<? extends T> interfaceC2749b, InterfaceC2706l<? super T, ? extends R> interfaceC2706l) {
        C2725g.m881e(interfaceC2749b, "$this$map");
        C2725g.m881e(interfaceC2706l, "transform");
        return new C2756i(interfaceC2749b, interfaceC2706l);
    }

    /* renamed from: c */
    public static final <T, C extends Collection<? super T>> C m831c(InterfaceC2749b<? extends T> interfaceC2749b, C c) {
        C2725g.m881e(interfaceC2749b, "$this$toCollection");
        C2725g.m881e(c, "destination");
        for (T t : interfaceC2749b) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: d */
    public static <T> List<T> m830d(InterfaceC2749b<? extends T> interfaceC2749b) {
        List<T> m950e;
        C2725g.m881e(interfaceC2749b, "$this$toList");
        m950e = C2653i.m950e(m829e(interfaceC2749b));
        return m950e;
    }

    /* renamed from: e */
    public static final <T> List<T> m829e(InterfaceC2749b<? extends T> interfaceC2749b) {
        C2725g.m881e(interfaceC2749b, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m831c(interfaceC2749b, arrayList);
        return arrayList;
    }
}
