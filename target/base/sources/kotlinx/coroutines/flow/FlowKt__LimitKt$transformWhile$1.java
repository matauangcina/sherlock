package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Limit.kt */
@Metadata(m23d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m22d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, m21k = 3, m20mv = {1, 6, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m13f = "Limit.kt", m12i = {0}, m11l = {152}, m10m = "invokeSuspend", m9n = {"collector$iv"}, m8s = {"L$0"})
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$transformWhile$1<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_transformWhile;
    final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super FlowKt__LimitKt$transformWhile$1> continuation) {
        super(2, continuation);
        this.$this_transformWhile = flow;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, continuation);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) ((FlowCollector) obj), continuation);
    }

    public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowKt__LimitKt$transformWhile$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        C1414xdf1aa1b6 collector$iv;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FlowCollector $this$flow = (FlowCollector) this.L$0;
                Flow $this$collectWhile$iv = this.$this_transformWhile;
                C1414xdf1aa1b6 collector$iv2 = new C1414xdf1aa1b6(this.$transform, $this$flow);
                try {
                    this.L$0 = collector$iv2;
                    this.label = 1;
                    if ($this$collectWhile$iv.collect(collector$iv2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (AbortFlowException e) {
                    e$iv = e;
                    collector$iv = collector$iv2;
                    FlowExceptions_commonKt.checkOwnership(e$iv, collector$iv);
                    return Unit.INSTANCE;
                }
            case 1:
                collector$iv = (C1414xdf1aa1b6) this.L$0;
                try {
                    ResultKt.throwOnFailure($result);
                } catch (AbortFlowException e2) {
                    e$iv = e2;
                    FlowExceptions_commonKt.checkOwnership(e$iv, collector$iv);
                    return Unit.INSTANCE;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
