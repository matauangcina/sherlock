package kotlinx.coroutines.flow.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Combine.kt */
@Metadata(m21k = 3, m20mv = {1, 6, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m13f = "Combine.kt", m12i = {}, m11l = {35, 36}, m10m = "emit", m9n = {}, m8s = {})
/* loaded from: classes5.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CombineKt$combineInternal$2.C14701.C14711<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C14701.C14711<? super T> c14711, Continuation<? super CombineKt$combineInternal$2$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c14711;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
