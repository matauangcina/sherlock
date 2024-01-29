package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0685d extends ViewGroup {

    /* renamed from: f */
    C0682c f2462f;

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class C0686a extends ConstraintLayout.C0678a {

        /* renamed from: m0 */
        public float f2463m0;

        /* renamed from: n0 */
        public boolean f2464n0;

        /* renamed from: o0 */
        public float f2465o0;

        /* renamed from: p0 */
        public float f2466p0;

        /* renamed from: q0 */
        public float f2467q0;

        /* renamed from: r0 */
        public float f2468r0;

        /* renamed from: s0 */
        public float f2469s0;

        /* renamed from: t0 */
        public float f2470t0;

        /* renamed from: u0 */
        public float f2471u0;

        /* renamed from: v0 */
        public float f2472v0;

        /* renamed from: w0 */
        public float f2473w0;

        /* renamed from: x0 */
        public float f2474x0;

        /* renamed from: y0 */
        public float f2475y0;

        public C0686a(int i, int i2) {
            super(i, i2);
            this.f2463m0 = 1.0f;
            this.f2464n0 = false;
            this.f2465o0 = 0.0f;
            this.f2466p0 = 0.0f;
            this.f2467q0 = 0.0f;
            this.f2468r0 = 0.0f;
            this.f2469s0 = 1.0f;
            this.f2470t0 = 1.0f;
            this.f2471u0 = 0.0f;
            this.f2472v0 = 0.0f;
            this.f2473w0 = 0.0f;
            this.f2474x0 = 0.0f;
            this.f2475y0 = 0.0f;
        }

        public C0686a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.f2463m0 = 1.0f;
            this.f2464n0 = false;
            this.f2465o0 = 0.0f;
            this.f2466p0 = 0.0f;
            this.f2467q0 = 0.0f;
            this.f2468r0 = 0.0f;
            this.f2469s0 = 1.0f;
            this.f2470t0 = 1.0f;
            this.f2471u0 = 0.0f;
            this.f2472v0 = 0.0f;
            this.f2473w0 = 0.0f;
            this.f2474x0 = 0.0f;
            this.f2475y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0690h.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0690h.ConstraintSet_android_alpha) {
                    this.f2463m0 = obtainStyledAttributes.getFloat(index, this.f2463m0);
                } else if (index == C0690h.ConstraintSet_android_elevation) {
                    this.f2465o0 = obtainStyledAttributes.getFloat(index, this.f2465o0);
                    this.f2464n0 = true;
                } else if (index == C0690h.ConstraintSet_android_rotationX) {
                    this.f2467q0 = obtainStyledAttributes.getFloat(index, this.f2467q0);
                } else if (index == C0690h.ConstraintSet_android_rotationY) {
                    this.f2468r0 = obtainStyledAttributes.getFloat(index, this.f2468r0);
                } else if (index == C0690h.ConstraintSet_android_rotation) {
                    this.f2466p0 = obtainStyledAttributes.getFloat(index, this.f2466p0);
                } else if (index == C0690h.ConstraintSet_android_scaleX) {
                    this.f2469s0 = obtainStyledAttributes.getFloat(index, this.f2469s0);
                } else if (index == C0690h.ConstraintSet_android_scaleY) {
                    this.f2470t0 = obtainStyledAttributes.getFloat(index, this.f2470t0);
                } else if (index == C0690h.ConstraintSet_android_transformPivotX) {
                    this.f2471u0 = obtainStyledAttributes.getFloat(index, this.f2471u0);
                } else if (index == C0690h.ConstraintSet_android_transformPivotY) {
                    this.f2472v0 = obtainStyledAttributes.getFloat(index, this.f2472v0);
                } else {
                    if (index == C0690h.ConstraintSet_android_translationX) {
                        f = this.f2473w0;
                    } else if (index == C0690h.ConstraintSet_android_translationY) {
                        this.f2474x0 = obtainStyledAttributes.getFloat(index, this.f2474x0);
                    } else if (index == C0690h.ConstraintSet_android_translationZ) {
                        f = this.f2475y0;
                    }
                    this.f2473w0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0686a generateDefaultLayoutParams() {
        return new C0686a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0686a generateLayoutParams(AttributeSet attributeSet) {
        return new C0686a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0678a(layoutParams);
    }

    public C0682c getConstraintSet() {
        if (this.f2462f == null) {
            this.f2462f = new C0682c();
        }
        this.f2462f.m7107b(this);
        return this.f2462f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
