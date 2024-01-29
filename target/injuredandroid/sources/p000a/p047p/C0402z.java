package p000a.p047p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.p.z */
/* loaded from: classes.dex */
public class C0402z implements InterfaceC0332b0 {

    /* renamed from: a */
    protected C0403a f1045a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.p.z$a */
    /* loaded from: classes.dex */
    public static class C0403a extends ViewGroup {

        /* renamed from: f */
        ViewGroup f1046f;

        /* renamed from: g */
        View f1047g;

        /* renamed from: h */
        ArrayList<Drawable> f1048h;

        /* renamed from: i */
        C0402z f1049i;

        /* renamed from: j */
        private boolean f1050j;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C0403a(Context context, ViewGroup viewGroup, View view, C0402z c0402z) {
            super(context);
            this.f1048h = null;
            this.f1046f = viewGroup;
            this.f1047g = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1049i = c0402z;
        }

        /* renamed from: c */
        private void m8214c() {
            if (this.f1050j) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m8213d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f1048h;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f1050j = true;
                    this.f1046f.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m8212e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1046f.getLocationOnScreen(iArr2);
            this.f1047g.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void m8216a(Drawable drawable) {
            m8214c();
            if (this.f1048h == null) {
                this.f1048h = new ArrayList<>();
            }
            if (this.f1048h.contains(drawable)) {
                return;
            }
            this.f1048h.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* renamed from: b */
        public void m8215b(View view) {
            m8214c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f1046f && viewGroup.getParent() != null && C0252s.m8651L(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1046f.getLocationOnScreen(iArr2);
                    C0252s.m8645R(view, iArr[0] - iArr2[0]);
                    C0252s.m8644S(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1046f.getLocationOnScreen(iArr);
            this.f1047g.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f1047g.getWidth(), this.f1047g.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f1048h;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1048h.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void m8211f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f1048h;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m8213d();
            }
        }

        /* renamed from: g */
        public void m8210g(View view) {
            super.removeView(view);
            m8213d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1046f != null) {
                rect.offset(iArr[0], iArr[1]);
                if (!(this.f1046f instanceof ViewGroup)) {
                    invalidate(rect);
                    return null;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m8212e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f1048h) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0402z(Context context, ViewGroup viewGroup, View view) {
        this.f1045a = new C0403a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0402z m8218e(View view) {
        ViewGroup m8217f = m8217f(view);
        if (m8217f != null) {
            int childCount = m8217f.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m8217f.getChildAt(i);
                if (childAt instanceof C0403a) {
                    return ((C0403a) childAt).f1049i;
                }
            }
            return new C0396u(m8217f.getContext(), m8217f, view);
        }
        return null;
    }

    /* renamed from: f */
    static ViewGroup m8217f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p000a.p047p.InterfaceC0332b0
    /* renamed from: b */
    public void mo8220b(Drawable drawable) {
        this.f1045a.m8216a(drawable);
    }

    @Override // p000a.p047p.InterfaceC0332b0
    /* renamed from: d */
    public void mo8219d(Drawable drawable) {
        this.f1045a.m8211f(drawable);
    }
}
