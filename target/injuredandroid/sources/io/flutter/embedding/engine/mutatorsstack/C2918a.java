package io.flutter.embedding.engine.mutatorsstack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.android.C2788b;
/* renamed from: io.flutter.embedding.engine.mutatorsstack.a */
/* loaded from: classes.dex */
public class C2918a extends FrameLayout {

    /* renamed from: f */
    private FlutterMutatorsStack f7257f;

    /* renamed from: g */
    private float f7258g;

    /* renamed from: h */
    private int f7259h;

    /* renamed from: i */
    private int f7260i;

    /* renamed from: j */
    private int f7261j;

    /* renamed from: k */
    private int f7262k;

    /* renamed from: l */
    private final C2788b f7263l;

    public C2918a(Context context, float f, C2788b c2788b) {
        super(context, null);
        this.f7258g = f;
        this.f7263l = c2788b;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f7257f.getFinalMatrix());
        float f = this.f7258g;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.f7259h, -this.f7260i);
        return matrix;
    }

    /* renamed from: a */
    public void m388a(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f7257f = flutterMutatorsStack;
        this.f7259h = i;
        this.f7260i = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f7257f.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f7259h, -this.f7260i);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (this.f7263l == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f7259h;
            this.f7261j = i2;
            i = this.f7260i;
            this.f7262k = i;
            f = i2;
        } else if (action == 2) {
            matrix.postTranslate(this.f7261j, this.f7262k);
            this.f7261j = this.f7259h;
            this.f7262k = this.f7260i;
            return this.f7263l.m729f(motionEvent, matrix);
        } else {
            f = this.f7259h;
            i = this.f7260i;
        }
        matrix.postTranslate(f, i);
        return this.f7263l.m729f(motionEvent, matrix);
    }
}
