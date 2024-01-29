package p054b.p059c.p060a.p061a.p063b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C0717h;
import androidx.fragment.app.ActivityC0797d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC1654f;
import com.google.android.gms.common.internal.C1652e;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.util.C1699g;
import com.google.android.gms.common.util.C1701i;
import p054b.p059c.p060a.p061a.p062a.C1142a;
import p054b.p059c.p060a.p061a.p062a.C1143b;
import p054b.p059c.p060a.p061a.p068d.p069a.HandlerC1174d;
/* renamed from: b.c.a.a.b.d */
/* loaded from: classes.dex */
public class C1147d extends C1149e {

    /* renamed from: d */
    private static final Object f3860d = new Object();

    /* renamed from: e */
    private static final C1147d f3861e = new C1147d();

    /* renamed from: c */
    private String f3862c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.c.a.a.b.d$a */
    /* loaded from: classes.dex */
    public class HandlerC1148a extends HandlerC1174d {

        /* renamed from: a */
        private final Context f3863a;

        public HandlerC1148a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f3863a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int mo4786f = C1147d.this.mo4786f(this.f3863a);
            if (C1147d.this.mo4784h(mo4786f)) {
                C1147d.this.m4798n(this.f3863a, mo4786f);
            }
        }
    }

    /* renamed from: l */
    public static C1147d m4800l() {
        return f3861e;
    }

    /* renamed from: o */
    static Dialog m4797o(Context context, int i, AbstractDialogInterface$OnClickListenerC1654f abstractDialogInterface$OnClickListenerC1654f, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C1652e.m3706d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m3707c = C1652e.m3707c(context, i);
        if (m3707c != null) {
            builder.setPositiveButton(m3707c, abstractDialogInterface$OnClickListenerC1654f);
        }
        String m3703g = C1652e.m3703g(context, i);
        if (m3703g != null) {
            builder.setTitle(m3703g);
        }
        return builder.create();
    }

    /* renamed from: p */
    static void m4796p(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0797d) {
            C1154j.m4769B1(dialog, onCancelListener).mo4770A1(((ActivityC0797d) activity).m6491n(), str);
            return;
        }
        DialogFragmentC1145b.m4805a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: r */
    private final void m4794r(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            m4795q(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String m3704f = C1652e.m3704f(context, i);
            String m3705e = C1652e.m3705e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0717h.C0723d c0723d = new C0717h.C0723d(context);
            c0723d.m6939k(true);
            c0723d.m6945e(true);
            c0723d.m6941i(m3704f);
            C0717h.C0719b c0719b = new C0717h.C0719b();
            c0719b.m6961h(m3705e);
            c0723d.m6936n(c0719b);
            if (C1699g.m3558b(context)) {
                C1679r.m3629j(C1701i.m3550e());
                c0723d.m6937m(context.getApplicationInfo().icon);
                c0723d.m6938l(2);
                if (C1699g.m3557c(context)) {
                    c0723d.m6949a(C1142a.common_full_open_on_phone, resources.getString(C1143b.common_open_on_phone), pendingIntent);
                } else {
                    c0723d.m6943g(pendingIntent);
                }
            } else {
                c0723d.m6937m(17301642);
                c0723d.m6935o(resources.getString(C1143b.common_google_play_services_notification_ticker));
                c0723d.m6934p(System.currentTimeMillis());
                c0723d.m6943g(pendingIntent);
                c0723d.m6942h(m3705e);
            }
            if (C1701i.m3547h()) {
                C1679r.m3629j(C1701i.m3547h());
                String m4792t = m4792t();
                if (m4792t == null) {
                    m4792t = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String m3708b = C1652e.m3708b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", m3708b, 4);
                    } else if (!m3708b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(m3708b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                c0723d.m6944f(m4792t);
            }
            Notification m6948b = c0723d.m6948b();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C1151g.f3868b.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, m6948b);
        }
    }

    /* renamed from: t */
    private final String m4792t() {
        String str;
        synchronized (f3860d) {
            str = this.f3862c;
        }
        return str;
    }

    @Override // p054b.p059c.p060a.p061a.p063b.C1149e
    /* renamed from: a */
    public Intent mo4791a(Context context, int i, String str) {
        return super.mo4791a(context, i, str);
    }

    @Override // p054b.p059c.p060a.p061a.p063b.C1149e
    /* renamed from: b */
    public PendingIntent mo4790b(Context context, int i, int i2) {
        return super.mo4790b(context, i, i2);
    }

    @Override // p054b.p059c.p060a.p061a.p063b.C1149e
    /* renamed from: d */
    public final String mo4788d(int i) {
        return super.mo4788d(i);
    }

    @Override // p054b.p059c.p060a.p061a.p063b.C1149e
    /* renamed from: f */
    public int mo4786f(Context context) {
        return super.mo4786f(context);
    }

    @Override // p054b.p059c.p060a.p061a.p063b.C1149e
    /* renamed from: g */
    public int mo4785g(Context context, int i) {
        return super.mo4785g(context, i);
    }

    @Override // p054b.p059c.p060a.p061a.p063b.C1149e
    /* renamed from: h */
    public final boolean mo4784h(int i) {
        return super.mo4784h(i);
    }

    /* renamed from: j */
    public Dialog m4802j(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m4797o(activity, i, AbstractDialogInterface$OnClickListenerC1654f.m3700a(activity, mo4791a(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: k */
    public PendingIntent m4801k(Context context, C1144a c1144a) {
        return c1144a.m4808j() ? c1144a.m4809h() : mo4790b(context, c1144a.m4811b(), 0);
    }

    /* renamed from: m */
    public boolean m4799m(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m4802j = m4802j(activity, i, i2, onCancelListener);
        if (m4802j == null) {
            return false;
        }
        m4796p(activity, m4802j, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: n */
    public void m4798n(Context context, int i) {
        m4794r(context, i, null, m4789c(context, i, 0, "n"));
    }

    /* renamed from: q */
    final void m4795q(Context context) {
        new HandlerC1148a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: s */
    public final boolean m4793s(Context context, C1144a c1144a, int i) {
        PendingIntent m4801k = m4801k(context, c1144a);
        if (m4801k != null) {
            m4794r(context, c1144a.m4811b(), null, GoogleApiActivity.m3972a(context, m4801k, i));
            return true;
        }
        return false;
    }
}
