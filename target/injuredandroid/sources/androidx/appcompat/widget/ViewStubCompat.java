package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p001a.C0009j;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f1910f;

    /* renamed from: g */
    private int f1911g;

    /* renamed from: h */
    private WeakReference<View> f1912h;

    /* renamed from: i */
    private LayoutInflater f1913i;

    /* renamed from: j */
    private InterfaceC0571a f1914j;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0571a {
        /* renamed from: a */
        void m7574a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1910f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ViewStubCompat, i, 0);
        this.f1911g = obtainStyledAttributes.getResourceId(C0009j.ViewStubCompat_android_inflatedId, -1);
        this.f1910f = obtainStyledAttributes.getResourceId(C0009j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0009j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m7575a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1910f != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1913i;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1910f, viewGroup, false);
                int i = this.f1911g;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1912h = new WeakReference<>(inflate);
                InterfaceC0571a interfaceC0571a = this.f1914j;
                if (interfaceC0571a != null) {
                    interfaceC0571a.m7574a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1911g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1913i;
    }

    public int getLayoutResource() {
        return this.f1910f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1911g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1913i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1910f = i;
    }

    public void setOnInflateListener(InterfaceC0571a interfaceC0571a) {
        this.f1914j = interfaceC0571a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1912h;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m7575a();
        }
    }
}
