package p054b.p059c.p060a.p075b.p076a0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C1852h;
/* renamed from: b.c.a.b.a0.h */
/* loaded from: classes.dex */
public class C1319h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1312d m4506a(int i) {
        return i != 0 ? i != 1 ? m4505b() : new C1313e() : new C1321j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1312d m4505b() {
        return new C1321j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1314f m4504c() {
        return new C1314f();
    }

    /* renamed from: d */
    public static void m4503d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1315g) {
            ((C1315g) background).m4545S(f);
        }
    }

    /* renamed from: e */
    public static void m4502e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C1315g) {
            m4501f(view, (C1315g) background);
        }
    }

    /* renamed from: f */
    public static void m4501f(View view, C1315g c1315g) {
        if (c1315g.m4550N()) {
            c1315g.m4541W(C1852h.m2711b(view));
        }
    }
}
