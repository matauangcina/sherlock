package p135d.p142s.p144d;

import java.util.Arrays;
import p135d.C2642m;
/* renamed from: d.s.d.g */
/* loaded from: classes.dex */
public class C2725g {
    private C2725g() {
    }

    /* renamed from: a */
    public static boolean m885a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m884b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
        m878h(illegalStateException);
        throw illegalStateException;
    }

    /* renamed from: c */
    public static void m883c(Object obj) {
        if (obj != null) {
            return;
        }
        m876j();
        throw null;
    }

    /* renamed from: d */
    public static void m882d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
        m878h(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m881e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        m874l(str);
        throw null;
    }

    /* renamed from: f */
    public static void m880f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        m875k(str);
        throw null;
    }

    /* renamed from: g */
    private static String m879g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m878h(T t) {
        m877i(t, C2725g.class.getName());
        return t;
    }

    /* renamed from: i */
    static <T extends Throwable> T m877i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: j */
    public static void m876j() {
        NullPointerException nullPointerException = new NullPointerException();
        m878h(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: k */
    private static void m875k(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m879g(str));
        m878h(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: l */
    private static void m874l(String str) {
        NullPointerException nullPointerException = new NullPointerException(m879g(str));
        m878h(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: m */
    public static void m873m(String str) {
        C2642m c2642m = new C2642m(str);
        m878h(c2642m);
        throw c2642m;
    }

    /* renamed from: n */
    public static void m872n(String str) {
        m873m("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
