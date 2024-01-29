package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f */
    private boolean f1771f;

    /* renamed from: g */
    private int f1772g;

    /* renamed from: h */
    private int f1773h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1772g = -1;
        this.f1773h = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ButtonBarLayout);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0009j.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f1771f = obtainStyledAttributes.getBoolean(C0009j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m7681a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m7680b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0005f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f1773h, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1771f) {
            if (size > this.f1772g && m7680b()) {
                setStacked(false);
            }
            this.f1772g = size;
        }
        if (m7680b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1771f && !m7680b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m7681a = m7681a(0);
        if (m7681a >= 0) {
            View childAt = getChildAt(m7681a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m7680b()) {
                int m7681a2 = m7681a(m7681a + 1);
                if (m7681a2 >= 0) {
                    paddingTop += getChildAt(m7681a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0252s.m8590x(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1771f != z) {
            this.f1771f = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
