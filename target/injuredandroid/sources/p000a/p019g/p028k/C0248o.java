package p000a.p019g.p028k;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: a.g.k.o */
/* loaded from: classes.dex */
public class C0248o {

    /* renamed from: a */
    private int f720a;

    /* renamed from: b */
    private int f721b;

    public C0248o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m8668a() {
        return this.f720a | this.f721b;
    }

    /* renamed from: b */
    public void m8667b(View view, View view2, int i) {
        m8666c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m8666c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f721b = i;
        } else {
            this.f720a = i;
        }
    }

    /* renamed from: d */
    public void m8665d(View view, int i) {
        if (i == 1) {
            this.f721b = 0;
        } else {
            this.f720a = 0;
        }
    }
}
