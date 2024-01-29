package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class PrimitiveConstructor<KeyT extends Key, PrimitiveT> {
    private final Class<KeyT> keyClass;
    private final Class<PrimitiveT> primitiveClass;

    /* loaded from: classes.dex */
    public interface PrimitiveConstructionFunction<KeyT extends Key, PrimitiveT> {
        PrimitiveT constructPrimitive(KeyT key) throws GeneralSecurityException;
    }

    public abstract PrimitiveT constructPrimitive(KeyT key) throws GeneralSecurityException;

    private PrimitiveConstructor(Class<KeyT> keyClass, Class<PrimitiveT> primitiveClass) {
        this.keyClass = keyClass;
        this.primitiveClass = primitiveClass;
    }

    public Class<KeyT> getKeyClass() {
        return this.keyClass;
    }

    public Class<PrimitiveT> getPrimitiveClass() {
        return this.primitiveClass;
    }

    public static <KeyT extends Key, PrimitiveT> PrimitiveConstructor<KeyT, PrimitiveT> create(final PrimitiveConstructionFunction<KeyT, PrimitiveT> function, Class<KeyT> keyClass, Class<PrimitiveT> primitiveClass) {
        return (PrimitiveConstructor<KeyT, PrimitiveT>) new PrimitiveConstructor<KeyT, PrimitiveT>(keyClass, primitiveClass) { // from class: com.google.crypto.tink.internal.PrimitiveConstructor.1
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor
            public PrimitiveT constructPrimitive(KeyT key) throws GeneralSecurityException {
                return (PrimitiveT) function.constructPrimitive(key);
            }
        };
    }
}
