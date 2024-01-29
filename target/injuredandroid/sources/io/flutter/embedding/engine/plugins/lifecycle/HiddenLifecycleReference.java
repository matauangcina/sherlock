package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC0868e;
@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final AbstractC0868e lifecycle;

    public HiddenLifecycleReference(AbstractC0868e abstractC0868e) {
        this.lifecycle = abstractC0868e;
    }

    public AbstractC0868e getLifecycle() {
        return this.lifecycle;
    }
}
