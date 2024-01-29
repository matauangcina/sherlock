package p000a.p048q.p049a.p050a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p052d.C0758g;
import androidx.core.graphics.drawable.C0759a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p000a.p014d.C0066a;
/* renamed from: a.q.a.a.b */
/* loaded from: classes.dex */
public class C0405b extends AbstractC0414g implements Animatable {

    /* renamed from: g */
    private C0407b f1063g;

    /* renamed from: h */
    private Context f1064h;

    /* renamed from: i */
    private ArgbEvaluator f1065i;

    /* renamed from: j */
    final Drawable.Callback f1066j;

    /* renamed from: a.q.a.a.b$a */
    /* loaded from: classes.dex */
    class C0406a implements Drawable.Callback {
        C0406a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0405b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0405b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0405b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.b$b */
    /* loaded from: classes.dex */
    public static class C0407b extends Drawable.ConstantState {

        /* renamed from: a */
        int f1068a;

        /* renamed from: b */
        C0415h f1069b;

        /* renamed from: c */
        AnimatorSet f1070c;

        /* renamed from: d */
        ArrayList<Animator> f1071d;

        /* renamed from: e */
        C0066a<Animator, String> f1072e;

        public C0407b(Context context, C0407b c0407b, Drawable.Callback callback, Resources resources) {
            if (c0407b != null) {
                this.f1068a = c0407b.f1068a;
                C0415h c0415h = c0407b.f1069b;
                if (c0415h != null) {
                    Drawable.ConstantState constantState = c0415h.getConstantState();
                    this.f1069b = (C0415h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0415h c0415h2 = this.f1069b;
                    c0415h2.mutate();
                    C0415h c0415h3 = c0415h2;
                    this.f1069b = c0415h3;
                    c0415h3.setCallback(callback);
                    this.f1069b.setBounds(c0407b.f1069b.getBounds());
                    this.f1069b.m8171h(false);
                }
                ArrayList<Animator> arrayList = c0407b.f1071d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1071d = new ArrayList<>(size);
                    this.f1072e = new C0066a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c0407b.f1071d.get(i);
                        Animator clone = animator.clone();
                        String str = c0407b.f1072e.get(animator);
                        clone.setTarget(this.f1069b.m8175d(str));
                        this.f1071d.add(clone);
                        this.f1072e.put(clone, str);
                    }
                    m8206a();
                }
            }
        }

        /* renamed from: a */
        public void m8206a() {
            if (this.f1070c == null) {
                this.f1070c = new AnimatorSet();
            }
            this.f1070c.playTogether(this.f1071d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1068a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.q.a.a.b$c */
    /* loaded from: classes.dex */
    private static class C0408c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f1073a;

        public C0408c(Drawable.ConstantState constantState) {
            this.f1073a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1073a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1073a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0405b c0405b = new C0405b();
            Drawable newDrawable = this.f1073a.newDrawable();
            c0405b.f1078f = newDrawable;
            newDrawable.setCallback(c0405b.f1066j);
            return c0405b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0405b c0405b = new C0405b();
            Drawable newDrawable = this.f1073a.newDrawable(resources);
            c0405b.f1078f = newDrawable;
            newDrawable.setCallback(c0405b.f1066j);
            return c0405b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0405b c0405b = new C0405b();
            Drawable newDrawable = this.f1073a.newDrawable(resources, theme);
            c0405b.f1078f = newDrawable;
            newDrawable.setCallback(c0405b.f1066j);
            return c0405b;
        }
    }

    C0405b() {
        this(null, null, null);
    }

    private C0405b(Context context) {
        this(context, null, null);
    }

    private C0405b(Context context, C0407b c0407b, Resources resources) {
        this.f1065i = null;
        this.f1066j = new C0406a();
        this.f1064h = context;
        if (c0407b != null) {
            this.f1063g = c0407b;
        } else {
            this.f1063g = new C0407b(context, c0407b, this.f1066j, resources);
        }
    }

    /* renamed from: a */
    public static C0405b m8209a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0405b c0405b = new C0405b(context);
        c0405b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0405b;
    }

    /* renamed from: b */
    private void m8208b(String str, Animator animator) {
        animator.setTarget(this.f1063g.f1069b.m8175d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m8207c(animator);
        }
        C0407b c0407b = this.f1063g;
        if (c0407b.f1071d == null) {
            c0407b.f1071d = new ArrayList<>();
            this.f1063g.f1072e = new C0066a<>();
        }
        this.f1063g.f1071d.add(animator);
        this.f1063g.f1072e.put(animator, str);
    }

    /* renamed from: c */
    private void m8207c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m8207c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1065i == null) {
                    this.f1065i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1065i);
            }
        }
    }

    @Override // p000a.p048q.p049a.p050a.AbstractC0414g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6761a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            return C0759a.m6760b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1063g.f1069b.draw(canvas);
        if (this.f1063g.f1070c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1078f;
        return drawable != null ? C0759a.m6758d(drawable) : this.f1063g.f1069b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1063g.f1068a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1078f;
        return drawable != null ? C0759a.m6757e(drawable) : this.f1063g.f1069b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1078f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0408c(this.f1078f.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1063g.f1069b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1063g.f1069b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getOpacity() : this.f1063g.f1069b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6755g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1055e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0415h m8177b = C0415h.m8177b(resources, resourceId, theme);
                        m8177b.m8171h(false);
                        m8177b.setCallback(this.f1066j);
                        C0415h c0415h = this.f1063g.f1069b;
                        if (c0415h != null) {
                            c0415h.setCallback(null);
                        }
                        this.f1063g.f1069b = m8177b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0404a.f1056f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1064h;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m8208b(string, C0410d.m8195i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f1063g.m8206a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1078f;
        return drawable != null ? C0759a.m6754h(drawable) : this.f1063g.f1069b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1078f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1063g.f1070c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.isStateful() : this.f1063g.f1069b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1063g.f1069b.setBounds(rect);
        }
    }

    @Override // p000a.p048q.p049a.p050a.AbstractC0414g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.setLevel(i) : this.f1063g.f1069b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.setState(iArr) : this.f1063g.f1069b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1063g.f1069b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6752j(drawable, z);
        } else {
            this.f1063g.f1069b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1063g.f1069b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTint(int i) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6748n(drawable, i);
        } else {
            this.f1063g.f1069b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6747o(drawable, colorStateList);
        } else {
            this.f1063g.f1069b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6746p(drawable, mode);
        } else {
            this.f1063g.f1069b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1063g.f1069b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f1063g.f1070c.isStarted()) {
        } else {
            this.f1063g.f1070c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1063g.f1070c.end();
        }
    }
}
