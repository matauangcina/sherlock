package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1308a;
import p054b.p059c.p060a.p075b.p078l.C1357h;
import p054b.p059c.p060a.p075b.p078l.C1359j;
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f5748i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g0 */
    private void m2430g0(View view, boolean z) {
        int intValue;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f5748i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0696f) && (((CoordinatorLayout.C0696f) childAt.getLayoutParams()).m7030f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f5748i;
                        intValue = (map != null && map.containsKey(childAt)) ? this.f5748i.get(childAt).intValue() : 4;
                    } else if (Build.VERSION.SDK_INT >= 16) {
                        this.f5748i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    C0252s.m8605p0(childAt, intValue);
                }
            }
            if (z) {
                return;
            }
            this.f5748i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo2432H(View view, View view2, boolean z, boolean z2) {
        m2430g0(view2, z);
        return super.mo2432H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C1929e mo2431e0(Context context, boolean z) {
        int i = z ? C1308a.mtrl_fab_transformation_sheet_expand_spec : C1308a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C1929e c1929e = new FabTransformationBehavior.C1929e();
        c1929e.f5742a = C1357h.m4365c(context, i);
        c1929e.f5743b = new C1359j(17, 0.0f, 0.0f);
        return c1929e;
    }
}
