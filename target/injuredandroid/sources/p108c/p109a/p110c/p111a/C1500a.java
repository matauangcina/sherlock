package p108c.p109a.p110c.p111a;

import java.nio.ByteBuffer;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* renamed from: c.a.c.a.a */
/* loaded from: classes.dex */
public final class C1500a<T> {

    /* renamed from: a */
    private final InterfaceC1507b f4534a;

    /* renamed from: b */
    private final String f4535b;

    /* renamed from: c */
    private final InterfaceC1514g<T> f4536c;

    /* renamed from: c.a.c.a.a$b */
    /* loaded from: classes.dex */
    private final class C1502b implements InterfaceC1507b.InterfaceC1508a {

        /* renamed from: a */
        private final InterfaceC1505d<T> f4537a;

        /* renamed from: c.a.c.a.a$b$a */
        /* loaded from: classes.dex */
        class C1503a implements InterfaceC1506e<T> {

            /* renamed from: a */
            final /* synthetic */ InterfaceC1507b.InterfaceC1509b f4539a;

            C1503a(InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
                this.f4539a = interfaceC1509b;
            }

            @Override // p108c.p109a.p110c.p111a.C1500a.InterfaceC1506e
            /* renamed from: a */
            public void mo486a(T t) {
                this.f4539a.mo546a(C1500a.this.f4536c.mo4006a(t));
            }
        }

        private C1502b(InterfaceC1505d<T> interfaceC1505d) {
            this.f4537a = interfaceC1505d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b.InterfaceC1508a
        /* renamed from: a */
        public void mo551a(ByteBuffer byteBuffer, InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
            try {
                this.f4537a.mo478a(C1500a.this.f4536c.mo4005b(byteBuffer), new C1503a(interfaceC1509b));
            } catch (RuntimeException e) {
                C1499b.m4051c("BasicMessageChannel#" + C1500a.this.f4535b, "Failed to handle message", e);
                interfaceC1509b.mo546a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.a.c.a.a$c */
    /* loaded from: classes.dex */
    public final class C1504c implements InterfaceC1507b.InterfaceC1509b {

        /* renamed from: a */
        private final InterfaceC1506e<T> f4541a;

        private C1504c(InterfaceC1506e<T> interfaceC1506e) {
            this.f4541a = interfaceC1506e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b.InterfaceC1509b
        /* renamed from: a */
        public void mo546a(ByteBuffer byteBuffer) {
            try {
                this.f4541a.mo486a(C1500a.this.f4536c.mo4005b(byteBuffer));
            } catch (RuntimeException e) {
                C1499b.m4051c("BasicMessageChannel#" + C1500a.this.f4535b, "Failed to handle message reply", e);
            }
        }
    }

    /* renamed from: c.a.c.a.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1505d<T> {
        /* renamed from: a */
        void mo478a(T t, InterfaceC1506e<T> interfaceC1506e);
    }

    /* renamed from: c.a.c.a.a$e */
    /* loaded from: classes.dex */
    public interface InterfaceC1506e<T> {
        /* renamed from: a */
        void mo486a(T t);
    }

    public C1500a(InterfaceC1507b interfaceC1507b, String str, InterfaceC1514g<T> interfaceC1514g) {
        this.f4534a = interfaceC1507b;
        this.f4535b = str;
        this.f4536c = interfaceC1514g;
    }

    /* renamed from: c */
    public void m4045c(T t) {
        m4044d(t, null);
    }

    /* renamed from: d */
    public void m4044d(T t, InterfaceC1506e<T> interfaceC1506e) {
        this.f4534a.mo549a(this.f4535b, this.f4536c.mo4006a(t), interfaceC1506e != null ? new C1504c(interfaceC1506e) : null);
    }

    /* renamed from: e */
    public void m4043e(InterfaceC1505d<T> interfaceC1505d) {
        this.f4534a.mo548b(this.f4535b, interfaceC1505d != null ? new C1502b(interfaceC1505d) : null);
    }
}
