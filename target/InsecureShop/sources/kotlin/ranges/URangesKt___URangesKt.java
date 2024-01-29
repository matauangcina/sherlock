package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
/* compiled from: _URanges.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0015\u0010C\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u001c\u0010C\u001a\u00020\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010C\u001a\u00020\b*\u00020/H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010C\u001a\u00020\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001\u0000\u001a\u0019\u0010I\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001\u0000\u001a\u0019\u0010I\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000\u001a\f\u0010J\u001a\u000208*\u000208H\u0007\u001a\f\u0010J\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010K\u001a\u000208*\u0002082\u0006\u0010K\u001a\u00020LH\u0087\u0004\u001a\u0015\u0010K\u001a\u00020>*\u00020>2\u0006\u0010K\u001a\u00020MH\u0087\u0004\u001a\u001f\u0010N\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a\u001f\u0010N\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001f\u0010N\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u001f\u0010N\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, m19d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, m18k = 5, m17mv = {1, 1, 16}, m15xi = 1, m14xs = "kotlin/ranges/URangesKt")
/* loaded from: classes.dex */
class URangesKt___URangesKt {
    private static final int random(UIntRange $this$random) {
        return URangesKt.random($this$random, Random.Default);
    }

    private static final long random(ULongRange $this$random) {
        return URangesKt.random($this$random, Random.Default);
    }

    public static final int random(UIntRange random, Random random2) {
        Intrinsics.checkParameterIsNotNull(random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random2, "random");
        try {
            return URandomKt.nextUInt(random2, random);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(ULongRange random, Random random2) {
        Intrinsics.checkParameterIsNotNull(random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random2, "random");
        try {
            return URandomKt.nextULong(random2, random);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    private static final UInt randomOrNull(UIntRange $this$randomOrNull) {
        return URangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    private static final ULong randomOrNull(ULongRange $this$randomOrNull) {
        return URangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    public static final UInt randomOrNull(UIntRange randomOrNull, Random random) {
        Intrinsics.checkParameterIsNotNull(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return UInt.m132boximpl(URandomKt.nextUInt(random, randomOrNull));
    }

    public static final ULong randomOrNull(ULongRange randomOrNull, Random random) {
        Intrinsics.checkParameterIsNotNull(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return ULong.m201boximpl(URandomKt.nextULong(random, randomOrNull));
    }

    /* renamed from: contains-biwQdVI  reason: not valid java name */
    private static final boolean m984containsbiwQdVI(UIntRange contains, UInt element) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return element != null && contains.m962containsWZ4Q5Ns(element.m181unboximpl());
    }

    /* renamed from: contains-GYNo2lE  reason: not valid java name */
    private static final boolean m980containsGYNo2lE(ULongRange contains, ULong element) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return element != null && contains.m964containsVKZWuLQ(element.m250unboximpl());
    }

    /* renamed from: contains-68kG9v0  reason: not valid java name */
    public static final boolean m979contains68kG9v0(UIntRange contains, byte value) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return contains.m962containsWZ4Q5Ns(UInt.m138constructorimpl(value & UByte.MAX_VALUE));
    }

    /* renamed from: contains-ULb-yJY  reason: not valid java name */
    public static final boolean m982containsULbyJY(ULongRange contains, byte value) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return contains.m964containsVKZWuLQ(ULong.m207constructorimpl(value & 255));
    }

    /* renamed from: contains-Gab390E  reason: not valid java name */
    public static final boolean m981containsGab390E(ULongRange contains, int value) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return contains.m964containsVKZWuLQ(ULong.m207constructorimpl(value & 4294967295L));
    }

    /* renamed from: contains-fz5IDCE  reason: not valid java name */
    public static final boolean m985containsfz5IDCE(UIntRange contains, long value) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return ULong.m207constructorimpl(value >>> 32) == 0 && contains.m962containsWZ4Q5Ns(UInt.m138constructorimpl((int) value));
    }

    /* renamed from: contains-ZsK3CEQ  reason: not valid java name */
    public static final boolean m983containsZsK3CEQ(UIntRange contains, short value) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return contains.m962containsWZ4Q5Ns(UInt.m138constructorimpl(65535 & value));
    }

    /* renamed from: contains-uhHAxoY  reason: not valid java name */
    public static final boolean m986containsuhHAxoY(ULongRange contains, short value) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        return contains.m964containsVKZWuLQ(ULong.m207constructorimpl(value & 65535));
    }

    /* renamed from: downTo-Kr8caGY  reason: not valid java name */
    public static final UIntProgression m989downToKr8caGY(byte $this$downTo, byte to) {
        return UIntProgression.Companion.m961fromClosedRangeNkh28Cs(UInt.m138constructorimpl($this$downTo & UByte.MAX_VALUE), UInt.m138constructorimpl(to & UByte.MAX_VALUE), -1);
    }

    /* renamed from: downTo-J1ME1BU  reason: not valid java name */
    public static final UIntProgression m988downToJ1ME1BU(int $this$downTo, int to) {
        return UIntProgression.Companion.m961fromClosedRangeNkh28Cs($this$downTo, to, -1);
    }

    /* renamed from: downTo-eb3DHEI  reason: not valid java name */
    public static final ULongProgression m990downToeb3DHEI(long $this$downTo, long to) {
        return ULongProgression.Companion.m963fromClosedRange7ftBX0g($this$downTo, to, -1L);
    }

    /* renamed from: downTo-5PvTz6A  reason: not valid java name */
    public static final UIntProgression m987downTo5PvTz6A(short $this$downTo, short to) {
        return UIntProgression.Companion.m961fromClosedRangeNkh28Cs(UInt.m138constructorimpl($this$downTo & UShort.MAX_VALUE), UInt.m138constructorimpl(65535 & to), -1);
    }

    public static final UIntProgression reversed(UIntProgression reversed) {
        Intrinsics.checkParameterIsNotNull(reversed, "$this$reversed");
        return UIntProgression.Companion.m961fromClosedRangeNkh28Cs(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final ULongProgression reversed(ULongProgression reversed) {
        Intrinsics.checkParameterIsNotNull(reversed, "$this$reversed");
        return ULongProgression.Companion.m963fromClosedRange7ftBX0g(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final UIntProgression step(UIntProgression step, int step2) {
        Intrinsics.checkParameterIsNotNull(step, "$this$step");
        RangesKt.checkStepIsPositive(step2 > 0, Integer.valueOf(step2));
        return UIntProgression.Companion.m961fromClosedRangeNkh28Cs(step.getFirst(), step.getLast(), step.getStep() > 0 ? step2 : -step2);
    }

    public static final ULongProgression step(ULongProgression step, long step2) {
        Intrinsics.checkParameterIsNotNull(step, "$this$step");
        RangesKt.checkStepIsPositive(step2 > 0, Long.valueOf(step2));
        return ULongProgression.Companion.m963fromClosedRange7ftBX0g(step.getFirst(), step.getLast(), step.getStep() > 0 ? step2 : -step2);
    }

    /* renamed from: until-Kr8caGY  reason: not valid java name */
    public static final UIntRange m993untilKr8caGY(byte $this$until, byte to) {
        return Intrinsics.compare(to & UByte.MAX_VALUE, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m138constructorimpl($this$until & UByte.MAX_VALUE), UInt.m138constructorimpl(UInt.m138constructorimpl(to & UByte.MAX_VALUE) - 1), null);
    }

    /* renamed from: until-J1ME1BU  reason: not valid java name */
    public static final UIntRange m992untilJ1ME1BU(int $this$until, int to) {
        return UnsignedKt.uintCompare(to, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange($this$until, UInt.m138constructorimpl(to - 1), null);
    }

    /* renamed from: until-eb3DHEI  reason: not valid java name */
    public static final ULongRange m994untileb3DHEI(long $this$until, long to) {
        return UnsignedKt.ulongCompare(to, 0L) <= 0 ? ULongRange.Companion.getEMPTY() : new ULongRange($this$until, ULong.m207constructorimpl(to - ULong.m207constructorimpl(1 & 4294967295L)), null);
    }

    /* renamed from: until-5PvTz6A  reason: not valid java name */
    public static final UIntRange m991until5PvTz6A(short $this$until, short to) {
        return Intrinsics.compare(to & UShort.MAX_VALUE, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m138constructorimpl($this$until & UShort.MAX_VALUE), UInt.m138constructorimpl(UInt.m138constructorimpl(65535 & to) - 1), null);
    }

    /* renamed from: coerceAtLeast-J1ME1BU  reason: not valid java name */
    public static final int m966coerceAtLeastJ1ME1BU(int $this$coerceAtLeast, int minimumValue) {
        return UnsignedKt.uintCompare($this$coerceAtLeast, minimumValue) < 0 ? minimumValue : $this$coerceAtLeast;
    }

    /* renamed from: coerceAtLeast-eb3DHEI  reason: not valid java name */
    public static final long m968coerceAtLeasteb3DHEI(long $this$coerceAtLeast, long minimumValue) {
        return UnsignedKt.ulongCompare($this$coerceAtLeast, minimumValue) < 0 ? minimumValue : $this$coerceAtLeast;
    }

    /* renamed from: coerceAtLeast-Kr8caGY  reason: not valid java name */
    public static final byte m967coerceAtLeastKr8caGY(byte $this$coerceAtLeast, byte minimumValue) {
        return Intrinsics.compare($this$coerceAtLeast & UByte.MAX_VALUE, minimumValue & UByte.MAX_VALUE) < 0 ? minimumValue : $this$coerceAtLeast;
    }

    /* renamed from: coerceAtLeast-5PvTz6A  reason: not valid java name */
    public static final short m965coerceAtLeast5PvTz6A(short $this$coerceAtLeast, short minimumValue) {
        return Intrinsics.compare($this$coerceAtLeast & UShort.MAX_VALUE, 65535 & minimumValue) < 0 ? minimumValue : $this$coerceAtLeast;
    }

    /* renamed from: coerceAtMost-J1ME1BU  reason: not valid java name */
    public static final int m970coerceAtMostJ1ME1BU(int $this$coerceAtMost, int maximumValue) {
        return UnsignedKt.uintCompare($this$coerceAtMost, maximumValue) > 0 ? maximumValue : $this$coerceAtMost;
    }

    /* renamed from: coerceAtMost-eb3DHEI  reason: not valid java name */
    public static final long m972coerceAtMosteb3DHEI(long $this$coerceAtMost, long maximumValue) {
        return UnsignedKt.ulongCompare($this$coerceAtMost, maximumValue) > 0 ? maximumValue : $this$coerceAtMost;
    }

    /* renamed from: coerceAtMost-Kr8caGY  reason: not valid java name */
    public static final byte m971coerceAtMostKr8caGY(byte $this$coerceAtMost, byte maximumValue) {
        return Intrinsics.compare($this$coerceAtMost & UByte.MAX_VALUE, maximumValue & UByte.MAX_VALUE) > 0 ? maximumValue : $this$coerceAtMost;
    }

    /* renamed from: coerceAtMost-5PvTz6A  reason: not valid java name */
    public static final short m969coerceAtMost5PvTz6A(short $this$coerceAtMost, short maximumValue) {
        return Intrinsics.compare($this$coerceAtMost & UShort.MAX_VALUE, 65535 & maximumValue) > 0 ? maximumValue : $this$coerceAtMost;
    }

    /* renamed from: coerceIn-WZ9TVnA  reason: not valid java name */
    public static final int m975coerceInWZ9TVnA(int $this$coerceIn, int minimumValue, int maximumValue) {
        if (UnsignedKt.uintCompare(minimumValue, maximumValue) <= 0) {
            return UnsignedKt.uintCompare($this$coerceIn, minimumValue) < 0 ? minimumValue : UnsignedKt.uintCompare($this$coerceIn, maximumValue) > 0 ? maximumValue : $this$coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UInt.m175toStringimpl(maximumValue) + " is less than minimum " + UInt.m175toStringimpl(minimumValue) + '.');
    }

    /* renamed from: coerceIn-sambcqE  reason: not valid java name */
    public static final long m977coerceInsambcqE(long $this$coerceIn, long minimumValue, long maximumValue) {
        if (UnsignedKt.ulongCompare(minimumValue, maximumValue) <= 0) {
            return UnsignedKt.ulongCompare($this$coerceIn, minimumValue) < 0 ? minimumValue : UnsignedKt.ulongCompare($this$coerceIn, maximumValue) > 0 ? maximumValue : $this$coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ULong.m244toStringimpl(maximumValue) + " is less than minimum " + ULong.m244toStringimpl(minimumValue) + '.');
    }

    /* renamed from: coerceIn-b33U2AM  reason: not valid java name */
    public static final byte m976coerceInb33U2AM(byte $this$coerceIn, byte minimumValue, byte maximumValue) {
        if (Intrinsics.compare(minimumValue & UByte.MAX_VALUE, maximumValue & UByte.MAX_VALUE) <= 0) {
            return Intrinsics.compare($this$coerceIn & UByte.MAX_VALUE, minimumValue & UByte.MAX_VALUE) < 0 ? minimumValue : Intrinsics.compare($this$coerceIn & UByte.MAX_VALUE, maximumValue & UByte.MAX_VALUE) > 0 ? maximumValue : $this$coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UByte.m106toStringimpl(maximumValue) + " is less than minimum " + UByte.m106toStringimpl(minimumValue) + '.');
    }

    /* renamed from: coerceIn-VKSA0NQ  reason: not valid java name */
    public static final short m974coerceInVKSA0NQ(short $this$coerceIn, short minimumValue, short maximumValue) {
        if (Intrinsics.compare(minimumValue & UShort.MAX_VALUE, maximumValue & UShort.MAX_VALUE) <= 0) {
            return Intrinsics.compare($this$coerceIn & UShort.MAX_VALUE, minimumValue & UShort.MAX_VALUE) < 0 ? minimumValue : Intrinsics.compare($this$coerceIn & UShort.MAX_VALUE, 65535 & maximumValue) > 0 ? maximumValue : $this$coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UShort.m339toStringimpl(maximumValue) + " is less than minimum " + UShort.m339toStringimpl(minimumValue) + '.');
    }

    /* renamed from: coerceIn-wuiCnnA  reason: not valid java name */
    public static final int m978coerceInwuiCnnA(int $this$coerceIn, ClosedRange<UInt> range) {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt.coerceIn(UInt.m132boximpl($this$coerceIn), (ClosedFloatingPointRange<UInt>) range)).m181unboximpl();
        }
        if (!range.isEmpty()) {
            return UnsignedKt.uintCompare($this$coerceIn, range.getStart().m181unboximpl()) < 0 ? range.getStart().m181unboximpl() : UnsignedKt.uintCompare($this$coerceIn, range.getEndInclusive().m181unboximpl()) > 0 ? range.getEndInclusive().m181unboximpl() : $this$coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: coerceIn-JPwROB0  reason: not valid java name */
    public static final long m973coerceInJPwROB0(long $this$coerceIn, ClosedRange<ULong> range) {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt.coerceIn(ULong.m201boximpl($this$coerceIn), (ClosedFloatingPointRange<ULong>) range)).m250unboximpl();
        }
        if (!range.isEmpty()) {
            return UnsignedKt.ulongCompare($this$coerceIn, range.getStart().m250unboximpl()) < 0 ? range.getStart().m250unboximpl() : UnsignedKt.ulongCompare($this$coerceIn, range.getEndInclusive().m250unboximpl()) > 0 ? range.getEndInclusive().m250unboximpl() : $this$coerceIn;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
