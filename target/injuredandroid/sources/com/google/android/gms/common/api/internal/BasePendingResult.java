package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC1567h;
import com.google.android.gms.common.api.InterfaceC1569i;
import com.google.android.gms.common.api.InterfaceC1624k;
import com.google.android.gms.common.api.InterfaceC1625l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p054b.p059c.p060a.p061a.p068d.p069a.HandlerC1174d;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC1624k> extends AbstractC1567h<R> {

    /* renamed from: e */
    private InterfaceC1625l<? super R> f4622e;

    /* renamed from: g */
    private R f4624g;

    /* renamed from: h */
    private Status f4625h;

    /* renamed from: i */
    private volatile boolean f4626i;

    /* renamed from: j */
    private boolean f4627j;

    /* renamed from: k */
    private boolean f4628k;
    @KeepName
    private C1571b mResultGuardian;

    /* renamed from: a */
    private final Object f4618a = new Object();

    /* renamed from: c */
    private final CountDownLatch f4620c = new CountDownLatch(1);

    /* renamed from: d */
    private final ArrayList<AbstractC1567h.InterfaceC1568a> f4621d = new ArrayList<>();

    /* renamed from: f */
    private final AtomicReference<InterfaceC1593i0> f4623f = new AtomicReference<>();

    /* renamed from: b */
    private final HandlerC1570a<R> f4619b = new HandlerC1570a<>(Looper.getMainLooper());

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes.dex */
    public static class HandlerC1570a<R extends InterfaceC1624k> extends HandlerC1174d {
        public HandlerC1570a(Looper looper) {
            super(looper);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.common.api.internal.BasePendingResult.h(com.google.android.gms.common.api.l):com.google.android.gms.common.api.l
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
            	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
            	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
            	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
            	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
            	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
            	... 1 more
            */
        /* renamed from: a */
        public final void m3924a(com.google.android.gms.common.api.InterfaceC1625l<? super R> r2, R r3) {
            /*
                r1 = this;
                com.google.android.gms.common.api.internal.BasePendingResult.m3927h(r2)
                android.util.Pair r0 = new android.util.Pair
                r0.<init>(r2, r3)
                r2 = 1
                android.os.Message r2 = r1.obtainMessage(r2, r0)
                r1.sendMessage(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.HandlerC1570a.m3924a(com.google.android.gms.common.api.l, com.google.android.gms.common.api.k):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).m3925j(Status.f4598k);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC1625l interfaceC1625l = (InterfaceC1625l) pair.first;
            InterfaceC1624k interfaceC1624k = (InterfaceC1624k) pair.second;
            try {
                interfaceC1625l.m3779a(interfaceC1624k);
            } catch (RuntimeException e) {
                BasePendingResult.m3926i(interfaceC1624k);
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    /* loaded from: classes.dex */
    public final class C1571b {
        private C1571b() {
        }

        /* synthetic */ C1571b(BasePendingResult basePendingResult, C1606o0 c1606o0) {
            this();
        }

        protected final void finalize() {
            BasePendingResult.m3926i(BasePendingResult.this.f4624g);
            super.finalize();
        }
    }

    static {
        new C1606o0();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference(null);
    }

    /* renamed from: b */
    private final R m3933b() {
        R r;
        synchronized (this.f4618a) {
            C1679r.m3628k(!this.f4626i, "Result has already been consumed.");
            C1679r.m3628k(m3932c(), "Result is not ready.");
            r = this.f4624g;
            this.f4624g = null;
            this.f4622e = null;
            this.f4626i = true;
        }
        InterfaceC1593i0 andSet = this.f4623f.getAndSet(null);
        if (andSet != null) {
            andSet.m3826a(this);
        }
        return r;
    }

    /* renamed from: f */
    private static <R extends InterfaceC1624k> InterfaceC1625l<R> m3929f(InterfaceC1625l<R> interfaceC1625l) {
        return interfaceC1625l;
    }

    /* renamed from: g */
    private final void m3928g(R r) {
        this.f4624g = r;
        this.f4620c.countDown();
        this.f4625h = this.f4624g.getStatus();
        if (this.f4627j) {
            this.f4622e = null;
        } else if (this.f4622e != null) {
            this.f4619b.removeMessages(2);
            this.f4619b.m3924a(this.f4622e, m3933b());
        } else if (this.f4624g instanceof InterfaceC1569i) {
            this.mResultGuardian = new C1571b(this, null);
        }
        ArrayList<AbstractC1567h.InterfaceC1568a> arrayList = this.f4621d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC1567h.InterfaceC1568a interfaceC1568a = arrayList.get(i);
            i++;
            interfaceC1568a.m3936a(this.f4625h);
        }
        this.f4621d.clear();
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    /* renamed from: h */
    static /* synthetic */ com.google.android.gms.common.api.InterfaceC1625l m3927h(com.google.android.gms.common.api.InterfaceC1625l r0) {
        /*
            m3929f(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.m3927h(com.google.android.gms.common.api.l):com.google.android.gms.common.api.l");
    }

    /* renamed from: i */
    public static void m3926i(InterfaceC1624k interfaceC1624k) {
        if (interfaceC1624k instanceof InterfaceC1569i) {
            try {
                ((InterfaceC1569i) interfaceC1624k).m3935a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(interfaceC1624k);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    protected abstract R m3934a(Status status);

    /* renamed from: c */
    public final boolean m3932c() {
        return this.f4620c.getCount() == 0;
    }

    /* renamed from: d */
    public final void m3931d(R r) {
        synchronized (this.f4618a) {
            if (this.f4628k || this.f4627j) {
                m3926i(r);
                return;
            }
            m3932c();
            boolean z = true;
            C1679r.m3628k(!m3932c(), "Results have already been set");
            if (this.f4626i) {
                z = false;
            }
            C1679r.m3628k(z, "Result has already been consumed");
            m3928g(r);
        }
    }

    /* renamed from: j */
    public final void m3925j(Status status) {
        synchronized (this.f4618a) {
            if (!m3932c()) {
                m3931d(m3934a(status));
                this.f4628k = true;
            }
        }
    }
}
