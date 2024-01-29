package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@Metadata(m21k = 3, m20mv = {1, 6, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m13f = "Deprecated.kt", m12i = {0, 0, 1, 1, 1}, m11l = {97, 100}, m10m = "last", m9n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m8s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
public final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$last$1(Continuation<? super ChannelsKt__DeprecatedKt$last$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object last;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        last = ChannelsKt__DeprecatedKt.last(null, this);
        return last;
    }
}
