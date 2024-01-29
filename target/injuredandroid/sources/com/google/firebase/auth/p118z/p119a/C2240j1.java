package com.google.firebase.auth.p118z.p119a;
/* renamed from: com.google.firebase.auth.z.a.j1 */
/* loaded from: classes.dex */
public final class C2240j1 {
    /* renamed from: a */
    public static String m2235a(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (invoke != null && String.class.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
