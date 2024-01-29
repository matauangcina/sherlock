package p054b.p059c.p060a.p075b.p088u;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: b.c.a.b.u.b */
/* loaded from: classes.dex */
public final class C1382b {

    /* renamed from: a */
    private final View f4284a;

    /* renamed from: b */
    private boolean f4285b = false;

    /* renamed from: c */
    private int f4286c = 0;

    public C1382b(InterfaceC1381a interfaceC1381a) {
        this.f4284a = (View) interfaceC1381a;
    }

    /* renamed from: a */
    private void m4278a() {
        ViewParent parent = this.f4284a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m7061g(this.f4284a);
        }
    }

    /* renamed from: b */
    public int m4277b() {
        return this.f4286c;
    }

    /* renamed from: c */
    public boolean m4276c() {
        return this.f4285b;
    }

    /* renamed from: d */
    public void m4275d(Bundle bundle) {
        this.f4285b = bundle.getBoolean("expanded", false);
        this.f4286c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f4285b) {
            m4278a();
        }
    }

    /* renamed from: e */
    public Bundle m4274e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f4285b);
        bundle.putInt("expandedComponentIdHint", this.f4286c);
        return bundle;
    }

    /* renamed from: f */
    public void m4273f(int i) {
        this.f4286c = i;
    }
}
