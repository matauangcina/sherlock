package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
class C0652v0 extends C0631n0 {

    /* renamed from: b */
    private final WeakReference<Context> f2204b;

    public C0652v0(Context context, Resources resources) {
        super(resources);
        this.f2204b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0631n0, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f2204b.get();
        if (drawable != null && context != null) {
            C0623m0.m7350h().m7334x(context, i, drawable);
        }
        return drawable;
    }
}
