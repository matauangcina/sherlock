package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.InterfaceC2987e;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.embedding.engine.renderer.a */
/* loaded from: classes.dex */
public class C2919a implements InterfaceC2987e {

    /* renamed from: a */
    private final FlutterJNI f7264a;

    /* renamed from: c */
    private Surface f7266c;

    /* renamed from: e */
    private final InterfaceC2924b f7268e;

    /* renamed from: b */
    private final AtomicLong f7265b = new AtomicLong(0);

    /* renamed from: d */
    private boolean f7267d = false;

    /* renamed from: io.flutter.embedding.engine.renderer.a$a */
    /* loaded from: classes.dex */
    class C2920a implements InterfaceC2924b {
        C2920a() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: d */
        public void mo366d() {
            C2919a.this.f7267d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: g */
        public void mo365g() {
            C2919a.this.f7267d = true;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.a$b */
    /* loaded from: classes.dex */
    final class C2921b implements InterfaceC2987e.InterfaceC2988a {

        /* renamed from: a */
        private final long f7270a;

        /* renamed from: b */
        private final SurfaceTextureWrapper f7271b;

        /* renamed from: c */
        private boolean f7272c;

        /* renamed from: d */
        private SurfaceTexture.OnFrameAvailableListener f7273d = new C2922a();

        /* renamed from: io.flutter.embedding.engine.renderer.a$b$a */
        /* loaded from: classes.dex */
        class C2922a implements SurfaceTexture.OnFrameAvailableListener {
            C2922a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C2921b.this.f7272c || !C2919a.this.f7264a.isAttached()) {
                    return;
                }
                C2921b c2921b = C2921b.this;
                C2919a.this.m379j(c2921b.f7270a);
            }
        }

        C2921b(long j, SurfaceTexture surfaceTexture) {
            this.f7270a = j;
            this.f7271b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                mo11b().setOnFrameAvailableListener(this.f7273d, new Handler());
            } else {
                mo11b().setOnFrameAvailableListener(this.f7273d);
            }
        }

        @Override // io.flutter.view.InterfaceC2987e.InterfaceC2988a
        /* renamed from: a */
        public void mo12a() {
            if (this.f7272c) {
                return;
            }
            C1499b.m4050d("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f7270a + ").");
            this.f7271b.release();
            C2919a.this.m370s(this.f7270a);
            this.f7272c = true;
        }

        @Override // io.flutter.view.InterfaceC2987e.InterfaceC2988a
        /* renamed from: b */
        public SurfaceTexture mo11b() {
            return this.f7271b.surfaceTexture();
        }

        @Override // io.flutter.view.InterfaceC2987e.InterfaceC2988a
        /* renamed from: c */
        public long mo10c() {
            return this.f7270a;
        }

        /* renamed from: f */
        public SurfaceTextureWrapper m367f() {
            return this.f7271b;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.a$c */
    /* loaded from: classes.dex */
    public static final class C2923c {

        /* renamed from: a */
        public float f7276a = 1.0f;

        /* renamed from: b */
        public int f7277b = 0;

        /* renamed from: c */
        public int f7278c = 0;

        /* renamed from: d */
        public int f7279d = 0;

        /* renamed from: e */
        public int f7280e = 0;

        /* renamed from: f */
        public int f7281f = 0;

        /* renamed from: g */
        public int f7282g = 0;

        /* renamed from: h */
        public int f7283h = 0;

        /* renamed from: i */
        public int f7284i = 0;

        /* renamed from: j */
        public int f7285j = 0;

        /* renamed from: k */
        public int f7286k = 0;

        /* renamed from: l */
        public int f7287l = 0;

        /* renamed from: m */
        public int f7288m = 0;

        /* renamed from: n */
        public int f7289n = 0;

        /* renamed from: o */
        public int f7290o = 0;
    }

    public C2919a(FlutterJNI flutterJNI) {
        C2920a c2920a = new C2920a();
        this.f7268e = c2920a;
        this.f7264a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c2920a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m379j(long j) {
        this.f7264a.markTextureFrameAvailable(j);
    }

    /* renamed from: k */
    private void m378k(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f7264a.registerTexture(j, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m370s(long j) {
        this.f7264a.unregisterTexture(j);
    }

    @Override // io.flutter.view.InterfaceC2987e
    /* renamed from: a */
    public InterfaceC2987e.InterfaceC2988a mo13a() {
        C1499b.m4050d("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        C2921b c2921b = new C2921b(this.f7265b.getAndIncrement(), surfaceTexture);
        C1499b.m4050d("FlutterRenderer", "New SurfaceTexture ID: " + c2921b.mo10c());
        m378k(c2921b.mo10c(), c2921b.m367f());
        return c2921b;
    }

    /* renamed from: f */
    public void m383f(InterfaceC2924b interfaceC2924b) {
        this.f7264a.addIsDisplayingFlutterUiListener(interfaceC2924b);
        if (this.f7267d) {
            interfaceC2924b.mo365g();
        }
    }

    /* renamed from: g */
    public void m382g(ByteBuffer byteBuffer, int i) {
        this.f7264a.dispatchPointerDataPacket(byteBuffer, i);
    }

    /* renamed from: h */
    public boolean m381h() {
        return this.f7267d;
    }

    /* renamed from: i */
    public boolean m380i() {
        return this.f7264a.getIsSoftwareRenderingEnabled();
    }

    /* renamed from: l */
    public void m377l(InterfaceC2924b interfaceC2924b) {
        this.f7264a.removeIsDisplayingFlutterUiListener(interfaceC2924b);
    }

    /* renamed from: m */
    public void m376m(boolean z) {
        this.f7264a.setSemanticsEnabled(z);
    }

    /* renamed from: n */
    public void m375n(C2923c c2923c) {
        C1499b.m4050d("FlutterRenderer", "Setting viewport metrics\nSize: " + c2923c.f7277b + " x " + c2923c.f7278c + "\nPadding - L: " + c2923c.f7282g + ", T: " + c2923c.f7279d + ", R: " + c2923c.f7280e + ", B: " + c2923c.f7281f + "\nInsets - L: " + c2923c.f7286k + ", T: " + c2923c.f7283h + ", R: " + c2923c.f7284i + ", B: " + c2923c.f7285j + "\nSystem Gesture Insets - L: " + c2923c.f7290o + ", T: " + c2923c.f7287l + ", R: " + c2923c.f7288m + ", B: " + c2923c.f7285j);
        this.f7264a.setViewportMetrics(c2923c.f7276a, c2923c.f7277b, c2923c.f7278c, c2923c.f7279d, c2923c.f7280e, c2923c.f7281f, c2923c.f7282g, c2923c.f7283h, c2923c.f7284i, c2923c.f7285j, c2923c.f7286k, c2923c.f7287l, c2923c.f7288m, c2923c.f7289n, c2923c.f7290o);
    }

    /* renamed from: o */
    public void m374o(Surface surface) {
        if (this.f7266c != null) {
            m373p();
        }
        this.f7266c = surface;
        this.f7264a.onSurfaceCreated(surface);
    }

    /* renamed from: p */
    public void m373p() {
        this.f7264a.onSurfaceDestroyed();
        this.f7266c = null;
        if (this.f7267d) {
            this.f7268e.mo366d();
        }
        this.f7267d = false;
    }

    /* renamed from: q */
    public void m372q(int i, int i2) {
        this.f7264a.onSurfaceChanged(i, i2);
    }

    /* renamed from: r */
    public void m371r(Surface surface) {
        this.f7266c = surface;
        this.f7264a.onSurfaceWindowChanged(surface);
    }
}
