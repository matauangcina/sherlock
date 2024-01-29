package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import androidx.core.content.C0734a;
/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public class C0704a extends C0734a {

    /* renamed from: c */
    private static InterfaceC0706b f2537c;

    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes.dex */
    class RunnableC0705a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Activity f2538f;

        RunnableC0705a(Activity activity) {
            this.f2538f = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2538f.isFinishing() || C0708c.m6982i(this.f2538f)) {
                return;
            }
            this.f2538f.recreate();
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0706b {
        /* renamed from: a */
        boolean m6992a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: j */
    public static void m6995j(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: k */
    public static InterfaceC0706b m6994k() {
        return f2537c;
    }

    /* renamed from: l */
    public static void m6993l(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i <= 23) {
                new Handler(activity.getMainLooper()).post(new RunnableC0705a(activity));
                return;
            } else if (C0708c.m6982i(activity)) {
                return;
            }
        }
        activity.recreate();
    }
}
