package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0741c;
import java.util.Calendar;
/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
class C0486k {

    /* renamed from: d */
    private static C0486k f1421d;

    /* renamed from: a */
    private final Context f1422a;

    /* renamed from: b */
    private final LocationManager f1423b;

    /* renamed from: c */
    private final C0487a f1424c = new C0487a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    public static class C0487a {

        /* renamed from: a */
        boolean f1425a;

        /* renamed from: b */
        long f1426b;

        /* renamed from: c */
        long f1427c;

        /* renamed from: d */
        long f1428d;

        /* renamed from: e */
        long f1429e;

        /* renamed from: f */
        long f1430f;

        C0487a() {
        }
    }

    C0486k(Context context, LocationManager locationManager) {
        this.f1422a = context;
        this.f1423b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0486k m7943a(Context context) {
        if (f1421d == null) {
            Context applicationContext = context.getApplicationContext();
            f1421d = new C0486k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1421d;
    }

    /* renamed from: b */
    private Location m7942b() {
        Location m7941c = C0741c.m6851b(this.f1422a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m7941c("network") : null;
        Location m7941c2 = C0741c.m6851b(this.f1422a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m7941c("gps") : null;
        return (m7941c2 == null || m7941c == null) ? m7941c2 != null ? m7941c2 : m7941c : m7941c2.getTime() > m7941c.getTime() ? m7941c2 : m7941c;
    }

    /* renamed from: c */
    private Location m7941c(String str) {
        try {
            if (this.f1423b.isProviderEnabled(str)) {
                return this.f1423b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m7939e() {
        return this.f1424c.f1430f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m7938f(Location location) {
        long j;
        C0487a c0487a = this.f1424c;
        long currentTimeMillis = System.currentTimeMillis();
        C0485j m7944b = C0485j.m7944b();
        m7944b.m7945a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = m7944b.f1418a;
        m7944b.m7945a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m7944b.f1420c == 1;
        long j3 = m7944b.f1419b;
        long j4 = m7944b.f1418a;
        boolean z2 = z;
        m7944b.m7945a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = m7944b.f1419b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        c0487a.f1425a = z2;
        c0487a.f1426b = j2;
        c0487a.f1427c = j3;
        c0487a.f1428d = j4;
        c0487a.f1429e = j5;
        c0487a.f1430f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m7940d() {
        C0487a c0487a = this.f1424c;
        if (m7939e()) {
            return c0487a.f1425a;
        }
        Location m7942b = m7942b();
        if (m7942b != null) {
            m7938f(m7942b);
            return c0487a.f1425a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
