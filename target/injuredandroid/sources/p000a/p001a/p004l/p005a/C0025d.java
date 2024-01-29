package p000a.p001a.p004l.p005a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p000a.p001a.p004l.p005a.C0020b;
/* renamed from: a.a.l.a.d */
/* loaded from: classes.dex */
class C0025d extends C0020b {

    /* renamed from: r */
    private C0026a f71r;

    /* renamed from: s */
    private boolean f72s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.d$a */
    /* loaded from: classes.dex */
    public static class C0026a extends C0020b.AbstractC0023c {

        /* renamed from: J */
        int[][] f73J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0026a(C0026a c0026a, C0025d c0025d, Resources resources) {
            super(c0026a, c0025d, resources);
            if (c0026a != null) {
                this.f73J = c0026a.f73J;
            } else {
                this.f73J = new int[m9536f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m9512A(int[] iArr) {
            int[][] iArr2 = this.f73J;
            int m9534h = m9534h();
            for (int i = 0; i < m9534h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0025d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0025d(this, resources);
        }

        @Override // p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: o */
        public void mo9511o(int i, int i2) {
            super.mo9511o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f73J, 0, iArr, 0, i);
            this.f73J = iArr;
        }

        @Override // p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: r */
        void mo9510r() {
            int[][] iArr = this.f73J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f73J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f73J = iArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m9509z(int[] iArr, Drawable drawable) {
            int m9541a = m9541a(drawable);
            this.f73J[m9541a] = iArr;
            return m9541a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0025d(C0026a c0026a) {
        if (c0026a != null) {
            mo9515h(c0026a);
        }
    }

    C0025d(C0026a c0026a, Resources resources) {
        mo9515h(new C0026a(c0026a, this, resources));
        onStateChange(getState());
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: h */
    public void mo9515h(C0020b.AbstractC0023c abstractC0023c) {
        super.mo9515h(abstractC0023c);
        if (abstractC0023c instanceof C0026a) {
            this.f71r = (C0026a) abstractC0023c;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: j */
    public C0026a mo9516b() {
        return new C0026a(this.f71r, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m9513k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f72s) {
            super.mutate();
            if (this == this) {
                this.f71r.mo9510r();
                this.f72s = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m9512A = this.f71r.m9512A(iArr);
        if (m9512A < 0) {
            m9512A = this.f71r.m9512A(StateSet.WILD_CARD);
        }
        return m9545g(m9512A) || onStateChange;
    }
}
