package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p019g.p024g.C0144b;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0265u;
import p000a.p019g.p028k.ViewTreeObserver$OnPreDrawListenerC0250q;
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public abstract class AbstractC0852w {

    /* renamed from: androidx.fragment.app.w$a */
    /* loaded from: classes.dex */
    class RunnableC0853a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f3079f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3080g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3081h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f3082i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3083j;

        RunnableC0853a(AbstractC0852w abstractC0852w, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3079f = i;
            this.f3080g = arrayList;
            this.f3081h = arrayList2;
            this.f3082i = arrayList3;
            this.f3083j = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f3079f; i++) {
                C0252s.m8595u0((View) this.f3080g.get(i), (String) this.f3081h.get(i));
                C0252s.m8595u0((View) this.f3082i.get(i), (String) this.f3083j.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.w$b */
    /* loaded from: classes.dex */
    class RunnableC0854b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3084f;

        /* renamed from: g */
        final /* synthetic */ Map f3085g;

        RunnableC0854b(AbstractC0852w abstractC0852w, ArrayList arrayList, Map map) {
            this.f3084f = arrayList;
            this.f3085g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3084f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3084f.get(i);
                String m8658E = C0252s.m8658E(view);
                if (m8658E != null) {
                    C0252s.m8595u0(view, AbstractC0852w.m6185i(this.f3085g, m8658E));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.w$c */
    /* loaded from: classes.dex */
    class RunnableC0855c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3086f;

        /* renamed from: g */
        final /* synthetic */ Map f3087g;

        RunnableC0855c(AbstractC0852w abstractC0852w, ArrayList arrayList, Map map) {
            this.f3086f = arrayList;
            this.f3087g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3086f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3086f.get(i);
                C0252s.m8595u0(view, (String) this.f3087g.get(C0252s.m8658E(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m6190d(List<View> list, View view) {
        int size = list.size();
        if (m6186h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m6186h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m6186h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m6185i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m6182l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo6195A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo6194B(Object obj);

    /* renamed from: a */
    public abstract void mo6193a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo6192b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo6191c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo6189e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m6188f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean m8546a = C0265u.m8546a(viewGroup2);
                viewGroup = viewGroup2;
                if (!m8546a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m6188f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo6187g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m6184j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m8658E = C0252s.m8658E(view);
            if (m8658E != null) {
                map.put(m8658E, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m6184j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m6183k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: m */
    public abstract Object mo6181m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo6180n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m6179o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0252s.m8658E(view));
            C0252s.m8595u0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo6178p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo6177q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo6176r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m6175s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(viewGroup, new RunnableC0855c(this, arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo6174t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo6173u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo6172v(Object obj, View view);

    /* renamed from: w */
    public void mo6171w(Fragment fragment, Object obj, C0144b c0144b, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m6170x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(view, new RunnableC0854b(this, arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m6169y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m8658E = C0252s.m8658E(view2);
            arrayList4.add(m8658E);
            if (m8658E != null) {
                C0252s.m8595u0(view2, null);
                String str = map.get(m8658E);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0252s.m8595u0(arrayList2.get(i2), m8658E);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(view, new RunnableC0853a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo6168z(Object obj, View view, ArrayList<View> arrayList);
}
