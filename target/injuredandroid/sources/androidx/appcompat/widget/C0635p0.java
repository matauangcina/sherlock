package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0447a;
import androidx.appcompat.widget.C0606i0;
import p000a.p001a.C0000a;
import p000a.p001a.p007n.C0029a;
/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: classes.dex */
public class C0635p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    Runnable f2135f;

    /* renamed from: g */
    private View$OnClickListenerC0638c f2136g;

    /* renamed from: h */
    C0606i0 f2137h;

    /* renamed from: i */
    private Spinner f2138i;

    /* renamed from: j */
    private boolean f2139j;

    /* renamed from: k */
    int f2140k;

    /* renamed from: l */
    int f2141l;

    /* renamed from: m */
    private int f2142m;

    /* renamed from: n */
    private int f2143n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.p0$a */
    /* loaded from: classes.dex */
    public class RunnableC0636a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f2144f;

        RunnableC0636a(View view) {
            this.f2144f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0635p0.this.smoothScrollTo(this.f2144f.getLeft() - ((C0635p0.this.getWidth() - this.f2144f.getWidth()) / 2), 0);
            C0635p0.this.f2135f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p0$b */
    /* loaded from: classes.dex */
    public class C0637b extends BaseAdapter {
        C0637b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0635p0.this.f2137h.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0639d) C0635p0.this.f2137h.getChildAt(i)).m7300b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0635p0.this.m7305c((AbstractC0447a.AbstractC0450c) getItem(i), true);
            }
            ((C0639d) view).m7301a((AbstractC0447a.AbstractC0450c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p0$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0638c implements View.OnClickListener {
        View$OnClickListenerC0638c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C0639d) view).m7300b().m8091e();
            int childCount = C0635p0.this.f2137h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0635p0.this.f2137h.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p0$d */
    /* loaded from: classes.dex */
    public class C0639d extends LinearLayout {

        /* renamed from: f */
        private final int[] f2148f;

        /* renamed from: g */
        private AbstractC0447a.AbstractC0450c f2149g;

        /* renamed from: h */
        private TextView f2150h;

        /* renamed from: i */
        private ImageView f2151i;

        /* renamed from: j */
        private View f2152j;

        public C0639d(Context context, AbstractC0447a.AbstractC0450c abstractC0450c, boolean z) {
            super(context, null, C0000a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f2148f = iArr;
            this.f2149g = abstractC0450c;
            C0665w0 m7213u = C0665w0.m7213u(context, null, iArr, C0000a.actionBarTabStyle, 0);
            if (m7213u.m7216r(0)) {
                setBackgroundDrawable(m7213u.m7227g(0));
            }
            m7213u.m7212v();
            if (z) {
                setGravity(8388627);
            }
            m7299c();
        }

        /* renamed from: a */
        public void m7301a(AbstractC0447a.AbstractC0450c abstractC0450c) {
            this.f2149g = abstractC0450c;
            m7299c();
        }

        /* renamed from: b */
        public AbstractC0447a.AbstractC0450c m7300b() {
            return this.f2149g;
        }

        /* renamed from: c */
        public void m7299c() {
            AbstractC0447a.AbstractC0450c abstractC0450c = this.f2149g;
            View m8094b = abstractC0450c.m8094b();
            if (m8094b != null) {
                ViewParent parent = m8094b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m8094b);
                    }
                    addView(m8094b);
                }
                this.f2152j = m8094b;
                TextView textView = this.f2150h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2151i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2151i.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2152j;
            if (view != null) {
                removeView(view);
                this.f2152j = null;
            }
            Drawable m8093c = abstractC0450c.m8093c();
            CharSequence m8092d = abstractC0450c.m8092d();
            if (m8093c != null) {
                if (this.f2151i == null) {
                    C0632o c0632o = new C0632o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0632o.setLayoutParams(layoutParams);
                    addView(c0632o, 0);
                    this.f2151i = c0632o;
                }
                this.f2151i.setImageDrawable(m8093c);
                this.f2151i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2151i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2151i.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m8092d);
            if (z) {
                if (this.f2150h == null) {
                    C0674z c0674z = new C0674z(getContext(), null, C0000a.actionBarTabTextStyle);
                    c0674z.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0674z.setLayoutParams(layoutParams2);
                    addView(c0674z);
                    this.f2150h = c0674z;
                }
                this.f2150h.setText(m8092d);
                this.f2150h.setVisibility(0);
            } else {
                TextView textView2 = this.f2150h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2150h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2151i;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0450c.m8095a());
            }
            C0673y0.m7140a(this, z ? null : abstractC0450c.m8095a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0635p0.this.f2140k > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0635p0.this.f2140k;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: b */
    private Spinner m7306b() {
        C0653w c0653w = new C0653w(getContext(), null, C0000a.actionDropDownStyle);
        c0653w.setLayoutParams(new C0606i0.C0607a(-2, -1));
        c0653w.setOnItemSelectedListener(this);
        return c0653w;
    }

    /* renamed from: d */
    private boolean m7304d() {
        Spinner spinner = this.f2138i;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m7303e() {
        if (m7304d()) {
            return;
        }
        if (this.f2138i == null) {
            this.f2138i = m7306b();
        }
        removeView(this.f2137h);
        addView(this.f2138i, new ViewGroup.LayoutParams(-2, -1));
        if (this.f2138i.getAdapter() == null) {
            this.f2138i.setAdapter((SpinnerAdapter) new C0637b());
        }
        Runnable runnable = this.f2135f;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f2135f = null;
        }
        this.f2138i.setSelection(this.f2143n);
    }

    /* renamed from: f */
    private boolean m7302f() {
        if (m7304d()) {
            removeView(this.f2138i);
            addView(this.f2137h, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f2138i.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m7307a(int i) {
        View childAt = this.f2137h.getChildAt(i);
        Runnable runnable = this.f2135f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0636a runnableC0636a = new RunnableC0636a(childAt);
        this.f2135f = runnableC0636a;
        post(runnableC0636a);
    }

    /* renamed from: c */
    C0639d m7305c(AbstractC0447a.AbstractC0450c abstractC0450c, boolean z) {
        C0639d c0639d = new C0639d(getContext(), abstractC0450c, z);
        if (z) {
            c0639d.setBackgroundDrawable(null);
            c0639d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2142m));
        } else {
            c0639d.setFocusable(true);
            if (this.f2136g == null) {
                this.f2136g = new View$OnClickListenerC0638c();
            }
            c0639d.setOnClickListener(this.f2136g);
        }
        return c0639d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2135f;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0029a m9507b = C0029a.m9507b(getContext());
        setContentHeight(m9507b.m9503f());
        this.f2141l = m9507b.m9504e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2135f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0639d) view).m7300b().m8091e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2137h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f2140k = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f2140k = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f2140k, this.f2141l);
        }
        this.f2140k = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2142m, 1073741824);
        if ((z2 || !this.f2139j) ? false : false) {
            this.f2137h.measure(0, makeMeasureSpec);
            if (this.f2137h.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m7303e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f2143n);
                return;
            }
        }
        m7302f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2139j = z;
    }

    public void setContentHeight(int i) {
        this.f2142m = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2143n = i;
        int childCount = this.f2137h.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2137h.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m7307a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2138i;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
