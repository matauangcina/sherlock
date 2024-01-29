package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0685d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0682c {

    /* renamed from: b */
    private static final int[] f2385b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f2386c;

    /* renamed from: a */
    private HashMap<Integer, C0684b> f2387a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes.dex */
    public static class C0684b {

        /* renamed from: A */
        public int f2388A;

        /* renamed from: B */
        public int f2389B;

        /* renamed from: C */
        public int f2390C;

        /* renamed from: D */
        public int f2391D;

        /* renamed from: E */
        public int f2392E;

        /* renamed from: F */
        public int f2393F;

        /* renamed from: G */
        public int f2394G;

        /* renamed from: H */
        public int f2395H;

        /* renamed from: I */
        public int f2396I;

        /* renamed from: J */
        public int f2397J;

        /* renamed from: K */
        public int f2398K;

        /* renamed from: L */
        public int f2399L;

        /* renamed from: M */
        public int f2400M;

        /* renamed from: N */
        public int f2401N;

        /* renamed from: O */
        public int f2402O;

        /* renamed from: P */
        public int f2403P;

        /* renamed from: Q */
        public float f2404Q;

        /* renamed from: R */
        public float f2405R;

        /* renamed from: S */
        public int f2406S;

        /* renamed from: T */
        public int f2407T;

        /* renamed from: U */
        public float f2408U;

        /* renamed from: V */
        public boolean f2409V;

        /* renamed from: W */
        public float f2410W;

        /* renamed from: X */
        public float f2411X;

        /* renamed from: Y */
        public float f2412Y;

        /* renamed from: Z */
        public float f2413Z;

        /* renamed from: a */
        boolean f2414a;

        /* renamed from: a0 */
        public float f2415a0;

        /* renamed from: b */
        public int f2416b;

        /* renamed from: b0 */
        public float f2417b0;

        /* renamed from: c */
        public int f2418c;

        /* renamed from: c0 */
        public float f2419c0;

        /* renamed from: d */
        int f2420d;

        /* renamed from: d0 */
        public float f2421d0;

        /* renamed from: e */
        public int f2422e;

        /* renamed from: e0 */
        public float f2423e0;

        /* renamed from: f */
        public int f2424f;

        /* renamed from: f0 */
        public float f2425f0;

        /* renamed from: g */
        public float f2426g;

        /* renamed from: g0 */
        public float f2427g0;

        /* renamed from: h */
        public int f2428h;

        /* renamed from: h0 */
        public boolean f2429h0;

        /* renamed from: i */
        public int f2430i;

        /* renamed from: i0 */
        public boolean f2431i0;

        /* renamed from: j */
        public int f2432j;

        /* renamed from: j0 */
        public int f2433j0;

        /* renamed from: k */
        public int f2434k;

        /* renamed from: k0 */
        public int f2435k0;

        /* renamed from: l */
        public int f2436l;

        /* renamed from: l0 */
        public int f2437l0;

        /* renamed from: m */
        public int f2438m;

        /* renamed from: m0 */
        public int f2439m0;

        /* renamed from: n */
        public int f2440n;

        /* renamed from: n0 */
        public int f2441n0;

        /* renamed from: o */
        public int f2442o;

        /* renamed from: o0 */
        public int f2443o0;

        /* renamed from: p */
        public int f2444p;

        /* renamed from: p0 */
        public float f2445p0;

        /* renamed from: q */
        public int f2446q;

        /* renamed from: q0 */
        public float f2447q0;

        /* renamed from: r */
        public int f2448r;

        /* renamed from: r0 */
        public boolean f2449r0;

        /* renamed from: s */
        public int f2450s;

        /* renamed from: s0 */
        public int f2451s0;

        /* renamed from: t */
        public int f2452t;

        /* renamed from: t0 */
        public int f2453t0;

        /* renamed from: u */
        public float f2454u;

        /* renamed from: u0 */
        public int[] f2455u0;

        /* renamed from: v */
        public float f2456v;

        /* renamed from: v0 */
        public String f2457v0;

        /* renamed from: w */
        public String f2458w;

        /* renamed from: x */
        public int f2459x;

        /* renamed from: y */
        public int f2460y;

        /* renamed from: z */
        public float f2461z;

        private C0684b() {
            this.f2414a = false;
            this.f2422e = -1;
            this.f2424f = -1;
            this.f2426g = -1.0f;
            this.f2428h = -1;
            this.f2430i = -1;
            this.f2432j = -1;
            this.f2434k = -1;
            this.f2436l = -1;
            this.f2438m = -1;
            this.f2440n = -1;
            this.f2442o = -1;
            this.f2444p = -1;
            this.f2446q = -1;
            this.f2448r = -1;
            this.f2450s = -1;
            this.f2452t = -1;
            this.f2454u = 0.5f;
            this.f2456v = 0.5f;
            this.f2458w = null;
            this.f2459x = -1;
            this.f2460y = 0;
            this.f2461z = 0.0f;
            this.f2388A = -1;
            this.f2389B = -1;
            this.f2390C = -1;
            this.f2391D = -1;
            this.f2392E = -1;
            this.f2393F = -1;
            this.f2394G = -1;
            this.f2395H = -1;
            this.f2396I = -1;
            this.f2397J = 0;
            this.f2398K = -1;
            this.f2399L = -1;
            this.f2400M = -1;
            this.f2401N = -1;
            this.f2402O = -1;
            this.f2403P = -1;
            this.f2404Q = 0.0f;
            this.f2405R = 0.0f;
            this.f2406S = 0;
            this.f2407T = 0;
            this.f2408U = 1.0f;
            this.f2409V = false;
            this.f2410W = 0.0f;
            this.f2411X = 0.0f;
            this.f2412Y = 0.0f;
            this.f2413Z = 0.0f;
            this.f2415a0 = 1.0f;
            this.f2417b0 = 1.0f;
            this.f2419c0 = Float.NaN;
            this.f2421d0 = Float.NaN;
            this.f2423e0 = 0.0f;
            this.f2425f0 = 0.0f;
            this.f2427g0 = 0.0f;
            this.f2429h0 = false;
            this.f2431i0 = false;
            this.f2433j0 = 0;
            this.f2435k0 = 0;
            this.f2437l0 = -1;
            this.f2439m0 = -1;
            this.f2441n0 = -1;
            this.f2443o0 = -1;
            this.f2445p0 = 1.0f;
            this.f2447q0 = 1.0f;
            this.f2449r0 = false;
            this.f2451s0 = -1;
            this.f2453t0 = -1;
        }

        /* renamed from: e */
        private void m7097e(int i, ConstraintLayout.C0678a c0678a) {
            this.f2420d = i;
            this.f2428h = c0678a.f2343d;
            this.f2430i = c0678a.f2345e;
            this.f2432j = c0678a.f2347f;
            this.f2434k = c0678a.f2349g;
            this.f2436l = c0678a.f2351h;
            this.f2438m = c0678a.f2353i;
            this.f2440n = c0678a.f2355j;
            this.f2442o = c0678a.f2357k;
            this.f2444p = c0678a.f2359l;
            this.f2446q = c0678a.f2364p;
            this.f2448r = c0678a.f2365q;
            this.f2450s = c0678a.f2366r;
            this.f2452t = c0678a.f2367s;
            this.f2454u = c0678a.f2374z;
            this.f2456v = c0678a.f2311A;
            this.f2458w = c0678a.f2312B;
            this.f2459x = c0678a.f2361m;
            this.f2460y = c0678a.f2362n;
            this.f2461z = c0678a.f2363o;
            this.f2388A = c0678a.f2326P;
            this.f2389B = c0678a.f2327Q;
            this.f2390C = c0678a.f2328R;
            this.f2426g = c0678a.f2341c;
            this.f2422e = c0678a.f2337a;
            this.f2424f = c0678a.f2339b;
            this.f2416b = ((ViewGroup.MarginLayoutParams) c0678a).width;
            this.f2418c = ((ViewGroup.MarginLayoutParams) c0678a).height;
            this.f2391D = ((ViewGroup.MarginLayoutParams) c0678a).leftMargin;
            this.f2392E = ((ViewGroup.MarginLayoutParams) c0678a).rightMargin;
            this.f2393F = ((ViewGroup.MarginLayoutParams) c0678a).topMargin;
            this.f2394G = ((ViewGroup.MarginLayoutParams) c0678a).bottomMargin;
            this.f2404Q = c0678a.f2315E;
            this.f2405R = c0678a.f2314D;
            this.f2407T = c0678a.f2317G;
            this.f2406S = c0678a.f2316F;
            boolean z = c0678a.f2329S;
            this.f2429h0 = z;
            this.f2431i0 = c0678a.f2330T;
            this.f2433j0 = c0678a.f2318H;
            this.f2435k0 = c0678a.f2319I;
            this.f2429h0 = z;
            this.f2437l0 = c0678a.f2322L;
            this.f2439m0 = c0678a.f2323M;
            this.f2441n0 = c0678a.f2320J;
            this.f2443o0 = c0678a.f2321K;
            this.f2445p0 = c0678a.f2324N;
            this.f2447q0 = c0678a.f2325O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f2395H = c0678a.getMarginEnd();
                this.f2396I = c0678a.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m7096f(int i, C0685d.C0686a c0686a) {
            m7097e(i, c0686a);
            this.f2408U = c0686a.f2463m0;
            this.f2411X = c0686a.f2466p0;
            this.f2412Y = c0686a.f2467q0;
            this.f2413Z = c0686a.f2468r0;
            this.f2415a0 = c0686a.f2469s0;
            this.f2417b0 = c0686a.f2470t0;
            this.f2419c0 = c0686a.f2471u0;
            this.f2421d0 = c0686a.f2472v0;
            this.f2423e0 = c0686a.f2473w0;
            this.f2425f0 = c0686a.f2474x0;
            this.f2427g0 = c0686a.f2475y0;
            this.f2410W = c0686a.f2465o0;
            this.f2409V = c0686a.f2464n0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m7095g(AbstractC0681b abstractC0681b, int i, C0685d.C0686a c0686a) {
            m7096f(i, c0686a);
            if (abstractC0681b instanceof C0680a) {
                this.f2453t0 = 1;
                C0680a c0680a = (C0680a) abstractC0681b;
                this.f2451s0 = c0680a.getType();
                this.f2455u0 = c0680a.getReferencedIds();
            }
        }

        /* renamed from: c */
        public void m7099c(ConstraintLayout.C0678a c0678a) {
            c0678a.f2343d = this.f2428h;
            c0678a.f2345e = this.f2430i;
            c0678a.f2347f = this.f2432j;
            c0678a.f2349g = this.f2434k;
            c0678a.f2351h = this.f2436l;
            c0678a.f2353i = this.f2438m;
            c0678a.f2355j = this.f2440n;
            c0678a.f2357k = this.f2442o;
            c0678a.f2359l = this.f2444p;
            c0678a.f2364p = this.f2446q;
            c0678a.f2365q = this.f2448r;
            c0678a.f2366r = this.f2450s;
            c0678a.f2367s = this.f2452t;
            ((ViewGroup.MarginLayoutParams) c0678a).leftMargin = this.f2391D;
            ((ViewGroup.MarginLayoutParams) c0678a).rightMargin = this.f2392E;
            ((ViewGroup.MarginLayoutParams) c0678a).topMargin = this.f2393F;
            ((ViewGroup.MarginLayoutParams) c0678a).bottomMargin = this.f2394G;
            c0678a.f2372x = this.f2403P;
            c0678a.f2373y = this.f2402O;
            c0678a.f2374z = this.f2454u;
            c0678a.f2311A = this.f2456v;
            c0678a.f2361m = this.f2459x;
            c0678a.f2362n = this.f2460y;
            c0678a.f2363o = this.f2461z;
            c0678a.f2312B = this.f2458w;
            c0678a.f2326P = this.f2388A;
            c0678a.f2327Q = this.f2389B;
            c0678a.f2315E = this.f2404Q;
            c0678a.f2314D = this.f2405R;
            c0678a.f2317G = this.f2407T;
            c0678a.f2316F = this.f2406S;
            c0678a.f2329S = this.f2429h0;
            c0678a.f2330T = this.f2431i0;
            c0678a.f2318H = this.f2433j0;
            c0678a.f2319I = this.f2435k0;
            c0678a.f2322L = this.f2437l0;
            c0678a.f2323M = this.f2439m0;
            c0678a.f2320J = this.f2441n0;
            c0678a.f2321K = this.f2443o0;
            c0678a.f2324N = this.f2445p0;
            c0678a.f2325O = this.f2447q0;
            c0678a.f2328R = this.f2390C;
            c0678a.f2341c = this.f2426g;
            c0678a.f2337a = this.f2422e;
            c0678a.f2339b = this.f2424f;
            ((ViewGroup.MarginLayoutParams) c0678a).width = this.f2416b;
            ((ViewGroup.MarginLayoutParams) c0678a).height = this.f2418c;
            if (Build.VERSION.SDK_INT >= 17) {
                c0678a.setMarginStart(this.f2396I);
                c0678a.setMarginEnd(this.f2395H);
            }
            c0678a.m7115a();
        }

        /* renamed from: d */
        public C0684b clone() {
            C0684b c0684b = new C0684b();
            c0684b.f2414a = this.f2414a;
            c0684b.f2416b = this.f2416b;
            c0684b.f2418c = this.f2418c;
            c0684b.f2422e = this.f2422e;
            c0684b.f2424f = this.f2424f;
            c0684b.f2426g = this.f2426g;
            c0684b.f2428h = this.f2428h;
            c0684b.f2430i = this.f2430i;
            c0684b.f2432j = this.f2432j;
            c0684b.f2434k = this.f2434k;
            c0684b.f2436l = this.f2436l;
            c0684b.f2438m = this.f2438m;
            c0684b.f2440n = this.f2440n;
            c0684b.f2442o = this.f2442o;
            c0684b.f2444p = this.f2444p;
            c0684b.f2446q = this.f2446q;
            c0684b.f2448r = this.f2448r;
            c0684b.f2450s = this.f2450s;
            c0684b.f2452t = this.f2452t;
            c0684b.f2454u = this.f2454u;
            c0684b.f2456v = this.f2456v;
            c0684b.f2458w = this.f2458w;
            c0684b.f2388A = this.f2388A;
            c0684b.f2389B = this.f2389B;
            c0684b.f2454u = this.f2454u;
            c0684b.f2454u = this.f2454u;
            c0684b.f2454u = this.f2454u;
            c0684b.f2454u = this.f2454u;
            c0684b.f2454u = this.f2454u;
            c0684b.f2390C = this.f2390C;
            c0684b.f2391D = this.f2391D;
            c0684b.f2392E = this.f2392E;
            c0684b.f2393F = this.f2393F;
            c0684b.f2394G = this.f2394G;
            c0684b.f2395H = this.f2395H;
            c0684b.f2396I = this.f2396I;
            c0684b.f2397J = this.f2397J;
            c0684b.f2398K = this.f2398K;
            c0684b.f2399L = this.f2399L;
            c0684b.f2400M = this.f2400M;
            c0684b.f2401N = this.f2401N;
            c0684b.f2402O = this.f2402O;
            c0684b.f2403P = this.f2403P;
            c0684b.f2404Q = this.f2404Q;
            c0684b.f2405R = this.f2405R;
            c0684b.f2406S = this.f2406S;
            c0684b.f2407T = this.f2407T;
            c0684b.f2408U = this.f2408U;
            c0684b.f2409V = this.f2409V;
            c0684b.f2410W = this.f2410W;
            c0684b.f2411X = this.f2411X;
            c0684b.f2412Y = this.f2412Y;
            c0684b.f2413Z = this.f2413Z;
            c0684b.f2415a0 = this.f2415a0;
            c0684b.f2417b0 = this.f2417b0;
            c0684b.f2419c0 = this.f2419c0;
            c0684b.f2421d0 = this.f2421d0;
            c0684b.f2423e0 = this.f2423e0;
            c0684b.f2425f0 = this.f2425f0;
            c0684b.f2427g0 = this.f2427g0;
            c0684b.f2429h0 = this.f2429h0;
            c0684b.f2431i0 = this.f2431i0;
            c0684b.f2433j0 = this.f2433j0;
            c0684b.f2435k0 = this.f2435k0;
            c0684b.f2437l0 = this.f2437l0;
            c0684b.f2439m0 = this.f2439m0;
            c0684b.f2441n0 = this.f2441n0;
            c0684b.f2443o0 = this.f2443o0;
            c0684b.f2445p0 = this.f2445p0;
            c0684b.f2447q0 = this.f2447q0;
            c0684b.f2451s0 = this.f2451s0;
            c0684b.f2453t0 = this.f2453t0;
            int[] iArr = this.f2455u0;
            if (iArr != null) {
                c0684b.f2455u0 = Arrays.copyOf(iArr, iArr.length);
            }
            c0684b.f2459x = this.f2459x;
            c0684b.f2460y = this.f2460y;
            c0684b.f2461z = this.f2461z;
            c0684b.f2449r0 = this.f2449r0;
            return c0684b;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2386c = sparseIntArray;
        sparseIntArray.append(C0690h.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f2386c.append(C0690h.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f2386c.append(C0690h.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f2386c.append(C0690h.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f2386c.append(C0690h.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f2386c.append(C0690h.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f2386c.append(C0690h.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f2386c.append(C0690h.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f2386c.append(C0690h.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f2386c.append(C0690h.ConstraintSet_layout_editor_absoluteX, 6);
        f2386c.append(C0690h.ConstraintSet_layout_editor_absoluteY, 7);
        f2386c.append(C0690h.ConstraintSet_layout_constraintGuide_begin, 17);
        f2386c.append(C0690h.ConstraintSet_layout_constraintGuide_end, 18);
        f2386c.append(C0690h.ConstraintSet_layout_constraintGuide_percent, 19);
        f2386c.append(C0690h.ConstraintSet_android_orientation, 27);
        f2386c.append(C0690h.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f2386c.append(C0690h.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f2386c.append(C0690h.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f2386c.append(C0690h.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f2386c.append(C0690h.ConstraintSet_layout_goneMarginLeft, 13);
        f2386c.append(C0690h.ConstraintSet_layout_goneMarginTop, 16);
        f2386c.append(C0690h.ConstraintSet_layout_goneMarginRight, 14);
        f2386c.append(C0690h.ConstraintSet_layout_goneMarginBottom, 11);
        f2386c.append(C0690h.ConstraintSet_layout_goneMarginStart, 15);
        f2386c.append(C0690h.ConstraintSet_layout_goneMarginEnd, 12);
        f2386c.append(C0690h.ConstraintSet_layout_constraintVertical_weight, 40);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f2386c.append(C0690h.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f2386c.append(C0690h.ConstraintSet_layout_constraintVertical_bias, 37);
        f2386c.append(C0690h.ConstraintSet_layout_constraintDimensionRatio, 5);
        f2386c.append(C0690h.ConstraintSet_layout_constraintLeft_creator, 75);
        f2386c.append(C0690h.ConstraintSet_layout_constraintTop_creator, 75);
        f2386c.append(C0690h.ConstraintSet_layout_constraintRight_creator, 75);
        f2386c.append(C0690h.ConstraintSet_layout_constraintBottom_creator, 75);
        f2386c.append(C0690h.ConstraintSet_layout_constraintBaseline_creator, 75);
        f2386c.append(C0690h.ConstraintSet_android_layout_marginLeft, 24);
        f2386c.append(C0690h.ConstraintSet_android_layout_marginRight, 28);
        f2386c.append(C0690h.ConstraintSet_android_layout_marginStart, 31);
        f2386c.append(C0690h.ConstraintSet_android_layout_marginEnd, 8);
        f2386c.append(C0690h.ConstraintSet_android_layout_marginTop, 34);
        f2386c.append(C0690h.ConstraintSet_android_layout_marginBottom, 2);
        f2386c.append(C0690h.ConstraintSet_android_layout_width, 23);
        f2386c.append(C0690h.ConstraintSet_android_layout_height, 21);
        f2386c.append(C0690h.ConstraintSet_android_visibility, 22);
        f2386c.append(C0690h.ConstraintSet_android_alpha, 43);
        f2386c.append(C0690h.ConstraintSet_android_elevation, 44);
        f2386c.append(C0690h.ConstraintSet_android_rotationX, 45);
        f2386c.append(C0690h.ConstraintSet_android_rotationY, 46);
        f2386c.append(C0690h.ConstraintSet_android_rotation, 60);
        f2386c.append(C0690h.ConstraintSet_android_scaleX, 47);
        f2386c.append(C0690h.ConstraintSet_android_scaleY, 48);
        f2386c.append(C0690h.ConstraintSet_android_transformPivotX, 49);
        f2386c.append(C0690h.ConstraintSet_android_transformPivotY, 50);
        f2386c.append(C0690h.ConstraintSet_android_translationX, 51);
        f2386c.append(C0690h.ConstraintSet_android_translationY, 52);
        f2386c.append(C0690h.ConstraintSet_android_translationZ, 53);
        f2386c.append(C0690h.ConstraintSet_layout_constraintWidth_default, 54);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHeight_default, 55);
        f2386c.append(C0690h.ConstraintSet_layout_constraintWidth_max, 56);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHeight_max, 57);
        f2386c.append(C0690h.ConstraintSet_layout_constraintWidth_min, 58);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHeight_min, 59);
        f2386c.append(C0690h.ConstraintSet_layout_constraintCircle, 61);
        f2386c.append(C0690h.ConstraintSet_layout_constraintCircleRadius, 62);
        f2386c.append(C0690h.ConstraintSet_layout_constraintCircleAngle, 63);
        f2386c.append(C0690h.ConstraintSet_android_id, 38);
        f2386c.append(C0690h.ConstraintSet_layout_constraintWidth_percent, 69);
        f2386c.append(C0690h.ConstraintSet_layout_constraintHeight_percent, 70);
        f2386c.append(C0690h.ConstraintSet_chainUseRtl, 71);
        f2386c.append(C0690h.ConstraintSet_barrierDirection, 72);
        f2386c.append(C0690h.ConstraintSet_constraint_referenced_ids, 73);
        f2386c.append(C0690h.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: c */
    private int[] m7106c(View view, String str) {
        int i;
        Object m7128c;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0689g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m7128c = ((ConstraintLayout) view.getParent()).m7128c(0, trim)) != null && (m7128c instanceof Integer)) {
                i = ((Integer) m7128c).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: d */
    private C0684b m7105d(Context context, AttributeSet attributeSet) {
        C0684b c0684b = new C0684b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0690h.ConstraintSet);
        m7102g(c0684b, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0684b;
    }

    /* renamed from: f */
    private static int m7103f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: g */
    private void m7102g(C0684b c0684b, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f2386c.get(index);
            switch (i2) {
                case 1:
                    c0684b.f2444p = m7103f(typedArray, index, c0684b.f2444p);
                    break;
                case 2:
                    c0684b.f2394G = typedArray.getDimensionPixelSize(index, c0684b.f2394G);
                    break;
                case 3:
                    c0684b.f2442o = m7103f(typedArray, index, c0684b.f2442o);
                    break;
                case 4:
                    c0684b.f2440n = m7103f(typedArray, index, c0684b.f2440n);
                    break;
                case 5:
                    c0684b.f2458w = typedArray.getString(index);
                    break;
                case 6:
                    c0684b.f2388A = typedArray.getDimensionPixelOffset(index, c0684b.f2388A);
                    break;
                case 7:
                    c0684b.f2389B = typedArray.getDimensionPixelOffset(index, c0684b.f2389B);
                    break;
                case 8:
                    c0684b.f2395H = typedArray.getDimensionPixelSize(index, c0684b.f2395H);
                    break;
                case 9:
                    c0684b.f2452t = m7103f(typedArray, index, c0684b.f2452t);
                    break;
                case 10:
                    c0684b.f2450s = m7103f(typedArray, index, c0684b.f2450s);
                    break;
                case 11:
                    c0684b.f2401N = typedArray.getDimensionPixelSize(index, c0684b.f2401N);
                    break;
                case 12:
                    c0684b.f2402O = typedArray.getDimensionPixelSize(index, c0684b.f2402O);
                    break;
                case 13:
                    c0684b.f2398K = typedArray.getDimensionPixelSize(index, c0684b.f2398K);
                    break;
                case 14:
                    c0684b.f2400M = typedArray.getDimensionPixelSize(index, c0684b.f2400M);
                    break;
                case 15:
                    c0684b.f2403P = typedArray.getDimensionPixelSize(index, c0684b.f2403P);
                    break;
                case 16:
                    c0684b.f2399L = typedArray.getDimensionPixelSize(index, c0684b.f2399L);
                    break;
                case 17:
                    c0684b.f2422e = typedArray.getDimensionPixelOffset(index, c0684b.f2422e);
                    break;
                case 18:
                    c0684b.f2424f = typedArray.getDimensionPixelOffset(index, c0684b.f2424f);
                    break;
                case 19:
                    c0684b.f2426g = typedArray.getFloat(index, c0684b.f2426g);
                    break;
                case 20:
                    c0684b.f2454u = typedArray.getFloat(index, c0684b.f2454u);
                    break;
                case 21:
                    c0684b.f2418c = typedArray.getLayoutDimension(index, c0684b.f2418c);
                    break;
                case 22:
                    int i3 = typedArray.getInt(index, c0684b.f2397J);
                    c0684b.f2397J = i3;
                    c0684b.f2397J = f2385b[i3];
                    break;
                case 23:
                    c0684b.f2416b = typedArray.getLayoutDimension(index, c0684b.f2416b);
                    break;
                case 24:
                    c0684b.f2391D = typedArray.getDimensionPixelSize(index, c0684b.f2391D);
                    break;
                case 25:
                    c0684b.f2428h = m7103f(typedArray, index, c0684b.f2428h);
                    break;
                case 26:
                    c0684b.f2430i = m7103f(typedArray, index, c0684b.f2430i);
                    break;
                case 27:
                    c0684b.f2390C = typedArray.getInt(index, c0684b.f2390C);
                    break;
                case 28:
                    c0684b.f2392E = typedArray.getDimensionPixelSize(index, c0684b.f2392E);
                    break;
                case 29:
                    c0684b.f2432j = m7103f(typedArray, index, c0684b.f2432j);
                    break;
                case 30:
                    c0684b.f2434k = m7103f(typedArray, index, c0684b.f2434k);
                    break;
                case 31:
                    c0684b.f2396I = typedArray.getDimensionPixelSize(index, c0684b.f2396I);
                    break;
                case 32:
                    c0684b.f2446q = m7103f(typedArray, index, c0684b.f2446q);
                    break;
                case 33:
                    c0684b.f2448r = m7103f(typedArray, index, c0684b.f2448r);
                    break;
                case 34:
                    c0684b.f2393F = typedArray.getDimensionPixelSize(index, c0684b.f2393F);
                    break;
                case 35:
                    c0684b.f2438m = m7103f(typedArray, index, c0684b.f2438m);
                    break;
                case 36:
                    c0684b.f2436l = m7103f(typedArray, index, c0684b.f2436l);
                    break;
                case 37:
                    c0684b.f2456v = typedArray.getFloat(index, c0684b.f2456v);
                    break;
                case 38:
                    c0684b.f2420d = typedArray.getResourceId(index, c0684b.f2420d);
                    break;
                case 39:
                    c0684b.f2405R = typedArray.getFloat(index, c0684b.f2405R);
                    break;
                case 40:
                    c0684b.f2404Q = typedArray.getFloat(index, c0684b.f2404Q);
                    break;
                case 41:
                    c0684b.f2406S = typedArray.getInt(index, c0684b.f2406S);
                    break;
                case 42:
                    c0684b.f2407T = typedArray.getInt(index, c0684b.f2407T);
                    break;
                case 43:
                    c0684b.f2408U = typedArray.getFloat(index, c0684b.f2408U);
                    break;
                case 44:
                    c0684b.f2409V = true;
                    c0684b.f2410W = typedArray.getDimension(index, c0684b.f2410W);
                    break;
                case 45:
                    c0684b.f2412Y = typedArray.getFloat(index, c0684b.f2412Y);
                    break;
                case 46:
                    c0684b.f2413Z = typedArray.getFloat(index, c0684b.f2413Z);
                    break;
                case 47:
                    c0684b.f2415a0 = typedArray.getFloat(index, c0684b.f2415a0);
                    break;
                case 48:
                    c0684b.f2417b0 = typedArray.getFloat(index, c0684b.f2417b0);
                    break;
                case 49:
                    c0684b.f2419c0 = typedArray.getFloat(index, c0684b.f2419c0);
                    break;
                case 50:
                    c0684b.f2421d0 = typedArray.getFloat(index, c0684b.f2421d0);
                    break;
                case 51:
                    c0684b.f2423e0 = typedArray.getDimension(index, c0684b.f2423e0);
                    break;
                case 52:
                    c0684b.f2425f0 = typedArray.getDimension(index, c0684b.f2425f0);
                    break;
                case 53:
                    c0684b.f2427g0 = typedArray.getDimension(index, c0684b.f2427g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c0684b.f2411X = typedArray.getFloat(index, c0684b.f2411X);
                            continue;
                        case 61:
                            c0684b.f2459x = m7103f(typedArray, index, c0684b.f2459x);
                            continue;
                        case 62:
                            c0684b.f2460y = typedArray.getDimensionPixelSize(index, c0684b.f2460y);
                            continue;
                        case 63:
                            c0684b.f2461z = typedArray.getFloat(index, c0684b.f2461z);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    c0684b.f2445p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    c0684b.f2447q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    c0684b.f2451s0 = typedArray.getInt(index, c0684b.f2451s0);
                                    break;
                                case 73:
                                    c0684b.f2457v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    c0684b.f2449r0 = typedArray.getBoolean(index, c0684b.f2449r0);
                                    break;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f2386c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f2386c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                            }
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7108a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2387a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f2387a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0684b c0684b = this.f2387a.get(Integer.valueOf(id));
                if (childAt instanceof C0680a) {
                    c0684b.f2453t0 = 1;
                }
                int i2 = c0684b.f2453t0;
                if (i2 != -1 && i2 == 1) {
                    C0680a c0680a = (C0680a) childAt;
                    c0680a.setId(id);
                    c0680a.setType(c0684b.f2451s0);
                    c0680a.setAllowsGoneWidget(c0684b.f2449r0);
                    int[] iArr = c0684b.f2455u0;
                    if (iArr != null) {
                        c0680a.setReferencedIds(iArr);
                    } else {
                        String str = c0684b.f2457v0;
                        if (str != null) {
                            int[] m7106c = m7106c(c0680a, str);
                            c0684b.f2455u0 = m7106c;
                            c0680a.setReferencedIds(m7106c);
                        }
                    }
                }
                ConstraintLayout.C0678a c0678a = (ConstraintLayout.C0678a) childAt.getLayoutParams();
                c0684b.m7099c(c0678a);
                childAt.setLayoutParams(c0678a);
                childAt.setVisibility(c0684b.f2397J);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0684b.f2408U);
                    childAt.setRotation(c0684b.f2411X);
                    childAt.setRotationX(c0684b.f2412Y);
                    childAt.setRotationY(c0684b.f2413Z);
                    childAt.setScaleX(c0684b.f2415a0);
                    childAt.setScaleY(c0684b.f2417b0);
                    if (!Float.isNaN(c0684b.f2419c0)) {
                        childAt.setPivotX(c0684b.f2419c0);
                    }
                    if (!Float.isNaN(c0684b.f2421d0)) {
                        childAt.setPivotY(c0684b.f2421d0);
                    }
                    childAt.setTranslationX(c0684b.f2423e0);
                    childAt.setTranslationY(c0684b.f2425f0);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0684b.f2427g0);
                        if (c0684b.f2409V) {
                            childAt.setElevation(c0684b.f2410W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0684b c0684b2 = this.f2387a.get(num);
            int i3 = c0684b2.f2453t0;
            if (i3 != -1 && i3 == 1) {
                C0680a c0680a2 = new C0680a(constraintLayout.getContext());
                c0680a2.setId(num.intValue());
                int[] iArr2 = c0684b2.f2455u0;
                if (iArr2 != null) {
                    c0680a2.setReferencedIds(iArr2);
                } else {
                    String str2 = c0684b2.f2457v0;
                    if (str2 != null) {
                        int[] m7106c2 = m7106c(c0680a2, str2);
                        c0684b2.f2455u0 = m7106c2;
                        c0680a2.setReferencedIds(m7106c2);
                    }
                }
                c0680a2.setType(c0684b2.f2451s0);
                ConstraintLayout.C0678a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                c0680a2.m7109f();
                c0684b2.m7099c(generateDefaultLayoutParams);
                constraintLayout.addView(c0680a2, generateDefaultLayoutParams);
            }
            if (c0684b2.f2414a) {
                View c0687e = new C0687e(constraintLayout.getContext());
                c0687e.setId(num.intValue());
                ConstraintLayout.C0678a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0684b2.m7099c(generateDefaultLayoutParams2);
                constraintLayout.addView(c0687e, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: b */
    public void m7107b(C0685d c0685d) {
        int childCount = c0685d.getChildCount();
        this.f2387a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c0685d.getChildAt(i);
            C0685d.C0686a c0686a = (C0685d.C0686a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2387a.containsKey(Integer.valueOf(id))) {
                this.f2387a.put(Integer.valueOf(id), new C0684b());
            }
            C0684b c0684b = this.f2387a.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0681b) {
                c0684b.m7095g((AbstractC0681b) childAt, id, c0686a);
            }
            c0684b.m7096f(id, c0686a);
        }
    }

    /* renamed from: e */
    public void m7104e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0684b m7105d = m7105d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m7105d.f2414a = true;
                    }
                    this.f2387a.put(Integer.valueOf(m7105d.f2420d), m7105d);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
