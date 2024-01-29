package p000a.p019g.p025h;

import android.graphics.Typeface;
import android.os.Handler;
import p000a.p019g.p025h.C0155e;
import p000a.p019g.p025h.C0161f;
/* renamed from: a.g.h.a */
/* loaded from: classes.dex */
class C0148a {

    /* renamed from: a */
    private final C0161f.C0164c f555a;

    /* renamed from: b */
    private final Handler f556b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.h.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0149a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0161f.C0164c f557f;

        /* renamed from: g */
        final /* synthetic */ Typeface f558g;

        RunnableC0149a(C0148a c0148a, C0161f.C0164c c0164c, Typeface typeface) {
            this.f557f = c0164c;
            this.f558g = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f557f.mo8923b(this.f558g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.h.a$b */
    /* loaded from: classes.dex */
    public class RunnableC0150b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0161f.C0164c f559f;

        /* renamed from: g */
        final /* synthetic */ int f560g;

        RunnableC0150b(C0148a c0148a, C0161f.C0164c c0164c, int i) {
            this.f559f = c0164c;
            this.f560g = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f559f.mo8924a(this.f560g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0148a(C0161f.C0164c c0164c, Handler handler) {
        this.f555a = c0164c;
        this.f556b = handler;
    }

    /* renamed from: a */
    private void m8962a(int i) {
        this.f556b.post(new RunnableC0150b(this, this.f555a, i));
    }

    /* renamed from: c */
    private void m8960c(Typeface typeface) {
        this.f556b.post(new RunnableC0149a(this, this.f555a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8961b(C0155e.C0160e c0160e) {
        if (c0160e.m8935a()) {
            m8960c(c0160e.f582a);
        } else {
            m8962a(c0160e.f583b);
        }
    }
}
