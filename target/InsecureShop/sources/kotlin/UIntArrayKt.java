package kotlin;

import kotlin.jvm.functions.Function1;
/* compiled from: UIntArray.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\n\u0010\t\u001a\u00020\u0001\"\u00020\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m19d2 = {"UIntArray", "Lkotlin/UIntArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/UInt;", "(ILkotlin/jvm/functions/Function1;)[I", "uintArrayOf", "elements", "uintArrayOf--ajY-9A", "([I)[I", "kotlin-stdlib"}, m18k = 2, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class UIntArrayKt {
    private static final int[] UIntArray(int size, Function1<? super Integer, UInt> function1) {
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            int index = i;
            iArr[i] = function1.invoke(Integer.valueOf(index)).m181unboximpl();
        }
        return UIntArray.m184constructorimpl(iArr);
    }

    /* renamed from: uintArrayOf--ajY-9A  reason: not valid java name */
    private static final int[] m199uintArrayOfajY9A(int... elements) {
        return elements;
    }
}
