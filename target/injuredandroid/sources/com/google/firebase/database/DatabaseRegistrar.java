package com.google.firebase.database;

import androidx.annotation.Keep;
import com.google.firebase.auth.internal.InterfaceC2144b;
import com.google.firebase.components.C2277d;
import com.google.firebase.components.C2295n;
import com.google.firebase.components.InterfaceC2280e;
import com.google.firebase.components.InterfaceC2286h;
import java.util.Arrays;
import java.util.List;
import p054b.p059c.p098c.C1415c;
import p054b.p059c.p098c.p104n.C1445g;
@Keep
/* loaded from: classes.dex */
public class DatabaseRegistrar implements InterfaceC2286h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ C2311g lambda$getComponents$0(InterfaceC2280e interfaceC2280e) {
        return new C2311g((C1415c) interfaceC2280e.mo2081a(C1415c.class), (InterfaceC2144b) interfaceC2280e.mo2081a(InterfaceC2144b.class));
    }

    @Override // com.google.firebase.components.InterfaceC2286h
    public List<C2277d<?>> getComponents() {
        C2277d.C2279b m2146a = C2277d.m2146a(C2311g.class);
        m2146a.m2131b(C2295n.m2092g(C1415c.class));
        m2146a.m2131b(C2295n.m2094e(InterfaceC2144b.class));
        m2146a.m2128e(C2309e.m2063b());
        return Arrays.asList(m2146a.m2130c(), C1445g.m4159a("fire-rtdb", "19.2.1"));
    }
}
