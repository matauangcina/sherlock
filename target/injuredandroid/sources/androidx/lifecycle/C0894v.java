package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public class C0894v {

    /* renamed from: a */
    private final HashMap<String, AbstractC0889t> f3153a = new HashMap<>();

    /* renamed from: a */
    public final void m6079a() {
        for (AbstractC0889t abstractC0889t : this.f3153a.values()) {
            abstractC0889t.m6086a();
        }
        this.f3153a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC0889t m6078b(String str) {
        return this.f3153a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> m6077c() {
        return new HashSet(this.f3153a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m6076d(String str, AbstractC0889t abstractC0889t) {
        AbstractC0889t put = this.f3153a.put(str, abstractC0889t);
        if (put != null) {
            put.mo5990d();
        }
    }
}
