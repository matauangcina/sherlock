package io.flutter.embedding.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.C2919a;
import io.flutter.embedding.engine.renderer.InterfaceC2924b;
import io.flutter.embedding.engine.renderer.InterfaceC2925c;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.embedding.android.h */
/* loaded from: classes.dex */
public class C2801h extends SurfaceView implements InterfaceC2925c {

    /* renamed from: f */
    private final boolean f6944f;

    /* renamed from: g */
    private boolean f6945g;

    /* renamed from: h */
    private boolean f6946h;

    /* renamed from: i */
    private C2919a f6947i;

    /* renamed from: j */
    private final SurfaceHolder.Callback f6948j;

    /* renamed from: k */
    private final InterfaceC2924b f6949k;

    /* renamed from: io.flutter.embedding.android.h$a */
    /* loaded from: classes.dex */
    class SurfaceHolder$CallbackC2802a implements SurfaceHolder.Callback {
        SurfaceHolder$CallbackC2802a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C1499b.m4050d("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (C2801h.this.f6946h) {
                C2801h.this.m664j(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C1499b.m4050d("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            C2801h.this.f6945g = true;
            if (C2801h.this.f6946h) {
                C2801h.this.m663k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C1499b.m4050d("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            C2801h.this.f6945g = false;
            if (C2801h.this.f6946h) {
                C2801h.this.m662l();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.h$b */
    /* loaded from: classes.dex */
    class C2803b implements InterfaceC2924b {
        C2803b() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: d */
        public void mo366d() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: g */
        public void mo365g() {
            C1499b.m4050d("FlutterSurfaceView", "onFlutterUiDisplayed()");
            C2801h.this.setAlpha(1.0f);
            if (C2801h.this.f6947i != null) {
                C2801h.this.f6947i.m377l(this);
            }
        }
    }

    private C2801h(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f6945g = false;
        this.f6946h = false;
        this.f6948j = new SurfaceHolder$CallbackC2802a();
        this.f6949k = new C2803b();
        this.f6944f = z;
        m661m();
    }

    public C2801h(Context context, boolean z) {
        this(context, null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m664j(int i, int i2) {
        if (this.f6947i == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        C1499b.m4050d("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
        this.f6947i.m372q(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m663k() {
        if (this.f6947i == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f6947i.m374o(getHolder().getSurface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m662l() {
        C2919a c2919a = this.f6947i;
        if (c2919a == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        c2919a.m373p();
    }

    /* renamed from: m */
    private void m661m() {
        if (this.f6944f) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f6948j);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: a */
    public void mo364a() {
        if (this.f6947i == null) {
            C1499b.m4049e("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            C1499b.m4050d("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m662l();
        }
        setAlpha(0.0f);
        this.f6947i.m377l(this.f6949k);
        this.f6947i = null;
        this.f6946h = false;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: b */
    public void mo363b(C2919a c2919a) {
        C1499b.m4050d("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f6947i != null) {
            C1499b.m4050d("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f6947i.m373p();
            this.f6947i.m377l(this.f6949k);
        }
        this.f6947i = c2919a;
        this.f6946h = true;
        c2919a.m383f(this.f6949k);
        if (this.f6945g) {
            C1499b.m4050d("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m663k();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: c */
    public void mo362c() {
        if (this.f6947i == null) {
            C1499b.m4049e("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f6947i = null;
        this.f6946h = false;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    public C2919a getAttachedRenderer() {
        return this.f6947i;
    }
}
