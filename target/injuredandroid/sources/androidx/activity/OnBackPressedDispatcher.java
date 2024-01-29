package androidx.activity;

import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f1162a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0431b> f1163b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    private class LifecycleOnBackPressedCancellable implements InterfaceC0873h, InterfaceC0430a {

        /* renamed from: a */
        private final AbstractC0868e f1164a;

        /* renamed from: b */
        private final AbstractC0431b f1165b;

        /* renamed from: c */
        private InterfaceC0430a f1166c;

        LifecycleOnBackPressedCancellable(AbstractC0868e abstractC0868e, AbstractC0431b abstractC0431b) {
            this.f1164a = abstractC0868e;
            this.f1165b = abstractC0431b;
            abstractC0868e.mo6124a(this);
        }

        @Override // androidx.activity.InterfaceC0430a
        public void cancel() {
            this.f1164a.mo6122c(this);
            this.f1165b.m8129e(this);
            InterfaceC0430a interfaceC0430a = this.f1166c;
            if (interfaceC0430a != null) {
                interfaceC0430a.cancel();
                this.f1166c = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC0873h
        /* renamed from: d */
        public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
            if (enumC0869a == AbstractC0868e.EnumC0869a.ON_START) {
                this.f1166c = OnBackPressedDispatcher.this.m8134b(this.f1165b);
            } else if (enumC0869a != AbstractC0868e.EnumC0869a.ON_STOP) {
                if (enumC0869a == AbstractC0868e.EnumC0869a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0430a interfaceC0430a = this.f1166c;
                if (interfaceC0430a != null) {
                    interfaceC0430a.cancel();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public class C0429a implements InterfaceC0430a {

        /* renamed from: a */
        private final AbstractC0431b f1168a;

        C0429a(AbstractC0431b abstractC0431b) {
            this.f1168a = abstractC0431b;
        }

        @Override // androidx.activity.InterfaceC0430a
        public void cancel() {
            OnBackPressedDispatcher.this.f1163b.remove(this.f1168a);
            this.f1168a.m8129e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1162a = runnable;
    }

    /* renamed from: a */
    public void m8135a(InterfaceC0875j interfaceC0875j, AbstractC0431b abstractC0431b) {
        AbstractC0868e mo698a = interfaceC0875j.mo698a();
        if (mo698a.mo6123b() == AbstractC0868e.EnumC0870b.DESTROYED) {
            return;
        }
        abstractC0431b.m8132a(new LifecycleOnBackPressedCancellable(mo698a, abstractC0431b));
    }

    /* renamed from: b */
    InterfaceC0430a m8134b(AbstractC0431b abstractC0431b) {
        this.f1163b.add(abstractC0431b);
        C0429a c0429a = new C0429a(abstractC0431b);
        abstractC0431b.m8132a(c0429a);
        return c0429a;
    }

    /* renamed from: c */
    public void m8133c() {
        Iterator<AbstractC0431b> descendingIterator = this.f1163b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0431b next = descendingIterator.next();
            if (next.m8131c()) {
                next.mo6055b();
                return;
            }
        }
        Runnable runnable = this.f1162a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
