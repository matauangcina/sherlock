package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.auth.internal.InterfaceC2144b;
import com.google.firebase.components.C2277d;
import com.google.firebase.components.C2295n;
import com.google.firebase.components.InterfaceC2286h;
import java.util.Arrays;
import java.util.List;
import p054b.p059c.p098c.C1415c;
import p054b.p059c.p098c.p104n.C1445g;
@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements InterfaceC2286h {
    @Override // com.google.firebase.components.InterfaceC2286h
    @Keep
    public List<C2277d<?>> getComponents() {
        C2277d.C2279b m2145b = C2277d.m2145b(FirebaseAuth.class, InterfaceC2144b.class);
        m2145b.m2131b(C2295n.m2092g(C1415c.class));
        m2145b.m2128e(C2199r0.f5963a);
        m2145b.m2129d();
        return Arrays.asList(m2145b.m2130c(), C1445g.m4159a("fire-auth", "19.2.0"));
    }
}
