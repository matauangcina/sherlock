package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0623m0;
import p000a.p001a.C0000a;
import p000a.p001a.C0002c;
import p000a.p001a.C0004e;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p020d.C0122a;
/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0608j {

    /* renamed from: b */
    private static final PorterDuff.Mode f2047b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0608j f2048c;

    /* renamed from: a */
    private C0623m0 f2049a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: classes.dex */
    public static class C0609a implements C0623m0.InterfaceC0628e {

        /* renamed from: a */
        private final int[] f2050a = {C0004e.abc_textfield_search_default_mtrl_alpha, C0004e.abc_textfield_default_mtrl_alpha, C0004e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f2051b = {C0004e.abc_ic_commit_search_api_mtrl_alpha, C0004e.abc_seekbar_tick_mark_material, C0004e.abc_ic_menu_share_mtrl_alpha, C0004e.abc_ic_menu_copy_mtrl_am_alpha, C0004e.abc_ic_menu_cut_mtrl_alpha, C0004e.abc_ic_menu_selectall_mtrl_alpha, C0004e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f2052c = {C0004e.abc_textfield_activated_mtrl_alpha, C0004e.abc_textfield_search_activated_mtrl_alpha, C0004e.abc_cab_background_top_mtrl_alpha, C0004e.abc_text_cursor_material, C0004e.abc_text_select_handle_left_mtrl_dark, C0004e.abc_text_select_handle_middle_mtrl_dark, C0004e.abc_text_select_handle_right_mtrl_dark, C0004e.abc_text_select_handle_left_mtrl_light, C0004e.abc_text_select_handle_middle_mtrl_light, C0004e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f2053d = {C0004e.abc_popup_background_mtrl_mult, C0004e.abc_cab_background_internal_bg, C0004e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f2054e = {C0004e.abc_tab_indicator_material, C0004e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f2055f = {C0004e.abc_btn_check_material, C0004e.abc_btn_radio_material, C0004e.abc_btn_check_material_anim, C0004e.abc_btn_radio_material_anim};

        C0609a() {
        }

        /* renamed from: f */
        private boolean m7403f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m7402g(Context context) {
            return m7401h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m7401h(Context context, int i) {
            int m7268b = C0644r0.m7268b(context, C0000a.colorControlHighlight);
            return new ColorStateList(new int[][]{C0644r0.f2179b, C0644r0.f2181d, C0644r0.f2180c, C0644r0.f2183f}, new int[]{C0644r0.m7269a(context, C0000a.colorButtonNormal), C0122a.m9050b(m7268b, i), C0122a.m9050b(m7268b, i), i});
        }

        /* renamed from: i */
        private ColorStateList m7400i(Context context) {
            return m7401h(context, C0644r0.m7268b(context, C0000a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m7399j(Context context) {
            return m7401h(context, C0644r0.m7268b(context, C0000a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m7398k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList m7266d = C0644r0.m7266d(context, C0000a.colorSwitchThumbNormal);
            if (m7266d == null || !m7266d.isStateful()) {
                iArr[0] = C0644r0.f2179b;
                iArr2[0] = C0644r0.m7269a(context, C0000a.colorSwitchThumbNormal);
                iArr[1] = C0644r0.f2182e;
                iArr2[1] = C0644r0.m7268b(context, C0000a.colorControlActivated);
                iArr[2] = C0644r0.f2183f;
                iArr2[2] = C0644r0.m7268b(context, C0000a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0644r0.f2179b;
                iArr2[0] = m7266d.getColorForState(iArr[0], 0);
                iArr[1] = C0644r0.f2182e;
                iArr2[1] = C0644r0.m7268b(context, C0000a.colorControlActivated);
                iArr[2] = C0644r0.f2183f;
                iArr2[2] = m7266d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m7397l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0593e0.m7468a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0608j.f2047b;
            }
            drawable.setColorFilter(C0608j.m7408e(i, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0628e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo7330a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0608j.m7412a()
                int[] r1 = r6.f2050a
                boolean r1 = r6.m7403f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p000a.p001a.C0000a.colorControlNormal
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f2052c
                boolean r1 = r6.m7403f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p000a.p001a.C0000a.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.f2053d
                boolean r1 = r6.m7403f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p000a.p001a.C0004e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p000a.p001a.C0004e.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.C0593e0.m7468a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.C0644r0.m7268b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0608j.m7408e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0608j.C0609a.mo7330a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0628e
        /* renamed from: b */
        public PorterDuff.Mode mo7329b(int i) {
            if (i == C0004e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0628e
        /* renamed from: c */
        public Drawable mo7328c(C0623m0 c0623m0, Context context, int i) {
            if (i == C0004e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{c0623m0.m7348j(context, C0004e.abc_cab_background_internal_bg), c0623m0.m7348j(context, C0004e.abc_cab_background_top_mtrl_alpha)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0628e
        /* renamed from: d */
        public ColorStateList mo7327d(Context context, int i) {
            if (i == C0004e.abc_edit_text_material) {
                return C0010a.m9578c(context, C0002c.abc_tint_edittext);
            }
            if (i == C0004e.abc_switch_track_mtrl_alpha) {
                return C0010a.m9578c(context, C0002c.abc_tint_switch_track);
            }
            if (i == C0004e.abc_switch_thumb_material) {
                return m7398k(context);
            }
            if (i == C0004e.abc_btn_default_mtrl_shape) {
                return m7399j(context);
            }
            if (i == C0004e.abc_btn_borderless_material) {
                return m7402g(context);
            }
            if (i == C0004e.abc_btn_colored_material) {
                return m7400i(context);
            }
            if (i == C0004e.abc_spinner_mtrl_am_alpha || i == C0004e.abc_spinner_textfield_background_material) {
                return C0010a.m9578c(context, C0002c.abc_tint_spinner);
            }
            if (m7403f(this.f2051b, i)) {
                return C0644r0.m7266d(context, C0000a.colorControlNormal);
            }
            if (m7403f(this.f2054e, i)) {
                return C0010a.m9578c(context, C0002c.abc_tint_default);
            }
            if (m7403f(this.f2055f, i)) {
                return C0010a.m9578c(context, C0002c.abc_tint_btn_checkable);
            }
            if (i == C0004e.abc_seekbar_thumb_material) {
                return C0010a.m9578c(context, C0002c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0623m0.InterfaceC0628e
        /* renamed from: e */
        public boolean mo7326e(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == C0004e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                m7397l(layerDrawable.findDrawableByLayerId(16908288), C0644r0.m7268b(context, C0000a.colorControlNormal), C0608j.f2047b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C0000a.colorControlNormal;
            } else if (i != C0004e.abc_ratingbar_material && i != C0004e.abc_ratingbar_indicator_material && i != C0004e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                m7397l(layerDrawable.findDrawableByLayerId(16908288), C0644r0.m7269a(context, C0000a.colorControlNormal), C0608j.f2047b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C0000a.colorControlActivated;
            }
            m7397l(findDrawableByLayerId, C0644r0.m7268b(context, i2), C0608j.f2047b);
            m7397l(layerDrawable.findDrawableByLayerId(16908301), C0644r0.m7268b(context, C0000a.colorControlActivated), C0608j.f2047b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0608j m7411b() {
        C0608j c0608j;
        synchronized (C0608j.class) {
            if (f2048c == null) {
                m7405h();
            }
            c0608j = f2048c;
        }
        return c0608j;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m7408e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m7346l;
        synchronized (C0608j.class) {
            m7346l = C0623m0.m7346l(i, mode);
        }
        return m7346l;
    }

    /* renamed from: h */
    public static synchronized void m7405h() {
        synchronized (C0608j.class) {
            if (f2048c == null) {
                C0608j c0608j = new C0608j();
                f2048c = c0608j;
                c0608j.f2049a = C0623m0.m7350h();
                f2048c.f2049a.m7337u(new C0609a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m7404i(Drawable drawable, C0650u0 c0650u0, int[] iArr) {
        C0623m0.m7335w(drawable, c0650u0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m7410c(Context context, int i) {
        return this.f2049a.m7348j(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m7409d(Context context, int i, boolean z) {
        return this.f2049a.m7347k(context, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m7407f(Context context, int i) {
        return this.f2049a.m7345m(context, i);
    }

    /* renamed from: g */
    public synchronized void m7406g(Context context) {
        this.f2049a.m7339s(context);
    }
}
