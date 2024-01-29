package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.widget.C0773c;
/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0605i {

    /* renamed from: a */
    private final CompoundButton f2024a;

    /* renamed from: b */
    private ColorStateList f2025b = null;

    /* renamed from: c */
    private PorterDuff.Mode f2026c = null;

    /* renamed from: d */
    private boolean f2027d = false;

    /* renamed from: e */
    private boolean f2028e = false;

    /* renamed from: f */
    private boolean f2029f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0605i(CompoundButton compoundButton) {
        this.f2024a = compoundButton;
    }

    /* renamed from: a */
    void m7441a() {
        Drawable m6657a = C0773c.m6657a(this.f2024a);
        if (m6657a != null) {
            if (this.f2027d || this.f2028e) {
                Drawable mutate = C0759a.m6744r(m6657a).mutate();
                if (this.f2027d) {
                    C0759a.m6747o(mutate, this.f2025b);
                }
                if (this.f2028e) {
                    C0759a.m6746p(mutate, this.f2026c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f2024a.getDrawableState());
                }
                this.f2024a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m7440b(int i) {
        Drawable m6657a;
        return (Build.VERSION.SDK_INT >= 17 || (m6657a = C0773c.m6657a(this.f2024a)) == null) ? i : i + m6657a.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m7439c() {
        return this.f2025b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m7438d() {
        return this.f2026c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001d, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0050, B:18:0x0058, B:19:0x0063, B:21:0x006b), top: B:28:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001d, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0050, B:18:0x0058, B:19:0x0063, B:21:0x006b), top: B:28:0x000d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7437e(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f2024a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p000a.p001a.C0009j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p000a.p001a.C0009j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L80
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L2e
            int r5 = p000a.p001a.C0009j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L80
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L2e
            android.widget.CompoundButton r0 = r3.f2024a     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L80
            android.widget.CompoundButton r1 = r3.f2024a     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L80
            android.content.Context r1 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L80
            android.graphics.drawable.Drawable r5 = p000a.p001a.p002k.p003a.C0010a.m9577d(r1, r5)     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L80
            r0.setButtonDrawable(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L80
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 != 0) goto L50
            int r5 = p000a.p001a.C0009j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L80
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L50
            int r5 = p000a.p001a.C0009j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L80
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L50
            android.widget.CompoundButton r0 = r3.f2024a     // Catch: java.lang.Throwable -> L80
            android.widget.CompoundButton r1 = r3.f2024a     // Catch: java.lang.Throwable -> L80
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L80
            android.graphics.drawable.Drawable r5 = p000a.p001a.p002k.p003a.C0010a.m9577d(r1, r5)     // Catch: java.lang.Throwable -> L80
            r0.setButtonDrawable(r5)     // Catch: java.lang.Throwable -> L80
        L50:
            int r5 = p000a.p001a.C0009j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L80
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L63
            android.widget.CompoundButton r5 = r3.f2024a     // Catch: java.lang.Throwable -> L80
            int r0 = p000a.p001a.C0009j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L80
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch: java.lang.Throwable -> L80
            androidx.core.widget.C0773c.m6655c(r5, r0)     // Catch: java.lang.Throwable -> L80
        L63:
            int r5 = p000a.p001a.C0009j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L80
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L7c
            android.widget.CompoundButton r5 = r3.f2024a     // Catch: java.lang.Throwable -> L80
            int r0 = p000a.p001a.C0009j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L80
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch: java.lang.Throwable -> L80
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0593e0.m7465d(r0, r1)     // Catch: java.lang.Throwable -> L80
            androidx.core.widget.C0773c.m6654d(r5, r0)     // Catch: java.lang.Throwable -> L80
        L7c:
            r4.recycle()
            return
        L80:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0605i.m7437e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m7436f() {
        if (this.f2029f) {
            this.f2029f = false;
            return;
        }
        this.f2029f = true;
        m7441a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m7435g(ColorStateList colorStateList) {
        this.f2025b = colorStateList;
        this.f2027d = true;
        m7441a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m7434h(PorterDuff.Mode mode) {
        this.f2026c = mode;
        this.f2028e = true;
        m7441a();
    }
}
