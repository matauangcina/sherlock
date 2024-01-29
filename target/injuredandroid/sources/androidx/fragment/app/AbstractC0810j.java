package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import p000a.p019g.p027j.C0194i;
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public abstract class AbstractC0810j<E> extends AbstractC0806f {

    /* renamed from: f */
    private final Activity f2913f;

    /* renamed from: g */
    private final Context f2914g;

    /* renamed from: h */
    private final Handler f2915h;

    /* renamed from: i */
    final AbstractC0814m f2916i;

    AbstractC0810j(Activity activity, Context context, Handler handler, int i) {
        this.f2916i = new C0825n();
        this.f2913f = activity;
        C0194i.m8865d(context, "context == null");
        this.f2914g = context;
        C0194i.m8865d(handler, "handler == null");
        this.f2915h = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0810j(ActivityC0797d activityC0797d) {
        this(activityC0797d, activityC0797d, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0806f
    /* renamed from: c */
    public View mo6448c(int i) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0806f
    /* renamed from: d */
    public boolean mo6447d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m6446e() {
        return this.f2913f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Context m6445g() {
        return this.f2914g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler m6444h() {
        return this.f2915h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6443k(Fragment fragment) {
    }

    /* renamed from: l */
    public abstract E mo6442l();

    /* renamed from: m */
    public LayoutInflater mo6441m() {
        return LayoutInflater.from(this.f2914g);
    }

    /* renamed from: n */
    public boolean mo6440n(Fragment fragment) {
        return true;
    }

    /* renamed from: o */
    public void mo6439o() {
    }
}
