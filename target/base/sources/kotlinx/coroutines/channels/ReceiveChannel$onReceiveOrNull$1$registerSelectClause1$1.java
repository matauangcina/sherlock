package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Add missing generic type declarations: [R, E] */
/* compiled from: Channel.kt */
@Metadata(m23d1 = {"\u0000\b\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0006\b\u0001\u0010\u0002 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m22d2 = {"<anonymous>", "R", "E", "it", "Lkotlinx/coroutines/channels/ChannelResult;"}, m21k = 3, m20mv = {1, 6, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", m13f = "Channel.kt", m12i = {}, m11l = {375}, m10m = "invokeSuspend", m9n = {}, m8s = {})
/* loaded from: classes5.dex */
final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1<E, R> extends SuspendLambda implements Function2<ChannelResult<? extends E>, Continuation<? super R>, Object> {
    final /* synthetic */ Function2<E, Continuation<? super R>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> continuation) {
        super(2, continuation);
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.$block, continuation);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.L$0 = obj;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1774invokeWpGqRn0(((ChannelResult) obj).m1770unboximpl(), (Continuation) obj2);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m1774invokeWpGqRn0(Object obj, Continuation<? super R> continuation) {
        return ((ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1) create(ChannelResult.m1758boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Object it = ((ChannelResult) this.L$0).m1770unboximpl();
                Throwable it2 = ChannelResult.m1762exceptionOrNullimpl(it);
                if (it2 != null) {
                    throw it2;
                }
                Object m1763getOrNullimpl = ChannelResult.m1763getOrNullimpl(it);
                this.label = 1;
                Object it3 = this.$block.invoke(m1763getOrNullimpl, this);
                return it3 == coroutine_suspended ? coroutine_suspended : it3;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
