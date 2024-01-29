package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p054b.p059c.p060a.p075b.p091x.AbstractC1393f;
import p054b.p059c.p060a.p075b.p091x.C1389d;
/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes.dex */
public class C1848f {

    /* renamed from: c */
    private float f5495c;

    /* renamed from: f */
    private C1389d f5498f;

    /* renamed from: a */
    private final TextPaint f5493a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC1393f f5494b = new C1849a();

    /* renamed from: d */
    private boolean f5496d = true;

    /* renamed from: e */
    private WeakReference<InterfaceC1850b> f5497e = new WeakReference<>(null);

    /* renamed from: com.google.android.material.internal.f$a */
    /* loaded from: classes.dex */
    class C1849a extends AbstractC1393f {
        C1849a() {
        }

        @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
        /* renamed from: a */
        public void mo2727a(int i) {
            C1848f.this.f5496d = true;
            InterfaceC1850b interfaceC1850b = (InterfaceC1850b) C1848f.this.f5497e.get();
            if (interfaceC1850b != null) {
                interfaceC1850b.mo2725a();
            }
        }

        @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
        /* renamed from: b */
        public void mo2726b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C1848f.this.f5496d = true;
            InterfaceC1850b interfaceC1850b = (InterfaceC1850b) C1848f.this.f5497e.get();
            if (interfaceC1850b != null) {
                interfaceC1850b.mo2725a();
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1850b {
        /* renamed from: a */
        void mo2725a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C1848f(InterfaceC1850b interfaceC1850b) {
        m2731g(interfaceC1850b);
    }

    /* renamed from: c */
    private float m2735c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f5493a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C1389d m2734d() {
        return this.f5498f;
    }

    /* renamed from: e */
    public TextPaint m2733e() {
        return this.f5493a;
    }

    /* renamed from: f */
    public float m2732f(String str) {
        if (this.f5496d) {
            float m2735c = m2735c(str);
            this.f5495c = m2735c;
            this.f5496d = false;
            return m2735c;
        }
        return this.f5495c;
    }

    /* renamed from: g */
    public void m2731g(InterfaceC1850b interfaceC1850b) {
        this.f5497e = new WeakReference<>(interfaceC1850b);
    }

    /* renamed from: h */
    public void m2730h(C1389d c1389d, Context context) {
        if (this.f5498f != c1389d) {
            this.f5498f = c1389d;
            if (c1389d != null) {
                c1389d.m4247j(context, this.f5493a, this.f5494b);
                InterfaceC1850b interfaceC1850b = this.f5497e.get();
                if (interfaceC1850b != null) {
                    this.f5493a.drawableState = interfaceC1850b.getState();
                }
                c1389d.m4248i(context, this.f5493a, this.f5494b);
                this.f5496d = true;
            }
            InterfaceC1850b interfaceC1850b2 = this.f5497e.get();
            if (interfaceC1850b2 != null) {
                interfaceC1850b2.mo2725a();
                interfaceC1850b2.onStateChange(interfaceC1850b2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m2729i(boolean z) {
        this.f5496d = z;
    }

    /* renamed from: j */
    public void m2728j(Context context) {
        this.f5498f.m4248i(context, this.f5493a, this.f5494b);
    }
}
