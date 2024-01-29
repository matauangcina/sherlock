package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* renamed from: com.google.firebase.components.o */
/* loaded from: classes.dex */
public class C2296o extends C2297p {
    public C2296o(List<C2277d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
