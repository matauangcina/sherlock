package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.p015e.p016a.p017j.C0093b;
/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0680a extends AbstractC0681b {

    /* renamed from: l */
    private int f2376l;

    /* renamed from: m */
    private int f2377m;

    /* renamed from: n */
    private C0093b f2378n;

    public C0680a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0681b
    /* renamed from: b */
    public void mo7113b(AttributeSet attributeSet) {
        super.mo7113b(attributeSet);
        this.f2378n = new C0093b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0690h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0690h.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0690h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2378n.m9224K0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f2382i = this.f2378n;
        m7109f();
    }

    public int getType() {
        return this.f2376l;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2378n.m9224K0(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r7 == 6) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r7 == 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r7 == 6) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.f2376l = r7
            r6.f2377m = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L18
            if (r7 != r2) goto L13
        L10:
            r6.f2377m = r3
            goto L3b
        L13:
            if (r7 != r1) goto L3b
        L15:
            r6.f2377m = r4
            goto L3b
        L18:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L28
            r7 = 1
            goto L29
        L28:
            r7 = 0
        L29:
            if (r7 == 0) goto L33
            int r7 = r6.f2376l
            if (r7 != r2) goto L30
            goto L15
        L30:
            if (r7 != r1) goto L3b
            goto L10
        L33:
            int r7 = r6.f2376l
            if (r7 != r2) goto L38
            goto L10
        L38:
            if (r7 != r1) goto L3b
            goto L15
        L3b:
            a.e.a.j.b r7 = r6.f2378n
            int r0 = r6.f2377m
            r7.m9223L0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0680a.setType(int):void");
    }
}
