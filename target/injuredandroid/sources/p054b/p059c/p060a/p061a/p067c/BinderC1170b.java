package p054b.p059c.p060a.p061a.p067c;

import android.os.IBinder;
import java.lang.reflect.Field;
import p054b.p059c.p060a.p061a.p067c.InterfaceC1168a;
/* renamed from: b.c.a.a.c.b */
/* loaded from: classes.dex */
public final class BinderC1170b<T> extends InterfaceC1168a.AbstractBinderC1169a {

    /* renamed from: a */
    private final T f3887a;

    private BinderC1170b(T t) {
        this.f3887a = t;
    }

    /* renamed from: g */
    public static <T> T m4748g(InterfaceC1168a interfaceC1168a) {
        if (interfaceC1168a instanceof BinderC1170b) {
            return ((BinderC1170b) interfaceC1168a).f3887a;
        }
        IBinder asBinder = interfaceC1168a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            }
        }
    }

    /* renamed from: h */
    public static <T> InterfaceC1168a m4747h(T t) {
        return new BinderC1170b(t);
    }
}
