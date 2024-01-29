package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.C1562e;
import com.google.android.gms.common.api.C1626m;
import com.google.android.gms.common.api.InterfaceC1565f;
import com.google.android.gms.common.api.InterfaceC1566g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1634c;
import com.google.android.gms.common.internal.C1665k;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.C1682u;
import com.google.android.gms.common.internal.InterfaceC1667l;
import com.google.android.gms.common.util.C1693a;
import com.google.android.gms.common.util.C1701i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p014d.C0066a;
import p000a.p014d.C0068b;
import p054b.p059c.p060a.p061a.p063b.C1144a;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p063b.C1147d;
import p054b.p059c.p060a.p061a.p068d.p069a.HandlerC1174d;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: classes.dex */
public class C1581e implements Handler.Callback {

    /* renamed from: n */
    public static final Status f4649n = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: o */
    private static final Status f4650o = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: p */
    private static final Object f4651p = new Object();

    /* renamed from: q */
    private static C1581e f4652q;

    /* renamed from: d */
    private final Context f4656d;

    /* renamed from: e */
    private final C1147d f4657e;

    /* renamed from: f */
    private final C1665k f4658f;

    /* renamed from: m */
    private final Handler f4665m;

    /* renamed from: a */
    private long f4653a = 5000;

    /* renamed from: b */
    private long f4654b = 120000;

    /* renamed from: c */
    private long f4655c = 10000;

    /* renamed from: g */
    private final AtomicInteger f4659g = new AtomicInteger(1);

    /* renamed from: h */
    private final AtomicInteger f4660h = new AtomicInteger(0);

    /* renamed from: i */
    private final Map<C1574b<?>, C1582a<?>> f4661i = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: j */
    private C1607p f4662j = null;

    /* renamed from: k */
    private final Set<C1574b<?>> f4663k = new C0068b();

    /* renamed from: l */
    private final Set<C1574b<?>> f4664l = new C0068b();

    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    /* loaded from: classes.dex */
    public class C1582a<O extends C1548a.InterfaceC1552d> implements InterfaceC1565f, InterfaceC1566g {

        /* renamed from: b */
        private final C1548a.InterfaceC1556f f4667b;

        /* renamed from: c */
        private final C1548a.InterfaceC1550b f4668c;

        /* renamed from: d */
        private final C1574b<O> f4669d;

        /* renamed from: e */
        private final C1608p0 f4670e;

        /* renamed from: h */
        private final int f4673h;

        /* renamed from: i */
        private final BinderC1578c0 f4674i;

        /* renamed from: j */
        private boolean f4675j;

        /* renamed from: a */
        private final Queue<AbstractC1573a0> f4666a = new LinkedList();

        /* renamed from: f */
        private final Set<C1602m0> f4671f = new HashSet();

        /* renamed from: g */
        private final Map<C1590h<?>, C1622z> f4672g = new HashMap();

        /* renamed from: k */
        private final List<C1584c> f4676k = new ArrayList();

        /* renamed from: l */
        private C1144a f4677l = null;

        public C1582a(C1562e<O> c1562e) {
            C1548a.InterfaceC1556f m3941g = c1562e.m3941g(C1581e.this.f4665m.getLooper(), this);
            this.f4667b = m3941g;
            this.f4668c = m3941g instanceof C1682u ? ((C1682u) m3941g).m3619k0() : m3941g;
            this.f4669d = c1562e.m3944d();
            this.f4670e = new C1608p0();
            this.f4673h = c1562e.m3942f();
            if (this.f4667b.mo3739q()) {
                this.f4674i = c1562e.m3940h(C1581e.this.f4656d, C1581e.this.f4665m);
            } else {
                this.f4674i = null;
            }
        }

        /* renamed from: A */
        private final void m3877A() {
            if (this.f4675j) {
                C1581e.this.f4665m.removeMessages(11, this.f4669d);
                C1581e.this.f4665m.removeMessages(9, this.f4669d);
                this.f4675j = false;
            }
        }

        /* renamed from: B */
        private final void m3876B() {
            C1581e.this.f4665m.removeMessages(12, this.f4669d);
            C1581e.this.f4665m.sendMessageDelayed(C1581e.this.f4665m.obtainMessage(12, this.f4669d), C1581e.this.f4655c);
        }

        /* renamed from: E */
        private final void m3873E(AbstractC1573a0 abstractC1573a0) {
            abstractC1573a0.mo3817c(this.f4670e, m3861e());
            try {
                abstractC1573a0.mo3819f(this);
            } catch (DeadObjectException unused) {
                mo3862d(1);
                this.f4667b.m3953p();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final boolean m3872F(boolean z) {
            C1679r.m3635d(C1581e.this.f4665m);
            if (this.f4667b.m3959d() && this.f4672g.size() == 0) {
                if (!this.f4670e.m3799c()) {
                    this.f4667b.m3953p();
                    return true;
                }
                if (z) {
                    m3876B();
                }
                return false;
            }
            return false;
        }

        /* renamed from: K */
        private final boolean m3867K(C1144a c1144a) {
            synchronized (C1581e.f4651p) {
                if (C1581e.this.f4662j != null && C1581e.this.f4663k.contains(this.f4669d)) {
                    C1581e.this.f4662j.m3803k(c1144a, this.f4673h);
                    throw null;
                }
            }
            return false;
        }

        /* renamed from: L */
        private final void m3866L(C1144a c1144a) {
            for (C1602m0 c1602m0 : this.f4671f) {
                String str = null;
                if (C1677q.m3642a(c1144a, C1144a.f3850j)) {
                    str = this.f4667b.m3955n();
                }
                c1602m0.m3806a(this.f4669d, c1144a, str);
            }
            this.f4671f.clear();
        }

        /* renamed from: i */
        private final C1146c m3858i(C1146c[] c1146cArr) {
            if (c1146cArr != null && c1146cArr.length != 0) {
                C1146c[] m3956m = this.f4667b.m3956m();
                if (m3956m == null) {
                    m3956m = new C1146c[0];
                }
                C0066a c0066a = new C0066a(m3956m.length);
                for (C1146c c1146c : m3956m) {
                    c0066a.put(c1146c.m4804b(), Long.valueOf(c1146c.m4803c()));
                }
                for (C1146c c1146c2 : c1146cArr) {
                    if (!c0066a.containsKey(c1146c2.m4804b()) || ((Long) c0066a.get(c1146c2.m4804b())).longValue() < c1146c2.m4803c()) {
                        return c1146c2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public final void m3856k(C1584c c1584c) {
            if (this.f4676k.contains(c1584c) && !this.f4675j) {
                if (this.f4667b.m3959d()) {
                    m3845v();
                } else {
                    m3865a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public final void m3849r(C1584c c1584c) {
            C1146c[] mo3790g;
            if (this.f4676k.remove(c1584c)) {
                C1581e.this.f4665m.removeMessages(15, c1584c);
                C1581e.this.f4665m.removeMessages(16, c1584c);
                C1146c c1146c = c1584c.f4686b;
                ArrayList arrayList = new ArrayList(this.f4666a.size());
                for (AbstractC1573a0 abstractC1573a0 : this.f4666a) {
                    if ((abstractC1573a0 instanceof AbstractC1611r) && (mo3790g = ((AbstractC1611r) abstractC1573a0).mo3790g(this)) != null && C1693a.m3569a(mo3790g, c1146c)) {
                        arrayList.add(abstractC1573a0);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    AbstractC1573a0 abstractC1573a02 = (AbstractC1573a0) obj;
                    this.f4666a.remove(abstractC1573a02);
                    abstractC1573a02.mo3820d(new C1626m(c1146c));
                }
            }
        }

        /* renamed from: s */
        private final boolean m3848s(AbstractC1573a0 abstractC1573a0) {
            if (!(abstractC1573a0 instanceof AbstractC1611r)) {
                m3873E(abstractC1573a0);
                return true;
            }
            AbstractC1611r abstractC1611r = (AbstractC1611r) abstractC1573a0;
            C1146c m3858i = m3858i(abstractC1611r.mo3790g(this));
            if (m3858i == null) {
                m3873E(abstractC1573a0);
                return true;
            } else if (!abstractC1611r.mo3789h(this)) {
                abstractC1611r.mo3820d(new C1626m(m3858i));
                return false;
            } else {
                C1584c c1584c = new C1584c(this.f4669d, m3858i, null);
                int indexOf = this.f4676k.indexOf(c1584c);
                if (indexOf >= 0) {
                    C1584c c1584c2 = this.f4676k.get(indexOf);
                    C1581e.this.f4665m.removeMessages(15, c1584c2);
                    C1581e.this.f4665m.sendMessageDelayed(Message.obtain(C1581e.this.f4665m, 15, c1584c2), C1581e.this.f4653a);
                    return false;
                }
                this.f4676k.add(c1584c);
                C1581e.this.f4665m.sendMessageDelayed(Message.obtain(C1581e.this.f4665m, 15, c1584c), C1581e.this.f4653a);
                C1581e.this.f4665m.sendMessageDelayed(Message.obtain(C1581e.this.f4665m, 16, c1584c), C1581e.this.f4654b);
                C1144a c1144a = new C1144a(2, null);
                if (m3867K(c1144a)) {
                    return false;
                }
                C1581e.this.m3886l(c1144a, this.f4673h);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final void m3847t() {
            m3842y();
            m3866L(C1144a.f3850j);
            m3877A();
            Iterator<C1622z> it = this.f4672g.values().iterator();
            while (it.hasNext()) {
                C1622z next = it.next();
                if (m3858i(next.f4739a.m3824b()) == null) {
                    try {
                        next.f4739a.m3823c(this.f4668c, new C1289h<>());
                    } catch (DeadObjectException unused) {
                        mo3862d(1);
                        this.f4667b.m3953p();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            m3845v();
            m3876B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final void m3846u() {
            m3842y();
            this.f4675j = true;
            this.f4670e.m3797e();
            C1581e.this.f4665m.sendMessageDelayed(Message.obtain(C1581e.this.f4665m, 9, this.f4669d), C1581e.this.f4653a);
            C1581e.this.f4665m.sendMessageDelayed(Message.obtain(C1581e.this.f4665m, 11, this.f4669d), C1581e.this.f4654b);
            C1581e.this.f4658f.m3655a();
        }

        /* renamed from: v */
        private final void m3845v() {
            ArrayList arrayList = new ArrayList(this.f4666a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC1573a0 abstractC1573a0 = (AbstractC1573a0) obj;
                if (!this.f4667b.m3959d()) {
                    return;
                }
                if (m3848s(abstractC1573a0)) {
                    this.f4666a.remove(abstractC1573a0);
                }
            }
        }

        /* renamed from: C */
        public final boolean m3875C() {
            return m3872F(true);
        }

        /* renamed from: D */
        public final void m3874D(Status status) {
            C1679r.m3635d(C1581e.this.f4665m);
            for (AbstractC1573a0 abstractC1573a0 : this.f4666a) {
                abstractC1573a0.mo3821b(status);
            }
            this.f4666a.clear();
        }

        /* renamed from: J */
        public final void m3868J(C1144a c1144a) {
            C1679r.m3635d(C1581e.this.f4665m);
            this.f4667b.m3953p();
            mo3827g(c1144a);
        }

        /* renamed from: a */
        public final void m3865a() {
            C1679r.m3635d(C1581e.this.f4665m);
            if (this.f4667b.m3959d() || this.f4667b.m3957l()) {
                return;
            }
            int m3654b = C1581e.this.f4658f.m3654b(C1581e.this.f4656d, this.f4667b);
            if (m3654b != 0) {
                mo3827g(new C1144a(m3654b, null));
                return;
            }
            C1583b c1583b = new C1583b(this.f4667b, this.f4669d);
            if (this.f4667b.mo3739q()) {
                this.f4674i.m3900b0(c1583b);
            }
            this.f4667b.m3954o(c1583b);
        }

        /* renamed from: b */
        public final int m3864b() {
            return this.f4673h;
        }

        /* renamed from: c */
        final boolean m3863c() {
            return this.f4667b.m3959d();
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1579d
        /* renamed from: d */
        public final void mo3862d(int i) {
            if (Looper.myLooper() == C1581e.this.f4665m.getLooper()) {
                m3846u();
            } else {
                C1581e.this.f4665m.post(new RunnableC1617u(this));
            }
        }

        /* renamed from: e */
        public final boolean m3861e() {
            return this.f4667b.mo3739q();
        }

        /* renamed from: f */
        public final void m3860f() {
            C1679r.m3635d(C1581e.this.f4665m);
            if (this.f4675j) {
                m3865a();
            }
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1592i
        /* renamed from: g */
        public final void mo3827g(C1144a c1144a) {
            C1679r.m3635d(C1581e.this.f4665m);
            BinderC1578c0 binderC1578c0 = this.f4674i;
            if (binderC1578c0 != null) {
                binderC1578c0.m3899c0();
            }
            m3842y();
            C1581e.this.f4658f.m3655a();
            m3866L(c1144a);
            if (c1144a.m4811b() == 4) {
                m3874D(C1581e.f4650o);
            } else if (this.f4666a.isEmpty()) {
                this.f4677l = c1144a;
            } else if (m3867K(c1144a) || C1581e.this.m3886l(c1144a, this.f4673h)) {
            } else {
                if (c1144a.m4811b() == 18) {
                    this.f4675j = true;
                }
                if (this.f4675j) {
                    C1581e.this.f4665m.sendMessageDelayed(Message.obtain(C1581e.this.f4665m, 9, this.f4669d), C1581e.this.f4653a);
                    return;
                }
                String m3911a = this.f4669d.m3911a();
                String valueOf = String.valueOf(c1144a);
                StringBuilder sb = new StringBuilder(String.valueOf(m3911a).length() + 63 + String.valueOf(valueOf).length());
                sb.append("API: ");
                sb.append(m3911a);
                sb.append(" is not available on this device. Connection failed with: ");
                sb.append(valueOf);
                m3874D(new Status(17, sb.toString()));
            }
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1579d
        /* renamed from: h */
        public final void mo3859h(Bundle bundle) {
            if (Looper.myLooper() == C1581e.this.f4665m.getLooper()) {
                m3847t();
            } else {
                C1581e.this.f4665m.post(new RunnableC1615t(this));
            }
        }

        /* renamed from: l */
        public final void m3855l(AbstractC1573a0 abstractC1573a0) {
            C1679r.m3635d(C1581e.this.f4665m);
            if (this.f4667b.m3959d()) {
                if (m3848s(abstractC1573a0)) {
                    m3876B();
                    return;
                } else {
                    this.f4666a.add(abstractC1573a0);
                    return;
                }
            }
            this.f4666a.add(abstractC1573a0);
            C1144a c1144a = this.f4677l;
            if (c1144a == null || !c1144a.m4808j()) {
                m3865a();
            } else {
                mo3827g(this.f4677l);
            }
        }

        /* renamed from: m */
        public final void m3854m(C1602m0 c1602m0) {
            C1679r.m3635d(C1581e.this.f4665m);
            this.f4671f.add(c1602m0);
        }

        /* renamed from: o */
        public final C1548a.InterfaceC1556f m3852o() {
            return this.f4667b;
        }

        /* renamed from: p */
        public final void m3851p() {
            C1679r.m3635d(C1581e.this.f4665m);
            if (this.f4675j) {
                m3877A();
                m3874D(C1581e.this.f4657e.mo4786f(C1581e.this.f4656d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f4667b.m3953p();
            }
        }

        /* renamed from: w */
        public final void m3844w() {
            C1679r.m3635d(C1581e.this.f4665m);
            m3874D(C1581e.f4649n);
            this.f4670e.m3798d();
            for (C1590h c1590h : (C1590h[]) this.f4672g.keySet().toArray(new C1590h[this.f4672g.size()])) {
                m3855l(new C1599l0(c1590h, new C1289h()));
            }
            m3866L(new C1144a(4));
            if (this.f4667b.m3959d()) {
                this.f4667b.m3960b(new C1619w(this));
            }
        }

        /* renamed from: x */
        public final Map<C1590h<?>, C1622z> m3843x() {
            return this.f4672g;
        }

        /* renamed from: y */
        public final void m3842y() {
            C1679r.m3635d(C1581e.this.f4665m);
            this.f4677l = null;
        }

        /* renamed from: z */
        public final C1144a m3841z() {
            C1679r.m3635d(C1581e.this.f4665m);
            return this.f4677l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    /* loaded from: classes.dex */
    public class C1583b implements InterfaceC1580d0, AbstractC1634c.InterfaceC1637c {

        /* renamed from: a */
        private final C1548a.InterfaceC1556f f4679a;

        /* renamed from: b */
        private final C1574b<?> f4680b;

        /* renamed from: c */
        private InterfaceC1667l f4681c = null;

        /* renamed from: d */
        private Set<Scope> f4682d = null;

        /* renamed from: e */
        private boolean f4683e = false;

        public C1583b(C1548a.InterfaceC1556f interfaceC1556f, C1574b<?> c1574b) {
            this.f4679a = interfaceC1556f;
            this.f4680b = c1574b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public static /* synthetic */ boolean m3837e(C1583b c1583b, boolean z) {
            c1583b.f4683e = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public final void m3835g() {
            InterfaceC1667l interfaceC1667l;
            if (!this.f4683e || (interfaceC1667l = this.f4681c) == null) {
                return;
            }
            this.f4679a.m3958g(interfaceC1667l, this.f4682d);
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.InterfaceC1637c
        /* renamed from: a */
        public final void mo3734a(C1144a c1144a) {
            C1581e.this.f4665m.post(new RunnableC1620x(this, c1144a));
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1580d0
        /* renamed from: b */
        public final void mo3840b(C1144a c1144a) {
            ((C1582a) C1581e.this.f4661i.get(this.f4680b)).m3868J(c1144a);
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC1580d0
        /* renamed from: c */
        public final void mo3839c(InterfaceC1667l interfaceC1667l, Set<Scope> set) {
            if (interfaceC1667l == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo3840b(new C1144a(4));
                return;
            }
            this.f4681c = interfaceC1667l;
            this.f4682d = set;
            m3835g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.e$c */
    /* loaded from: classes.dex */
    public static class C1584c {

        /* renamed from: a */
        private final C1574b<?> f4685a;

        /* renamed from: b */
        private final C1146c f4686b;

        private C1584c(C1574b<?> c1574b, C1146c c1146c) {
            this.f4685a = c1574b;
            this.f4686b = c1146c;
        }

        /* synthetic */ C1584c(C1574b c1574b, C1146c c1146c, C1613s c1613s) {
            this(c1574b, c1146c);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C1584c)) {
                C1584c c1584c = (C1584c) obj;
                if (C1677q.m3642a(this.f4685a, c1584c.f4685a) && C1677q.m3642a(this.f4686b, c1584c.f4686b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C1677q.m3641b(this.f4685a, this.f4686b);
        }

        public final String toString() {
            C1677q.C1678a m3640c = C1677q.m3640c(this);
            m3640c.m3639a("key", this.f4685a);
            m3640c.m3639a("feature", this.f4686b);
            return m3640c.toString();
        }
    }

    private C1581e(Context context, Looper looper, C1147d c1147d) {
        this.f4656d = context;
        this.f4665m = new HandlerC1174d(looper, this);
        this.f4657e = c1147d;
        this.f4658f = new C1665k(c1147d);
        Handler handler = this.f4665m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: f */
    public static C1581e m3892f(Context context) {
        C1581e c1581e;
        synchronized (f4651p) {
            if (f4652q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f4652q = new C1581e(context.getApplicationContext(), handlerThread.getLooper(), C1147d.m4800l());
            }
            c1581e = f4652q;
        }
        return c1581e;
    }

    /* renamed from: g */
    private final void m3891g(C1562e<?> c1562e) {
        C1574b<?> m3944d = c1562e.m3944d();
        C1582a<?> c1582a = this.f4661i.get(m3944d);
        if (c1582a == null) {
            c1582a = new C1582a<>(c1562e);
            this.f4661i.put(m3944d, c1582a);
        }
        if (c1582a.m3861e()) {
            this.f4664l.add(m3944d);
        }
        c1582a.m3865a();
    }

    /* renamed from: b */
    public final void m3896b(C1144a c1144a, int i) {
        if (m3886l(c1144a, i)) {
            return;
        }
        Handler handler = this.f4665m;
        handler.sendMessage(handler.obtainMessage(5, i, 0, c1144a));
    }

    /* renamed from: c */
    public final void m3895c(C1562e<?> c1562e) {
        Handler handler = this.f4665m;
        handler.sendMessage(handler.obtainMessage(7, c1562e));
    }

    /* renamed from: d */
    public final <O extends C1548a.InterfaceC1552d, ResultT> void m3894d(C1562e<O> c1562e, int i, AbstractC1600m<C1548a.InterfaceC1550b, ResultT> abstractC1600m, C1289h<ResultT> c1289h, InterfaceC1598l interfaceC1598l) {
        C1597k0 c1597k0 = new C1597k0(i, abstractC1600m, c1289h, interfaceC1598l);
        Handler handler = this.f4665m;
        handler.sendMessage(handler.obtainMessage(4, new C1621y(c1597k0, this.f4660h.get(), c1562e)));
    }

    /* renamed from: h */
    public final int m3890h() {
        return this.f4659g.getAndIncrement();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C1582a<?> c1582a;
        C1289h<Boolean> m3794b;
        Boolean valueOf;
        int i = message.what;
        switch (i) {
            case 1:
                this.f4655c = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f4665m.removeMessages(12);
                for (C1574b<?> c1574b : this.f4661i.keySet()) {
                    Handler handler = this.f4665m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1574b), this.f4655c);
                }
                break;
            case 2:
                C1602m0 c1602m0 = (C1602m0) message.obj;
                Iterator<C1574b<?>> it = c1602m0.m3805b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C1574b<?> next = it.next();
                        C1582a<?> c1582a2 = this.f4661i.get(next);
                        if (c1582a2 == null) {
                            c1602m0.m3806a(next, new C1144a(13), null);
                            break;
                        } else if (c1582a2.m3863c()) {
                            c1602m0.m3806a(next, C1144a.f3850j, c1582a2.m3852o().m3955n());
                        } else if (c1582a2.m3841z() != null) {
                            c1602m0.m3806a(next, c1582a2.m3841z(), null);
                        } else {
                            c1582a2.m3854m(c1602m0);
                            c1582a2.m3865a();
                        }
                    }
                }
            case 3:
                for (C1582a<?> c1582a3 : this.f4661i.values()) {
                    c1582a3.m3842y();
                    c1582a3.m3865a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1621y c1621y = (C1621y) message.obj;
                C1582a<?> c1582a4 = this.f4661i.get(c1621y.f4738c.m3944d());
                if (c1582a4 == null) {
                    m3891g(c1621y.f4738c);
                    c1582a4 = this.f4661i.get(c1621y.f4738c.m3944d());
                }
                if (!c1582a4.m3861e() || this.f4660h.get() == c1621y.f4737b) {
                    c1582a4.m3855l(c1621y.f4736a);
                    break;
                } else {
                    c1621y.f4736a.mo3821b(f4649n);
                    c1582a4.m3844w();
                    break;
                }
            case 5:
                int i2 = message.arg1;
                C1144a c1144a = (C1144a) message.obj;
                Iterator<C1582a<?>> it2 = this.f4661i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1582a<?> next2 = it2.next();
                        c1582a = next2.m3864b() == i2 ? next2 : null;
                    }
                }
                if (c1582a != null) {
                    String mo4788d = this.f4657e.mo4788d(c1144a.m4811b());
                    String m4810c = c1144a.m4810c();
                    StringBuilder sb = new StringBuilder(String.valueOf(mo4788d).length() + 69 + String.valueOf(m4810c).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(mo4788d);
                    sb.append(": ");
                    sb.append(m4810c);
                    c1582a.m3874D(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (C1701i.m3554a() && (this.f4656d.getApplicationContext() instanceof Application)) {
                    ComponentCallbacks2C1576c.m3907c((Application) this.f4656d.getApplicationContext());
                    ComponentCallbacks2C1576c.m3908b().m3909a(new C1613s(this));
                    if (!ComponentCallbacks2C1576c.m3908b().m3904f(true)) {
                        this.f4655c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                m3891g((C1562e) message.obj);
                break;
            case 9:
                if (this.f4661i.containsKey(message.obj)) {
                    this.f4661i.get(message.obj).m3860f();
                    break;
                }
                break;
            case 10:
                for (C1574b<?> c1574b2 : this.f4664l) {
                    this.f4661i.remove(c1574b2).m3844w();
                }
                this.f4664l.clear();
                break;
            case 11:
                if (this.f4661i.containsKey(message.obj)) {
                    this.f4661i.get(message.obj).m3851p();
                    break;
                }
                break;
            case 12:
                if (this.f4661i.containsKey(message.obj)) {
                    this.f4661i.get(message.obj).m3875C();
                    break;
                }
                break;
            case 14:
                C1609q c1609q = (C1609q) message.obj;
                C1574b<?> m3795a = c1609q.m3795a();
                if (this.f4661i.containsKey(m3795a)) {
                    boolean m3872F = this.f4661i.get(m3795a).m3872F(false);
                    m3794b = c1609q.m3794b();
                    valueOf = Boolean.valueOf(m3872F);
                } else {
                    m3794b = c1609q.m3794b();
                    valueOf = Boolean.FALSE;
                }
                m3794b.m4608c(valueOf);
                break;
            case 15:
                C1584c c1584c = (C1584c) message.obj;
                if (this.f4661i.containsKey(c1584c.f4685a)) {
                    this.f4661i.get(c1584c.f4685a).m3856k(c1584c);
                    break;
                }
                break;
            case 16:
                C1584c c1584c2 = (C1584c) message.obj;
                if (this.f4661i.containsKey(c1584c2.f4685a)) {
                    this.f4661i.get(c1584c2.f4685a).m3849r(c1584c2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: l */
    final boolean m3886l(C1144a c1144a, int i) {
        return this.f4657e.m4793s(this.f4656d, c1144a, i);
    }

    /* renamed from: t */
    public final void m3878t() {
        Handler handler = this.f4665m;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
