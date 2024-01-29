package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.C0740b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public class C0717h {

    /* renamed from: androidx.core.app.h$a */
    /* loaded from: classes.dex */
    public static class C0718a {

        /* renamed from: a */
        final Bundle f2559a;

        /* renamed from: b */
        private IconCompat f2560b;

        /* renamed from: c */
        private final C0728l[] f2561c;

        /* renamed from: d */
        private final C0728l[] f2562d;

        /* renamed from: e */
        private boolean f2563e;

        /* renamed from: f */
        boolean f2564f;

        /* renamed from: g */
        private final int f2565g;

        /* renamed from: h */
        private final boolean f2566h;
        @Deprecated

        /* renamed from: i */
        public int f2567i;

        /* renamed from: j */
        public CharSequence f2568j;

        /* renamed from: k */
        public PendingIntent f2569k;

        public C0718a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m6776b(null, "", i) : null, charSequence, pendingIntent);
        }

        public C0718a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        C0718a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0728l[] c0728lArr, C0728l[] c0728lArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f2564f = true;
            this.f2560b = iconCompat;
            if (iconCompat != null && iconCompat.m6771g() == 2) {
                this.f2567i = iconCompat.m6775c();
            }
            this.f2568j = C0723d.m6946d(charSequence);
            this.f2569k = pendingIntent;
            this.f2559a = bundle == null ? new Bundle() : bundle;
            this.f2561c = c0728lArr;
            this.f2562d = c0728lArr2;
            this.f2563e = z;
            this.f2565g = i;
            this.f2564f = z2;
            this.f2566h = z3;
        }

        /* renamed from: a */
        public PendingIntent m6971a() {
            return this.f2569k;
        }

        /* renamed from: b */
        public boolean m6970b() {
            return this.f2563e;
        }

        /* renamed from: c */
        public C0728l[] m6969c() {
            return this.f2562d;
        }

        /* renamed from: d */
        public Bundle m6968d() {
            return this.f2559a;
        }

        /* renamed from: e */
        public IconCompat m6967e() {
            int i;
            if (this.f2560b == null && (i = this.f2567i) != 0) {
                this.f2560b = IconCompat.m6776b(null, "", i);
            }
            return this.f2560b;
        }

        /* renamed from: f */
        public C0728l[] m6966f() {
            return this.f2561c;
        }

        /* renamed from: g */
        public int m6965g() {
            return this.f2565g;
        }

        /* renamed from: h */
        public boolean m6964h() {
            return this.f2564f;
        }

        /* renamed from: i */
        public CharSequence m6963i() {
            return this.f2568j;
        }

        /* renamed from: j */
        public boolean m6962j() {
            return this.f2566h;
        }
    }

    /* renamed from: androidx.core.app.h$b */
    /* loaded from: classes.dex */
    public static class C0719b extends AbstractC0724e {

        /* renamed from: e */
        private CharSequence f2570e;

        @Override // androidx.core.app.C0717h.AbstractC0724e
        /* renamed from: a */
        public void mo6933a(Bundle bundle) {
            super.mo6933a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2570e);
            }
        }

        @Override // androidx.core.app.C0717h.AbstractC0724e
        /* renamed from: b */
        public void mo6932b(InterfaceC0716g interfaceC0716g) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC0716g.mo6926a()).setBigContentTitle(this.f2620b).bigText(this.f2570e);
                if (this.f2622d) {
                    bigText.setSummaryText(this.f2621c);
                }
            }
        }

        @Override // androidx.core.app.C0717h.AbstractC0724e
        /* renamed from: c */
        protected String mo6931c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C0719b m6961h(CharSequence charSequence) {
            this.f2570e = C0723d.m6946d(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$c */
    /* loaded from: classes.dex */
    public static final class C0720c {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.h$c$a */
        /* loaded from: classes.dex */
        public static class C0721a {
            /* renamed from: a */
            static Notification.BubbleMetadata m6951a(C0720c c0720c) {
                if (c0720c == null || c0720c.m6955f() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(c0720c.m6956e().m6764n()).setIntent(c0720c.m6955f()).setDeleteIntent(c0720c.m6959b()).setAutoExpandBubble(c0720c.m6960a()).setSuppressNotification(c0720c.m6953h());
                if (c0720c.m6958c() != 0) {
                    suppressNotification.setDesiredHeight(c0720c.m6958c());
                }
                if (c0720c.m6957d() != 0) {
                    suppressNotification.setDesiredHeightResId(c0720c.m6957d());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.h$c$b */
        /* loaded from: classes.dex */
        public static class C0722b {
            /* renamed from: a */
            static Notification.BubbleMetadata m6950a(C0720c c0720c) {
                if (c0720c == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = c0720c.m6954g() != null ? new Notification.BubbleMetadata.Builder(c0720c.m6954g()) : new Notification.BubbleMetadata.Builder(c0720c.m6955f(), c0720c.m6956e().m6764n());
                builder.setDeleteIntent(c0720c.m6959b()).setAutoExpandBubble(c0720c.m6960a()).setSuppressNotification(c0720c.m6953h());
                if (c0720c.m6958c() != 0) {
                    builder.setDesiredHeight(c0720c.m6958c());
                }
                if (c0720c.m6957d() != 0) {
                    builder.setDesiredHeightResId(c0720c.m6957d());
                }
                return builder.build();
            }
        }

        /* renamed from: i */
        public static Notification.BubbleMetadata m6952i(C0720c c0720c) {
            if (c0720c == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0722b.m6950a(c0720c);
            }
            if (i == 29) {
                return C0721a.m6951a(c0720c);
            }
            return null;
        }

        /* renamed from: a */
        public abstract boolean m6960a();

        /* renamed from: b */
        public abstract PendingIntent m6959b();

        /* renamed from: c */
        public abstract int m6958c();

        /* renamed from: d */
        public abstract int m6957d();

        /* renamed from: e */
        public abstract IconCompat m6956e();

        /* renamed from: f */
        public abstract PendingIntent m6955f();

        /* renamed from: g */
        public abstract String m6954g();

        /* renamed from: h */
        public abstract boolean m6953h();
    }

    /* renamed from: androidx.core.app.h$d */
    /* loaded from: classes.dex */
    public static class C0723d {

        /* renamed from: A */
        boolean f2571A;

        /* renamed from: B */
        boolean f2572B;

        /* renamed from: C */
        String f2573C;

        /* renamed from: D */
        Bundle f2574D;

        /* renamed from: E */
        int f2575E;

        /* renamed from: F */
        int f2576F;

        /* renamed from: G */
        Notification f2577G;

        /* renamed from: H */
        RemoteViews f2578H;

        /* renamed from: I */
        RemoteViews f2579I;

        /* renamed from: J */
        RemoteViews f2580J;

        /* renamed from: K */
        String f2581K;

        /* renamed from: L */
        int f2582L;

        /* renamed from: M */
        String f2583M;

        /* renamed from: N */
        C0740b f2584N;

        /* renamed from: O */
        long f2585O;

        /* renamed from: P */
        int f2586P;

        /* renamed from: Q */
        boolean f2587Q;

        /* renamed from: R */
        C0720c f2588R;

        /* renamed from: S */
        Notification f2589S;

        /* renamed from: T */
        boolean f2590T;

        /* renamed from: U */
        Icon f2591U;
        @Deprecated

        /* renamed from: V */
        public ArrayList<String> f2592V;

        /* renamed from: a */
        public Context f2593a;

        /* renamed from: b */
        public ArrayList<C0718a> f2594b;

        /* renamed from: c */
        public ArrayList<C0727k> f2595c;

        /* renamed from: d */
        ArrayList<C0718a> f2596d;

        /* renamed from: e */
        CharSequence f2597e;

        /* renamed from: f */
        CharSequence f2598f;

        /* renamed from: g */
        PendingIntent f2599g;

        /* renamed from: h */
        PendingIntent f2600h;

        /* renamed from: i */
        RemoteViews f2601i;

        /* renamed from: j */
        Bitmap f2602j;

        /* renamed from: k */
        CharSequence f2603k;

        /* renamed from: l */
        int f2604l;

        /* renamed from: m */
        int f2605m;

        /* renamed from: n */
        boolean f2606n;

        /* renamed from: o */
        boolean f2607o;

        /* renamed from: p */
        AbstractC0724e f2608p;

        /* renamed from: q */
        CharSequence f2609q;

        /* renamed from: r */
        CharSequence f2610r;

        /* renamed from: s */
        CharSequence[] f2611s;

        /* renamed from: t */
        int f2612t;

        /* renamed from: u */
        int f2613u;

        /* renamed from: v */
        boolean f2614v;

        /* renamed from: w */
        String f2615w;

        /* renamed from: x */
        boolean f2616x;

        /* renamed from: y */
        String f2617y;

        /* renamed from: z */
        boolean f2618z;

        @Deprecated
        public C0723d(Context context) {
            this(context, null);
        }

        public C0723d(Context context, String str) {
            this.f2594b = new ArrayList<>();
            this.f2595c = new ArrayList<>();
            this.f2596d = new ArrayList<>();
            this.f2606n = true;
            this.f2618z = false;
            this.f2575E = 0;
            this.f2576F = 0;
            this.f2582L = 0;
            this.f2586P = 0;
            Notification notification = new Notification();
            this.f2589S = notification;
            this.f2593a = context;
            this.f2581K = str;
            notification.when = System.currentTimeMillis();
            this.f2589S.audioStreamType = -1;
            this.f2605m = 0;
            this.f2592V = new ArrayList<>();
            this.f2587Q = true;
        }

        /* renamed from: d */
        protected static CharSequence m6946d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: j */
        private void m6940j(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f2589S;
                i2 = i | notification.flags;
            } else {
                notification = this.f2589S;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: a */
        public C0723d m6949a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2594b.add(new C0718a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification m6948b() {
            return new C0725i(this).m6924c();
        }

        /* renamed from: c */
        public Bundle m6947c() {
            if (this.f2574D == null) {
                this.f2574D = new Bundle();
            }
            return this.f2574D;
        }

        /* renamed from: e */
        public C0723d m6945e(boolean z) {
            m6940j(16, z);
            return this;
        }

        /* renamed from: f */
        public C0723d m6944f(String str) {
            this.f2581K = str;
            return this;
        }

        /* renamed from: g */
        public C0723d m6943g(PendingIntent pendingIntent) {
            this.f2599g = pendingIntent;
            return this;
        }

        /* renamed from: h */
        public C0723d m6942h(CharSequence charSequence) {
            this.f2598f = m6946d(charSequence);
            return this;
        }

        /* renamed from: i */
        public C0723d m6941i(CharSequence charSequence) {
            this.f2597e = m6946d(charSequence);
            return this;
        }

        /* renamed from: k */
        public C0723d m6939k(boolean z) {
            this.f2618z = z;
            return this;
        }

        /* renamed from: l */
        public C0723d m6938l(int i) {
            this.f2605m = i;
            return this;
        }

        /* renamed from: m */
        public C0723d m6937m(int i) {
            this.f2589S.icon = i;
            return this;
        }

        /* renamed from: n */
        public C0723d m6936n(AbstractC0724e abstractC0724e) {
            if (this.f2608p != abstractC0724e) {
                this.f2608p = abstractC0724e;
                if (abstractC0724e != null) {
                    abstractC0724e.m6927g(this);
                }
            }
            return this;
        }

        /* renamed from: o */
        public C0723d m6935o(CharSequence charSequence) {
            this.f2589S.tickerText = m6946d(charSequence);
            return this;
        }

        /* renamed from: p */
        public C0723d m6934p(long j) {
            this.f2589S.when = j;
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0724e {

        /* renamed from: a */
        protected C0723d f2619a;

        /* renamed from: b */
        CharSequence f2620b;

        /* renamed from: c */
        CharSequence f2621c;

        /* renamed from: d */
        boolean f2622d = false;

        /* renamed from: a */
        public void mo6933a(Bundle bundle) {
            if (this.f2622d) {
                bundle.putCharSequence("android.summaryText", this.f2621c);
            }
            CharSequence charSequence = this.f2620b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo6931c = mo6931c();
            if (mo6931c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo6931c);
            }
        }

        /* renamed from: b */
        public abstract void mo6932b(InterfaceC0716g interfaceC0716g);

        /* renamed from: c */
        protected abstract String mo6931c();

        /* renamed from: d */
        public RemoteViews m6930d(InterfaceC0716g interfaceC0716g) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m6929e(InterfaceC0716g interfaceC0716g) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m6928f(InterfaceC0716g interfaceC0716g) {
            return null;
        }

        /* renamed from: g */
        public void m6927g(C0723d c0723d) {
            if (this.f2619a != c0723d) {
                this.f2619a = c0723d;
                if (c0723d != null) {
                    c0723d.m6936n(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m6972a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0726j.m6917c(notification);
        }
        return null;
    }
}
