package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.p127g0.C2472l;
/* renamed from: com.google.firebase.database.r.b */
/* loaded from: classes.dex */
public class C2570b implements Comparable<C2570b> {

    /* renamed from: g */
    private static final C2570b f6701g = new C2570b("[MIN_KEY]");

    /* renamed from: h */
    private static final C2570b f6702h = new C2570b("[MAX_KEY]");

    /* renamed from: i */
    private static final C2570b f6703i = new C2570b(".priority");

    /* renamed from: f */
    private final String f6704f;

    /* renamed from: com.google.firebase.database.r.b$b */
    /* loaded from: classes.dex */
    private static class C2572b extends C2570b {

        /* renamed from: j */
        private final int f6705j;

        C2572b(String str, int i) {
            super(str);
            this.f6705j = i;
        }

        @Override // com.google.firebase.database.p131r.C2570b, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(C2570b c2570b) {
            return super.compareTo(c2570b);
        }

        @Override // com.google.firebase.database.p131r.C2570b
        /* renamed from: s */
        protected int mo1157s() {
            return this.f6705j;
        }

        @Override // com.google.firebase.database.p131r.C2570b
        public String toString() {
            return "IntegerChildName(\"" + ((C2570b) this).f6704f + "\")";
        }

        @Override // com.google.firebase.database.p131r.C2570b
        /* renamed from: u */
        protected boolean mo1156u() {
            return true;
        }
    }

    private C2570b(String str) {
        this.f6704f = str;
    }

    /* renamed from: g */
    public static C2570b m1162g(String str) {
        Integer m1515j = C2472l.m1515j(str);
        return m1515j != null ? new C2572b(str, m1515j.intValue()) : str.equals(".priority") ? f6703i : new C2570b(str);
    }

    /* renamed from: i */
    public static C2570b m1161i() {
        return f6702h;
    }

    /* renamed from: l */
    public static C2570b m1160l() {
        return f6701g;
    }

    /* renamed from: m */
    public static C2570b m1159m() {
        return f6703i;
    }

    /* renamed from: e */
    public String m1164e() {
        return this.f6704f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2570b) {
            if (this == obj) {
                return true;
            }
            return this.f6704f.equals(((C2570b) obj).f6704f);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(C2570b c2570b) {
        C2570b c2570b2;
        if (this == c2570b) {
            return 0;
        }
        C2570b c2570b3 = f6701g;
        if (this == c2570b3 || c2570b == (c2570b2 = f6702h)) {
            return -1;
        }
        if (c2570b == c2570b3 || this == c2570b2) {
            return 1;
        }
        if (!mo1156u()) {
            if (c2570b.mo1156u()) {
                return 1;
            }
            return this.f6704f.compareTo(c2570b.f6704f);
        } else if (c2570b.mo1156u()) {
            int m1524a = C2472l.m1524a(mo1157s(), c2570b.mo1157s());
            return m1524a == 0 ? C2472l.m1524a(this.f6704f.length(), c2570b.f6704f.length()) : m1524a;
        } else {
            return -1;
        }
    }

    public int hashCode() {
        return this.f6704f.hashCode();
    }

    /* renamed from: s */
    protected int mo1157s() {
        return 0;
    }

    public String toString() {
        return "ChildKey(\"" + this.f6704f + "\")";
    }

    /* renamed from: u */
    protected boolean mo1156u() {
        return false;
    }

    /* renamed from: w */
    public boolean m1158w() {
        return equals(f6703i);
    }
}
