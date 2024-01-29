package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000a.p014d.C0068b;
import p054b.p059c.p060a.p061a.p072e.C1265a;
/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public final class C1648d {

    /* renamed from: a */
    private final Account f4780a;

    /* renamed from: b */
    private final Set<Scope> f4781b;

    /* renamed from: c */
    private final Set<Scope> f4782c;

    /* renamed from: d */
    private final Map<C1548a<?>, C1650b> f4783d;

    /* renamed from: e */
    private final String f4784e;

    /* renamed from: f */
    private final String f4785f;

    /* renamed from: g */
    private final C1265a f4786g;

    /* renamed from: h */
    private Integer f4787h;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    /* loaded from: classes.dex */
    public static final class C1649a {

        /* renamed from: a */
        private Account f4788a;

        /* renamed from: b */
        private C0068b<Scope> f4789b;

        /* renamed from: c */
        private Map<C1548a<?>, C1650b> f4790c;

        /* renamed from: e */
        private View f4792e;

        /* renamed from: f */
        private String f4793f;

        /* renamed from: g */
        private String f4794g;

        /* renamed from: i */
        private boolean f4796i;

        /* renamed from: d */
        private int f4791d = 0;

        /* renamed from: h */
        private C1265a f4795h = C1265a.f4032o;

        /* renamed from: a */
        public final C1649a m3714a(Collection<Scope> collection) {
            if (this.f4789b == null) {
                this.f4789b = new C0068b<>();
            }
            this.f4789b.addAll(collection);
            return this;
        }

        /* renamed from: b */
        public final C1648d m3713b() {
            return new C1648d(this.f4788a, this.f4789b, this.f4790c, this.f4791d, this.f4792e, this.f4793f, this.f4794g, this.f4795h, this.f4796i);
        }

        /* renamed from: c */
        public final C1649a m3712c(Account account) {
            this.f4788a = account;
            return this;
        }

        /* renamed from: d */
        public final C1649a m3711d(String str) {
            this.f4794g = str;
            return this;
        }

        /* renamed from: e */
        public final C1649a m3710e(String str) {
            this.f4793f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    /* loaded from: classes.dex */
    public static final class C1650b {

        /* renamed from: a */
        public final Set<Scope> f4797a;
    }

    public C1648d(Account account, Set<Scope> set, Map<C1548a<?>, C1650b> map, int i, View view, String str, String str2, C1265a c1265a, boolean z) {
        this.f4780a = account;
        this.f4781b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f4783d = map == null ? Collections.emptyMap() : map;
        this.f4784e = str;
        this.f4785f = str2;
        this.f4786g = c1265a;
        HashSet hashSet = new HashSet(this.f4781b);
        for (C1650b c1650b : this.f4783d.values()) {
            hashSet.addAll(c1650b.f4797a);
        }
        this.f4782c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final Account m3723a() {
        return this.f4780a;
    }

    /* renamed from: b */
    public final Account m3722b() {
        Account account = this.f4780a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> m3721c() {
        return this.f4782c;
    }

    /* renamed from: d */
    public final Integer m3720d() {
        return this.f4787h;
    }

    /* renamed from: e */
    public final String m3719e() {
        return this.f4785f;
    }

    /* renamed from: f */
    public final String m3718f() {
        return this.f4784e;
    }

    /* renamed from: g */
    public final Set<Scope> m3717g() {
        return this.f4781b;
    }

    /* renamed from: h */
    public final C1265a m3716h() {
        return this.f4786g;
    }

    /* renamed from: i */
    public final void m3715i(Integer num) {
        this.f4787h = num;
    }
}
