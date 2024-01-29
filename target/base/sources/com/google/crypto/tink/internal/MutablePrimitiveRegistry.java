package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class MutablePrimitiveRegistry {
    private static MutablePrimitiveRegistry globalInstance = new MutablePrimitiveRegistry();
    private final AtomicReference<PrimitiveRegistry> registry = new AtomicReference<>(new PrimitiveRegistry.Builder().build());

    public static MutablePrimitiveRegistry globalInstance() {
        return globalInstance;
    }

    public static void resetGlobalInstanceTestOnly() {
        globalInstance = new MutablePrimitiveRegistry();
    }

    MutablePrimitiveRegistry() {
    }

    public synchronized <KeyT extends Key, PrimitiveT> void registerPrimitiveConstructor(PrimitiveConstructor<KeyT, PrimitiveT> constructor) throws GeneralSecurityException {
        PrimitiveRegistry newRegistry = new PrimitiveRegistry.Builder(this.registry.get()).registerPrimitiveConstructor(constructor).build();
        this.registry.set(newRegistry);
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void registerPrimitiveWrapper(PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> wrapper) throws GeneralSecurityException {
        PrimitiveRegistry newRegistry = new PrimitiveRegistry.Builder(this.registry.get()).registerPrimitiveWrapper(wrapper).build();
        this.registry.set(newRegistry);
    }

    public <KeyT extends Key, PrimitiveT> PrimitiveT getPrimitive(KeyT key, Class<PrimitiveT> primitiveClass) throws GeneralSecurityException {
        return (PrimitiveT) this.registry.get().getPrimitive(key, primitiveClass);
    }

    public <WrapperPrimitiveT> Class<?> getInputPrimitiveClass(Class<WrapperPrimitiveT> wrapperClassObject) throws GeneralSecurityException {
        return this.registry.get().getInputPrimitiveClass(wrapperClassObject);
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(PrimitiveSet<InputPrimitiveT> primitives, Class<WrapperPrimitiveT> wrapperClassObject) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.registry.get().wrap(primitives, wrapperClassObject);
    }
}
