package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1071a;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1071a abstractC1071a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2531a = (IconCompat) abstractC1071a.m5026v(remoteActionCompat.f2531a, 1);
        remoteActionCompat.f2532b = abstractC1071a.m5032l(remoteActionCompat.f2532b, 2);
        remoteActionCompat.f2533c = abstractC1071a.m5032l(remoteActionCompat.f2533c, 3);
        remoteActionCompat.f2534d = (PendingIntent) abstractC1071a.m5029r(remoteActionCompat.f2534d, 4);
        remoteActionCompat.f2535e = abstractC1071a.m5034h(remoteActionCompat.f2535e, 5);
        remoteActionCompat.f2536f = abstractC1071a.m5034h(remoteActionCompat.f2536f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1071a abstractC1071a) {
        abstractC1071a.m5025x(false, false);
        abstractC1071a.m5040M(remoteActionCompat.f2531a, 1);
        abstractC1071a.m5046D(remoteActionCompat.f2532b, 2);
        abstractC1071a.m5046D(remoteActionCompat.f2533c, 3);
        abstractC1071a.m5044H(remoteActionCompat.f2534d, 4);
        abstractC1071a.m5024z(remoteActionCompat.f2535e, 5);
        abstractC1071a.m5024z(remoteActionCompat.f2536f, 6);
    }
}
