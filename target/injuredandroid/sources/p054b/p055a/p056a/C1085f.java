package p054b.p055a.p056a;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: b.a.a.f */
/* loaded from: classes.dex */
public class C1085f implements InterfaceC1103p {

    /* renamed from: a */
    private final Executor f3740a;

    /* renamed from: b.a.a.f$a */
    /* loaded from: classes.dex */
    class ExecutorC1086a implements Executor {

        /* renamed from: a */
        final /* synthetic */ Handler f3741a;

        ExecutorC1086a(C1085f c1085f, Handler handler) {
            this.f3741a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f3741a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.f$b */
    /* loaded from: classes.dex */
    public static class RunnableC1087b implements Runnable {

        /* renamed from: f */
        private final AbstractC1094m f3742f;

        /* renamed from: g */
        private final C1100o f3743g;

        /* renamed from: h */
        private final Runnable f3744h;

        public RunnableC1087b(AbstractC1094m abstractC1094m, C1100o c1100o, Runnable runnable) {
            this.f3742f = abstractC1094m;
            this.f3743g = c1100o;
            this.f3744h = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3742f.m4970N()) {
                this.f3742f.m4952s("canceled-at-delivery");
                return;
            }
            if (this.f3743g.m4937b()) {
                this.f3742f.mo4853i(this.f3743g.f3789a);
            } else {
                this.f3742f.m4955g(this.f3743g.f3791c);
            }
            if (this.f3743g.f3792d) {
                this.f3742f.m4957e("intermediate-response");
            } else {
                this.f3742f.m4952s("done");
            }
            Runnable runnable = this.f3744h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C1085f(Handler handler) {
        this.f3740a = new ExecutorC1086a(this, handler);
    }

    @Override // p054b.p055a.p056a.InterfaceC1103p
    /* renamed from: a */
    public void mo4935a(AbstractC1094m<?> abstractC1094m, C1107t c1107t) {
        abstractC1094m.m4957e("post-error");
        this.f3740a.execute(new RunnableC1087b(abstractC1094m, C1100o.m4938a(c1107t), null));
    }

    @Override // p054b.p055a.p056a.InterfaceC1103p
    /* renamed from: b */
    public void mo4934b(AbstractC1094m<?> abstractC1094m, C1100o<?> c1100o) {
        mo4933c(abstractC1094m, c1100o, null);
    }

    @Override // p054b.p055a.p056a.InterfaceC1103p
    /* renamed from: c */
    public void mo4933c(AbstractC1094m<?> abstractC1094m, C1100o<?> c1100o, Runnable runnable) {
        abstractC1094m.m4969O();
        abstractC1094m.m4957e("post-response");
        this.f3740a.execute(new RunnableC1087b(abstractC1094m, c1100o, runnable));
    }
}
