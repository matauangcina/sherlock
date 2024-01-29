package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p000a.p001a.C0000a;
/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0647t extends RatingBar {

    /* renamed from: f */
    private final C0643r f2188f;

    public C0647t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.ratingBarStyle);
    }

    public C0647t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0643r c0643r = new C0643r(this);
        this.f2188f = c0643r;
        c0643r.mo7261c(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m7272b = this.f2188f.m7272b();
        if (m7272b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m7272b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
