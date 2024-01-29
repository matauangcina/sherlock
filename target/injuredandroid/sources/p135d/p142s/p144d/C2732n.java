package p135d.p142s.p144d;

import p135d.p146u.InterfaceC2743b;
import p135d.p146u.InterfaceC2744c;
import p135d.p146u.InterfaceC2745d;
/* renamed from: d.s.d.n */
/* loaded from: classes.dex */
public class C2732n {
    /* renamed from: a */
    public InterfaceC2743b m863a(Class cls) {
        return new C2721c(cls);
    }

    /* renamed from: b */
    public InterfaceC2744c m862b(Class cls, String str) {
        return new C2727i(cls, str);
    }

    /* renamed from: c */
    public InterfaceC2745d m861c(AbstractC2728j abstractC2728j) {
        return abstractC2728j;
    }

    /* renamed from: d */
    public String m860d(InterfaceC2724f interfaceC2724f) {
        String obj = interfaceC2724f.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: e */
    public String m859e(AbstractC2726h abstractC2726h) {
        return m860d(abstractC2726h);
    }
}
