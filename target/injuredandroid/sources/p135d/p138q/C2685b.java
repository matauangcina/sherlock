package p135d.p138q;

import p135d.p142s.p144d.C2725g;
import p135d.p148w.C2776p;
/* renamed from: d.q.b */
/* loaded from: classes.dex */
public final class C2685b {

    /* renamed from: a */
    public static final C2683a f6834a;

    static {
        C2683a c2683a;
        Object newInstance;
        Object newInstance2;
        int m904a = m904a();
        if (m904a >= 65544) {
            try {
                newInstance = Class.forName("d.q.e.a").newInstance();
                C2725g.m882d(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                } catch (ClassCastException e) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C2683a.class.getClassLoader();
                    Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                    C2725g.m882d(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause;
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                C2725g.m882d(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    c2683a = (C2683a) newInstance3;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = C2683a.class.getClassLoader();
                    Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                    C2725g.m882d(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause2;
                }
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            c2683a = (C2683a) newInstance;
            f6834a = c2683a;
        }
        if (m904a >= 65543) {
            try {
                try {
                    newInstance2 = Class.forName("d.q.d.a").newInstance();
                    C2725g.m882d(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                } catch (ClassNotFoundException unused2) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C2725g.m882d(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        c2683a = (C2683a) newInstance4;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C2683a.class.getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                        C2725g.m882d(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause3;
                    }
                }
            } catch (ClassNotFoundException unused3) {
            }
            try {
                if (newInstance2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                c2683a = (C2683a) newInstance2;
                f6834a = c2683a;
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader8 = C2683a.class.getClassLoader();
                Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                C2725g.m882d(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause4;
            }
        }
        c2683a = new C2683a();
        f6834a = c2683a;
    }

    /* renamed from: a */
    private static final int m904a() {
        int m789p;
        int m789p2;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            m789p = C2776p.m789p(property, '.', 0, false, 6, null);
            if (m789p < 0) {
                try {
                    return Integer.parseInt(property) * 65536;
                } catch (NumberFormatException unused) {
                    return 65542;
                }
            }
            int i = m789p + 1;
            m789p2 = C2776p.m789p(property, '.', i, false, 4, null);
            if (m789p2 < 0) {
                m789p2 = property.length();
            }
            if (property != null) {
                String substring = property.substring(0, m789p);
                C2725g.m882d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (property != null) {
                    String substring2 = property.substring(i, m789p2);
                    C2725g.m882d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    try {
                        return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                    } catch (NumberFormatException unused2) {
                        return 65542;
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return 65542;
    }
}
