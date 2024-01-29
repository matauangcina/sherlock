package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.auth.internal.InterfaceC2144b;
import com.google.firebase.components.C2277d;
import com.google.firebase.components.C2295n;
import com.google.firebase.components.InterfaceC2280e;
import com.google.firebase.components.InterfaceC2286h;
import com.google.firebase.firestore.p134c.C2628a;
import java.util.Arrays;
import java.util.List;
import p054b.p059c.p098c.C1415c;
import p054b.p059c.p098c.p100k.InterfaceC1433c;
import p054b.p059c.p098c.p104n.C1445g;
import p054b.p059c.p098c.p104n.InterfaceC1446h;
@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements InterfaceC2286h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ C2626a lambda$getComponents$0(InterfaceC2280e interfaceC2280e) {
        return new C2626a((Context) interfaceC2280e.mo2081a(Context.class), (C1415c) interfaceC2280e.mo2081a(C1415c.class), (InterfaceC2144b) interfaceC2280e.mo2081a(InterfaceC2144b.class), new C2628a(interfaceC2280e.mo2079c(InterfaceC1446h.class), interfaceC2280e.mo2079c(InterfaceC1433c.class)));
    }

    @Override // com.google.firebase.components.InterfaceC2286h
    @Keep
    public List<C2277d<?>> getComponents() {
        C2277d.C2279b m2146a = C2277d.m2146a(C2626a.class);
        m2146a.m2131b(C2295n.m2092g(C1415c.class));
        m2146a.m2131b(C2295n.m2092g(Context.class));
        m2146a.m2131b(C2295n.m2093f(InterfaceC1433c.class));
        m2146a.m2131b(C2295n.m2093f(InterfaceC1446h.class));
        m2146a.m2131b(C2295n.m2094e(InterfaceC2144b.class));
        m2146a.m2128e(C2627b.m985b());
        return Arrays.asList(m2146a.m2130c(), C1445g.m4159a("fire-fst", "21.4.0"));
    }
}
