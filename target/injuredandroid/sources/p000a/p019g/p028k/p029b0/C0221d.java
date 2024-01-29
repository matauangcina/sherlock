package p000a.p019g.p028k.p029b0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* renamed from: a.g.k.b0.d */
/* loaded from: classes.dex */
public class C0221d {

    /* renamed from: a */
    private final Object f706a;

    /* renamed from: a.g.k.b0.d$a */
    /* loaded from: classes.dex */
    static class C0222a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0221d f707a;

        C0222a(C0221d c0221d) {
            this.f707a = c0221d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0217c mo8486b = this.f707a.mo8486b(i);
            if (mo8486b == null) {
                return null;
            }
            return mo8486b.m8732u0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0217c> m8718c = this.f707a.m8718c(str, i);
            if (m8718c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m8718c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m8718c.get(i2).m8732u0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f707a.mo8484f(i, i2, bundle);
        }
    }

    /* renamed from: a.g.k.b0.d$b */
    /* loaded from: classes.dex */
    static class C0223b extends C0222a {
        C0223b(C0221d c0221d) {
            super(c0221d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C0217c mo8485d = this.f707a.mo8485d(i);
            if (mo8485d == null) {
                return null;
            }
            return mo8485d.m8732u0();
        }
    }

    /* renamed from: a.g.k.b0.d$c */
    /* loaded from: classes.dex */
    static class C0224c extends C0223b {
        C0224c(C0221d c0221d) {
            super(c0221d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f707a.m8719a(i, C0217c.m8730v0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C0221d() {
        int i = Build.VERSION.SDK_INT;
        this.f706a = i >= 26 ? new C0224c(this) : i >= 19 ? new C0223b(this) : i >= 16 ? new C0222a(this) : null;
    }

    public C0221d(Object obj) {
        this.f706a = obj;
    }

    /* renamed from: a */
    public void m8719a(int i, C0217c c0217c, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C0217c mo8486b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C0217c> m8718c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C0217c mo8485d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m8717e() {
        return this.f706a;
    }

    /* renamed from: f */
    public boolean mo8484f(int i, int i2, Bundle bundle) {
        return false;
    }
}
