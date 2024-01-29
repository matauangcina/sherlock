package p054b.p059c.p060a.p075b.p078l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* renamed from: b.c.a.b.l.i */
/* loaded from: classes.dex */
public class C1358i {

    /* renamed from: a */
    private long f4245a;

    /* renamed from: b */
    private long f4246b;

    /* renamed from: c */
    private TimeInterpolator f4247c;

    /* renamed from: d */
    private int f4248d;

    /* renamed from: e */
    private int f4249e;

    public C1358i(long j, long j2) {
        this.f4245a = 0L;
        this.f4246b = 300L;
        this.f4247c = null;
        this.f4248d = 0;
        this.f4249e = 1;
        this.f4245a = j;
        this.f4246b = j2;
    }

    public C1358i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f4245a = 0L;
        this.f4246b = 300L;
        this.f4247c = null;
        this.f4248d = 0;
        this.f4249e = 1;
        this.f4245a = j;
        this.f4246b = j2;
        this.f4247c = timeInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1358i m4357b(ValueAnimator valueAnimator) {
        C1358i c1358i = new C1358i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m4353f(valueAnimator));
        c1358i.f4248d = valueAnimator.getRepeatCount();
        c1358i.f4249e = valueAnimator.getRepeatMode();
        return c1358i;
    }

    /* renamed from: f */
    private static TimeInterpolator m4353f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C1350a.f4231b : interpolator instanceof AccelerateInterpolator ? C1350a.f4232c : interpolator instanceof DecelerateInterpolator ? C1350a.f4233d : interpolator;
    }

    /* renamed from: a */
    public void m4358a(Animator animator) {
        animator.setStartDelay(m4356c());
        animator.setDuration(m4355d());
        animator.setInterpolator(m4354e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m4352g());
            valueAnimator.setRepeatMode(m4351h());
        }
    }

    /* renamed from: c */
    public long m4356c() {
        return this.f4245a;
    }

    /* renamed from: d */
    public long m4355d() {
        return this.f4246b;
    }

    /* renamed from: e */
    public TimeInterpolator m4354e() {
        TimeInterpolator timeInterpolator = this.f4247c;
        return timeInterpolator != null ? timeInterpolator : C1350a.f4231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1358i) {
            C1358i c1358i = (C1358i) obj;
            if (m4356c() == c1358i.m4356c() && m4355d() == c1358i.m4355d() && m4352g() == c1358i.m4352g() && m4351h() == c1358i.m4351h()) {
                return m4354e().getClass().equals(c1358i.m4354e().getClass());
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public int m4352g() {
        return this.f4248d;
    }

    /* renamed from: h */
    public int m4351h() {
        return this.f4249e;
    }

    public int hashCode() {
        return (((((((((int) (m4356c() ^ (m4356c() >>> 32))) * 31) + ((int) (m4355d() ^ (m4355d() >>> 32)))) * 31) + m4354e().getClass().hashCode()) * 31) + m4352g()) * 31) + m4351h();
    }

    public String toString() {
        return '\n' + C1358i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m4356c() + " duration: " + m4355d() + " interpolator: " + m4354e().getClass() + " repeatCount: " + m4352g() + " repeatMode: " + m4351h() + "}\n";
    }
}
