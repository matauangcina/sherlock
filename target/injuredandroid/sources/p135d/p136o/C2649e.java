package p135d.p136o;

import java.util.NoSuchElementException;
import p135d.p142s.p144d.C2725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.o.e */
/* loaded from: classes.dex */
public class C2649e extends C2648d {
    /* renamed from: b */
    public static char m966b(char[] cArr) {
        C2725g.m881e(cArr, "$this$single");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: c */
    public static <T> T m965c(T[] tArr) {
        C2725g.m881e(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
