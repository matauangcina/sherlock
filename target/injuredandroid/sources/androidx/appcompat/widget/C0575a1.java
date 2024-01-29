package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p000a.p001a.C0003d;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0008i;
/* renamed from: androidx.appcompat.widget.a1 */
/* loaded from: classes.dex */
class C0575a1 {

    /* renamed from: a */
    private final Context f1939a;

    /* renamed from: b */
    private final View f1940b;

    /* renamed from: c */
    private final TextView f1941c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1942d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1943e = new Rect();

    /* renamed from: f */
    private final int[] f1944f = new int[2];

    /* renamed from: g */
    private final int[] f1945g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0575a1(Context context) {
        this.f1939a = context;
        View inflate = LayoutInflater.from(context).inflate(C0006g.abc_tooltip, (ViewGroup) null);
        this.f1940b = inflate;
        this.f1941c = (TextView) inflate.findViewById(C0005f.message);
        this.f1942d.setTitle(C0575a1.class.getSimpleName());
        this.f1942d.packageName = this.f1939a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1942d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0008i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m7535a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1939a.getResources().getDimensionPixelOffset(C0003d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1939a.getResources().getDimensionPixelOffset(C0003d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1939a.getResources().getDimensionPixelOffset(z ? C0003d.tooltip_y_offset_touch : C0003d.tooltip_y_offset_non_touch);
        View m7534b = m7534b(view);
        if (m7534b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m7534b.getWindowVisibleDisplayFrame(this.f1943e);
        Rect rect = this.f1943e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1939a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1943e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m7534b.getLocationOnScreen(this.f1945g);
        view.getLocationOnScreen(this.f1944f);
        int[] iArr = this.f1944f;
        int i4 = iArr[0];
        int[] iArr2 = this.f1945g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m7534b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1940b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1940b.getMeasuredHeight();
        int[] iArr3 = this.f1944f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f1943e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m7534b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m7533c() {
        if (m7532d()) {
            ((WindowManager) this.f1939a.getSystemService("window")).removeView(this.f1940b);
        }
    }

    /* renamed from: d */
    boolean m7532d() {
        return this.f1940b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7531e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m7532d()) {
            m7533c();
        }
        this.f1941c.setText(charSequence);
        m7535a(view, i, i2, z, this.f1942d);
        ((WindowManager) this.f1939a.getSystemService("window")).addView(this.f1940b, this.f1942d);
    }
}
