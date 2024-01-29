package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.C2919a;
import io.flutter.embedding.engine.renderer.InterfaceC2925c;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.embedding.android.i */
/* loaded from: classes.dex */
public class C2804i extends TextureView implements InterfaceC2925c {

    /* renamed from: f */
    private boolean f6952f;

    /* renamed from: g */
    private boolean f6953g;

    /* renamed from: h */
    private C2919a f6954h;

    /* renamed from: i */
    private Surface f6955i;

    /* renamed from: j */
    private final TextureView.SurfaceTextureListener f6956j;

    /* renamed from: io.flutter.embedding.android.i$a */
    /* loaded from: classes.dex */
    class TextureView$SurfaceTextureListenerC2805a implements TextureView.SurfaceTextureListener {
        TextureView$SurfaceTextureListenerC2805a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C1499b.m4050d("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            C2804i.this.f6952f = true;
            if (C2804i.this.f6953g) {
                C2804i.this.m654j();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1499b.m4050d("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            C2804i.this.f6952f = false;
            if (C2804i.this.f6953g) {
                C2804i.this.m653k();
                return true;
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C1499b.m4050d("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (C2804i.this.f6953g) {
                C2804i.this.m655i(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public C2804i(Context context) {
        this(context, null);
    }

    public C2804i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6952f = false;
        this.f6953g = false;
        this.f6956j = new TextureView$SurfaceTextureListenerC2805a();
        m652l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m655i(int i, int i2) {
        if (this.f6954h == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        C1499b.m4050d("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
        this.f6954h.m372q(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m654j() {
        if (this.f6954h == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = new Surface(getSurfaceTexture());
        this.f6955i = surface;
        this.f6954h.m374o(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m653k() {
        C2919a c2919a = this.f6954h;
        if (c2919a == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        c2919a.m373p();
        Surface surface = this.f6955i;
        if (surface != null) {
            surface.release();
            this.f6955i = null;
        }
    }

    /* renamed from: l */
    private void m652l() {
        setSurfaceTextureListener(this.f6956j);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: a */
    public void mo364a() {
        if (this.f6954h == null) {
            C1499b.m4049e("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            C1499b.m4050d("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            m653k();
        }
        this.f6954h = null;
        this.f6953g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: b */
    public void mo363b(C2919a c2919a) {
        C1499b.m4050d("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f6954h != null) {
            C1499b.m4050d("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f6954h.m373p();
        }
        this.f6954h = c2919a;
        this.f6953g = true;
        if (this.f6952f) {
            C1499b.m4050d("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m654j();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: c */
    public void mo362c() {
        if (this.f6954h == null) {
            C1499b.m4049e("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f6954h = null;
        this.f6953g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    public C2919a getAttachedRenderer() {
        return this.f6954h;
    }
}
