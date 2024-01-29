package io.flutter.view;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.p159i.C2869b;
import io.flutter.plugin.platform.InterfaceC2957i;
import io.flutter.view.C2974c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p108c.p109a.C1499b;
import p108c.p109a.p114d.InterfaceC1539b;
/* renamed from: io.flutter.view.c */
/* loaded from: classes.dex */
public class C2974c extends AccessibilityNodeProvider {

    /* renamed from: y */
    private static int f7425y = 267386881;

    /* renamed from: a */
    private final View f7426a;

    /* renamed from: b */
    private final C2869b f7427b;

    /* renamed from: c */
    private final AccessibilityManager f7428c;

    /* renamed from: d */
    private final AccessibilityViewEmbedder f7429d;

    /* renamed from: e */
    private final InterfaceC2957i f7430e;

    /* renamed from: f */
    private final ContentResolver f7431f;

    /* renamed from: g */
    private final Map<Integer, C2984j> f7432g;

    /* renamed from: h */
    private final Map<Integer, C2981g> f7433h;

    /* renamed from: i */
    private C2984j f7434i;

    /* renamed from: j */
    private Integer f7435j;

    /* renamed from: k */
    private Integer f7436k;

    /* renamed from: l */
    private int f7437l;

    /* renamed from: m */
    private C2984j f7438m;

    /* renamed from: n */
    private C2984j f7439n;

    /* renamed from: o */
    private C2984j f7440o;

    /* renamed from: p */
    private final List<Integer> f7441p;

    /* renamed from: q */
    private int f7442q;

    /* renamed from: r */
    private Integer f7443r;

    /* renamed from: s */
    private InterfaceC2983i f7444s;

    /* renamed from: t */
    private boolean f7445t;

    /* renamed from: u */
    private final C2869b.InterfaceC2871b f7446u;

    /* renamed from: v */
    private final AccessibilityManager.AccessibilityStateChangeListener f7447v;

    /* renamed from: w */
    private final AccessibilityManager.TouchExplorationStateChangeListener f7448w;

    /* renamed from: x */
    private final ContentObserver f7449x;

    /* renamed from: io.flutter.view.c$a */
    /* loaded from: classes.dex */
    class C2975a implements C2869b.InterfaceC2871b {
        C2975a() {
        }

        @Override // io.flutter.embedding.engine.p159i.C2869b.InterfaceC2871b
        /* renamed from: a */
        public void mo96a(String str) {
            C2974c.this.f7426a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.InterfaceC2818a
        /* renamed from: b */
        public void mo95b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            C2974c.this.m125M(byteBuffer, strArr);
        }

        @Override // io.flutter.embedding.engine.p159i.C2869b.InterfaceC2871b
        /* renamed from: c */
        public void mo94c(String str) {
            AccessibilityEvent m137A = C2974c.this.m137A(0, 32);
            m137A.getText().add(str);
            C2974c.this.m131G(m137A);
        }

        @Override // io.flutter.embedding.engine.p159i.C2869b.InterfaceC2871b
        /* renamed from: d */
        public void mo93d(int i) {
            C2974c.this.m132F(i, 2);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.InterfaceC2818a
        /* renamed from: e */
        public void mo92e(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            C2974c.this.m124N(byteBuffer, strArr);
        }

        @Override // io.flutter.embedding.engine.p159i.C2869b.InterfaceC2871b
        /* renamed from: f */
        public void mo91f(int i) {
            C2974c.this.m132F(i, 1);
        }
    }

    /* renamed from: io.flutter.view.c$b  reason: invalid class name */
    /* loaded from: classes.dex */
    class accessibilityAccessibilityManager$AccessibilityStateChangeListenerC2976b implements AccessibilityManager.AccessibilityStateChangeListener {
        accessibilityAccessibilityManager$AccessibilityStateChangeListenerC2976b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            if (C2974c.this.f7445t) {
                return;
            }
            C2869b c2869b = C2974c.this.f7427b;
            if (z) {
                c2869b.m479g(C2974c.this.f7446u);
                C2974c.this.f7427b.m481e();
            } else {
                c2869b.m479g(null);
                C2974c.this.f7427b.m482d();
            }
            if (C2974c.this.f7444s != null) {
                C2974c.this.f7444s.mo80a(z, C2974c.this.f7428c.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.c$c */
    /* loaded from: classes.dex */
    class C2977c extends ContentObserver {
        C2977c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            onChange(z, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            C2974c c2974c;
            int i;
            if (C2974c.this.f7445t) {
                return;
            }
            String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(C2974c.this.f7431f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                c2974c = C2974c.this;
                i = c2974c.f7437l | EnumC2979e.DISABLE_ANIMATIONS.f7459f;
            } else {
                c2974c = C2974c.this;
                i = c2974c.f7437l & (~EnumC2979e.DISABLE_ANIMATIONS.f7459f);
            }
            c2974c.f7437l = i;
            C2974c.this.m130H();
        }
    }

    /* renamed from: io.flutter.view.c$d  reason: invalid class name */
    /* loaded from: classes.dex */
    class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC2978d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilityManager f7453a;

        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC2978d(AccessibilityManager accessibilityManager) {
            this.f7453a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            int i;
            if (C2974c.this.f7445t) {
                return;
            }
            C2974c c2974c = C2974c.this;
            if (z) {
                i = c2974c.f7437l | EnumC2979e.ACCESSIBLE_NAVIGATION.f7459f;
            } else {
                c2974c.m135C();
                c2974c = C2974c.this;
                i = c2974c.f7437l & (~EnumC2979e.ACCESSIBLE_NAVIGATION.f7459f);
            }
            c2974c.f7437l = i;
            C2974c.this.m130H();
            if (C2974c.this.f7444s != null) {
                C2974c.this.f7444s.mo80a(this.f7453a.isEnabled(), z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.c$e */
    /* loaded from: classes.dex */
    public enum EnumC2979e {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4);
        

        /* renamed from: f */
        final int f7459f;

        EnumC2979e(int i) {
            this.f7459f = i;
        }
    }

    /* renamed from: io.flutter.view.c$f */
    /* loaded from: classes.dex */
    public enum EnumC2980f {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576);
        

        /* renamed from: f */
        public final int f7482f;

        EnumC2980f(int i) {
            this.f7482f = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.c$g */
    /* loaded from: classes.dex */
    public static class C2981g {

        /* renamed from: a */
        private int f7483a = -1;

        /* renamed from: b */
        private int f7484b = -1;

        /* renamed from: c */
        private int f7485c = -1;

        /* renamed from: d */
        private String f7486d;

        /* renamed from: e */
        private String f7487e;

        C2981g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.view.c$h */
    /* loaded from: classes.dex */
    public enum EnumC2982h {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304);
        

        /* renamed from: f */
        final int f7511f;

        EnumC2982h(int i) {
            this.f7511f = i;
        }
    }

    /* renamed from: io.flutter.view.c$i */
    /* loaded from: classes.dex */
    public interface InterfaceC2983i {
        /* renamed from: a */
        void mo80a(boolean z, boolean z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.c$j */
    /* loaded from: classes.dex */
    public static class C2984j {

        /* renamed from: A */
        private String f7512A;

        /* renamed from: B */
        private float f7513B;

        /* renamed from: C */
        private float f7514C;

        /* renamed from: D */
        private float f7515D;

        /* renamed from: E */
        private float f7516E;

        /* renamed from: F */
        private float[] f7517F;

        /* renamed from: G */
        private C2984j f7518G;

        /* renamed from: J */
        private List<C2981g> f7521J;

        /* renamed from: K */
        private C2981g f7522K;

        /* renamed from: L */
        private C2981g f7523L;

        /* renamed from: N */
        private float[] f7525N;

        /* renamed from: P */
        private float[] f7527P;

        /* renamed from: Q */
        private Rect f7528Q;

        /* renamed from: a */
        final C2974c f7529a;

        /* renamed from: c */
        private int f7531c;

        /* renamed from: d */
        private int f7532d;

        /* renamed from: e */
        private int f7533e;

        /* renamed from: f */
        private int f7534f;

        /* renamed from: g */
        private int f7535g;

        /* renamed from: h */
        private int f7536h;

        /* renamed from: i */
        private int f7537i;

        /* renamed from: j */
        private int f7538j;

        /* renamed from: k */
        private int f7539k;

        /* renamed from: l */
        private float f7540l;

        /* renamed from: m */
        private float f7541m;

        /* renamed from: n */
        private float f7542n;

        /* renamed from: o */
        private String f7543o;

        /* renamed from: p */
        private String f7544p;

        /* renamed from: q */
        private String f7545q;

        /* renamed from: r */
        private String f7546r;

        /* renamed from: s */
        private String f7547s;

        /* renamed from: u */
        private int f7549u;

        /* renamed from: v */
        private int f7550v;

        /* renamed from: w */
        private int f7551w;

        /* renamed from: x */
        private int f7552x;

        /* renamed from: y */
        private float f7553y;

        /* renamed from: z */
        private String f7554z;

        /* renamed from: b */
        private int f7530b = -1;

        /* renamed from: t */
        private boolean f7548t = false;

        /* renamed from: H */
        private List<C2984j> f7519H = new ArrayList();

        /* renamed from: I */
        private List<C2984j> f7520I = new ArrayList();

        /* renamed from: M */
        private boolean f7524M = true;

        /* renamed from: O */
        private boolean f7526O = true;

        C2984j(C2974c c2974c) {
            this.f7529a = c2974c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: T */
        public void m60T(List<C2984j> list) {
            if (m44e0(EnumC2982h.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (C2984j c2984j : this.f7519H) {
                c2984j.m60T(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U */
        public boolean m59U() {
            String str;
            if (this.f7543o == null && this.f7512A == null) {
                return false;
            }
            String str2 = this.f7543o;
            return str2 == null || (str = this.f7512A) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public boolean m58V() {
            return (Float.isNaN(this.f7540l) || Float.isNaN(this.f7553y) || this.f7553y == this.f7540l) ? false : true;
        }

        /* renamed from: W */
        private void m57W() {
            if (this.f7524M) {
                this.f7524M = false;
                if (this.f7525N == null) {
                    this.f7525N = new float[16];
                }
                if (Matrix.invertM(this.f7525N, 0, this.f7517F, 0)) {
                    return;
                }
                Arrays.fill(this.f7525N, 0.0f);
            }
        }

        /* renamed from: X */
        private C2984j m56X(InterfaceC1539b<C2984j> interfaceC1539b) {
            for (C2984j c2984j = this.f7518G; c2984j != null; c2984j = c2984j.f7518G) {
                if (interfaceC1539b.mo138a(c2984j)) {
                    return c2984j;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public Rect m55Y() {
            return this.f7528Q;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Z */
        public String m54Z() {
            String str;
            if (!m44e0(EnumC2982h.NAMES_ROUTE) || (str = this.f7543o) == null || str.isEmpty()) {
                for (C2984j c2984j : this.f7519H) {
                    String m54Z = c2984j.m54Z();
                    if (m54Z != null && !m54Z.isEmpty()) {
                        return m54Z;
                    }
                }
                return null;
            }
            return this.f7543o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public String m52a0() {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {this.f7544p, this.f7543o, this.f7547s};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (str != null && str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public boolean m50b0(EnumC2980f enumC2980f) {
            return (enumC2980f.f7482f & this.f7550v) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public boolean m48c0(EnumC2982h enumC2982h) {
            return (enumC2982h.f7511f & this.f7549u) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public boolean m46d0(EnumC2980f enumC2980f) {
            return (enumC2980f.f7482f & this.f7532d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public boolean m44e0(EnumC2982h enumC2982h) {
            return (enumC2982h.f7511f & this.f7531c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public C2984j m42f0(float[] fArr) {
            float f = fArr[3];
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.f7513B || f2 >= this.f7515D || f3 < this.f7514C || f3 >= this.f7516E) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (C2984j c2984j : this.f7520I) {
                if (!c2984j.m44e0(EnumC2982h.IS_HIDDEN)) {
                    c2984j.m57W();
                    Matrix.multiplyMV(fArr2, 0, c2984j.f7525N, 0, fArr, 0);
                    C2984j m42f0 = c2984j.m42f0(fArr2);
                    if (m42f0 != null) {
                        return m42f0;
                    }
                }
            }
            if (m40g0()) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public boolean m40g0() {
            String str;
            String str2;
            String str3;
            if (m44e0(EnumC2982h.SCOPES_ROUTE)) {
                return false;
            }
            if (m44e0(EnumC2982h.IS_FOCUSABLE)) {
                return true;
            }
            return (((~(((EnumC2980f.SCROLL_RIGHT.f7482f | EnumC2980f.SCROLL_LEFT.f7482f) | EnumC2980f.SCROLL_UP.f7482f) | EnumC2980f.SCROLL_DOWN.f7482f)) & this.f7532d) == 0 && this.f7531c == 0 && ((str = this.f7543o) == null || str.isEmpty()) && (((str2 = this.f7544p) == null || str2.isEmpty()) && ((str3 = this.f7547s) == null || str3.isEmpty()))) ? false : true;
        }

        /* renamed from: h0 */
        private float m38h0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        /* renamed from: i0 */
        private float m36i0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public static boolean m34j0(C2984j c2984j, InterfaceC1539b<C2984j> interfaceC1539b) {
            return (c2984j == null || c2984j.m56X(interfaceC1539b) == null) ? false : true;
        }

        /* renamed from: k0 */
        private void m32k0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public void m30l0(float[] fArr, Set<C2984j> set, boolean z) {
            set.add(this);
            if (this.f7526O) {
                z = true;
            }
            if (z) {
                if (this.f7527P == null) {
                    this.f7527P = new float[16];
                }
                Matrix.multiplyMM(this.f7527P, 0, fArr, 0, this.f7517F, 0);
                float[] fArr2 = {this.f7513B, this.f7514C, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                m32k0(fArr3, this.f7527P, fArr2);
                fArr2[0] = this.f7515D;
                fArr2[1] = this.f7514C;
                m32k0(fArr4, this.f7527P, fArr2);
                fArr2[0] = this.f7515D;
                fArr2[1] = this.f7516E;
                m32k0(fArr5, this.f7527P, fArr2);
                fArr2[0] = this.f7513B;
                fArr2[1] = this.f7516E;
                m32k0(fArr6, this.f7527P, fArr2);
                if (this.f7528Q == null) {
                    this.f7528Q = new Rect();
                }
                this.f7528Q.set(Math.round(m36i0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m36i0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(m38h0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m38h0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f7526O = false;
            }
            for (C2984j c2984j : this.f7519H) {
                c2984j.m30l0(this.f7527P, set, z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public void m28m0(ByteBuffer byteBuffer, String[] strArr) {
            this.f7548t = true;
            this.f7554z = this.f7544p;
            this.f7512A = this.f7543o;
            this.f7549u = this.f7531c;
            this.f7550v = this.f7532d;
            this.f7551w = this.f7535g;
            this.f7552x = this.f7536h;
            this.f7553y = this.f7540l;
            this.f7531c = byteBuffer.getInt();
            this.f7532d = byteBuffer.getInt();
            this.f7533e = byteBuffer.getInt();
            this.f7534f = byteBuffer.getInt();
            this.f7535g = byteBuffer.getInt();
            this.f7536h = byteBuffer.getInt();
            this.f7537i = byteBuffer.getInt();
            this.f7538j = byteBuffer.getInt();
            this.f7539k = byteBuffer.getInt();
            this.f7540l = byteBuffer.getFloat();
            this.f7541m = byteBuffer.getFloat();
            this.f7542n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            this.f7543o = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            this.f7544p = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            this.f7545q = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            this.f7546r = i4 == -1 ? null : strArr[i4];
            int i5 = byteBuffer.getInt();
            this.f7547s = i5 == -1 ? null : strArr[i5];
            EnumC2985k.m14d(byteBuffer.getInt());
            this.f7513B = byteBuffer.getFloat();
            this.f7514C = byteBuffer.getFloat();
            this.f7515D = byteBuffer.getFloat();
            this.f7516E = byteBuffer.getFloat();
            if (this.f7517F == null) {
                this.f7517F = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                this.f7517F[i6] = byteBuffer.getFloat();
            }
            this.f7524M = true;
            this.f7526O = true;
            int i7 = byteBuffer.getInt();
            this.f7519H.clear();
            this.f7520I.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                C2984j m103t = this.f7529a.m103t(byteBuffer.getInt());
                m103t.f7518G = this;
                this.f7519H.add(m103t);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                C2984j m103t2 = this.f7529a.m103t(byteBuffer.getInt());
                m103t2.f7518G = this;
                this.f7520I.add(m103t2);
            }
            int i10 = byteBuffer.getInt();
            if (i10 == 0) {
                this.f7521J = null;
                return;
            }
            List<C2981g> list = this.f7521J;
            if (list == null) {
                this.f7521J = new ArrayList(i10);
            } else {
                list.clear();
            }
            for (int i11 = 0; i11 < i10; i11++) {
                C2981g m104s = this.f7529a.m104s(byteBuffer.getInt());
                if (m104s.f7485c == EnumC2980f.TAP.f7482f) {
                    this.f7522K = m104s;
                } else if (m104s.f7485c == EnumC2980f.LONG_PRESS.f7482f) {
                    this.f7523L = m104s;
                } else {
                    this.f7521J.add(m104s);
                }
                this.f7521J.add(m104s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.c$k */
    /* loaded from: classes.dex */
    public enum EnumC2985k {
        UNKNOWN,
        LTR,
        RTL;

        /* renamed from: d */
        public static EnumC2985k m14d(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public C2974c(View view, C2869b c2869b, AccessibilityManager accessibilityManager, ContentResolver contentResolver, InterfaceC2957i interfaceC2957i) {
        this(view, c2869b, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), interfaceC2957i);
    }

    public C2974c(View view, C2869b c2869b, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, InterfaceC2957i interfaceC2957i) {
        this.f7432g = new HashMap();
        this.f7433h = new HashMap();
        this.f7437l = 0;
        this.f7441p = new ArrayList();
        this.f7442q = 0;
        this.f7443r = 0;
        this.f7445t = false;
        this.f7446u = new C2975a();
        this.f7447v = new accessibilityAccessibilityManager$AccessibilityStateChangeListenerC2976b();
        this.f7449x = new C2977c(new Handler());
        this.f7426a = view;
        this.f7427b = c2869b;
        this.f7428c = accessibilityManager;
        this.f7431f = contentResolver;
        this.f7429d = accessibilityViewEmbedder;
        this.f7430e = interfaceC2957i;
        this.f7447v.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        this.f7428c.addAccessibilityStateChangeListener(this.f7447v);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC2978d accessibilityaccessibilitymanager_touchexplorationstatechangelistenerc2978d = new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC2978d(accessibilityManager);
            this.f7448w = accessibilityaccessibilitymanager_touchexplorationstatechangelistenerc2978d;
            accessibilityaccessibilitymanager_touchexplorationstatechangelistenerc2978d.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            this.f7428c.addTouchExplorationStateChangeListener(this.f7448w);
        } else {
            this.f7448w = null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f7449x.onChange(false);
            this.f7431f.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.f7449x);
        }
        if (interfaceC2957i != null) {
            interfaceC2957i.mo209a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public AccessibilityEvent m137A(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.f7426a.getContext().getPackageName());
        obtain.setSource(this.f7426a, i);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m135C() {
        C2984j c2984j = this.f7440o;
        if (c2984j != null) {
            m132F(c2984j.f7530b, 256);
            this.f7440o = null;
        }
    }

    /* renamed from: D */
    private boolean m134D(C2984j c2984j, int i, Bundle bundle, boolean z) {
        C2869b c2869b;
        EnumC2980f enumC2980f;
        int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            if (z && c2984j.m46d0(EnumC2980f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                c2869b = this.f7427b;
                enumC2980f = EnumC2980f.MOVE_CURSOR_FORWARD_BY_WORD;
            } else if (z || !c2984j.m46d0(EnumC2980f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                return false;
            } else {
                c2869b = this.f7427b;
                enumC2980f = EnumC2980f.MOVE_CURSOR_BACKWARD_BY_WORD;
            }
        } else if (z && c2984j.m46d0(EnumC2980f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
            c2869b = this.f7427b;
            enumC2980f = EnumC2980f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
        } else if (z || !c2984j.m46d0(EnumC2980f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
            return false;
        } else {
            c2869b = this.f7427b;
            enumC2980f = EnumC2980f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
        }
        c2869b.m483c(i, enumC2980f, Boolean.valueOf(z2));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m132F(int i, int i2) {
        if (this.f7428c.isEnabled()) {
            m131G(m137A(i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m131G(AccessibilityEvent accessibilityEvent) {
        if (this.f7428c.isEnabled()) {
            this.f7426a.getParent().requestSendAccessibilityEvent(this.f7426a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m130H() {
        this.f7427b.m480f(this.f7437l);
    }

    /* renamed from: I */
    private void m129I(C2984j c2984j) {
        AccessibilityEvent m137A = m137A(c2984j.f7530b, 32);
        String m54Z = c2984j.m54Z();
        if (m54Z == null) {
            m54Z = " ";
        }
        m137A.getText().add(m54Z);
        m131G(m137A);
    }

    /* renamed from: J */
    private void m128J(int i) {
        AccessibilityEvent m137A = m137A(i, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            m137A.setContentChangeTypes(1);
        }
        m131G(m137A);
    }

    /* renamed from: L */
    private boolean m126L(final C2984j c2984j) {
        return c2984j.f7538j > 0 && (C2984j.m34j0(this.f7434i, new InterfaceC1539b() { // from class: io.flutter.view.a
            @Override // p108c.p109a.p114d.InterfaceC1539b
            /* renamed from: a */
            public final boolean mo138a(Object obj) {
                return C2974c.m98y(C2974c.C2984j.this, (C2974c.C2984j) obj);
            }
        }) || !C2984j.m34j0(this.f7434i, new InterfaceC1539b() { // from class: io.flutter.view.b
            @Override // p108c.p109a.p114d.InterfaceC1539b
            /* renamed from: a */
            public final boolean mo138a(Object obj) {
                boolean m44e0;
                m44e0 = ((C2974c.C2984j) obj).m44e0(C2974c.EnumC2982h.HAS_IMPLICIT_SCROLLING);
                return m44e0;
            }
        }));
    }

    /* renamed from: O */
    private void m123O(C2984j c2984j) {
        Integer num;
        c2984j.f7518G = null;
        if (c2984j.f7537i != -1 && (num = this.f7435j) != null && this.f7429d.platformViewOfNode(num.intValue()) == this.f7430e.mo204d(Integer.valueOf(c2984j.f7537i))) {
            m132F(this.f7435j.intValue(), 65536);
            this.f7435j = null;
        }
        C2984j c2984j2 = this.f7434i;
        if (c2984j2 == c2984j) {
            m132F(c2984j2.f7530b, 65536);
            this.f7434i = null;
        }
        if (this.f7438m == c2984j) {
            this.f7438m = null;
        }
        if (this.f7440o == c2984j) {
            this.f7440o = null;
        }
    }

    /* renamed from: q */
    private AccessibilityEvent m106q(int i, String str, String str2) {
        AccessibilityEvent m137A = m137A(i, 16);
        m137A.setBeforeText(str);
        m137A.getText().add(str2);
        int i2 = 0;
        while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
            i2++;
        }
        if (i2 < str.length() || i2 < str2.length()) {
            m137A.setFromIndex(i2);
            int length = str.length() - 1;
            int length2 = str2.length() - 1;
            while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
                length--;
                length2--;
            }
            m137A.setRemovedCount((length - i2) + 1);
            m137A.setAddedCount((length2 - i2) + 1);
            return m137A;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public C2981g m104s(int i) {
        C2981g c2981g = this.f7433h.get(Integer.valueOf(i));
        if (c2981g == null) {
            C2981g c2981g2 = new C2981g();
            c2981g2.f7484b = i;
            c2981g2.f7483a = f7425y + i;
            this.f7433h.put(Integer.valueOf(i), c2981g2);
            return c2981g2;
        }
        return c2981g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public C2984j m103t(int i) {
        C2984j c2984j = this.f7432g.get(Integer.valueOf(i));
        if (c2984j == null) {
            C2984j c2984j2 = new C2984j(this);
            c2984j2.f7530b = i;
            this.f7432g.put(Integer.valueOf(i), c2984j2);
            return c2984j2;
        }
        return c2984j;
    }

    /* renamed from: u */
    private C2984j m102u() {
        return this.f7432g.get(0);
    }

    /* renamed from: v */
    private void m101v(float f, float f2) {
        C2984j m42f0;
        if (this.f7432g.isEmpty() || (m42f0 = m102u().m42f0(new float[]{f, f2, 0.0f, 1.0f})) == this.f7440o) {
            return;
        }
        if (m42f0 != null) {
            m132F(m42f0.f7530b, 128);
        }
        C2984j c2984j = this.f7440o;
        if (c2984j != null) {
            m132F(c2984j.f7530b, 256);
        }
        this.f7440o = m42f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ boolean m98y(C2984j c2984j, C2984j c2984j2) {
        return c2984j2 == c2984j;
    }

    /* renamed from: B */
    public boolean m136B(MotionEvent motionEvent) {
        if (this.f7428c.isTouchExplorationEnabled() && !this.f7432g.isEmpty()) {
            C2984j m42f0 = m102u().m42f0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
            if (m42f0 == null || m42f0.f7537i == -1) {
                if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                    m101v(motionEvent.getX(), motionEvent.getY());
                } else if (motionEvent.getAction() != 10) {
                    C1499b.m4053a("flutter", "unexpected accessibility hover event: " + motionEvent);
                    return false;
                } else {
                    m135C();
                }
                return true;
            }
            return this.f7429d.onAccessibilityHoverEvent(m42f0.f7530b, motionEvent);
        }
        return false;
    }

    /* renamed from: E */
    public void m133E() {
        this.f7445t = true;
        InterfaceC2957i interfaceC2957i = this.f7430e;
        if (interfaceC2957i != null) {
            interfaceC2957i.mo207b();
        }
        m127K(null);
        this.f7428c.removeAccessibilityStateChangeListener(this.f7447v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f7428c.removeTouchExplorationStateChangeListener(this.f7448w);
        }
        this.f7431f.unregisterContentObserver(this.f7449x);
        this.f7427b.m479g(null);
    }

    /* renamed from: K */
    public void m127K(InterfaceC2983i interfaceC2983i) {
        this.f7444s = interfaceC2983i;
    }

    /* renamed from: M */
    void m125M(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            C2981g m104s = m104s(byteBuffer.getInt());
            m104s.f7485c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str = null;
            m104s.f7486d = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            if (i2 != -1) {
                str = strArr[i2];
            }
            m104s.f7487e = str;
        }
    }

    /* renamed from: N */
    void m124N(ByteBuffer byteBuffer, String[] strArr) {
        C2984j c2984j;
        C2984j c2984j2;
        float f;
        float f2;
        WindowInsets rootWindowInsets;
        Integer valueOf;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            C2984j m103t = m103t(byteBuffer.getInt());
            m103t.m28m0(byteBuffer, strArr);
            if (!m103t.m44e0(EnumC2982h.IS_HIDDEN)) {
                if (m103t.m44e0(EnumC2982h.IS_FOCUSED)) {
                    this.f7438m = m103t;
                }
                if (m103t.f7548t) {
                    arrayList.add(m103t);
                }
            }
        }
        HashSet hashSet = new HashSet();
        C2984j m102u = m102u();
        ArrayList<C2984j> arrayList2 = new ArrayList();
        if (m102u != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if (Build.VERSION.SDK_INT >= 23 && (rootWindowInsets = this.f7426a.getRootWindowInsets()) != null) {
                if (!this.f7443r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    m102u.f7526O = true;
                    m102u.f7524M = true;
                }
                this.f7443r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, valueOf.intValue(), 0.0f, 0.0f);
            }
            m102u.m30l0(fArr, hashSet, false);
            m102u.m60T(arrayList2);
        }
        C2984j c2984j3 = null;
        for (C2984j c2984j4 : arrayList2) {
            if (!this.f7441p.contains(Integer.valueOf(c2984j4.f7530b))) {
                c2984j3 = c2984j4;
            }
        }
        if (c2984j3 == null && arrayList2.size() > 0) {
            c2984j3 = (C2984j) arrayList2.get(arrayList2.size() - 1);
        }
        if (c2984j3 != null && (c2984j3.f7530b != this.f7442q || arrayList2.size() != this.f7441p.size())) {
            this.f7442q = c2984j3.f7530b;
            m129I(c2984j3);
        }
        this.f7441p.clear();
        for (C2984j c2984j5 : arrayList2) {
            this.f7441p.add(Integer.valueOf(c2984j5.f7530b));
        }
        Iterator<Map.Entry<Integer, C2984j>> it = this.f7432g.entrySet().iterator();
        while (it.hasNext()) {
            C2984j value = it.next().getValue();
            if (!hashSet.contains(value)) {
                m123O(value);
                it.remove();
            }
        }
        m128J(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2984j c2984j6 = (C2984j) it2.next();
            if (c2984j6.m58V()) {
                AccessibilityEvent m137A = m137A(c2984j6.f7530b, 4096);
                float f3 = c2984j6.f7540l;
                float f4 = c2984j6.f7541m;
                if (Float.isInfinite(c2984j6.f7541m)) {
                    if (f3 > 70000.0f) {
                        f3 = 70000.0f;
                    }
                    f4 = 100000.0f;
                }
                if (Float.isInfinite(c2984j6.f7542n)) {
                    f = f4 + 100000.0f;
                    if (f3 < -70000.0f) {
                        f3 = -70000.0f;
                    }
                    f2 = f3 + 100000.0f;
                } else {
                    f = f4 - c2984j6.f7542n;
                    f2 = f3 - c2984j6.f7542n;
                }
                if (c2984j6.m50b0(EnumC2980f.SCROLL_UP) || c2984j6.m50b0(EnumC2980f.SCROLL_DOWN)) {
                    m137A.setScrollY((int) f2);
                    m137A.setMaxScrollY((int) f);
                } else if (c2984j6.m50b0(EnumC2980f.SCROLL_LEFT) || c2984j6.m50b0(EnumC2980f.SCROLL_RIGHT)) {
                    m137A.setScrollX((int) f2);
                    m137A.setMaxScrollX((int) f);
                }
                if (c2984j6.f7538j > 0) {
                    m137A.setItemCount(c2984j6.f7538j);
                    m137A.setFromIndex(c2984j6.f7539k);
                    int i = 0;
                    for (C2984j c2984j7 : c2984j6.f7520I) {
                        if (!c2984j7.m44e0(EnumC2982h.IS_HIDDEN)) {
                            i++;
                        }
                    }
                    m137A.setToIndex((c2984j6.f7539k + i) - 1);
                }
                m131G(m137A);
            }
            if (c2984j6.m44e0(EnumC2982h.IS_LIVE_REGION) && c2984j6.m59U()) {
                m128J(c2984j6.f7530b);
            }
            C2984j c2984j8 = this.f7434i;
            if (c2984j8 != null && c2984j8.f7530b == c2984j6.f7530b && !c2984j6.m48c0(EnumC2982h.IS_SELECTED) && c2984j6.m44e0(EnumC2982h.IS_SELECTED)) {
                AccessibilityEvent m137A2 = m137A(c2984j6.f7530b, 4);
                m137A2.getText().add(c2984j6.f7543o);
                m131G(m137A2);
            }
            C2984j c2984j9 = this.f7438m;
            if (c2984j9 != null && c2984j9.f7530b == c2984j6.f7530b && ((c2984j2 = this.f7439n) == null || c2984j2.f7530b != this.f7438m.f7530b)) {
                this.f7439n = this.f7438m;
                m131G(m137A(c2984j6.f7530b, 8));
            } else if (this.f7438m == null) {
                this.f7439n = null;
            }
            C2984j c2984j10 = this.f7438m;
            if (c2984j10 != null && c2984j10.f7530b == c2984j6.f7530b && c2984j6.m48c0(EnumC2982h.IS_TEXT_FIELD) && c2984j6.m44e0(EnumC2982h.IS_TEXT_FIELD) && ((c2984j = this.f7434i) == null || c2984j.f7530b == this.f7438m.f7530b)) {
                String str = c2984j6.f7554z != null ? c2984j6.f7554z : "";
                String str2 = c2984j6.f7544p != null ? c2984j6.f7544p : "";
                AccessibilityEvent m106q = m106q(c2984j6.f7530b, str, str2);
                if (m106q != null) {
                    m131G(m106q);
                }
                if (c2984j6.f7551w != c2984j6.f7535g || c2984j6.f7552x != c2984j6.f7536h) {
                    AccessibilityEvent m137A3 = m137A(c2984j6.f7530b, 8192);
                    m137A3.getText().add(str2);
                    m137A3.setFromIndex(c2984j6.f7535g);
                    m137A3.setToIndex(c2984j6.f7536h);
                    m137A3.setItemCount(str2.length());
                    m131G(m137A3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x040f A[LOOP:0: B:227:0x0409->B:229:0x040f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0434  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r13) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.C2974c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r2 != null) goto L11;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.c$j r2 = r1.f7438m
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.C2974c.C2984j.m53a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.f7436k
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.c$j r2 = r1.f7434i
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.f7435j
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.C2974c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        C2869b c2869b;
        EnumC2980f enumC2980f;
        C2869b c2869b2;
        EnumC2980f enumC2980f2;
        int i3;
        if (i >= 65536) {
            boolean performAction = this.f7429d.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.f7435j = null;
            }
            return performAction;
        }
        C2984j c2984j = this.f7432g.get(Integer.valueOf(i));
        boolean z = false;
        if (c2984j == null) {
            return false;
        }
        switch (i2) {
            case 16:
                this.f7427b.m484b(i, EnumC2980f.TAP);
                return true;
            case 32:
                this.f7427b.m484b(i, EnumC2980f.LONG_PRESS);
                return true;
            case 64:
                this.f7427b.m484b(i, EnumC2980f.DID_GAIN_ACCESSIBILITY_FOCUS);
                m132F(i, 32768);
                if (this.f7434i == null) {
                    this.f7426a.invalidate();
                }
                this.f7434i = c2984j;
                if (c2984j.m46d0(EnumC2980f.INCREASE) || c2984j.m46d0(EnumC2980f.DECREASE)) {
                    m132F(i, 4);
                }
                return true;
            case 128:
                this.f7427b.m484b(i, EnumC2980f.DID_LOSE_ACCESSIBILITY_FOCUS);
                m132F(i, 65536);
                this.f7434i = null;
                this.f7435j = null;
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return m134D(c2984j, i, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return m134D(c2984j, i, bundle, false);
            case 4096:
                if (c2984j.m46d0(EnumC2980f.SCROLL_UP)) {
                    c2869b = this.f7427b;
                    enumC2980f = EnumC2980f.SCROLL_UP;
                } else if (c2984j.m46d0(EnumC2980f.SCROLL_LEFT)) {
                    c2869b = this.f7427b;
                    enumC2980f = EnumC2980f.SCROLL_LEFT;
                } else if (!c2984j.m46d0(EnumC2980f.INCREASE)) {
                    return false;
                } else {
                    c2984j.f7544p = c2984j.f7545q;
                    m132F(i, 4);
                    c2869b = this.f7427b;
                    enumC2980f = EnumC2980f.INCREASE;
                }
                c2869b.m484b(i, enumC2980f);
                return true;
            case 8192:
                if (c2984j.m46d0(EnumC2980f.SCROLL_DOWN)) {
                    c2869b2 = this.f7427b;
                    enumC2980f2 = EnumC2980f.SCROLL_DOWN;
                } else if (c2984j.m46d0(EnumC2980f.SCROLL_RIGHT)) {
                    c2869b2 = this.f7427b;
                    enumC2980f2 = EnumC2980f.SCROLL_RIGHT;
                } else if (!c2984j.m46d0(EnumC2980f.DECREASE)) {
                    return false;
                } else {
                    c2984j.f7544p = c2984j.f7546r;
                    m132F(i, 4);
                    c2869b2 = this.f7427b;
                    enumC2980f2 = EnumC2980f.DECREASE;
                }
                c2869b2.m484b(i, enumC2980f2);
                return true;
            case 16384:
                this.f7427b.m484b(i, EnumC2980f.COPY);
                return true;
            case 32768:
                this.f7427b.m484b(i, EnumC2980f.PASTE);
                return true;
            case 65536:
                this.f7427b.m484b(i, EnumC2980f.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z = true;
                }
                if (z) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i3 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(c2984j.f7536h));
                    i3 = c2984j.f7536h;
                }
                hashMap.put("extent", Integer.valueOf(i3));
                this.f7427b.m483c(i, EnumC2980f.SET_SELECTION, hashMap);
                return true;
            case 1048576:
                this.f7427b.m484b(i, EnumC2980f.DISMISS);
                return true;
            case 16908342:
                this.f7427b.m484b(i, EnumC2980f.SHOW_ON_SCREEN);
                return true;
            default:
                C2981g c2981g = this.f7433h.get(Integer.valueOf(i2 - f7425y));
                if (c2981g != null) {
                    this.f7427b.m483c(i, EnumC2980f.CUSTOM_ACTION, Integer.valueOf(c2981g.f7484b));
                    return true;
                }
                return false;
        }
    }

    /* renamed from: r */
    public boolean m105r(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (this.f7429d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) && (recordFlutterId = this.f7429d.getRecordFlutterId(view, accessibilityEvent)) != null) {
            int eventType = accessibilityEvent.getEventType();
            if (eventType == 8) {
                this.f7436k = recordFlutterId;
                this.f7438m = null;
                return true;
            } else if (eventType == 128) {
                this.f7440o = null;
                return true;
            } else if (eventType == 32768) {
                this.f7435j = recordFlutterId;
                this.f7434i = null;
                return true;
            } else if (eventType != 65536) {
                return true;
            } else {
                this.f7436k = null;
                this.f7435j = null;
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public boolean m100w() {
        return this.f7428c.isEnabled();
    }

    /* renamed from: x */
    public boolean m99x() {
        return this.f7428c.isTouchExplorationEnabled();
    }
}
