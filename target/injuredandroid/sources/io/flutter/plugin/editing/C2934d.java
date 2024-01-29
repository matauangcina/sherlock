package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.C2786a;
import io.flutter.embedding.engine.p159i.C2907m;
import io.flutter.plugin.editing.C2931c;
import io.flutter.plugin.platform.C2958j;
import java.util.HashMap;
/* renamed from: io.flutter.plugin.editing.d */
/* loaded from: classes.dex */
public class C2934d implements C2931c.InterfaceC2933b {

    /* renamed from: a */
    private final View f7318a;

    /* renamed from: b */
    private final InputMethodManager f7319b;

    /* renamed from: c */
    private final AutofillManager f7320c;

    /* renamed from: d */
    private final C2907m f7321d;

    /* renamed from: e */
    private C2937c f7322e = new C2937c(C2937c.EnumC2938a.NO_TARGET, 0);

    /* renamed from: f */
    private C2907m.C2909b f7323f;

    /* renamed from: g */
    private SparseArray<C2907m.C2909b> f7324g;

    /* renamed from: h */
    private C2931c f7325h;

    /* renamed from: i */
    private boolean f7326i;

    /* renamed from: j */
    private InputConnection f7327j;

    /* renamed from: k */
    private C2958j f7328k;

    /* renamed from: l */
    private Rect f7329l;

    /* renamed from: m */
    private final boolean f7330m;

    /* renamed from: n */
    private ImeSyncDeferringInsetsCallback f7331n;

    /* renamed from: o */
    private C2786a f7332o;

    /* renamed from: p */
    private C2907m.C2913e f7333p;

    /* renamed from: q */
    private boolean f7334q;

    /* renamed from: io.flutter.plugin.editing.d$a */
    /* loaded from: classes.dex */
    class C2935a implements C2907m.InterfaceC2914f {
        C2935a() {
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: a */
        public void mo304a() {
            C2934d c2934d = C2934d.this;
            c2934d.m333E(c2934d.f7318a);
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: b */
        public void mo303b() {
            C2934d.this.m320k();
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: c */
        public void mo302c(int i, C2907m.C2909b c2909b) {
            C2934d.this.m335C(i, c2909b);
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: d */
        public void mo301d(C2907m.C2913e c2913e) {
            C2934d c2934d = C2934d.this;
            c2934d.m334D(c2934d.f7318a, c2913e);
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: e */
        public void mo300e(String str, Bundle bundle) {
            C2934d.this.m305z(str, bundle);
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: f */
        public void mo299f(int i) {
            C2934d.this.m336B(i);
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: g */
        public void mo298g(double d, double d2, double[] dArr) {
            C2934d.this.m306y(d, d2, dArr);
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: h */
        public void mo297h() {
            C2934d.this.m309v();
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: i */
        public void mo296i(boolean z) {
            if (Build.VERSION.SDK_INT < 26 || C2934d.this.f7320c == null) {
                return;
            }
            if (z) {
                C2934d.this.f7320c.commit();
            } else {
                C2934d.this.f7320c.cancel();
            }
        }

        @Override // io.flutter.embedding.engine.p159i.C2907m.InterfaceC2914f
        /* renamed from: j */
        public void mo295j() {
            C2934d c2934d = C2934d.this;
            c2934d.m315p(c2934d.f7318a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.editing.d$b */
    /* loaded from: classes.dex */
    public class C2936b implements InterfaceC2939d {

        /* renamed from: a */
        final /* synthetic */ boolean f7336a;

        /* renamed from: b */
        final /* synthetic */ double[] f7337b;

        /* renamed from: c */
        final /* synthetic */ double[] f7338c;

        C2936b(C2934d c2934d, boolean z, double[] dArr, double[] dArr2) {
            this.f7336a = z;
            this.f7337b = dArr;
            this.f7338c = dArr2;
        }

        @Override // io.flutter.plugin.editing.C2934d.InterfaceC2939d
        /* renamed from: a */
        public void mo294a(double d, double d2) {
            double d3 = 1.0d;
            if (!this.f7336a) {
                double[] dArr = this.f7337b;
                d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
            }
            double[] dArr2 = this.f7337b;
            double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
            double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
            double[] dArr3 = this.f7338c;
            if (d4 < dArr3[0]) {
                dArr3[0] = d4;
            } else if (d4 > dArr3[1]) {
                dArr3[1] = d4;
            }
            double[] dArr4 = this.f7338c;
            if (d5 < dArr4[2]) {
                dArr4[2] = d5;
            } else if (d5 > dArr4[3]) {
                dArr4[3] = d5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.plugin.editing.d$c */
    /* loaded from: classes.dex */
    public static class C2937c {

        /* renamed from: a */
        EnumC2938a f7339a;

        /* renamed from: b */
        int f7340b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.flutter.plugin.editing.d$c$a */
        /* loaded from: classes.dex */
        public enum EnumC2938a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            PLATFORM_VIEW
        }

        public C2937c(EnumC2938a enumC2938a, int i) {
            this.f7339a = enumC2938a;
            this.f7340b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.plugin.editing.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2939d {
        /* renamed from: a */
        void mo294a(double d, double d2);
    }

    public C2934d(View view, C2907m c2907m, C2958j c2958j) {
        this.f7318a = view;
        this.f7319b = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.f7320c = Build.VERSION.SDK_INT >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (Build.VERSION.SDK_INT >= 30) {
            int navigationBars = (this.f7318a.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : 0;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (this.f7318a.getWindowSystemUiVisibility() & 4) == 0 ? navigationBars | WindowInsets.Type.statusBars() : navigationBars, WindowInsets.Type.ime());
            this.f7331n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f7321d = c2907m;
        c2907m.m401l(new C2935a());
        c2907m.m404i();
        this.f7328k = c2958j;
        c2958j.m187u(this);
        this.f7330m = m313r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m336B(int i) {
        this.f7318a.requestFocus();
        this.f7322e = new C2937c(C2937c.EnumC2938a.PLATFORM_VIEW, i);
        this.f7319b.restartInput(this.f7318a);
        this.f7326i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m333E(View view) {
        view.requestFocus();
        this.f7319b.showSoftInput(view, 0);
    }

    /* renamed from: G */
    private void m331G(C2907m.C2909b c2909b) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (c2909b == null || c2909b.f7219h == null) {
            this.f7324g = null;
            return;
        }
        C2907m.C2909b[] c2909bArr = c2909b.f7220i;
        SparseArray<C2907m.C2909b> sparseArray = new SparseArray<>();
        this.f7324g = sparseArray;
        if (c2909bArr == null) {
            sparseArray.put(c2909b.f7219h.f7221a.hashCode(), c2909b);
            return;
        }
        for (C2907m.C2909b c2909b2 : c2909bArr) {
            C2907m.C2909b.C2910a c2910a = c2909b2.f7219h;
            if (c2910a != null) {
                this.f7324g.put(c2910a.f7221a.hashCode(), c2909b2);
                this.f7320c.notifyValueChanged(this.f7318a, c2910a.f7221a.hashCode(), AutofillValue.forText(c2910a.f7223c.f7233a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m315p(View view) {
        m308w();
        this.f7319b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* renamed from: q */
    private static int m314q(C2907m.C2911c c2911c, boolean z, boolean z2, boolean z3, C2907m.EnumC2912d enumC2912d) {
        C2907m.EnumC2915g enumC2915g = c2911c.f7224a;
        if (enumC2915g == C2907m.EnumC2915g.DATETIME) {
            return 4;
        }
        if (enumC2915g == C2907m.EnumC2915g.NUMBER) {
            int i = c2911c.f7225b ? 4098 : 2;
            return c2911c.f7226c ? i | 8192 : i;
        } else if (enumC2915g == C2907m.EnumC2915g.PHONE) {
            return 3;
        } else {
            int i2 = 1;
            if (enumC2915g == C2907m.EnumC2915g.MULTILINE) {
                i2 = 131073;
            } else if (enumC2915g == C2907m.EnumC2915g.EMAIL_ADDRESS) {
                i2 = 33;
            } else if (enumC2915g == C2907m.EnumC2915g.URL) {
                i2 = 17;
            } else if (enumC2915g == C2907m.EnumC2915g.VISIBLE_PASSWORD) {
                i2 = 145;
            } else if (enumC2915g == C2907m.EnumC2915g.NAME) {
                i2 = 97;
            } else if (enumC2915g == C2907m.EnumC2915g.POSTAL_ADDRESS) {
                i2 = 113;
            }
            if (z) {
                i2 = i2 | 524288 | 128;
            } else {
                if (z2) {
                    i2 |= 32768;
                }
                if (!z3) {
                    i2 |= 524288;
                }
            }
            return enumC2912d == C2907m.EnumC2912d.CHARACTERS ? i2 | 4096 : enumC2912d == C2907m.EnumC2912d.WORDS ? i2 | 8192 : enumC2912d == C2907m.EnumC2912d.SENTENCES ? i2 | 16384 : i2;
        }
    }

    /* renamed from: r */
    private boolean m313r() {
        if (this.f7319b.getCurrentInputMethodSubtype() == null || Build.VERSION.SDK_INT < 21 || !Build.MANUFACTURER.equals("samsung")) {
            return false;
        }
        return Settings.Secure.getString(this.f7318a.getContext().getContentResolver(), "default_input_method").contains("Samsung");
    }

    /* renamed from: t */
    private boolean m311t() {
        return this.f7324g != null;
    }

    /* renamed from: u */
    private void m310u(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f7320c == null || !m311t()) {
            return;
        }
        this.f7320c.notifyValueChanged(this.f7318a, this.f7323f.f7219h.f7221a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m309v() {
        if (Build.VERSION.SDK_INT < 26 || this.f7320c == null || !m311t()) {
            return;
        }
        String str = this.f7323f.f7219h.f7221a;
        int[] iArr = new int[2];
        this.f7318a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f7329l);
        rect.offset(iArr[0], iArr[1]);
        this.f7320c.notifyViewEntered(this.f7318a, str.hashCode(), rect);
    }

    /* renamed from: w */
    private void m308w() {
        C2907m.C2909b c2909b;
        if (Build.VERSION.SDK_INT < 26 || this.f7320c == null || (c2909b = this.f7323f) == null || c2909b.f7219h == null || !m311t()) {
            return;
        }
        this.f7320c.notifyViewExited(this.f7318a, this.f7323f.f7219h.f7221a.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m306y(double d, double d2, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d3 = dArr[12] / dArr[15];
        dArr2[1] = d3;
        dArr2[0] = d3;
        double d4 = dArr[13] / dArr[15];
        dArr2[3] = d4;
        dArr2[2] = d4;
        C2936b c2936b = new C2936b(this, z, dArr, dArr2);
        c2936b.mo294a(d, 0.0d);
        c2936b.mo294a(d, d2);
        c2936b.mo294a(0.0d, d2);
        Float valueOf = Float.valueOf(this.f7318a.getContext().getResources().getDisplayMetrics().density);
        this.f7329l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* renamed from: A */
    public void m337A(C2786a c2786a) {
        this.f7332o = c2786a;
    }

    /* renamed from: C */
    void m335C(int i, C2907m.C2909b c2909b) {
        m308w();
        this.f7322e = new C2937c(C2937c.EnumC2938a.FRAMEWORK_CLIENT, i);
        C2931c c2931c = this.f7325h;
        if (c2931c != null) {
            c2931c.m340j(this);
        }
        C2907m.C2909b.C2910a c2910a = c2909b.f7219h;
        this.f7325h = new C2931c(c2910a != null ? c2910a.f7223c : null, this.f7318a);
        this.f7323f = c2909b;
        m331G(c2909b);
        this.f7326i = true;
        m332F();
        this.f7329l = null;
        this.f7325h.m349a(this);
    }

    /* renamed from: D */
    void m334D(View view, C2907m.C2913e c2913e) {
        this.f7333p = c2913e;
        this.f7325h.m338l(c2913e);
        if (this.f7330m || this.f7326i) {
            this.f7319b.restartInput(view);
            this.f7326i = false;
        }
    }

    /* renamed from: F */
    public void m332F() {
        this.f7334q = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r7 == r0.f7237e) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // io.flutter.plugin.editing.C2931c.InterfaceC2933b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo330a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.c r9 = r8.f7325h
            java.lang.String r9 = r9.toString()
            r8.m310u(r9)
        Lb:
            io.flutter.plugin.editing.c r9 = r8.f7325h
            int r9 = r9.m343g()
            io.flutter.plugin.editing.c r10 = r8.f7325h
            int r10 = r10.m344f()
            io.flutter.plugin.editing.c r11 = r8.f7325h
            int r11 = r11.m345e()
            io.flutter.plugin.editing.c r0 = r8.f7325h
            int r7 = r0.m346d()
            io.flutter.embedding.engine.i.m$e r0 = r8.f7333p
            if (r0 == 0) goto L4c
            io.flutter.plugin.editing.c r0 = r8.f7325h
            java.lang.String r0 = r0.toString()
            io.flutter.embedding.engine.i.m$e r1 = r8.f7333p
            java.lang.String r1 = r1.f7233a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            io.flutter.embedding.engine.i.m$e r0 = r8.f7333p
            int r1 = r0.f7234b
            if (r9 != r1) goto L4a
            int r1 = r0.f7235c
            if (r10 != r1) goto L4a
            int r1 = r0.f7236d
            if (r11 != r1) goto L4a
            int r0 = r0.f7237e
            if (r7 != r0) goto L4a
            goto L4c
        L4a:
            r0 = 0
            goto L4d
        L4c:
            r0 = 1
        L4d:
            if (r0 != 0) goto L90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send EditingState to flutter: "
            r0.append(r1)
            io.flutter.plugin.editing.c r1 = r8.f7325h
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextInputPlugin"
            p108c.p109a.C1499b.m4050d(r1, r0)
            io.flutter.embedding.engine.i.m r0 = r8.f7321d
            io.flutter.plugin.editing.d$c r1 = r8.f7322e
            int r1 = r1.f7340b
            io.flutter.plugin.editing.c r2 = r8.f7325h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.m399n(r1, r2, r3, r4, r5, r6)
            io.flutter.embedding.engine.i.m$e r6 = new io.flutter.embedding.engine.i.m$e
            io.flutter.plugin.editing.c r0 = r8.f7325h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f7333p = r6
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C2934d.mo330a(boolean, boolean, boolean):void");
    }

    /* renamed from: i */
    public void m322i(SparseArray<AutofillValue> sparseArray) {
        C2907m.C2909b.C2910a c2910a;
        C2907m.C2909b.C2910a c2910a2;
        if (Build.VERSION.SDK_INT >= 26 && (c2910a = this.f7323f.f7219h) != null) {
            HashMap<String, C2907m.C2913e> hashMap = new HashMap<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                C2907m.C2909b c2909b = this.f7324g.get(sparseArray.keyAt(i));
                if (c2909b != null && (c2910a2 = c2909b.f7219h) != null) {
                    String charSequence = sparseArray.valueAt(i).getTextValue().toString();
                    C2907m.C2913e c2913e = new C2907m.C2913e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (c2910a2.f7221a.equals(c2910a.f7221a)) {
                        m334D(this.f7318a, c2913e);
                    }
                    hashMap.put(c2910a2.f7221a, c2913e);
                }
            }
            this.f7321d.m398o(this.f7322e.f7340b, hashMap);
        }
    }

    /* renamed from: j */
    public void m321j(int i) {
        C2937c c2937c = this.f7322e;
        if (c2937c.f7339a == C2937c.EnumC2938a.PLATFORM_VIEW && c2937c.f7340b == i) {
            this.f7322e = new C2937c(C2937c.EnumC2938a.NO_TARGET, 0);
            m315p(this.f7318a);
            this.f7319b.restartInput(this.f7318a);
            this.f7326i = false;
        }
    }

    /* renamed from: k */
    void m320k() {
        if (this.f7322e.f7339a == C2937c.EnumC2938a.PLATFORM_VIEW) {
            return;
        }
        this.f7325h.m340j(this);
        m308w();
        m331G(null);
        this.f7322e = new C2937c(C2937c.EnumC2938a.NO_TARGET, 0);
        m332F();
        this.f7329l = null;
    }

    /* renamed from: l */
    public InputConnection m319l(View view, EditorInfo editorInfo) {
        InputConnection onCreateInputConnection;
        C2937c c2937c = this.f7322e;
        C2937c.EnumC2938a enumC2938a = c2937c.f7339a;
        if (enumC2938a == C2937c.EnumC2938a.NO_TARGET) {
            onCreateInputConnection = null;
        } else if (enumC2938a != C2937c.EnumC2938a.PLATFORM_VIEW) {
            C2907m.C2909b c2909b = this.f7323f;
            int m314q = m314q(c2909b.f7216e, c2909b.f7212a, c2909b.f7213b, c2909b.f7214c, c2909b.f7215d);
            editorInfo.inputType = m314q;
            editorInfo.imeOptions = 33554432;
            Integer num = this.f7323f.f7217f;
            int intValue = num == null ? (m314q & 131072) != 0 ? 1 : 6 : num.intValue();
            String str = this.f7323f.f7218g;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions = intValue | editorInfo.imeOptions;
            C2930b c2930b = new C2930b(view, this.f7322e.f7340b, this.f7321d, this.f7332o, this.f7325h, editorInfo);
            editorInfo.initialSelStart = this.f7325h.m343g();
            editorInfo.initialSelEnd = this.f7325h.m344f();
            this.f7327j = c2930b;
            return c2930b;
        } else if (this.f7334q) {
            return this.f7327j;
        } else {
            onCreateInputConnection = this.f7328k.mo204d(Integer.valueOf(c2937c.f7340b)).onCreateInputConnection(editorInfo);
        }
        this.f7327j = onCreateInputConnection;
        return onCreateInputConnection;
    }

    /* renamed from: m */
    public void m318m() {
        this.f7328k.m232D();
        this.f7321d.m401l(null);
        m308w();
        C2931c c2931c = this.f7325h;
        if (c2931c != null) {
            c2931c.m340j(this);
        }
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7331n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* renamed from: n */
    public InputMethodManager m317n() {
        return this.f7319b;
    }

    /* renamed from: o */
    public InputConnection m316o() {
        return this.f7327j;
    }

    /* renamed from: s */
    public void m312s() {
        if (this.f7322e.f7339a == C2937c.EnumC2938a.PLATFORM_VIEW) {
            this.f7334q = true;
        }
    }

    /* renamed from: x */
    public void m307x(ViewStructure viewStructure, int i) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !m311t()) {
            return;
        }
        String str = this.f7323f.f7219h.f7221a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i2 = 0; i2 < this.f7324g.size(); i2++) {
            int keyAt = this.f7324g.keyAt(i2);
            C2907m.C2909b.C2910a c2910a = this.f7324g.valueAt(i2).f7219h;
            if (c2910a != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i2);
                newChild.setAutofillId(autofillId, keyAt);
                newChild.setAutofillHints(c2910a.f7222b);
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                if (str.hashCode() != keyAt || (rect = this.f7329l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = c2910a.f7223c.f7233a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f7329l.height());
                    charSequence = this.f7325h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }

    /* renamed from: z */
    public void m305z(String str, Bundle bundle) {
        this.f7319b.sendAppPrivateCommand(this.f7318a, str, bundle);
    }
}
