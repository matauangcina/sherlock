package p000a.p047p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p014d.C0066a;
import p000a.p014d.C0071d;
import p000a.p019g.p028k.C0252s;
/* renamed from: a.p.m */
/* loaded from: classes.dex */
public abstract class AbstractC0377m implements Cloneable {

    /* renamed from: L */
    private static final int[] f971L = {2, 1, 3, 4};

    /* renamed from: M */
    private static final AbstractC0362g f972M = new C0378a();

    /* renamed from: N */
    private static ThreadLocal<C0066a<Animator, C0381d>> f973N = new ThreadLocal<>();

    /* renamed from: H */
    AbstractC0389p f981H;

    /* renamed from: I */
    private AbstractC0382e f982I;

    /* renamed from: J */
    private C0066a<String, String> f983J;

    /* renamed from: y */
    private ArrayList<C0394s> f1004y;

    /* renamed from: z */
    private ArrayList<C0394s> f1005z;

    /* renamed from: f */
    private String f985f = getClass().getName();

    /* renamed from: g */
    private long f986g = -1;

    /* renamed from: h */
    long f987h = -1;

    /* renamed from: i */
    private TimeInterpolator f988i = null;

    /* renamed from: j */
    ArrayList<Integer> f989j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<View> f990k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<String> f991l = null;

    /* renamed from: m */
    private ArrayList<Class<?>> f992m = null;

    /* renamed from: n */
    private ArrayList<Integer> f993n = null;

    /* renamed from: o */
    private ArrayList<View> f994o = null;

    /* renamed from: p */
    private ArrayList<Class<?>> f995p = null;

    /* renamed from: q */
    private ArrayList<String> f996q = null;

    /* renamed from: r */
    private ArrayList<Integer> f997r = null;

    /* renamed from: s */
    private ArrayList<View> f998s = null;

    /* renamed from: t */
    private ArrayList<Class<?>> f999t = null;

    /* renamed from: u */
    private C0395t f1000u = new C0395t();

    /* renamed from: v */
    private C0395t f1001v = new C0395t();

    /* renamed from: w */
    C0390q f1002w = null;

    /* renamed from: x */
    private int[] f1003x = f971L;

    /* renamed from: A */
    boolean f974A = false;

    /* renamed from: B */
    ArrayList<Animator> f975B = new ArrayList<>();

    /* renamed from: C */
    private int f976C = 0;

    /* renamed from: D */
    private boolean f977D = false;

    /* renamed from: E */
    private boolean f978E = false;

    /* renamed from: F */
    private ArrayList<InterfaceC0383f> f979F = null;

    /* renamed from: G */
    private ArrayList<Animator> f980G = new ArrayList<>();

    /* renamed from: K */
    private AbstractC0362g f984K = f972M;

    /* renamed from: a.p.m$a */
    /* loaded from: classes.dex */
    static class C0378a extends AbstractC0362g {
        C0378a() {
        }

        @Override // p000a.p047p.AbstractC0362g
        /* renamed from: a */
        public Path mo8278a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.p.m$b */
    /* loaded from: classes.dex */
    public class C0379b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0066a f1006a;

        C0379b(C0066a c0066a) {
            this.f1006a = c0066a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1006a.remove(animator);
            AbstractC0377m.this.f975B.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0377m.this.f975B.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.p.m$c */
    /* loaded from: classes.dex */
    public class C0380c extends AnimatorListenerAdapter {
        C0380c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0377m.this.m8289p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.p.m$d */
    /* loaded from: classes.dex */
    public static class C0381d {

        /* renamed from: a */
        View f1009a;

        /* renamed from: b */
        String f1010b;

        /* renamed from: c */
        C0394s f1011c;

        /* renamed from: d */
        InterfaceC0384m0 f1012d;

        /* renamed from: e */
        AbstractC0377m f1013e;

        C0381d(View view, String str, AbstractC0377m abstractC0377m, InterfaceC0384m0 interfaceC0384m0, C0394s c0394s) {
            this.f1009a = view;
            this.f1010b = str;
            this.f1011c = c0394s;
            this.f1012d = interfaceC0384m0;
            this.f1013e = abstractC0377m;
        }
    }

    /* renamed from: a.p.m$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0382e {
    }

    /* renamed from: a.p.m$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0383f {
        /* renamed from: a */
        void mo8233a(AbstractC0377m abstractC0377m);

        /* renamed from: b */
        void mo8277b(AbstractC0377m abstractC0377m);

        /* renamed from: c */
        void mo8276c(AbstractC0377m abstractC0377m);

        /* renamed from: d */
        void mo8275d(AbstractC0377m abstractC0377m);

        /* renamed from: e */
        void mo8232e(AbstractC0377m abstractC0377m);
    }

    /* renamed from: H */
    private static boolean m8305H(C0394s c0394s, C0394s c0394s2, String str) {
        Object obj = c0394s.f1031a.get(str);
        Object obj2 = c0394s2.f1031a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: I */
    private void m8304I(C0066a<View, C0394s> c0066a, C0066a<View, C0394s> c0066a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m8306G(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m8306G(view)) {
                C0394s c0394s = c0066a.get(valueAt);
                C0394s c0394s2 = c0066a2.get(view);
                if (c0394s != null && c0394s2 != null) {
                    this.f1004y.add(c0394s);
                    this.f1005z.add(c0394s2);
                    c0066a.remove(valueAt);
                    c0066a2.remove(view);
                }
            }
        }
    }

    /* renamed from: J */
    private void m8303J(C0066a<View, C0394s> c0066a, C0066a<View, C0394s> c0066a2) {
        C0394s remove;
        for (int size = c0066a.size() - 1; size >= 0; size--) {
            View m9334i = c0066a.m9334i(size);
            if (m9334i != null && m8306G(m9334i) && (remove = c0066a2.remove(m9334i)) != null && m8306G(remove.f1032b)) {
                this.f1004y.add(c0066a.m9332k(size));
                this.f1005z.add(remove);
            }
        }
    }

    /* renamed from: K */
    private void m8302K(C0066a<View, C0394s> c0066a, C0066a<View, C0394s> c0066a2, C0071d<View> c0071d, C0071d<View> c0071d2) {
        View m9378f;
        int m9371m = c0071d.m9371m();
        for (int i = 0; i < m9371m; i++) {
            View m9370n = c0071d.m9370n(i);
            if (m9370n != null && m8306G(m9370n) && (m9378f = c0071d2.m9378f(c0071d.m9375i(i))) != null && m8306G(m9378f)) {
                C0394s c0394s = c0066a.get(m9370n);
                C0394s c0394s2 = c0066a2.get(m9378f);
                if (c0394s != null && c0394s2 != null) {
                    this.f1004y.add(c0394s);
                    this.f1005z.add(c0394s2);
                    c0066a.remove(m9370n);
                    c0066a2.remove(m9378f);
                }
            }
        }
    }

    /* renamed from: L */
    private void m8301L(C0066a<View, C0394s> c0066a, C0066a<View, C0394s> c0066a2, C0066a<String, View> c0066a3, C0066a<String, View> c0066a4) {
        View view;
        int size = c0066a3.size();
        for (int i = 0; i < size; i++) {
            View m9330m = c0066a3.m9330m(i);
            if (m9330m != null && m8306G(m9330m) && (view = c0066a4.get(c0066a3.m9334i(i))) != null && m8306G(view)) {
                C0394s c0394s = c0066a.get(m9330m);
                C0394s c0394s2 = c0066a2.get(view);
                if (c0394s != null && c0394s2 != null) {
                    this.f1004y.add(c0394s);
                    this.f1005z.add(c0394s2);
                    c0066a.remove(m9330m);
                    c0066a2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    private void m8300M(C0395t c0395t, C0395t c0395t2) {
        C0066a<View, C0394s> c0066a = new C0066a<>(c0395t.f1034a);
        C0066a<View, C0394s> c0066a2 = new C0066a<>(c0395t2.f1034a);
        int i = 0;
        while (true) {
            int[] iArr = this.f1003x;
            if (i >= iArr.length) {
                m8296c(c0066a, c0066a2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                m8303J(c0066a, c0066a2);
            } else if (i2 == 2) {
                m8301L(c0066a, c0066a2, c0395t.f1037d, c0395t2.f1037d);
            } else if (i2 == 3) {
                m8304I(c0066a, c0066a2, c0395t.f1035b, c0395t2.f1035b);
            } else if (i2 == 4) {
                m8302K(c0066a, c0066a2, c0395t.f1036c, c0395t2.f1036c);
            }
            i++;
        }
    }

    /* renamed from: S */
    private void m8298S(Animator animator, C0066a<Animator, C0381d> c0066a) {
        if (animator != null) {
            animator.addListener(new C0379b(c0066a));
            m8294e(animator);
        }
    }

    /* renamed from: c */
    private void m8296c(C0066a<View, C0394s> c0066a, C0066a<View, C0394s> c0066a2) {
        for (int i = 0; i < c0066a.size(); i++) {
            C0394s m9330m = c0066a.m9330m(i);
            if (m8306G(m9330m.f1032b)) {
                this.f1004y.add(m9330m);
                this.f1005z.add(null);
            }
        }
        for (int i2 = 0; i2 < c0066a2.size(); i2++) {
            C0394s m9330m2 = c0066a2.m9330m(i2);
            if (m8306G(m9330m2.f1032b)) {
                this.f1005z.add(m9330m2);
                this.f1004y.add(null);
            }
        }
    }

    /* renamed from: d */
    private static void m8295d(C0395t c0395t, View view, C0394s c0394s) {
        c0395t.f1034a.put(view, c0394s);
        int id = view.getId();
        if (id >= 0) {
            if (c0395t.f1035b.indexOfKey(id) >= 0) {
                c0395t.f1035b.put(id, null);
            } else {
                c0395t.f1035b.put(id, view);
            }
        }
        String m8658E = C0252s.m8658E(view);
        if (m8658E != null) {
            if (c0395t.f1037d.containsKey(m8658E)) {
                c0395t.f1037d.put(m8658E, null);
            } else {
                c0395t.f1037d.put(m8658E, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0395t.f1036c.m9376h(itemIdAtPosition) < 0) {
                    C0252s.m8607o0(view, true);
                    c0395t.f1036c.m9374j(itemIdAtPosition, view);
                    return;
                }
                View m9378f = c0395t.f1036c.m9378f(itemIdAtPosition);
                if (m9378f != null) {
                    C0252s.m8607o0(m9378f, false);
                    c0395t.f1036c.m9374j(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: h */
    private void m8293h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f993n;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f994o;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f995p;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f995p.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0394s c0394s = new C0394s(view);
                    if (z) {
                        mo8242j(c0394s);
                    } else {
                        mo8247g(c0394s);
                    }
                    c0394s.f1033c.add(this);
                    mo8244i(c0394s);
                    m8295d(z ? this.f1000u : this.f1001v, view, c0394s);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f997r;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f998s;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f999t;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f999t.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m8293h(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    private static C0066a<Animator, C0381d> m8281x() {
        C0066a<Animator, C0381d> c0066a = f973N.get();
        if (c0066a == null) {
            C0066a<Animator, C0381d> c0066a2 = new C0066a<>();
            f973N.set(c0066a2);
            return c0066a2;
        }
        return c0066a;
    }

    /* renamed from: A */
    public List<String> m8312A() {
        return this.f991l;
    }

    /* renamed from: B */
    public List<Class<?>> m8311B() {
        return this.f992m;
    }

    /* renamed from: C */
    public List<View> m8310C() {
        return this.f990k;
    }

    /* renamed from: D */
    public String[] mo8309D() {
        return null;
    }

    /* renamed from: E */
    public C0394s m8308E(View view, boolean z) {
        C0390q c0390q = this.f1002w;
        if (c0390q != null) {
            return c0390q.m8308E(view, z);
        }
        return (z ? this.f1000u : this.f1001v).f1034a.get(view);
    }

    /* renamed from: F */
    public boolean mo8307F(C0394s c0394s, C0394s c0394s2) {
        if (c0394s == null || c0394s2 == null) {
            return false;
        }
        String[] mo8309D = mo8309D();
        if (mo8309D == null) {
            for (String str : c0394s.f1031a.keySet()) {
                if (m8305H(c0394s, c0394s2, str)) {
                }
            }
            return false;
        }
        for (String str2 : mo8309D) {
            if (!m8305H(c0394s, c0394s2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m8306G(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f993n;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.f994o;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.f995p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f995p.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.f996q == null || C0252s.m8658E(view) == null || !this.f996q.contains(C0252s.m8658E(view))) {
                    if ((this.f989j.size() == 0 && this.f990k.size() == 0 && (((arrayList = this.f992m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f991l) == null || arrayList2.isEmpty()))) || this.f989j.contains(Integer.valueOf(id)) || this.f990k.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.f991l;
                    if (arrayList6 == null || !arrayList6.contains(C0252s.m8658E(view))) {
                        if (this.f992m != null) {
                            for (int i2 = 0; i2 < this.f992m.size(); i2++) {
                                if (this.f992m.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: N */
    public void mo8266N(View view) {
        if (this.f978E) {
            return;
        }
        C0066a<Animator, C0381d> m8281x = m8281x();
        int size = m8281x.size();
        InterfaceC0384m0 m8352d = C0345c0.m8352d(view);
        for (int i = size - 1; i >= 0; i--) {
            C0381d m9330m = m8281x.m9330m(i);
            if (m9330m.f1009a != null && m8352d.equals(m9330m.f1012d)) {
                C0328a.m8375b(m8281x.m9334i(i));
            }
        }
        ArrayList<InterfaceC0383f> arrayList = this.f979F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f979F.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC0383f) arrayList2.get(i2)).mo8276c(this);
            }
        }
        this.f977D = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m8299O(ViewGroup viewGroup) {
        C0381d c0381d;
        this.f1004y = new ArrayList<>();
        this.f1005z = new ArrayList<>();
        m8300M(this.f1000u, this.f1001v);
        C0066a<Animator, C0381d> m8281x = m8281x();
        int size = m8281x.size();
        InterfaceC0384m0 m8352d = C0345c0.m8352d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m9334i = m8281x.m9334i(i);
            if (m9334i != null && (c0381d = m8281x.get(m9334i)) != null && c0381d.f1009a != null && m8352d.equals(c0381d.f1012d)) {
                C0394s c0394s = c0381d.f1011c;
                View view = c0381d.f1009a;
                C0394s m8308E = m8308E(view, true);
                C0394s m8285t = m8285t(view, true);
                if (m8308E == null && m8285t == null) {
                    m8285t = this.f1001v.f1034a.get(view);
                }
                if (!(m8308E == null && m8285t == null) && c0381d.f1013e.mo8307F(c0394s, m8285t)) {
                    if (m9334i.isRunning() || m9334i.isStarted()) {
                        m9334i.cancel();
                    } else {
                        m8281x.remove(m9334i);
                    }
                }
            }
        }
        mo8235o(viewGroup, this.f1000u, this.f1001v, this.f1004y, this.f1005z);
        mo8262T();
    }

    /* renamed from: P */
    public AbstractC0377m mo8265P(InterfaceC0383f interfaceC0383f) {
        ArrayList<InterfaceC0383f> arrayList = this.f979F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC0383f);
        if (this.f979F.size() == 0) {
            this.f979F = null;
        }
        return this;
    }

    /* renamed from: Q */
    public AbstractC0377m mo8264Q(View view) {
        this.f990k.remove(view);
        return this;
    }

    /* renamed from: R */
    public void mo8263R(View view) {
        if (this.f977D) {
            if (!this.f978E) {
                C0066a<Animator, C0381d> m8281x = m8281x();
                int size = m8281x.size();
                InterfaceC0384m0 m8352d = C0345c0.m8352d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0381d m9330m = m8281x.m9330m(i);
                    if (m9330m.f1009a != null && m8352d.equals(m9330m.f1012d)) {
                        C0328a.m8374c(m8281x.m9334i(i));
                    }
                }
                ArrayList<InterfaceC0383f> arrayList = this.f979F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f979F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC0383f) arrayList2.get(i2)).mo8275d(this);
                    }
                }
            }
            this.f977D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public void mo8262T() {
        m8297a0();
        C0066a<Animator, C0381d> m8281x = m8281x();
        Iterator<Animator> it = this.f980G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m8281x.containsKey(next)) {
                m8297a0();
                m8298S(next, m8281x);
            }
        }
        this.f980G.clear();
        m8289p();
    }

    /* renamed from: U */
    public AbstractC0377m mo8261U(long j) {
        this.f987h = j;
        return this;
    }

    /* renamed from: V */
    public void mo8260V(AbstractC0382e abstractC0382e) {
        this.f982I = abstractC0382e;
    }

    /* renamed from: W */
    public AbstractC0377m mo8259W(TimeInterpolator timeInterpolator) {
        this.f988i = timeInterpolator;
        return this;
    }

    /* renamed from: X */
    public void mo8258X(AbstractC0362g abstractC0362g) {
        if (abstractC0362g == null) {
            abstractC0362g = f972M;
        }
        this.f984K = abstractC0362g;
    }

    /* renamed from: Y */
    public void mo8257Y(AbstractC0389p abstractC0389p) {
        this.f981H = abstractC0389p;
    }

    /* renamed from: Z */
    public AbstractC0377m mo8256Z(long j) {
        this.f986g = j;
        return this;
    }

    /* renamed from: a */
    public AbstractC0377m mo8255a(InterfaceC0383f interfaceC0383f) {
        if (this.f979F == null) {
            this.f979F = new ArrayList<>();
        }
        this.f979F.add(interfaceC0383f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a0 */
    public void m8297a0() {
        if (this.f976C == 0) {
            ArrayList<InterfaceC0383f> arrayList = this.f979F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f979F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC0383f) arrayList2.get(i)).mo8233a(this);
                }
            }
            this.f978E = false;
        }
        this.f976C++;
    }

    /* renamed from: b */
    public AbstractC0377m mo8254b(View view) {
        this.f990k.add(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public String mo8253b0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f987h != -1) {
            str2 = str2 + "dur(" + this.f987h + ") ";
        }
        if (this.f986g != -1) {
            str2 = str2 + "dly(" + this.f986g + ") ";
        }
        if (this.f988i != null) {
            str2 = str2 + "interp(" + this.f988i + ") ";
        }
        if (this.f989j.size() > 0 || this.f990k.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f989j.size() > 0) {
                for (int i = 0; i < this.f989j.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f989j.get(i);
                }
            }
            if (this.f990k.size() > 0) {
                for (int i2 = 0; i2 < this.f990k.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f990k.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: e */
    protected void m8294e(Animator animator) {
        if (animator == null) {
            m8289p();
            return;
        }
        if (m8288q() >= 0) {
            animator.setDuration(m8288q());
        }
        if (m8280y() >= 0) {
            animator.setStartDelay(m8280y() + animator.getStartDelay());
        }
        if (m8286s() != null) {
            animator.setInterpolator(m8286s());
        }
        animator.addListener(new C0380c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8249f() {
        for (int size = this.f975B.size() - 1; size >= 0; size--) {
            this.f975B.get(size).cancel();
        }
        ArrayList<InterfaceC0383f> arrayList = this.f979F;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f979F.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC0383f) arrayList2.get(i)).mo8277b(this);
        }
    }

    /* renamed from: g */
    public abstract void mo8247g(C0394s c0394s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8244i(C0394s c0394s) {
        String[] m8268b;
        if (this.f981H == null || c0394s.f1031a.isEmpty() || (m8268b = this.f981H.m8268b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= m8268b.length) {
                z = true;
                break;
            } else if (!c0394s.f1031a.containsKey(m8268b[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.f981H.m8269a(c0394s);
    }

    /* renamed from: j */
    public abstract void mo8242j(C0394s c0394s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m8292k(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C0066a<String, String> c0066a;
        m8291l(z);
        if ((this.f989j.size() > 0 || this.f990k.size() > 0) && (((arrayList = this.f991l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f992m) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f989j.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f989j.get(i).intValue());
                if (findViewById != null) {
                    C0394s c0394s = new C0394s(findViewById);
                    if (z) {
                        mo8242j(c0394s);
                    } else {
                        mo8247g(c0394s);
                    }
                    c0394s.f1033c.add(this);
                    mo8244i(c0394s);
                    m8295d(z ? this.f1000u : this.f1001v, findViewById, c0394s);
                }
            }
            for (int i2 = 0; i2 < this.f990k.size(); i2++) {
                View view = this.f990k.get(i2);
                C0394s c0394s2 = new C0394s(view);
                if (z) {
                    mo8242j(c0394s2);
                } else {
                    mo8247g(c0394s2);
                }
                c0394s2.f1033c.add(this);
                mo8244i(c0394s2);
                m8295d(z ? this.f1000u : this.f1001v, view, c0394s2);
            }
        } else {
            m8293h(viewGroup, z);
        }
        if (z || (c0066a = this.f983J) == null) {
            return;
        }
        int size = c0066a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.f1000u.f1037d.remove(this.f983J.m9334i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f1000u.f1037d.put(this.f983J.m9330m(i4), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m8291l(boolean z) {
        C0395t c0395t;
        if (z) {
            this.f1000u.f1034a.clear();
            this.f1000u.f1035b.clear();
            c0395t = this.f1000u;
        } else {
            this.f1001v.f1034a.clear();
            this.f1001v.f1035b.clear();
            c0395t = this.f1001v;
        }
        c0395t.f1036c.m9382b();
    }

    @Override // 
    /* renamed from: m */
    public AbstractC0377m clone() {
        try {
            AbstractC0377m abstractC0377m = (AbstractC0377m) super.clone();
            abstractC0377m.f980G = new ArrayList<>();
            abstractC0377m.f1000u = new C0395t();
            abstractC0377m.f1001v = new C0395t();
            abstractC0377m.f1004y = null;
            abstractC0377m.f1005z = null;
            return abstractC0377m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo8290n(ViewGroup viewGroup, C0394s c0394s, C0394s c0394s2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8235o(ViewGroup viewGroup, C0395t c0395t, C0395t c0395t2, ArrayList<C0394s> arrayList, ArrayList<C0394s> arrayList2) {
        Animator mo8290n;
        int i;
        int i2;
        View view;
        Animator animator;
        C0394s c0394s;
        Animator animator2;
        C0394s c0394s2;
        C0066a<Animator, C0381d> m8281x = m8281x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0394s c0394s3 = arrayList.get(i3);
            C0394s c0394s4 = arrayList2.get(i3);
            if (c0394s3 != null && !c0394s3.f1033c.contains(this)) {
                c0394s3 = null;
            }
            if (c0394s4 != null && !c0394s4.f1033c.contains(this)) {
                c0394s4 = null;
            }
            if (c0394s3 != null || c0394s4 != null) {
                if ((c0394s3 == null || c0394s4 == null || mo8307F(c0394s3, c0394s4)) && (mo8290n = mo8290n(viewGroup, c0394s3, c0394s4)) != null) {
                    if (c0394s4 != null) {
                        view = c0394s4.f1032b;
                        String[] mo8309D = mo8309D();
                        if (mo8309D != null && mo8309D.length > 0) {
                            c0394s2 = new C0394s(view);
                            i = size;
                            C0394s c0394s5 = c0395t2.f1034a.get(view);
                            if (c0394s5 != null) {
                                int i4 = 0;
                                while (i4 < mo8309D.length) {
                                    c0394s2.f1031a.put(mo8309D[i4], c0394s5.f1031a.get(mo8309D[i4]));
                                    i4++;
                                    i3 = i3;
                                    c0394s5 = c0394s5;
                                }
                            }
                            i2 = i3;
                            int size2 = m8281x.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = mo8290n;
                                    break;
                                }
                                C0381d c0381d = m8281x.get(m8281x.m9334i(i5));
                                if (c0381d.f1011c != null && c0381d.f1009a == view && c0381d.f1010b.equals(m8284u()) && c0381d.f1011c.equals(c0394s2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = mo8290n;
                            c0394s2 = null;
                        }
                        animator = animator2;
                        c0394s = c0394s2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c0394s3.f1032b;
                        animator = mo8290n;
                        c0394s = null;
                    }
                    if (animator != null) {
                        AbstractC0389p abstractC0389p = this.f981H;
                        if (abstractC0389p != null) {
                            long m8267c = abstractC0389p.m8267c(viewGroup, this, c0394s3, c0394s4);
                            sparseIntArray.put(this.f980G.size(), (int) m8267c);
                            j = Math.min(m8267c, j);
                        }
                        m8281x.put(animator, new C0381d(view, m8284u(), this, C0345c0.m8352d(viewGroup), c0394s));
                        this.f980G.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.f980G.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m8289p() {
        int i = this.f976C - 1;
        this.f976C = i;
        if (i == 0) {
            ArrayList<InterfaceC0383f> arrayList = this.f979F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f979F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC0383f) arrayList2.get(i2)).mo8232e(this);
                }
            }
            for (int i3 = 0; i3 < this.f1000u.f1036c.m9371m(); i3++) {
                View m9370n = this.f1000u.f1036c.m9370n(i3);
                if (m9370n != null) {
                    C0252s.m8607o0(m9370n, false);
                }
            }
            for (int i4 = 0; i4 < this.f1001v.f1036c.m9371m(); i4++) {
                View m9370n2 = this.f1001v.f1036c.m9370n(i4);
                if (m9370n2 != null) {
                    C0252s.m8607o0(m9370n2, false);
                }
            }
            this.f978E = true;
        }
    }

    /* renamed from: q */
    public long m8288q() {
        return this.f987h;
    }

    /* renamed from: r */
    public AbstractC0382e m8287r() {
        return this.f982I;
    }

    /* renamed from: s */
    public TimeInterpolator m8286s() {
        return this.f988i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C0394s m8285t(View view, boolean z) {
        C0390q c0390q = this.f1002w;
        if (c0390q != null) {
            return c0390q.m8285t(view, z);
        }
        ArrayList<C0394s> arrayList = z ? this.f1004y : this.f1005z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0394s c0394s = arrayList.get(i2);
            if (c0394s == null) {
                return null;
            }
            if (c0394s.f1032b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f1005z : this.f1004y).get(i);
        }
        return null;
    }

    public String toString() {
        return mo8253b0("");
    }

    /* renamed from: u */
    public String m8284u() {
        return this.f985f;
    }

    /* renamed from: v */
    public AbstractC0362g m8283v() {
        return this.f984K;
    }

    /* renamed from: w */
    public AbstractC0389p m8282w() {
        return this.f981H;
    }

    /* renamed from: y */
    public long m8280y() {
        return this.f986g;
    }

    /* renamed from: z */
    public List<Integer> m8279z() {
        return this.f989j;
    }
}
