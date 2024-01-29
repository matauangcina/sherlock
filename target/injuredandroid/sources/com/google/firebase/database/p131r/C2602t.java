package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.r.t */
/* loaded from: classes.dex */
public class C2602t extends AbstractC2589k<C2602t> {

    /* renamed from: h */
    private final String f6756h;

    /* renamed from: com.google.firebase.database.r.t$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2603a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6757a;

        static {
            int[] iArr = new int[InterfaceC2594n.EnumC2596b.values().length];
            f6757a = iArr;
            try {
                iArr[InterfaceC2594n.EnumC2596b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6757a[InterfaceC2594n.EnumC2596b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C2602t(String str, InterfaceC2594n interfaceC2594n) {
        super(interfaceC2594n);
        this.f6756h = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2602t) {
            C2602t c2602t = (C2602t) obj;
            return this.f6756h.equals(c2602t.f6756h) && this.f6734f.equals(c2602t.f6734f);
        }
        return false;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: g */
    protected AbstractC2589k.EnumC2591b mo1062g() {
        return AbstractC2589k.EnumC2591b.String;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public Object getValue() {
        return this.f6756h;
    }

    public int hashCode() {
        return this.f6756h.hashCode() + this.f6734f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: m */
    public int mo1063d(C2602t c2602t) {
        return this.f6756h.compareTo(c2602t.f6756h);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: s */
    public C2602t mo1061j(InterfaceC2594n interfaceC2594n) {
        return new C2602t(this.f6756h, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        StringBuilder sb;
        String str;
        int i = C2603a.f6757a[enumC2596b.ordinal()];
        if (i == 1) {
            sb = new StringBuilder();
            sb.append(m1095i(enumC2596b));
            sb.append("string:");
            str = this.f6756h;
        } else if (i != 2) {
            throw new IllegalArgumentException("Invalid hash version for string node: " + enumC2596b);
        } else {
            sb = new StringBuilder();
            sb.append(m1095i(enumC2596b));
            sb.append("string:");
            str = C2472l.m1516i(this.f6756h);
        }
        sb.append(str);
        return sb.toString();
    }
}
