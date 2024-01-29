package p054b.p059c.p060a.p075b.p081o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0598g;
import androidx.core.widget.C0773c;
import com.google.android.material.internal.C1851g;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p084q.C1377a;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* renamed from: b.c.a.b.o.a */
/* loaded from: classes.dex */
public class C1365a extends C0598g {

    /* renamed from: k */
    private static final int f4261k = C1348j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: l */
    private static final int[][] f4262l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f4263i;

    /* renamed from: j */
    private boolean f4264j;

    public C1365a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.checkboxStyle);
    }

    public C1365a(Context context, AttributeSet attributeSet, int i) {
        super(C1851g.m2719f(context, attributeSet, i, f4261k), attributeSet, i);
        Context context2 = getContext();
        TypedArray m2714k = C1851g.m2714k(context2, attributeSet, C1349k.MaterialCheckBox, i, f4261k, new int[0]);
        if (m2714k.hasValue(C1349k.MaterialCheckBox_buttonTint)) {
            C0773c.m6655c(this, C1388c.m4262a(context2, m2714k, C1349k.MaterialCheckBox_buttonTint));
        }
        this.f4264j = m2714k.getBoolean(C1349k.MaterialCheckBox_useMaterialThemeColors, false);
        m2714k.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4263i == null) {
            int[] iArr = new int[f4262l.length];
            int m4289c = C1377a.m4289c(this, C1338b.colorControlActivated);
            int m4289c2 = C1377a.m4289c(this, C1338b.colorSurface);
            int m4289c3 = C1377a.m4289c(this, C1338b.colorOnSurface);
            iArr[0] = C1377a.m4286f(m4289c2, m4289c, 1.0f);
            iArr[1] = C1377a.m4286f(m4289c2, m4289c3, 0.54f);
            iArr[2] = C1377a.m4286f(m4289c2, m4289c3, 0.38f);
            iArr[3] = C1377a.m4286f(m4289c2, m4289c3, 0.38f);
            this.f4263i = new ColorStateList(f4262l, iArr);
        }
        return this.f4263i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4264j && C0773c.m6656b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f4264j = z;
        C0773c.m6655c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
