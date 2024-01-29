package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.AbstractC0030b;
/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0447a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0448a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1288a;

        public C0448a(int i, int i2) {
            super(i, i2);
            this.f1288a = 0;
            this.f1288a = 8388627;
        }

        public C0448a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1288a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionBarLayout);
            this.f1288a = obtainStyledAttributes.getInt(C0009j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0448a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1288a = 0;
        }

        public C0448a(C0448a c0448a) {
            super((ViewGroup.MarginLayoutParams) c0448a);
            this.f1288a = 0;
            this.f1288a = c0448a.f1288a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0449b {
        /* renamed from: a */
        void m8096a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0450c {
        /* renamed from: a */
        public abstract CharSequence m8095a();

        /* renamed from: b */
        public abstract View m8094b();

        /* renamed from: c */
        public abstract Drawable m8093c();

        /* renamed from: d */
        public abstract CharSequence m8092d();

        /* renamed from: e */
        public abstract void m8091e();
    }

    /* renamed from: g */
    public boolean mo7953g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo7924h();

    /* renamed from: i */
    public abstract void mo7923i(boolean z);

    /* renamed from: j */
    public abstract int mo7922j();

    /* renamed from: k */
    public abstract Context mo7921k();

    /* renamed from: l */
    public boolean mo7952l() {
        return false;
    }

    /* renamed from: m */
    public void mo7920m(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo7951n() {
    }

    /* renamed from: o */
    public abstract boolean mo7919o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo7950p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo7949q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo7918r(boolean z);

    /* renamed from: s */
    public abstract void mo7917s(boolean z);

    /* renamed from: t */
    public abstract void mo7916t(CharSequence charSequence);

    /* renamed from: u */
    public AbstractC0030b mo7915u(AbstractC0030b.InterfaceC0031a interfaceC0031a) {
        return null;
    }
}
