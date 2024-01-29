package p135d.p136o;

import java.util.List;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.i */
/* loaded from: classes.dex */
public class C2653i extends C2652h {
    /* renamed from: b */
    public static final <T> List<T> m953b() {
        return C2663s.f6823f;
    }

    /* renamed from: c */
    public static <T> int m952c(List<? extends T> list) {
        C2725g.m881e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: d */
    public static <T> List<T> m951d(T... tArr) {
        List<T> m967a;
        C2725g.m881e(tArr, "elements");
        if (tArr.length > 0) {
            m967a = C2648d.m967a(tArr);
            return m967a;
        }
        return m953b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> List<T> m950e(List<? extends T> list) {
        C2725g.m881e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C2652h.m954a(list.get(0)) : m953b();
    }

    /* renamed from: f */
    public static void m949f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
