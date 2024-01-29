package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p001a.C0000a;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0267w;
import p000a.p019g.p028k.InterfaceC0271x;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0572a extends ViewGroup {

    /* renamed from: f */
    protected final C0573a f1915f;

    /* renamed from: g */
    protected final Context f1916g;

    /* renamed from: h */
    protected ActionMenuView f1917h;

    /* renamed from: i */
    protected C0579c f1918i;

    /* renamed from: j */
    protected int f1919j;

    /* renamed from: k */
    protected C0267w f1920k;

    /* renamed from: l */
    private boolean f1921l;

    /* renamed from: m */
    private boolean f1922m;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0573a implements InterfaceC0271x {

        /* renamed from: a */
        private boolean f1923a = false;

        /* renamed from: b */
        int f1924b;

        protected C0573a() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: a */
        public void mo7172a(View view) {
            this.f1923a = true;
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            if (this.f1923a) {
                return;
            }
            AbstractC0572a abstractC0572a = AbstractC0572a.this;
            abstractC0572a.f1920k = null;
            AbstractC0572a.super.setVisibility(this.f1924b);
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: c */
        public void mo7170c(View view) {
            AbstractC0572a.super.setVisibility(0);
            this.f1923a = false;
        }

        /* renamed from: d */
        public C0573a m7567d(C0267w c0267w, int i) {
            AbstractC0572a.this.f1920k = c0267w;
            this.f1924b = i;
            return this;
        }
    }

    AbstractC0572a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0572a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1915f = new C0573a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0000a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1916g = context;
        } else {
            this.f1916g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m7570d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m7571c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m7569e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0267w m7568f(int i, long j) {
        C0267w c0267w = this.f1920k;
        if (c0267w != null) {
            c0267w.m8537b();
        }
        if (i != 0) {
            C0267w m8632c = C0252s.m8632c(this);
            m8632c.m8538a(0.0f);
            m8632c.m8535d(j);
            C0573a c0573a = this.f1915f;
            c0573a.m7567d(m8632c, i);
            m8632c.m8533f(c0573a);
            return m8632c;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0267w m8632c2 = C0252s.m8632c(this);
        m8632c2.m8538a(1.0f);
        m8632c2.m8535d(j);
        C0573a c0573a2 = this.f1915f;
        c0573a2.m7567d(m8632c2, i);
        m8632c2.m8533f(c0573a2);
        return m8632c2;
    }

    public int getAnimatedVisibility() {
        return this.f1920k != null ? this.f1915f.f1924b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1919j;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0009j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0579c c0579c = this.f1918i;
        if (c0579c != null) {
            c0579c.m7523E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1922m = false;
        }
        if (!this.f1922m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1922m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1922m = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1921l = false;
        }
        if (!this.f1921l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1921l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1921l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0267w c0267w = this.f1920k;
            if (c0267w != null) {
                c0267w.m8537b();
            }
            super.setVisibility(i);
        }
    }
}
