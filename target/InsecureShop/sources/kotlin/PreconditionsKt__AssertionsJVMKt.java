package kotlin;

import kotlin.jvm.functions.Function0;
/* compiled from: AssertionsJVM.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\b¨\u0006\u0007"}, m19d2 = {"assert", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "kotlin-stdlib"}, m18k = 5, m17mv = {1, 1, 16}, m15xi = 1, m14xs = "kotlin/PreconditionsKt")
/* loaded from: classes.dex */
class PreconditionsKt__AssertionsJVMKt {
    /* renamed from: assert  reason: not valid java name */
    private static final void m50assert(boolean value) {
        if (_Assertions.ENABLED && !value) {
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: assert  reason: not valid java name */
    private static final void m51assert(boolean value, Function0<? extends Object> function0) {
        if (_Assertions.ENABLED && !value) {
            Object message = function0.invoke();
            throw new AssertionError(message);
        }
    }
}
