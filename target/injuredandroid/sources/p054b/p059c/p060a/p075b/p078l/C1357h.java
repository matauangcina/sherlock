package p054b.p059c.p060a.p075b.p078l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p000a.p014d.C0079g;
/* renamed from: b.c.a.b.l.h */
/* loaded from: classes.dex */
public class C1357h {

    /* renamed from: a */
    private final C0079g<String, C1358i> f4243a = new C0079g<>();

    /* renamed from: b */
    private final C0079g<String, PropertyValuesHolder[]> f4244b = new C0079g<>();

    /* renamed from: a */
    private static void m4367a(C1357h c1357h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1357h.m4360h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c1357h.m4359i(objectAnimator.getPropertyName(), C1358i.m4357b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C1357h m4366b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m4365c(context, resourceId);
    }

    /* renamed from: c */
    public static C1357h m4365c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m4364d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m4364d(arrayList);
            }
            return null;
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C1357h m4364d(List<Animator> list) {
        C1357h c1357h = new C1357h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m4367a(c1357h, list.get(i));
        }
        return c1357h;
    }

    /* renamed from: e */
    public C1358i m4363e(String str) {
        if (m4361g(str)) {
            return this.f4243a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1357h) {
            return this.f4243a.equals(((C1357h) obj).f4243a);
        }
        return false;
    }

    /* renamed from: f */
    public long m4362f() {
        int size = this.f4243a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1358i m9330m = this.f4243a.m9330m(i);
            j = Math.max(j, m9330m.m4356c() + m9330m.m4355d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean m4361g(String str) {
        return this.f4243a.get(str) != null;
    }

    /* renamed from: h */
    public void m4360h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f4244b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f4243a.hashCode();
    }

    /* renamed from: i */
    public void m4359i(String str, C1358i c1358i) {
        this.f4243a.put(str, c1358i);
    }

    public String toString() {
        return '\n' + C1357h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4243a + "}\n";
    }
}
