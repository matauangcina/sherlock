package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0717h;
import androidx.core.content.C0740b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p014d.C0068b;
/* renamed from: androidx.core.app.i */
/* loaded from: classes.dex */
class C0725i implements InterfaceC0716g {

    /* renamed from: a */
    private final Notification.Builder f2623a;

    /* renamed from: b */
    private final C0717h.C0723d f2624b;

    /* renamed from: c */
    private RemoteViews f2625c;

    /* renamed from: d */
    private RemoteViews f2626d;

    /* renamed from: e */
    private final List<Bundle> f2627e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2628f = new Bundle();

    /* renamed from: g */
    private int f2629g;

    /* renamed from: h */
    private RemoteViews f2630h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0725i(C0717h.C0723d c0723d) {
        Icon icon;
        List<String> m6922e;
        Bundle bundle;
        String str;
        this.f2624b = c0723d;
        Context context = c0723d.f2593a;
        this.f2623a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(c0723d.f2593a, c0723d.f2581K) : new Notification.Builder(c0723d.f2593a);
        Notification notification = c0723d.f2589S;
        this.f2623a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c0723d.f2601i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0723d.f2597e).setContentText(c0723d.f2598f).setContentInfo(c0723d.f2603k).setContentIntent(c0723d.f2599g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0723d.f2600h, (notification.flags & 128) != 0).setLargeIcon(c0723d.f2602j).setNumber(c0723d.f2604l).setProgress(c0723d.f2612t, c0723d.f2613u, c0723d.f2614v);
        if (Build.VERSION.SDK_INT < 21) {
            this.f2623a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2623a.setSubText(c0723d.f2609q).setUsesChronometer(c0723d.f2607o).setPriority(c0723d.f2605m);
            Iterator<C0717h.C0718a> it = c0723d.f2594b.iterator();
            while (it.hasNext()) {
                m6925b(it.next());
            }
            Bundle bundle2 = c0723d.f2574D;
            if (bundle2 != null) {
                this.f2628f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (c0723d.f2618z) {
                    this.f2628f.putBoolean("android.support.localOnly", true);
                }
                String str2 = c0723d.f2615w;
                if (str2 != null) {
                    this.f2628f.putString("android.support.groupKey", str2);
                    if (c0723d.f2616x) {
                        bundle = this.f2628f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f2628f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = c0723d.f2617y;
                if (str3 != null) {
                    this.f2628f.putString("android.support.sortKey", str3);
                }
            }
            this.f2625c = c0723d.f2578H;
            this.f2626d = c0723d.f2579I;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f2623a.setShowWhen(c0723d.f2606n);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 21 && (m6922e = m6922e(m6921f(c0723d.f2595c), c0723d.f2592V)) != null && !m6922e.isEmpty()) {
            this.f2628f.putStringArray("android.people", (String[]) m6922e.toArray(new String[m6922e.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f2623a.setLocalOnly(c0723d.f2618z).setGroup(c0723d.f2615w).setGroupSummary(c0723d.f2616x).setSortKey(c0723d.f2617y);
            this.f2629g = c0723d.f2586P;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2623a.setCategory(c0723d.f2573C).setColor(c0723d.f2575E).setVisibility(c0723d.f2576F).setPublicVersion(c0723d.f2577G).setSound(notification.sound, notification.audioAttributes);
            List<String> m6922e2 = Build.VERSION.SDK_INT < 28 ? m6922e(m6921f(c0723d.f2595c), c0723d.f2592V) : c0723d.f2592V;
            if (m6922e2 != null && !m6922e2.isEmpty()) {
                for (String str4 : m6922e2) {
                    this.f2623a.addPerson(str4);
                }
            }
            this.f2630h = c0723d.f2580J;
            if (c0723d.f2596d.size() > 0) {
                Bundle bundle3 = c0723d.m6947c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i2 = 0; i2 < c0723d.f2596d.size(); i2++) {
                    bundle5.putBundle(Integer.toString(i2), C0726j.m6918b(c0723d.f2596d.get(i2)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                c0723d.m6947c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f2628f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (icon = c0723d.f2591U) != null) {
            this.f2623a.setSmallIcon(icon);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2623a.setExtras(c0723d.f2574D).setRemoteInputHistory(c0723d.f2611s);
            RemoteViews remoteViews = c0723d.f2578H;
            if (remoteViews != null) {
                this.f2623a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = c0723d.f2579I;
            if (remoteViews2 != null) {
                this.f2623a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = c0723d.f2580J;
            if (remoteViews3 != null) {
                this.f2623a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2623a.setBadgeIconType(c0723d.f2582L).setSettingsText(c0723d.f2610r).setShortcutId(c0723d.f2583M).setTimeoutAfter(c0723d.f2585O).setGroupAlertBehavior(c0723d.f2586P);
            if (c0723d.f2572B) {
                this.f2623a.setColorized(c0723d.f2571A);
            }
            if (!TextUtils.isEmpty(c0723d.f2581K)) {
                this.f2623a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<C0727k> it2 = c0723d.f2595c.iterator();
            while (it2.hasNext()) {
                this.f2623a.addPerson(it2.next().m6906h());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2623a.setAllowSystemGeneratedContextualActions(c0723d.f2587Q);
            this.f2623a.setBubbleMetadata(C0717h.C0720c.m6952i(c0723d.f2588R));
            C0740b c0740b = c0723d.f2584N;
            if (c0740b != null) {
                this.f2623a.setLocusId(c0740b.m6853a());
            }
        }
        if (c0723d.f2590T) {
            if (this.f2624b.f2616x) {
                this.f2629g = 2;
            } else {
                this.f2629g = 1;
            }
            this.f2623a.setVibrate(null);
            this.f2623a.setSound(null);
            int i3 = notification.defaults & (-2);
            notification.defaults = i3;
            int i4 = i3 & (-3);
            notification.defaults = i4;
            this.f2623a.setDefaults(i4);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f2624b.f2615w)) {
                    this.f2623a.setGroup("silent");
                }
                this.f2623a.setGroupAlertBehavior(this.f2629g);
            }
        }
    }

    /* renamed from: b */
    private void m6925b(C0717h.C0718a c0718a) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.f2627e.add(C0726j.m6914f(this.f2623a, c0718a));
                return;
            }
            return;
        }
        IconCompat m6967e = c0718a.m6967e();
        Notification.Action.Builder builder = Build.VERSION.SDK_INT >= 23 ? new Notification.Action.Builder(m6967e != null ? m6967e.m6764n() : null, c0718a.m6963i(), c0718a.m6971a()) : new Notification.Action.Builder(m6967e != null ? m6967e.m6775c() : 0, c0718a.m6963i(), c0718a.m6971a());
        if (c0718a.m6966f() != null) {
            for (RemoteInput remoteInput : C0728l.m6904b(c0718a.m6966f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = c0718a.m6968d() != null ? new Bundle(c0718a.m6968d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", c0718a.m6970b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(c0718a.m6970b());
        }
        bundle.putInt("android.support.action.semanticAction", c0718a.m6965g());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(c0718a.m6965g());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(c0718a.m6962j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c0718a.m6964h());
        builder.addExtras(bundle);
        this.f2623a.addAction(builder.build());
    }

    /* renamed from: e */
    private static List<String> m6922e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0068b c0068b = new C0068b(list.size() + list2.size());
        c0068b.addAll(list);
        c0068b.addAll(list2);
        return new ArrayList(c0068b);
    }

    /* renamed from: f */
    private static List<String> m6921f(List<C0727k> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0727k c0727k : list) {
            arrayList.add(c0727k.m6907g());
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m6920g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // androidx.core.app.InterfaceC0716g
    /* renamed from: a */
    public Notification.Builder mo6926a() {
        return this.f2623a;
    }

    /* renamed from: c */
    public Notification m6924c() {
        Bundle m6972a;
        RemoteViews m6928f;
        RemoteViews m6930d;
        C0717h.AbstractC0724e abstractC0724e = this.f2624b.f2608p;
        if (abstractC0724e != null) {
            abstractC0724e.mo6932b(this);
        }
        RemoteViews m6929e = abstractC0724e != null ? abstractC0724e.m6929e(this) : null;
        Notification m6923d = m6923d();
        if (m6929e != null || (m6929e = this.f2624b.f2578H) != null) {
            m6923d.contentView = m6929e;
        }
        if (Build.VERSION.SDK_INT >= 16 && abstractC0724e != null && (m6930d = abstractC0724e.m6930d(this)) != null) {
            m6923d.bigContentView = m6930d;
        }
        if (Build.VERSION.SDK_INT >= 21 && abstractC0724e != null && (m6928f = this.f2624b.f2608p.m6928f(this)) != null) {
            m6923d.headsUpContentView = m6928f;
        }
        if (Build.VERSION.SDK_INT >= 16 && abstractC0724e != null && (m6972a = C0717h.m6972a(m6923d)) != null) {
            abstractC0724e.mo6933a(m6972a);
        }
        return m6923d;
    }

    /* renamed from: d */
    protected Notification m6923d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2623a.build();
        }
        if (i >= 24) {
            Notification build = this.f2623a.build();
            if (this.f2629g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f2629g == 2) {
                    m6920g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2629g == 1) {
                    m6920g(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2623a.setExtras(this.f2628f);
            Notification build2 = this.f2623a.build();
            RemoteViews remoteViews = this.f2625c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2626d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2630h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2629g != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f2629g == 2) {
                    m6920g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2629g == 1) {
                    m6920g(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2623a.setExtras(this.f2628f);
            Notification build3 = this.f2623a.build();
            RemoteViews remoteViews4 = this.f2625c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2626d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2629g != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f2629g == 2) {
                    m6920g(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2629g == 1) {
                    m6920g(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> m6919a = C0726j.m6919a(this.f2627e);
            if (m6919a != null) {
                this.f2628f.putSparseParcelableArray("android.support.actionExtras", m6919a);
            }
            this.f2623a.setExtras(this.f2628f);
            Notification build4 = this.f2623a.build();
            RemoteViews remoteViews6 = this.f2625c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2626d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i >= 16) {
            Notification build5 = this.f2623a.build();
            Bundle m6972a = C0717h.m6972a(build5);
            Bundle bundle = new Bundle(this.f2628f);
            for (String str : this.f2628f.keySet()) {
                if (m6972a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            m6972a.putAll(bundle);
            SparseArray<Bundle> m6919a2 = C0726j.m6919a(this.f2627e);
            if (m6919a2 != null) {
                C0717h.m6972a(build5).putSparseParcelableArray("android.support.actionExtras", m6919a2);
            }
            RemoteViews remoteViews8 = this.f2625c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2626d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f2623a.getNotification();
        }
    }
}
