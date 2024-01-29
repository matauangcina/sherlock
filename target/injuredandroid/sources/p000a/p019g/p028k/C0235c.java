package p000a.p019g.p028k;

import android.os.Build;
import android.view.DisplayCutout;
import p000a.p019g.p027j.C0189d;
/* renamed from: a.g.k.c */
/* loaded from: classes.dex */
public final class C0235c {

    /* renamed from: a */
    private final Object f708a;

    private C0235c(Object obj) {
        this.f708a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0235c m8708e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0235c(obj);
    }

    /* renamed from: a */
    public int m8712a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f708a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int m8711b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f708a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m8710c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f708a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m8709d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f708a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0235c.class != obj.getClass()) {
            return false;
        }
        return C0189d.m8873a(this.f708a, ((C0235c) obj).f708a);
    }

    public int hashCode() {
        Object obj = this.f708a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f708a + "}";
    }
}
