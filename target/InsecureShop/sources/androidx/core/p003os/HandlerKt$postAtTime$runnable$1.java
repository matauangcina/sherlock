package androidx.core.p003os;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Handler.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m19d2 = {"<anonymous>", "", "run"}, m18k = 3, m17mv = {1, 1, 16})
/* renamed from: androidx.core.os.HandlerKt$postAtTime$runnable$1 */
/* loaded from: classes.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ Function0 $action;

    public HandlerKt$postAtTime$runnable$1(Function0 function0) {
        this.$action = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
