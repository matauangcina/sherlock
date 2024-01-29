package p000a.p001a.p002k.p003a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0623m0;
import androidx.core.content.C0734a;
import androidx.core.content.p052d.C0742a;
import java.util.WeakHashMap;
/* renamed from: a.a.k.a.a */
/* loaded from: classes.dex */
public final class C0010a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0011a>> f3b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f4c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.k.a.a$a */
    /* loaded from: classes.dex */
    public static class C0011a {

        /* renamed from: a */
        final ColorStateList f5a;

        /* renamed from: b */
        final Configuration f6b;

        C0011a(ColorStateList colorStateList, Configuration configuration) {
            this.f5a = colorStateList;
            this.f6b = configuration;
        }
    }

    /* renamed from: a */
    private static void m9580a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f4c) {
            SparseArray<C0011a> sparseArray = f3b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f3b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0011a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m9579b(Context context, int i) {
        C0011a c0011a;
        synchronized (f4c) {
            SparseArray<C0011a> sparseArray = f3b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0011a = sparseArray.get(i)) != null) {
                if (c0011a.f6b.equals(context.getResources().getConfiguration())) {
                    return c0011a.f5a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m9578c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m9579b = m9579b(context, i);
        if (m9579b != null) {
            return m9579b;
        }
        ColorStateList m9575f = m9575f(context, i);
        if (m9575f != null) {
            m9580a(context, i, m9575f);
            return m9575f;
        }
        return C0734a.m6875c(context, i);
    }

    /* renamed from: d */
    public static Drawable m9577d(Context context, int i) {
        return C0623m0.m7350h().m7348j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m9576e() {
        TypedValue typedValue = f2a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f2a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: f */
    private static ColorStateList m9575f(Context context, int i) {
        if (m9574g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0742a.m6850a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m9574g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue m9576e = m9576e();
        resources.getValue(i, m9576e, true);
        int i2 = m9576e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
