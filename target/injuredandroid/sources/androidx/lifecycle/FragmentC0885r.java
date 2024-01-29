package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0868e;
/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public class FragmentC0885r extends Fragment {

    /* renamed from: f */
    private InterfaceC0886a f3149f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.r$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0886a {
        /* renamed from: a */
        void m6090a();

        /* renamed from: b */
        void m6089b();

        /* renamed from: c */
        void m6088c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.r$b */
    /* loaded from: classes.dex */
    public static class C0887b implements Application.ActivityLifecycleCallbacks {
        C0887b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0885r.m6096a(activity, AbstractC0868e.EnumC0869a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0885r.m6096a(activity, AbstractC0868e.EnumC0869a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0885r.m6096a(activity, AbstractC0868e.EnumC0869a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0885r.m6096a(activity, AbstractC0868e.EnumC0869a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0885r.m6096a(activity, AbstractC0868e.EnumC0869a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0885r.m6096a(activity, AbstractC0868e.EnumC0869a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m6096a(Activity activity, AbstractC0868e.EnumC0869a enumC0869a) {
        if (activity instanceof InterfaceC0879l) {
            ((InterfaceC0879l) activity).mo698a().m6116i(enumC0869a);
        } else if (activity instanceof InterfaceC0875j) {
            AbstractC0868e mo698a = ((InterfaceC0875j) activity).mo698a();
            if (mo698a instanceof C0876k) {
                ((C0876k) mo698a).m6116i(enumC0869a);
            }
        }
    }

    /* renamed from: b */
    private void m6095b(AbstractC0868e.EnumC0869a enumC0869a) {
        if (Build.VERSION.SDK_INT < 29) {
            m6096a(getActivity(), enumC0869a);
        }
    }

    /* renamed from: c */
    private void m6094c(InterfaceC0886a interfaceC0886a) {
        if (interfaceC0886a != null) {
            interfaceC0886a.m6090a();
        }
    }

    /* renamed from: d */
    private void m6093d(InterfaceC0886a interfaceC0886a) {
        if (interfaceC0886a != null) {
            interfaceC0886a.m6089b();
        }
    }

    /* renamed from: e */
    private void m6092e(InterfaceC0886a interfaceC0886a) {
        if (interfaceC0886a != null) {
            interfaceC0886a.m6088c();
        }
    }

    /* renamed from: f */
    public static void m6091f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C0887b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0885r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m6094c(this.f3149f);
        m6095b(AbstractC0868e.EnumC0869a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m6095b(AbstractC0868e.EnumC0869a.ON_DESTROY);
        this.f3149f = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m6095b(AbstractC0868e.EnumC0869a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m6093d(this.f3149f);
        m6095b(AbstractC0868e.EnumC0869a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m6092e(this.f3149f);
        m6095b(AbstractC0868e.EnumC0869a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m6095b(AbstractC0868e.EnumC0869a.ON_STOP);
    }
}
