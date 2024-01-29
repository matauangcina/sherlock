package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p084q.C1377a;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC1879a {

    /* renamed from: f */
    private TextView f5562f;

    /* renamed from: g */
    private Button f5563g;

    /* renamed from: h */
    private int f5564h;

    /* renamed from: i */
    private int f5565i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.SnackbarLayout);
        this.f5564h = obtainStyledAttributes.getDimensionPixelSize(C1349k.SnackbarLayout_android_maxWidth, -1);
        this.f5565i = obtainStyledAttributes.getDimensionPixelSize(C1349k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private static void m2641d(View view, int i, int i2) {
        if (C0252s.m8648O(view)) {
            C0252s.m8599s0(view, C0252s.m8661B(view), i, C0252s.m8662A(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m2640e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f5562f.getPaddingTop() == i2 && this.f5562f.getPaddingBottom() == i3) {
            return z;
        }
        m2641d(this.f5562f, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.InterfaceC1879a
    /* renamed from: a */
    public void mo2639a(int i, int i2) {
        this.f5562f.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f5562f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f5563g.getVisibility() == 0) {
            this.f5563g.setAlpha(0.0f);
            this.f5563g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC1879a
    /* renamed from: b */
    public void mo2638b(int i, int i2) {
        this.f5562f.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f5562f.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f5563g.getVisibility() == 0) {
            this.f5563g.setAlpha(1.0f);
            this.f5563g.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2642c(float f) {
        if (f != 1.0f) {
            this.f5563g.setTextColor(C1377a.m4286f(C1377a.m4289c(this, C1338b.colorSurface), this.f5563g.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f5563g;
    }

    public TextView getMessageView() {
        return this.f5562f;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f5562f = (TextView) findViewById(C1344f.snackbar_text);
        this.f5563g = (Button) findViewById(C1344f.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (m2640e(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (m2640e(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f5564h
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f5564h
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p054b.p059c.p060a.p075b.C1342d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p054b.p059c.p060a.p075b.C1342d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f5562f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f5565i
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f5563g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f5565i
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.m2640e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.m2640e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
