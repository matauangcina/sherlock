package androidx.activity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullyDrawnReporter.kt */
@Metadata(m29k = 3, m28mv = {1, 8, 0}, m26xi = 176)
@DebugMetadata(m22c = "androidx.activity.FullyDrawnReporterKt", m21f = "FullyDrawnReporter.kt", m20i = {0}, m19l = {185}, m18m = "reportWhenComplete", m17n = {"$this$reportWhenComplete"}, m16s = {"L$0"})
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullyDrawnReporterKt$reportWhenComplete$1(Continuation<? super FullyDrawnReporterKt$reportWhenComplete$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }
}
