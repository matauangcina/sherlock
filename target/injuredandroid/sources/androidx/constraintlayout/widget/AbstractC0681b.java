package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import p000a.p015e.p016a.p017j.C0108j;
/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0681b extends View {

    /* renamed from: f */
    protected int[] f2379f;

    /* renamed from: g */
    protected int f2380g;

    /* renamed from: h */
    protected Context f2381h;

    /* renamed from: i */
    protected C0108j f2382i;

    /* renamed from: j */
    protected boolean f2383j;

    /* renamed from: k */
    private String f2384k;

    public AbstractC0681b(Context context) {
        super(context);
        this.f2379f = new int[32];
        this.f2383j = false;
        this.f2381h = context;
        mo7113b(null);
    }

    /* renamed from: a */
    private void m7114a(String str) {
        int i;
        Object m7128c;
        if (str == null || this.f2381h == null) {
            return;
        }
        String trim = str.trim();
        try {
            i = C0689g.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            i = this.f2381h.getResources().getIdentifier(trim, "id", this.f2381h.getPackageName());
        }
        if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (m7128c = ((ConstraintLayout) getParent()).m7128c(0, trim)) != null && (m7128c instanceof Integer)) {
            i = ((Integer) m7128c).intValue();
        }
        if (i != 0) {
            setTag(i, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m7114a(str.substring(i));
                return;
            } else {
                m7114a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7113b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0690h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0690h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2384k = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: c */
    public void m7112c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void m7111d(ConstraintLayout constraintLayout) {
    }

    /* renamed from: e */
    public void m7110e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2384k);
        }
        C0108j c0108j = this.f2382i;
        if (c0108j == null) {
            return;
        }
        c0108j.m9089J0();
        for (int i = 0; i < this.f2380g; i++) {
            View m7126e = constraintLayout.m7126e(this.f2379f[i]);
            if (m7126e != null) {
                this.f2382i.m9090I0(constraintLayout.m7125f(m7126e));
            }
        }
    }

    /* renamed from: f */
    public void m7109f() {
        if (this.f2382i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0678a) {
            ((ConstraintLayout.C0678a) layoutParams).f2358k0 = this.f2382i;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2379f, this.f2380g);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2383j) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2380g = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f2380g + 1;
        int[] iArr = this.f2379f;
        if (i2 > iArr.length) {
            this.f2379f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2379f;
        int i3 = this.f2380g;
        iArr2[i3] = i;
        this.f2380g = i3 + 1;
    }
}
