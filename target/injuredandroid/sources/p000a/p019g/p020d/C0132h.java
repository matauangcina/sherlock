package p000a.p019g.p020d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: a.g.d.h */
/* loaded from: classes.dex */
public class C0132h extends C0131g {
    @Override // p000a.p019g.p020d.C0131g
    /* renamed from: l */
    protected Typeface mo8998l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f543g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f549m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p019g.p020d.C0131g
    /* renamed from: x */
    protected Method mo8997x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
