package com.google.firebase.database.p120m;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.database.p124p.InterfaceC2505k;
/* renamed from: com.google.firebase.database.m.g */
/* loaded from: classes.dex */
public class C2331g implements InterfaceC2505k {

    /* renamed from: a */
    private final Handler f6144a = new Handler(Looper.getMainLooper());

    @Override // com.google.firebase.database.p124p.InterfaceC2505k
    /* renamed from: a */
    public void mo1398a() {
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2505k
    /* renamed from: b */
    public void mo1397b(Runnable runnable) {
        this.f6144a.post(runnable);
    }
}
