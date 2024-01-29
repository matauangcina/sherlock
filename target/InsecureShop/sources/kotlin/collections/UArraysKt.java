package kotlin.collections;

import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
/* compiled from: UArraysKt.kt */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010&\u001a\u00020(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001e\u0010&\u001a\u00020+*\u00020\t2\u0006\u0010&\u001a\u00020(H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001e\u0010&\u001a\u00020.*\u00020\f2\u0006\u0010&\u001a\u00020(H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001e\u0010&\u001a\u000201*\u00020\u000f2\u0006\u0010&\u001a\u00020(H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020'05*\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020+05*\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020.05*\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020105*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, m19d2 = {"Lkotlin/collections/UArraysKt;", "", "()V", "contentEquals", "", "Lkotlin/UByteArray;", "other", "contentEquals-kdPth3s", "([B[B)Z", "Lkotlin/UIntArray;", "contentEquals-ctEhBpI", "([I[I)Z", "Lkotlin/ULongArray;", "contentEquals-us8wMrg", "([J[J)Z", "Lkotlin/UShortArray;", "contentEquals-mazbYpA", "([S[S)Z", "contentHashCode", "", "contentHashCode-GBYM_sE", "([B)I", "contentHashCode--ajY-9A", "([I)I", "contentHashCode-QwZRm1k", "([J)I", "contentHashCode-rL5Bavg", "([S)I", "contentToString", "", "contentToString-GBYM_sE", "([B)Ljava/lang/String;", "contentToString--ajY-9A", "([I)Ljava/lang/String;", "contentToString-QwZRm1k", "([J)Ljava/lang/String;", "contentToString-rL5Bavg", "([S)Ljava/lang/String;", "random", "Lkotlin/UByte;", "Lkotlin/random/Random;", "random-oSF2wD8", "([BLkotlin/random/Random;)B", "Lkotlin/UInt;", "random-2D5oskM", "([ILkotlin/random/Random;)I", "Lkotlin/ULong;", "random-JzugnMA", "([JLkotlin/random/Random;)J", "Lkotlin/UShort;", "random-s5X_as8", "([SLkotlin/random/Random;)S", "toTypedArray", "", "toTypedArray-GBYM_sE", "([B)[Lkotlin/UByte;", "toTypedArray--ajY-9A", "([I)[Lkotlin/UInt;", "toTypedArray-QwZRm1k", "([J)[Lkotlin/ULong;", "toTypedArray-rL5Bavg", "([S)[Lkotlin/UShort;", "kotlin-stdlib"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class UArraysKt {
    public static final UArraysKt INSTANCE = new UArraysKt();

    private UArraysKt() {
    }

    @JvmStatic
    /* renamed from: random-2D5oskM  reason: not valid java name */
    public static final int m396random2D5oskM(int[] random, Random random2) {
        Intrinsics.checkParameterIsNotNull(random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random2, "random");
        if (UIntArray.m192isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.m189getimpl(random, random2.nextInt(UIntArray.m190getSizeimpl(random)));
    }

    @JvmStatic
    /* renamed from: random-JzugnMA  reason: not valid java name */
    public static final long m397randomJzugnMA(long[] random, Random random2) {
        Intrinsics.checkParameterIsNotNull(random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random2, "random");
        if (ULongArray.m261isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.m258getimpl(random, random2.nextInt(ULongArray.m259getSizeimpl(random)));
    }

    @JvmStatic
    /* renamed from: random-oSF2wD8  reason: not valid java name */
    public static final byte m398randomoSF2wD8(byte[] random, Random random2) {
        Intrinsics.checkParameterIsNotNull(random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random2, "random");
        if (UByteArray.m123isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.m120getimpl(random, random2.nextInt(UByteArray.m121getSizeimpl(random)));
    }

    @JvmStatic
    /* renamed from: random-s5X_as8  reason: not valid java name */
    public static final short m399randoms5X_as8(short[] random, Random random2) {
        Intrinsics.checkParameterIsNotNull(random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random2, "random");
        if (UShortArray.m356isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.m353getimpl(random, random2.nextInt(UShortArray.m354getSizeimpl(random)));
    }

    @JvmStatic
    /* renamed from: contentEquals-ctEhBpI  reason: not valid java name */
    public static final boolean m384contentEqualsctEhBpI(int[] contentEquals, int[] other) {
        Intrinsics.checkParameterIsNotNull(contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals(contentEquals, other);
    }

    @JvmStatic
    /* renamed from: contentEquals-us8wMrg  reason: not valid java name */
    public static final boolean m387contentEqualsus8wMrg(long[] contentEquals, long[] other) {
        Intrinsics.checkParameterIsNotNull(contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals(contentEquals, other);
    }

    @JvmStatic
    /* renamed from: contentEquals-kdPth3s  reason: not valid java name */
    public static final boolean m385contentEqualskdPth3s(byte[] contentEquals, byte[] other) {
        Intrinsics.checkParameterIsNotNull(contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals(contentEquals, other);
    }

    @JvmStatic
    /* renamed from: contentEquals-mazbYpA  reason: not valid java name */
    public static final boolean m386contentEqualsmazbYpA(short[] contentEquals, short[] other) {
        Intrinsics.checkParameterIsNotNull(contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals(contentEquals, other);
    }

    @JvmStatic
    /* renamed from: contentHashCode--ajY-9A  reason: not valid java name */
    public static final int m388contentHashCodeajY9A(int[] contentHashCode) {
        Intrinsics.checkParameterIsNotNull(contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode(contentHashCode);
    }

    @JvmStatic
    /* renamed from: contentHashCode-QwZRm1k  reason: not valid java name */
    public static final int m390contentHashCodeQwZRm1k(long[] contentHashCode) {
        Intrinsics.checkParameterIsNotNull(contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode(contentHashCode);
    }

    @JvmStatic
    /* renamed from: contentHashCode-GBYM_sE  reason: not valid java name */
    public static final int m389contentHashCodeGBYM_sE(byte[] contentHashCode) {
        Intrinsics.checkParameterIsNotNull(contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode(contentHashCode);
    }

    @JvmStatic
    /* renamed from: contentHashCode-rL5Bavg  reason: not valid java name */
    public static final int m391contentHashCoderL5Bavg(short[] contentHashCode) {
        Intrinsics.checkParameterIsNotNull(contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode(contentHashCode);
    }

    @JvmStatic
    /* renamed from: contentToString--ajY-9A  reason: not valid java name */
    public static final String m392contentToStringajY9A(int[] contentToString) {
        Intrinsics.checkParameterIsNotNull(contentToString, "$this$contentToString");
        return CollectionsKt.joinToString$default(UIntArray.m182boximpl(contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }

    @JvmStatic
    /* renamed from: contentToString-QwZRm1k  reason: not valid java name */
    public static final String m394contentToStringQwZRm1k(long[] contentToString) {
        Intrinsics.checkParameterIsNotNull(contentToString, "$this$contentToString");
        return CollectionsKt.joinToString$default(ULongArray.m251boximpl(contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }

    @JvmStatic
    /* renamed from: contentToString-GBYM_sE  reason: not valid java name */
    public static final String m393contentToStringGBYM_sE(byte[] contentToString) {
        Intrinsics.checkParameterIsNotNull(contentToString, "$this$contentToString");
        return CollectionsKt.joinToString$default(UByteArray.m113boximpl(contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }

    @JvmStatic
    /* renamed from: contentToString-rL5Bavg  reason: not valid java name */
    public static final String m395contentToStringrL5Bavg(short[] contentToString) {
        Intrinsics.checkParameterIsNotNull(contentToString, "$this$contentToString");
        return CollectionsKt.joinToString$default(UShortArray.m346boximpl(contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }

    @JvmStatic
    /* renamed from: toTypedArray--ajY-9A  reason: not valid java name */
    public static final UInt[] m400toTypedArrayajY9A(int[] toTypedArray) {
        Intrinsics.checkParameterIsNotNull(toTypedArray, "$this$toTypedArray");
        int m190getSizeimpl = UIntArray.m190getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[m190getSizeimpl];
        for (int i = 0; i < m190getSizeimpl; i++) {
            int index = i;
            uIntArr[i] = UInt.m132boximpl(UIntArray.m189getimpl(toTypedArray, index));
        }
        return uIntArr;
    }

    @JvmStatic
    /* renamed from: toTypedArray-QwZRm1k  reason: not valid java name */
    public static final ULong[] m402toTypedArrayQwZRm1k(long[] toTypedArray) {
        Intrinsics.checkParameterIsNotNull(toTypedArray, "$this$toTypedArray");
        int m259getSizeimpl = ULongArray.m259getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[m259getSizeimpl];
        for (int i = 0; i < m259getSizeimpl; i++) {
            int index = i;
            uLongArr[i] = ULong.m201boximpl(ULongArray.m258getimpl(toTypedArray, index));
        }
        return uLongArr;
    }

    @JvmStatic
    /* renamed from: toTypedArray-GBYM_sE  reason: not valid java name */
    public static final UByte[] m401toTypedArrayGBYM_sE(byte[] toTypedArray) {
        Intrinsics.checkParameterIsNotNull(toTypedArray, "$this$toTypedArray");
        int m121getSizeimpl = UByteArray.m121getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[m121getSizeimpl];
        for (int i = 0; i < m121getSizeimpl; i++) {
            int index = i;
            uByteArr[i] = UByte.m65boximpl(UByteArray.m120getimpl(toTypedArray, index));
        }
        return uByteArr;
    }

    @JvmStatic
    /* renamed from: toTypedArray-rL5Bavg  reason: not valid java name */
    public static final UShort[] m403toTypedArrayrL5Bavg(short[] toTypedArray) {
        Intrinsics.checkParameterIsNotNull(toTypedArray, "$this$toTypedArray");
        int m354getSizeimpl = UShortArray.m354getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[m354getSizeimpl];
        for (int i = 0; i < m354getSizeimpl; i++) {
            int index = i;
            uShortArr[i] = UShort.m298boximpl(UShortArray.m353getimpl(toTypedArray, index));
        }
        return uShortArr;
    }
}
