package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.p053v.C0958a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000a.p014d.C0080h;
/* renamed from: androidx.navigation.j */
/* loaded from: classes.dex */
public class C0925j {

    /* renamed from: f */
    private final String f3236f;

    /* renamed from: g */
    private C0927k f3237g;

    /* renamed from: h */
    private int f3238h;

    /* renamed from: i */
    private String f3239i;

    /* renamed from: j */
    private CharSequence f3240j;

    /* renamed from: k */
    private ArrayList<C0920h> f3241k;

    /* renamed from: l */
    private C0080h<C0903c> f3242l;

    /* renamed from: m */
    private HashMap<String, C0904d> f3243m;

    /* renamed from: androidx.navigation.j$a */
    /* loaded from: classes.dex */
    static class C0926a implements Comparable<C0926a> {

        /* renamed from: f */
        private final C0925j f3244f;

        /* renamed from: g */
        private final Bundle f3245g;

        /* renamed from: h */
        private final boolean f3246h;

        /* renamed from: i */
        private final boolean f3247i;

        /* renamed from: j */
        private final int f3248j;

        C0926a(C0925j c0925j, Bundle bundle, boolean z, boolean z2, int i) {
            this.f3244f = c0925j;
            this.f3245g = bundle;
            this.f3246h = z;
            this.f3247i = z2;
            this.f3248j = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(C0926a c0926a) {
            if (!this.f3246h || c0926a.f3246h) {
                if (this.f3246h || !c0926a.f3246h) {
                    if (this.f3245g == null || c0926a.f3245g != null) {
                        if (this.f3245g != null || c0926a.f3245g == null) {
                            Bundle bundle = this.f3245g;
                            if (bundle != null) {
                                int size = bundle.size() - c0926a.f3245g.size();
                                if (size > 0) {
                                    return 1;
                                }
                                if (size < 0) {
                                    return -1;
                                }
                            }
                            if (!this.f3247i || c0926a.f3247i) {
                                if (this.f3247i || !c0926a.f3247i) {
                                    return this.f3248j - c0926a.f3248j;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public C0925j m5951e() {
            return this.f3244f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public Bundle m5950f() {
            return this.f3245g;
        }
    }

    static {
        new HashMap();
    }

    public C0925j(AbstractC0952r<? extends C0925j> abstractC0952r) {
        this(C0955s.m5848c(abstractC0952r.getClass()));
    }

    public C0925j(String str) {
        this.f3236f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static String m5957m(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    /* renamed from: A */
    public final void m5966A(int i) {
        this.f3238h = i;
        this.f3239i = null;
    }

    /* renamed from: B */
    public final void m5965B(CharSequence charSequence) {
        this.f3240j = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final void m5964C(C0927k c0927k) {
        this.f3237g = c0927k;
    }

    /* renamed from: D */
    boolean mo5963D() {
        return true;
    }

    /* renamed from: d */
    public final void m5962d(String str, C0904d c0904d) {
        if (this.f3243m == null) {
            this.f3243m = new HashMap<>();
        }
        this.f3243m.put(str, c0904d);
    }

    /* renamed from: e */
    public final void m5961e(C0920h c0920h) {
        if (this.f3241k == null) {
            this.f3241k = new ArrayList<>();
        }
        this.f3241k.add(c0920h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Bundle m5960f(Bundle bundle) {
        HashMap<String, C0904d> hashMap;
        if (bundle == null && ((hashMap = this.f3243m) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C0904d> hashMap2 = this.f3243m;
        if (hashMap2 != null) {
            for (Map.Entry<String, C0904d> entry : hashMap2.entrySet()) {
                entry.getValue().m6035c(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C0904d> hashMap3 = this.f3243m;
            if (hashMap3 != null) {
                for (Map.Entry<String, C0904d> entry2 : hashMap3.entrySet()) {
                    if (!entry2.getValue().m6034d(entry2.getKey(), bundle2)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().m6037a().mo5865c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int[] m5959g() {
        ArrayDeque arrayDeque = new ArrayDeque();
        C0925j c0925j = this;
        while (true) {
            C0927k m5954w = c0925j.m5954w();
            if (m5954w == null || m5954w.m5945I() != c0925j.m5956s()) {
                arrayDeque.addFirst(c0925j);
            }
            if (m5954w == null) {
                break;
            }
            c0925j = m5954w;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((C0925j) it.next()).m5956s();
            i++;
        }
        return iArr;
    }

    /* renamed from: i */
    public final Map<String, C0904d> m5958i() {
        HashMap<String, C0904d> hashMap = this.f3243m;
        return hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: l */
    public String mo5943l() {
        if (this.f3239i == null) {
            this.f3239i = Integer.toString(this.f3238h);
        }
        return this.f3239i;
    }

    /* renamed from: s */
    public final int m5956s() {
        return this.f3238h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f3239i;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f3238h);
        }
        sb.append(str);
        sb.append(")");
        if (this.f3240j != null) {
            sb.append(" label=");
            sb.append(this.f3240j);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final String m5955u() {
        return this.f3236f;
    }

    /* renamed from: w */
    public final C0927k m5954w() {
        return this.f3237g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C0926a mo5942x(C0924i c0924i) {
        ArrayList<C0920h> arrayList = this.f3241k;
        if (arrayList == null) {
            return null;
        }
        Iterator<C0920h> it = arrayList.iterator();
        C0926a c0926a = null;
        while (it.hasNext()) {
            C0920h next = it.next();
            Uri m5967c = c0924i.m5967c();
            Bundle m5983c = m5967c != null ? next.m5983c(m5967c, m5958i()) : null;
            String m5969a = c0924i.m5969a();
            boolean z = m5969a != null && m5969a.equals(next.m5984b());
            String m5968b = c0924i.m5968b();
            int m5982d = m5968b != null ? next.m5982d(m5968b) : -1;
            if (m5983c != null || z || m5982d > -1) {
                C0926a c0926a2 = new C0926a(this, m5983c, next.m5981e(), z, m5982d);
                if (c0926a == null || c0926a2.compareTo(c0926a) > 0) {
                    c0926a = c0926a2;
                }
            }
        }
        return c0926a;
    }

    /* renamed from: y */
    public void mo5941y(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0958a.Navigator);
        m5966A(obtainAttributes.getResourceId(C0958a.Navigator_android_id, 0));
        this.f3239i = m5957m(context, this.f3238h);
        m5965B(obtainAttributes.getText(C0958a.Navigator_android_label));
        obtainAttributes.recycle();
    }

    /* renamed from: z */
    public final void m5953z(int i, C0903c c0903c) {
        if (mo5963D()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.f3242l == null) {
                this.f3242l = new C0080h<>();
            }
            this.f3242l.m9321i(i, c0903c);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }
}
