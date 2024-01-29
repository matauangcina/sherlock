package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0761c;
/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
class C0643r {

    /* renamed from: c */
    private static final int[] f2175c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f2176a;

    /* renamed from: b */
    private Bitmap f2177b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0643r(ProgressBar progressBar) {
        this.f2176a = progressBar;
    }

    /* renamed from: a */
    private Shape m7273a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: d */
    private Drawable m7271d(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0761c) {
            InterfaceC0761c interfaceC0761c = (InterfaceC0761c) drawable;
            Drawable mo6742b = interfaceC0761c.mo6742b();
            if (mo6742b != null) {
                interfaceC0761c.mo6743a(m7271d(mo6742b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m7271d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2177b == null) {
                this.f2177b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m7273a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m7270e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m7271d = m7271d(animationDrawable.getFrame(i), true);
                m7271d.setLevel(10000);
                animationDrawable2.addFrame(m7271d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m7272b() {
        return this.f2177b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7261c(AttributeSet attributeSet, int i) {
        C0665w0 m7213u = C0665w0.m7213u(this.f2176a.getContext(), attributeSet, f2175c, i, 0);
        Drawable m7226h = m7213u.m7226h(0);
        if (m7226h != null) {
            this.f2176a.setIndeterminateDrawable(m7270e(m7226h));
        }
        Drawable m7226h2 = m7213u.m7226h(1);
        if (m7226h2 != null) {
            this.f2176a.setProgressDrawable(m7271d(m7226h2, false));
        }
        m7213u.m7212v();
    }
}
