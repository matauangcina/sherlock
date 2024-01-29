package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p135d.p137p.InterfaceC2676d;
/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes.dex */
public interface InterfaceC2993a extends InterfaceC2676d.InterfaceC2679b {

    /* renamed from: e */
    public static final C2995b f7567e = C2995b.f7568a;

    /* renamed from: kotlinx.coroutines.a$a */
    /* loaded from: classes.dex */
    public static final class C2994a {
        /* renamed from: a */
        public static /* synthetic */ void m4a(InterfaceC2993a interfaceC2993a, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC2993a.m5a(cancellationException);
        }
    }

    /* renamed from: kotlinx.coroutines.a$b */
    /* loaded from: classes.dex */
    public static final class C2995b implements InterfaceC2676d.InterfaceC2681c<InterfaceC2993a> {

        /* renamed from: a */
        static final /* synthetic */ C2995b f7568a = new C2995b();

        static {
            CoroutineExceptionHandler.C2992a c2992a = CoroutineExceptionHandler.f7565d;
        }

        private C2995b() {
        }
    }

    /* renamed from: a */
    void m5a(CancellationException cancellationException);
}
