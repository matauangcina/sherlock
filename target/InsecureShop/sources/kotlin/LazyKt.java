package kotlin;
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, m18k = 4, m17mv = {1, 1, 16}, m15xi = 1)
/* loaded from: classes.dex */
public final class LazyKt extends LazyKt__LazyKt {

    @Metadata(m21bv = {1, 0, 3}, m18k = 3, m17mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            $EnumSwitchMapping$0[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            $EnumSwitchMapping$0[LazyThreadSafetyMode.NONE.ordinal()] = 3;
        }
    }

    private LazyKt() {
    }
}
