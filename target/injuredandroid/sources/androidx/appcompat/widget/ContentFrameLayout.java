package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000a.p019g.p028k.C0252s;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f */
    private TypedValue f1774f;

    /* renamed from: g */
    private TypedValue f1775g;

    /* renamed from: h */
    private TypedValue f1776h;

    /* renamed from: i */
    private TypedValue f1777i;

    /* renamed from: j */
    private TypedValue f1778j;

    /* renamed from: k */
    private TypedValue f1779k;

    /* renamed from: l */
    private final Rect f1780l;

    /* renamed from: m */
    private InterfaceC0544a f1781m;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0544a {
        /* renamed from: a */
        void mo7677a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1780l = new Rect();
    }

    /* renamed from: a */
    public void m7679a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m7678b(int i, int i2, int i3, int i4) {
        this.f1780l.set(i, i2, i3, i4);
        if (C0252s.m8650M(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1778j == null) {
            this.f1778j = new TypedValue();
        }
        return this.f1778j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1779k == null) {
            this.f1779k = new TypedValue();
        }
        return this.f1779k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1776h == null) {
            this.f1776h = new TypedValue();
        }
        return this.f1776h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1777i == null) {
            this.f1777i = new TypedValue();
        }
        return this.f1777i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1774f == null) {
            this.f1774f = new TypedValue();
        }
        return this.f1774f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1775g == null) {
            this.f1775g = new TypedValue();
        }
        return this.f1775g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0544a interfaceC0544a = this.f1781m;
        if (interfaceC0544a != null) {
            interfaceC0544a.mo7677a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0544a interfaceC0544a = this.f1781m;
        if (interfaceC0544a != null) {
            interfaceC0544a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0544a interfaceC0544a) {
        this.f1781m = interfaceC0544a;
    }
}
