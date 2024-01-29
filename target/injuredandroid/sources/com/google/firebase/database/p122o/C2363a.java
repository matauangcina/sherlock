package com.google.firebase.database.p122o;

import java.util.Collections;
import java.util.List;
/* renamed from: com.google.firebase.database.o.a */
/* loaded from: classes.dex */
public class C2363a {

    /* renamed from: a */
    private final List<List<String>> f6199a;

    /* renamed from: b */
    private final List<String> f6200b;

    public C2363a(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f6199a = list;
        this.f6200b = list2;
    }

    /* renamed from: a */
    public List<String> m1926a() {
        return Collections.unmodifiableList(this.f6200b);
    }

    /* renamed from: b */
    public List<List<String>> m1925b() {
        return Collections.unmodifiableList(this.f6199a);
    }
}
