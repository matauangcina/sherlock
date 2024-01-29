package p054b.p059c.p060a.p061a.p063b.p065l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C1695c;
import java.util.Collections;
import java.util.List;
/* renamed from: b.c.a.a.b.l.a */
/* loaded from: classes.dex */
public class C1156a {

    /* renamed from: a */
    private static final Object f3876a = new Object();

    /* renamed from: b */
    private static volatile C1156a f3877b;

    private C1156a() {
        List list = Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public static C1156a m4760a() {
        if (f3877b == null) {
            synchronized (f3876a) {
                if (f3877b == null) {
                    f3877b = new C1156a();
                }
            }
        }
        return f3877b;
    }

    /* renamed from: b */
    public void m4759b(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: c */
    public final boolean m4758c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : C1695c.m3564a(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
