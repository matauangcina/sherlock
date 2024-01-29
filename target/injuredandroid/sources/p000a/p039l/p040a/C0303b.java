package p000a.p039l.p040a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0889t;
import androidx.lifecycle.C0882o;
import androidx.lifecycle.C0890u;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.InterfaceC0875j;
import androidx.lifecycle.InterfaceC0883p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p014d.C0080h;
import p000a.p019g.p027j.C0187b;
import p000a.p039l.p041b.C0308a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.l.a.b */
/* loaded from: classes.dex */
public class C0303b extends AbstractC0302a {

    /* renamed from: c */
    static boolean f821c = false;

    /* renamed from: a */
    private final InterfaceC0875j f822a;

    /* renamed from: b */
    private final C0306c f823b;

    /* renamed from: a.l.a.b$a */
    /* loaded from: classes.dex */
    public static class C0304a<D> extends C0882o<D> implements C0308a.InterfaceC0309a<D> {

        /* renamed from: j */
        private final int f824j;

        /* renamed from: k */
        private final Bundle f825k;

        /* renamed from: l */
        private final C0308a<D> f826l;

        /* renamed from: m */
        private InterfaceC0875j f827m;

        /* renamed from: n */
        private C0305b<D> f828n;

        /* renamed from: o */
        private C0308a<D> f829o;

        @Override // androidx.lifecycle.LiveData
        /* renamed from: g */
        protected void mo6156g() {
            if (C0303b.f821c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f826l.m8408f();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: h */
        protected void mo6155h() {
            if (C0303b.f821c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f826l.m8407g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: i */
        public void mo6154i(InterfaceC0883p<? super D> interfaceC0883p) {
            super.mo6154i(interfaceC0883p);
            this.f827m = null;
            this.f828n = null;
        }

        @Override // androidx.lifecycle.C0882o, androidx.lifecycle.LiveData
        /* renamed from: j */
        public void mo6098j(D d) {
            super.mo6098j(d);
            C0308a<D> c0308a = this.f829o;
            if (c0308a != null) {
                c0308a.m8409e();
                this.f829o = null;
            }
        }

        /* renamed from: k */
        C0308a<D> m8423k(boolean z) {
            if (C0303b.f821c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f826l.m8412b();
            this.f826l.m8413a();
            C0305b<D> c0305b = this.f828n;
            if (c0305b != null) {
                mo6154i(c0305b);
                if (z) {
                    c0305b.m8417d();
                }
            }
            this.f826l.m8406h(this);
            if ((c0305b == null || c0305b.m8418c()) && !z) {
                return this.f826l;
            }
            this.f826l.m8409e();
            return this.f829o;
        }

        /* renamed from: l */
        public void m8422l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f824j);
            printWriter.print(" mArgs=");
            printWriter.println(this.f825k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f826l);
            C0308a<D> c0308a = this.f826l;
            c0308a.m8410d(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f828n != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f828n);
                C0305b<D> c0305b = this.f828n;
                c0305b.m8419b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m8421m().m8411c(m6159d()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m6158e());
        }

        /* renamed from: m */
        C0308a<D> m8421m() {
            return this.f826l;
        }

        /* renamed from: n */
        void m8420n() {
            InterfaceC0875j interfaceC0875j = this.f827m;
            C0305b<D> c0305b = this.f828n;
            if (interfaceC0875j == null || c0305b == null) {
                return;
            }
            super.mo6154i(c0305b);
            m6157f(interfaceC0875j, c0305b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f824j);
            sb.append(" : ");
            C0187b.m8875a(this.f826l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.l.a.b$b */
    /* loaded from: classes.dex */
    public static class C0305b<D> implements InterfaceC0883p<D> {
        /* renamed from: b */
        public abstract void m8419b(String str, PrintWriter printWriter);

        /* renamed from: c */
        abstract boolean m8418c();

        /* renamed from: d */
        abstract void m8417d();
    }

    /* renamed from: a.l.a.b$c */
    /* loaded from: classes.dex */
    static class C0306c extends AbstractC0889t {

        /* renamed from: c */
        private static final C0890u.InterfaceC0891a f830c = new C0307a();

        /* renamed from: b */
        private C0080h<C0304a> f831b = new C0080h<>();

        /* renamed from: a.l.a.b$c$a */
        /* loaded from: classes.dex */
        static class C0307a implements C0890u.InterfaceC0891a {
            C0307a() {
            }

            @Override // androidx.lifecycle.C0890u.InterfaceC0891a
            /* renamed from: a */
            public <T extends AbstractC0889t> T mo5986a(Class<T> cls) {
                return new C0306c();
            }
        }

        C0306c() {
        }

        /* renamed from: f */
        static C0306c m8415f(C0894v c0894v) {
            return (C0306c) new C0890u(c0894v, f830c).m6083a(C0306c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC0889t
        /* renamed from: d */
        public void mo5990d() {
            super.mo5990d();
            int m9318l = this.f831b.m9318l();
            for (int i = 0; i < m9318l; i++) {
                this.f831b.m9317m(i).m8423k(true);
            }
            this.f831b.m9328b();
        }

        /* renamed from: e */
        public void m8416e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f831b.m9318l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f831b.m9318l(); i++) {
                    C0304a m9317m = this.f831b.m9317m(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f831b.m9322h(i));
                    printWriter.print(": ");
                    printWriter.println(m9317m.toString());
                    m9317m.m8422l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        void m8414g() {
            int m9318l = this.f831b.m9318l();
            for (int i = 0; i < m9318l; i++) {
                this.f831b.m9317m(i).m8420n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0303b(InterfaceC0875j interfaceC0875j, C0894v c0894v) {
        this.f822a = interfaceC0875j;
        this.f823b = C0306c.m8415f(c0894v);
    }

    @Override // p000a.p039l.p040a.AbstractC0302a
    @Deprecated
    /* renamed from: a */
    public void mo8425a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f823b.m8416e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p000a.p039l.p040a.AbstractC0302a
    /* renamed from: c */
    public void mo8424c() {
        this.f823b.m8414g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0187b.m8875a(this.f822a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
