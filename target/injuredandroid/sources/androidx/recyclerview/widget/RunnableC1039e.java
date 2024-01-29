package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p000a.p019g.p024g.C0146c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC1039e implements Runnable {

    /* renamed from: j */
    static final ThreadLocal<RunnableC1039e> f3627j = new ThreadLocal<>();

    /* renamed from: k */
    static Comparator<C1042c> f3628k = new C1040a();

    /* renamed from: g */
    long f3630g;

    /* renamed from: h */
    long f3631h;

    /* renamed from: f */
    ArrayList<RecyclerView> f3629f = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C1042c> f3632i = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    static class C1040a implements Comparator<C1042c> {
        C1040a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1042c c1042c, C1042c c1042c2) {
            if ((c1042c.f3640d == null) != (c1042c2.f3640d == null)) {
                return c1042c.f3640d == null ? 1 : -1;
            }
            boolean z = c1042c.f3637a;
            if (z != c1042c2.f3637a) {
                return z ? -1 : 1;
            }
            int i = c1042c2.f3638b - c1042c.f3638b;
            if (i != 0) {
                return i;
            }
            int i2 = c1042c.f3639c - c1042c2.f3639c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public static class C1041b implements RecyclerView.AbstractC0988o.InterfaceC0991c {

        /* renamed from: a */
        int f3633a;

        /* renamed from: b */
        int f3634b;

        /* renamed from: c */
        int[] f3635c;

        /* renamed from: d */
        int f3636d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o.InterfaceC0991c
        /* renamed from: a */
        public void mo5203a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f3636d * 2;
            int[] iArr = this.f3635c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3635c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f3635c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3635c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f3636d++;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m5202b() {
            int[] iArr = this.f3635c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3636d = 0;
        }

        /* renamed from: c */
        void m5201c(RecyclerView recyclerView, boolean z) {
            this.f3636d = 0;
            int[] iArr = this.f3635c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0988o abstractC0988o = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC0988o == null || !abstractC0988o.m5563u0()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.m5308p()) {
                    abstractC0988o.mo5573p(recyclerView.mAdapter.mo2957c(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC0988o.mo5394o(this.f3633a, this.f3634b, recyclerView.mState, this);
            }
            int i = this.f3636d;
            if (i > abstractC0988o.f3419m) {
                abstractC0988o.f3419m = i;
                abstractC0988o.f3420n = z;
                recyclerView.mRecycler.m5522K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m5200d(int i) {
            if (this.f3635c != null) {
                int i2 = this.f3636d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3635c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m5199e(int i, int i2) {
            this.f3633a = i;
            this.f3634b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static class C1042c {

        /* renamed from: a */
        public boolean f3637a;

        /* renamed from: b */
        public int f3638b;

        /* renamed from: c */
        public int f3639c;

        /* renamed from: d */
        public RecyclerView f3640d;

        /* renamed from: e */
        public int f3641e;

        C1042c() {
        }

        /* renamed from: a */
        public void m5198a() {
            this.f3637a = false;
            this.f3638b = 0;
            this.f3639c = 0;
            this.f3640d = null;
            this.f3641e = 0;
        }
    }

    /* renamed from: b */
    private void m5213b() {
        C1042c c1042c;
        int size = this.f3629f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f3629f.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m5201c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f3636d;
            }
        }
        this.f3632i.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f3629f.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1041b c1041b = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(c1041b.f3633a) + Math.abs(c1041b.f3634b);
                for (int i5 = 0; i5 < c1041b.f3636d * 2; i5 += 2) {
                    if (i3 >= this.f3632i.size()) {
                        c1042c = new C1042c();
                        this.f3632i.add(c1042c);
                    } else {
                        c1042c = this.f3632i.get(i3);
                    }
                    int i6 = c1041b.f3635c[i5 + 1];
                    c1042c.f3637a = i6 <= abs;
                    c1042c.f3638b = abs;
                    c1042c.f3639c = i6;
                    c1042c.f3640d = recyclerView2;
                    c1042c.f3641e = c1041b.f3635c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3632i, f3628k);
    }

    /* renamed from: c */
    private void m5212c(C1042c c1042c, long j) {
        RecyclerView.AbstractC0974d0 m5206i = m5206i(c1042c.f3640d, c1042c.f3641e, c1042c.f3637a ? Long.MAX_VALUE : j);
        if (m5206i == null || m5206i.f3377b == null || !m5206i.m5701s() || m5206i.m5700t()) {
            return;
        }
        m5207h(m5206i.f3377b.get(), j);
    }

    /* renamed from: d */
    private void m5211d(long j) {
        for (int i = 0; i < this.f3632i.size(); i++) {
            C1042c c1042c = this.f3632i.get(i);
            if (c1042c.f3640d == null) {
                return;
            }
            m5212c(c1042c, j);
            c1042c.m5198a();
        }
    }

    /* renamed from: e */
    static boolean m5210e(RecyclerView recyclerView, int i) {
        int m5283j = recyclerView.mChildHelper.m5283j();
        for (int i2 = 0; i2 < m5283j; i2++) {
            RecyclerView.AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m5284i(i2));
            if (childViewHolderInt.f3378c == i && !childViewHolderInt.m5700t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m5207h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m5283j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        C1041b c1041b = recyclerView.mPrefetchRegistry;
        c1041b.m5201c(recyclerView, true);
        if (c1041b.f3636d != 0) {
            try {
                C0146c.m8965a("RV Nested Prefetch");
                recyclerView.mState.m5741f(recyclerView.mAdapter);
                for (int i = 0; i < c1041b.f3636d * 2; i += 2) {
                    m5206i(recyclerView, c1041b.f3635c[i], j);
                }
            } finally {
                C0146c.m8964b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC0974d0 m5206i(RecyclerView recyclerView, int i, long j) {
        if (m5210e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1000v c1000v = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC0974d0 m5524I = c1000v.m5524I(i, false, j);
            if (m5524I != null) {
                if (!m5524I.m5701s() || m5524I.m5700t()) {
                    c1000v.m5519a(m5524I, false);
                } else {
                    c1000v.m5531B(m5524I.f3376a);
                }
            }
            return m5524I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void m5214a(RecyclerView recyclerView) {
        this.f3629f.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5209f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3630g == 0) {
            this.f3630g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m5199e(i, i2);
    }

    /* renamed from: g */
    void m5208g(long j) {
        m5213b();
        m5211d(j);
    }

    /* renamed from: j */
    public void m5205j(RecyclerView recyclerView) {
        this.f3629f.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0146c.m8965a("RV Prefetch");
            if (!this.f3629f.isEmpty()) {
                int size = this.f3629f.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3629f.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m5208g(TimeUnit.MILLISECONDS.toNanos(j) + this.f3631h);
                }
            }
        } finally {
            this.f3630g = 0L;
            C0146c.m8964b();
        }
    }
}
