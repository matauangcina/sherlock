package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DebugMetadata.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m19d2 = {"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, m18k = 2, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

    public static final StackTraceElement getStackTraceElement(BaseContinuationImpl getStackTraceElementImpl) {
        String moduleAndClass;
        Intrinsics.checkParameterIsNotNull(getStackTraceElementImpl, "$this$getStackTraceElementImpl");
        DebugMetadata debugMetadata = getDebugMetadataAnnotation(getStackTraceElementImpl);
        if (debugMetadata == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadata.m4v());
        int label = getLabel(getStackTraceElementImpl);
        int lineNumber = label < 0 ? -1 : debugMetadata.m8l()[label];
        String moduleName = ModuleNameRetriever.INSTANCE.getModuleName(getStackTraceElementImpl);
        if (moduleName == null) {
            moduleAndClass = debugMetadata.m11c();
        } else {
            moduleAndClass = moduleName + '/' + debugMetadata.m11c();
        }
        return new StackTraceElement(moduleAndClass, debugMetadata.m7m(), debugMetadata.m10f(), lineNumber);
    }

    private static final DebugMetadata getDebugMetadataAnnotation(BaseContinuationImpl $this$getDebugMetadataAnnotation) {
        return (DebugMetadata) $this$getDebugMetadataAnnotation.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int getLabel(BaseContinuationImpl $this$getLabel) {
        try {
            Field field = $this$getLabel.getClass().getDeclaredField("label");
            Intrinsics.checkExpressionValueIsNotNull(field, "field");
            field.setAccessible(true);
            Object obj = field.get($this$getLabel);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception e) {
            return -1;
        }
    }

    private static final void checkDebugMetadataVersion(int expected, int actual) {
        if (actual > expected) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + expected + ", got " + actual + ". Please update the Kotlin standard library.").toString());
        }
    }

    public static final String[] getSpilledVariableFieldMapping(BaseContinuationImpl getSpilledVariableFieldMapping) {
        Intrinsics.checkParameterIsNotNull(getSpilledVariableFieldMapping, "$this$getSpilledVariableFieldMapping");
        DebugMetadata debugMetadata = getDebugMetadataAnnotation(getSpilledVariableFieldMapping);
        if (debugMetadata == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadata.m4v());
        ArrayList res = new ArrayList();
        int label = getLabel(getSpilledVariableFieldMapping);
        int[] m9i = debugMetadata.m9i();
        int length = m9i.length;
        for (int i = 0; i < length; i++) {
            int labelOfIndex = m9i[i];
            if (labelOfIndex == label) {
                res.add(debugMetadata.m5s()[i]);
                res.add(debugMetadata.m6n()[i]);
            }
        }
        ArrayList $this$toTypedArray$iv = res;
        Object[] array = $this$toTypedArray$iv.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
