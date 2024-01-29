package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import p000a.p015e.p016a.C0087f;
import p000a.p015e.p016a.p017j.C0101f;
import p000a.p015e.p016a.p017j.C0104g;
import p000a.p015e.p016a.p017j.C0106i;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: f */
    SparseArray<View> f2295f;

    /* renamed from: g */
    private ArrayList<AbstractC0681b> f2296g;

    /* renamed from: h */
    private final ArrayList<C0101f> f2297h;

    /* renamed from: i */
    C0104g f2298i;

    /* renamed from: j */
    private int f2299j;

    /* renamed from: k */
    private int f2300k;

    /* renamed from: l */
    private int f2301l;

    /* renamed from: m */
    private int f2302m;

    /* renamed from: n */
    private boolean f2303n;

    /* renamed from: o */
    private int f2304o;

    /* renamed from: p */
    private C0682c f2305p;

    /* renamed from: q */
    private int f2306q;

    /* renamed from: r */
    private HashMap<String, Integer> f2307r;

    /* renamed from: s */
    private int f2308s;

    /* renamed from: t */
    private int f2309t;

    /* renamed from: u */
    private C0087f f2310u;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    public static class C0678a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2311A;

        /* renamed from: B */
        public String f2312B;

        /* renamed from: C */
        int f2313C;

        /* renamed from: D */
        public float f2314D;

        /* renamed from: E */
        public float f2315E;

        /* renamed from: F */
        public int f2316F;

        /* renamed from: G */
        public int f2317G;

        /* renamed from: H */
        public int f2318H;

        /* renamed from: I */
        public int f2319I;

        /* renamed from: J */
        public int f2320J;

        /* renamed from: K */
        public int f2321K;

        /* renamed from: L */
        public int f2322L;

        /* renamed from: M */
        public int f2323M;

        /* renamed from: N */
        public float f2324N;

        /* renamed from: O */
        public float f2325O;

        /* renamed from: P */
        public int f2326P;

        /* renamed from: Q */
        public int f2327Q;

        /* renamed from: R */
        public int f2328R;

        /* renamed from: S */
        public boolean f2329S;

        /* renamed from: T */
        public boolean f2330T;

        /* renamed from: U */
        boolean f2331U;

        /* renamed from: V */
        boolean f2332V;

        /* renamed from: W */
        boolean f2333W;

        /* renamed from: X */
        boolean f2334X;

        /* renamed from: Y */
        boolean f2335Y;

        /* renamed from: Z */
        boolean f2336Z;

        /* renamed from: a */
        public int f2337a;

        /* renamed from: a0 */
        int f2338a0;

        /* renamed from: b */
        public int f2339b;

        /* renamed from: b0 */
        int f2340b0;

        /* renamed from: c */
        public float f2341c;

        /* renamed from: c0 */
        int f2342c0;

        /* renamed from: d */
        public int f2343d;

        /* renamed from: d0 */
        int f2344d0;

        /* renamed from: e */
        public int f2345e;

        /* renamed from: e0 */
        int f2346e0;

        /* renamed from: f */
        public int f2347f;

        /* renamed from: f0 */
        int f2348f0;

        /* renamed from: g */
        public int f2349g;

        /* renamed from: g0 */
        float f2350g0;

        /* renamed from: h */
        public int f2351h;

        /* renamed from: h0 */
        int f2352h0;

        /* renamed from: i */
        public int f2353i;

        /* renamed from: i0 */
        int f2354i0;

        /* renamed from: j */
        public int f2355j;

        /* renamed from: j0 */
        float f2356j0;

        /* renamed from: k */
        public int f2357k;

        /* renamed from: k0 */
        C0101f f2358k0;

        /* renamed from: l */
        public int f2359l;

        /* renamed from: l0 */
        public boolean f2360l0;

        /* renamed from: m */
        public int f2361m;

        /* renamed from: n */
        public int f2362n;

        /* renamed from: o */
        public float f2363o;

        /* renamed from: p */
        public int f2364p;

        /* renamed from: q */
        public int f2365q;

        /* renamed from: r */
        public int f2366r;

        /* renamed from: s */
        public int f2367s;

        /* renamed from: t */
        public int f2368t;

        /* renamed from: u */
        public int f2369u;

        /* renamed from: v */
        public int f2370v;

        /* renamed from: w */
        public int f2371w;

        /* renamed from: x */
        public int f2372x;

        /* renamed from: y */
        public int f2373y;

        /* renamed from: z */
        public float f2374z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        /* loaded from: classes.dex */
        private static class C0679a {

            /* renamed from: a */
            public static final SparseIntArray f2375a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2375a = sparseIntArray;
                sparseIntArray.append(C0690h.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f2375a.append(C0690h.ConstraintLayout_Layout_android_orientation, 1);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f2375a.append(C0690h.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0678a(int i, int i2) {
            super(i, i2);
            this.f2337a = -1;
            this.f2339b = -1;
            this.f2341c = -1.0f;
            this.f2343d = -1;
            this.f2345e = -1;
            this.f2347f = -1;
            this.f2349g = -1;
            this.f2351h = -1;
            this.f2353i = -1;
            this.f2355j = -1;
            this.f2357k = -1;
            this.f2359l = -1;
            this.f2361m = -1;
            this.f2362n = 0;
            this.f2363o = 0.0f;
            this.f2364p = -1;
            this.f2365q = -1;
            this.f2366r = -1;
            this.f2367s = -1;
            this.f2368t = -1;
            this.f2369u = -1;
            this.f2370v = -1;
            this.f2371w = -1;
            this.f2372x = -1;
            this.f2373y = -1;
            this.f2374z = 0.5f;
            this.f2311A = 0.5f;
            this.f2312B = null;
            this.f2313C = 1;
            this.f2314D = -1.0f;
            this.f2315E = -1.0f;
            this.f2316F = 0;
            this.f2317G = 0;
            this.f2318H = 0;
            this.f2319I = 0;
            this.f2320J = 0;
            this.f2321K = 0;
            this.f2322L = 0;
            this.f2323M = 0;
            this.f2324N = 1.0f;
            this.f2325O = 1.0f;
            this.f2326P = -1;
            this.f2327Q = -1;
            this.f2328R = -1;
            this.f2329S = false;
            this.f2330T = false;
            this.f2331U = true;
            this.f2332V = true;
            this.f2333W = false;
            this.f2334X = false;
            this.f2335Y = false;
            this.f2336Z = false;
            this.f2338a0 = -1;
            this.f2340b0 = -1;
            this.f2342c0 = -1;
            this.f2344d0 = -1;
            this.f2346e0 = -1;
            this.f2348f0 = -1;
            this.f2350g0 = 0.5f;
            this.f2358k0 = new C0101f();
            this.f2360l0 = false;
        }

        public C0678a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            this.f2337a = -1;
            this.f2339b = -1;
            this.f2341c = -1.0f;
            this.f2343d = -1;
            this.f2345e = -1;
            this.f2347f = -1;
            this.f2349g = -1;
            this.f2351h = -1;
            this.f2353i = -1;
            this.f2355j = -1;
            this.f2357k = -1;
            this.f2359l = -1;
            this.f2361m = -1;
            this.f2362n = 0;
            this.f2363o = 0.0f;
            this.f2364p = -1;
            this.f2365q = -1;
            this.f2366r = -1;
            this.f2367s = -1;
            this.f2368t = -1;
            this.f2369u = -1;
            this.f2370v = -1;
            this.f2371w = -1;
            this.f2372x = -1;
            this.f2373y = -1;
            this.f2374z = 0.5f;
            this.f2311A = 0.5f;
            this.f2312B = null;
            this.f2313C = 1;
            this.f2314D = -1.0f;
            this.f2315E = -1.0f;
            this.f2316F = 0;
            this.f2317G = 0;
            this.f2318H = 0;
            this.f2319I = 0;
            this.f2320J = 0;
            this.f2321K = 0;
            this.f2322L = 0;
            this.f2323M = 0;
            this.f2324N = 1.0f;
            this.f2325O = 1.0f;
            this.f2326P = -1;
            this.f2327Q = -1;
            this.f2328R = -1;
            this.f2329S = false;
            this.f2330T = false;
            this.f2331U = true;
            this.f2332V = true;
            this.f2333W = false;
            this.f2334X = false;
            this.f2335Y = false;
            this.f2336Z = false;
            this.f2338a0 = -1;
            this.f2340b0 = -1;
            this.f2342c0 = -1;
            this.f2344d0 = -1;
            this.f2346e0 = -1;
            this.f2348f0 = -1;
            this.f2350g0 = 0.5f;
            this.f2358k0 = new C0101f();
            this.f2360l0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0690h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0679a.f2375a.get(index);
                switch (i3) {
                    case 1:
                        this.f2328R = obtainStyledAttributes.getInt(index, this.f2328R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2361m);
                        this.f2361m = resourceId;
                        if (resourceId == -1) {
                            this.f2361m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f2362n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2362n);
                        continue;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2363o) % 360.0f;
                        this.f2363o = f;
                        if (f < 0.0f) {
                            this.f2363o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f2337a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2337a);
                        continue;
                    case 6:
                        this.f2339b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2339b);
                        continue;
                    case 7:
                        this.f2341c = obtainStyledAttributes.getFloat(index, this.f2341c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2343d);
                        this.f2343d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2343d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2345e);
                        this.f2345e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2345e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2347f);
                        this.f2347f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2347f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2349g);
                        this.f2349g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2349g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2351h);
                        this.f2351h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2351h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2353i);
                        this.f2353i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2353i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2355j);
                        this.f2355j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2355j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2357k);
                        this.f2357k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2357k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2359l);
                        this.f2359l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2359l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2364p);
                        this.f2364p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2364p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2365q);
                        this.f2365q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2365q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2366r);
                        this.f2366r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2366r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2367s);
                        this.f2367s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2367s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f2368t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2368t);
                        continue;
                    case 22:
                        this.f2369u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2369u);
                        continue;
                    case 23:
                        this.f2370v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2370v);
                        continue;
                    case 24:
                        this.f2371w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2371w);
                        continue;
                    case 25:
                        this.f2372x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2372x);
                        continue;
                    case 26:
                        this.f2373y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2373y);
                        continue;
                    case 27:
                        this.f2329S = obtainStyledAttributes.getBoolean(index, this.f2329S);
                        continue;
                    case 28:
                        this.f2330T = obtainStyledAttributes.getBoolean(index, this.f2330T);
                        continue;
                    case 29:
                        this.f2374z = obtainStyledAttributes.getFloat(index, this.f2374z);
                        continue;
                    case 30:
                        this.f2311A = obtainStyledAttributes.getFloat(index, this.f2311A);
                        continue;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2318H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f2319I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.f2320J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2320J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2320J) == -2) {
                                this.f2320J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f2322L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2322L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2322L) == -2) {
                                this.f2322L = -2;
                            }
                        }
                    case 35:
                        this.f2324N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2324N));
                        continue;
                    case 36:
                        try {
                            this.f2321K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2321K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2321K) == -2) {
                                this.f2321K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f2323M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2323M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2323M) == -2) {
                                this.f2323M = -2;
                            }
                        }
                    case 38:
                        this.f2325O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2325O));
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2312B = string;
                                this.f2313C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2312B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f2312B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2313C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2313C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2312B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f2312B.substring(i);
                                        if (substring2.length() > 0) {
                                            Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f2312B.substring(i, indexOf2);
                                        String substring4 = this.f2312B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f2313C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f2314D = obtainStyledAttributes.getFloat(index, this.f2314D);
                                continue;
                            case 46:
                                this.f2315E = obtainStyledAttributes.getFloat(index, this.f2315E);
                                continue;
                            case 47:
                                this.f2316F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f2317G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f2326P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2326P);
                                continue;
                            case 50:
                                this.f2327Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2327Q);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            m7115a();
        }

        public C0678a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2337a = -1;
            this.f2339b = -1;
            this.f2341c = -1.0f;
            this.f2343d = -1;
            this.f2345e = -1;
            this.f2347f = -1;
            this.f2349g = -1;
            this.f2351h = -1;
            this.f2353i = -1;
            this.f2355j = -1;
            this.f2357k = -1;
            this.f2359l = -1;
            this.f2361m = -1;
            this.f2362n = 0;
            this.f2363o = 0.0f;
            this.f2364p = -1;
            this.f2365q = -1;
            this.f2366r = -1;
            this.f2367s = -1;
            this.f2368t = -1;
            this.f2369u = -1;
            this.f2370v = -1;
            this.f2371w = -1;
            this.f2372x = -1;
            this.f2373y = -1;
            this.f2374z = 0.5f;
            this.f2311A = 0.5f;
            this.f2312B = null;
            this.f2313C = 1;
            this.f2314D = -1.0f;
            this.f2315E = -1.0f;
            this.f2316F = 0;
            this.f2317G = 0;
            this.f2318H = 0;
            this.f2319I = 0;
            this.f2320J = 0;
            this.f2321K = 0;
            this.f2322L = 0;
            this.f2323M = 0;
            this.f2324N = 1.0f;
            this.f2325O = 1.0f;
            this.f2326P = -1;
            this.f2327Q = -1;
            this.f2328R = -1;
            this.f2329S = false;
            this.f2330T = false;
            this.f2331U = true;
            this.f2332V = true;
            this.f2333W = false;
            this.f2334X = false;
            this.f2335Y = false;
            this.f2336Z = false;
            this.f2338a0 = -1;
            this.f2340b0 = -1;
            this.f2342c0 = -1;
            this.f2344d0 = -1;
            this.f2346e0 = -1;
            this.f2348f0 = -1;
            this.f2350g0 = 0.5f;
            this.f2358k0 = new C0101f();
            this.f2360l0 = false;
        }

        /* renamed from: a */
        public void m7115a() {
            this.f2334X = false;
            this.f2331U = true;
            this.f2332V = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.f2329S) {
                this.f2331U = false;
                this.f2318H = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.f2330T) {
                this.f2332V = false;
                this.f2319I = 1;
            }
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == 0 || i == -1) {
                this.f2331U = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.f2318H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2329S = true;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == 0 || i2 == -1) {
                this.f2332V = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.f2319I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2330T = true;
                }
            }
            if (this.f2341c == -1.0f && this.f2337a == -1 && this.f2339b == -1) {
                return;
            }
            this.f2334X = true;
            this.f2331U = true;
            this.f2332V = true;
            if (!(this.f2358k0 instanceof C0106i)) {
                this.f2358k0 = new C0106i();
            }
            ((C0106i) this.f2358k0).m9096M0(this.f2328R);
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d6, code lost:
            if (r1 > 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d8, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r6).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
            if (r1 > 0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0678a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2295f = new SparseArray<>();
        this.f2296g = new ArrayList<>(4);
        this.f2297h = new ArrayList<>(100);
        this.f2298i = new C0104g();
        this.f2299j = 0;
        this.f2300k = 0;
        this.f2301l = Reader.READ_DONE;
        this.f2302m = Reader.READ_DONE;
        this.f2303n = true;
        this.f2304o = 7;
        this.f2305p = null;
        this.f2306q = -1;
        this.f2307r = new HashMap<>();
        this.f2308s = -1;
        this.f2309t = -1;
        m7124g(attributeSet);
    }

    /* renamed from: d */
    private final C0101f m7127d(int i) {
        if (i == 0) {
            return this.f2298i;
        }
        View view = this.f2295f.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2298i;
        }
        if (view == null) {
            return null;
        }
        return ((C0678a) view.getLayoutParams()).f2358k0;
    }

    /* renamed from: g */
    private void m7124g(AttributeSet attributeSet) {
        this.f2298i.m9177W(this);
        this.f2295f.put(getId(), this);
        this.f2305p = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0690h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0690h.ConstraintLayout_Layout_android_minWidth) {
                    this.f2299j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2299j);
                } else if (index == C0690h.ConstraintLayout_Layout_android_minHeight) {
                    this.f2300k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2300k);
                } else if (index == C0690h.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2301l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2301l);
                } else if (index == C0690h.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2302m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2302m);
                } else if (index == C0690h.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2304o = obtainStyledAttributes.getInt(index, this.f2304o);
                } else if (index == C0690h.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0682c c0682c = new C0682c();
                        this.f2305p = c0682c;
                        c0682c.m7104e(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f2305p = null;
                    }
                    this.f2306q = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2298i.m9112c1(this.f2304o);
    }

    /* renamed from: h */
    private void m7123h(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0678a c0678a = (C0678a) childAt.getLayoutParams();
                C0101f c0101f = c0678a.f2358k0;
                if (!c0678a.f2334X && !c0678a.f2335Y) {
                    c0101f.m9132x0(childAt.getVisibility());
                    int i4 = ((ViewGroup.MarginLayoutParams) c0678a).width;
                    int i5 = ((ViewGroup.MarginLayoutParams) c0678a).height;
                    boolean z3 = c0678a.f2331U;
                    if (z3 || c0678a.f2332V || (!z3 && c0678a.f2318H == 1) || ((ViewGroup.MarginLayoutParams) c0678a).width == -1 || (!c0678a.f2332V && (c0678a.f2319I == 1 || ((ViewGroup.MarginLayoutParams) c0678a).height == -1))) {
                        if (i4 == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, -2);
                            z = true;
                        } else if (i4 == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, -1);
                            z = false;
                        } else {
                            z = i4 == -2;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, i4);
                        }
                        if (i5 == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                            z2 = true;
                        } else if (i5 == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -1);
                            z2 = false;
                        } else {
                            z2 = i5 == -2;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, i5);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        C0087f c0087f = this.f2310u;
                        if (c0087f != null) {
                            c0087f.f294a++;
                        }
                        c0101f.m9128z0(i4 == -2);
                        c0101f.m9170c0(i5 == -2);
                        i4 = childAt.getMeasuredWidth();
                        i5 = childAt.getMeasuredHeight();
                    } else {
                        z = false;
                        z2 = false;
                    }
                    c0101f.m9130y0(i4);
                    c0101f.m9171b0(i5);
                    if (z) {
                        c0101f.m9200B0(i4);
                    }
                    if (z2) {
                        c0101f.m9202A0(i5);
                    }
                    if (c0678a.f2333W && (baseline = childAt.getBaseline()) != -1) {
                        c0101f.m9178V(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cd A[ADDED_TO_REGION] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7122i(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m7122i(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d6, code lost:
        if (r11 != (-1)) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a1  */
    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7121j() {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m7121j():void");
    }

    /* renamed from: l */
    private void m7119l(int i, int i2) {
        int i3;
        C0101f.EnumC0103b enumC0103b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0101f.EnumC0103b enumC0103b2 = C0101f.EnumC0103b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                enumC0103b = C0101f.EnumC0103b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                enumC0103b = enumC0103b2;
            } else {
                i3 = Math.min(this.f2301l, size) - paddingLeft;
                enumC0103b = enumC0103b2;
            }
            i3 = 0;
        } else {
            i3 = size;
            enumC0103b = C0101f.EnumC0103b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                enumC0103b2 = C0101f.EnumC0103b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f2302m, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            enumC0103b2 = C0101f.EnumC0103b.WRAP_CONTENT;
        }
        this.f2298i.m9153m0(0);
        this.f2298i.m9155l0(0);
        this.f2298i.m9163g0(enumC0103b);
        this.f2298i.m9130y0(i3);
        this.f2298i.m9138u0(enumC0103b2);
        this.f2298i.m9171b0(size2);
        this.f2298i.m9153m0((this.f2299j - getPaddingLeft()) - getPaddingRight());
        this.f2298i.m9155l0((this.f2300k - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: n */
    private void m7117n() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f2297h.clear();
            m7121j();
        }
    }

    /* renamed from: o */
    private void m7116o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0688f) {
                ((C0688f) childAt).m7092a(this);
            }
        }
        int size = this.f2296g.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f2296g.get(i2).m7111d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0678a generateDefaultLayoutParams() {
        return new C0678a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0678a generateLayoutParams(AttributeSet attributeSet) {
        return new C0678a(getContext(), attributeSet);
    }

    /* renamed from: c */
    public Object m7128c(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f2307r;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f2307r.get(str);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0678a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((parseInt / 1080.0f) * width);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i2;
                        float f2 = i3;
                        float f3 = i2 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public View m7126e(int i) {
        return this.f2295f.get(i);
    }

    /* renamed from: f */
    public final C0101f m7125f(View view) {
        if (view == this) {
            return this.f2298i;
        }
        if (view == null) {
            return null;
        }
        return ((C0678a) view.getLayoutParams()).f2358k0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0678a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f2302m;
    }

    public int getMaxWidth() {
        return this.f2301l;
    }

    public int getMinHeight() {
        return this.f2300k;
    }

    public int getMinWidth() {
        return this.f2299j;
    }

    public int getOptimizationLevel() {
        return this.f2298i.m9123R0();
    }

    /* renamed from: k */
    public void m7120k(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2307r == null) {
                this.f2307r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2307r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: m */
    protected void m7118m(String str) {
        this.f2298i.mo9057K0();
        C0087f c0087f = this.f2310u;
        if (c0087f != null) {
            c0087f.f296c++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0678a c0678a = (C0678a) childAt.getLayoutParams();
            C0101f c0101f = c0678a.f2358k0;
            if ((childAt.getVisibility() != 8 || c0678a.f2334X || c0678a.f2335Y || isInEditMode) && !c0678a.f2336Z) {
                int m9149p = c0101f.m9149p();
                int m9147q = c0101f.m9147q();
                int m9197D = c0101f.m9197D() + m9149p;
                int m9145r = c0101f.m9145r() + m9147q;
                childAt.layout(m9149p, m9147q, m9197D, m9145r);
                if ((childAt instanceof C0688f) && (content = ((C0688f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m9149p, m9147q, m9197D, m9145r);
                }
            }
        }
        int size = this.f2296g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2296g.get(i6).m7112c(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0101f m7125f = m7125f(view);
        if ((view instanceof C0687e) && !(m7125f instanceof C0106i)) {
            C0678a c0678a = (C0678a) view.getLayoutParams();
            C0106i c0106i = new C0106i();
            c0678a.f2358k0 = c0106i;
            c0678a.f2334X = true;
            c0106i.m9096M0(c0678a.f2328R);
        }
        if (view instanceof AbstractC0681b) {
            AbstractC0681b abstractC0681b = (AbstractC0681b) view;
            abstractC0681b.m7109f();
            ((C0678a) view.getLayoutParams()).f2335Y = true;
            if (!this.f2296g.contains(abstractC0681b)) {
                this.f2296g.add(abstractC0681b);
            }
        }
        this.f2295f.put(view.getId(), view);
        this.f2303n = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2295f.remove(view.getId());
        C0101f m7125f = m7125f(view);
        this.f2298i.m9056L0(m7125f);
        this.f2296g.remove(view);
        this.f2297h.remove(m7125f);
        this.f2303n = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f2303n = true;
        this.f2308s = -1;
        this.f2309t = -1;
    }

    public void setConstraintSet(C0682c c0682c) {
        this.f2305p = c0682c;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f2295f.remove(getId());
        super.setId(i);
        this.f2295f.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f2302m) {
            return;
        }
        this.f2302m = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f2301l) {
            return;
        }
        this.f2301l = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f2300k) {
            return;
        }
        this.f2300k = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f2299j) {
            return;
        }
        this.f2299j = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.f2298i.m9112c1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
