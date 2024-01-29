package io.flutter.view;

import android.view.Choreographer;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
/* renamed from: io.flutter.view.f */
/* loaded from: classes.dex */
public class C2989f {

    /* renamed from: c */
    private static C2989f f7559c;

    /* renamed from: a */
    private final WindowManager f7560a;

    /* renamed from: b */
    private final FlutterJNI.InterfaceC2819b f7561b = new C2990a();

    /* renamed from: io.flutter.view.f$a */
    /* loaded from: classes.dex */
    class C2990a implements FlutterJNI.InterfaceC2819b {

        /* renamed from: io.flutter.view.f$a$a */
        /* loaded from: classes.dex */
        class Choreographer$FrameCallbackC2991a implements Choreographer.FrameCallback {

            /* renamed from: a */
            final /* synthetic */ long f7563a;

            Choreographer$FrameCallbackC2991a(long j) {
                this.f7563a = j;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                FlutterJNI.nativeOnVsync(j, j + ((long) (1.0E9d / C2989f.this.f7560a.getDefaultDisplay().getRefreshRate())), this.f7563a);
            }
        }

        C2990a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.InterfaceC2819b
        /* renamed from: a */
        public void mo6a(long j) {
            Choreographer.getInstance().postFrameCallback(new Choreographer$FrameCallbackC2991a(j));
        }
    }

    private C2989f(WindowManager windowManager) {
        this.f7560a = windowManager;
    }

    /* renamed from: b */
    public static C2989f m8b(WindowManager windowManager) {
        if (f7559c == null) {
            f7559c = new C2989f(windowManager);
        }
        return f7559c;
    }

    /* renamed from: c */
    public void m7c() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.f7561b);
        FlutterJNI.setRefreshRateFPS(this.f7560a.getDefaultDisplay().getRefreshRate());
    }
}
