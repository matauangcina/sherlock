package com.google.firebase.components;

import java.util.Set;
import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.a */
/* loaded from: classes.dex */
public abstract class AbstractC2274a implements InterfaceC2280e {
    @Override // com.google.firebase.components.InterfaceC2280e
    /* renamed from: a */
    public <T> T mo2081a(Class<T> cls) {
        InterfaceC1435a<T> mo2079c = mo2079c(cls);
        if (mo2079c == null) {
            return null;
        }
        return mo2079c.get();
    }

    @Override // com.google.firebase.components.InterfaceC2280e
    /* renamed from: b */
    public <T> Set<T> mo2080b(Class<T> cls) {
        return mo2078d(cls).get();
    }
}
