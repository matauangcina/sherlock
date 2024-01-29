package kotlin.coroutines;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CoroutineContextImpl.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, m19d2 = {"getPolymorphicElement", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, m18k = 2, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class CoroutineContextImplKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends CoroutineContext.Element> E getPolymorphicElement(CoroutineContext.Element getPolymorphicElement, CoroutineContext.Key<E> key) {
        Intrinsics.checkParameterIsNotNull(getPolymorphicElement, "$this$getPolymorphicElement");
        Intrinsics.checkParameterIsNotNull(key, "key");
        if (key instanceof AbstractCoroutineContextKey) {
            if (((AbstractCoroutineContextKey) key).isSubKey$kotlin_stdlib(getPolymorphicElement.getKey())) {
                E e = (E) ((AbstractCoroutineContextKey) key).tryCast$kotlin_stdlib(getPolymorphicElement);
                if (e instanceof CoroutineContext.Element) {
                    return e;
                }
                return null;
            }
            return null;
        } else if (getPolymorphicElement.getKey() == key) {
            return getPolymorphicElement;
        } else {
            return null;
        }
    }

    public static final CoroutineContext minusPolymorphicKey(CoroutineContext.Element minusPolymorphicKey, CoroutineContext.Key<?> key) {
        Intrinsics.checkParameterIsNotNull(minusPolymorphicKey, "$this$minusPolymorphicKey");
        Intrinsics.checkParameterIsNotNull(key, "key");
        return key instanceof AbstractCoroutineContextKey ? (!((AbstractCoroutineContextKey) key).isSubKey$kotlin_stdlib(minusPolymorphicKey.getKey()) || ((AbstractCoroutineContextKey) key).tryCast$kotlin_stdlib(minusPolymorphicKey) == null) ? minusPolymorphicKey : EmptyCoroutineContext.INSTANCE : minusPolymorphicKey.getKey() == key ? EmptyCoroutineContext.INSTANCE : minusPolymorphicKey;
    }
}
