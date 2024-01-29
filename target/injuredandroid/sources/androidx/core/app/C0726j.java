package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0717h;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.j */
/* loaded from: classes.dex */
public class C0726j {

    /* renamed from: a */
    private static final Object f2631a = new Object();

    /* renamed from: b */
    private static Field f2632b;

    /* renamed from: c */
    private static boolean f2633c;

    /* renamed from: a */
    public static SparseArray<Bundle> m6919a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Bundle m6918b(C0717h.C0718a c0718a) {
        Bundle bundle = new Bundle();
        IconCompat m6967e = c0718a.m6967e();
        bundle.putInt("icon", m6967e != null ? m6967e.m6775c() : 0);
        bundle.putCharSequence("title", c0718a.m6963i());
        bundle.putParcelable("actionIntent", c0718a.m6971a());
        Bundle bundle2 = c0718a.m6968d() != null ? new Bundle(c0718a.m6968d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", c0718a.m6970b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m6915e(c0718a.m6966f()));
        bundle.putBoolean("showsUserInterface", c0718a.m6964h());
        bundle.putInt("semanticAction", c0718a.m6965g());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m6917c(Notification notification) {
        String str;
        String str2;
        synchronized (f2631a) {
            if (f2633c) {
                return null;
            }
            try {
                if (f2632b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2633c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2632b = declaredField;
                }
                Bundle bundle = (Bundle) f2632b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2632b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f2633c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f2633c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m6916d(C0728l c0728l) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c0728l.m6897i());
        bundle.putCharSequence("label", c0728l.m6898h());
        bundle.putCharSequenceArray("choices", c0728l.m6901e());
        bundle.putBoolean("allowFreeFormInput", c0728l.m6903c());
        bundle.putBundle("extras", c0728l.m6899g());
        Set<String> m6902d = c0728l.m6902d();
        if (m6902d != null && !m6902d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m6902d.size());
            for (String str : m6902d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: e */
    private static Bundle[] m6915e(C0728l[] c0728lArr) {
        if (c0728lArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0728lArr.length];
        for (int i = 0; i < c0728lArr.length; i++) {
            bundleArr[i] = m6916d(c0728lArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m6914f(Notification.Builder builder, C0717h.C0718a c0718a) {
        IconCompat m6967e = c0718a.m6967e();
        builder.addAction(m6967e != null ? m6967e.m6775c() : 0, c0718a.m6963i(), c0718a.m6971a());
        Bundle bundle = new Bundle(c0718a.m6968d());
        if (c0718a.m6966f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m6915e(c0718a.m6966f()));
        }
        if (c0718a.m6969c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m6915e(c0718a.m6969c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c0718a.m6970b());
        return bundle;
    }
}
