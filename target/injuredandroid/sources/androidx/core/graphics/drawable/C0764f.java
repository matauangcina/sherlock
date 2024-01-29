package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes.dex */
public final class C0764f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2700a;

    /* renamed from: b */
    Drawable.ConstantState f2701b;

    /* renamed from: c */
    ColorStateList f2702c;

    /* renamed from: d */
    PorterDuff.Mode f2703d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0764f(C0764f c0764f) {
        this.f2702c = null;
        this.f2703d = C0762d.f2692l;
        if (c0764f != null) {
            this.f2700a = c0764f.f2700a;
            this.f2701b = c0764f.f2701b;
            this.f2702c = c0764f.f2702c;
            this.f2703d = c0764f.f2703d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m6736a() {
        return this.f2701b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f2700a;
        Drawable.ConstantState constantState = this.f2701b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0763e(this, resources) : new C0762d(this, resources);
    }
}
