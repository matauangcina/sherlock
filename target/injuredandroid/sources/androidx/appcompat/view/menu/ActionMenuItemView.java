package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0673y0;
import androidx.appcompat.widget.C0674z;
import p000a.p001a.C0009j;
/* loaded from: classes.dex */
public class ActionMenuItemView extends C0674z implements InterfaceC0524n.InterfaceC0525a, View.OnClickListener, ActionMenuView.InterfaceC0539a {

    /* renamed from: j */
    C0511i f1468j;

    /* renamed from: k */
    private CharSequence f1469k;

    /* renamed from: l */
    private Drawable f1470l;

    /* renamed from: m */
    C0507g.InterfaceC0509b f1471m;

    /* renamed from: n */
    private AbstractView$OnTouchListenerC0602h0 f1472n;

    /* renamed from: o */
    AbstractC0494b f1473o;

    /* renamed from: p */
    private boolean f1474p;

    /* renamed from: q */
    private boolean f1475q;

    /* renamed from: r */
    private int f1476r;

    /* renamed from: s */
    private int f1477s;

    /* renamed from: t */
    private int f1478t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0493a extends AbstractView$OnTouchListenerC0602h0 {
        public C0493a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
        /* renamed from: b */
        public InterfaceC0527p mo7253b() {
            AbstractC0494b abstractC0494b = ActionMenuItemView.this.f1473o;
            if (abstractC0494b != null) {
                return abstractC0494b.mo7498a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
        /* renamed from: c */
        protected boolean mo7252c() {
            InterfaceC0527p mo7253b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0507g.InterfaceC0509b interfaceC0509b = actionMenuItemView.f1471m;
            return interfaceC0509b != null && interfaceC0509b.mo7688a(actionMenuItemView.f1468j) && (mo7253b = mo7253b()) != null && mo7253b.mo7381c();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0494b {
        /* renamed from: a */
        public abstract InterfaceC0527p mo7498a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1474p = m7892g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionMenuItemView, i, 0);
        this.f1476r = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1478t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1477s = -1;
        setSaveEnabled(false);
    }

    /* renamed from: g */
    private boolean m7892g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m7891h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1469k);
        if (this.f1470l != null && (!this.f1468j.m7805B() || (!this.f1474p && !this.f1475q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1469k : null);
        CharSequence contentDescription = this.f1468j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1468j.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1468j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0673y0.m7140a(this, z3 ? null : this.f1468j.getTitle());
        } else {
            C0673y0.m7140a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0539a
    /* renamed from: a */
    public boolean mo7497a() {
        return m7893f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0539a
    /* renamed from: b */
    public boolean mo7496b() {
        return m7893f() && this.f1468j.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    /* renamed from: d */
    public boolean mo2799d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    /* renamed from: e */
    public void mo2798e(C0511i c0511i, int i) {
        this.f1468j = c0511i;
        setIcon(c0511i.getIcon());
        setTitle(c0511i.m7796i(this));
        setId(c0511i.getItemId());
        setVisibility(c0511i.isVisible() ? 0 : 8);
        setEnabled(c0511i.isEnabled());
        if (c0511i.hasSubMenu() && this.f1472n == null) {
            this.f1472n = new C0493a();
        }
    }

    /* renamed from: f */
    public boolean m7893f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    public C0511i getItemData() {
        return this.f1468j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0507g.InterfaceC0509b interfaceC0509b = this.f1471m;
        if (interfaceC0509b != null) {
            interfaceC0509b.mo7688a(this.f1468j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1474p = m7892g();
        m7891h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0674z, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m7893f = m7893f();
        if (m7893f && (i3 = this.f1477s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1476r) : this.f1476r;
        if (mode != 1073741824 && this.f1476r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m7893f || this.f1470l == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1470l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0602h0 abstractView$OnTouchListenerC0602h0;
        if (this.f1468j.hasSubMenu() && (abstractView$OnTouchListenerC0602h0 = this.f1472n) != null && abstractView$OnTouchListenerC0602h0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1475q != z) {
            this.f1475q = z;
            C0511i c0511i = this.f1468j;
            if (c0511i != null) {
                c0511i.m7802c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1470l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1478t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.f1478t;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m7891h();
    }

    public void setItemInvoker(C0507g.InterfaceC0509b interfaceC0509b) {
        this.f1471m = interfaceC0509b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1477s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0494b abstractC0494b) {
        this.f1473o = abstractC0494b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1469k = charSequence;
        m7891h();
    }
}
