package p054b.p059c.p060a.p075b.p092y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC0760b;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
/* renamed from: b.c.a.b.y.a */
/* loaded from: classes.dex */
public class C1394a extends Drawable implements InterfaceC1337n, InterfaceC0760b {

    /* renamed from: f */
    private C1396b f4312f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.y.a$b */
    /* loaded from: classes.dex */
    public static final class C1396b extends Drawable.ConstantState {

        /* renamed from: a */
        C1315g f4313a;

        /* renamed from: b */
        boolean f4314b;

        public C1396b(C1315g c1315g) {
            this.f4313a = c1315g;
            this.f4314b = false;
        }

        public C1396b(C1396b c1396b) {
            this.f4313a = (C1315g) c1396b.f4313a.getConstantState().newDrawable();
            this.f4314b = c1396b.f4314b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public C1394a newDrawable() {
            return new C1394a(new C1396b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public C1394a(C1322k c1322k) {
        this(new C1396b(new C1315g(c1322k)));
    }

    private C1394a(C1396b c1396b) {
        this.f4312f = c1396b;
    }

    /* renamed from: a */
    public C1394a m4242a() {
        this.f4312f = new C1396b(this.f4312f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C1396b c1396b = this.f4312f;
        if (c1396b.f4314b) {
            c1396b.f4313a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4312f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f4312f.f4313a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        m4242a();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4312f.f4313a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f4312f.f4313a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m4239b = C1397b.m4239b(iArr);
        C1396b c1396b = this.f4312f;
        if (c1396b.f4314b != m4239b) {
            c1396b.f4314b = m4239b;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4312f.f4313a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4312f.f4313a.setColorFilter(colorFilter);
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n
    public void setShapeAppearanceModel(C1322k c1322k) {
        this.f4312f.f4313a.setShapeAppearanceModel(c1322k);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTint(int i) {
        this.f4312f.f4313a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        this.f4312f.f4313a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4312f.f4313a.setTintMode(mode);
    }
}
