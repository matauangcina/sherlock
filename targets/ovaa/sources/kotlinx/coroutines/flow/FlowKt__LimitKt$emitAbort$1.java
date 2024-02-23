package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
@Metadata(m29k = 3, m28mv = {1, 6, 0}, m26xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m22c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m21f = "Limit.kt", m20i = {0}, m19l = {73}, m18m = "emitAbort$FlowKt__LimitKt", m17n = {"$this$emitAbort"}, m16s = {"L$0"})
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$emitAbort$1(Continuation<? super FlowKt__LimitKt$emitAbort$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object emitAbort$FlowKt__LimitKt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        emitAbort$FlowKt__LimitKt = FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(null, null, this);
        return emitAbort$FlowKt__LimitKt;
    }
}
