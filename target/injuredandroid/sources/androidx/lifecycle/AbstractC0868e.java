package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public abstract class AbstractC0868e {

    /* renamed from: androidx.lifecycle.e$a */
    /* loaded from: classes.dex */
    public enum EnumC0869a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.e$b */
    /* loaded from: classes.dex */
    public enum EnumC0870b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: d */
        public boolean m6128d(EnumC0870b enumC0870b) {
            return compareTo(enumC0870b) >= 0;
        }
    }

    public AbstractC0868e() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo6124a(InterfaceC0874i interfaceC0874i);

    /* renamed from: b */
    public abstract EnumC0870b mo6123b();

    /* renamed from: c */
    public abstract void mo6122c(InterfaceC0874i interfaceC0874i);
}
