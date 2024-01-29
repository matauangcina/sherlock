package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p108c.p109a.C1499b;
@Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private final C2948c accessibilityEventsDelegate;
    private FrameLayout container;
    private Object createParams;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private C2940a rootView;
    private boolean startFocused;
    private C2944e state;
    private final AbstractC2954f viewFactory;
    private int viewId;

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$a */
    /* loaded from: classes.dex */
    private static class C2940a extends FrameLayout {

        /* renamed from: f */
        private final C2948c f7345f;

        /* renamed from: g */
        private final View f7346g;

        public C2940a(Context context, C2948c c2948c, View view) {
            super(context);
            this.f7345f = c2948c;
            this.f7346g = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7345f.m279a(this.f7346g, view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$b */
    /* loaded from: classes.dex */
    public static class C2941b extends ViewGroup {

        /* renamed from: f */
        private final Rect f7347f;

        /* renamed from: g */
        private final Rect f7348g;

        public C2941b(Context context) {
            super(context);
            this.f7347f = new Rect();
            this.f7348g = new Rect();
        }

        /* renamed from: a */
        private static int m293a(int i) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), RecyclerView.UNDEFINED_DURATION);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f7347f.set(i, i2, i3, i4);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f7347f, layoutParams.x, layoutParams.y, this.f7348g);
                Rect rect = this.f7348g;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).measure(m293a(i), m293a(i2));
            }
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$c */
    /* loaded from: classes.dex */
    private static class C2942c extends ContextWrapper {

        /* renamed from: a */
        private final InputMethodManager f7349a;

        C2942c(Context context) {
            this(context, null);
        }

        private C2942c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f7349a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new C2942c(super.createDisplayContext(display), this.f7349a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f7349a : super.getSystemService(str);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$d */
    /* loaded from: classes.dex */
    private static class C2943d extends ContextWrapper {

        /* renamed from: a */
        private final C2945f f7350a;

        /* renamed from: b */
        private WindowManager f7351b;

        /* renamed from: c */
        private final Context f7352c;

        C2943d(Context context, C2945f c2945f, Context context2) {
            super(context);
            this.f7350a = c2945f;
            this.f7352c = context2;
        }

        /* renamed from: a */
        private WindowManager m292a() {
            if (this.f7351b == null) {
                this.f7351b = this.f7350a.m283b();
            }
            return this.f7351b;
        }

        /* renamed from: b */
        private boolean m291b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 0; i < stackTrace.length && i < 11; i++) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? m291b() ? this.f7352c.getSystemService(str) : m292a() : super.getSystemService(str);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$e */
    /* loaded from: classes.dex */
    static class C2944e {

        /* renamed from: a */
        private InterfaceC2953e f7353a;

        /* renamed from: b */
        private C2945f f7354b;

        /* renamed from: c */
        private C2941b f7355c;

        C2944e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$f */
    /* loaded from: classes.dex */
    public static class C2945f implements InvocationHandler {

        /* renamed from: a */
        private final WindowManager f7356a;

        /* renamed from: b */
        C2941b f7357b;

        C2945f(WindowManager windowManager, C2941b c2941b) {
            this.f7356a = windowManager;
            this.f7357b = c2941b;
        }

        /* renamed from: a */
        private void m284a(Object[] objArr) {
            C2941b c2941b = this.f7357b;
            if (c2941b == null) {
                C1499b.m4049e("PlatformViewsController", "Embedded view called addView while detached from presentation");
            } else {
                c2941b.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        /* renamed from: c */
        private void m282c(Object[] objArr) {
            C2941b c2941b = this.f7357b;
            if (c2941b == null) {
                C1499b.m4049e("PlatformViewsController", "Embedded view called removeView while detached from presentation");
            } else {
                c2941b.removeView((View) objArr[0]);
            }
        }

        /* renamed from: d */
        private void m281d(Object[] objArr) {
            if (this.f7357b == null) {
                C1499b.m4049e("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View) objArr[0];
            view.clearAnimation();
            this.f7357b.removeView(view);
        }

        /* renamed from: e */
        private void m280e(Object[] objArr) {
            C2941b c2941b = this.f7357b;
            if (c2941b == null) {
                C1499b.m4049e("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
            } else {
                c2941b.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        /* renamed from: b */
        public WindowManager m283b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            char c;
            String name = method.getName();
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                m284a(objArr);
                return null;
            } else if (c == 1) {
                m282c(objArr);
                return null;
            } else if (c == 2) {
                m281d(objArr);
                return null;
            } else if (c == 3) {
                m280e(objArr);
                return null;
            } else {
                try {
                    return method.invoke(this.f7356a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, C2948c c2948c, C2944e c2944e, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new C2942c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c2948c;
        this.viewFactory = null;
        this.state = c2944e;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }

    public SingleViewPresentation(Context context, Display display, AbstractC2954f abstractC2954f, C2948c c2948c, int i, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        super(new C2942c(context), display);
        this.startFocused = false;
        this.viewFactory = abstractC2954f;
        this.accessibilityEventsDelegate = c2948c;
        this.viewId = i;
        this.createParams = obj;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new C2944e();
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public C2944e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public InterfaceC2953e getView() {
        if (this.state.f7353a == null) {
            return null;
        }
        return this.state.f7353a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f7355c == null) {
            this.state.f7355c = new C2941b(getContext());
        }
        if (this.state.f7354b == null) {
            C2944e c2944e = this.state;
            c2944e.f7354b = new C2945f((WindowManager) getContext().getSystemService("window"), c2944e.f7355c);
        }
        this.container = new FrameLayout(getContext());
        C2943d c2943d = new C2943d(getContext(), this.state.f7354b, this.outerContext);
        if (this.state.f7353a == null) {
            this.state.f7353a = this.viewFactory.m238a(c2943d, this.viewId, this.createParams);
        }
        View m242c = this.state.f7353a.m242c();
        this.container.addView(m242c);
        C2940a c2940a = new C2940a(getContext(), this.accessibilityEventsDelegate, m242c);
        this.rootView = c2940a;
        c2940a.addView(this.container);
        this.rootView.addView(this.state.f7355c);
        m242c.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            m242c.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
