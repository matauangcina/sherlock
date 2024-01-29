package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
class C1043f {

    /* renamed from: b */
    int f3643b;

    /* renamed from: c */
    int f3644c;

    /* renamed from: d */
    int f3645d;

    /* renamed from: e */
    int f3646e;

    /* renamed from: h */
    boolean f3649h;

    /* renamed from: i */
    boolean f3650i;

    /* renamed from: a */
    boolean f3642a = true;

    /* renamed from: f */
    int f3647f = 0;

    /* renamed from: g */
    int f3648g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m5197a(RecyclerView.C0968a0 c0968a0) {
        int i = this.f3644c;
        return i >= 0 && i < c0968a0.m5745b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m5196b(RecyclerView.C1000v c1000v) {
        View m5505o = c1000v.m5505o(this.f3644c);
        this.f3644c += this.f3645d;
        return m5505o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3643b + ", mCurrentPosition=" + this.f3644c + ", mItemDirection=" + this.f3645d + ", mLayoutDirection=" + this.f3646e + ", mStartLine=" + this.f3647f + ", mEndLine=" + this.f3648g + '}';
    }
}
