package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.C2806j;
import io.flutter.embedding.engine.C2820a;
import io.flutter.embedding.engine.renderer.InterfaceC2924b;
import p108c.p109a.C1499b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FlutterSplashView extends FrameLayout {

    /* renamed from: o */
    private static String f6893o = "FlutterSplashView";

    /* renamed from: f */
    private InterfaceC2816n f6894f;

    /* renamed from: g */
    private C2806j f6895g;

    /* renamed from: h */
    private View f6896h;

    /* renamed from: i */
    private Bundle f6897i;

    /* renamed from: j */
    private String f6898j;

    /* renamed from: k */
    private String f6899k;

    /* renamed from: l */
    private final C2806j.InterfaceC2810d f6900l;

    /* renamed from: m */
    private final InterfaceC2924b f6901m;

    /* renamed from: n */
    private final Runnable f6902n;

    @Keep
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new C2782a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState$a */
        /* loaded from: classes.dex */
        static class C2782a implements Parcelable.Creator<SavedState> {
            C2782a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(SavedState.class.getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$a */
    /* loaded from: classes.dex */
    class C2783a implements C2806j.InterfaceC2810d {
        C2783a() {
        }

        @Override // io.flutter.embedding.android.C2806j.InterfaceC2810d
        /* renamed from: a */
        public void mo627a() {
        }

        @Override // io.flutter.embedding.android.C2806j.InterfaceC2810d
        /* renamed from: b */
        public void mo626b(C2820a c2820a) {
            FlutterSplashView.this.f6895g.m633s(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.m753g(flutterSplashView.f6895g, FlutterSplashView.this.f6894f);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$b */
    /* loaded from: classes.dex */
    class C2784b implements InterfaceC2924b {
        C2784b() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: d */
        public void mo366d() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: g */
        public void mo365g() {
            if (FlutterSplashView.this.f6894f != null) {
                FlutterSplashView.this.m749k();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$c */
    /* loaded from: classes.dex */
    class RunnableC2785c implements Runnable {
        RunnableC2785c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f6896h);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f6899k = flutterSplashView2.f6898j;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6900l = new C2783a();
        this.f6901m = new C2784b();
        this.f6902n = new RunnableC2785c();
        setSaveEnabled(true);
    }

    /* renamed from: h */
    private boolean m752h() {
        C2806j c2806j = this.f6895g;
        if (c2806j != null) {
            if (c2806j.m634r()) {
                return this.f6895g.getAttachedFlutterEngine().m605h().m556g() != null && this.f6895g.getAttachedFlutterEngine().m605h().m556g().equals(this.f6899k);
            }
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
    }

    /* renamed from: i */
    private boolean m751i() {
        C2806j c2806j = this.f6895g;
        return (c2806j == null || !c2806j.m634r() || this.f6895g.m636p() || m752h()) ? false : true;
    }

    /* renamed from: j */
    private boolean m750j() {
        InterfaceC2816n interfaceC2816n;
        C2806j c2806j = this.f6895g;
        return c2806j != null && c2806j.m634r() && (interfaceC2816n = this.f6894f) != null && interfaceC2816n.mo615b() && m748l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m749k() {
        this.f6898j = this.f6895g.getAttachedFlutterEngine().m605h().m556g();
        String str = f6893o;
        C1499b.m4050d(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f6898j);
        this.f6894f.mo616a(this.f6902n);
    }

    /* renamed from: l */
    private boolean m748l() {
        C2806j c2806j = this.f6895g;
        if (c2806j != null) {
            if (c2806j.m634r()) {
                return this.f6895g.m636p() && !m752h();
            }
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
    }

    /* renamed from: g */
    public void m753g(C2806j c2806j, InterfaceC2816n interfaceC2816n) {
        C2806j c2806j2 = this.f6895g;
        if (c2806j2 != null) {
            c2806j2.m632t(this.f6901m);
            removeView(this.f6895g);
        }
        View view = this.f6896h;
        if (view != null) {
            removeView(view);
        }
        this.f6895g = c2806j;
        addView(c2806j);
        this.f6894f = interfaceC2816n;
        if (interfaceC2816n != null) {
            if (m751i()) {
                C1499b.m4050d(f6893o, "Showing splash screen UI.");
                View mo614c = interfaceC2816n.mo614c(getContext(), this.f6897i);
                this.f6896h = mo614c;
                addView(mo614c);
                c2806j.m644h(this.f6901m);
            } else if (!m750j()) {
                if (c2806j.m634r()) {
                    return;
                }
                C1499b.m4050d(f6893o, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                c2806j.m645g(this.f6900l);
            } else {
                C1499b.m4050d(f6893o, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
                View mo614c2 = interfaceC2816n.mo614c(getContext(), this.f6897i);
                this.f6896h = mo614c2;
                addView(mo614c2);
                m749k();
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6899k = savedState.previousCompletedSplashIsolate;
        this.f6897i = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f6899k;
        InterfaceC2816n interfaceC2816n = this.f6894f;
        savedState.splashScreenState = interfaceC2816n != null ? interfaceC2816n.mo613d() : null;
        return savedState;
    }
}
