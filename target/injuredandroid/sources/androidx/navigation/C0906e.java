package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.InterfaceC0875j;
import androidx.lifecycle.InterfaceC0895w;
import androidx.savedstate.C1068a;
import androidx.savedstate.InterfaceC1069b;
import androidx.savedstate.SavedStateRegistry;
import java.util.UUID;
/* renamed from: androidx.navigation.e */
/* loaded from: classes.dex */
public final class C0906e implements InterfaceC0875j, InterfaceC0895w, InterfaceC1069b {

    /* renamed from: f */
    private final C0925j f3185f;

    /* renamed from: g */
    private Bundle f3186g;

    /* renamed from: h */
    private final C0876k f3187h;

    /* renamed from: i */
    private final C1068a f3188i;

    /* renamed from: j */
    final UUID f3189j;

    /* renamed from: k */
    private AbstractC0868e.EnumC0870b f3190k;

    /* renamed from: l */
    private AbstractC0868e.EnumC0870b f3191l;

    /* renamed from: m */
    private C0918g f3192m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0907a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3193a;

        static {
            int[] iArr = new int[AbstractC0868e.EnumC0869a.values().length];
            f3193a = iArr;
            try {
                iArr[AbstractC0868e.EnumC0869a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3193a[AbstractC0868e.EnumC0869a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3193a[AbstractC0868e.EnumC0869a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3193a[AbstractC0868e.EnumC0869a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3193a[AbstractC0868e.EnumC0869a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3193a[AbstractC0868e.EnumC0869a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3193a[AbstractC0868e.EnumC0869a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0906e(Context context, C0925j c0925j, Bundle bundle, InterfaceC0875j interfaceC0875j, C0918g c0918g) {
        this(context, c0925j, bundle, interfaceC0875j, c0918g, UUID.randomUUID(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0906e(Context context, C0925j c0925j, Bundle bundle, InterfaceC0875j interfaceC0875j, C0918g c0918g, UUID uuid, Bundle bundle2) {
        this.f3187h = new C0876k(this);
        C1068a m5054a = C1068a.m5054a(this);
        this.f3188i = m5054a;
        this.f3190k = AbstractC0868e.EnumC0870b.CREATED;
        this.f3191l = AbstractC0868e.EnumC0870b.RESUMED;
        this.f3189j = uuid;
        this.f3185f = c0925j;
        this.f3186g = bundle;
        this.f3192m = c0918g;
        m5054a.m5052c(bundle2);
        if (interfaceC0875j != null) {
            this.f3190k = interfaceC0875j.mo698a().mo6123b();
        }
    }

    /* renamed from: e */
    private static AbstractC0868e.EnumC0870b m6026e(AbstractC0868e.EnumC0869a enumC0869a) {
        switch (C0907a.f3193a[enumC0869a.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0868e.EnumC0870b.CREATED;
            case 3:
            case 4:
                return AbstractC0868e.EnumC0870b.STARTED;
            case 5:
                return AbstractC0868e.EnumC0870b.RESUMED;
            case 6:
                return AbstractC0868e.EnumC0870b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + enumC0869a);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0875j
    /* renamed from: a */
    public AbstractC0868e mo698a() {
        return this.f3187h;
    }

    /* renamed from: b */
    public Bundle m6029b() {
        return this.f3186g;
    }

    /* renamed from: c */
    public C0925j m6028c() {
        return this.f3185f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC0868e.EnumC0870b m6027d() {
        return this.f3191l;
    }

    @Override // androidx.lifecycle.InterfaceC0895w
    /* renamed from: f */
    public C0894v mo6025f() {
        C0918g c0918g = this.f3192m;
        if (c0918g != null) {
            return c0918g.m5987g(this.f3189j);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6024g(AbstractC0868e.EnumC0869a enumC0869a) {
        this.f3190k = m6026e(enumC0869a);
        m6020m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6023h(Bundle bundle) {
        this.f3186g = bundle;
    }

    @Override // androidx.savedstate.InterfaceC1069b
    /* renamed from: j */
    public SavedStateRegistry mo5050j() {
        return this.f3188i.m5053b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m6022k(Bundle bundle) {
        this.f3188i.m5051d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m6021l(AbstractC0868e.EnumC0870b enumC0870b) {
        this.f3191l = enumC0870b;
        m6020m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m6020m() {
        C0876k c0876k;
        AbstractC0868e.EnumC0870b enumC0870b;
        if (this.f3190k.ordinal() < this.f3191l.ordinal()) {
            c0876k = this.f3187h;
            enumC0870b = this.f3190k;
        } else {
            c0876k = this.f3187h;
            enumC0870b = this.f3191l;
        }
        c0876k.m6109p(enumC0870b);
    }
}
