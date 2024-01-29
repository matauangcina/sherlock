package androidx.core.database;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Cursor.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u00008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0015"}, m19d2 = {"getBlobOrNull", "", "Landroid/database/Cursor;", "index", "", "getDoubleOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "getFloatOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "getIntOrNull", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "getLongOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "getShortOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "getStringOrNull", "", "core-ktx_release"}, m18k = 2, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class CursorKt {
    public static final byte[] getBlobOrNull(Cursor getBlobOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getBlobOrNull, "$this$getBlobOrNull");
        if (getBlobOrNull.isNull(index)) {
            return null;
        }
        return getBlobOrNull.getBlob(index);
    }

    public static final Double getDoubleOrNull(Cursor getDoubleOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getDoubleOrNull, "$this$getDoubleOrNull");
        if (getDoubleOrNull.isNull(index)) {
            return null;
        }
        return Double.valueOf(getDoubleOrNull.getDouble(index));
    }

    public static final Float getFloatOrNull(Cursor getFloatOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getFloatOrNull, "$this$getFloatOrNull");
        if (getFloatOrNull.isNull(index)) {
            return null;
        }
        return Float.valueOf(getFloatOrNull.getFloat(index));
    }

    public static final Integer getIntOrNull(Cursor getIntOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getIntOrNull, "$this$getIntOrNull");
        if (getIntOrNull.isNull(index)) {
            return null;
        }
        return Integer.valueOf(getIntOrNull.getInt(index));
    }

    public static final Long getLongOrNull(Cursor getLongOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getLongOrNull, "$this$getLongOrNull");
        if (getLongOrNull.isNull(index)) {
            return null;
        }
        return Long.valueOf(getLongOrNull.getLong(index));
    }

    public static final Short getShortOrNull(Cursor getShortOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getShortOrNull, "$this$getShortOrNull");
        if (getShortOrNull.isNull(index)) {
            return null;
        }
        return Short.valueOf(getShortOrNull.getShort(index));
    }

    public static final String getStringOrNull(Cursor getStringOrNull, int index) {
        Intrinsics.checkParameterIsNotNull(getStringOrNull, "$this$getStringOrNull");
        if (getStringOrNull.isNull(index)) {
            return null;
        }
        return getStringOrNull.getString(index);
    }
}
