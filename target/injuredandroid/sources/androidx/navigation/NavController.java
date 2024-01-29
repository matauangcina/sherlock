package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.AbstractC0431b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0730n;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0874i;
import androidx.lifecycle.InterfaceC0875j;
import androidx.navigation.AbstractC0952r;
import androidx.navigation.C0925j;
import androidx.navigation.C0932o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class NavController {

    /* renamed from: a */
    private final Context f3154a;

    /* renamed from: b */
    private Activity f3155b;

    /* renamed from: c */
    private C0931n f3156c;

    /* renamed from: d */
    C0927k f3157d;

    /* renamed from: e */
    private Bundle f3158e;

    /* renamed from: f */
    private Parcelable[] f3159f;

    /* renamed from: g */
    private boolean f3160g;

    /* renamed from: i */
    private InterfaceC0875j f3162i;

    /* renamed from: j */
    private C0918g f3163j;

    /* renamed from: h */
    final Deque<C0906e> f3161h = new ArrayDeque();

    /* renamed from: k */
    private C0955s f3164k = new C0955s();

    /* renamed from: l */
    private final CopyOnWriteArrayList<InterfaceC0898b> f3165l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    private final InterfaceC0874i f3166m = new InterfaceC0873h() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.InterfaceC0873h
        /* renamed from: d */
        public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
            NavController navController = NavController.this;
            if (navController.f3157d != null) {
                for (C0906e c0906e : navController.f3161h) {
                    c0906e.m6024g(enumC0869a);
                }
            }
        }
    };

    /* renamed from: n */
    private final AbstractC0431b f3167n = new C0897a(false);

    /* renamed from: o */
    private boolean f3168o = true;

    /* renamed from: androidx.navigation.NavController$a */
    /* loaded from: classes.dex */
    class C0897a extends AbstractC0431b {
        C0897a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0431b
        /* renamed from: b */
        public void mo6055b() {
            NavController.this.m6064m();
        }
    }

    /* renamed from: androidx.navigation.NavController$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0898b {
        /* renamed from: a */
        void m6054a(NavController navController, C0925j c0925j, Bundle bundle);
    }

    public NavController(Context context) {
        this.f3154a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f3155b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C0955s c0955s = this.f3164k;
        c0955s.m5850a(new C0929l(c0955s));
        this.f3164k.m5850a(new C0899a(this.f3154a));
    }

    /* renamed from: a */
    private boolean m6075a() {
        while (!this.f3161h.isEmpty() && (this.f3161h.peekLast().m6028c() instanceof C0927k) && m6062o(this.f3161h.peekLast().m6028c().m5956s(), true)) {
        }
        if (this.f3161h.isEmpty()) {
            return false;
        }
        C0925j m6028c = this.f3161h.peekLast().m6028c();
        C0925j c0925j = null;
        if (m6028c instanceof InterfaceC0902b) {
            Iterator<C0906e> descendingIterator = this.f3161h.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                C0925j m6028c2 = descendingIterator.next().m6028c();
                if (!(m6028c2 instanceof C0927k) && !(m6028c2 instanceof InterfaceC0902b)) {
                    c0925j = m6028c2;
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator<C0906e> descendingIterator2 = this.f3161h.descendingIterator();
        while (descendingIterator2.hasNext()) {
            C0906e next = descendingIterator2.next();
            AbstractC0868e.EnumC0870b m6027d = next.m6027d();
            C0925j m6028c3 = next.m6028c();
            if (m6028c != null && m6028c3.m5956s() == m6028c.m5956s()) {
                AbstractC0868e.EnumC0870b enumC0870b = AbstractC0868e.EnumC0870b.RESUMED;
                if (m6027d != enumC0870b) {
                    hashMap.put(next, enumC0870b);
                }
                m6028c = m6028c.m5954w();
            } else if (c0925j == null || m6028c3.m5956s() != c0925j.m5956s()) {
                next.m6021l(AbstractC0868e.EnumC0870b.CREATED);
            } else {
                if (m6027d == AbstractC0868e.EnumC0870b.RESUMED) {
                    next.m6021l(AbstractC0868e.EnumC0870b.STARTED);
                } else {
                    AbstractC0868e.EnumC0870b enumC0870b2 = AbstractC0868e.EnumC0870b.STARTED;
                    if (m6027d != enumC0870b2) {
                        hashMap.put(next, enumC0870b2);
                    }
                }
                c0925j = c0925j.m5954w();
            }
        }
        for (C0906e c0906e : this.f3161h) {
            AbstractC0868e.EnumC0870b enumC0870b3 = (AbstractC0868e.EnumC0870b) hashMap.get(c0906e);
            if (enumC0870b3 != null) {
                c0906e.m6021l(enumC0870b3);
            } else {
                c0906e.m6020m();
            }
        }
        C0906e peekLast = this.f3161h.peekLast();
        Iterator<InterfaceC0898b> it = this.f3165l.iterator();
        while (it.hasNext()) {
            it.next().m6054a(this, peekLast.m6028c(), peekLast.m6029b());
        }
        return true;
    }

    /* renamed from: d */
    private String m6073d(int[] iArr) {
        C0927k c0927k;
        C0927k c0927k2 = this.f3157d;
        int i = 0;
        while (true) {
            C0925j c0925j = null;
            if (i >= iArr.length) {
                return null;
            }
            int i2 = iArr[i];
            if (i != 0) {
                c0925j = c0927k2.m5948F(i2);
            } else if (this.f3157d.m5956s() == i2) {
                c0925j = this.f3157d;
            }
            if (c0925j == null) {
                return C0925j.m5957m(this.f3154a, i2);
            }
            if (i != iArr.length - 1) {
                while (true) {
                    c0927k = (C0927k) c0925j;
                    if (!(c0927k.m5948F(c0927k.m5945I()) instanceof C0927k)) {
                        break;
                    }
                    c0925j = c0927k.m5948F(c0927k.m5945I());
                }
                c0927k2 = c0927k;
            }
            i++;
        }
    }

    /* renamed from: g */
    private int m6070g() {
        int i = 0;
        for (C0906e c0906e : this.f3161h) {
            if (!(c0906e.m6028c() instanceof C0927k)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    private void m6066k(C0925j c0925j, Bundle bundle, C0932o c0932o, AbstractC0952r.InterfaceC0953a interfaceC0953a) {
        boolean z = false;
        boolean m6062o = (c0932o == null || c0932o.m5921e() == -1) ? false : m6062o(c0932o.m5921e(), c0932o.m5920f());
        AbstractC0952r m5846e = this.f3164k.m5846e(c0925j.m5955u());
        Bundle m5960f = c0925j.m5960f(bundle);
        C0925j mo5854b = m5846e.mo5854b(c0925j, m5960f, c0932o, interfaceC0953a);
        if (mo5854b != null) {
            if (!(mo5854b instanceof InterfaceC0902b)) {
                while (!this.f3161h.isEmpty() && (this.f3161h.peekLast().m6028c() instanceof InterfaceC0902b) && m6062o(this.f3161h.peekLast().m6028c().m5956s(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (c0925j instanceof C0927k) {
                C0927k c0927k = mo5854b;
                while (true) {
                    C0927k m5954w = c0927k.m5954w();
                    if (m5954w != null) {
                        arrayDeque.addFirst(new C0906e(this.f3154a, m5954w, m5960f, this.f3162i, this.f3163j));
                        if (!this.f3161h.isEmpty() && this.f3161h.getLast().m6028c() == m5954w) {
                            m6062o(m5954w.m5956s(), true);
                        }
                    }
                    if (m5954w == null || m5954w == c0925j) {
                        break;
                    }
                    c0927k = m5954w;
                }
            }
            C0927k m6028c = arrayDeque.isEmpty() ? mo5854b : ((C0906e) arrayDeque.getFirst()).m6028c();
            while (m6028c != null && m6074c(m6028c.m5956s()) == null) {
                m6028c = m6028c.m5954w();
                if (m6028c != null) {
                    arrayDeque.addFirst(new C0906e(this.f3154a, m6028c, m5960f, this.f3162i, this.f3163j));
                }
            }
            C0925j m6028c2 = arrayDeque.isEmpty() ? mo5854b : ((C0906e) arrayDeque.getLast()).m6028c();
            while (!this.f3161h.isEmpty() && (this.f3161h.getLast().m6028c() instanceof C0927k) && ((C0927k) this.f3161h.getLast().m6028c()).m5947G(m6028c2.m5956s(), false) == null && m6062o(this.f3161h.getLast().m6028c().m5956s(), true)) {
            }
            this.f3161h.addAll(arrayDeque);
            if (this.f3161h.isEmpty() || this.f3161h.getFirst().m6028c() != this.f3157d) {
                this.f3161h.addFirst(new C0906e(this.f3154a, this.f3157d, m5960f, this.f3162i, this.f3163j));
            }
            this.f3161h.add(new C0906e(this.f3154a, mo5854b, mo5854b.m5960f(m5960f), this.f3162i, this.f3163j));
        } else if (c0932o != null && c0932o.m5919g()) {
            C0906e peekLast = this.f3161h.peekLast();
            if (peekLast != null) {
                peekLast.m6023h(m5960f);
            }
            z = true;
        }
        m6056x();
        if (m6062o || mo5854b != null || z) {
            m6075a();
        }
    }

    /* renamed from: l */
    private void m6065l(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f3158e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                AbstractC0952r m5846e = this.f3164k.m5846e(next);
                Bundle bundle3 = this.f3158e.getBundle(next);
                if (bundle3 != null) {
                    m5846e.mo5853c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f3159f;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                C0908f c0908f = (C0908f) parcelable;
                C0925j m6074c = m6074c(c0908f.m6018b());
                if (m6074c == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + C0925j.m5957m(this.f3154a, c0908f.m6018b()) + " cannot be found from the current destination " + m6071f());
                }
                Bundle m6019a = c0908f.m6019a();
                if (m6019a != null) {
                    m6019a.setClassLoader(this.f3154a.getClassLoader());
                }
                this.f3161h.add(new C0906e(this.f3154a, m6074c, m6019a, this.f3162i, this.f3163j, c0908f.m6016h(), c0908f.m6017c()));
            }
            m6056x();
            this.f3159f = null;
        }
        if (this.f3157d == null || !this.f3161h.isEmpty()) {
            m6075a();
            return;
        }
        if (!this.f3160g && (activity = this.f3155b) != null && m6067j(activity.getIntent())) {
            z = true;
        }
        if (z) {
            return;
        }
        m6066k(this.f3157d, bundle, null, null);
    }

    /* renamed from: x */
    private void m6056x() {
        boolean z = true;
        this.f3167n.m8128f((!this.f3168o || m6070g() <= 1) ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5937b(boolean z) {
        this.f3168o = z;
        m6056x();
    }

    /* renamed from: c */
    C0925j m6074c(int i) {
        C0927k c0927k = this.f3157d;
        if (c0927k == null) {
            return null;
        }
        if (c0927k.m5956s() == i) {
            return this.f3157d;
        }
        C0927k m6028c = this.f3161h.isEmpty() ? this.f3157d : this.f3161h.getLast().m6028c();
        return (m6028c instanceof C0927k ? m6028c : m6028c.m5954w()).m5948F(i);
    }

    /* renamed from: e */
    public C0906e m6072e() {
        if (this.f3161h.isEmpty()) {
            return null;
        }
        return this.f3161h.getLast();
    }

    /* renamed from: f */
    public C0925j m6071f() {
        C0906e m6072e = m6072e();
        if (m6072e != null) {
            return m6072e.m6028c();
        }
        return null;
    }

    /* renamed from: h */
    public C0931n m6069h() {
        if (this.f3156c == null) {
            this.f3156c = new C0931n(this.f3154a, this.f3164k);
        }
        return this.f3156c;
    }

    /* renamed from: i */
    public C0955s m6068i() {
        return this.f3164k;
    }

    /* renamed from: j */
    public boolean m6067j(Intent intent) {
        C0925j.C0926a mo5942x;
        C0927k c0927k;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (mo5942x = this.f3157d.mo5942x(new C0924i(intent))) != null) {
            C0925j m5951e = mo5942x.m5951e();
            int[] m5959g = m5951e.m5959g();
            bundle.putAll(m5951e.m5960f(mo5942x.m5950f()));
            intArray = m5959g;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String m6073d = m6073d(intArray);
        if (m6073d != null) {
            Log.i("NavController", "Could not find destination " + m6073d + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            C0730n m6889i = C0730n.m6889i(this.f3154a);
            m6889i.m6892e(intent);
            m6889i.m6888l();
            Activity activity = this.f3155b;
            if (activity != null) {
                activity.finish();
                this.f3155b.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i != 0) {
            if (!this.f3161h.isEmpty()) {
                m6062o(this.f3157d.m5956s(), true);
            }
            int i2 = 0;
            while (i2 < intArray.length) {
                int i3 = i2 + 1;
                int i4 = intArray[i2];
                C0925j m6074c = m6074c(i4);
                if (m6074c == null) {
                    String m5957m = C0925j.m5957m(this.f3154a, i4);
                    throw new IllegalStateException("Deep Linking failed: destination " + m5957m + " cannot be found from the current destination " + m6071f());
                }
                C0932o.C0933a c0933a = new C0932o.C0933a();
                c0933a.m5917b(0);
                c0933a.m5916c(0);
                m6066k(m6074c, bundle, c0933a.m5918a(), null);
                i2 = i3;
            }
            return true;
        } else {
            C0927k c0927k2 = this.f3157d;
            int i5 = 0;
            while (i5 < intArray.length) {
                int i6 = intArray[i5];
                C0925j m5948F = i5 == 0 ? this.f3157d : c0927k2.m5948F(i6);
                if (m5948F == null) {
                    String m5957m2 = C0925j.m5957m(this.f3154a, i6);
                    throw new IllegalStateException("Deep Linking failed: destination " + m5957m2 + " cannot be found in graph " + c0927k2);
                }
                if (i5 != intArray.length - 1) {
                    while (true) {
                        c0927k = (C0927k) m5948F;
                        if (!(c0927k.m5948F(c0927k.m5945I()) instanceof C0927k)) {
                            break;
                        }
                        m5948F = c0927k.m5948F(c0927k.m5945I());
                    }
                    c0927k2 = c0927k;
                } else {
                    Bundle m5960f = m5948F.m5960f(bundle);
                    C0932o.C0933a c0933a2 = new C0932o.C0933a();
                    c0933a2.m5912g(this.f3157d.m5956s(), true);
                    c0933a2.m5917b(0);
                    c0933a2.m5916c(0);
                    m6066k(m5948F, m5960f, c0933a2.m5918a(), null);
                }
                i5++;
            }
            this.f3160g = true;
            return true;
        }
    }

    /* renamed from: m */
    public boolean m6064m() {
        if (this.f3161h.isEmpty()) {
            return false;
        }
        return m6063n(m6071f().m5956s(), true);
    }

    /* renamed from: n */
    public boolean m6063n(int i, boolean z) {
        return m6062o(i, z) && m6075a();
    }

    /* renamed from: o */
    boolean m6062o(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f3161h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0906e> descendingIterator = this.f3161h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            C0925j m6028c = descendingIterator.next().m6028c();
            AbstractC0952r m5846e = this.f3164k.m5846e(m6028c.m5955u());
            if (z || m6028c.m5956s() != i) {
                arrayList.add(m5846e);
            }
            if (m6028c.m5956s() == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String m5957m = C0925j.m5957m(this.f3154a, i);
            Log.i("NavController", "Ignoring popBackStack to destination " + m5957m + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((AbstractC0952r) it.next()).mo5851e()) {
            C0906e removeLast = this.f3161h.removeLast();
            if (removeLast.mo698a().mo6123b().m6128d(AbstractC0868e.EnumC0870b.CREATED)) {
                removeLast.m6021l(AbstractC0868e.EnumC0870b.DESTROYED);
            }
            C0918g c0918g = this.f3163j;
            if (c0918g != null) {
                c0918g.m5989e(removeLast.f3189j);
            }
            z3 = true;
        }
        m6056x();
        return z3;
    }

    /* renamed from: p */
    public void m6061p(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f3154a.getClassLoader());
        this.f3158e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f3159f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f3160g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    /* renamed from: q */
    public Bundle m6060q() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, AbstractC0952r<? extends C0925j>> entry : this.f3164k.m5845f().entrySet()) {
            String key = entry.getKey();
            Bundle mo5852d = entry.getValue().mo5852d();
            if (mo5852d != null) {
                arrayList.add(key);
                bundle2.putBundle(key, mo5852d);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f3161h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f3161h.size()];
            int i = 0;
            for (C0906e c0906e : this.f3161h) {
                parcelableArr[i] = new C0908f(c0906e);
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f3160g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f3160g);
        }
        return bundle;
    }

    /* renamed from: r */
    public void m6059r(int i) {
        m6058s(i, null);
    }

    /* renamed from: s */
    public void m6058s(int i, Bundle bundle) {
        m6057t(m6069h().m5931c(i), bundle);
    }

    /* renamed from: t */
    public void m6057t(C0927k c0927k, Bundle bundle) {
        C0927k c0927k2 = this.f3157d;
        if (c0927k2 != null) {
            m6062o(c0927k2.m5956s(), true);
        }
        this.f3157d = c0927k;
        m6065l(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo5936u(InterfaceC0875j interfaceC0875j) {
        if (interfaceC0875j == this.f3162i) {
            return;
        }
        this.f3162i = interfaceC0875j;
        interfaceC0875j.mo698a().mo6124a(this.f3166m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5935v(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f3162i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.f3167n.m8130d();
        onBackPressedDispatcher.m8135a(this.f3162i, this.f3167n);
        this.f3162i.mo698a().mo6122c(this.f3166m);
        this.f3162i.mo698a().mo6124a(this.f3166m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5934w(C0894v c0894v) {
        if (this.f3163j == C0918g.m5988f(c0894v)) {
            return;
        }
        if (!this.f3161h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f3163j = C0918g.m5988f(c0894v);
    }
}
