package androidx.core.p003os;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Trace.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m19d2 = {"trace", ExifInterface.GPS_DIRECTION_TRUE, "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core-ktx_release"}, m18k = 2, m17mv = {1, 1, 16})
/* renamed from: androidx.core.os.TraceKt */
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String sectionName, Function0<? extends T> block) {
        Intrinsics.checkParameterIsNotNull(sectionName, "sectionName");
        Intrinsics.checkParameterIsNotNull(block, "block");
        TraceCompat.beginSection(sectionName);
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            TraceCompat.endSection();
            InlineMarker.finallyEnd(1);
        }
    }
}
