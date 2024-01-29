package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000a.p019g.p028k.p029b0.C0217c;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0988o implements RecyclerView.AbstractC1005z.InterfaceC1007b {

    /* renamed from: B */
    private BitSet f3468B;

    /* renamed from: G */
    private boolean f3473G;

    /* renamed from: H */
    private boolean f3474H;

    /* renamed from: I */
    private C1014e f3475I;

    /* renamed from: J */
    private int f3476J;

    /* renamed from: O */
    private int[] f3481O;

    /* renamed from: t */
    C1016f[] f3484t;

    /* renamed from: u */
    AbstractC1048j f3485u;

    /* renamed from: v */
    AbstractC1048j f3486v;

    /* renamed from: w */
    private int f3487w;

    /* renamed from: x */
    private int f3488x;

    /* renamed from: y */
    private final C1043f f3489y;

    /* renamed from: s */
    private int f3483s = -1;

    /* renamed from: z */
    boolean f3490z = false;

    /* renamed from: A */
    boolean f3467A = false;

    /* renamed from: C */
    int f3469C = -1;

    /* renamed from: D */
    int f3470D = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: E */
    C1011d f3471E = new C1011d();

    /* renamed from: F */
    private int f3472F = 2;

    /* renamed from: K */
    private final Rect f3477K = new Rect();

    /* renamed from: L */
    private final C1009b f3478L = new C1009b();

    /* renamed from: M */
    private boolean f3479M = false;

    /* renamed from: N */
    private boolean f3480N = true;

    /* renamed from: P */
    private final Runnable f3482P = new RunnableC1008a();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC1008a implements Runnable {
        RunnableC1008a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m5430S1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C1009b {

        /* renamed from: a */
        int f3492a;

        /* renamed from: b */
        int f3493b;

        /* renamed from: c */
        boolean f3494c;

        /* renamed from: d */
        boolean f3495d;

        /* renamed from: e */
        boolean f3496e;

        /* renamed from: f */
        int[] f3497f;

        C1009b() {
            m5369c();
        }

        /* renamed from: a */
        void m5371a() {
            this.f3493b = this.f3494c ? StaggeredGridLayoutManager.this.f3485u.mo5158i() : StaggeredGridLayoutManager.this.f3485u.mo5154m();
        }

        /* renamed from: b */
        void m5370b(int i) {
            this.f3493b = this.f3494c ? StaggeredGridLayoutManager.this.f3485u.mo5158i() - i : StaggeredGridLayoutManager.this.f3485u.mo5154m() + i;
        }

        /* renamed from: c */
        void m5369c() {
            this.f3492a = -1;
            this.f3493b = RecyclerView.UNDEFINED_DURATION;
            this.f3494c = false;
            this.f3495d = false;
            this.f3496e = false;
            int[] iArr = this.f3497f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m5368d(C1016f[] c1016fArr) {
            int length = c1016fArr.length;
            int[] iArr = this.f3497f;
            if (iArr == null || iArr.length < length) {
                this.f3497f = new int[StaggeredGridLayoutManager.this.f3484t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3497f[i] = c1016fArr[i].m5328p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C1010c extends RecyclerView.C0993p {

        /* renamed from: e */
        C1016f f3499e;

        /* renamed from: f */
        boolean f3500f;

        public C1010c(int i, int i2) {
            super(i, i2);
        }

        public C1010c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1010c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1010c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int m5367e() {
            C1016f c1016f = this.f3499e;
            if (c1016f == null) {
                return -1;
            }
            return c1016f.f3521e;
        }

        /* renamed from: f */
        public boolean m5366f() {
            return this.f3500f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C1011d {

        /* renamed from: a */
        int[] f3501a;

        /* renamed from: b */
        List<C1012a> f3502b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes.dex */
        public static class C1012a implements Parcelable {
            public static final Parcelable.Creator<C1012a> CREATOR = new C1013a();

            /* renamed from: f */
            int f3503f;

            /* renamed from: g */
            int f3504g;

            /* renamed from: h */
            int[] f3505h;

            /* renamed from: i */
            boolean f3506i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            static class C1013a implements Parcelable.Creator<C1012a> {
                C1013a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C1012a createFromParcel(Parcel parcel) {
                    return new C1012a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public C1012a[] newArray(int i) {
                    return new C1012a[i];
                }
            }

            C1012a() {
            }

            C1012a(Parcel parcel) {
                this.f3503f = parcel.readInt();
                this.f3504g = parcel.readInt();
                this.f3506i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3505h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m5350a(int i) {
                int[] iArr = this.f3505h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3503f + ", mGapDir=" + this.f3504g + ", mHasUnwantedGapAfter=" + this.f3506i + ", mGapPerSpan=" + Arrays.toString(this.f3505h) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3503f);
                parcel.writeInt(this.f3504g);
                parcel.writeInt(this.f3506i ? 1 : 0);
                int[] iArr = this.f3505h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3505h);
            }
        }

        C1011d() {
        }

        /* renamed from: i */
        private int m5357i(int i) {
            if (this.f3502b == null) {
                return -1;
            }
            C1012a m5360f = m5360f(i);
            if (m5360f != null) {
                this.f3502b.remove(m5360f);
            }
            int size = this.f3502b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3502b.get(i2).f3503f >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.f3502b.remove(i2);
                return this.f3502b.get(i2).f3503f;
            }
            return -1;
        }

        /* renamed from: l */
        private void m5354l(int i, int i2) {
            List<C1012a> list = this.f3502b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1012a c1012a = this.f3502b.get(size);
                int i3 = c1012a.f3503f;
                if (i3 >= i) {
                    c1012a.f3503f = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        private void m5353m(int i, int i2) {
            List<C1012a> list = this.f3502b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                C1012a c1012a = this.f3502b.get(size);
                int i4 = c1012a.f3503f;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f3502b.remove(size);
                    } else {
                        c1012a.f3503f = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m5365a(C1012a c1012a) {
            if (this.f3502b == null) {
                this.f3502b = new ArrayList();
            }
            int size = this.f3502b.size();
            for (int i = 0; i < size; i++) {
                C1012a c1012a2 = this.f3502b.get(i);
                if (c1012a2.f3503f == c1012a.f3503f) {
                    this.f3502b.remove(i);
                }
                if (c1012a2.f3503f >= c1012a.f3503f) {
                    this.f3502b.add(i, c1012a);
                    return;
                }
            }
            this.f3502b.add(c1012a);
        }

        /* renamed from: b */
        void m5364b() {
            int[] iArr = this.f3501a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3502b = null;
        }

        /* renamed from: c */
        void m5363c(int i) {
            int[] iArr = this.f3501a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f3501a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m5351o(i)];
                this.f3501a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3501a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m5362d(int i) {
            List<C1012a> list = this.f3502b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3502b.get(size).f3503f >= i) {
                        this.f3502b.remove(size);
                    }
                }
            }
            return m5358h(i);
        }

        /* renamed from: e */
        public C1012a m5361e(int i, int i2, int i3, boolean z) {
            List<C1012a> list = this.f3502b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1012a c1012a = this.f3502b.get(i4);
                int i5 = c1012a.f3503f;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c1012a.f3504g == i3 || (z && c1012a.f3506i))) {
                    return c1012a;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1012a m5360f(int i) {
            List<C1012a> list = this.f3502b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1012a c1012a = this.f3502b.get(size);
                if (c1012a.f3503f == i) {
                    return c1012a;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m5359g(int i) {
            int[] iArr = this.f3501a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        int m5358h(int i) {
            int[] iArr = this.f3501a;
            if (iArr != null && i < iArr.length) {
                int m5357i = m5357i(i);
                if (m5357i == -1) {
                    int[] iArr2 = this.f3501a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f3501a.length;
                }
                int i2 = m5357i + 1;
                Arrays.fill(this.f3501a, i, i2, -1);
                return i2;
            }
            return -1;
        }

        /* renamed from: j */
        void m5356j(int i, int i2) {
            int[] iArr = this.f3501a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m5363c(i3);
            int[] iArr2 = this.f3501a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f3501a, i, i3, -1);
            m5354l(i, i2);
        }

        /* renamed from: k */
        void m5355k(int i, int i2) {
            int[] iArr = this.f3501a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m5363c(i3);
            int[] iArr2 = this.f3501a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f3501a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m5353m(i, i2);
        }

        /* renamed from: n */
        void m5352n(int i, C1016f c1016f) {
            m5363c(i);
            this.f3501a[i] = c1016f.f3521e;
        }

        /* renamed from: o */
        int m5351o(int i) {
            int length = this.f3501a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes.dex */
    public static class C1014e implements Parcelable {
        public static final Parcelable.Creator<C1014e> CREATOR = new C1015a();

        /* renamed from: f */
        int f3507f;

        /* renamed from: g */
        int f3508g;

        /* renamed from: h */
        int f3509h;

        /* renamed from: i */
        int[] f3510i;

        /* renamed from: j */
        int f3511j;

        /* renamed from: k */
        int[] f3512k;

        /* renamed from: l */
        List<C1011d.C1012a> f3513l;

        /* renamed from: m */
        boolean f3514m;

        /* renamed from: n */
        boolean f3515n;

        /* renamed from: o */
        boolean f3516o;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes.dex */
        static class C1015a implements Parcelable.Creator<C1014e> {
            C1015a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1014e createFromParcel(Parcel parcel) {
                return new C1014e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1014e[] newArray(int i) {
                return new C1014e[i];
            }
        }

        public C1014e() {
        }

        C1014e(Parcel parcel) {
            this.f3507f = parcel.readInt();
            this.f3508g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3509h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3510i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3511j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3512k = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3514m = parcel.readInt() == 1;
            this.f3515n = parcel.readInt() == 1;
            this.f3516o = parcel.readInt() == 1;
            this.f3513l = parcel.readArrayList(C1011d.C1012a.class.getClassLoader());
        }

        public C1014e(C1014e c1014e) {
            this.f3509h = c1014e.f3509h;
            this.f3507f = c1014e.f3507f;
            this.f3508g = c1014e.f3508g;
            this.f3510i = c1014e.f3510i;
            this.f3511j = c1014e.f3511j;
            this.f3512k = c1014e.f3512k;
            this.f3514m = c1014e.f3514m;
            this.f3515n = c1014e.f3515n;
            this.f3516o = c1014e.f3516o;
            this.f3513l = c1014e.f3513l;
        }

        /* renamed from: a */
        void m5347a() {
            this.f3510i = null;
            this.f3509h = 0;
            this.f3507f = -1;
            this.f3508g = -1;
        }

        /* renamed from: b */
        void m5346b() {
            this.f3510i = null;
            this.f3509h = 0;
            this.f3511j = 0;
            this.f3512k = null;
            this.f3513l = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3507f);
            parcel.writeInt(this.f3508g);
            parcel.writeInt(this.f3509h);
            if (this.f3509h > 0) {
                parcel.writeIntArray(this.f3510i);
            }
            parcel.writeInt(this.f3511j);
            if (this.f3511j > 0) {
                parcel.writeIntArray(this.f3512k);
            }
            parcel.writeInt(this.f3514m ? 1 : 0);
            parcel.writeInt(this.f3515n ? 1 : 0);
            parcel.writeInt(this.f3516o ? 1 : 0);
            parcel.writeList(this.f3513l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes.dex */
    public class C1016f {

        /* renamed from: a */
        ArrayList<View> f3517a = new ArrayList<>();

        /* renamed from: b */
        int f3518b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        int f3519c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        int f3520d = 0;

        /* renamed from: e */
        final int f3521e;

        C1016f(int i) {
            this.f3521e = i;
        }

        /* renamed from: a */
        void m5343a(View view) {
            C1010c m5330n = m5330n(view);
            m5330n.f3499e = this;
            this.f3517a.add(view);
            this.f3519c = RecyclerView.UNDEFINED_DURATION;
            if (this.f3517a.size() == 1) {
                this.f3518b = RecyclerView.UNDEFINED_DURATION;
            }
            if (m5330n.m5548c() || m5330n.m5549b()) {
                this.f3520d += StaggeredGridLayoutManager.this.f3485u.mo5162e(view);
            }
        }

        /* renamed from: b */
        void m5342b(boolean z, int i) {
            int m5332l = z ? m5332l(RecyclerView.UNDEFINED_DURATION) : m5328p(RecyclerView.UNDEFINED_DURATION);
            m5339e();
            if (m5332l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m5332l >= StaggeredGridLayoutManager.this.f3485u.mo5158i()) {
                if (z || m5332l <= StaggeredGridLayoutManager.this.f3485u.mo5154m()) {
                    if (i != Integer.MIN_VALUE) {
                        m5332l += i;
                    }
                    this.f3519c = m5332l;
                    this.f3518b = m5332l;
                }
            }
        }

        /* renamed from: c */
        void m5341c() {
            C1011d.C1012a m5360f;
            ArrayList<View> arrayList = this.f3517a;
            View view = arrayList.get(arrayList.size() - 1);
            C1010c m5330n = m5330n(view);
            this.f3519c = StaggeredGridLayoutManager.this.f3485u.mo5163d(view);
            if (m5330n.f3500f && (m5360f = StaggeredGridLayoutManager.this.f3471E.m5360f(m5330n.m5550a())) != null && m5360f.f3504g == 1) {
                this.f3519c += m5360f.m5350a(this.f3521e);
            }
        }

        /* renamed from: d */
        void m5340d() {
            C1011d.C1012a m5360f;
            View view = this.f3517a.get(0);
            C1010c m5330n = m5330n(view);
            this.f3518b = StaggeredGridLayoutManager.this.f3485u.mo5160g(view);
            if (m5330n.f3500f && (m5360f = StaggeredGridLayoutManager.this.f3471E.m5360f(m5330n.m5550a())) != null && m5360f.f3504g == -1) {
                this.f3518b -= m5360f.m5350a(this.f3521e);
            }
        }

        /* renamed from: e */
        void m5339e() {
            this.f3517a.clear();
            m5327q();
            this.f3520d = 0;
        }

        /* renamed from: f */
        public int m5338f() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f3490z) {
                i = this.f3517a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f3517a.size();
            }
            return m5335i(i, size, true);
        }

        /* renamed from: g */
        public int m5337g() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f3490z) {
                size = 0;
                i = this.f3517a.size();
            } else {
                size = this.f3517a.size() - 1;
                i = -1;
            }
            return m5335i(size, i, true);
        }

        /* renamed from: h */
        int m5336h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int mo5154m = StaggeredGridLayoutManager.this.f3485u.mo5154m();
            int mo5158i = StaggeredGridLayoutManager.this.f3485u.mo5158i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3517a.get(i);
                int mo5160g = StaggeredGridLayoutManager.this.f3485u.mo5160g(view);
                int mo5163d = StaggeredGridLayoutManager.this.f3485u.mo5163d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo5160g >= mo5158i : mo5160g > mo5158i;
                if (!z3 ? mo5163d > mo5154m : mo5163d >= mo5154m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && mo5160g >= mo5154m && mo5163d <= mo5158i) {
                        }
                        return StaggeredGridLayoutManager.this.m5591h0(view);
                    } else if (mo5160g >= mo5154m && mo5163d <= mo5158i) {
                        return StaggeredGridLayoutManager.this.m5591h0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        int m5335i(int i, int i2, boolean z) {
            return m5336h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m5334j() {
            return this.f3520d;
        }

        /* renamed from: k */
        int m5333k() {
            int i = this.f3519c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m5341c();
            return this.f3519c;
        }

        /* renamed from: l */
        int m5332l(int i) {
            int i2 = this.f3519c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3517a.size() == 0) {
                return i;
            }
            m5341c();
            return this.f3519c;
        }

        /* renamed from: m */
        public View m5331m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3517a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3517a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3490z && staggeredGridLayoutManager.m5591h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3490z && staggeredGridLayoutManager2.m5591h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3517a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3517a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3490z && staggeredGridLayoutManager3.m5591h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3490z && staggeredGridLayoutManager4.m5591h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C1010c m5330n(View view) {
            return (C1010c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m5329o() {
            int i = this.f3518b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m5340d();
            return this.f3518b;
        }

        /* renamed from: p */
        int m5328p(int i) {
            int i2 = this.f3518b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3517a.size() == 0) {
                return i;
            }
            m5340d();
            return this.f3518b;
        }

        /* renamed from: q */
        void m5327q() {
            this.f3518b = RecyclerView.UNDEFINED_DURATION;
            this.f3519c = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: r */
        void m5326r(int i) {
            int i2 = this.f3518b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3518b = i2 + i;
            }
            int i3 = this.f3519c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3519c = i3 + i;
            }
        }

        /* renamed from: s */
        void m5325s() {
            int size = this.f3517a.size();
            View remove = this.f3517a.remove(size - 1);
            C1010c m5330n = m5330n(remove);
            m5330n.f3499e = null;
            if (m5330n.m5548c() || m5330n.m5549b()) {
                this.f3520d -= StaggeredGridLayoutManager.this.f3485u.mo5162e(remove);
            }
            if (size == 1) {
                this.f3518b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f3519c = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: t */
        void m5324t() {
            View remove = this.f3517a.remove(0);
            C1010c m5330n = m5330n(remove);
            m5330n.f3499e = null;
            if (this.f3517a.size() == 0) {
                this.f3519c = RecyclerView.UNDEFINED_DURATION;
            }
            if (m5330n.m5548c() || m5330n.m5549b()) {
                this.f3520d -= StaggeredGridLayoutManager.this.f3485u.mo5162e(remove);
            }
            this.f3518b = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: u */
        void m5323u(View view) {
            C1010c m5330n = m5330n(view);
            m5330n.f3499e = this;
            this.f3517a.add(0, view);
            this.f3518b = RecyclerView.UNDEFINED_DURATION;
            if (this.f3517a.size() == 1) {
                this.f3519c = RecyclerView.UNDEFINED_DURATION;
            }
            if (m5330n.m5548c() || m5330n.m5549b()) {
                this.f3520d += StaggeredGridLayoutManager.this.f3485u.mo5162e(view);
            }
        }

        /* renamed from: v */
        void m5322v(int i) {
            this.f3518b = i;
            this.f3519c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC0988o.C0992d m5588i0 = RecyclerView.AbstractC0988o.m5588i0(context, attributeSet, i, i2);
        m5455H2(m5588i0.f3427a);
        m5451J2(m5588i0.f3428b);
        m5453I2(m5588i0.f3429c);
        this.f3489y = new C1043f();
        m5416a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r4.f3646e == (-1)) goto L9;
     */
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5468A2(androidx.recyclerview.widget.RecyclerView.C1000v r3, androidx.recyclerview.widget.C1043f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3642a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f3650i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f3643b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f3646e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f3648g
        L14:
            r2.m5467B2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f3647f
        L1a:
            r2.m5464C2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f3646e
            if (r0 != r1) goto L37
            int r0 = r4.f3647f
            int r1 = r2.m5396m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f3648g
            int r4 = r4.f3643b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f3648g
            int r0 = r2.m5395n2(r0)
            int r1 = r4.f3648g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f3647f
            int r4 = r4.f3643b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5468A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    /* renamed from: B2 */
    private void m5467B2(RecyclerView.C1000v c1000v, int i) {
        for (int m5633J = m5633J() - 1; m5633J >= 0; m5633J--) {
            View m5634I = m5634I(m5633J);
            if (this.f3485u.mo5160g(m5634I) < i || this.f3485u.mo5151q(m5634I) < i) {
                return;
            }
            C1010c c1010c = (C1010c) m5634I.getLayoutParams();
            if (c1010c.f3500f) {
                for (int i2 = 0; i2 < this.f3483s; i2++) {
                    if (this.f3484t[i2].f3517a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3483s; i3++) {
                    this.f3484t[i3].m5325s();
                }
            } else if (c1010c.f3499e.f3517a.size() == 1) {
                return;
            } else {
                c1010c.f3499e.m5325s();
            }
            m5579m1(m5634I, c1000v);
        }
    }

    /* renamed from: C2 */
    private void m5464C2(RecyclerView.C1000v c1000v, int i) {
        while (m5633J() > 0) {
            View m5634I = m5634I(0);
            if (this.f3485u.mo5163d(m5634I) > i || this.f3485u.mo5152p(m5634I) > i) {
                return;
            }
            C1010c c1010c = (C1010c) m5634I.getLayoutParams();
            if (c1010c.f3500f) {
                for (int i2 = 0; i2 < this.f3483s; i2++) {
                    if (this.f3484t[i2].f3517a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f3483s; i3++) {
                    this.f3484t[i3].m5324t();
                }
            } else if (c1010c.f3499e.f3517a.size() == 1) {
                return;
            } else {
                c1010c.f3499e.m5324t();
            }
            m5579m1(m5634I, c1000v);
        }
    }

    /* renamed from: D2 */
    private void m5461D2() {
        if (this.f3486v.mo5156k() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int m5633J = m5633J();
        for (int i = 0; i < m5633J; i++) {
            View m5634I = m5634I(i);
            float mo5162e = this.f3486v.mo5162e(m5634I);
            if (mo5162e >= f) {
                if (((C1010c) m5634I.getLayoutParams()).m5366f()) {
                    mo5162e = (mo5162e * 1.0f) / this.f3483s;
                }
                f = Math.max(f, mo5162e);
            }
        }
        int i2 = this.f3488x;
        int round = Math.round(f * this.f3483s);
        if (this.f3486v.mo5156k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f3486v.mo5153n());
        }
        m5437P2(round);
        if (this.f3488x == i2) {
            return;
        }
        for (int i3 = 0; i3 < m5633J; i3++) {
            View m5634I2 = m5634I(i3);
            C1010c c1010c = (C1010c) m5634I2.getLayoutParams();
            if (!c1010c.f3500f) {
                if (m5383t2() && this.f3487w == 1) {
                    int i4 = this.f3483s;
                    int i5 = c1010c.f3499e.f3521e;
                    m5634I2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f3488x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c1010c.f3499e.f3521e;
                    int i7 = this.f3487w;
                    int i8 = (this.f3488x * i6) - (i6 * i2);
                    if (i7 == 1) {
                        m5634I2.offsetLeftAndRight(i8);
                    } else {
                        m5634I2.offsetTopAndBottom(i8);
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    private void m5459E2() {
        this.f3467A = (this.f3487w == 1 || !m5383t2()) ? this.f3490z : !this.f3490z;
    }

    /* renamed from: G2 */
    private void m5456G2(int i) {
        C1043f c1043f = this.f3489y;
        c1043f.f3646e = i;
        c1043f.f3645d = this.f3467A != (i == -1) ? -1 : 1;
    }

    /* renamed from: K2 */
    private void m5449K2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3483s; i3++) {
            if (!this.f3484t[i3].f3517a.isEmpty()) {
                m5435Q2(this.f3484t[i3], i, i2);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m5447L2(RecyclerView.C0968a0 c0968a0, C1009b c1009b) {
        boolean z = this.f3473G;
        int m5745b = c0968a0.m5745b();
        c1009b.f3492a = z ? m5406g2(m5745b) : m5413c2(m5745b);
        c1009b.f3493b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* renamed from: M1 */
    private void m5446M1(View view) {
        for (int i = this.f3483s - 1; i >= 0; i--) {
            this.f3484t[i].m5343a(view);
        }
    }

    /* renamed from: N1 */
    private void m5443N1(C1009b c1009b) {
        boolean z;
        C1014e c1014e = this.f3475I;
        int i = c1014e.f3509h;
        if (i > 0) {
            if (i == this.f3483s) {
                for (int i2 = 0; i2 < this.f3483s; i2++) {
                    this.f3484t[i2].m5339e();
                    C1014e c1014e2 = this.f3475I;
                    int i3 = c1014e2.f3510i[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += c1014e2.f3515n ? this.f3485u.mo5158i() : this.f3485u.mo5154m();
                    }
                    this.f3484t[i2].m5322v(i3);
                }
            } else {
                c1014e.m5346b();
                C1014e c1014e3 = this.f3475I;
                c1014e3.f3507f = c1014e3.f3508g;
            }
        }
        C1014e c1014e4 = this.f3475I;
        this.f3474H = c1014e4.f3516o;
        m5453I2(c1014e4.f3514m);
        m5459E2();
        C1014e c1014e5 = this.f3475I;
        int i4 = c1014e5.f3507f;
        if (i4 != -1) {
            this.f3469C = i4;
            z = c1014e5.f3515n;
        } else {
            z = this.f3467A;
        }
        c1009b.f3494c = z;
        C1014e c1014e6 = this.f3475I;
        if (c1014e6.f3511j > 1) {
            C1011d c1011d = this.f3471E;
            c1011d.f3501a = c1014e6.f3512k;
            c1011d.f3502b = c1014e6.f3513l;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: O2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5440O2(int r5, androidx.recyclerview.widget.RecyclerView.C0968a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3489y
            r1 = 0
            r0.f3643b = r1
            r0.f3644c = r5
            boolean r0 = r4.m5556x0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m5744c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f3467A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.j r5 = r4.f3485u
            int r5 = r5.mo5153n()
            goto L2f
        L25:
            androidx.recyclerview.widget.j r5 = r4.f3485u
            int r5 = r5.mo5153n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.m5627M()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f3489y
            androidx.recyclerview.widget.j r3 = r4.f3485u
            int r3 = r3.mo5154m()
            int r3 = r3 - r6
            r0.f3647f = r3
            androidx.recyclerview.widget.f r6 = r4.f3489y
            androidx.recyclerview.widget.j r0 = r4.f3485u
            int r0 = r0.mo5158i()
            int r0 = r0 + r5
            r6.f3648g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f3489y
            androidx.recyclerview.widget.j r3 = r4.f3485u
            int r3 = r3.mo5159h()
            int r3 = r3 + r5
            r0.f3648g = r3
            androidx.recyclerview.widget.f r5 = r4.f3489y
            int r6 = -r6
            r5.f3647f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f3489y
            r5.f3649h = r1
            r5.f3642a = r2
            androidx.recyclerview.widget.j r6 = r4.f3485u
            int r6 = r6.mo5156k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.j r6 = r4.f3485u
            int r6 = r6.mo5159h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f3650i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5440O2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: Q1 */
    private void m5436Q1(View view, C1010c c1010c, C1043f c1043f) {
        if (c1043f.f3646e == 1) {
            if (c1010c.f3500f) {
                m5446M1(view);
            } else {
                c1010c.f3499e.m5343a(view);
            }
        } else if (c1010c.f3500f) {
            m5372z2(view);
        } else {
            c1010c.f3499e.m5323u(view);
        }
    }

    /* renamed from: Q2 */
    private void m5435Q2(C1016f c1016f, int i, int i2) {
        int m5334j = c1016f.m5334j();
        if (i == -1) {
            if (c1016f.m5329o() + m5334j > i2) {
                return;
            }
        } else if (c1016f.m5333k() - m5334j < i2) {
            return;
        }
        this.f3468B.set(c1016f.f3521e, false);
    }

    /* renamed from: R1 */
    private int m5433R1(int i) {
        if (m5633J() == 0) {
            return this.f3467A ? 1 : -1;
        }
        return (i < m5403j2()) != this.f3467A ? -1 : 1;
    }

    /* renamed from: R2 */
    private int m5432R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: T1 */
    private boolean m5428T1(C1016f c1016f) {
        if (this.f3467A) {
            if (c1016f.m5333k() < this.f3485u.mo5158i()) {
                ArrayList<View> arrayList = c1016f.f3517a;
                return !c1016f.m5330n(arrayList.get(arrayList.size() - 1)).f3500f;
            }
        } else if (c1016f.m5329o() > this.f3485u.mo5154m()) {
            return !c1016f.m5330n(c1016f.f3517a.get(0)).f3500f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m5426U1(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0) {
            return 0;
        }
        return C1053l.m5140a(c0968a0, this.f3485u, m5409e2(!this.f3480N), m5411d2(!this.f3480N), this, this.f3480N);
    }

    /* renamed from: V1 */
    private int m5425V1(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0) {
            return 0;
        }
        return C1053l.m5139b(c0968a0, this.f3485u, m5409e2(!this.f3480N), m5411d2(!this.f3480N), this, this.f3480N, this.f3467A);
    }

    /* renamed from: W1 */
    private int m5423W1(RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0) {
            return 0;
        }
        return C1053l.m5138c(c0968a0, this.f3485u, m5409e2(!this.f3480N), m5411d2(!this.f3480N), this, this.f3480N);
    }

    /* renamed from: X1 */
    private int m5421X1(int i) {
        if (i == 1) {
            return (this.f3487w != 1 && m5383t2()) ? 1 : -1;
        } else if (i == 2) {
            return (this.f3487w != 1 && m5383t2()) ? -1 : 1;
        } else if (i == 17) {
            if (this.f3487w == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 33) {
            if (this.f3487w == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 66) {
            if (this.f3487w == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 130 && this.f3487w == 1) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: Y1 */
    private C1011d.C1012a m5419Y1(int i) {
        C1011d.C1012a c1012a = new C1011d.C1012a();
        c1012a.f3505h = new int[this.f3483s];
        for (int i2 = 0; i2 < this.f3483s; i2++) {
            c1012a.f3505h[i2] = i - this.f3484t[i2].m5332l(i);
        }
        return c1012a;
    }

    /* renamed from: Z1 */
    private C1011d.C1012a m5418Z1(int i) {
        C1011d.C1012a c1012a = new C1011d.C1012a();
        c1012a.f3505h = new int[this.f3483s];
        for (int i2 = 0; i2 < this.f3483s; i2++) {
            c1012a.f3505h[i2] = this.f3484t[i2].m5328p(i) - i;
        }
        return c1012a;
    }

    /* renamed from: a2 */
    private void m5416a2() {
        this.f3485u = AbstractC1048j.m5167b(this, this.f3487w);
        this.f3486v = AbstractC1048j.m5167b(this, 1 - this.f3487w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: b2 */
    private int m5415b2(RecyclerView.C1000v c1000v, C1043f c1043f, RecyclerView.C0968a0 c0968a0) {
        int i;
        C1016f c1016f;
        int mo5162e;
        int i2;
        int i3;
        int mo5162e2;
        RecyclerView.AbstractC0988o abstractC0988o;
        View view;
        int i4;
        int i5;
        ?? r9 = 0;
        this.f3468B.set(0, this.f3483s, true);
        if (this.f3489y.f3650i) {
            i = c1043f.f3646e == 1 ? Reader.READ_DONE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = c1043f.f3646e == 1 ? c1043f.f3648g + c1043f.f3643b : c1043f.f3647f - c1043f.f3643b;
        }
        m5449K2(c1043f.f3646e, i);
        int mo5158i = this.f3467A ? this.f3485u.mo5158i() : this.f3485u.mo5154m();
        boolean z = false;
        while (c1043f.m5197a(c0968a0) && (this.f3489y.f3650i || !this.f3468B.isEmpty())) {
            View m5196b = c1043f.m5196b(c1000v);
            C1010c c1010c = (C1010c) m5196b.getLayoutParams();
            int m5550a = c1010c.m5550a();
            int m5359g = this.f3471E.m5359g(m5550a);
            boolean z2 = m5359g == -1;
            if (z2) {
                c1016f = c1010c.f3500f ? this.f3484t[r9] : m5392p2(c1043f);
                this.f3471E.m5352n(m5550a, c1016f);
            } else {
                c1016f = this.f3484t[m5359g];
            }
            C1016f c1016f2 = c1016f;
            c1010c.f3499e = c1016f2;
            if (c1043f.f3646e == 1) {
                m5601d(m5196b);
            } else {
                m5599e(m5196b, r9);
            }
            m5379v2(m5196b, c1010c, r9);
            if (c1043f.f3646e == 1) {
                int m5398l2 = c1010c.f3500f ? m5398l2(mo5158i) : c1016f2.m5332l(mo5158i);
                int mo5162e3 = this.f3485u.mo5162e(m5196b) + m5398l2;
                if (z2 && c1010c.f3500f) {
                    C1011d.C1012a m5419Y1 = m5419Y1(m5398l2);
                    m5419Y1.f3504g = -1;
                    m5419Y1.f3503f = m5550a;
                    this.f3471E.m5365a(m5419Y1);
                }
                i2 = mo5162e3;
                mo5162e = m5398l2;
            } else {
                int m5393o2 = c1010c.f3500f ? m5393o2(mo5158i) : c1016f2.m5328p(mo5158i);
                mo5162e = m5393o2 - this.f3485u.mo5162e(m5196b);
                if (z2 && c1010c.f3500f) {
                    C1011d.C1012a m5418Z1 = m5418Z1(m5393o2);
                    m5418Z1.f3504g = 1;
                    m5418Z1.f3503f = m5550a;
                    this.f3471E.m5365a(m5418Z1);
                }
                i2 = m5393o2;
            }
            if (c1010c.f3500f && c1043f.f3645d == -1) {
                if (!z2) {
                    if (!(c1043f.f3646e == 1 ? m5441O1() : m5438P1())) {
                        C1011d.C1012a m5360f = this.f3471E.m5360f(m5550a);
                        if (m5360f != null) {
                            m5360f.f3506i = true;
                        }
                    }
                }
                this.f3479M = true;
            }
            m5436Q1(m5196b, c1010c, c1043f);
            if (m5383t2() && this.f3487w == 1) {
                int mo5158i2 = c1010c.f3500f ? this.f3486v.mo5158i() : this.f3486v.mo5158i() - (((this.f3483s - 1) - c1016f2.f3521e) * this.f3488x);
                mo5162e2 = mo5158i2;
                i3 = mo5158i2 - this.f3486v.mo5162e(m5196b);
            } else {
                int mo5154m = c1010c.f3500f ? this.f3486v.mo5154m() : (c1016f2.f3521e * this.f3488x) + this.f3486v.mo5154m();
                i3 = mo5154m;
                mo5162e2 = this.f3486v.mo5162e(m5196b) + mo5154m;
            }
            if (this.f3487w == 1) {
                abstractC0988o = this;
                view = m5196b;
                i4 = i3;
                i3 = mo5162e;
                i5 = mo5162e2;
            } else {
                abstractC0988o = this;
                view = m5196b;
                i4 = mo5162e;
                i5 = i2;
                i2 = mo5162e2;
            }
            abstractC0988o.m5552z0(view, i4, i3, i5, i2);
            if (c1010c.f3500f) {
                m5449K2(this.f3489y.f3646e, i);
            } else {
                m5435Q2(c1016f2, this.f3489y.f3646e, i);
            }
            m5468A2(c1000v, this.f3489y);
            if (this.f3489y.f3649h && m5196b.hasFocusable()) {
                if (c1010c.f3500f) {
                    this.f3468B.clear();
                } else {
                    this.f3468B.set(c1016f2.f3521e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m5468A2(c1000v, this.f3489y);
        }
        int mo5154m2 = this.f3489y.f3646e == -1 ? this.f3485u.mo5154m() - m5393o2(this.f3485u.mo5154m()) : m5398l2(this.f3485u.mo5158i()) - this.f3485u.mo5158i();
        if (mo5154m2 > 0) {
            return Math.min(c1043f.f3643b, mo5154m2);
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m5413c2(int i) {
        int m5633J = m5633J();
        for (int i2 = 0; i2 < m5633J; i2++) {
            int m5591h0 = m5591h0(m5634I(i2));
            if (m5591h0 >= 0 && m5591h0 < i) {
                return m5591h0;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m5406g2(int i) {
        for (int m5633J = m5633J() - 1; m5633J >= 0; m5633J--) {
            int m5591h0 = m5591h0(m5634I(m5633J));
            if (m5591h0 >= 0 && m5591h0 < i) {
                return m5591h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private void m5405h2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, boolean z) {
        int mo5158i;
        int m5398l2 = m5398l2(RecyclerView.UNDEFINED_DURATION);
        if (m5398l2 != Integer.MIN_VALUE && (mo5158i = this.f3485u.mo5158i() - m5398l2) > 0) {
            int i = mo5158i - (-m5457F2(-mo5158i, c1000v, c0968a0));
            if (!z || i <= 0) {
                return;
            }
            this.f3485u.mo5150r(i);
        }
    }

    /* renamed from: i2 */
    private void m5404i2(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, boolean z) {
        int mo5154m;
        int m5393o2 = m5393o2(Reader.READ_DONE);
        if (m5393o2 != Integer.MAX_VALUE && (mo5154m = m5393o2 - this.f3485u.mo5154m()) > 0) {
            int m5457F2 = mo5154m - m5457F2(mo5154m, c1000v, c0968a0);
            if (!z || m5457F2 <= 0) {
                return;
            }
            this.f3485u.mo5150r(-m5457F2);
        }
    }

    /* renamed from: l2 */
    private int m5398l2(int i) {
        int m5332l = this.f3484t[0].m5332l(i);
        for (int i2 = 1; i2 < this.f3483s; i2++) {
            int m5332l2 = this.f3484t[i2].m5332l(i);
            if (m5332l2 > m5332l) {
                m5332l = m5332l2;
            }
        }
        return m5332l;
    }

    /* renamed from: m2 */
    private int m5396m2(int i) {
        int m5328p = this.f3484t[0].m5328p(i);
        for (int i2 = 1; i2 < this.f3483s; i2++) {
            int m5328p2 = this.f3484t[i2].m5328p(i);
            if (m5328p2 > m5328p) {
                m5328p = m5328p2;
            }
        }
        return m5328p;
    }

    /* renamed from: n2 */
    private int m5395n2(int i) {
        int m5332l = this.f3484t[0].m5332l(i);
        for (int i2 = 1; i2 < this.f3483s; i2++) {
            int m5332l2 = this.f3484t[i2].m5332l(i);
            if (m5332l2 < m5332l) {
                m5332l = m5332l2;
            }
        }
        return m5332l;
    }

    /* renamed from: o2 */
    private int m5393o2(int i) {
        int m5328p = this.f3484t[0].m5328p(i);
        for (int i2 = 1; i2 < this.f3483s; i2++) {
            int m5328p2 = this.f3484t[i2].m5328p(i);
            if (m5328p2 < m5328p) {
                m5328p = m5328p2;
            }
        }
        return m5328p;
    }

    /* renamed from: p2 */
    private C1016f m5392p2(C1043f c1043f) {
        int i;
        int i2;
        int i3 = -1;
        if (m5375x2(c1043f.f3646e)) {
            i = this.f3483s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f3483s;
            i2 = 1;
        }
        C1016f c1016f = null;
        if (c1043f.f3646e == 1) {
            int i4 = Reader.READ_DONE;
            int mo5154m = this.f3485u.mo5154m();
            while (i != i3) {
                C1016f c1016f2 = this.f3484t[i];
                int m5332l = c1016f2.m5332l(mo5154m);
                if (m5332l < i4) {
                    c1016f = c1016f2;
                    i4 = m5332l;
                }
                i += i2;
            }
            return c1016f;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int mo5158i = this.f3485u.mo5158i();
        while (i != i3) {
            C1016f c1016f3 = this.f3484t[i];
            int m5328p = c1016f3.m5328p(mo5158i);
            if (m5328p > i5) {
                c1016f = c1016f3;
                i5 = m5328p;
            }
            i += i2;
        }
        return c1016f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5390q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3467A
            if (r0 == 0) goto L9
            int r0 = r6.m5400k2()
            goto Ld
        L9:
            int r0 = r6.m5403j2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3471E
            r4.m5358h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3471E
            r9.m5355k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3471E
            r7.m5356j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3471E
            r9.m5355k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3471E
            r9.m5356j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f3467A
            if (r7 == 0) goto L4d
            int r7 = r6.m5403j2()
            goto L51
        L4d:
            int r7 = r6.m5400k2()
        L51:
            if (r3 > r7) goto L56
            r6.m5564t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5390q2(int, int, int):void");
    }

    /* renamed from: u2 */
    private void m5381u2(View view, int i, int i2, boolean z) {
        m5586j(view, this.f3477K);
        C1010c c1010c = (C1010c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1010c).leftMargin;
        Rect rect = this.f3477K;
        int m5432R2 = m5432R2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c1010c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c1010c).topMargin;
        Rect rect2 = this.f3477K;
        int m5432R22 = m5432R2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c1010c).bottomMargin + rect2.bottom);
        if (z ? m5635H1(view, m5432R2, m5432R22, c1010c) : m5641F1(view, m5432R2, m5432R22, c1010c)) {
            view.measure(m5432R2, m5432R22);
        }
    }

    /* renamed from: v2 */
    private void m5379v2(View view, C1010c c1010c, boolean z) {
        int m5631K;
        int m5631K2;
        if (c1010c.f3500f) {
            if (this.f3487w != 1) {
                m5381u2(view, RecyclerView.AbstractC0988o.m5631K(m5575o0(), m5572p0(), m5598e0() + m5596f0(), ((ViewGroup.MarginLayoutParams) c1010c).width, true), this.f3476J, z);
                return;
            }
            m5631K = this.f3476J;
        } else if (this.f3487w != 1) {
            m5631K = RecyclerView.AbstractC0988o.m5631K(m5575o0(), m5572p0(), m5598e0() + m5596f0(), ((ViewGroup.MarginLayoutParams) c1010c).width, true);
            m5631K2 = RecyclerView.AbstractC0988o.m5631K(this.f3488x, m5612X(), 0, ((ViewGroup.MarginLayoutParams) c1010c).height, false);
            m5381u2(view, m5631K, m5631K2, z);
        } else {
            m5631K = RecyclerView.AbstractC0988o.m5631K(this.f3488x, m5572p0(), 0, ((ViewGroup.MarginLayoutParams) c1010c).width, false);
        }
        m5631K2 = RecyclerView.AbstractC0988o.m5631K(m5613W(), m5612X(), m5594g0() + m5600d0(), ((ViewGroup.MarginLayoutParams) c1010c).height, true);
        m5381u2(view, m5631K, m5631K2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
        if (m5430S1() != false) goto L83;
     */
    /* renamed from: w2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5377w2(androidx.recyclerview.widget.RecyclerView.C1000v r9, androidx.recyclerview.widget.RecyclerView.C0968a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5377w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: x2 */
    private boolean m5375x2(int i) {
        if (this.f3487w == 0) {
            return (i == -1) != this.f3467A;
        }
        return ((i == -1) == this.f3467A) == m5383t2();
    }

    /* renamed from: z2 */
    private void m5372z2(View view) {
        for (int i = this.f3483s - 1; i >= 0; i--) {
            this.f3484t[i].m5323u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: C0 */
    public void mo5466C0(int i) {
        super.mo5466C0(i);
        for (int i2 = 0; i2 < this.f3483s; i2++) {
            this.f3484t[i2].m5326r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: C1 */
    public void mo5465C1(Rect rect, int i, int i2) {
        int m5578n;
        int m5578n2;
        int m5598e0 = m5598e0() + m5596f0();
        int m5594g0 = m5594g0() + m5600d0();
        if (this.f3487w == 1) {
            m5578n2 = RecyclerView.AbstractC0988o.m5578n(i2, rect.height() + m5594g0, m5605b0());
            m5578n = RecyclerView.AbstractC0988o.m5578n(i, (this.f3488x * this.f3483s) + m5598e0, m5602c0());
        } else {
            m5578n = RecyclerView.AbstractC0988o.m5578n(i, rect.width() + m5598e0, m5602c0());
            m5578n2 = RecyclerView.AbstractC0988o.m5578n(i2, (this.f3488x * this.f3483s) + m5594g0, m5605b0());
        }
        m5647B1(m5578n, m5578n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: D */
    public RecyclerView.C0993p mo5463D() {
        return this.f3487w == 0 ? new C1010c(-2, -1) : new C1010c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: D0 */
    public void mo5462D0(int i) {
        super.mo5462D0(i);
        for (int i2 = 0; i2 < this.f3483s; i2++) {
            this.f3484t[i2].m5326r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: E */
    public RecyclerView.C0993p mo5460E(Context context, AttributeSet attributeSet) {
        return new C1010c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: F */
    public RecyclerView.C0993p mo5458F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1010c((ViewGroup.MarginLayoutParams) layoutParams) : new C1010c(layoutParams);
    }

    /* renamed from: F2 */
    int m5457F2(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        if (m5633J() == 0 || i == 0) {
            return 0;
        }
        m5373y2(i, c0968a0);
        int m5415b2 = m5415b2(c1000v, this.f3489y, c0968a0);
        if (this.f3489y.f3643b >= m5415b2) {
            i = i < 0 ? -m5415b2 : m5415b2;
        }
        this.f3485u.mo5150r(-i);
        this.f3473G = this.f3467A;
        C1043f c1043f = this.f3489y;
        c1043f.f3643b = 0;
        m5468A2(c1000v, c1043f);
        return i;
    }

    /* renamed from: H2 */
    public void m5455H2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo5407g(null);
        if (i == this.f3487w) {
            return;
        }
        this.f3487w = i;
        AbstractC1048j abstractC1048j = this.f3485u;
        this.f3485u = this.f3486v;
        this.f3486v = abstractC1048j;
        m5564t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: I0 */
    public void mo5454I0(RecyclerView recyclerView, RecyclerView.C1000v c1000v) {
        super.mo5454I0(recyclerView, c1000v);
        m5574o1(this.f3482P);
        for (int i = 0; i < this.f3483s; i++) {
            this.f3484t[i].m5339e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: I1 */
    public void mo2974I1(RecyclerView recyclerView, RecyclerView.C0968a0 c0968a0, int i) {
        C1044g c1044g = new C1044g(recyclerView.getContext());
        c1044g.m5476p(i);
        m5632J1(c1044g);
    }

    /* renamed from: I2 */
    public void m5453I2(boolean z) {
        mo5407g(null);
        C1014e c1014e = this.f3475I;
        if (c1014e != null && c1014e.f3514m != z) {
            c1014e.f3514m = z;
        }
        this.f3490z = z;
        m5564t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: J0 */
    public View mo5452J0(View view, int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        View m5649B;
        View m5331m;
        if (m5633J() == 0 || (m5649B = m5649B(view)) == null) {
            return null;
        }
        m5459E2();
        int m5421X1 = m5421X1(i);
        if (m5421X1 == Integer.MIN_VALUE) {
            return null;
        }
        C1010c c1010c = (C1010c) m5649B.getLayoutParams();
        boolean z = c1010c.f3500f;
        C1016f c1016f = c1010c.f3499e;
        int m5400k2 = m5421X1 == 1 ? m5400k2() : m5403j2();
        m5440O2(m5400k2, c0968a0);
        m5456G2(m5421X1);
        C1043f c1043f = this.f3489y;
        c1043f.f3644c = c1043f.f3645d + m5400k2;
        c1043f.f3643b = (int) (this.f3485u.mo5153n() * 0.33333334f);
        C1043f c1043f2 = this.f3489y;
        c1043f2.f3649h = true;
        c1043f2.f3642a = false;
        m5415b2(c1000v, c1043f2, c0968a0);
        this.f3473G = this.f3467A;
        if (z || (m5331m = c1016f.m5331m(m5400k2, m5421X1)) == null || m5331m == m5649B) {
            if (m5375x2(m5421X1)) {
                for (int i2 = this.f3483s - 1; i2 >= 0; i2--) {
                    View m5331m2 = this.f3484t[i2].m5331m(m5400k2, m5421X1);
                    if (m5331m2 != null && m5331m2 != m5649B) {
                        return m5331m2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f3483s; i3++) {
                    View m5331m3 = this.f3484t[i3].m5331m(m5400k2, m5421X1);
                    if (m5331m3 != null && m5331m3 != m5649B) {
                        return m5331m3;
                    }
                }
            }
            boolean z2 = (this.f3490z ^ true) == (m5421X1 == -1);
            if (!z) {
                View mo5646C = mo5646C(z2 ? c1016f.m5338f() : c1016f.m5337g());
                if (mo5646C != null && mo5646C != m5649B) {
                    return mo5646C;
                }
            }
            if (m5375x2(m5421X1)) {
                for (int i4 = this.f3483s - 1; i4 >= 0; i4--) {
                    if (i4 != c1016f.f3521e) {
                        C1016f[] c1016fArr = this.f3484t;
                        View mo5646C2 = mo5646C(z2 ? c1016fArr[i4].m5338f() : c1016fArr[i4].m5337g());
                        if (mo5646C2 != null && mo5646C2 != m5649B) {
                            return mo5646C2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.f3483s; i5++) {
                    C1016f[] c1016fArr2 = this.f3484t;
                    View mo5646C3 = mo5646C(z2 ? c1016fArr2[i5].m5338f() : c1016fArr2[i5].m5337g());
                    if (mo5646C3 != null && mo5646C3 != m5649B) {
                        return mo5646C3;
                    }
                }
            }
            return null;
        }
        return m5331m;
    }

    /* renamed from: J2 */
    public void m5451J2(int i) {
        mo5407g(null);
        if (i != this.f3483s) {
            m5385s2();
            this.f3483s = i;
            this.f3468B = new BitSet(this.f3483s);
            this.f3484t = new C1016f[this.f3483s];
            for (int i2 = 0; i2 < this.f3483s; i2++) {
                this.f3484t[i2] = new C1016f(i2);
            }
            m5564t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: K0 */
    public void mo5450K0(AccessibilityEvent accessibilityEvent) {
        super.mo5450K0(accessibilityEvent);
        if (m5633J() > 0) {
            View m5409e2 = m5409e2(false);
            View m5411d2 = m5411d2(false);
            if (m5409e2 == null || m5411d2 == null) {
                return;
            }
            int m5591h0 = m5591h0(m5409e2);
            int m5591h02 = m5591h0(m5411d2);
            if (m5591h0 < m5591h02) {
                accessibilityEvent.setFromIndex(m5591h0);
                accessibilityEvent.setToIndex(m5591h02);
                return;
            }
            accessibilityEvent.setFromIndex(m5591h02);
            accessibilityEvent.setToIndex(m5591h0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: L1 */
    public boolean mo5448L1() {
        return this.f3475I == null;
    }

    /* renamed from: M2 */
    boolean m5445M2(RecyclerView.C0968a0 c0968a0, C1009b c1009b) {
        int i;
        int mo5154m;
        int mo5160g;
        if (!c0968a0.m5742e() && (i = this.f3469C) != -1) {
            if (i >= 0 && i < c0968a0.m5745b()) {
                C1014e c1014e = this.f3475I;
                if (c1014e == null || c1014e.f3507f == -1 || c1014e.f3509h < 1) {
                    View mo5646C = mo5646C(this.f3469C);
                    if (mo5646C != null) {
                        c1009b.f3492a = this.f3467A ? m5400k2() : m5403j2();
                        if (this.f3470D != Integer.MIN_VALUE) {
                            if (c1009b.f3494c) {
                                mo5154m = this.f3485u.mo5158i() - this.f3470D;
                                mo5160g = this.f3485u.mo5163d(mo5646C);
                            } else {
                                mo5154m = this.f3485u.mo5154m() + this.f3470D;
                                mo5160g = this.f3485u.mo5160g(mo5646C);
                            }
                            c1009b.f3493b = mo5154m - mo5160g;
                            return true;
                        } else if (this.f3485u.mo5162e(mo5646C) > this.f3485u.mo5153n()) {
                            c1009b.f3493b = c1009b.f3494c ? this.f3485u.mo5158i() : this.f3485u.mo5154m();
                            return true;
                        } else {
                            int mo5160g2 = this.f3485u.mo5160g(mo5646C) - this.f3485u.mo5154m();
                            if (mo5160g2 < 0) {
                                c1009b.f3493b = -mo5160g2;
                                return true;
                            }
                            int mo5158i = this.f3485u.mo5158i() - this.f3485u.mo5163d(mo5646C);
                            if (mo5158i < 0) {
                                c1009b.f3493b = mo5158i;
                                return true;
                            }
                            c1009b.f3493b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i2 = this.f3469C;
                        c1009b.f3492a = i2;
                        int i3 = this.f3470D;
                        if (i3 == Integer.MIN_VALUE) {
                            c1009b.f3494c = m5433R1(i2) == 1;
                            c1009b.m5371a();
                        } else {
                            c1009b.m5370b(i3);
                        }
                        c1009b.f3495d = true;
                    }
                } else {
                    c1009b.f3493b = RecyclerView.UNDEFINED_DURATION;
                    c1009b.f3492a = this.f3469C;
                }
                return true;
            }
            this.f3469C = -1;
            this.f3470D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: N */
    public int mo5444N(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return this.f3487w == 1 ? this.f3483s : super.mo5444N(c1000v, c0968a0);
    }

    /* renamed from: N2 */
    void m5442N2(RecyclerView.C0968a0 c0968a0, C1009b c1009b) {
        if (m5445M2(c0968a0, c1009b) || m5447L2(c0968a0, c1009b)) {
            return;
        }
        c1009b.m5371a();
        c1009b.f3492a = 0;
    }

    /* renamed from: O1 */
    boolean m5441O1() {
        int m5332l = this.f3484t[0].m5332l(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3483s; i++) {
            if (this.f3484t[i].m5332l(RecyclerView.UNDEFINED_DURATION) != m5332l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: P0 */
    public void mo5439P0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0, View view, C0217c c0217c) {
        int i;
        int i2;
        int m5367e;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1010c)) {
            super.m5623O0(view, c0217c);
            return;
        }
        C1010c c1010c = (C1010c) layoutParams;
        if (this.f3487w == 0) {
            i = c1010c.m5367e();
            i2 = c1010c.f3500f ? this.f3483s : 1;
            m5367e = -1;
            i3 = -1;
        } else {
            i = -1;
            i2 = -1;
            m5367e = c1010c.m5367e();
            i3 = c1010c.f3500f ? this.f3483s : 1;
        }
        c0217c.m8774Z(C0217c.C0220c.m8720a(i, i2, m5367e, i3, false, false));
    }

    /* renamed from: P1 */
    boolean m5438P1() {
        int m5328p = this.f3484t[0].m5328p(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3483s; i++) {
            if (this.f3484t[i].m5328p(RecyclerView.UNDEFINED_DURATION) != m5328p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P2 */
    void m5437P2(int i) {
        this.f3488x = i / this.f3483s;
        this.f3476J = View.MeasureSpec.makeMeasureSpec(i, this.f3486v.mo5156k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: R0 */
    public void mo5434R0(RecyclerView recyclerView, int i, int i2) {
        m5390q2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: S0 */
    public void mo5431S0(RecyclerView recyclerView) {
        this.f3471E.m5364b();
        m5564t1();
    }

    /* renamed from: S1 */
    boolean m5430S1() {
        int m5403j2;
        int m5400k2;
        if (m5633J() == 0 || this.f3472F == 0 || !m5568r0()) {
            return false;
        }
        if (this.f3467A) {
            m5403j2 = m5400k2();
            m5400k2 = m5403j2();
        } else {
            m5403j2 = m5403j2();
            m5400k2 = m5400k2();
        }
        if (m5403j2 == 0 && m5388r2() != null) {
            this.f3471E.m5364b();
        } else if (!this.f3479M) {
            return false;
        } else {
            int i = this.f3467A ? -1 : 1;
            int i2 = m5400k2 + 1;
            C1011d.C1012a m5361e = this.f3471E.m5361e(m5403j2, i2, i, true);
            if (m5361e == null) {
                this.f3479M = false;
                this.f3471E.m5362d(i2);
                return false;
            }
            C1011d.C1012a m5361e2 = this.f3471E.m5361e(m5403j2, m5361e.f3503f, i * (-1), true);
            if (m5361e2 == null) {
                this.f3471E.m5362d(m5361e.f3503f);
            } else {
                this.f3471E.m5362d(m5361e2.f3503f + 1);
            }
        }
        m5562u1();
        m5564t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: T0 */
    public void mo5429T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m5390q2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: U0 */
    public void mo5427U0(RecyclerView recyclerView, int i, int i2) {
        m5390q2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: W0 */
    public void mo5424W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5390q2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: X0 */
    public void mo5422X0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        m5377w2(c1000v, c0968a0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: Y0 */
    public void mo5420Y0(RecyclerView.C0968a0 c0968a0) {
        super.mo5420Y0(c0968a0);
        this.f3469C = -1;
        this.f3470D = RecyclerView.UNDEFINED_DURATION;
        this.f3475I = null;
        this.f3478L.m5369c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1005z.InterfaceC1007b
    /* renamed from: a */
    public PointF mo5417a(int i) {
        int m5433R1 = m5433R1(i);
        PointF pointF = new PointF();
        if (m5433R1 == 0) {
            return null;
        }
        if (this.f3487w == 0) {
            pointF.x = m5433R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m5433R1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: c1 */
    public void mo5414c1(Parcelable parcelable) {
        if (parcelable instanceof C1014e) {
            this.f3475I = (C1014e) parcelable;
            m5564t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: d1 */
    public Parcelable mo5412d1() {
        int m5328p;
        int mo5154m;
        int[] iArr;
        if (this.f3475I != null) {
            return new C1014e(this.f3475I);
        }
        C1014e c1014e = new C1014e();
        c1014e.f3514m = this.f3490z;
        c1014e.f3515n = this.f3473G;
        c1014e.f3516o = this.f3474H;
        C1011d c1011d = this.f3471E;
        if (c1011d == null || (iArr = c1011d.f3501a) == null) {
            c1014e.f3511j = 0;
        } else {
            c1014e.f3512k = iArr;
            c1014e.f3511j = iArr.length;
            c1014e.f3513l = c1011d.f3502b;
        }
        if (m5633J() > 0) {
            c1014e.f3507f = this.f3473G ? m5400k2() : m5403j2();
            c1014e.f3508g = m5408f2();
            int i = this.f3483s;
            c1014e.f3509h = i;
            c1014e.f3510i = new int[i];
            for (int i2 = 0; i2 < this.f3483s; i2++) {
                if (this.f3473G) {
                    m5328p = this.f3484t[i2].m5332l(RecyclerView.UNDEFINED_DURATION);
                    if (m5328p != Integer.MIN_VALUE) {
                        mo5154m = this.f3485u.mo5158i();
                        m5328p -= mo5154m;
                        c1014e.f3510i[i2] = m5328p;
                    } else {
                        c1014e.f3510i[i2] = m5328p;
                    }
                } else {
                    m5328p = this.f3484t[i2].m5328p(RecyclerView.UNDEFINED_DURATION);
                    if (m5328p != Integer.MIN_VALUE) {
                        mo5154m = this.f3485u.mo5154m();
                        m5328p -= mo5154m;
                        c1014e.f3510i[i2] = m5328p;
                    } else {
                        c1014e.f3510i[i2] = m5328p;
                    }
                }
            }
        } else {
            c1014e.f3507f = -1;
            c1014e.f3508g = -1;
            c1014e.f3509h = 0;
        }
        return c1014e;
    }

    /* renamed from: d2 */
    View m5411d2(boolean z) {
        int mo5154m = this.f3485u.mo5154m();
        int mo5158i = this.f3485u.mo5158i();
        View view = null;
        for (int m5633J = m5633J() - 1; m5633J >= 0; m5633J--) {
            View m5634I = m5634I(m5633J);
            int mo5160g = this.f3485u.mo5160g(m5634I);
            int mo5163d = this.f3485u.mo5163d(m5634I);
            if (mo5163d > mo5154m && mo5160g < mo5158i) {
                if (mo5163d <= mo5158i || !z) {
                    return m5634I;
                }
                if (view == null) {
                    view = m5634I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: e1 */
    public void mo5410e1(int i) {
        if (i == 0) {
            m5430S1();
        }
    }

    /* renamed from: e2 */
    View m5409e2(boolean z) {
        int mo5154m = this.f3485u.mo5154m();
        int mo5158i = this.f3485u.mo5158i();
        int m5633J = m5633J();
        View view = null;
        for (int i = 0; i < m5633J; i++) {
            View m5634I = m5634I(i);
            int mo5160g = this.f3485u.mo5160g(m5634I);
            if (this.f3485u.mo5163d(m5634I) > mo5154m && mo5160g < mo5158i) {
                if (mo5160g >= mo5154m || !z) {
                    return m5634I;
                }
                if (view == null) {
                    view = m5634I;
                }
            }
        }
        return view;
    }

    /* renamed from: f2 */
    int m5408f2() {
        View m5411d2 = this.f3467A ? m5411d2(true) : m5409e2(true);
        if (m5411d2 == null) {
            return -1;
        }
        return m5591h0(m5411d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: g */
    public void mo5407g(String str) {
        if (this.f3475I == null) {
            super.mo5407g(str);
        }
    }

    /* renamed from: j2 */
    int m5403j2() {
        if (m5633J() == 0) {
            return 0;
        }
        return m5591h0(m5634I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: k */
    public boolean mo5402k() {
        return this.f3487w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: k0 */
    public int mo5401k0(RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return this.f3487w == 0 ? this.f3483s : super.mo5401k0(c1000v, c0968a0);
    }

    /* renamed from: k2 */
    int m5400k2() {
        int m5633J = m5633J();
        if (m5633J == 0) {
            return 0;
        }
        return m5591h0(m5634I(m5633J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: l */
    public boolean mo5399l() {
        return this.f3487w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: m */
    public boolean mo5397m(RecyclerView.C0993p c0993p) {
        return c0993p instanceof C1010c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: o */
    public void mo5394o(int i, int i2, RecyclerView.C0968a0 c0968a0, RecyclerView.AbstractC0988o.InterfaceC0991c interfaceC0991c) {
        int m5332l;
        int i3;
        if (this.f3487w != 0) {
            i = i2;
        }
        if (m5633J() == 0 || i == 0) {
            return;
        }
        m5373y2(i, c0968a0);
        int[] iArr = this.f3481O;
        if (iArr == null || iArr.length < this.f3483s) {
            this.f3481O = new int[this.f3483s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3483s; i5++) {
            C1043f c1043f = this.f3489y;
            if (c1043f.f3645d == -1) {
                m5332l = c1043f.f3647f;
                i3 = this.f3484t[i5].m5328p(m5332l);
            } else {
                m5332l = this.f3484t[i5].m5332l(c1043f.f3648g);
                i3 = this.f3489y.f3648g;
            }
            int i6 = m5332l - i3;
            if (i6 >= 0) {
                this.f3481O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f3481O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f3489y.m5197a(c0968a0); i7++) {
            interfaceC0991c.mo5203a(this.f3489y.f3644c, this.f3481O[i7]);
            C1043f c1043f2 = this.f3489y;
            c1043f2.f3644c += c1043f2.f3645d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: q */
    public int mo5391q(RecyclerView.C0968a0 c0968a0) {
        return m5426U1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: r */
    public int mo5389r(RecyclerView.C0968a0 c0968a0) {
        return m5425V1(c0968a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: r2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View m5388r2() {
        /*
            r12 = this;
            int r0 = r12.m5633J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3483s
            r2.<init>(r3)
            int r3 = r12.f3483s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3487w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m5383t2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f3467A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.m5634I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1010c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3499e
            int r9 = r9.f3521e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3499e
            boolean r9 = r12.m5428T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3499e
            int r9 = r9.f3521e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3500f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.m5634I(r9)
            boolean r10 = r12.f3467A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.j r10 = r12.f3485u
            int r10 = r10.mo5163d(r7)
            androidx.recyclerview.widget.j r11 = r12.f3485u
            int r11 = r11.mo5163d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.j r10 = r12.f3485u
            int r10 = r10.mo5160g(r7)
            androidx.recyclerview.widget.j r11 = r12.f3485u
            int r11 = r11.mo5160g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1010c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3499e
            int r8 = r8.f3521e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3499e
            int r9 = r9.f3521e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5388r2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: s */
    public int mo5387s(RecyclerView.C0968a0 c0968a0) {
        return m5423W1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: s0 */
    public boolean mo5386s0() {
        return this.f3472F != 0;
    }

    /* renamed from: s2 */
    public void m5385s2() {
        this.f3471E.m5364b();
        m5564t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: t */
    public int mo5384t(RecyclerView.C0968a0 c0968a0) {
        return m5426U1(c0968a0);
    }

    /* renamed from: t2 */
    boolean m5383t2() {
        return m5610Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: u */
    public int mo5382u(RecyclerView.C0968a0 c0968a0) {
        return m5425V1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: v */
    public int mo5380v(RecyclerView.C0968a0 c0968a0) {
        return m5423W1(c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: w1 */
    public int mo5378w1(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return m5457F2(i, c1000v, c0968a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: x1 */
    public void mo5376x1(int i) {
        C1014e c1014e = this.f3475I;
        if (c1014e != null && c1014e.f3507f != i) {
            c1014e.m5347a();
        }
        this.f3469C = i;
        this.f3470D = RecyclerView.UNDEFINED_DURATION;
        m5564t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: y1 */
    public int mo5374y1(int i, RecyclerView.C1000v c1000v, RecyclerView.C0968a0 c0968a0) {
        return m5457F2(i, c1000v, c0968a0);
    }

    /* renamed from: y2 */
    void m5373y2(int i, RecyclerView.C0968a0 c0968a0) {
        int m5403j2;
        int i2;
        if (i > 0) {
            m5403j2 = m5400k2();
            i2 = 1;
        } else {
            m5403j2 = m5403j2();
            i2 = -1;
        }
        this.f3489y.f3642a = true;
        m5440O2(m5403j2, c0968a0);
        m5456G2(i2);
        C1043f c1043f = this.f3489y;
        c1043f.f3644c = m5403j2 + c1043f.f3645d;
        c1043f.f3643b = Math.abs(i);
    }
}
