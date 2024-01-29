package p000a.p019g.p024g;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
@Deprecated
/* renamed from: a.g.g.c */
/* loaded from: classes.dex */
public final class C0146c {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 18 || i >= 29) {
            return;
        }
        try {
            Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Trace.class.getMethod("isTagEnabled", Long.TYPE);
            Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
        } catch (Exception e) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e);
        }
    }

    /* renamed from: a */
    public static void m8965a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m8964b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
