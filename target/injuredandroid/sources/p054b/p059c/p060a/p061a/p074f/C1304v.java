package p054b.p059c.p060a.p061a.p074f;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.f.v */
/* loaded from: classes.dex */
public final class C1304v<TResult> {

    /* renamed from: a */
    private final Object f4086a = new Object();

    /* renamed from: b */
    private Queue<InterfaceC1303u<TResult>> f4087b;

    /* renamed from: c */
    private boolean f4088c;

    /* renamed from: a */
    public final void m4591a(AbstractC1288g<TResult> abstractC1288g) {
        InterfaceC1303u<TResult> poll;
        synchronized (this.f4086a) {
            if (this.f4087b != null && !this.f4088c) {
                this.f4088c = true;
                while (true) {
                    synchronized (this.f4086a) {
                        poll = this.f4087b.poll();
                        if (poll == null) {
                            this.f4088c = false;
                            return;
                        }
                    }
                    poll.mo4592a(abstractC1288g);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m4590b(InterfaceC1303u<TResult> interfaceC1303u) {
        synchronized (this.f4086a) {
            if (this.f4087b == null) {
                this.f4087b = new ArrayDeque();
            }
            this.f4087b.add(interfaceC1303u);
        }
    }
}
