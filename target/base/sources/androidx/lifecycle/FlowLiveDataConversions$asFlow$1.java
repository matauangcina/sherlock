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
import kotlinx.coroutines.channels.ProducerScope;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: FlowLiveData.kt */
@Metadata(m23d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m22d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, m21k = 3, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m13f = "FlowLiveData.kt", m12i = {0, 0}, m11l = {110, 114}, m10m = "invokeSuspend", m9n = {"$this$callbackFlow", "observer"}, m8s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class FlowLiveDataConversions$asFlow$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, Continuation<? super FlowLiveDataConversions$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, continuation);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((ProducerScope) ((ProducerScope) obj), continuation);
    }

    public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return ((FlowLiveDataConversions$asFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 0
            switch(r1) {
                case 0: goto L24;
                case 1: goto L17;
                case 2: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L12:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L71
        L17:
            r1 = r9
            java.lang.Object r3 = r1.L$1
            androidx.lifecycle.Observer r3 = (androidx.lifecycle.Observer) r3
            java.lang.Object r4 = r1.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L56
        L24:
            kotlin.ResultKt.throwOnFailure(r10)
            r1 = r9
            java.lang.Object r3 = r1.L$0
            r4 = r3
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0 r3 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0
            r3.<init>()
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r5 = r5.getImmediate()
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r6 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<T> r7 = r1.$this_asFlow
            r6.<init>(r7, r3, r2)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = r1
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r1.L$0 = r4
            r1.L$1 = r3
            r8 = 1
            r1.label = r8
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r5, r6, r7)
            if (r5 != r0) goto L56
            return r0
        L56:
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r5 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            androidx.lifecycle.LiveData<T> r6 = r1.$this_asFlow
            r5.<init>()
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r6 = r1
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r1.L$0 = r2
            r1.L$1 = r2
            r2 = 2
            r1.label = r2
            java.lang.Object r2 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r4, r5, r6)
            if (r2 != r0) goto L70
            return r0
        L70:
            r0 = r1
        L71:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowLiveData.kt */
    @Metadata(m23d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m22d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m21k = 3, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m14c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m13f = "FlowLiveData.kt", m12i = {}, m11l = {}, m10m = "invokeSuspend", m9n = {}, m8s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 */
    /* loaded from: classes.dex */
    public static final class C03901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03901(LiveData<T> liveData, Observer<T> observer, Continuation<? super C03901> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C03901(this.$this_asFlow, this.$observer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C03901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.$this_asFlow.observeForever(this.$observer);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
