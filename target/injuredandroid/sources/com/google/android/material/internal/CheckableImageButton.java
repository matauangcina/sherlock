package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0622m;
import p000a.p001a.C0000a;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p032i.p033a.AbstractC0280a;
/* loaded from: classes.dex */
public class CheckableImageButton extends C0622m implements Checkable {

    /* renamed from: k */
    private static final int[] f5407k = {16842912};

    /* renamed from: h */
    private boolean f5408h;

    /* renamed from: i */
    private boolean f5409i;

    /* renamed from: j */
    private boolean f5410j;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C1836a extends C0195a {
        C1836a() {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: f */
        public void mo2807f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2807f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            c0217c.m8779U(CheckableImageButton.this.m2808a());
            c0217c.m8778V(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    /* loaded from: classes.dex */
    public static class C1837b extends AbstractC0280a {
        public static final Parcelable.Creator<C1837b> CREATOR = new C1838a();

        /* renamed from: h */
        boolean f5412h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        /* loaded from: classes.dex */
        static class C1838a implements Parcelable.ClassLoaderCreator<C1837b> {
            C1838a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1837b createFromParcel(Parcel parcel) {
                return new C1837b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1837b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1837b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1837b[] newArray(int i) {
                return new C1837b[i];
            }
        }

        public C1837b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m2806b(parcel);
        }

        public C1837b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m2806b(Parcel parcel) {
            this.f5412h = parcel.readInt() == 1;
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5412h ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5409i = true;
        this.f5410j = true;
        C0252s.m8625f0(this, new C1836a());
    }

    /* renamed from: a */
    public boolean m2808a() {
        return this.f5409i;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5408h;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.f5408h ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f5407k.length), f5407k) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1837b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1837b c1837b = (C1837b) parcelable;
        super.onRestoreInstanceState(c1837b.m8522a());
        setChecked(c1837b.f5412h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1837b c1837b = new C1837b(super.onSaveInstanceState());
        c1837b.f5412h = this.f5408h;
        return c1837b;
    }

    public void setCheckable(boolean z) {
        if (this.f5409i != z) {
            this.f5409i = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f5409i || this.f5408h == z) {
            return;
        }
        this.f5408h = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f5410j = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f5410j) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5408h);
    }
}
