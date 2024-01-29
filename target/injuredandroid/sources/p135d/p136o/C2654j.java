package p135d.p136o;

import java.util.Collection;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.j */
/* loaded from: classes.dex */
public class C2654j extends C2653i {
    /* renamed from: g */
    public static <T> int m948g(Iterable<? extends T> iterable, int i) {
        C2725g.m881e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
