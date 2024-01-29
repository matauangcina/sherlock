package com.google.firebase.database.p124p;

import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.p.y */
/* loaded from: classes.dex */
public final class C2561y {

    /* renamed from: a */
    private final long f6681a;

    /* renamed from: b */
    private final C2506l f6682b;

    /* renamed from: c */
    private final InterfaceC2594n f6683c;

    /* renamed from: d */
    private final C2411b f6684d;

    /* renamed from: e */
    private final boolean f6685e;

    public C2561y(long j, C2506l c2506l, C2411b c2411b) {
        this.f6681a = j;
        this.f6682b = c2506l;
        this.f6683c = null;
        this.f6684d = c2411b;
        this.f6685e = true;
    }

    public C2561y(long j, C2506l c2506l, InterfaceC2594n interfaceC2594n, boolean z) {
        this.f6681a = j;
        this.f6682b = c2506l;
        this.f6683c = interfaceC2594n;
        this.f6684d = null;
        this.f6685e = z;
    }

    /* renamed from: a */
    public C2411b m1199a() {
        C2411b c2411b = this.f6684d;
        if (c2411b != null) {
            return c2411b;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    /* renamed from: b */
    public InterfaceC2594n m1198b() {
        InterfaceC2594n interfaceC2594n = this.f6683c;
        if (interfaceC2594n != null) {
            return interfaceC2594n;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    /* renamed from: c */
    public C2506l m1197c() {
        return this.f6682b;
    }

    /* renamed from: d */
    public long m1196d() {
        return this.f6681a;
    }

    /* renamed from: e */
    public boolean m1195e() {
        return this.f6683c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2561y.class != obj.getClass()) {
            return false;
        }
        C2561y c2561y = (C2561y) obj;
        if (this.f6681a == c2561y.f6681a && this.f6682b.equals(c2561y.f6682b) && this.f6685e == c2561y.f6685e) {
            InterfaceC2594n interfaceC2594n = this.f6683c;
            if (interfaceC2594n == null ? c2561y.f6683c == null : interfaceC2594n.equals(c2561y.f6683c)) {
                C2411b c2411b = this.f6684d;
                C2411b c2411b2 = c2561y.f6684d;
                return c2411b == null ? c2411b2 == null : c2411b.equals(c2411b2);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m1194f() {
        return this.f6685e;
    }

    public int hashCode() {
        int hashCode = ((((Long.valueOf(this.f6681a).hashCode() * 31) + Boolean.valueOf(this.f6685e).hashCode()) * 31) + this.f6682b.hashCode()) * 31;
        InterfaceC2594n interfaceC2594n = this.f6683c;
        int hashCode2 = (hashCode + (interfaceC2594n != null ? interfaceC2594n.hashCode() : 0)) * 31;
        C2411b c2411b = this.f6684d;
        return hashCode2 + (c2411b != null ? c2411b.hashCode() : 0);
    }

    public String toString() {
        return "UserWriteRecord{id=" + this.f6681a + " path=" + this.f6682b + " visible=" + this.f6685e + " overwrite=" + this.f6683c + " merge=" + this.f6684d + "}";
    }
}
