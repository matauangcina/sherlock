package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;
@Immutable
/* loaded from: classes.dex */
public interface Serialization {
    Bytes getObjectIdentifier();
}
