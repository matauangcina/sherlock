package androidx.lifecycle;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoroutineLiveData.kt */
@Metadata(m23d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m22d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m21k = 3, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m13f = "CoroutineLiveData.kt", m12i = {}, m11l = {99}, m10m = "invokeSuspend", m9n = {}, m8s = {})
/* loaded from: classes.dex */
final class LiveDataScopeImpl$emit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(LiveDataScopeImpl<T> liveDataScopeImpl, T t, Continuation<? super LiveDataScopeImpl$emit$2> continuation) {
        super(2, continuation);
        this.this$0 = liveDataScopeImpl;
        this.$value = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveDataScopeImpl$emit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        LiveDataScopeImpl$emit$2 liveDataScopeImpl$emit$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.this$0.getTarget$lifecycle_livedata_ktx_release().clearSource$lifecycle_livedata_ktx_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScopeImpl$emit$2 = this;
                break;
            case 1:
                liveDataScopeImpl$emit$2 = this;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        liveDataScopeImpl$emit$2.this$0.getTarget$lifecycle_livedata_ktx_release().setValue(liveDataScopeImpl$emit$2.$value);
        return Unit.INSTANCE;
    }
}
