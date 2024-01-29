package p054b.p059c.p060a.p075b.p090w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0645s;
import androidx.core.widget.C0773c;
import com.google.android.material.internal.C1851g;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p084q.C1377a;
/* renamed from: b.c.a.b.w.a */
/* loaded from: classes.dex */
public class C1384a extends C0645s {

    /* renamed from: k */
    private static final int f4287k = C1348j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: l */
    private static final int[][] f4288l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f4289i;

    /* renamed from: j */
    private boolean f4290j;

    public C1384a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.radioButtonStyle);
    }

    public C1384a(Context context, AttributeSet attributeSet, int i) {
        super(C1851g.m2719f(context, attributeSet, i, f4287k), attributeSet, i);
        TypedArray m2714k = C1851g.m2714k(getContext(), attributeSet, C1349k.MaterialRadioButton, i, f4287k, new int[0]);
        this.f4290j = m2714k.getBoolean(C1349k.MaterialRadioButton_useMaterialThemeColors, false);
        m2714k.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4289i == null) {
            int m4289c = C1377a.m4289c(this, C1338b.colorControlActivated);
            int m4289c2 = C1377a.m4289c(this, C1338b.colorOnSurface);
            int m4289c3 = C1377a.m4289c(this, C1338b.colorSurface);
            int[] iArr = new int[f4288l.length];
            iArr[0] = C1377a.m4286f(m4289c3, m4289c, 1.0f);
            iArr[1] = C1377a.m4286f(m4289c3, m4289c2, 0.54f);
            iArr[2] = C1377a.m4286f(m4289c3, m4289c2, 0.38f);
            iArr[3] = C1377a.m4286f(m4289c3, m4289c2, 0.38f);
            this.f4289i = new ColorStateList(f4288l, iArr);
        }
        return this.f4289i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4290j && C0773c.m6656b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4290j = z;
        C0773c.m6655c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
