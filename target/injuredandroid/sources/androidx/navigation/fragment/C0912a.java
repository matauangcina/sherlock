package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractC0814m;
import androidx.fragment.app.Fragment;
import androidx.navigation.AbstractC0952r;
import androidx.navigation.C0925j;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
@AbstractC0952r.InterfaceC0954b("fragment")
/* renamed from: androidx.navigation.fragment.a */
/* loaded from: classes.dex */
public class C0912a extends AbstractC0952r<C0913a> {

    /* renamed from: a */
    private final Context f3204a;

    /* renamed from: b */
    private final AbstractC0814m f3205b;

    /* renamed from: c */
    private final int f3206c;

    /* renamed from: d */
    private ArrayDeque<Integer> f3207d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a */
    /* loaded from: classes.dex */
    public static class C0913a extends C0925j {

        /* renamed from: n */
        private String f3208n;

        public C0913a(AbstractC0952r<? extends C0913a> abstractC0952r) {
            super(abstractC0952r);
        }

        /* renamed from: E */
        public final String m6004E() {
            String str = this.f3208n;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        /* renamed from: F */
        public final C0913a m6003F(String str) {
            this.f3208n = str;
            return this;
        }

        @Override // androidx.navigation.C0925j
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f3208n;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            return sb.toString();
        }

        @Override // androidx.navigation.C0925j
        /* renamed from: y */
        public void mo5941y(Context context, AttributeSet attributeSet) {
            super.mo5941y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0917d.FragmentNavigator);
            String string = obtainAttributes.getString(C0917d.FragmentNavigator_android_name);
            if (string != null) {
                m6003F(string);
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: androidx.navigation.fragment.a$b */
    /* loaded from: classes.dex */
    public static final class C0914b implements AbstractC0952r.InterfaceC0953a {

        /* renamed from: a */
        private final LinkedHashMap<View, String> f3209a;

        /* renamed from: a */
        public Map<View, String> m6002a() {
            return Collections.unmodifiableMap(this.f3209a);
        }
    }

    public C0912a(Context context, AbstractC0814m abstractC0814m, int i) {
        this.f3204a = context;
        this.f3205b = abstractC0814m;
        this.f3206c = i;
    }

    /* renamed from: g */
    private String m6007g(int i, int i2) {
        return i + "-" + i2;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: c */
    public void mo5853c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f3207d.clear();
        for (int i : intArray) {
            this.f3207d.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: d */
    public Bundle mo5852d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f3207d.size()];
        Iterator<Integer> it = this.f3207d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: e */
    public boolean mo5851e() {
        if (this.f3207d.isEmpty()) {
            return false;
        }
        if (this.f3205b.m6334t0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f3205b.m6415E0(m6007g(this.f3207d.size(), this.f3207d.peekLast().intValue()), 1);
        this.f3207d.removeLast();
        return true;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: f */
    public C0913a mo5855a() {
        return new C0913a(this);
    }

    @Deprecated
    /* renamed from: h */
    public Fragment m6006h(Context context, AbstractC0814m abstractC0814m, String str, Bundle bundle) {
        return abstractC0814m.m6364e0().mo6321a(context.getClassLoader(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[RETURN] */
    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.navigation.C0925j mo5854b(androidx.navigation.fragment.C0912a.C0913a r9, android.os.Bundle r10, androidx.navigation.C0932o r11, androidx.navigation.AbstractC0952r.InterfaceC0953a r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C0912a.mo5854b(androidx.navigation.fragment.a$a, android.os.Bundle, androidx.navigation.o, androidx.navigation.r$a):androidx.navigation.j");
    }
}
