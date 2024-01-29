package p054b.p059c.p060a.p075b.p091x;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* renamed from: b.c.a.b.x.b */
/* loaded from: classes.dex */
public class C1387b {
    /* renamed from: a */
    public static TypedValue m4266a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m4265b(Context context, int i, boolean z) {
        TypedValue m4266a = m4266a(context, i);
        return (m4266a == null || m4266a.type != 18) ? z : m4266a.data != 0;
    }

    /* renamed from: c */
    public static int m4264c(Context context, int i, String str) {
        TypedValue m4266a = m4266a(context, i);
        if (m4266a != null) {
            return m4266a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static int m4263d(View view, int i) {
        return m4264c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
