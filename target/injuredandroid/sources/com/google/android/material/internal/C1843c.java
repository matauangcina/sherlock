package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p000a.p019g.p028k.C0240g;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1349k;
/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes.dex */
public class C1843c extends ViewGroup {

    /* renamed from: f */
    private int f5477f;

    /* renamed from: g */
    private int f5478g;

    /* renamed from: h */
    private boolean f5479h;

    public C1843c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1843c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5479h = false;
        m2743c(context, attributeSet);
    }

    /* renamed from: a */
    private static int m2745a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: c */
    private void m2743c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1349k.FlowLayout, 0, 0);
        this.f5477f = obtainStyledAttributes.getDimensionPixelSize(C1349k.FlowLayout_lineSpacing, 0);
        this.f5478g = obtainStyledAttributes.getDimensionPixelSize(C1349k.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public boolean mo2744b() {
        return this.f5479h;
    }

    protected int getItemSpacing() {
        return this.f5478g;
    }

    protected int getLineSpacing() {
        return this.f5477f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            return;
        }
        boolean z2 = C0252s.m8592w(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = C0240g.m8696b(marginLayoutParams);
                    i5 = C0240g.m8697a(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.f5479h && measuredWidth > i7) {
                    i9 = this.f5477f + paddingTop;
                    i8 = paddingRight;
                }
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i6;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.f5478g;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Reader.READ_DONE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i3 + childAt.getMeasuredWidth() <= paddingRight || mo2744b()) {
                    i5 = i10;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f5477f + paddingTop;
                }
                int measuredWidth = i5 + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i3 + i4 + childAt.getMeasuredWidth() + this.f5478g;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m2745a(size, mode, i8 + getPaddingRight()), m2745a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f5478g = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f5477f = i;
    }

    public void setSingleLine(boolean z) {
        this.f5479h = z;
    }
}
