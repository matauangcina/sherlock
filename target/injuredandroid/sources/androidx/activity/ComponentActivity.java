package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.ActivityC0714e;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.FragmentC0885r;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import androidx.lifecycle.InterfaceC0895w;
import androidx.savedstate.C1068a;
import androidx.savedstate.InterfaceC1069b;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0714e implements InterfaceC0875j, InterfaceC0895w, InterfaceC1069b, InterfaceC0432c {

    /* renamed from: i */
    private C0894v f1149i;

    /* renamed from: k */
    private int f1151k;

    /* renamed from: g */
    private final C0876k f1147g = new C0876k(this);

    /* renamed from: h */
    private final C1068a f1148h = C1068a.m5054a(this);

    /* renamed from: j */
    private final OnBackPressedDispatcher f1150j = new OnBackPressedDispatcher(new RunnableC0427a());

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    class RunnableC0427a implements Runnable {
        RunnableC0427a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public static final class C0428b {

        /* renamed from: a */
        Object f1155a;

        /* renamed from: b */
        C0894v f1156b;

        C0428b() {
        }
    }

    public ComponentActivity() {
        if (mo698a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            mo698a().mo6124a(new InterfaceC0873h() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.InterfaceC0873h
                /* renamed from: d */
                public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
                    if (enumC0869a == AbstractC0868e.EnumC0869a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        mo698a().mo6124a(new InterfaceC0873h() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0873h
            /* renamed from: d */
            public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
                if (enumC0869a != AbstractC0868e.EnumC0869a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.mo6025f().m6079a();
            }
        });
        int i = Build.VERSION.SDK_INT;
        if (19 > i || i > 23) {
            return;
        }
        mo698a().mo6124a(new ImmLeaksCleaner(this));
    }

    @Override // androidx.lifecycle.InterfaceC0875j
    /* renamed from: a */
    public AbstractC0868e mo698a() {
        return this.f1147g;
    }

    @Override // androidx.lifecycle.InterfaceC0895w
    /* renamed from: f */
    public C0894v mo6025f() {
        if (getApplication() != null) {
            if (this.f1149i == null) {
                C0428b c0428b = (C0428b) getLastNonConfigurationInstance();
                if (c0428b != null) {
                    this.f1149i = c0428b.f1156b;
                }
                if (this.f1149i == null) {
                    this.f1149i = new C0894v();
                }
            }
            return this.f1149i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.activity.InterfaceC0432c
    /* renamed from: i */
    public final OnBackPressedDispatcher mo6484i() {
        return this.f1150j;
    }

    @Override // androidx.savedstate.InterfaceC1069b
    /* renamed from: j */
    public final SavedStateRegistry mo5050j() {
        return this.f1148h.m5053b();
    }

    @Deprecated
    /* renamed from: k */
    public Object m8137k() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f1150j.m8133c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1148h.m5052c(bundle);
        FragmentC0885r.m6091f(this);
        int i = this.f1151k;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0428b c0428b;
        Object m8137k = m8137k();
        C0894v c0894v = this.f1149i;
        if (c0894v == null && (c0428b = (C0428b) getLastNonConfigurationInstance()) != null) {
            c0894v = c0428b.f1156b;
        }
        if (c0894v == null && m8137k == null) {
            return null;
        }
        C0428b c0428b2 = new C0428b();
        c0428b2.f1155a = m8137k;
        c0428b2.f1156b = c0894v;
        return c0428b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0714e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0868e mo698a = mo698a();
        if (mo698a instanceof C0876k) {
            ((C0876k) mo698a).m6109p(AbstractC0868e.EnumC0870b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f1148h.m5051d(bundle);
    }
}
