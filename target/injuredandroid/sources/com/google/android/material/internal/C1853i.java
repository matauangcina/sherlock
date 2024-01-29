package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes.dex */
public class C1853i extends ImageButton {

    /* renamed from: f */
    private int f5504f;

    public C1853i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1853i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5504f = getVisibility();
    }

    /* renamed from: b */
    public final void m2709b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f5504f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f5504f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m2709b(i, true);
    }
}
