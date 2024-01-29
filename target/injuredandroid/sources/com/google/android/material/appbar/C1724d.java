package com.google.android.material.appbar;

import android.view.View;
import p000a.p019g.p028k.C0252s;
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
class C1724d {

    /* renamed from: a */
    private final View f4928a;

    /* renamed from: b */
    private int f4929b;

    /* renamed from: c */
    private int f4930c;

    /* renamed from: d */
    private int f4931d;

    /* renamed from: e */
    private int f4932e;

    /* renamed from: f */
    private boolean f4933f = true;

    /* renamed from: g */
    private boolean f4934g = true;

    public C1724d(View view) {
        this.f4928a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3446a() {
        View view = this.f4928a;
        C0252s.m8644S(view, this.f4931d - (view.getTop() - this.f4929b));
        View view2 = this.f4928a;
        C0252s.m8645R(view2, this.f4932e - (view2.getLeft() - this.f4930c));
    }

    /* renamed from: b */
    public int m3445b() {
        return this.f4931d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m3444c() {
        this.f4929b = this.f4928a.getTop();
        this.f4930c = this.f4928a.getLeft();
    }

    /* renamed from: d */
    public boolean m3443d(int i) {
        if (!this.f4934g || this.f4932e == i) {
            return false;
        }
        this.f4932e = i;
        m3446a();
        return true;
    }

    /* renamed from: e */
    public boolean m3442e(int i) {
        if (!this.f4933f || this.f4931d == i) {
            return false;
        }
        this.f4931d = i;
        m3446a();
        return true;
    }
}
