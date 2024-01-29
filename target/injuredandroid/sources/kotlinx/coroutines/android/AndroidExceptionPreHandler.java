package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p135d.C2636g;
import p135d.InterfaceC2634e;
import p135d.p137p.AbstractC2671a;
import p135d.p137p.InterfaceC2676d;
import p135d.p142s.p143c.InterfaceC2695a;
import p135d.p142s.p144d.C2725g;
import p135d.p142s.p144d.C2729k;
import p135d.p142s.p144d.C2731m;
import p135d.p146u.InterfaceC2747e;
@Keep
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends AbstractC2671a implements CoroutineExceptionHandler, InterfaceC2695a<Method> {
    static final /* synthetic */ InterfaceC2747e[] $$delegatedProperties;
    private final InterfaceC2634e preHandler$delegate;

    static {
        C2729k c2729k = new C2729k(C2731m.m867a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        C2731m.m865c(c2729k);
        $$delegatedProperties = new InterfaceC2747e[]{c2729k};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f7565d);
        InterfaceC2634e m977a;
        m977a = C2636g.m977a(this);
        this.preHandler$delegate = m977a;
    }

    private final Method getPreHandler() {
        InterfaceC2634e interfaceC2634e = this.preHandler$delegate;
        InterfaceC2747e interfaceC2747e = $$delegatedProperties[0];
        return (Method) interfaceC2634e.getValue();
    }

    public void handleException(InterfaceC2676d interfaceC2676d, Throwable th) {
        C2725g.m880f(interfaceC2676d, "context");
        C2725g.m880f(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            C2725g.m884b(currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    @Override // p135d.p142s.p143c.InterfaceC2695a
    public Method invoke() {
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C2725g.m884b(declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
