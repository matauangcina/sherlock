package io.flutter.embedding.engine.p149e;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1532s;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* renamed from: io.flutter.embedding.engine.e.a */
/* loaded from: classes.dex */
public class C2832a implements InterfaceC1507b {

    /* renamed from: a */
    private final FlutterJNI f7045a;

    /* renamed from: b */
    private final AssetManager f7046b;

    /* renamed from: c */
    private final C2837b f7047c;

    /* renamed from: d */
    private final InterfaceC1507b f7048d;

    /* renamed from: f */
    private String f7050f;

    /* renamed from: g */
    private InterfaceC2836d f7051g;

    /* renamed from: e */
    private boolean f7049e = false;

    /* renamed from: h */
    private final InterfaceC1507b.InterfaceC1508a f7052h = new C2833a();

    /* renamed from: io.flutter.embedding.engine.e.a$a */
    /* loaded from: classes.dex */
    class C2833a implements InterfaceC1507b.InterfaceC1508a {
        C2833a() {
        }

        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b.InterfaceC1508a
        /* renamed from: a */
        public void mo551a(ByteBuffer byteBuffer, InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
            C2832a.this.f7050f = C1532s.f4564b.mo4005b(byteBuffer);
            if (C2832a.this.f7051g != null) {
                C2832a.this.f7051g.m550a(C2832a.this.f7050f);
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.e.a$b */
    /* loaded from: classes.dex */
    public static class C2834b {

        /* renamed from: a */
        public final String f7054a;

        /* renamed from: b */
        public final String f7055b;

        public C2834b(String str, String str2) {
            this.f7054a = str;
            this.f7055b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2834b.class != obj.getClass()) {
                return false;
            }
            C2834b c2834b = (C2834b) obj;
            if (this.f7054a.equals(c2834b.f7054a)) {
                return this.f7055b.equals(c2834b.f7055b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f7054a.hashCode() * 31) + this.f7055b.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f7054a + ", function: " + this.f7055b + " )";
        }
    }

    /* renamed from: io.flutter.embedding.engine.e.a$c */
    /* loaded from: classes.dex */
    private static class C2835c implements InterfaceC1507b {

        /* renamed from: a */
        private final C2837b f7056a;

        private C2835c(C2837b c2837b) {
            this.f7056a = c2837b;
        }

        /* synthetic */ C2835c(C2837b c2837b, C2833a c2833a) {
            this(c2837b);
        }

        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b
        /* renamed from: a */
        public void mo549a(String str, ByteBuffer byteBuffer, InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
            this.f7056a.mo549a(str, byteBuffer, interfaceC1509b);
        }

        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b
        /* renamed from: b */
        public void mo548b(String str, InterfaceC1507b.InterfaceC1508a interfaceC1508a) {
            this.f7056a.mo548b(str, interfaceC1508a);
        }
    }

    /* renamed from: io.flutter.embedding.engine.e.a$d */
    /* loaded from: classes.dex */
    interface InterfaceC2836d {
        /* renamed from: a */
        void m550a(String str);
    }

    public C2832a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f7045a = flutterJNI;
        this.f7046b = assetManager;
        C2837b c2837b = new C2837b(flutterJNI);
        this.f7047c = c2837b;
        c2837b.mo548b("flutter/isolate", this.f7052h);
        this.f7048d = new C2835c(this.f7047c, null);
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1507b
    @Deprecated
    /* renamed from: a */
    public void mo549a(String str, ByteBuffer byteBuffer, InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
        this.f7048d.mo549a(str, byteBuffer, interfaceC1509b);
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1507b
    @Deprecated
    /* renamed from: b */
    public void mo548b(String str, InterfaceC1507b.InterfaceC1508a interfaceC1508a) {
        this.f7048d.mo548b(str, interfaceC1508a);
    }

    /* renamed from: f */
    public void m557f(C2834b c2834b) {
        if (this.f7049e) {
            C1499b.m4049e("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C1499b.m4050d("DartExecutor", "Executing Dart entrypoint: " + c2834b);
        this.f7045a.runBundleAndSnapshotFromLibrary(c2834b.f7054a, c2834b.f7055b, null, this.f7046b);
        this.f7049e = true;
    }

    /* renamed from: g */
    public String m556g() {
        return this.f7050f;
    }

    /* renamed from: h */
    public boolean m555h() {
        return this.f7049e;
    }

    /* renamed from: i */
    public void m554i() {
        if (this.f7045a.isAttached()) {
            this.f7045a.notifyLowMemoryWarning();
        }
    }

    /* renamed from: j */
    public void m553j() {
        C1499b.m4050d("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f7045a.setPlatformMessageHandler(this.f7047c);
    }

    /* renamed from: k */
    public void m552k() {
        C1499b.m4050d("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f7045a.setPlatformMessageHandler(null);
    }
}
