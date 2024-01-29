package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.AbstractC0814m;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0793c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import androidx.navigation.AbstractC0952r;
import androidx.navigation.C0925j;
import androidx.navigation.C0932o;
import androidx.navigation.InterfaceC0902b;
import java.util.HashSet;
@AbstractC0952r.InterfaceC0954b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends AbstractC0952r<C0911a> {

    /* renamed from: a */
    private final Context f3198a;

    /* renamed from: b */
    private final AbstractC0814m f3199b;

    /* renamed from: c */
    private int f3200c = 0;

    /* renamed from: d */
    private final HashSet<String> f3201d = new HashSet<>();

    /* renamed from: e */
    private InterfaceC0873h f3202e = new InterfaceC0873h(this) { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.InterfaceC0873h
        /* renamed from: d */
        public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
            if (enumC0869a == AbstractC0868e.EnumC0869a.ON_STOP) {
                DialogInterface$OnCancelListenerC0793c dialogInterface$OnCancelListenerC0793c = (DialogInterface$OnCancelListenerC0793c) interfaceC0875j;
                if (dialogInterface$OnCancelListenerC0793c.m6496x1().isShowing()) {
                    return;
                }
                C0915b.m5995r1(dialogInterface$OnCancelListenerC0793c).m6064m();
            }
        }
    };

    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    /* loaded from: classes.dex */
    public static class C0911a extends C0925j implements InterfaceC0902b {

        /* renamed from: n */
        private String f3203n;

        public C0911a(AbstractC0952r<? extends C0911a> abstractC0952r) {
            super(abstractC0952r);
        }

        /* renamed from: E */
        public final String m6010E() {
            String str = this.f3203n;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        /* renamed from: F */
        public final C0911a m6009F(String str) {
            this.f3203n = str;
            return this;
        }

        @Override // androidx.navigation.C0925j
        /* renamed from: y */
        public void mo5941y(Context context, AttributeSet attributeSet) {
            super.mo5941y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0917d.DialogFragmentNavigator);
            String string = obtainAttributes.getString(C0917d.DialogFragmentNavigator_android_name);
            if (string != null) {
                m6009F(string);
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, AbstractC0814m abstractC0814m) {
        this.f3198a = context;
        this.f3199b = abstractC0814m;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: c */
    public void mo5853c(Bundle bundle) {
        if (bundle != null) {
            this.f3200c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i = 0; i < this.f3200c; i++) {
                AbstractC0814m abstractC0814m = this.f3199b;
                DialogInterface$OnCancelListenerC0793c dialogInterface$OnCancelListenerC0793c = (DialogInterface$OnCancelListenerC0793c) abstractC0814m.m6378X("androidx-nav-fragment:navigator:dialog:" + i);
                if (dialogInterface$OnCancelListenerC0793c != null) {
                    dialogInterface$OnCancelListenerC0793c.mo698a().mo6124a(this.f3202e);
                } else {
                    HashSet<String> hashSet = this.f3201d;
                    hashSet.add("androidx-nav-fragment:navigator:dialog:" + i);
                }
            }
        }
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: d */
    public Bundle mo5852d() {
        if (this.f3200c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f3200c);
        return bundle;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: e */
    public boolean mo5851e() {
        if (this.f3200c == 0) {
            return false;
        }
        if (this.f3199b.m6334t0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        AbstractC0814m abstractC0814m = this.f3199b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f3200c - 1;
        this.f3200c = i;
        sb.append(i);
        Fragment m6378X = abstractC0814m.m6378X(sb.toString());
        if (m6378X != null) {
            m6378X.mo698a().mo6122c(this.f3202e);
            ((DialogInterface$OnCancelListenerC0793c) m6378X).m6500s1();
        }
        return true;
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: f */
    public C0911a mo5855a() {
        return new C0911a(this);
    }

    @Override // androidx.navigation.AbstractC0952r
    /* renamed from: g */
    public C0925j mo5854b(C0911a c0911a, Bundle bundle, C0932o c0932o, AbstractC0952r.InterfaceC0953a interfaceC0953a) {
        if (this.f3199b.m6334t0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String m6010E = c0911a.m6010E();
        if (m6010E.charAt(0) == '.') {
            m6010E = this.f3198a.getPackageName() + m6010E;
        }
        Fragment mo6321a = this.f3199b.m6364e0().mo6321a(this.f3198a.getClassLoader(), m6010E);
        if (!DialogInterface$OnCancelListenerC0793c.class.isAssignableFrom(mo6321a.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + c0911a.m6010E() + " is not an instance of DialogFragment");
        }
        DialogInterface$OnCancelListenerC0793c dialogInterface$OnCancelListenerC0793c = (DialogInterface$OnCancelListenerC0793c) mo6321a;
        dialogInterface$OnCancelListenerC0793c.m6556j1(bundle);
        dialogInterface$OnCancelListenerC0793c.mo698a().mo6124a(this.f3202e);
        AbstractC0814m abstractC0814m = this.f3199b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f3200c;
        this.f3200c = i + 1;
        sb.append(i);
        dialogInterface$OnCancelListenerC0793c.mo4770A1(abstractC0814m, sb.toString());
        return c0911a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6011h(Fragment fragment) {
        if (this.f3201d.remove(fragment.m6601L())) {
            fragment.mo698a().mo6124a(this.f3202e);
        }
    }
}
