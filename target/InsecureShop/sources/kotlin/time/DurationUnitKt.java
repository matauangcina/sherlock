package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"kotlin/time/DurationUnitKt__DurationUnitJvmKt", "kotlin/time/DurationUnitKt__DurationUnitKt"}, m18k = 4, m17mv = {1, 1, 16}, m15xi = 1)
/* loaded from: classes.dex */
public final class DurationUnitKt extends DurationUnitKt__DurationUnitKt {

    @Metadata(m21bv = {1, 0, 3}, m18k = 3, m17mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            $EnumSwitchMapping$0[TimeUnit.MICROSECONDS.ordinal()] = 2;
            $EnumSwitchMapping$0[TimeUnit.MILLISECONDS.ordinal()] = 3;
            $EnumSwitchMapping$0[TimeUnit.SECONDS.ordinal()] = 4;
            $EnumSwitchMapping$0[TimeUnit.MINUTES.ordinal()] = 5;
            $EnumSwitchMapping$0[TimeUnit.HOURS.ordinal()] = 6;
            $EnumSwitchMapping$0[TimeUnit.DAYS.ordinal()] = 7;
        }
    }

    private DurationUnitKt() {
    }
}
