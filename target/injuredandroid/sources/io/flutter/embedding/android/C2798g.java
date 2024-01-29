package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.C2919a;
import io.flutter.embedding.engine.renderer.InterfaceC2925c;
import java.util.LinkedList;
import java.util.Queue;
/* renamed from: io.flutter.embedding.android.g */
/* loaded from: classes.dex */
public class C2798g extends View implements InterfaceC2925c {

    /* renamed from: f */
    private ImageReader f6933f;

    /* renamed from: g */
    private Queue<Image> f6934g;

    /* renamed from: h */
    private Image f6935h;

    /* renamed from: i */
    private Bitmap f6936i;

    /* renamed from: j */
    private C2919a f6937j;

    /* renamed from: k */
    private EnumC2800b f6938k;

    /* renamed from: l */
    private boolean f6939l;

    /* renamed from: io.flutter.embedding.android.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2799a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6940a;

        static {
            int[] iArr = new int[EnumC2800b.values().length];
            f6940a = iArr;
            try {
                iArr[EnumC2800b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6940a[EnumC2800b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.g$b */
    /* loaded from: classes.dex */
    public enum EnumC2800b {
        background,
        overlay
    }

    public C2798g(Context context, int i, int i2, EnumC2800b enumC2800b) {
        this(context, m674e(i, i2), enumC2800b);
    }

    C2798g(Context context, ImageReader imageReader, EnumC2800b enumC2800b) {
        super(context, null);
        this.f6939l = false;
        this.f6933f = imageReader;
        this.f6938k = enumC2800b;
        this.f6934g = new LinkedList();
        m673f();
    }

    /* renamed from: e */
    private static ImageReader m674e(int i, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i, i2, 1, 3, 768L) : ImageReader.newInstance(i, i2, 1, 3);
    }

    /* renamed from: f */
    private void m673f() {
        setAlpha(0.0f);
    }

    /* renamed from: h */
    private void m671h() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f6935h.getHardwareBuffer();
            this.f6936i = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f6935h.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f6935h.getHeight();
        Bitmap bitmap = this.f6936i;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f6936i.getHeight() != height) {
            this.f6936i = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        this.f6936i.copyPixelsFromBuffer(plane.getBuffer());
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: a */
    public void mo364a() {
        if (this.f6939l) {
            setAlpha(0.0f);
            m675d();
            this.f6936i = null;
            for (Image image : this.f6934g) {
                image.close();
            }
            this.f6934g.clear();
            Image image2 = this.f6935h;
            if (image2 != null) {
                image2.close();
                this.f6935h = null;
            }
            invalidate();
            this.f6939l = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: b */
    public void mo363b(C2919a c2919a) {
        if (this.f6939l) {
            return;
        }
        if (C2799a.f6940a[this.f6938k.ordinal()] == 1) {
            c2919a.m371r(this.f6933f.getSurface());
        }
        setAlpha(1.0f);
        this.f6937j = c2919a;
        this.f6939l = true;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    /* renamed from: c */
    public void mo362c() {
    }

    /* renamed from: d */
    public boolean m675d() {
        Image acquireLatestImage;
        if (this.f6939l) {
            int size = this.f6934g.size();
            if (this.f6935h != null) {
                size++;
            }
            if (size < this.f6933f.getMaxImages() && (acquireLatestImage = this.f6933f.acquireLatestImage()) != null) {
                this.f6934g.add(acquireLatestImage);
            }
            invalidate();
            return !this.f6934g.isEmpty();
        }
        return false;
    }

    /* renamed from: g */
    public void m672g(int i, int i2) {
        if (this.f6937j == null) {
            return;
        }
        if (i == this.f6933f.getWidth() && i2 == this.f6933f.getHeight()) {
            return;
        }
        this.f6934g.clear();
        this.f6935h = null;
        this.f6933f.close();
        this.f6933f = m674e(i, i2);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC2925c
    public C2919a getAttachedRenderer() {
        return this.f6937j;
    }

    public Surface getSurface() {
        return this.f6933f.getSurface();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6934g.isEmpty()) {
            Image image = this.f6935h;
            if (image != null) {
                image.close();
            }
            this.f6935h = this.f6934g.poll();
            m671h();
        }
        Bitmap bitmap = this.f6936i;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.f6933f.getWidth() && i2 == this.f6933f.getHeight()) && this.f6938k == EnumC2800b.background && this.f6939l) {
            m672g(i, i2);
            this.f6937j.m371r(this.f6933f.getSurface());
        }
    }
}
