package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.firebase.components.f */
/* loaded from: classes.dex */
public final class C2281f<T> {

    /* renamed from: a */
    private final T f6077a;

    /* renamed from: b */
    private final InterfaceC2284c<T> f6078b;

    /* renamed from: com.google.firebase.components.f$b */
    /* loaded from: classes.dex */
    private static class C2283b implements InterfaceC2284c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f6079a;

        private C2283b(Class<? extends Service> cls) {
            this.f6079a = cls;
        }

        /* renamed from: b */
        private Bundle m2121b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f6079a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f6079a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.C2281f.InterfaceC2284c
        /* renamed from: c */
        public List<String> mo2119a(Context context) {
            Bundle m2121b = m2121b(context);
            if (m2121b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m2121b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m2121b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.f$c */
    /* loaded from: classes.dex */
    interface InterfaceC2284c<T> {
        /* renamed from: a */
        List<String> mo2119a(T t);
    }

    C2281f(T t, InterfaceC2284c<T> interfaceC2284c) {
        this.f6077a = t;
        this.f6078b = interfaceC2284c;
    }

    /* renamed from: b */
    public static C2281f<Context> m2123b(Context context, Class<? extends Service> cls) {
        return new C2281f<>(context, new C2283b(cls));
    }

    /* renamed from: c */
    private static List<InterfaceC2286h> m2122c(List<String> list) {
        String format;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (InterfaceC2286h.class.isAssignableFrom(cls)) {
                    arrayList.add((InterfaceC2286h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                }
            } catch (ClassNotFoundException e) {
                e = e;
                format = String.format("Class %s is not an found.", str);
                Log.w("ComponentDiscovery", format, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                format = String.format("Could not instantiate %s.", str);
                Log.w("ComponentDiscovery", format, e);
            } catch (InstantiationException e3) {
                e = e3;
                format = String.format("Could not instantiate %s.", str);
                Log.w("ComponentDiscovery", format, e);
            } catch (NoSuchMethodException e4) {
                e = e4;
                format = String.format("Could not instantiate %s", str);
                Log.w("ComponentDiscovery", format, e);
            } catch (InvocationTargetException e5) {
                e = e5;
                format = String.format("Could not instantiate %s", str);
                Log.w("ComponentDiscovery", format, e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<InterfaceC2286h> m2124a() {
        return m2122c(this.f6078b.mo2119a(this.f6077a));
    }
}
