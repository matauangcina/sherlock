package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p001a.C0000a;
/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public class C0649u extends SeekBar {

    /* renamed from: f */
    private final C0651v f2193f;

    public C0649u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.seekBarStyle);
    }

    public C0649u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0651v c0651v = new C0651v(this);
        this.f2193f = c0651v;
        c0651v.mo7261c(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2193f.m7258h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2193f.m7257i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2193f.m7259g(canvas);
    }
}
