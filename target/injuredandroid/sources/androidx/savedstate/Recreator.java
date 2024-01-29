package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
final class Recreator implements InterfaceC0873h {

    /* renamed from: a */
    private final InterfaceC1069b f3689a;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    static final class C1064a implements SavedStateRegistry.InterfaceC1067b {

        /* renamed from: a */
        final Set<String> f3690a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1064a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m5058d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1067b
        /* renamed from: a */
        public Bundle mo5055a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3690a));
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m5062b(String str) {
            this.f3690a.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(InterfaceC1069b interfaceC1069b) {
        this.f3689a = interfaceC1069b;
    }

    /* renamed from: h */
    private void m5063h(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC1066a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC1066a) declaredConstructor.newInstance(new Object[0])).mo5056a(this.f3689a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0873h
    /* renamed from: d */
    public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
        if (enumC0869a != AbstractC0868e.EnumC0869a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0875j.mo698a().mo6122c(this);
        Bundle m5061a = this.f3689a.mo5050j().m5061a("androidx.savedstate.Restarter");
        if (m5061a == null) {
            return;
        }
        ArrayList<String> stringArrayList = m5061a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m5063h(it.next());
        }
    }
}
