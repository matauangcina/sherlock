package p000a.p001a.p004l.p005a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0623m0;
import androidx.core.content.p052d.C0758g;
import androidx.core.graphics.drawable.InterfaceC0760b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p004l.p005a.C0020b;
import p000a.p001a.p004l.p005a.C0025d;
import p000a.p001a.p006m.C0028b;
import p000a.p014d.C0071d;
import p000a.p014d.C0080h;
import p000a.p048q.p049a.p050a.C0405b;
import p000a.p048q.p049a.p050a.C0415h;
/* renamed from: a.a.l.a.a */
/* loaded from: classes.dex */
public class C0012a extends C0025d implements InterfaceC0760b {

    /* renamed from: t */
    private C0015c f7t;

    /* renamed from: u */
    private AbstractC0019g f8u;

    /* renamed from: v */
    private int f9v;

    /* renamed from: w */
    private int f10w;

    /* renamed from: x */
    private boolean f11x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$b */
    /* loaded from: classes.dex */
    public static class C0014b extends AbstractC0019g {

        /* renamed from: a */
        private final Animatable f12a;

        C0014b(Animatable animatable) {
            super();
            this.f12a = animatable;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo9552c() {
            this.f12a.start();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo9551d() {
            this.f12a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.a$c */
    /* loaded from: classes.dex */
    public static class C0015c extends C0025d.C0026a {

        /* renamed from: K */
        C0071d<Long> f13K;

        /* renamed from: L */
        C0080h<Integer> f14L;

        C0015c(C0015c c0015c, C0012a c0012a, Resources resources) {
            super(c0015c, c0012a, resources);
            C0080h<Integer> c0080h;
            if (c0015c != null) {
                this.f13K = c0015c.f13K;
                c0080h = c0015c.f14L;
            } else {
                this.f13K = new C0071d<>();
                c0080h = new C0080h<>();
            }
            this.f14L = c0080h;
        }

        /* renamed from: D */
        private static long m9562D(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: B */
        int m9564B(int[] iArr, Drawable drawable, int i) {
            int m9509z = super.m9509z(iArr, drawable);
            this.f14L.m9321i(m9509z, Integer.valueOf(i));
            return m9509z;
        }

        /* renamed from: C */
        int m9563C(int i, int i2, Drawable drawable, boolean z) {
            int m9541a = super.m9541a(drawable);
            long m9562D = m9562D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = m9541a;
            this.f13K.m9383a(m9562D, Long.valueOf(j2 | j));
            if (z) {
                this.f13K.m9383a(m9562D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m9541a;
        }

        /* renamed from: E */
        int m9561E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f14L.m9324f(i, 0).intValue();
        }

        /* renamed from: F */
        int m9560F(int[] iArr) {
            int m9512A = super.m9512A(iArr);
            return m9512A >= 0 ? m9512A : super.m9512A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m9559G(int i, int i2) {
            return (int) this.f13K.m9377g(m9562D(i, i2), -1L).longValue();
        }

        /* renamed from: H */
        boolean m9558H(int i, int i2) {
            return (this.f13K.m9377g(m9562D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        boolean m9557I(int i, int i2) {
            return (this.f13K.m9377g(m9562D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p000a.p001a.p004l.p005a.C0025d.C0026a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0012a(this, null);
        }

        @Override // p000a.p001a.p004l.p005a.C0025d.C0026a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0012a(this, resources);
        }

        @Override // p000a.p001a.p004l.p005a.C0025d.C0026a, p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: r */
        void mo9510r() {
            this.f13K = this.f13K.clone();
            this.f14L = this.f14L.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$d */
    /* loaded from: classes.dex */
    public static class C0016d extends AbstractC0019g {

        /* renamed from: a */
        private final C0405b f15a;

        C0016d(C0405b c0405b) {
            super();
            this.f15a = c0405b;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo9552c() {
            this.f15a.start();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo9551d() {
            this.f15a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$e */
    /* loaded from: classes.dex */
    public static class C0017e extends AbstractC0019g {

        /* renamed from: a */
        private final ObjectAnimator f16a;

        /* renamed from: b */
        private final boolean f17b;

        C0017e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0018f c0018f = new C0018f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(c0018f.m9556a());
            ofInt.setInterpolator(c0018f);
            this.f17b = z2;
            this.f16a = ofInt;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: a */
        public boolean mo9554a() {
            return this.f17b;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: b */
        public void mo9553b() {
            this.f16a.reverse();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo9552c() {
            this.f16a.start();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo9551d() {
            this.f16a.cancel();
        }
    }

    /* renamed from: a.a.l.a.a$f */
    /* loaded from: classes.dex */
    private static class C0018f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f18a;

        /* renamed from: b */
        private int f19b;

        /* renamed from: c */
        private int f20c;

        C0018f(AnimationDrawable animationDrawable, boolean z) {
            m9555b(animationDrawable, z);
        }

        /* renamed from: a */
        int m9556a() {
            return this.f20c;
        }

        /* renamed from: b */
        int m9555b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f19b = numberOfFrames;
            int[] iArr = this.f18a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f18a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f18a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f20c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f20c) + 0.5f);
            int i2 = this.f19b;
            int[] iArr = this.f18a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f20c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0019g {
        private AbstractC0019g() {
        }

        /* renamed from: a */
        public boolean mo9554a() {
            return false;
        }

        /* renamed from: b */
        public void mo9553b() {
        }

        /* renamed from: c */
        public abstract void mo9552c();

        /* renamed from: d */
        public abstract void mo9551d();
    }

    public C0012a() {
        this(null, null);
    }

    C0012a(C0015c c0015c, Resources resources) {
        super(null);
        this.f9v = -1;
        this.f10w = -1;
        mo9515h(new C0015c(c0015c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C0012a m9572m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0012a c0012a = new C0012a();
            c0012a.m9571n(context, resources, xmlPullParser, attributeSet, theme);
            return c0012a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m9570o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m9568q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m9567r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: p */
    private void m9569p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m9568q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0028b.AnimatedStateListDrawableItem);
        int resourceId = m6779k.getResourceId(C0028b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = m6779k.getResourceId(C0028b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable m7348j = resourceId2 > 0 ? C0623m0.m7350h().m7348j(context, resourceId2) : null;
        m6779k.recycle();
        int[] m9513k = m9513k(attributeSet);
        if (m7348j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m7348j = xmlPullParser.getName().equals("vector") ? C0415h.m8176c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (m7348j != null) {
            return this.f7t.m9564B(m9513k, m7348j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m9567r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0028b.AnimatedStateListDrawableTransition);
        int resourceId = m6779k.getResourceId(C0028b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = m6779k.getResourceId(C0028b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = m6779k.getResourceId(C0028b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable m7348j = resourceId3 > 0 ? C0623m0.m7350h().m7348j(context, resourceId3) : null;
        boolean z = m6779k.getBoolean(C0028b.AnimatedStateListDrawableTransition_android_reversible, false);
        m6779k.recycle();
        if (m7348j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m7348j = xmlPullParser.getName().equals("animated-vector") ? C0405b.m8209a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (m7348j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        } else {
            return this.f7t.m9563C(resourceId, resourceId2, m7348j, z);
        }
    }

    /* renamed from: s */
    private boolean m9566s(int i) {
        int m9549c;
        int m9559G;
        AbstractC0019g c0014b;
        AbstractC0019g abstractC0019g = this.f8u;
        if (abstractC0019g == null) {
            m9549c = m9549c();
        } else if (i == this.f9v) {
            return true;
        } else {
            if (i == this.f10w && abstractC0019g.mo9554a()) {
                abstractC0019g.mo9553b();
                this.f9v = this.f10w;
                this.f10w = i;
                return true;
            }
            m9549c = this.f9v;
            abstractC0019g.mo9551d();
        }
        this.f8u = null;
        this.f10w = -1;
        this.f9v = -1;
        C0015c c0015c = this.f7t;
        int m9561E = c0015c.m9561E(m9549c);
        int m9561E2 = c0015c.m9561E(i);
        if (m9561E2 == 0 || m9561E == 0 || (m9559G = c0015c.m9559G(m9561E, m9561E2)) < 0) {
            return false;
        }
        boolean m9557I = c0015c.m9557I(m9561E, m9561E2);
        m9545g(m9559G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c0014b = new C0017e((AnimationDrawable) current, c0015c.m9558H(m9561E, m9561E2), m9557I);
        } else if (!(current instanceof C0405b)) {
            if (current instanceof Animatable) {
                c0014b = new C0014b((Animatable) current);
            }
            return false;
        } else {
            c0014b = new C0016d((C0405b) current);
        }
        c0014b.mo9552c();
        this.f8u = c0014b;
        this.f10w = m9549c;
        this.f9v = i;
        return true;
    }

    /* renamed from: t */
    private void m9565t(TypedArray typedArray) {
        C0015c c0015c = this.f7t;
        if (Build.VERSION.SDK_INT >= 21) {
            c0015c.f47d |= typedArray.getChangingConfigurations();
        }
        c0015c.m9520x(typedArray.getBoolean(C0028b.AnimatedStateListDrawableCompat_android_variablePadding, c0015c.f52i));
        c0015c.m9524t(typedArray.getBoolean(C0028b.AnimatedStateListDrawableCompat_android_constantSize, c0015c.f55l));
        c0015c.m9523u(typedArray.getInt(C0028b.AnimatedStateListDrawableCompat_android_enterFadeDuration, c0015c.f35A));
        c0015c.m9522v(typedArray.getInt(C0028b.AnimatedStateListDrawableCompat_android_exitFadeDuration, c0015c.f36B));
        setDither(typedArray.getBoolean(C0028b.AnimatedStateListDrawableCompat_android_dither, c0015c.f67x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.p004l.p005a.C0025d, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: h */
    public void mo9515h(C0020b.AbstractC0023c abstractC0023c) {
        super.mo9515h(abstractC0023c);
        if (abstractC0023c instanceof C0015c) {
            this.f7t = (C0015c) abstractC0023c;
        }
    }

    @Override // p000a.p001a.p004l.p005a.C0025d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0019g abstractC0019g = this.f8u;
        if (abstractC0019g != null) {
            abstractC0019g.mo9551d();
            this.f8u = null;
            m9545g(this.f9v);
            this.f9v = -1;
            this.f10w = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.p004l.p005a.C0025d
    /* renamed from: l */
    public C0015c mo9514j() {
        return new C0015c(this.f7t, this, null);
    }

    @Override // p000a.p001a.p004l.p005a.C0025d, p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f11x) {
            super.mutate();
            if (this == this) {
                this.f7t.mo9510r();
                this.f11x = true;
            }
        }
        return this;
    }

    /* renamed from: n */
    public void m9571n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0028b.AnimatedStateListDrawableCompat);
        setVisible(m6779k.getBoolean(C0028b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m9565t(m6779k);
        m9544i(resources);
        m6779k.recycle();
        m9570o(context, resources, xmlPullParser, attributeSet, theme);
        m9569p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p004l.p005a.C0025d, p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m9560F = this.f7t.m9560F(iArr);
        boolean z = m9560F != m9549c() && (m9566s(m9560F) || m9545g(m9560F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f8u != null && (visible || z2)) {
            if (z) {
                this.f8u.mo9552c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
