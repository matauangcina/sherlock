package androidx.navigation;

import androidx.navigation.AbstractC0952r;
import java.util.HashMap;
import java.util.Map;
/* renamed from: androidx.navigation.s */
/* loaded from: classes.dex */
public class C0955s {

    /* renamed from: b */
    private static final HashMap<Class<?>, String> f3290b = new HashMap<>();

    /* renamed from: a */
    private final HashMap<String, AbstractC0952r<? extends C0925j>> f3291a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m5848c(Class<? extends AbstractC0952r> cls) {
        String str = f3290b.get(cls);
        if (str == null) {
            AbstractC0952r.InterfaceC0954b interfaceC0954b = (AbstractC0952r.InterfaceC0954b) cls.getAnnotation(AbstractC0952r.InterfaceC0954b.class);
            str = interfaceC0954b != null ? interfaceC0954b.value() : null;
            if (!m5844g(str)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            f3290b.put(cls, str);
        }
        return str;
    }

    /* renamed from: g */
    private static boolean m5844g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public final AbstractC0952r<? extends C0925j> m5850a(AbstractC0952r<? extends C0925j> abstractC0952r) {
        return m5849b(m5848c(abstractC0952r.getClass()), abstractC0952r);
    }

    /* renamed from: b */
    public AbstractC0952r<? extends C0925j> m5849b(String str, AbstractC0952r<? extends C0925j> abstractC0952r) {
        if (m5844g(str)) {
            return this.f3291a.put(str, abstractC0952r);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: d */
    public final <T extends AbstractC0952r<?>> T m5847d(Class<T> cls) {
        return (T) m5846e(m5848c(cls));
    }

    /* renamed from: e */
    public <T extends AbstractC0952r<?>> T m5846e(String str) {
        if (m5844g(str)) {
            AbstractC0952r<? extends C0925j> abstractC0952r = this.f3291a.get(str);
            if (abstractC0952r != null) {
                return abstractC0952r;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, AbstractC0952r<? extends C0925j>> m5845f() {
        return this.f3291a;
    }
}
