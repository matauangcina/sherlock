package io.flutter.embedding.engine.p149e;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.engine.e.b */
/* loaded from: classes.dex */
public class C2837b implements InterfaceC1507b, InterfaceC2839c {

    /* renamed from: a */
    private final FlutterJNI f7057a;

    /* renamed from: d */
    private int f7060d = 1;

    /* renamed from: b */
    private final Map<String, InterfaceC1507b.InterfaceC1508a> f7058b = new HashMap();

    /* renamed from: c */
    private final Map<Integer, InterfaceC1507b.InterfaceC1509b> f7059c = new HashMap();

    /* renamed from: io.flutter.embedding.engine.e.b$a */
    /* loaded from: classes.dex */
    static class C2838a implements InterfaceC1507b.InterfaceC1509b {

        /* renamed from: a */
        private final FlutterJNI f7061a;

        /* renamed from: b */
        private final int f7062b;

        /* renamed from: c */
        private final AtomicBoolean f7063c = new AtomicBoolean(false);

        C2838a(FlutterJNI flutterJNI, int i) {
            this.f7061a = flutterJNI;
            this.f7062b = i;
        }

        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b.InterfaceC1509b
        /* renamed from: a */
        public void mo546a(ByteBuffer byteBuffer) {
            if (this.f7063c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f7061a.invokePlatformMessageEmptyResponseCallback(this.f7062b);
            } else {
                this.f7061a.invokePlatformMessageResponseCallback(this.f7062b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2837b(FlutterJNI flutterJNI) {
        this.f7057a = flutterJNI;
    }

    /* renamed from: e */
    private static void m547e(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1507b
    /* renamed from: a */
    public void mo549a(String str, ByteBuffer byteBuffer, InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
        int i;
        C1499b.m4050d("DartMessenger", "Sending message with callback over channel '" + str + "'");
        if (interfaceC1509b != null) {
            i = this.f7060d;
            this.f7060d = i + 1;
            this.f7059c.put(Integer.valueOf(i), interfaceC1509b);
        } else {
            i = 0;
        }
        if (byteBuffer == null) {
            this.f7057a.dispatchEmptyPlatformMessage(str, i);
        } else {
            this.f7057a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
        }
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1507b
    /* renamed from: b */
    public void mo548b(String str, InterfaceC1507b.InterfaceC1508a interfaceC1508a) {
        if (interfaceC1508a == null) {
            C1499b.m4050d("DartMessenger", "Removing handler for channel '" + str + "'");
            this.f7058b.remove(str);
            return;
        }
        C1499b.m4050d("DartMessenger", "Setting handler for channel '" + str + "'");
        this.f7058b.put(str, interfaceC1508a);
    }

    @Override // io.flutter.embedding.engine.p149e.InterfaceC2839c
    /* renamed from: c */
    public void mo545c(int i, byte[] bArr) {
        C1499b.m4050d("DartMessenger", "Received message reply from Dart.");
        InterfaceC1507b.InterfaceC1509b remove = this.f7059c.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                C1499b.m4050d("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.mo546a(bArr == null ? null : ByteBuffer.wrap(bArr));
            } catch (Error e) {
                m547e(e);
            } catch (Exception e2) {
                C1499b.m4051c("DartMessenger", "Uncaught exception in binary message reply handler", e2);
            }
        }
    }

    @Override // io.flutter.embedding.engine.p149e.InterfaceC2839c
    /* renamed from: d */
    public void mo544d(String str, byte[] bArr, int i) {
        C1499b.m4050d("DartMessenger", "Received message from Dart over channel '" + str + "'");
        InterfaceC1507b.InterfaceC1508a interfaceC1508a = this.f7058b.get(str);
        if (interfaceC1508a != null) {
            try {
                C1499b.m4050d("DartMessenger", "Deferring to registered handler to process message.");
                interfaceC1508a.mo551a(bArr == null ? null : ByteBuffer.wrap(bArr), new C2838a(this.f7057a, i));
                return;
            } catch (Error e) {
                m547e(e);
                return;
            } catch (Exception e2) {
                C1499b.m4051c("DartMessenger", "Uncaught exception in binary message listener", e2);
            }
        } else {
            C1499b.m4050d("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f7057a.invokePlatformMessageEmptyResponseCallback(i);
    }
}
