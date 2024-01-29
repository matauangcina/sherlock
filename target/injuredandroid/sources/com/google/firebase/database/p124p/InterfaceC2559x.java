package com.google.firebase.database.p124p;

import java.lang.Thread;
/* renamed from: com.google.firebase.database.p.x */
/* loaded from: classes.dex */
public interface InterfaceC2559x {

    /* renamed from: a */
    public static final InterfaceC2559x f6680a = new C2560a();

    /* renamed from: com.google.firebase.database.p.x$a */
    /* loaded from: classes.dex */
    class C2560a implements InterfaceC2559x {
        C2560a() {
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2559x
        /* renamed from: a */
        public void mo1202a(Thread thread, String str) {
            thread.setName(str);
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2559x
        /* renamed from: b */
        public void mo1201b(Thread thread, boolean z) {
            thread.setDaemon(z);
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2559x
        /* renamed from: c */
        public void mo1200c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* renamed from: a */
    void mo1202a(Thread thread, String str);

    /* renamed from: b */
    void mo1201b(Thread thread, boolean z);

    /* renamed from: c */
    void mo1200c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
