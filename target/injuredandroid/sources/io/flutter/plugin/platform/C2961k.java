package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.InterfaceC2987e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.platform.k */
/* loaded from: classes.dex */
public class C2961k {

    /* renamed from: a */
    private final Context f7397a;

    /* renamed from: b */
    private final C2948c f7398b;

    /* renamed from: c */
    private final int f7399c;

    /* renamed from: d */
    private final InterfaceC2987e.InterfaceC2988a f7400d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f7401e;

    /* renamed from: f */
    private VirtualDisplay f7402f;

    /* renamed from: g */
    SingleViewPresentation f7403g;

    /* renamed from: h */
    private Surface f7404h;

    /* renamed from: io.flutter.plugin.platform.k$a */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC2962a implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ View f7405f;

        /* renamed from: g */
        final /* synthetic */ Runnable f7406g;

        /* renamed from: io.flutter.plugin.platform.k$a$a */
        /* loaded from: classes.dex */
        class RunnableC2963a implements Runnable {
            RunnableC2963a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View$OnAttachStateChangeListenerC2962a view$OnAttachStateChangeListenerC2962a = View$OnAttachStateChangeListenerC2962a.this;
                view$OnAttachStateChangeListenerC2962a.f7405f.postDelayed(view$OnAttachStateChangeListenerC2962a.f7406g, 128L);
            }
        }

        View$OnAttachStateChangeListenerC2962a(C2961k c2961k, View view, Runnable runnable) {
            this.f7405f = view;
            this.f7406g = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ViewTreeObserver$OnDrawListenerC2964b.m162a(this.f7405f, new RunnableC2963a());
            this.f7405f.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: io.flutter.plugin.platform.k$b */
    /* loaded from: classes.dex */
    static class ViewTreeObserver$OnDrawListenerC2964b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        final View f7408a;

        /* renamed from: b */
        Runnable f7409b;

        /* renamed from: io.flutter.plugin.platform.k$b$a */
        /* loaded from: classes.dex */
        class RunnableC2965a implements Runnable {
            RunnableC2965a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver$OnDrawListenerC2964b.this.f7408a.getViewTreeObserver().removeOnDrawListener(ViewTreeObserver$OnDrawListenerC2964b.this);
            }
        }

        ViewTreeObserver$OnDrawListenerC2964b(View view, Runnable runnable) {
            this.f7408a = view;
            this.f7409b = runnable;
        }

        /* renamed from: a */
        static void m162a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver$OnDrawListenerC2964b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f7409b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f7409b = null;
            this.f7408a.post(new RunnableC2965a());
        }
    }

    private C2961k(Context context, C2948c c2948c, VirtualDisplay virtualDisplay, AbstractC2954f abstractC2954f, Surface surface, InterfaceC2987e.InterfaceC2988a interfaceC2988a, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
        this.f7397a = context;
        this.f7398b = c2948c;
        this.f7400d = interfaceC2988a;
        this.f7401e = onFocusChangeListener;
        this.f7404h = surface;
        this.f7402f = virtualDisplay;
        this.f7399c = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f7402f.getDisplay(), abstractC2954f, c2948c, i, obj, onFocusChangeListener);
        this.f7403g = singleViewPresentation;
        singleViewPresentation.show();
    }

    /* renamed from: a */
    public static C2961k m171a(Context context, C2948c c2948c, AbstractC2954f abstractC2954f, InterfaceC2987e.InterfaceC2988a interfaceC2988a, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        interfaceC2988a.mo11b().setDefaultBufferSize(i, i2);
        Surface surface = new Surface(interfaceC2988a.mo11b());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new C2961k(context, c2948c, createVirtualDisplay, abstractC2954f, surface, interfaceC2988a, onFocusChangeListener, i3, obj);
    }

    /* renamed from: b */
    public void m170b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f7403g;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: c */
    public void m169c() {
        InterfaceC2953e view = this.f7403g.getView();
        this.f7403g.cancel();
        this.f7403g.detachState();
        view.m244a();
        this.f7402f.release();
        this.f7400d.mo12a();
    }

    /* renamed from: d */
    public View m168d() {
        SingleViewPresentation singleViewPresentation = this.f7403g;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().m242c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m167e(View view) {
        SingleViewPresentation singleViewPresentation = this.f7403g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f7403g.getView().m241d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m166f() {
        SingleViewPresentation singleViewPresentation = this.f7403g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f7403g.getView().m240e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m165g() {
        SingleViewPresentation singleViewPresentation = this.f7403g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f7403g.getView().m239f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m164h() {
        SingleViewPresentation singleViewPresentation = this.f7403g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f7403g.getView().m243b();
    }

    /* renamed from: i */
    public void m163i(int i, int i2, Runnable runnable) {
        boolean isFocused = m168d().isFocused();
        SingleViewPresentation.C2944e detachState = this.f7403g.detachState();
        this.f7402f.setSurface(null);
        this.f7402f.release();
        this.f7400d.mo11b().setDefaultBufferSize(i, i2);
        this.f7402f = ((DisplayManager) this.f7397a.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, this.f7399c, this.f7404h, 0);
        View m168d = m168d();
        m168d.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2962a(this, m168d, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f7397a, this.f7402f.getDisplay(), this.f7398b, detachState, this.f7401e, isFocused);
        singleViewPresentation.show();
        this.f7403g.cancel();
        this.f7403g = singleViewPresentation;
    }
}
