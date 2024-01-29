package p054b.p059c.p060a.p075b.p080n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p012c.p013a.C0055a;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
/* renamed from: b.c.a.b.n.a */
/* loaded from: classes.dex */
public class C1362a extends C0055a implements Checkable, InterfaceC1337n {

    /* renamed from: p */
    private static final int[] f4253p = {16842911};

    /* renamed from: q */
    private static final int[] f4254q = {16842912};

    /* renamed from: r */
    private static final int[] f4255r = {C1338b.state_dragged};

    /* renamed from: k */
    private final C1364b f4256k;

    /* renamed from: l */
    private boolean f4257l;

    /* renamed from: m */
    private boolean f4258m;

    /* renamed from: n */
    private boolean f4259n;

    /* renamed from: o */
    private InterfaceC1363a f4260o;

    /* renamed from: b.c.a.b.n.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1363a {
        /* renamed from: a */
        void m4343a(C1362a c1362a, boolean z);
    }

    /* renamed from: d */
    private void m4346d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f4256k.m4337a();
        }
    }

    /* renamed from: e */
    public boolean m4345e() {
        C1364b c1364b = this.f4256k;
        return c1364b != null && c1364b.m4323o();
    }

    /* renamed from: f */
    public boolean m4344f() {
        return this.f4259n;
    }

    @Override // p000a.p012c.p013a.C0055a
    public ColorStateList getCardBackgroundColor() {
        return this.f4256k.m4335c();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f4256k.m4334d();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f4256k.m4333e();
    }

    @Override // p000a.p012c.p013a.C0055a
    public int getContentPaddingBottom() {
        return this.f4256k.m4325m().bottom;
    }

    @Override // p000a.p012c.p013a.C0055a
    public int getContentPaddingLeft() {
        return this.f4256k.m4325m().left;
    }

    @Override // p000a.p012c.p013a.C0055a
    public int getContentPaddingRight() {
        return this.f4256k.m4325m().right;
    }

    @Override // p000a.p012c.p013a.C0055a
    public int getContentPaddingTop() {
        return this.f4256k.m4325m().top;
    }

    public float getProgress() {
        return this.f4256k.m4331g();
    }

    @Override // p000a.p012c.p013a.C0055a
    public float getRadius() {
        return this.f4256k.m4332f();
    }

    public ColorStateList getRippleColor() {
        return this.f4256k.m4330h();
    }

    public C1322k getShapeAppearanceModel() {
        return this.f4256k.m4329i();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f4256k.m4328j();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f4256k.m4327k();
    }

    public int getStrokeWidth() {
        return this.f4256k.m4326l();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4258m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1319h.m4501f(this, this.f4256k.m4336b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m4345e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f4253p);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f4254q);
        }
        if (m4344f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f4255r);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0055a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0055a.class.getName());
        accessibilityNodeInfo.setCheckable(m4345e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // p000a.p012c.p013a.C0055a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4256k.m4322p(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f4257l) {
            if (!this.f4256k.m4324n()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f4256k.m4321q(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setCardBackgroundColor(int i) {
        this.f4256k.m4320r(ColorStateList.valueOf(i));
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f4256k.m4320r(colorStateList);
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f4256k.m4339D();
    }

    public void setCheckable(boolean z) {
        this.f4256k.m4319s(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f4258m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f4256k.m4318t(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.f4256k.m4318t(C0010a.m9577d(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f4256k.m4317u(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f4256k.m4341B();
    }

    public void setDragged(boolean z) {
        if (this.f4259n != z) {
            this.f4259n = z;
            refreshDrawableState();
            m4346d();
            invalidate();
        }
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f4256k.m4338E();
    }

    public void setOnCheckedChangeListener(InterfaceC1363a interfaceC1363a) {
        this.f4260o = interfaceC1363a;
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f4256k.m4338E();
        this.f4256k.m4340C();
    }

    public void setProgress(float f) {
        this.f4256k.m4315w(f);
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setRadius(float f) {
        super.setRadius(f);
        this.f4256k.m4316v(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f4256k.m4314x(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f4256k.m4314x(C0010a.m9578c(getContext(), i));
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n
    public void setShapeAppearanceModel(C1322k c1322k) {
        this.f4256k.m4313y(c1322k);
    }

    public void setStrokeColor(int i) {
        this.f4256k.m4312z(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f4256k.m4312z(colorStateList);
    }

    public void setStrokeWidth(int i) {
        this.f4256k.m4342A(i);
    }

    @Override // p000a.p012c.p013a.C0055a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f4256k.m4338E();
        this.f4256k.m4340C();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m4345e() && isEnabled()) {
            this.f4258m = !this.f4258m;
            refreshDrawableState();
            m4346d();
            InterfaceC1363a interfaceC1363a = this.f4260o;
            if (interfaceC1363a != null) {
                interfaceC1363a.m4343a(this, this.f4258m);
            }
        }
    }
}
