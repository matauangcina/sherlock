package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1548a.InterfaceC1552d;
import com.google.android.gms.common.api.internal.InterfaceC1579d;
import com.google.android.gms.common.api.internal.InterfaceC1592i;
import com.google.android.gms.common.internal.AbstractC1634c;
import com.google.android.gms.common.internal.C1648d;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.InterfaceC1667l;
import java.util.Set;
import p054b.p059c.p060a.p061a.p063b.C1146c;
/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C1548a<O extends InterfaceC1552d> {

    /* renamed from: a */
    private final AbstractC1549a<?, O> f4604a;

    /* renamed from: b */
    private final String f4605b;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1549a<T extends InterfaceC1556f, O> extends AbstractC1555e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo3963a(Context context, Looper looper, C1648d c1648d, O o, InterfaceC1565f interfaceC1565f, InterfaceC1566g interfaceC1566g) {
            return mo2169b(context, looper, c1648d, o, interfaceC1565f, interfaceC1566g);
        }

        /* renamed from: b */
        public T mo2169b(Context context, Looper looper, C1648d c1648d, O o, InterfaceC1579d interfaceC1579d, InterfaceC1592i interfaceC1592i) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1550b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes.dex */
    public static class C1551c<C extends InterfaceC1550b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1552d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes.dex */
        public interface InterfaceC1553a extends InterfaceC1552d {
            /* renamed from: c */
            Account m3962c();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1554b extends InterfaceC1552d {
            /* renamed from: a */
            GoogleSignInAccount m3961a();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1555e<T extends InterfaceC1550b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1556f extends InterfaceC1550b {
        /* renamed from: b */
        void m3960b(AbstractC1634c.InterfaceC1639e interfaceC1639e);

        /* renamed from: d */
        boolean m3959d();

        /* renamed from: e */
        Set<Scope> mo3683e();

        /* renamed from: g */
        void m3958g(InterfaceC1667l interfaceC1667l, Set<Scope> set);

        /* renamed from: j */
        boolean mo2215j();

        /* renamed from: k */
        int mo2214k();

        /* renamed from: l */
        boolean m3957l();

        /* renamed from: m */
        C1146c[] m3956m();

        /* renamed from: n */
        String m3955n();

        /* renamed from: o */
        void m3954o(AbstractC1634c.InterfaceC1637c interfaceC1637c);

        /* renamed from: p */
        void m3953p();

        /* renamed from: q */
        boolean mo3739q();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes.dex */
    public static final class C1557g<C extends InterfaceC1556f> extends C1551c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    /* loaded from: classes.dex */
    public interface InterfaceC1558h<T extends IInterface> extends InterfaceC1550b {
        /* renamed from: f */
        String m3952f();

        /* renamed from: h */
        T m3951h(IBinder iBinder);

        /* renamed from: r */
        String m3950r();

        /* renamed from: s */
        void m3949s(int i, T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends InterfaceC1556f> C1548a(String str, AbstractC1549a<C, O> abstractC1549a, C1557g<C> c1557g) {
        C1679r.m3630i(abstractC1549a, "Cannot construct an Api with a null ClientBuilder");
        C1679r.m3630i(c1557g, "Cannot construct an Api with a null ClientKey");
        this.f4605b = str;
        this.f4604a = abstractC1549a;
    }

    /* renamed from: a */
    public final String m3965a() {
        return this.f4605b;
    }

    /* renamed from: b */
    public final AbstractC1549a<?, O> m3964b() {
        C1679r.m3628k(this.f4604a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f4604a;
    }
}
