package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0687e extends View {
    public C0687e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0678a c0678a = (ConstraintLayout.C0678a) getLayoutParams();
        c0678a.f2337a = i;
        setLayoutParams(c0678a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0678a c0678a = (ConstraintLayout.C0678a) getLayoutParams();
        c0678a.f2339b = i;
        setLayoutParams(c0678a);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0678a c0678a = (ConstraintLayout.C0678a) getLayoutParams();
        c0678a.f2341c = f;
        setLayoutParams(c0678a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
