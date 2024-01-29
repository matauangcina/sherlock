package kotlin.reflect;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: KClasses.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, m19d2 = {"cast", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KClass;", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "kotlin-stdlib"}, m18k = 2, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class KClasses {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T cast(KClass<T> cast, Object value) {
        Intrinsics.checkParameterIsNotNull(cast, "$this$cast");
        if (!cast.isInstance(value)) {
            throw new ClassCastException("Value cannot be cast to " + cast.getQualifiedName());
        } else if (value != 0) {
            return value;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T safeCast(KClass<T> safeCast, Object value) {
        Intrinsics.checkParameterIsNotNull(safeCast, "$this$safeCast");
        if (safeCast.isInstance(value)) {
            if (value != 0) {
                return value;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
        return null;
    }
}
