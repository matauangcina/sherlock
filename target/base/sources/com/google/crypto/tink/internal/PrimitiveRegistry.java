package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class PrimitiveRegistry {
    private final Map<PrimitiveConstructorIndex, PrimitiveConstructor<?, ?>> primitiveConstructorMap;
    private final Map<Class<?>, PrimitiveWrapper<?, ?>> primitiveWrapperMap;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final Map<PrimitiveConstructorIndex, PrimitiveConstructor<?, ?>> primitiveConstructorMap;
        private final Map<Class<?>, PrimitiveWrapper<?, ?>> primitiveWrapperMap;

        public Builder() {
            this.primitiveConstructorMap = new HashMap();
            this.primitiveWrapperMap = new HashMap();
        }

        public Builder(PrimitiveRegistry registry) {
            this.primitiveConstructorMap = new HashMap(registry.primitiveConstructorMap);
            this.primitiveWrapperMap = new HashMap(registry.primitiveWrapperMap);
        }

        public <KeyT extends Key, PrimitiveT> Builder registerPrimitiveConstructor(PrimitiveConstructor<KeyT, PrimitiveT> primitiveConstructor) throws GeneralSecurityException {
            if (primitiveConstructor == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            PrimitiveConstructorIndex index = new PrimitiveConstructorIndex(primitiveConstructor.getKeyClass(), primitiveConstructor.getPrimitiveClass());
            if (this.primitiveConstructorMap.containsKey(index)) {
                PrimitiveConstructor<?, ?> existingConstructor = this.primitiveConstructorMap.get(index);
                if (!existingConstructor.equals(primitiveConstructor) || !primitiveConstructor.equals(existingConstructor)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + index);
                }
            } else {
                this.primitiveConstructorMap.put(index, primitiveConstructor);
            }
            return this;
        }

        public <InputPrimitiveT, WrapperPrimitiveT> Builder registerPrimitiveWrapper(PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> wrapper) throws GeneralSecurityException {
            if (wrapper == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> wrapperClassObject = wrapper.getPrimitiveClass();
            if (this.primitiveWrapperMap.containsKey(wrapperClassObject)) {
                PrimitiveWrapper<?, ?> existingPrimitiveWrapper = this.primitiveWrapperMap.get(wrapperClassObject);
                if (!existingPrimitiveWrapper.equals(wrapper) || !wrapper.equals(existingPrimitiveWrapper)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + wrapperClassObject);
                }
            } else {
                this.primitiveWrapperMap.put(wrapperClassObject, wrapper);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PrimitiveRegistry build() {
            return new PrimitiveRegistry(this);
        }
    }

    private PrimitiveRegistry(Builder builder) {
        this.primitiveConstructorMap = new HashMap(builder.primitiveConstructorMap);
        this.primitiveWrapperMap = new HashMap(builder.primitiveWrapperMap);
    }

    public <KeyT extends Key, PrimitiveT> PrimitiveT getPrimitive(KeyT key, Class<PrimitiveT> primitiveClass) throws GeneralSecurityException {
        PrimitiveConstructorIndex index = new PrimitiveConstructorIndex(key.getClass(), primitiveClass);
        if (!this.primitiveConstructorMap.containsKey(index)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + index + " available");
        }
        return (PrimitiveT) this.primitiveConstructorMap.get(index).constructPrimitive(key);
    }

    public Class<?> getInputPrimitiveClass(Class<?> wrapperClassObject) throws GeneralSecurityException {
        if (!this.primitiveWrapperMap.containsKey(wrapperClassObject)) {
            throw new GeneralSecurityException("No input primitive class for " + wrapperClassObject + " available");
        }
        return this.primitiveWrapperMap.get(wrapperClassObject).getInputPrimitiveClass();
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(PrimitiveSet<InputPrimitiveT> primitives, Class<WrapperPrimitiveT> wrapperClassObject) throws GeneralSecurityException {
        if (!this.primitiveWrapperMap.containsKey(wrapperClassObject)) {
            throw new GeneralSecurityException("No wrapper found for " + wrapperClassObject);
        }
        PrimitiveWrapper<?, ?> primitiveWrapper = this.primitiveWrapperMap.get(wrapperClassObject);
        if (!primitives.getPrimitiveClass().equals(primitiveWrapper.getInputPrimitiveClass()) || !primitiveWrapper.getInputPrimitiveClass().equals(primitives.getPrimitiveClass())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        return (WrapperPrimitiveT) primitiveWrapper.wrap(primitives);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PrimitiveConstructorIndex {
        private final Class<?> keyClass;
        private final Class<?> primitiveClass;

        private PrimitiveConstructorIndex(Class<?> keyClass, Class<?> primitiveClass) {
            this.keyClass = keyClass;
            this.primitiveClass = primitiveClass;
        }

        public boolean equals(Object o) {
            if (o instanceof PrimitiveConstructorIndex) {
                PrimitiveConstructorIndex other = (PrimitiveConstructorIndex) o;
                return other.keyClass.equals(this.keyClass) && other.primitiveClass.equals(this.primitiveClass);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.keyClass, this.primitiveClass);
        }

        public String toString() {
            return this.keyClass.getSimpleName() + " with primitive type: " + this.primitiveClass.getSimpleName();
        }
    }
}
