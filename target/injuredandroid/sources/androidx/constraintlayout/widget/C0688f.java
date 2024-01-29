package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: androidx.constraintlayout.widget.f */
/* loaded from: classes.dex */
public class C0688f extends View {

    /* renamed from: f */
    private int f2476f;

    /* renamed from: g */
    private View f2477g;

    /* renamed from: h */
    private int f2478h;

    /* renamed from: a */
    public void m7092a(ConstraintLayout constraintLayout) {
        if (this.f2477g == null) {
            return;
        }
        ConstraintLayout.C0678a c0678a = (ConstraintLayout.C0678a) getLayoutParams();
        ConstraintLayout.C0678a c0678a2 = (ConstraintLayout.C0678a) this.f2477g.getLayoutParams();
        c0678a2.f2358k0.m9132x0(0);
        c0678a.f2358k0.m9130y0(c0678a2.f2358k0.m9197D());
        c0678a.f2358k0.m9171b0(c0678a2.f2358k0.m9145r());
        c0678a2.f2358k0.m9132x0(8);
    }

    /* renamed from: b */
    public void m7091b(ConstraintLayout constraintLayout) {
        if (this.f2476f == -1 && !isInEditMode()) {
            setVisibility(this.f2478h);
        }
        View findViewById = constraintLayout.findViewById(this.f2476f);
        this.f2477g = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0678a) findViewById.getLayoutParams()).f2336Z = true;
            this.f2477g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2477g;
    }

    public int getEmptyVisibility() {
        return this.f2478h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2476f == i) {
            return;
        }
        View view = this.f2477g;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0678a) this.f2477g.getLayoutParams()).f2336Z = false;
            this.f2477g = null;
        }
        this.f2476f = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f2478h = i;
    }
}
