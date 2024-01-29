package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p127g0.C2461e;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.C2573c;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
/* renamed from: com.google.firebase.database.r.d */
/* loaded from: classes.dex */
public class C2578d {

    /* renamed from: a */
    private final List<C2506l> f6714a;

    /* renamed from: b */
    private final List<String> f6715b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.r.d$a */
    /* loaded from: classes.dex */
    public class C2579a extends C2573c.AbstractC2576c {

        /* renamed from: a */
        final /* synthetic */ C2580b f6716a;

        C2579a(C2580b c2580b) {
            this.f6716a = c2580b;
        }

        @Override // com.google.firebase.database.p131r.C2573c.AbstractC2576c
        /* renamed from: b */
        public void mo1138b(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
            this.f6716a.m1121q(c2570b);
            C2578d.m1139f(interfaceC2594n, this.f6716a);
            this.f6716a.m1126l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.r.d$b */
    /* loaded from: classes.dex */
    public static class C2580b {

        /* renamed from: d */
        private int f6720d;

        /* renamed from: h */
        private final InterfaceC2582d f6724h;

        /* renamed from: a */
        private StringBuilder f6717a = null;

        /* renamed from: b */
        private Stack<C2570b> f6718b = new Stack<>();

        /* renamed from: c */
        private int f6719c = -1;

        /* renamed from: e */
        private boolean f6721e = true;

        /* renamed from: f */
        private final List<C2506l> f6722f = new ArrayList();

        /* renamed from: g */
        private final List<String> f6723g = new ArrayList();

        public C2580b(InterfaceC2582d interfaceC2582d) {
            this.f6724h = interfaceC2582d;
        }

        /* renamed from: g */
        private void m1131g(StringBuilder sb, C2570b c2570b) {
            sb.append(C2472l.m1516i(c2570b.m1164e()));
        }

        /* renamed from: k */
        private C2506l m1127k(int i) {
            C2570b[] c2570bArr = new C2570b[i];
            for (int i2 = 0; i2 < i; i2++) {
                c2570bArr[i2] = this.f6718b.get(i2);
            }
            return new C2506l(c2570bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m1126l() {
            this.f6720d--;
            if (m1130h()) {
                this.f6717a.append(")");
            }
            this.f6721e = true;
        }

        /* renamed from: m */
        private void m1125m() {
            C2472l.m1519f(m1130h(), "Can't end range without starting a range!");
            for (int i = 0; i < this.f6720d; i++) {
                this.f6717a.append(")");
            }
            this.f6717a.append(")");
            C2506l m1127k = m1127k(this.f6719c);
            this.f6723g.add(C2472l.m1517h(this.f6717a.toString()));
            this.f6722f.add(m1127k);
            this.f6717a = null;
        }

        /* renamed from: n */
        private void m1124n() {
            if (m1130h()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            this.f6717a = sb;
            sb.append("(");
            Iterator<C2570b> it = m1127k(this.f6720d).iterator();
            while (it.hasNext()) {
                m1131g(this.f6717a, it.next());
                this.f6717a.append(":(");
            }
            this.f6721e = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m1123o() {
            C2472l.m1519f(this.f6720d == 0, "Can't finish hashing in the middle processing a child");
            if (m1130h()) {
                m1125m();
            }
            this.f6723g.add("");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m1122p(AbstractC2589k<?> abstractC2589k) {
            m1124n();
            this.f6719c = this.f6720d;
            this.f6717a.append(abstractC2589k.mo1058v(InterfaceC2594n.EnumC2596b.V2));
            this.f6721e = true;
            if (this.f6724h.mo1120a(this)) {
                m1125m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public void m1121q(C2570b c2570b) {
            m1124n();
            if (this.f6721e) {
                this.f6717a.append(",");
            }
            m1131g(this.f6717a, c2570b);
            this.f6717a.append(":(");
            if (this.f6720d == this.f6718b.size()) {
                this.f6718b.add(c2570b);
            } else {
                this.f6718b.set(this.f6720d, c2570b);
            }
            this.f6720d++;
            this.f6721e = false;
        }

        /* renamed from: h */
        public boolean m1130h() {
            return this.f6717a != null;
        }

        /* renamed from: i */
        public int m1129i() {
            return this.f6717a.length();
        }

        /* renamed from: j */
        public C2506l m1128j() {
            return m1127k(this.f6720d);
        }
    }

    /* renamed from: com.google.firebase.database.r.d$c */
    /* loaded from: classes.dex */
    private static class C2581c implements InterfaceC2582d {

        /* renamed from: a */
        private final long f6725a;

        public C2581c(InterfaceC2594n interfaceC2594n) {
            this.f6725a = Math.max(512L, (long) Math.sqrt(C2461e.m1546b(interfaceC2594n) * 100));
        }

        @Override // com.google.firebase.database.p131r.C2578d.InterfaceC2582d
        /* renamed from: a */
        public boolean mo1120a(C2580b c2580b) {
            return ((long) c2580b.m1129i()) > this.f6725a && (c2580b.m1128j().isEmpty() || !c2580b.m1128j().m1386u().equals(C2570b.m1159m()));
        }
    }

    /* renamed from: com.google.firebase.database.r.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2582d {
        /* renamed from: a */
        boolean mo1120a(C2580b c2580b);
    }

    private C2578d(List<C2506l> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f6714a = list;
        this.f6715b = list2;
    }

    /* renamed from: b */
    public static C2578d m1143b(InterfaceC2594n interfaceC2594n) {
        return m1142c(interfaceC2594n, new C2581c(interfaceC2594n));
    }

    /* renamed from: c */
    public static C2578d m1142c(InterfaceC2594n interfaceC2594n, InterfaceC2582d interfaceC2582d) {
        if (interfaceC2594n.isEmpty()) {
            return new C2578d(Collections.emptyList(), Collections.singletonList(""));
        }
        C2580b c2580b = new C2580b(interfaceC2582d);
        m1139f(interfaceC2594n, c2580b);
        c2580b.m1123o();
        return new C2578d(c2580b.f6722f, c2580b.f6723g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static void m1139f(InterfaceC2594n interfaceC2594n, C2580b c2580b) {
        if (interfaceC2594n.mo1085k()) {
            c2580b.m1122p((AbstractC2589k) interfaceC2594n);
        } else if (interfaceC2594n.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else {
            if (interfaceC2594n instanceof C2573c) {
                ((C2573c) interfaceC2594n).m1153g(new C2579a(c2580b), true);
                return;
            }
            throw new IllegalStateException("Expected children node, but got: " + interfaceC2594n);
        }
    }

    /* renamed from: d */
    public List<String> m1141d() {
        return Collections.unmodifiableList(this.f6715b);
    }

    /* renamed from: e */
    public List<C2506l> m1140e() {
        return Collections.unmodifiableList(this.f6714a);
    }
}
