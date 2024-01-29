package com.google.crypto.tink.shaded.protobuf;
@CheckReturnValue
/* loaded from: classes.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // com.google.crypto.tink.shaded.protobuf.NewInstanceSchema
    public Object newInstance(Object defaultInstance) {
        return ((GeneratedMessageLite) defaultInstance).newMutableInstance();
    }
}
