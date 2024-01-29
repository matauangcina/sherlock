package p135d.p142s.p144d;

import p135d.p146u.InterfaceC2743b;
import p135d.p146u.InterfaceC2744c;
import p135d.p146u.InterfaceC2745d;
/* renamed from: d.s.d.m */
/* loaded from: classes.dex */
public class C2731m {

    /* renamed from: a */
    private static final C2732n f6854a;

    static {
        C2732n c2732n = null;
        try {
            c2732n = (C2732n) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2732n == null) {
            c2732n = new C2732n();
        }
        f6854a = c2732n;
    }

    /* renamed from: a */
    public static InterfaceC2743b m867a(Class cls) {
        return f6854a.m863a(cls);
    }

    /* renamed from: b */
    public static InterfaceC2744c m866b(Class cls) {
        return f6854a.m862b(cls, "");
    }

    /* renamed from: c */
    public static InterfaceC2745d m865c(AbstractC2728j abstractC2728j) {
        f6854a.m861c(abstractC2728j);
        return abstractC2728j;
    }

    /* renamed from: d */
    public static String m864d(AbstractC2726h abstractC2726h) {
        return f6854a.m859e(abstractC2726h);
    }
}
