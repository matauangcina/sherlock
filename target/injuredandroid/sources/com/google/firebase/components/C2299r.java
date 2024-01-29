package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p054b.p059c.p098c.p099j.C1427a;
import p054b.p059c.p098c.p099j.InterfaceC1428b;
import p054b.p059c.p098c.p099j.InterfaceC1429c;
import p054b.p059c.p098c.p099j.InterfaceC1430d;
/* renamed from: com.google.firebase.components.r */
/* loaded from: classes.dex */
class C2299r implements InterfaceC1430d, InterfaceC1429c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC1428b<Object>, Executor>> f6099a = new HashMap();

    /* renamed from: b */
    private Queue<C1427a<?>> f6100b = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2299r(Executor executor) {
    }

    /* renamed from: b */
    private synchronized Set<Map.Entry<InterfaceC1428b<Object>, Executor>> m2088b(C1427a<?> c1427a) {
        ConcurrentHashMap<InterfaceC1428b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f6099a.get(c1427a.m4177a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2089a() {
        Queue<C1427a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f6100b != null) {
                Queue<C1427a<?>> queue2 = this.f6100b;
                this.f6100b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C1427a<?> c1427a : queue) {
                m2086d(c1427a);
            }
        }
    }

    /* renamed from: d */
    public void m2086d(C1427a<?> c1427a) {
        C2302u.m2084b(c1427a);
        synchronized (this) {
            if (this.f6100b != null) {
                this.f6100b.add(c1427a);
                return;
            }
            for (Map.Entry<InterfaceC1428b<Object>, Executor> entry : m2088b(c1427a)) {
                entry.getValue().execute(RunnableC2298q.m2090a(entry, c1427a));
            }
        }
    }
}
