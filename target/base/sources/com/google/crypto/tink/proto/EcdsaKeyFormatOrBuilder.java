package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes.dex */
public interface EcdsaKeyFormatOrBuilder extends MessageLiteOrBuilder {
    EcdsaParams getParams();

    int getVersion();

    boolean hasParams();
}
