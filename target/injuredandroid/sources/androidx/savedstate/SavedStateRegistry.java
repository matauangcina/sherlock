package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import androidx.savedstate.Recreator;
import java.util.Map;
import p000a.p008b.p009a.p011b.C0048b;
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f3692b;

    /* renamed from: c */
    private boolean f3693c;

    /* renamed from: d */
    private Recreator.C1064a f3694d;

    /* renamed from: a */
    private C0048b<String, InterfaceC1067b> f3691a = new C0048b<>();

    /* renamed from: e */
    boolean f3695e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1066a {
        /* renamed from: a */
        void mo5056a(InterfaceC1069b interfaceC1069b);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1067b {
        /* renamed from: a */
        Bundle mo5055a();
    }

    /* renamed from: a */
    public Bundle m5061a(String str) {
        if (this.f3693c) {
            Bundle bundle = this.f3692b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f3692b.remove(str);
                if (this.f3692b.isEmpty()) {
                    this.f3692b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5060b(AbstractC0868e abstractC0868e, Bundle bundle) {
        if (this.f3693c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f3692b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0868e.mo6124a(new InterfaceC0873h() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.InterfaceC0873h
            /* renamed from: d */
            public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
                SavedStateRegistry savedStateRegistry;
                boolean z;
                if (enumC0869a == AbstractC0868e.EnumC0869a.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z = true;
                } else if (enumC0869a != AbstractC0868e.EnumC0869a.ON_STOP) {
                    return;
                } else {
                    savedStateRegistry = SavedStateRegistry.this;
                    z = false;
                }
                savedStateRegistry.f3695e = z;
            }
        });
        this.f3693c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5059c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3692b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0048b<String, InterfaceC1067b>.C0052d m9463g = this.f3691a.m9463g();
        while (m9463g.hasNext()) {
            Map.Entry next = m9463g.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC1067b) next.getValue()).mo5055a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m5058d(String str, InterfaceC1067b interfaceC1067b) {
        if (this.f3691a.mo9460m(str, interfaceC1067b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m5057e(Class<? extends InterfaceC1066a> cls) {
        if (!this.f3695e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3694d == null) {
            this.f3694d = new Recreator.C1064a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f3694d.m5062b(cls.getName());
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
