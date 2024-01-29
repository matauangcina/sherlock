package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.C1851g;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: U */
    private static final int f4910U = C1348j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C1851g.m2719f(context, attributeSet, i, f4910U), attributeSet, i);
        m3470P(getContext());
    }

    /* renamed from: P */
    private void m3470P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1315g c1315g = new C1315g();
            c1315g.m4544T(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c1315g.m4552L(context);
            c1315g.m4545S(C0252s.m8602r(this));
            C0252s.m8619i0(this, c1315g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1319h.m4502e(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1319h.m4503d(this, f);
    }
}
